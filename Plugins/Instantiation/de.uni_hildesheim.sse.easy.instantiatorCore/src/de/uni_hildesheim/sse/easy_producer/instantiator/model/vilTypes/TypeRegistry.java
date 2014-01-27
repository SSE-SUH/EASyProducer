package de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.uni_hildesheim.sse.easy_producer.instantiator.Bundle;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.ArtifactFactory;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.IArtifact;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.configuration.Configuration;
import de.uni_hildesheim.sse.model.utils.JavaUtils;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory.EASyLogger;

/**
 * Used to register the actual types (also replacements by extensions).
 * 
 * @author Holger Eichelberger
 */
public class TypeRegistry {

    /**
     * Those classes for which the methods shall be invisible by default, in particular
     * <code>java.lang.Object</code>. (public also for testing)
     */
    public static final Class<?>[] INVISIBLE_BY_DEFAULT = {Object.class};

    private static final EASyLogger LOGGER = EASyLoggerFactory.INSTANCE.getLogger(TypeRegistry.class, Bundle.ID);
    
    /**
     * Stores the registered types.
     */
    private static final java.util.Map<String, TypeDescriptor<? extends IVilType>> TYPES 
        = new HashMap<String, TypeDescriptor<? extends IVilType>>();

    /**
     * Stores the registered instantiators.
     */
    private static final java.util.Map<String, TypeDescriptor<? extends IVilType>> INSTANTIATORS 
        = new HashMap<String, TypeDescriptor<? extends IVilType>>();

    /**
     * Caches the operations vs. inheriting invisible methods.
     */
    private static final java.util.Map<String, List<Method>> INVISIBLE_INHERITED = new HashMap<String, List<Method>>();
    
    static {
        for (int i = 0; i < INVISIBLE_BY_DEFAULT.length; i++) {
            Method[] methods = INVISIBLE_BY_DEFAULT[i].getDeclaredMethods();
            for (int m = 0; m < methods.length; m++) {
                addInvisibleInherited(methods[m]);
            }
        }
    }
    
    /**
     * Adds the given <code>method</code> to the cache of invisible inherited methods.
     * Already existing registrations will not be changed.
     * 
     * @param method the method to be added.
     * @return <code>true</code> if <code>method</code> was registered before, 
     *   <code>false</code> else
     */
    private static boolean addInvisibleInherited(Method method) {
        String sig = OperationDescriptor.getJavaSignature(method);
        List<Method> registered = INVISIBLE_INHERITED.get(sig);
        if (null == registered) {
            registered = new ArrayList<Method>();
            INVISIBLE_INHERITED.put(sig, registered);
        }
        boolean contained = registered.contains(method);
        if (!contained) {
            registered.add(method);
        }
        return contained;
    }
    
    /**
     * Registers a type. Please note that overriding a default artifact requires the same simple class
     * name as the one to be overridden and that the new artifact type subclasses the existing one.
     * 
     * @param type the Java class of the VIL type to be registered
     * @param <T> the actual type
     * @return the registered descriptor
     * @throws VilException in case that <code>type</code> cannot be registered for some reason
     */
    @SuppressWarnings({ "unchecked" })
    public static final <T extends IVilType> TypeDescriptor<T> registerType(Class<T> type) 
        throws VilException {
        String key = TypeDescriptor.getRegName(type);
        Instantiator inst = type.getAnnotation(Instantiator.class);
        TypeDescriptor<? extends IVilType> registered;
        if (null == inst) {
            // not an instantiator, handle it as a type / artifact
            registered = TYPES.get(key);
            if (null != registered) {
                String msg = ArtifactFactory.checkReplacement(registered.getTypeClass(), type);
                if (null != msg) {
                    throw new VilException(msg, VilException.ID_ALREADY_REGISTERED);
                }
            }
        } else {
            String name = inst.value();
            if (null == name || 0 == name.length()) {
                throw new VilException("instantiator annotation at " + type.getName() 
                    + "does not provide the instantiator name ", VilException.ID_MISSING_DATA);
            }
            registered = INSTANTIATORS.get(name);
        }
        if (null != registered) {
            if (type.equals(registered.getTypeClass())) {
                throw new VilException("type '" + key + "' is already registered", VilException.ID_ALREADY_REGISTERED);
            }
            if (!registered.getTypeClass().isAssignableFrom(type)) {
                throw new VilException("type replacement requires subtype relationship", 
                    VilException.ID_TYPE_INCOMPATIBILITY);
            }
        }
        cacheInheritedAnnotations(type);
        TypeDescriptor<T> desc;
        if (type.equals(PseudoType.class)) {
            desc = (TypeDescriptor<T>) TypeDescriptor.TYPE;
        } else {    
            desc = new TypeDescriptor<T>(type);
        }
        if (null == inst) {
            register(key, desc);
            if (!type.getSimpleName().equals(key)) {
                // to find also qualified names in signatures
                register(type.getName(), desc);
            }
            registerEquivalentClasses(type, desc);
            ArtifactFactory.registered(type);
        } else {
            testInstantiatorType(desc, inst);
            INSTANTIATORS.put(inst.value(), desc);
        }
        return desc;
    }

