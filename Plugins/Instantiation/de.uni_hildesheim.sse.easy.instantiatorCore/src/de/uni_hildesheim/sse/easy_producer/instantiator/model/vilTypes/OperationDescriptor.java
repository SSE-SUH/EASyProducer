package de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.common.VilException;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.ExpressionEvaluator;

/**
 * Represents an individual operation available to the VIL languages. Please
 * note that named arguments are passed in terms of a map as the last parameter
 * of the respective method. If the underlying Java method takes such a parameter, 
 * the descriptor will count one parameter less!
 * 
 * @author Holger Eichelberger
 */
public abstract class OperationDescriptor implements IMetaOperation {

    /**
     * Declares different types of alias.
     * 
     * @author Holger Eichelberger
     */
    public enum AliasType {
        
        /**
         * No alias.
         */
        NONE,
        
        /**
         * Annotation-based alias.
         */
        EXPLICIT, 
        
        /**
         * Implicit name-based alias (duplication).
         */
        IMPLICIT
    }

    /**
     * The name of constructor methods (static, same return type as declaring class, this name).
     * We do not rely on constructors, as constructor methods simplify reflection analysis.
     */
    public static final String CONSTRUCTOR_NAME = "create";
    
    /**
     * Defines a constant unmodifiable list for empty parameters.
     */
    public static final List<TypeDescriptor<?>> EMPTY_PARAMETER 
        = Collections.unmodifiableList(new ArrayList<TypeDescriptor<?>>(0));

    private String name; // only used if alias
    private boolean isConstructor = false;
    private OperationType opType = OperationType.NORMAL;
    private TypeDescriptor<?> declaringType;
    private TypeDescriptor<?> returnType; // lazy
    private AliasType aliasType = AliasType.NONE;
    private List<TypeDescriptor<?>> parameter; // lazy
    private boolean acceptsNamedParameters = false; // lazy
    private boolean acceptsImplicitParameters = false; // lazy
    private boolean isConversion;

    /**
     * Creates a new operation descriptor. Overriding constructors shall call 
     * {@link #setCharacteristics(OperationType, AliasType, boolean)} in order to redefined the 
     * default values.
     * 
     * @param declaringType the declaring type
     * @param name the alias name (may be <b>null</b> if the original name of <code>method</code> shall be used)
     * @param isConstructor whether the operation is a constructor
     */
    protected OperationDescriptor(TypeDescriptor<?> declaringType, String name, 
        boolean isConstructor) {
        this.declaringType = declaringType;
        this.name = name;
        this.isConstructor = isConstructor;
    }
    
    /**
     * Sets the characteristics of this operation descriptor. To be called by overridden
     * constructors.
     * 
     * @param opType the operation type
     * @param aliasType the alias type
     * @param isConversion whether the operation is a conversion
     * @param name the actual name of the operation
     */
    protected void setCharacteristics(OperationType opType, AliasType aliasType, boolean isConversion, String name) {
        this.opType = opType;
        this.aliasType = aliasType;
        this.isConversion = isConversion;
        this.name = name;
    }
    
    /**
     * Initializes the parameter and the return type if necessary (lazy, due to 
     * linked descriptor structures which may not have been completely initialized
     * during the constructor execution).
     * 
     * @see #initializeParameter()
     * @see #initializeReturnType()
     */
    private void initialize() {
        if (null == parameter) {
            initializeParameters();
        }
        if (null == returnType) {
            initializeReturnType();
        }
    }
    
    /**
     * Initializes the parameters (lazy init). Is called by {@link #initialize()}. 
     * Shall call {@link #setParameters(List, boolean, boolean)}.
     */
    protected abstract void initializeParameters();

    /**
     * Initializes the return type (lazy init). Is called by {@link #initialize()}. 
     * Shall call {@link #setReturnType(TypeDescriptor)}.
     */
    protected abstract void initializeReturnType();
    
    /**
     * Sets the parameters. Shall only be called in {@link #initializeParameters()}.
     * 
     * @param parameters the parameters
     * @param acceptsNamedParameters whether this operation accepts named parameters
     * @param acceptsImplicitParameters whether this operation accepts implicit parameters
     */
    protected void setParameters(List<TypeDescriptor<?>> parameters, boolean acceptsNamedParameters, 
        boolean acceptsImplicitParameters) {
        this.parameter = parameters;
        this.acceptsNamedParameters = acceptsNamedParameters;
        this.acceptsImplicitParameters = acceptsImplicitParameters;
    }

