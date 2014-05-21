package test.de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel;

import java.io.File;
import java.util.HashMap;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel.BuildlangExecution;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel.NoTracer;

/**
 * A slightly extended abstract test class.
 * 
 * @author Holger Eichelberger
 */
public class AbstractTest extends test.de.uni_hildesheim.sse.easy_producer.instantiator.model.AbstractTest {
    
    /**
     * Just for testing!
     * 
     * @return an execution environment
     */
    protected static final BuildlangExecution createExecutionInstance() {
        return new BuildlangExecution(NoTracer.INSTANCE, new File("."), new HashMap<String, Object>());
    }

}
