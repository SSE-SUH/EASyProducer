package de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.configuration;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.IVilType;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Project;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.TypeDescriptor;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.TypeRegistry;

/**
 * Provides access to the type descriptors of the types defined in this package.
 * 
 * @author Holger Eichelberger
 */
public class IvmlTypes {

    /**
     * Returns the type descriptor for the built-in type 'Configuration'.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> configurationType() {
        return TypeRegistry.DEFAULT.getType(Configuration.class);
    }

    /**
     * Returns the type descriptor for the built-in type 'DecisionVariable'.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> decisionVariableType() {
        return TypeRegistry.DEFAULT.getType(DecisionVariable.class);
    }
    
    /**
     * Returns the type descriptor for the built-in type 'IvmlDeclaration'.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> declarationType() {
        return TypeRegistry.DEFAULT.getType(IvmlDeclaration.class);
    }

    /**
     * Returns the type descriptor for the built-in type 'Project'.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> projectType() {
        return TypeRegistry.DEFAULT.getType(Project.class);
    }

    /**
     * Returns the type descriptor for the built-in type 'Attribute'.
     * 
     * @return the type descriptor
     */
    public static final TypeDescriptor<? extends IVilType> attributeType() {
        return TypeRegistry.DEFAULT.getType(Attribute.class);
    }

}
