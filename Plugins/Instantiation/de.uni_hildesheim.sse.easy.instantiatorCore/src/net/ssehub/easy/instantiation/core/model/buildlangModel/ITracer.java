package net.ssehub.easy.instantiation.core.model.buildlangModel;

import net.ssehub.easy.instantiation.core.model.common.RuntimeEnvironment;
import net.ssehub.easy.instantiation.core.model.vilTypes.Collection;

/**
 * A simple tracer interface providing test support to the execution part.
 * 
 * @author Holger Eichelberger
 */
public interface ITracer extends net.ssehub.easy.instantiation.core.model.common.ITracer {
    
    /**
     * Is called when a script (header) is being visited.
     * 
     * @param script the script
     * @param environment the runtime environment
     */
    public void visitScript(Script script, RuntimeEnvironment<?, ?> environment);

    /**
     * Is called when a script (body) is being visited.
     * 
     * @param script the script
     * @param environment the runtime environment
     */
    public void visitScriptBody(Script script, RuntimeEnvironment<?, ?> environment);
    
    /**
     * Is called when visiting a script ends.
     * 
     * @param script the script
     */
    public void visitedScript(Script script);
    
    /**
     * Is called when visiting a rule starts.
     * 
     * @param rule the rule being visited
     * @param environment the runtime environment
     */
    public void visitRule(Rule rule, RuntimeEnvironment<?, ?> environment);

    /**
     * Is called when visiting a rule ends.
     * 
     * @param rule the rule being visited
     * @param environment the runtime environment
     * @param result the result produced by the rule
     */
    public void visitedRule(Rule rule, RuntimeEnvironment<?, ?> environment, Object result);

    /**
     * Is called when visiting a map starts.
     * 
     * @param loop the loop being visited
     * @param environment the runtime environment
     */
    public void visitLoop(IEnumeratingLoop loop, RuntimeEnvironment<?, ?> environment);

    /**
     * Is called when a loop iterator variable is assigned.
     * 
     * @param loop the loop
     * @param var the iterator variable
     * @param value the actual value
     */
    public void visitIteratorAssignment(IEnumeratingLoop loop, VariableDeclaration var, Object value);
    
    /**
     * Is called when visiting a map ends.
     * 
     * @param loop the loop being visited
     * @param environment the runtime environment
     */
    public void visitedLoop(IEnumeratingLoop loop, RuntimeEnvironment<?, ?> environment);

    /**
     * Allows a tracer to change the sequence of processing a map collection.
     * This is intended for testing and debugging only as it normalizes and, thus, interfers
     * with the actual execution sequence.
     * 
     * @param collection the collection to be considered
     * @return the new sequence (just the elements may be reordered)
     */
    public Collection<?> adjustSequenceForMap(Collection<?> collection);

    /**
     * Allows a tracer to change the sequence of processing a map collection.
     * This is intended for testing and debugging only as it normalizes and, thus, interfers
     * with the actual execution sequence.
     * 
     * @param collection the collection to be considered
     * @return the new sequence (just the elements may be reordered)
     */
    public Collection<Object> adjustSequenceForJoin(Collection<Object> collection);

    /**
     * Is called before executing a system call.
     * 
     * @param args the arguments for the system call
     */
    public void visitSystemCall(String[] args);
   
    /**
     * Is called when an instantiator is being visited / executed.
     * 
     * @param name the name of the instantiator
     */
    public void visitingInstantiator(String name);
    
    /**
     * Is called when an instantiator was visited / executed.
     * 
     * @param name the name of the instantiator
     * @param result the result of the execution
     */
    public void visitedInstantiator(String name, Object result);

    /**
     * An alternative was visited.
     * 
     * @param takeIf if <code>true</code> the if-branch is used, <code>false</code> else the else-branch
     */
    public void visitAlternative(boolean takeIf);
    
    /**
     * Is called when the execution of a build language element failed.
     * 
     * @param element the failed element
     */
    public void failedAt(IBuildlangElement element);
    
    /**
     * Resets this tracer for reuse.
     */
    public void reset();

    /**
     * Is called when visiting a while body starts.
     */
    public void visitWhileBody();
    

    /**
     * Is called when visiting a while body ends.
     */
    public void visitedWhileBody();
    
}
