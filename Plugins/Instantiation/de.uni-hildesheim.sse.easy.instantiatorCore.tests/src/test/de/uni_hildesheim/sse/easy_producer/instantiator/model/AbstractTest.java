package test.de.uni_hildesheim.sse.easy_producer.instantiator.model;

import java.io.File;

import org.junit.BeforeClass;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.BuiltIn;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.TypeRegistry;

/**
 * An abstract test class for the instantiator core tests.
 * 
 * @author Holger Eichelberger
 */
public class AbstractTest {
    
    private TypeRegistry registry = new TypeRegistry(TypeRegistry.DEFAULT);
    
    /**
     * Returns the local registry for this test.
     * 
     * @return the local registry
     */
    protected TypeRegistry getRegistry() {
        return registry;
    }

    /**
     * Starts up the test by calling {@link BuiltIn#initialize()}.
     */
    @BeforeClass
    public static void startUp() {
        BuiltIn.initialize();
    }
    
    /**
     * Determines the actual directory with the test IVML files depending on the
     * JVM system property "instantiatorCore.testdata.home" which may contain a specific
     * directory (or be empty -> default directory).
     * 
     * @return the actual directory as file
     */
    public static File determineTestDataDir() {
        File result;
        String externalLocation = System.getProperty("instantiatorCore.testdata.home");
        if (null == externalLocation) {
            result = new File("testdata");
        } else {
            result = new File(externalLocation);
        }
        return result;
    }

}