    /**
     * Sets the return type. Shall only be called in {@link #initializeReturnType()}.
     * 
     * @param returnType the return type of this operation
     */
    protected void setReturnType(TypeDescriptor<?> returnType) {
        this.returnType = returnType;
    }
    
    /**
     * Returns whether the operation accepts named parameters.
     * 
     * @return <code>true</code> if it accepts named parameters, <code>false</code> else
     */
    public boolean acceptsNamedParameters() {
        return acceptsNamedParameters;
    }

    /**
     * Returns whether the operation accepts implicit named parameters.
     * 
     * @return <code>true</code> if it accepts implicit named parameters, <code>false</code> else
     */
    public boolean acceptsImplicitParameters() {
        return acceptsImplicitParameters;
    }
    
    /**
     * Returns the name of the method.
     * 
     * @return the name of the method
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the name stored in this instance.
     * 
     * @return the name stored in this instance
     */
    protected final String getStoredName() {
        return name;
    }
    
    /**
     * Returns the operation / operator type.
     * 
     * @return the operation / operator type
     */
    public OperationType getOperationType() {
        return opType;
    }
    
    /**
     * Returns the alias type.
     * 
     * @return the alias type
     */
    protected AliasType getAliasType() {
        return aliasType;
    }

    /**
     * Returns the name of the declaring type. In case that 
     * {@link #getDeclaringType()} is <b>null</b>, the result of 
     * {@link #getDeclaringTypeNameFallback()}
     * is returned.
     * 
     * @return the name of the declaring type
     */
    public String getDeclaringTypeName() {
        String result;
        if (null != declaringType) {
            result = declaringType.getName();
        } else {
            result = getDeclaringTypeNameFallback();
        }
        return result;
    }
    
    /**
     * Returns the name of the declaring type in case that {@link #getDeclaringType()}
     * is <b>null</b>.
     * 
     * @return the name of the declaring type
     */
    protected abstract String getDeclaringTypeNameFallback();
    
    /**
     * Returns the signature of the method.
     * 
     * @return the signature of the method
     */
    public String getSignature() {
        StringBuilder tmp = new StringBuilder();
        if (isConstructor()) {
            tmp.append("new ");
            tmp.append(getDeclaringTypeName());
            tmp.append(" ");
        } else {
            tmp.append(getName());
        }
        tmp.append("(");
        int pCount = getParameterCount();
        for (int p = 0; p < pCount; p++) {
            tmp.append(getParameterType(p).getVilName());
            if (p < pCount - 1) {
                tmp.append(",");
            }
        }
        tmp.append(")");
        return tmp.toString();
    }
    
    /**
     * Returns the Java signature of the method (public for testing).
     * 
     * @return the Java signature of the method
     */
    public abstract String getJavaSignature();
    
    /**
     * Returns whether this operation represents a constructor. Basically, for VIL a 
     * constructor is a public static method named "create" which returns an instance
     * of the underlying type. Declared constructors are used for internal purposes.
     * 
     * @return <code>true</code> if this operation is a "constructor", <code>false</code> else
     */
    public boolean isConstructor() {
        return isConstructor;
    }
    
    /**
     * Returns the declaring type.
     * 
     * @return the declaring type (may be <b>null</b> in case of a wrapped external Java method)
     */
    public TypeDescriptor<?> getDeclaringType() {
        return declaringType;
    }
    
    /**
     * Returns the alias type.
     * 
     * @return the alias type
     */
    public AliasType isAlias() {
        return aliasType;
    }
    
    /**
     * Returns the result of a type compatibility comparison.
     * 
     * @author Holger Eichelberger
     */
    public enum CompatibilityResult {
        
        /**
         * Types are compatible.
         */
        COMPATIBLE,
        
        /**
         * Types are incompatible.
         */
        INCOMPATIBLE,

        /**
         * Argument evaluates to <b>null</b>, i.e., stop expression evaluation.
         */
        ARG_EVALUATION_FAILED
    }
    
    /**
     * Returns whether the operation represented by this instance is compatible to
     * the given return type and parameters. This method does not consider possible
     * unnamed parameter rather than the underlying Java parameter.
     * 
     * @param retType the return type (may be <b>null</b> in order to ignore this parameter)
     * @param params the parameters (may be <b>null</b> if there are none, may be classes)
     * @return an instance of {@link CompatibilityResult} denoting the actual compatibility level
     */
    public abstract CompatibilityResult isCompatible(Class<?> retType, Object... params); 
    
