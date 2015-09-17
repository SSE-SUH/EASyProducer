package de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.common.VariableDeclaration;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.common.VilException;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.FieldDescriptor;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.OperationDescriptor;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.TypeDescriptor;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.TypeRegistry;

/**
 * Represents a value assignment.
 * 
 * @author Holger Eichelberger
 */
public class ValueAssignmentExpression extends Expression {

    private VariableDeclaration varDecl;
    private FieldDescriptor field;
    private Expression valueExpression;
    
    /**
     * Creates a new value assignment expression which assigns <code>valueExpression</code> to 
     * <code>varDecl</code>.
     * 
     * @param varDecl the variable declaration
     * @param valueExpression the value expression
     */
    public ValueAssignmentExpression(VariableDeclaration varDecl, Expression valueExpression) {
        this(varDecl, null, valueExpression);
    }

    /**
     * Creates a new value assignment expression which assigns <code>valueExpression</code> to 
     * <code>field</code> in <code>varDecl</code>.
     * 
     * @param varDecl the variable declaration
     * @param field the field declaration (optional, may be <b>null</b>)
     * @param valueExpression the value expression
     */
    public ValueAssignmentExpression(VariableDeclaration varDecl, FieldDescriptor field, Expression valueExpression) {
        this.varDecl = varDecl;
        this.field = field;
        this.valueExpression = valueExpression;
    }

    /**
     * Returns the variable declaration.
     * 
     * @return the variable declaration
     */
    public VariableDeclaration getVarDecl() {
        return varDecl;
    }

    /**
     * The field to assign to.
     * 
     * @return the field (may be <b>null</b>)
     */
    public FieldDescriptor getField() {
        return field;
    }
    
    /**
     * Returns the value expression.
     * 
     * @return the value expression
     */
    public Expression getValueExpression() {
        return valueExpression;
    }
    
    @Override
    public TypeDescriptor<?> inferType() throws VilException {
        TypeDescriptor<?> varType = this.varDecl.getType();
        TypeDescriptor<?> valType = this.valueExpression.inferType();
        boolean assignable = varType.isSet() && valType.isSequence(); // as done in ExpressionTranslator ;(
        assignable |= varType.isAssignableFrom(valType);
        if (!assignable) {
            OperationDescriptor operation = valType.findConversion(valType, varType);
            if (null == operation) {
                operation = varType.findConversion(valType, varType);
            }
            if (null != operation) {
                this.valueExpression = new CallExpression(operation, new CallArgument(valueExpression));
            } else {
                throw new VilException("cannot assign/convert " + valType.getVilName() 
                    + " to " + varType.getVilName(), VilException.ID_SEMANTIC);
            }
        }
        return TypeRegistry.voidType();
    }

    @Override
    public Object accept(IExpressionVisitor visitor) throws VilException {
        return visitor.visitValueAssignmentExpression(this);
    }

}