    /**
     * Some basic semantic tests for instantiators.
     * 
     * @param type the type to be tested
     * @param inst the instatiator annotation
     * @throws VilException in case of failing tests
     */
    private static void testInstantiatorType(TypeDescriptor<? extends IVilType> type, Instantiator inst) 
        throws VilException {
        if (!JavaUtils.isJavaIdentifier(inst.value())) {
            throw new VilException("instantiator name '" + inst.value() + "' is not a valid identifier", 
                VilException.ID_INVALID_DATA);
        }
        int constructorMethods = 0;
        int staticInstantiatorMethods = 0;
        int instanceInstantiatorMethods = 0;
        for (int o = 0; o < type.getOperationsCount(); o++) {
            OperationDescriptor desc = type.getOperation(o);
            if (desc.isConstructor()) {
                constructorMethods++;
            } else if (desc.getName().equals(inst.value())) {
                if (desc.isStatic()) {
                    staticInstantiatorMethods++;
                } else {
                    instanceInstantiatorMethods++;
                }
            }
        }
        
        if (0 == staticInstantiatorMethods && 0 == instanceInstantiatorMethods) {
            throw new VilException("no valid instantiator method declared in " + inst.value() 
                + " (" + type.getTypeClass().getName() + ")'", VilException.ID_INVALID_INSTANTIATOR);
        }
        if (instanceInstantiatorMethods > 0 && 0 == constructorMethods) {
            throw new VilException("no valid constructor method declared in instance instantiator" + inst.value() 
                + " (" + type.getTypeClass().getName() + ")'", VilException.ID_INVALID_INSTANTIATOR);
        }
    }
    
    // name shall be a Java identifier
    // dynamic instantiator -> create
    // instantiator method must be present
    
    /**
     * Registers an individual type and emits an information message on the logger.
     * 
     * @param key the type name to register for
     * @param desc the type descriptor being registered
     */
    private static void register(String key, TypeDescriptor<? extends IVilType> desc) {
        TypeDescriptor<? extends IVilType> previous = TYPES.put(key, desc);
        String prevString = "";
        if (null != previous) {
            prevString = " (overriding)";
        }
        LOGGER.info("registered type " + key + " -> " + desc.getName() + " " + desc.hashCode() + " " + prevString);
    }
    
    /**
     * Registers equivalent classes from {@link ClassMeta#equiv()}.
     * 
     * @param type the type being registered
     * @param desc the already created descriptor for <code>type</code>
     * @param <T> the actual VIL type
     */
    private static final <T extends IVilType> void registerEquivalentClasses(Class<T> type, TypeDescriptor<T> desc) {
        ClassMeta meta = type.getAnnotation(ClassMeta.class);
        if (null != meta && null != meta.equiv()) {
            for (Class<?> eq : meta.equiv()) {
                if (null != eq) {
                    register(eq.getName(), desc);
                    String primitive = null;
                    if (Boolean.class == eq) {
                        primitive = "boolean";
                    } else if (Integer.class == eq) {
                        primitive = "int";
                    } else if (Long.class == eq) {
                        primitive = "long";
                    } else if (Float.class == eq) {
                        primitive = "float";
                    } else if (Double.class == eq) {
                        primitive = "double";
                    } else if (Character.class == eq) {
                        primitive = "char";
                    } else if (Short.class == eq) {
                        primitive = "short";
                    } else if (Byte.class == eq) {
                        primitive = "byte";
                    }
                    if (null != primitive) {
                        register(primitive, desc);
                    }
                }
            }
        }
    }
    