    // disable assignment Integer
    // reflection translation table
    
    /**
     * Invokes the specified operation. This method does not consider possible
     * unnamed parameter rather than the underlying Java parameter. In case of {@link #acceptsNamedParameters()}
     * the caller must ensure that the last parameter is a <code>map&lt;String, Object&gt;</code> containing
     * the named parameters.
     * 
     * @param args the arguments, in case of non-static operations the first argument 
     *   must be the object to execute on
     * @return the result of the execution
     * @throws VilException if the invocation fails
     * 
     * @see #isCompatible
     */
    public abstract Object invoke(Object... args) throws VilException;
    
    /**
     * Throws an exception for the case that parameter are incompatible.
     * 
     * @param args the actual arguments
     * @throws VilException the created exception (happens in any case)
     */
    protected void throwIncompatibleParameter(Object[] args) throws VilException {
        StringBuilder tmp = new StringBuilder("(");
        int start = 0;
        if (!isStatic()) {
            start = 1;
        }
        for (int i = start; i < args.length; i++) {
            if (i > start) {
                tmp.append(", ");
            }
            if (null == args[i]) {
                tmp.append("null");
            } else {
                tmp.append(args[i].getClass().getSimpleName());
            }
        }
        tmp.append(")");
        throw new VilException("incompatible parameter " + tmp + " cannot be applied to " 
            + getJavaSignature(), VilException.ID_TYPE_INCOMPATIBILITY);
    }
    
    /**
     * Returns whether two Java methods have the same Java signature (public for testing). This method does not 
     * consider possible unnamed parameter rather than the underlying Java parameter.
     * 
     * @param method1 the first method to compare
     * @param method2 the second method to compare
     * @return <code>true</code> if both have the same signature, <code>false</code> else
     */
    public static boolean isSameSignature(Method method1, Method method2) {
        boolean same = false;
        if (method1.getName().equals(method2.getName())) {
            if (method1.getReturnType().equals(method2.getReturnType())) { // might need relaxation
                Class<?>[] param1 = method1.getParameterTypes();
                Class<?>[] param2 = method2.getParameterTypes();
                if (param1.length == param2.length) {
                    same = true;
                    for (int p = 0; same && p < param1.length; p++) {
                        same = param1[p].equals(param2[p]);
                    }
                }
            }
        }
        return same;
    }
    
    /**
     * Returns whether the given method is considered to be a VIL "constructor".
     * A VIL constructor must comply to the VIL rules, 
     * it must be static, the name must be equal to {@link #CONSTRUCTOR_NAME}
     * and the return type must be equal to the one of the declaring class (public for testing).
     * 
     * @param method the method to be analyzed
     * @return <code>true</code> if it is considered as a constructor, <code>false</code> else
     */
    public static boolean isConstructor(Method method) {
        int modifier = method.getModifiers();
        boolean modOk = Modifier.isPublic(modifier) && !Modifier.isAbstract(modifier) && Modifier.isStatic(modifier);
        return  modOk && method.getName().equals(CONSTRUCTOR_NAME) 
            && method.getReturnType().equals(method.getDeclaringClass());
    }

    /**
     * Returns whether the given method is considered to be a VIL operation. A VIL operation must comply to the 
     * VIL rules and not be static (public for testing).
     * 
     * @param method the method to be analyzed
     * @return <code>true</code> if it is considered as an operation, <code>false</code> else
     */
    public static boolean isOperation(Method method) {
        int modifier = method.getModifiers();
        return Modifier.isPublic(modifier) && !isConstructor(method);
    }
    
    /**
     * Returns whether the given method is a VIL operation or a VIL constructor.
     * 
     * @param method the method to be analyzed
     * @return <code>true</code> in case of a VIL operation or VIL constructor
     * 
     * @see #isConstructor(Method)
     * @see #isOperation(Method)
     */
    static boolean isOperationOrConstructor(Method method) {
        return isOperation(method) || isConstructor(method);
    }
    
    /**
     * Returns the return type of this operation.
     * 
     * @return the return type
     */
    public TypeDescriptor<?> getReturnType() {
        initialize();
        return returnType;
    }
    
    /**
     * Returns the number of parameters.
     * 
     * @return the number of parameter
     */
    public int getParameterCount() {
        initialize();
        return parameter.size();
    }
    
