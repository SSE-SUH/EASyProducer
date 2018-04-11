/*
 * Copyright 2009-2015 University of Hildesheim, Software Systems Engineering
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ssehub.easy.reasoning.core.reasoner;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import de.uni_hildesheim.sse.ModelUtility;
import net.ssehub.easy.basics.messages.Status;
import net.ssehub.easy.basics.modelManagement.ModelManagementException;
import net.ssehub.easy.basics.progress.ProgressObserver;
import net.ssehub.easy.dslCore.StandaloneInitializer;
import net.ssehub.easy.dslCore.TranslationResult;
import net.ssehub.easy.dslCore.translation.Message;
import net.ssehub.easy.varModel.confModel.Configuration;
import net.ssehub.easy.varModel.management.VarModel;
import net.ssehub.easy.varModel.model.Project;
import net.ssehub.easy.varModel.model.ProjectImport;

/**
 * General abstract test class for reusable reasoning tests.
 * 
 * @author Sizonenko
 * @author El-Sharkawy
 * @author Eichelberger
 */
public abstract class AbstractTest extends net.ssehub.easy.dslCore.test.AbstractTest<Project> {

    private ITestDescriptor descriptor;
    private String testPath;
    
    /**
     * Creating a test instance.
     * 
     * @param descriptor the test descriptor
     * @param testPath the test path (empty or null means do not try to load models)
     */
    protected AbstractTest(ITestDescriptor descriptor, String testPath) {
        this.descriptor = descriptor;
        this.testPath = testPath;
    }
    
    /**
     * Returns the testdata folder.
     * 
     * @return the testdata folder
     */
    public File getTestdataBase() {
        return determineTestDataFolder(descriptor.getSystemProperty());
    }
    
    /**
     * Creates a reasoner instance through {@link #descriptor}.
     * 
     * @return the reasoner instance
     */
    protected IReasoner createReasoner() {
        return descriptor.createReasoner();
    }
    
    /**
     * Returns the path after testdata folder where the test files are located.
     * 
     * @return the path
     */
    protected String getTestPath() {
        return testPath;
    }

    /**
     * Returns the complete testdata folder.
     * 
     * @return the path
     */
    protected File getTestdata() {
        return new File(getTestdataBase(), getTestPath());
    }

    /**
     * Method for handling reasoning result, actually performing a propagation by default (due to legacy reasons).
     * 
     * @param expectedFailedConstraints Number of constraints that are expected to fail
     * @param expectedReevaluationCount expected number of constraint re-evaluations (ignored if negative)
     * @param projectP1 Project to reason on.
     * @return configuration (for further specific tests)
     */
    protected final Configuration resultHandler(int expectedFailedConstraints, int expectedReevaluationCount, 
        Project projectP1) {
        return assertPropagation(expectedFailedConstraints, expectedReevaluationCount, projectP1); // legacy
    }

    /**
     * Method for asserting a propagation.
     * 
     * @param expectedFailedConstraints Number of constraints that are expected to fail
     * @param expectedReevaluationCount expected number of constraint re-evaluations (ignored if negative)
     * @param projectP1 Project to reason on.
     * @return configuration (for further specific tests)
     * 
     * @see #debugConfigBeforeResultHandler(Configuration)
     */
    protected final Configuration assertPropagation(int expectedFailedConstraints, int expectedReevaluationCount, 
        Project projectP1) {
        Configuration config = new Configuration(projectP1, false);        
        ReasonerConfiguration rConfig = new ReasonerConfiguration();
        configureReasoner(rConfig);
        // Perform reasoning
        IReasoner reasoner = descriptor.createReasoner();
        ReasoningResult rResult = performReasoning(reasoner, projectP1, config, rConfig);
        debugConfigBeforeResultHandler(config);
        resultHandler(expectedFailedConstraints, expectedReevaluationCount, rResult);
        return config;
    }

