package de.uni_hildesheim.sse.reasoning.capabilities;


import java.io.File;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_hildesheim.sse.ModelUtility;
import de.uni_hildesheim.sse.dslCore.StandaloneInitializer;
import de.uni_hildesheim.sse.model.management.VarModel;
import de.uni_hildesheim.sse.model.varModel.Project;
import de.uni_hildesheim.sse.model.varModel.ProjectImport;
import de.uni_hildesheim.sse.utils.modelManagement.ModelManagementException;
import de.uni_hildesheim.sse.utils.progress.ProgressObserver;

/**
 * Attribute tests.
 * 
 * @author Sizonenko
 * @author El-Sharkawy
 */
public class AttributeTests extends  de.uni_hildesheim.sse.reasoning.AbstractTest {

    private static final File FOLDER = new File(TESTDATA, "attributes");
    
    /**
     * Initializes this Test class.
     */
    @BeforeClass
    public static void setUpBeforeClass() {
        ModelUtility.setResourceInitializer(new StandaloneInitializer());
        try {
            VarModel.INSTANCE.locations().addLocation(FOLDER, ProgressObserver.NO_OBSERVER);
        } catch (ModelManagementException e) {
            Assert.fail("Could not add location of test files.");
        }
    }
    
    /**
     * Frees the memory after testing.
     */
    @AfterClass
    public static void tearDownAfterClass() {
        try {
            VarModel.INSTANCE.locations().removeLocation(FOLDER, ProgressObserver.NO_OBSERVER);
        } catch (ModelManagementException e) {
            Assert.fail("Could not remove location of test files.");
        }
    }
    
    /**
     * Helper method for load an IVML file.
     * @param path The name of the ivml file to load (including the file extension) inside of the
     *     <tt>reasonerModel</tt> folder.
     * @return The loaded {@link Project} representing the read IVML file.
     */
    private Project loadProject(String path) {
        return loadProject(FOLDER, path);
    }
    
    /**
     * Method to test whether different types of variables and constraints could be translated correctly
     * into rules and reasoned on without any errors. 
     * @param ivmlFile IVML file to translate and reason on.
     * @param expectedFailedConstraints Number of constraints that are expected to fail.
     */        
    public void reasoningTest(String ivmlFile, int expectedFailedConstraints) {
        Project project = loadProject(ivmlFile);
        resultHandler(expectedFailedConstraints, project);
    }   
    
    /**
     * Method to test whether different types of variables and constraints could be translated correctly
     * into rules and reasoned on without any errors. 
     * @param p0 IVML file to translate and reason on.
     * @param p1 IVML file to translate and reason on.
     * @param expectedFailedConstraints Number of constraints that are expected to fail.
     */        
    public void reasoningTest(String p0, String p1, int expectedFailedConstraints) {
        Project projectP0 = loadProject(p0);
        Project projectP1 = loadProject(p1);
        ProjectImport importP0 = new ProjectImport(projectP0.getName(), null);
        projectP1.addImport(importP0);
        resultHandler(expectedFailedConstraints, projectP1);
    }
    
    /**
     * Assign attribute with a default value to the project test.
     */
    @Test    
    public void defaultAssign() {
        reasoningTest("DefaultAssign.ivml", 0);
    }
    
    /**
     * Assign attribute with a default value to the project test.
     */
    @Test    
    public void blockAssign() {
        reasoningTest("BlockAssign.ivml", 0);
    }
    
    /**
     * Assign attribute with a default value to the project test.
     */
    @Test    
    public void individualAssign() {
        reasoningTest("IndividualAssign.ivml", 0);
    }

    /**
     * Assign attribute with a default value to the project test.
     */
    @Test    
    public void blockAssignNested() {
        reasoningTest("BlockAssignNested.ivml", 0);
    }
    
    /**
     * Assign attribute with a default value to the project test.
     */
    @Test    
    public void blockAssignNestedNested() {
        reasoningTest("BlockAssignNestedNested.ivml", 0);
    }
    
    /**
     * Assign attribute with a default value to the project test. Test includes a 
     * constraint in the attribute assignment.
     */
    @Test    
    public void blockAssignNestedConstraint() {
        reasoningTest("BlockAssignNestedConstraint.ivml", 0);
    }
    
    /**
     * Assign attribute with a default value to the project test. Test includes a 
     * failing constraint in the attribute assignment.
     */
    @Test    
    public void blockAssignNestedConstraintFail() {
        reasoningTest("BlockAssignNestedConstraintFail.ivml", 1);
    }
    
    /**
     * Assign attribute with a default value to the project test.
     */
    @Test    
    public void individualAssignNested() {
        reasoningTest("IndividualAssignNested.ivml", 0);
    } 
    
    /**
     * Assign attribute with a default value to the project test.
     */
    @Test    
    public void nestedAssignBlockTree() {
        reasoningTest("NestedAssignBlockTree.ivml", 2);
    }    
  
}
