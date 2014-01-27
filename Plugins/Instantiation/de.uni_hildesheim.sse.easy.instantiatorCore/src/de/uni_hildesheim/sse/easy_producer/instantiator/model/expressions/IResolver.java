package de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions;

/**
 * Defines the interface of a simple variable resolver. 
 * 
 * @param <V> the type of variable declarations
 * 
 * @author Holger Eichelberger
 */
public interface IResolver<V extends IResolvable> {

    /**
     * Resolves a variable.
     * 
     * @param name the name of the variable
     * @param local consider only the local scope or also outside nested scopes
     * @return the variable declaration or <b>null</b>
     */
    public V resolve(String name, boolean local);
    
    /**
     * Resolves an IVML element.
     * 
     * @param name the name to be resolved
     * @return <code>true</code> whether <code>name</code> can be resolved, <code>false</code>
     */
    public boolean isIvmlElement(String name);
    
}