    /**
     * Performs the reasoning.
     * 
     * @param reasoner the reasoner to use
     * @param project the project
     * @param config the configuration
     * @param rConfig the reasoner configuration
     * @return the reasoning result
     */
    protected ReasoningResult performReasoning(IReasoner reasoner, Project project, Configuration config, 
        ReasonerConfiguration rConfig) {
        return reasoner.propagate(project, config, rConfig, ProgressObserver.NO_OBSERVER);
    }

    /**
     * Allows to configure the reasoner configuration.
     * 
     * @param rConfig the configuration to change if needed
     */
    protected void configureReasoner(ReasonerConfiguration rConfig) {
    }
    
    /**
     * Called to enable debugging the configuration after reasoning but before asserting.
     * 
     * @param cfg the configuration to debug
     */
    protected void debugConfigBeforeResultHandler(Configuration cfg) {
    }
    
    /**
     * Method for handling a reasoning result.
     * @param expectedFailedConstraints Number of constraints that are expected to fail
     * @param expectedReevaluationCount expected number of constraint re-evaluations (ignored if negative)
     * @param result the reasoning result
     */
    protected static final void resultHandler(int expectedFailedConstraints, int expectedReevaluationCount, 
        ReasoningResult result) {
        // Test whether reasoning detected correct result  
        int failedConstraints = 0;
        for (int i = 0; i < result.getMessageCount(); i++) {
            if (result.getMessage(i).getStatus() == Status.ERROR) {
                failedConstraints = failedConstraints + result.getMessage(i).getConflicts().size();
            }
        }
        Assert.assertEquals("Failed constraints: ", expectedFailedConstraints, failedConstraints);

        if (expectedReevaluationCount > 0) {
            Number measure = result.getMeasure(GeneralMeasures.REEVALUATION_COUNT);
            if (null == measure) {
                Assert.fail("Reasoner does not provide measure " + GeneralMeasures.REEVALUATION_COUNT);
            } else {
                // Test whether reasoning is done in correct reevalustion steps  
                Assert.assertTrue("Reevaluation count mismatch. Result: " + measure.intValue()
                    + " Expected: " + expectedReevaluationCount, measure.intValue() == expectedReevaluationCount);
            }
        }
    }
    
