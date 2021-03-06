package net.ssehub.easy.producer.core.persistence.standard;

import java.io.File;

import net.ssehub.easy.instantiation.core.model.buildlangModel.Script;
import net.ssehub.easy.producer.core.persistence.PersistenceUtils;
import net.ssehub.easy.producer.core.persistence.Configuration.PathKind;
import net.ssehub.easy.producer.core.persistence.datatypes.IProjectCreationResult;
import net.ssehub.easy.varModel.model.Project;

/**
 * Result of {@link Persistencer#createProject(String, File, String, boolean)}.
 * @author El-Sharkawy
 *
 */
public class ProjectCreationResult implements IProjectCreationResult {

    private File projectFolder;
    
    private String projectID;
    
    private File varModelProjectLocation;
    
    private Project varModel;
    
    private Script mainBuildScript;
    
    /**
     * Sole constructor for this class.
     * @param projectFolder The location of the newly created project.
     * @param projectID The ID of the newly created project.
     * @param varModelProjectLocation The location of the (ivml) project file.
     * @param varModel The variability model of the newly created project.
     * @param mainBuildScript The main build script decriping how to instanciate the whole project.
     */
    public ProjectCreationResult(File projectFolder, String projectID, File varModelProjectLocation, Project varModel,
        Script mainBuildScript) {
        
        this.projectFolder = projectFolder;
        this.projectID = projectID;
        this.varModelProjectLocation = varModelProjectLocation;
        this.varModel = varModel;
        this.mainBuildScript = mainBuildScript;
    }

    @Override
    public final File getProjectFolder() {
        return projectFolder;
    }

    @Override
    public final String getProjectID() {
        return projectID;
    }

    @Override
    public final File getVarModelProjectPath() {
        return varModelProjectLocation;
    }
    
    /**
     * Setter for the varModelProjectLocation.
     * This method should only be used by sub classes.
     * @param varModelProjectLocation The new location of the varModel.
     */
    protected void setVarModelProjectPath(File varModelProjectLocation) {
        this.varModelProjectLocation = varModelProjectLocation;
    }

    @Override
    public Project getVarModel() {
        return varModel;
    }

    @Override
    public File getConfigFolder() {
        return PersistenceUtils.getLocationFile(getProjectFolder(), PathKind.IVML);
    }

    @Override
    public Script getBuildScript() {
        return mainBuildScript;
    }
}
