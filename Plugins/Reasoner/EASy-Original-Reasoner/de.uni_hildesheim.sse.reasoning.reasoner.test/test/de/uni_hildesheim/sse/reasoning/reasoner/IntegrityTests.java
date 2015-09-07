package de.uni_hildesheim.sse.reasoning.reasoner;


import org.junit.Assert;
import org.junit.Test;

import de.uni_hildesheim.sse.dslCore.test.AbstractTest;
import de.uni_hildesheim.sse.model.confModel.AssignmentState;
import de.uni_hildesheim.sse.model.confModel.Configuration;
import de.uni_hildesheim.sse.model.confModel.IDecisionVariable;
import de.uni_hildesheim.sse.model.cst.CSTSemanticException;
import de.uni_hildesheim.sse.model.cst.ConstantValue;
import de.uni_hildesheim.sse.model.cst.OCLFeatureCall;
import de.uni_hildesheim.sse.model.cst.Variable;
import de.uni_hildesheim.sse.model.varModel.Constraint;
import de.uni_hildesheim.sse.model.varModel.DecisionVariableDeclaration;
import de.uni_hildesheim.sse.model.varModel.Project;
import de.uni_hildesheim.sse.model.varModel.datatypes.IntegerType;
import de.uni_hildesheim.sse.model.varModel.datatypes.OclKeyWords;
import de.uni_hildesheim.sse.model.varModel.values.Value;
import de.uni_hildesheim.sse.model.varModel.values.ValueDoesNotMatchTypeException;
import de.uni_hildesheim.sse.model.varModel.values.ValueFactory;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory.EASyLogger;

/**
 * Configures the operation tests for Drools.
 * 
 * @author Sizonenko
 * @author El-Sharkawy
 */
public class IntegrityTests extends AbstractTest<Project> {

    private static final EASyLogger LOGGER =
            EASyLoggerFactory.INSTANCE.getLogger(IntegrityTests.class, Descriptor.BUNDLE_NAME);
    
    private Configuration config;
    
    /**
     * Tests whether implies constraints will be handled correctly by the {@link AssignmentResolver}.
     * @throws ValueDoesNotMatchTypeException Must not occur otherwise there is a failure inside the
     * {@link ValueFactory}.
     * @throws CSTSemanticException  Must not occur otherwise there is a failure inside the constraint syntax trees.
     */
    @Test
    public void testImplies() throws ValueDoesNotMatchTypeException, CSTSemanticException {
        // Create project and variables
        Project project = new Project("assignmentTestProject");
        DecisionVariableDeclaration declA = new DecisionVariableDeclaration("intA", IntegerType.TYPE, project);
        project.add(declA);
        DecisionVariableDeclaration declB = new DecisionVariableDeclaration("intB", IntegerType.TYPE, project);
        project.add(declB);
        DecisionVariableDeclaration declC = new DecisionVariableDeclaration("intC", IntegerType.TYPE, project);
        declC.setValue(33);
        project.add(declC);
        
        // Create assignment
        Value valA = ValueFactory.createValue(declA.getType(), 31);
        Variable varA = new Variable(declA);
        ConstantValue constValA = new ConstantValue(valA);
        OCLFeatureCall assignmentA = new OCLFeatureCall(varA, OclKeyWords.ASSIGNMENT, constValA);
        Constraint assignmentConstraint = new Constraint(project);
        assignmentConstraint.setConsSyntax(assignmentA);
        project.add(assignmentConstraint);       
   
        
        // Create implies constraint
        Value valB = ValueFactory.createValue(declB.getType(), 37);
        ConstantValue constValB = new ConstantValue(valB);
        Value valC = ValueFactory.createValue(declC.getType(), 40);
        ConstantValue constValC = new ConstantValue(valC);
        OCLFeatureCall equalsA = new OCLFeatureCall(varA, OclKeyWords.EQUALS, constValA);
        OCLFeatureCall equalsB = new OCLFeatureCall(new Variable(declB), OclKeyWords.EQUALS, constValB);
        OCLFeatureCall equalsC = new OCLFeatureCall(new Variable(declC), OclKeyWords.EQUALS, constValC);
        OCLFeatureCall implies = new OCLFeatureCall(equalsA, OclKeyWords.IMPLIES, equalsB);
        OCLFeatureCall impliesFail = new OCLFeatureCall(equalsA, OclKeyWords.IMPLIES, equalsC);
        Constraint impliesConstaint = new Constraint(project);
        impliesConstaint.setConsSyntax(implies);
        project.add(impliesConstaint);
        Constraint impliesConstaintFail = new Constraint(project);
        impliesConstaintFail.setConsSyntax(impliesFail);
        project.add(impliesConstaintFail);
        
        
        // Create Configuration (will also start AssignmentResolver)
        Configuration config = new Configuration(project, true);
        IDecisionVariable iVarA = config.getDecision(declA);
        IDecisionVariable iVarB = config.getDecision(declB);
        IDecisionVariable iVarC = config.getDecision(declC);
        
        // Test correct assignments
        Assert.assertNotNull(iVarA);
        Assert.assertEquals(31, iVarA.getValue().getValue());
        Assert.assertSame(AssignmentState.ASSIGNED, iVarA.getState());

        Assert.assertNotNull(iVarB);
        Assert.assertEquals(37, iVarB.getValue().getValue());
        Assert.assertSame(AssignmentState.ASSIGNED, iVarB.getState());
        
        Assert.assertNotNull(iVarC);
        Assert.assertEquals(33, iVarC.getValue().getValue());
        Assert.assertSame(AssignmentState.DEFAULT, iVarC.getState());
    }    
    
}
