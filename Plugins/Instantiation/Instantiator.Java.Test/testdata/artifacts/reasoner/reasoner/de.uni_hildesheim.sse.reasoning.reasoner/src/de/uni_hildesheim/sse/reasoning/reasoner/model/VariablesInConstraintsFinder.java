package de.uni_hildesheim.sse.reasoning.reasoner.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import de.uni_hildesheim.sse.model.cst.CSTSemanticException;
import de.uni_hildesheim.sse.model.cst.Comment;
import de.uni_hildesheim.sse.model.cst.CompoundAccess;
import de.uni_hildesheim.sse.model.cst.CompoundInitializer;
import de.uni_hildesheim.sse.model.cst.ConstantValue;
import de.uni_hildesheim.sse.model.cst.ConstraintSyntaxTree;
import de.uni_hildesheim.sse.model.cst.ContainerInitializer;
import de.uni_hildesheim.sse.model.cst.ContainerOperationCall;
import de.uni_hildesheim.sse.model.cst.IConstraintTreeVisitor;
import de.uni_hildesheim.sse.model.cst.IfThen;
import de.uni_hildesheim.sse.model.cst.Let;
import de.uni_hildesheim.sse.model.cst.OCLFeatureCall;
import de.uni_hildesheim.sse.model.cst.Parenthesis;
import de.uni_hildesheim.sse.model.cst.Self;
import de.uni_hildesheim.sse.model.cst.UnresolvedExpression;
import de.uni_hildesheim.sse.model.cst.Variable;
import de.uni_hildesheim.sse.model.varModel.AbstractVariable;
import de.uni_hildesheim.sse.model.varModel.datatypes.OclKeyWords;

/**
 * A visitor to retrieve variables from constraints.
 *
 */
public class VariablesInConstraintsFinder implements IConstraintTreeVisitor {

    private Set<AbstractVariable> variables;
    private AbstractVariable checkedVariable;
    private boolean containsVariable;
    private boolean isSimpleAssignment;
    
    
    /**
     * Constructor of the visitor. Uses collection of constraints.
     * @param constraints Constraints that is visited to retrieve variables.
     */
    public VariablesInConstraintsFinder(Collection<ConstraintSyntaxTree> constraints) {
        variables = new HashSet<AbstractVariable>();
        containsVariable = false;
        for (ConstraintSyntaxTree constraintSyntaxTree : constraints) {
            isSimpleAssignment = false;
            constraintSyntaxTree.accept(this);            
        }
    }
    
    /**
     * Constructor of the visitor. Uses a single constraint.
     * @param constraint Constraint that is visited to retrieve variables.
     */
    public VariablesInConstraintsFinder(ConstraintSyntaxTree constraint) {
        variables = new HashSet<AbstractVariable>(); 
        isSimpleAssignment = false;
        containsVariable = false;
        if (constraint != null) {
            constraint.accept(this);           
        }
    }
    
    /**
     * Constructor of the visitor. Uses a single constraint.
     * @param variable {@link AbstractVariable} to check.
     * @param constraint Constraint that is visited to retrieve variables.
     */
    public VariablesInConstraintsFinder(AbstractVariable variable, ConstraintSyntaxTree constraint) {
        variables = new HashSet<AbstractVariable>(); 
        isSimpleAssignment = false;
        containsVariable = false;
        checkedVariable = variable;
        if (constraint != null) {
            constraint.accept(this);           
        }        
    }
    
    /**
     * Method to get all variables that are used in constraints.
     * @return List of {@link AbstractVariable}s (maybe empty, but not <tt>null</tt>).
     */
    public Set<AbstractVariable> getVariables() {
        return variables;
    }
    
    /**
     * Method for analyzing if constraint contains specific variable.
     * @return true if does.
     */
    public boolean containsVariable() {
        return containsVariable;
    }
    
    /**
     * Method for analyzing if constraint is valid for reevaluation (is not a simple aasignment).
     * @return true if valid.
     */
    public boolean isSimpleAssignment() {
        return isSimpleAssignment;
    }

    @Override
    public void visitConstantValue(ConstantValue value) {
        // Not needed
    }

    @Override
    public void visitVariable(Variable variable) {
        AbstractVariable wrappedDeclaration = variable.getVariable();        
        variables.add(wrappedDeclaration);
        
        if (checkedVariable != null) {
            if (variable.getVariable().getName().equals(checkedVariable.getName())) {
                containsVariable = true;
            }            
        }
    }

    @Override
    public void visitParenthesis(Parenthesis parenthesis) {
        // Keep running/visiting
        parenthesis.getExpr().accept(this);        
    }

    @Override
    public void visitComment(Comment comment) {
        // Keep running/visiting
        comment.getExpr().accept(this);
    }

    @Override
    public void visitOclFeatureCall(OCLFeatureCall call) {
        if (null != call.getOperand()) {    
            // user def function returns operand null!
            if ((call.getOperand() instanceof Variable
                || call.getOperand() instanceof CompoundAccess)
                && call.getParameterCount() == 1
                && call.getOperation().equals(OclKeyWords.ASSIGNMENT)) {
                if (call.getParameter(0) instanceof ConstantValue
                    || call.getParameter(0) instanceof ContainerInitializer
                    || call.getParameter(0) instanceof CompoundInitializer) {
                    isSimpleAssignment = true; 
                }
            } 
            call.getOperand().accept(this);
            for (int i = 0; i < call.getParameterCount(); i++) {
                call.getParameter(i).accept(this);
            }
        }
    }

    @Override
    public void visitLet(Let let) {
        let.getInExpression().accept(this);
    }

    @Override
    public void visitIfThen(IfThen ifThen) {
        ifThen.getIfExpr().accept(this);
        ifThen.getThenExpr().accept(this);
        ifThen.getElseExpr().accept(this);
    }

    @Override
    public void visitContainerOperationCall(ContainerOperationCall call) {
        call.getContainer().accept(this);
        call.getExpression().accept(this);
    }

    @Override
    public void visitCompoundAccess(CompoundAccess access) {
        access.getCompoundExpression().accept(this);  
        try {
            access.inferDatatype();
            if (access.getResolvedSlot().equals(checkedVariable)) {
                containsVariable = true;
            }
        } catch (CSTSemanticException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Override
    public void visitUnresolvedExpression(UnresolvedExpression expression) {
        ConstraintSyntaxTree nestedConstraint = expression.getActualExpression();
        if (null != nestedConstraint) {
            nestedConstraint.accept(this);
        }
    }

    @Override
    public void visitCompoundInitializer(CompoundInitializer initializer) {
        for (int i = 0; i < initializer.getExpressionCount(); i++) {
            initializer.getExpression(i).accept(this);
        }
    }

    @Override
    public void visitContainerInitializer(ContainerInitializer initializer) {
        for (int i = 0; i < initializer.getExpressionCount(); i++) {
            initializer.getExpression(i).accept(this);
        }
    }

    @Override
    public void visitSelf(Self self) {
        // TODO Auto-generated method stub
        
    }

   
}