    /**
     * Helper method for load an IVML file.
     * @param testFolder The (sub-) folder where to load the specified IVML test files.
     * @param path The name of the ivml file to load (including the file extension) inside of the
     *     <tt>reasonerModel</tt> folder.
     * @return The loaded {@link Project} representing the read IVML file.
     */
    protected final Project loadProject(File testFolder, String path) {
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
    
    /**
     * Helper method for load an IVML file.
     * @param path The name of the ivml file to load (including the file extension) inside of the
     *     <tt>reasonerModel</tt> folder.
     * @return The loaded {@link Project} representing the read IVML file.
     */
    protected Project loadProject(String path) {
        return loadProject(getTestdata(), path);
    }
    
    /**
     * Initializes this Test class.
     */
    @Before
    public void setUpBeforeClass() {
        startup();
    }
    
    /**
     * Frees the memory after testing.
     */
    @After
    public void tearDownAfterClass() {
        shutdown();
    }
    
    /**
     * Initializes this Test class.
     */
    public void startup() {
        descriptor.registerResoner();
        ModelUtility.setResourceInitializer(new StandaloneInitializer());
        if (null != testPath && testPath.length() > 0) {
            try {
                VarModel.INSTANCE.locations().addLocation(getTestdata(), ProgressObserver.NO_OBSERVER);
            } catch (ModelManagementException e) {
                Assert.fail("Could not add location of test files.");
            }
        }
    }
    
    /**
     * Frees the memory after testing.
     */
    protected void shutdown() {
        descriptor.unregisterReasoner();
        if (null != testPath && testPath.length() > 0) {
            try {
                VarModel.INSTANCE.locations().removeLocation(getTestdata(), ProgressObserver.NO_OBSERVER);
            } catch (ModelManagementException e) {
                Assert.fail("Could not remove location of test files.");
            }
        }
    }
    
    /**
     * Method to test whether different types of variables and constraints could be translated correctly
     * into rules and reasoned on without any errors. 
     * @param ivmlFile IVML file to translate and reason on.
     * @param expectedFailedConstraints Number of constraints that are expected to fail.
     * @param expectedReevaluationCount expected number of constraint re-evaluations (ignored if negative)
     * @return configuration (for further specific tests)
     */        
    public Configuration reasoningTest(String ivmlFile, int expectedFailedConstraints, int expectedReevaluationCount) {
        Project project = loadProject(ivmlFile);
        return resultHandler(expectedFailedConstraints, expectedReevaluationCount, project);
    }   
    
    /**
     * Method to test whether different types of variables and constraints could be translated correctly
     * into rules and reasoned on without any errors. 
     * @param ivmlFile IVML file to translate and reason on.
     * @param expectedFailedConstraints Number of constraints that are expected to fail.
     * @return configuration (for further specific tests)
     */        
    public Configuration reasoningTest(String ivmlFile, int expectedFailedConstraints) {
        return reasoningTest(ivmlFile, expectedFailedConstraints, -1);
    }

    /**
     * Method to test whether different types of variables and constraints could be translated correctly
     * into rules and reasoned on without any errors. 
     * @param p0 IVML file to translate and reason on.
     * @param p1 IVML file to translate and reason on.
     * @param expectedFailedConstraints Number of constraints that are expected to fail.
     * @return configuration (for further specific tests)
     */        
    protected Configuration reasoningTest(String p0, String p1, int expectedFailedConstraints) {
        Project projectP0 = loadProject(p0);
        Project projectP1 = loadProject(p1);
        ProjectImport importP0 = new ProjectImport(projectP0.getName(), null);
        projectP1.addImport(importP0);
        return resultHandler(expectedFailedConstraints, -1, projectP1);
    }
    
    /**
     * Method to test whether different types of variables and constraints could be translated correctly
     * into rules and reasoned on without any errors. 
     * @param p0 IVML file to translate and reason on.
     * @param p1 IVML file to translate and reason on.
     * @param p2 IVML file to translate and reason on.
     * @param expectedFailedConstraints Number of constraints that are expected to fail.
     * @return configuration (for further specific tests)
     */        
    protected Configuration reasoningTest(String p0, String p1, String p2, int expectedFailedConstraints) {
        Project projectP0 = loadProject(p0);
        Project projectP1 = loadProject(p1);
        Project projectP2 = loadProject(p2);
        ProjectImport importP0 = new ProjectImport(projectP0.getName(), null);
        projectP1.addImport(importP0);
        ProjectImport importP1 = new ProjectImport(projectP1.getName(), null);
        projectP2.addImport(importP1);
        return resultHandler(expectedFailedConstraints, -1, projectP2);
    }
    
    /**
     * Method for determining folder with IVML files.
     * @param property property
     * @return folder location
     */
    public static File determineTestDataFolder(String property) {
        File testdataFolder = determineTestDataDir(property);
        String externalLocation = System.getProperty(property);
        // If no property was defined, use ReasonerCore.test/testdata directory
        if (null == externalLocation) {
            // Work around over the path avoids a NullPointer exception
            String path = testdataFolder.getAbsolutePath();
            testdataFolder = new File(path);
            testdataFolder = testdataFolder.getParentFile().getParentFile();
            testdataFolder = new File(testdataFolder, "ReasonerCore.test");
            testdataFolder = new File(testdataFolder, "testdata");
        }
        if (!testdataFolder.exists()) {
            String path = testdataFolder.getAbsolutePath();
            testdataFolder = new File(path);
            testdataFolder = testdataFolder.getParentFile().getParentFile().getParentFile();
            testdataFolder = new File(testdataFolder, "ReasonerCore");
            testdataFolder = new File(testdataFolder, "ReasonerCore.test");
            testdataFolder = new File(testdataFolder, "testdata");
        }
        return testdataFolder;    
    }
    
}