    /**
     * Caches the inherited annotations and avoids repeated class analysis. [performance]
     * 
     * @param cls the class to be cached
     */
    private static void cacheInheritedAnnotations(Class<?> cls) {
        if (cls != Object.class) { // don't go to the very end
            Method[] methods = cls.getDeclaredMethods();
            for (int m = 0; m < methods.length; m++) {
                Method method = methods[m];
                Invisible inv = method.getAnnotation(Invisible.class);
                if (null != inv && inv.inherit()) {
                    if (addInvisibleInherited(methods[m])) {
                        break; // already registered
                    }
                }
            }
            Class<?> superCls = cls.getSuperclass();
            if (null != superCls) {
                cacheInheritedAnnotations(superCls);
            }
            Class<?>[] interf = cls.getInterfaces();
            if (null != interf) {
                for (int i = 0; i < interf.length; i++) {
                    cacheInheritedAnnotations(interf[i]);
                }
            }
        }
    }

    /**
     * Returns whether a certain method given by its signature (see {@link OperationDescriptor#getSignature()} 
     * has an inherited invisible annotation. Helper method for subsequent class analysis.
     * 
     * @param signature the signature of the method to be queried for
     * @param cls the declaring class of the method
     * @return <code>true</code> if it has an inherited {@link Invisible} annotation, <code>false</code> else
     */
    static boolean hasInheritedInvisibleAnnotation(String signature, Class<?> cls) {
        boolean found = false;
        List<Method> methods = INVISIBLE_INHERITED.get(signature);
        if (null != methods) {
            for (int m = 0; !found && m < methods.size(); m++) {
                found = methods.get(m).getDeclaringClass().isAssignableFrom(cls);
            }
        }
        return found;
    }
    
    /**
     * Internal default registration function with error handling.
     * 
     * @param type the type class to be registered
     * @param <T> the actual type
     */
    public static final <T extends IVilType> void register(Class<T> type) {
        try {
            registerType(type);
        } catch (VilException e) {
            LOGGER.error(e.getMessage());
        }
    }
    
    /**
     * Provides access to all type descriptors.
     * 
     * @return all type descriptors (without a specific sequence)
     */
    public static final Iterable<TypeDescriptor<? extends IVilType>> allTypes() {
        return TYPES.values();
    }
    
    /**
     * Provides access to all instantiators.
     * 
     * @return all instantiators (without a specific sequence)
     */
    public static final Iterable<TypeDescriptor<? extends IVilType>> allInstantiators() {
        return INSTANTIATORS.values();
    }

    /**
     * Provides access to all type descriptors with names starting with the given <code>prefix</code>.
     * 
     * @param prefix the prefix to look for
     * @return the type descriptors matching the prefix (without a specific sequence)
     */
    public static final Iterable<TypeDescriptor<? extends IVilType>> typesByNamePrefix(String prefix) {
        List<TypeDescriptor<? extends IVilType>> result = new ArrayList<TypeDescriptor<? extends IVilType>>();
        for (TypeDescriptor<? extends IVilType> type : TYPES.values()) {
            if (type.getName().startsWith(prefix)) {
                result.add(type);
            }
        }
        return result;
    }
    
    /**
     * Returns the registered type descriptor for the given <code>name</code>.
     * 
     * @param name the name to look for
     * @return the type descriptor or <b>null</b> if no one is registered for <code>name</code>
     */
    public static final TypeDescriptor<? extends IVilType> getType(String name) {
        return TYPES.get(name);
    }

