package de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes;

/**
 * Defines the interface of a meta type. This interface is used for generic type conformance checks.
 * 
 * @author Holger Eichelberger
 */
public interface IMetaType {

    /**
     * Returns the (simple) name of this type.
     * 
     * @return the simple name
     */
    public String getName();
    
    /**
     * Returns the qualified name of this type.
     * 
     * @return the qualified name
     */
    public String getQualifiedName();
    
    /**
     * Returns the number of operations provided by this provider.
     * 
     * @return the number of operations
     */
    public int getOperationsCount();
    
    /**
     * Returns the specified operation.
     * 
     * @param index the index of the operation to be returned
     * @return the specified operation
     * @throws IndexOutOfBoundsException if <code>index &lt; 0 
     *     || index&gt;={@link #getOperationsCount()}</code>
     */
    public IMetaOperation getOperation(int index);

    /**
     * Returns whether this type is the same or a super class of <code>type</code>.
     * 
     * @param type the descriptor to be tested
     * @return <code>true</code> if both types are assignment compatible, <code>false</code> else
     */
    public boolean isAssignableFrom(IMetaType type);

    /**
     * Returns the conversion operation from this type to target type (if there is any).
     * 
     * @param sourceType the source type to convert from
     * @param targetType the target type to convert to
     * @return the conversion operation as defined in the underlying implementation class, 
     *   <b>null</b> if no matching can be found
     */
    public IMetaOperation findConversion(IMetaType sourceType, IMetaType targetType);

    /**
     * Returns whether this instance represents a basic type.
     * 
     * @return <code>true</code> if this instance represents a basic type, <code>false</code> else
     */
    public boolean isBasicType();
    
    /**
     * Returns the type registry this type was registered by.
     * 
     * @return the type registry
     */
    public TypeRegistry getTypeRegistry();
    
    /**
     * Returns whether this type enables dynamic dispatch of operations.
     * 
     * @return <code>true</code> if it enables dynamic dispatch, <code>false</code> else
     */
    public boolean enableDynamicDispatch();
    
    /**
     * Returns whether this type is valid or whether it is a placeholder type in case that the original
     * type cannot be resolved but the script shall remain executable.
     * 
     * @return <code>true</code> if this type is a placeholder, <code>false</code> else
     */
    public boolean isPlaceholder();

    /**
     * Adds a placeholder operation, i.e., in case that the original operation cannot be resolved
     * but the script shall remain executable.
     * 
     * @param name the name of the operation
     * @param parameterCount the number of parameters of the operation
     * @param acceptsNamedParameters whether the operation shall accept named parameters
     * @return the added operation, <b>null</b> if this type is not a {@link #isPlaceholder() placeholder}
     */
    public abstract IMetaOperation addPlaceholderOperation(String name, int parameterCount, 
        boolean acceptsNamedParameters);
    
    /**
     * Returns whether this type can act as an actual type of <code>type</code>.
     * 
     * @param type the type to be checked
     * @return <code>true</code> if this type can act as an actual type of <code>type</code>, <code>false</code> else
     * @see IActualTypeProvider
     */
    public boolean isActualTypeOf(IMetaType type);
    
}
