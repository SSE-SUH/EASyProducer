package de.uni_hildesheim.sse.easy_producer.instantiator.model.common;

/**
 * A visitor interface for the common types.
 * 
 * @author Holger Eichelberger
 */
public interface IVisitor {
    
    /**
     * Visits a variable declaration.
     * 
     * @param var the variable declaration
     * @return the result of visiting the given statement (may be <b>null</b>)
     * @throws VilLanguageException in case that visiting fails (e.g., execution)
     */
    public Object visitVariableDeclaration(VariableDeclaration var) throws VilLanguageException;

    /**
     * Visits an advice.
     * 
     * @param advice the advice to be visited
     * @return the result of visiting the given statement (may be <b>null</b>)
     * @throws VilLanguageException in case that visiting fails (e.g., execution)
     */
    public Object visitAdvice(Advice advice) throws VilLanguageException;

    /**
     * Visits a statement.
     * 
     * @param statement the statement
     * @return the result of visiting the given statement (may be <b>null</b>)
     * @throws VilLanguageException in case that visiting fails (e.g., execution)
     */
    public Object visitExpressionStatement(ExpressionStatement statement) throws VilLanguageException;

}