    /**
     * Returns the specified parameter type.
     * 
     * @param index the index of the parameter to return
     * @return the specified parameter type
     * @throws IndexOutOfBoundsException if <code>index &lt; 0 || index &gt;= {@link #getParameterCount()}</code>
     */
    public TypeDescriptor<?> getParameterType(int index) {
        initialize();
        return parameter.get(index);
    }
    
    /**
     * Returns a textual representation of this descriptor (the Java signature).
     * 
     * @return the textual representation
     */
    @Override
    public String toString() {
        return getJavaSignature();
    }
    
    /**
     * Returns whether this operation is a type select operation (non-static, collection
     * return, parameter is type).
     * 
     * @return <code>true</code> if it is a type select operation, <code>false</code> else
     */
    public boolean isTypeSelect() {
        boolean ok = false;
        if (!isStatic()) {
            initialize();
            ok = returnType.isCollection() && 2 == getParameterCount() 
                && (TypeRegistry.typeType() == getParameterType(1));
        }
        return ok;
    }

    /**
     * Returns whether this operation is a generic collection operation, i.e., whether the collection
     * itself determines the return type (non-static, collection return, implicit parameter is generic collection).
     * 
     * @return <code>true</code> if it is a generic collection operation, <code>false</code> else
     */
    public boolean isGenericCollectionOperation() {
        boolean ok = false;
        if (!isStatic()) {
            initialize();
            if (returnType.isCollection() && getParameterCount() > 0) {
                ok = getParameterType(0).isCollection();
            }
        }
        return ok;
    }

    /**
     * Return whether this operation returns the result of iterating over a collection. Such an 
     * operation may be a quantor, a collector or a selector. Therefore, the operation
     * must not be static, belong to a collection (first parameter type) and accept exactly one 
     * {@link ExpressionEvaluator} (typically the only additional parameter).
     * 
     * @return <code>true</code> of this operation is an iterating operation, <code>false</code> else
     */
    public boolean isIteratingCollectionOperation() {
        boolean ok = false;
        initialize();
        if (!isStatic()) {
            if (getParameterCount() > 1 && getParameterType(0).isCollection()) {
                int count = 0;
                for (int p = 1; p < getParameterCount(); p++) {
                    if (ExpressionEvaluator.class == getParameterType(0).getTypeClass()) {
                        count++;
                    }
                }
                ok = count == 1;
            }
        }
        return ok;
    }
    
    /**
     * Returns whether this operation descriptor is a conversion.
     * 
     * @return <code>true</code> if it is a conversion, <code>false</code> else
     */
    public boolean isConversion() {
        return isConversion;
    }
    
    /**
     * Returns whether a generc parameter of the operand shall be used as return type.
     * 
     * @return the parameter to be used as index number, negative if none
     */
    public abstract int useGenericParameterAsReturn();
    
    /**
     * Returns whether a parameter shall be used as return type.
     * 
     * @return the parameter to be used as index number, negative if none
     */
    public abstract int useParameterAsReturn();
    
    /**
     * Returns whether artifacts shall be stored before execution of this operation.
     * 
     * @return <code>true</code> if artifacts shall be stored, <code>false</code> else
     */
    public abstract boolean storeArtifactsBeforeExecution();

    /**
     * Indicates whether this function requires dynamic expression processing and may cause problems with 
     * serialized models in standalone settings without xText.
     * 
     * @return <code>true</code> if this function requires dynamic exception processing, <code>false</code> else
     */
    public boolean requiresDynamicExpressionProcessing() {
        return false;
    }
    
    /**
     * Returns whether an execution of this descriptor shall be traced. Conversions shall not be traced by default as 
     * well as some operation types.
     * 
     * @return <code>true</code> if it shall be traced, <code>false</code>
     */
    public boolean trace() {
        return !isConversion() && getOperationType().trace();
    }
    
    /**
     * Tries to specialize this operation descriptor for the given type, e.g., to consider the specific generic
     * parameters of that type.
     * 
     * @param declaringType the declaring type to specialize for
     * @return either <b>this</b> if no specialization is needed or a specializing instance
     */
    public OperationDescriptor specializeFor(TypeDescriptor<?> declaringType) {
        return this;
    }
    
    /**
     * Returns whether this operation allows iterator aggregation.
     * 
     * @return <code>true</code> if allowed, <code>false</code>
     */
    public boolean allowsAggregation() {
        return false;
    }

}
