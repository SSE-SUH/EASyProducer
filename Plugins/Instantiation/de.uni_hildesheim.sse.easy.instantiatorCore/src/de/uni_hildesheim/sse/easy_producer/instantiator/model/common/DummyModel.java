package de.uni_hildesheim.sse.easy_producer.instantiator.model.common;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.IMetaField;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.IMetaOperation;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.IMetaType;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.ITypedModel;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.TypeDescriptor;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.TypeRegistry;
import net.ssehub.easy.basics.modelManagement.IRestrictionEvaluationContext;
import net.ssehub.easy.basics.modelManagement.IndentationConfiguration;
import net.ssehub.easy.basics.modelManagement.ModelImport;
import net.ssehub.easy.basics.modelManagement.Version;

/**
 * Implements a dummy model used for properly initializing {@link RuntimeEnvironment}.
 * 
 * @author Holger Eichelberger
 */
class DummyModel implements ITypedModel {

    static final ITypedModel INSTANCE = new DummyModel();

    /**
     * Prevents external instantiation (singleton).
     */
    private DummyModel() {
    }
    
    @Override
    public void setVersion(Version version) {
    }

    @Override
    public Version getVersion() {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getImportsCount() {
        return 0;
    }

    @Override
    public ModelImport<?> getImport(int index) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public ModelImport<?> getSuper() {
        return null;
    }

    @Override
    public IndentationConfiguration getIndentationConfiguration() {
        return null;
    }

    @Override
    public void dispose() {
    }

    @Override
    public IRestrictionEvaluationContext getRestrictionEvaluationContext() {
        return null;
    }

    @Override
    public String getQualifiedName() {
        return "";
    }

    @Override
    public int getOperationsCount() {
        return 0;
    }

    @Override
    public IMetaOperation getOperation(int index) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean isAssignableFrom(IMetaType type) {
        return false;
    }

    @Override
    public IMetaOperation findConversion(IMetaType sourceType, IMetaType targetType) {
        return null;
    }

    @Override
    public boolean isBasicType() {
        return false;
    }

    @Override
    public TypeRegistry getTypeRegistry() {
        return TypeRegistry.DEFAULT;
    }

    @Override
    public boolean enableDynamicDispatch() {
        return false;
    }

    @Override
    public boolean isPlaceholder() {
        return true;
    }

    @Override
    public IMetaOperation addPlaceholderOperation(String name, int parameterCount, boolean acceptsNamedParameters) {
        return null;
    }

    @Override
    public boolean isActualTypeOf(IMetaType type) {
        return false;
    }

    @Override
    public IMetaType getBaseType() {
        return null;
    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public IMetaField getField(int index) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean isInternal() {
        return true;
    }

    @Override
    public IMetaType getSuperType() {
        return null;
    }
    
    @Override
    public int getGenericParameterCount() {
        return 0;
    }

    @Override
    public TypeDescriptor<?> getGenericParameterType(int index) {
        throw new IllegalArgumentException();
    }

}
