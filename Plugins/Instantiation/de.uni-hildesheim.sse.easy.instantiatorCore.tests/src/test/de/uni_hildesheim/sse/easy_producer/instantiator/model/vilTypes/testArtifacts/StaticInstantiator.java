package test.de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.testArtifacts;

import net.ssehub.easy.instantiation.core.model.artifactModel.FileArtifact;
import net.ssehub.easy.instantiation.core.model.vilTypes.ArraySet;
import net.ssehub.easy.instantiation.core.model.vilTypes.IVilType;
import net.ssehub.easy.instantiation.core.model.vilTypes.Instantiator;
import net.ssehub.easy.instantiation.core.model.vilTypes.OperationMeta;
import net.ssehub.easy.instantiation.core.model.vilTypes.Set;

/**
 * Implements a static instantiator for testing.
 * 
 * @author Holger Eichelberger
 */
@Instantiator("staticInstantiator")
public class StaticInstantiator implements IVilType {
    
    /**
     * Instantiates a file artifact.
     * 
     * @param file the file to be instantiated
     * @return the instantiated files
     */
    @OperationMeta(returnGenerics = FileArtifact.class)
    public static Set<FileArtifact> staticInstantiator(FileArtifact file) {
        return ArraySet.empty(FileArtifact.class);
    }

    /**
     * Shall not be visible.
     */
    public void shallNotBeVisible() {
    }

}
