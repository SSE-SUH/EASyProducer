package test.de.uni_hildesheim.sse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import net.ssehub.easy.basics.modelManagement.ModelManagementException;
import net.ssehub.easy.basics.progress.ProgressObserver;
import net.ssehub.easy.varModel.management.VarModel;
import net.ssehub.easy.varModel.model.Project;
import net.ssehub.easy.varModel.persistency.IVMLWriter;

/**
 * Tests model management functions in {@link VarModel} which require
 * the Model Loader provided by IVML.
 *  
 * @author Sascha El-Sharkawy
 * @author Holger Eichelberger
 */
public class VarModelTests extends AbstractTest {

    /**
     * Test whether the Varmodel.updateProjectInformation() method works correctly.
     * 
     * @throws IOException Occurs if files cannot be written into temp location of the OS.
     * @throws ModelManagementException If the {@link VarModel#updateModelInformation(File, ProgressObserver)} 
     *     has an error
     */
    @Test
    public void testUpdateProjectInformation() throws IOException, ModelManagementException {
        // Save precondition
        int projectCount = VarModel.INSTANCE.getModelCount();
        int locationCount = VarModel.INSTANCE.locations().getLocationCount();
        int infoCount = VarModel.INSTANCE.availableModels().getModelInfoCount(true);
        
        // Create one new Project for testing and save it in temp location
        String projectName = "Project_4_testUpdateProjectInformation";
        Project project = new Project(projectName);
        // create tmp folder otherwise all temp files will be considered. In case of existing IVML files,
        // this may lead to wrong infoCount at the end (due to ScaleLog.reasoningServer-tmp)
        File tmpFolder = File.createTempFile(projectName, ".ivml");
        tmpFolder.delete();
        tmpFolder.mkdirs();
        File ivmlFile = new File(tmpFolder, projectName + ".ivml");
        FileWriter fileWriter = new FileWriter(ivmlFile);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        IVMLWriter writer = new IVMLWriter(bufWriter);
        project.accept(writer);
        bufWriter.flush();
        bufWriter.close();
        
        // Project/LocationCount must not be changed
        Assert.assertEquals(projectCount, VarModel.INSTANCE.getModelCount());
        Assert.assertEquals(locationCount, VarModel.INSTANCE.locations().getLocationCount());
        Assert.assertEquals(infoCount, VarModel.INSTANCE.availableModels().getModelInfoCount(true));

        // PROBLEM: this test can never work as the loader instance is not configured!
        File destFolder = ivmlFile.getParentFile();
        // add the destination folder as location as otherwise models are not loaded
        VarModel.INSTANCE.locations().addLocation(destFolder, ProgressObserver.NO_OBSERVER);
        // Update ProjectInformation
        try {
            VarModel.INSTANCE.updateModelInformation(destFolder, ProgressObserver.NO_OBSERVER);
        } catch (NullPointerException npe) {
            Assert.fail("Unexpected NullpointerException occured while updating project information");
        }
        
        // project count must not be incremented as the project was not loaded!
        Assert.assertEquals(projectCount, VarModel.INSTANCE.getModelCount());
        // Test: ProjectInfo/LocationCount should be incremented by one
        Assert.assertEquals(++locationCount, VarModel.INSTANCE.locations().getLocationCount());
        // unclear
        Assert.assertEquals(++infoCount, VarModel.INSTANCE.availableModels().getModelInfoCount(true));
        
        ivmlFile.delete();
        tmpFolder.delete();
    }
    
}
