package test.net.ssehub.easy.reasoning.sseReasoner;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_hildesheim.sse.ModelUtility;
import net.ssehub.easy.basics.messages.Status;
import net.ssehub.easy.basics.progress.ProgressObserver;
import net.ssehub.easy.dslCore.TranslationResult;
import net.ssehub.easy.dslCore.translation.Message;
import net.ssehub.easy.reasoning.core.reasoner.ReasonerConfiguration;
import net.ssehub.easy.reasoning.core.reasoner.ReasoningResult;
import net.ssehub.easy.reasoning.sseReasoner.Engine;
import net.ssehub.easy.varModel.confModel.Configuration;
import net.ssehub.easy.varModel.management.VarModel;
import net.ssehub.easy.varModel.model.Project;

/**
 * Test suite for automated test execution on build server.
 * Do not forget to add new test suites here.<br/>
 * Usually a property is used to specify the location of test data.
 * This is done with the property
 * {@link net.ssehub.easy.reasoning.core.frontend.TestConfiguration#SYSTEM_PROPERTY}. For instance: <br/>
 * <tt>-DreasonerCore.testdata.home=C:\EASyProducer-git\Plugins\Reasoner\ReasonerCore\ReasonerCore.test\testdata</tt>
 * @author Sizonenko
 * @author El-Sharkawy
 *
 */
@RunWith(Suite.class)
@SuiteClasses({
    test.net.ssehub.easy.reasoning.sseReasoner.adaptation.AllTests.class,
    test.net.ssehub.easy.reasoning.sseReasoner.capabilities.AllTests.class,
    // Skip: performance in automatic testing 
    test.net.ssehub.easy.reasoning.sseReasoner.qm.AllTests.class,
    test.net.ssehub.easy.reasoning.sseReasoner.reasoner.AllTests.class
    })
public class AllTests {
    
    /**
     * Method for handling reasoning result.
     * @param expectedFailedConstraints Number of constraints that are expected to fa
     * @param projectP1 Project to reason on.
     */
    public static void resultHandler(int expectedFailedConstraints, Project projectP1) {
        Configuration config = new Configuration(projectP1, false);        
        ReasonerConfiguration rConfig = new ReasonerConfiguration();

        // Perform reasoning
        Engine engine = new Engine(projectP1, config, rConfig, ProgressObserver.NO_OBSERVER);
        ReasoningResult result = engine.reason();
        
        // Test whether reasoning detected correct result  
        int failedConstraints = 0;
        for (int i = 0; i < result.getMessageCount(); i++) {
            if (result.getMessage(i).getStatus() == Status.ERROR) {
                failedConstraints = failedConstraints + result.getMessage(i).getConflicts().size();
            }
        }
        Assert.assertEquals("Failed constraints: ", expectedFailedConstraints, failedConstraints);
    }  

    
    /**
     * Helper method for load an IVML file.
     * @param testFolder The (sub-) folder where to load the specified IVML test files.
     * @param path The name of the ivml file to load (including the file extension) inside of the
     *     <tt>reasonerModel</tt> folder.
     * @return The loaded {@link Project} representing the read IVML file.
     */
    public static final Project loadProject(File testFolder, String path) {
        Project project = null;
        try {
            File projectFile = new File(testFolder, path);
            URI uri = URI.createFileURI(projectFile.getAbsolutePath());
            TranslationResult<Project> result = ModelUtility.INSTANCE.parse(uri);
            StringBuffer errorMsg = new StringBuffer();
            for (int i = 0; i < result.getMessageCount(); i++) {
                Message msg = result.getMessage(i);
                if (!msg.ignore()) {
                    errorMsg.append(msg.getDescription());
                    errorMsg.append("\n");
                }
            }
            if (errorMsg.length() == 0) {
                project = result.getResult(0);
            } else {
                Assert.fail(errorMsg.toString());
            }
            Assert.assertNotNull("Error: The loaded project " + path + " is NULL (should not happen)", project);
            VarModel.INSTANCE.updateModel(project, projectFile.toURI());
        } catch (IOException exc) {
            Assert.fail(exc.getLocalizedMessage());
        }
        
        return project;
    }
}