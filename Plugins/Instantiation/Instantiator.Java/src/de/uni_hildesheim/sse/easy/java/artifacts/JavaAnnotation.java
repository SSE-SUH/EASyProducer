package de.uni_hildesheim.sse.easy.java.artifacts;

import java.util.HashMap;
import java.util.Map;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.IArtifactVisitor;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.representation.Binary;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.representation.Text;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.ArraySet;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.ArtifactException;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Invisible;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.OperationMeta;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.PseudoString;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Set;

/**
 * Represents a Java annotation.
 * 
 * @author Holger Eichelberger, Sass
 */
public class JavaAnnotation extends JavaFragmentArtifact {
    
    static final String DEFAULT_FIELD = "value"; // as defined in JLS
    
    private String qualifiedName;
    private String simpleName;
    private Map<String, String> fields = new HashMap<String, String>(); // preliminary
    
    /**
     * Default Constructor.
     * 
     * @param name The annotation name
     * @param fields the annotation fields (name-value mapping)
     * @param parent the parent artifact or fragment
     */
    public JavaAnnotation(String name, Map<String, String> fields, IJavaParent parent) {
        super(parent);
        qualifiedName = name;
        simpleName = toSimpleName(name);
        this.fields.putAll(fields);
    }
    
    /**
     * Returns the simple name of a possible qualified name.
     * 
     * @param name the name
     * @return the simple name
     */
    @Invisible
    static String toSimpleName(String name) {
        int pos = name.lastIndexOf('.');
        if (pos > 0 && pos < name.length() - 1) {
            name = name.substring(pos + 1, name.length());
        }
        return name;
    }

    @Override
    public void delete() throws ArtifactException {
        getParent().deleteChild(this);
    }

    @Override
    public String getName() throws ArtifactException {
        return simpleName;
    }
    
    /**
     * Returns the qualified name of the annotation.
     * 
     * @return the qualified name
     */
    public String getQualifiedName() {
        return qualifiedName;
    }

    @Override
    public void rename(String name) throws ArtifactException {
        // TODO Auto-generated method stub
        //getParent().notifyChanged();
    }

    @Override
    public Text getText() throws ArtifactException {
        return Text.CONSTANT_EMPTY;
    }

    @Override
    public Binary getBinary() throws ArtifactException {
        return Binary.CONSTANT_EMPTY;
    }

    @Override
    public void accept(IArtifactVisitor visitor) {
        visitor.visitFragmentArtifact(this);
    }

    /**
     * Returns the fields of this annotation.
     * 
     * @return the fields
     */
    @OperationMeta(returnGenerics = String.class)
    public Set<String> fields() {
        java.util.Set<String> fields = this.fields.keySet();
        return new ArraySet<String>(fields.toArray(new String[fields.size()]), PseudoString.class);
    }
    
    /**
     * Returns the annotation value as a string.
     * 
     * @param field the name of the field to return
     * @return The annotation value represented as a string, may be <b>null</b> of not found.
     */
    public String getAnnotationValue(String field) {
        return fields.get(field);
    }

}
