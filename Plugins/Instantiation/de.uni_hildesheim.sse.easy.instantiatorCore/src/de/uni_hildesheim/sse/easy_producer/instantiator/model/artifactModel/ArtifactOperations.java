package de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.ArtifactException;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Conversion;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Invisible;

/**
 * The artifact operations which cannot be implemented in an interface.
 * 
 * @author Holger Eichelberger
 */
public class ArtifactOperations {

    /**
     * Conversion operation.
     * 
     * @param path the path to be converted
     * @return the converted value
     * @throws ArtifactException in case that creating the artifact fails
     */
    @Invisible
    @Conversion
    public static IArtifact convert(Path path) throws ArtifactException {
        return ArtifactFactory.createArtifact(IArtifact.class, path.getAbsolutePath(), path.getArtifactModel());
    }
    
    /**
     * Conversion operation.
     * 
     * @param val the value to be converted
     * @return the converted value
     * @throws ArtifactException in case that creating the artifact fails
     */
    @Invisible
    @Conversion
    public static IArtifact convert(String val) throws ArtifactException {
        return convert(Path.convert(val));
    }
    
    // further conversions needed

}
