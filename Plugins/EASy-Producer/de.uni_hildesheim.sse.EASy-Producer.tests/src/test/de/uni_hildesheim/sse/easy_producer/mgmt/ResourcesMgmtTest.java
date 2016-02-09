package test.de.uni_hildesheim.sse.easy_producer.mgmt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_hildesheim.sse.easy_producer.core.persistence.standard.PersistenceConstants;
import de.uni_hildesheim.sse.easy_producer.persistency.ResourcesMgmt;
import de.uni_hildesheim.sse.easy_producer.persistency.eclipse.EASyNature;
import de.uni_hildesheim.sse.easy_producer.persistency.eclipse.NatureUtils;
import de.uni_hildesheim.sse.easy_producer.persistency.project_creation.InvalidProjectnameException;
import test.AllTests;

/**
 * Tests the ResourcesMgmt and its functions. NOT WORKING RIGHT NOW!
 * 
 * @author Pastuschek
 * @author El-Sharkawy
 * 
 */
public class ResourcesMgmtTest {

    /**
     * Lists of Eclipse Projects loaded within this test class.
     */
    public static final Set<String> LOADED_PROJECTS = new HashSet<String>();
    private static boolean projectsImported = false;
    
    private static File[] childs;
    private ResourcesMgmt mgmt = ResourcesMgmt.INSTANCE;

    /**
     * Preparation before testing.
     */
    @BeforeClass
    public static void setUpBeforeClass() {

        if (!projectsImported) {
            AllTests.setUpBeforeClass();
            
            if (AllTests.TESTDATA_DIR_COPY.isDirectory()) {
                childs = AllTests.TESTDATA_DIR_COPY.listFiles();
            }
    
            if (null != childs) {
                for (int i = 0; i < childs.length; i++) {
                    copyIntoWorkspace(childs[i]);
    
                }
            } else {
                Assert.fail("Could not load testdata directory.");
            }
            
            projectsImported = true;
        }
    }

    /**
     * Tests the {@link ResourcesMgmt#isPLPInWorkspace(String)} and the {@link ResourcesMgmt#findPLProjects()} methods.
     */
    @Test
    public void testIsPLPInWorkspace() {

        ResourcesMgmt.INSTANCE.findPLProjects();
        System.out.println("MANAGER WORKSPACE: " + mgmt.getWorkspace().getRoot().getLocation());

        IProject[] projects = mgmt.getAllProjects();
        System.out.println("NUMBER OF PROJECTS FOUND: " + projects.length);
        for (int i = 0; i < projects.length; i++) {
            System.out.println(i + ": " + projects[i].getName());
        }

        IProject test = mgmt.getProject("PL_1");

        System.out.println();
        System.out.println("Existing.: " + test.exists());
        System.out.println("Open: " + test.isOpen());

        Assert.assertFalse(mgmt.isPLPInWorkspace("notThere"));
        // Assert.assertTrue(mgmt.isPLPInWorkspace("PL_1"));

    }
    
    /**
     * Tests whether an arbitrary Eclipse project can be turned into an EASy project.
     * @throws CoreException if test project does not exist or is not open
     * @throws InvalidProjectnameException Must not occur, otherwiese the test project has not an valid IVML identifier
     *   as name.
     * @throws IOException In case of loading/initialization problems
     */
    @Test
    public void testAddEASyNatures() throws CoreException, InvalidProjectnameException, IOException {
        String projectName = "NonEASyProject";
        
        // Retrieve Project for testing and test that it has NOT any EASy related information
        IProject project = ResourcesMgmt.INSTANCE.getProject(projectName);
        project.create(null);
        project.open(null);
        LOADED_PROJECTS.add(project.getName());
        File projectLocation = ResourcesMgmt.INSTANCE.getProjectLocation(projectName);
        Assert.assertNotNull(project);
        Assert.assertNotNull(projectLocation);
        Assert.assertTrue(projectLocation.exists());
        File easyFolder = new File(projectLocation, PersistenceConstants.EASY_FILES_DEFAULT);
        Assert.assertNotNull(easyFolder);
        Assert.assertFalse(easyFolder.exists());
        Assert.assertFalse(NatureUtils.hasNature(project, EASyNature.XTEXT_NATURE_ID, EASyNature.NATURE_ID));
        Assert.assertFalse(mgmt.isPLPInWorkspace(projectName));
        
        // Transform project into EASy-Project
        ResourcesMgmt.INSTANCE.addEASyNatures(project, EASyNature.XTEXT_NATURE_ID, EASyNature.NATURE_ID);
        
        // Test post condition: Check whether the the project has the nature and whether the IVML/VIL files are created.
        Assert.assertNotNull(project);
        Assert.assertNotNull(projectLocation);
        Assert.assertTrue(projectLocation.exists());
        Assert.assertNotNull(easyFolder);
        Assert.assertTrue(easyFolder.exists());
        Assert.assertTrue(NatureUtils.hasNature(project, EASyNature.XTEXT_NATURE_ID, EASyNature.NATURE_ID));
        File[] files = easyFolder.listFiles();
        boolean ivmlFound = false;
        boolean vilFound = false;
        if (null != files) {
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                ivmlFound |=  (file.isFile() && file.getName().endsWith("ivml"));
                vilFound  |=  (file.isFile() && file.getName().endsWith("vil"));
            }
        } else {
            Assert.fail("No variability information (IVML / VIL) was created in \"" + easyFolder.getAbsolutePath()
                + "\".");
        }
        Assert.assertTrue("No IVML file was created in \"" + easyFolder.getAbsolutePath() + "\".", ivmlFound);
        Assert.assertTrue("No VIL file was created in \"" + easyFolder.getAbsolutePath() + "\".", vilFound);
        Assert.assertTrue(mgmt.isPLPInWorkspace(projectName));
    }

    /**
     * Helping method for testing: copies projects into eclipse's workspace.
     * @param file A Folder where the contents should be copied into the workspace.
     */
    private static void copyIntoWorkspace(File file) {

        InputStream in = null;
        OutputStream out = null;
        File[] childs = null;

        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        String relativePath = AllTests.TESTDATA_DIR_COPY.toURI().relativize(file.toURI()).getPath();
        File target = new File(workspace.getRoot().getLocation().toOSString() + File.separator + relativePath);

        if (file.isDirectory()) {

            target.mkdirs();

            childs = file.listFiles();

            for (int i = 0; i < childs.length; i++) {
                copyIntoWorkspace(childs[i]);
            }

        } else {

            try {
                in = new FileInputStream(file.getPath());
                out = new FileOutputStream(target);
                System.out.println("COPY FILE:" + target.getAbsolutePath());
            } catch (FileNotFoundException noFileException) {
                // TODO Auto-generated catch block
                noFileException.printStackTrace();
            }

            try {

                byte[] buf = new byte[1024];
                int len;

                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }

                in.close();
                out.close();

            } catch (IOException ioException) {

                ioException.printStackTrace();

            }

        }

    }

}