    /**
     * Returns the VIL type for a map with the given type parameters.
     * 
     * @param parameter the type parameter
     * @return the type
     * @throws VilException in case that the derivation of the type fails
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static final TypeDescriptor<? extends Map<? extends IVilType, ? extends IVilType>> getMapType(
        TypeDescriptor<? extends IVilType>... parameter) throws VilException {
        return new TypeDescriptor(Map.class, parameter);
    }

    /**
     * Returns the VIL type for a collection with the given type parameters.
     * 
     * @param parameter the type parameter
     * @return the type
     * @throws VilException in case that the derivation of the type fails
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static final TypeDescriptor<? extends Collection<? extends IVilType>> getCollectionType(
        TypeDescriptor<? extends IVilType>... parameter) throws VilException {
        return new TypeDescriptor(Collection.class, parameter);
    }
    
    /**
     * Returns the VIL type for a set with the given type parameters.
     * 
     * @param parameter the type parameter
     * @return the type
     * @throws VilException in case that the derivation of the type fails
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static final TypeDescriptor<? extends Set<? extends IVilType>> getSetType(
        TypeDescriptor<? extends IVilType>... parameter) throws VilException {
        return new TypeDescriptor(Set.class, parameter);
    }

    /**
     * Returns the VIL type for a sequence with the given type parameters.
     * 
     * @param parameter the type parameter
     * @return the type
     * @throws VilException in case that the derivation of the type fails
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static final TypeDescriptor<? extends Sequence<? extends IVilType>> getSequenceType(
        TypeDescriptor<? extends IVilType>... parameter) throws VilException {
        return new TypeDescriptor(Sequence.class, parameter);
    }
    
    /**
     * Returns the registered instantiator type descriptor for the given <code>name</code>.
     * 
     * @param name the name to look for
     * @return the type descriptor or <b>null</b> if no one is registered for <code>name</code>
     */
    public static final TypeDescriptor<? extends IVilType> getInstantiator(String name) {
        return INSTANTIATORS.get(name);
    }
    
    /**
     * Returns the type descriptor for the built-in type String.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> stringType() {
        return getType(Constants.TYPE_STRING);
    }

    /**
     * Returns the type descriptor for the built-in type Boolean.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> booleanType() {
        return getType(Constants.TYPE_BOOLEAN);
    }

    /**
     * Returns the type descriptor for the built-in type Integer.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> integerType() {
        return getType(Constants.TYPE_INTEGER);
    }

    /**
     * Returns the type descriptor for the built-in type Real.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> realType() {
        return getType(Constants.TYPE_REAL);
    }

    /**
     * Returns the type descriptor for the built-in type Configuration.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> configurationType() {
        return getType(Configuration.class);
    }

    /**
     * Returns the type descriptor for the built-in type Project.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> projectType() {
        return getType(Project.class);
    }

    /**
     * Returns the type descriptor for the built-in type Artifact.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> artifactType() {
        return getType(IArtifact.class);
    }
    
    /**
     * Converts a class into a type descriptor.
     * 
     * @param cls the classes to be converted
     * @return the corresponding type descriptor or <b>null</b>
     */
    public static final TypeDescriptor<? extends IVilType> getType(Class<? extends IVilType> cls) {
        return TypeRegistry.getType(TypeDescriptor.getRegName(cls));
    }

    /**
     * Finds the type descriptor for a given class.
     * 
     * @param cls the classes to be converted
     * @return the corresponding type descriptor or <b>null</b>
     */
    public static final TypeDescriptor<? extends IVilType> findType(Class<?> cls) {
        return TypeRegistry.getType(TypeDescriptor.getRegName(cls));
    }
    
    /**
     * Converts a class into a set of type descriptors.
     * 
     * @param param the class to be converted
     * @return the resulting type descriptors, <code>null</code> if <code>params</code> is <b>null</b> or empty. If a 
     *     type descriptor cannot be found, {@link TypeDescriptor#VOID} is used instead.
     */
    public static final TypeDescriptor<? extends IVilType>[] convert(Class<? extends IVilType> param) {
        TypeDescriptor<? extends IVilType>[] result;
        if (null == param ) {
            result = null;
        } else {
            result = TypeDescriptor.createArray(1);
            result[0] = getType(param);
            if (null == result[0]) {
                result[0] = TypeDescriptor.VOID;
            }
        }
        return result;
    }
    
    /**
     * Converts a set of classes into type descriptors.
     * 
     * @param params the classes to be converted
     * @return the resulting type descriptors, <code>null</code> if <code>params</code> is <b>null</b> or empty. If a 
     *     type descriptor cannot be found, {@link TypeDescriptor#VOID} is used instead.
     */
    public static final TypeDescriptor<? extends IVilType>[] convert(Class<? extends IVilType>... params) {
        TypeDescriptor<? extends IVilType>[] result;
        if (null == params || 0 == params.length) {
            result = null;
        } else {
            result = TypeDescriptor.createArray(params.length);
            for (int p = 0; p < params.length; p++) {
                result[p] = getType(params[p]);
                if (null == result[p]) {
                    result[p] = TypeDescriptor.VOID;
                }
            }
        }
        return result;
    }

}
