package de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.IVilType;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.TypeDescriptor;

/**
 * Represents a parenthesis expression.
 * 
 * @author Holger Eichelberger
 */
public class ParenthesisExpression extends Expression {

    private Expression expr;
    
    /**
     * Creates a new parenthesis expression.
     * 
     * @param expr the expression within the parenthesis
     */
    public ParenthesisExpression(Expression expr) {
        this.expr = expr;
    }
    
    /**
     * Returns the expression within the parenthesis.
     * 
     * @return the expression
     */
    public Expression getExpr() {
        return expr;
    }
    
    @Override
    public TypeDescriptor<? extends IVilType> inferType() throws ExpressionException {
        return expr.inferType();
    }

    @Override
    public Object accept(IExpressionVisitor visitor) throws ExpressionException {
        return visitor.visitParenthesisExpression(this);
    }

}
