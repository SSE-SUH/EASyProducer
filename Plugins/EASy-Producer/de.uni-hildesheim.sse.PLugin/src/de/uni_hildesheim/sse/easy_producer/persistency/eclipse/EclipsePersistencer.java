package de.uni_hildesheim.sse.easy_producer.persistency.eclipse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import de.uni_hildesheim.sse.easy_producer.persistence.PersistenceException;
import de.uni_hildesheim.sse.easy_producer.persistence.PersistenceUtils;
import de.uni_hildesheim.sse.easy_producer.persistence.datatypes.IPersistencer;
import de.uni_hildesheim.sse.easy_producer.persistence.datatypes.IProjectCreationResult;
import de.uni_hildesheim.sse.easy_producer.persistence.datatypes.PathEnvironment;
import de.uni_hildesheim.sse.easy_producer.persistence.datatypes.PersistentProject;
import de.uni_hildesheim.sse.easy_producer.persistence.mgmt.PLPInfo;
import de.uni_hildesheim.sse.easy_producer.persistence.standard.Persistencer;
import de.uni_hildesheim.sse.model.management.VarModel;
import de.uni_hildesheim.sse.model.varModel.Project;
import de.uni_hildesheim.sse.model.varModel.ProjectImport;
import de.uni_hildesheim.sse.persistency.IVMLWriter;
import de.uni_hildesheim.sse.utils.progress.ProgressObserver;

/**
 * This class represents an interlayer between persistency-layer and model. It provides functions
 * for loading a model from the storage or saving it to storage. Therefore it performs a conversion
 * between the persistency model and the application model.
 * This EclipsePersistencer can be used if the whole eclipse infrastructure is available.
 * The another Persistencer can be used if Eclipse shall not be loaded/used.
 * 
 * @author El-Sharkawy
 */
public class EclipsePersistencer implements IPersistencer {
    //TODO Use ResourcesMgmt here
    public static final File WORKSPACE_FOLDER;
    
    static {
        File wsFolder = null;
        try {
            IWorkspace ws = ResourcesPlugin.getWorkspace();
            wsFolder = ws.getRoot().getLocation().toFile();
        } catch (IllegalStateException exc) {
            // Not needed
        }
        WORKSPACE_FOLDER = wsFolder;
    }
    
    
    private Persistencer persistencer;
    private IProgressMonitor monitor;
    private IProject project;
    private File projectFolder;
   
    /**
     * Creates a new Persistencer instance for a project with the specified name. This project must/will be stored
     * directly into the workspace (no linking supported). If the project shall not be stored directly into the
     * workspace, than please use the other constructor.
     * @param projectName The name of the project (which must be stored inside the workspace).
     * @param monitor A progress monitor, or <tt>null</tt> if progress reporting is not desired
     */
    public EclipsePersistencer(String projectName, IProgressMonitor monitor) {
        this(new File(WORKSPACE_FOLDER, projectName), monitor);
    }
    
    /**
     * This constructor can be used if a project shall be/is stored outside the workspace (e.g. is only linked).
     * @param projectFolder The top level folder of the project.
     * @param monitor A progress monitor, or <tt>null</tt> if progress reporting is not desired
     */
    public EclipsePersistencer(File projectFolder, IProgressMonitor monitor) {
        this.projectFolder = projectFolder;
        String projectName = projectFolder.getName();
        project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
        PathEnvironment pathEnv = PathEnvironmentFactory.createPathEnvironment(project);
        File projectFolder2 = new File(pathEnv.getBaseFolder(), projectName);
        File storageFile = PersistenceUtils.getConfigLocationFile(projectFolder2);
        persistencer = new Persistencer(pathEnv, projectFolder2, 
            storageFile.getAbsolutePath(), ProgressObserver.NO_OBSERVER);
        if (null == monitor) {
            this.monitor = new NullProgressMonitor();
        } else {
            this.monitor = monitor;            
        }
    }

    /**
     * Creates an empty IProject inside the Eclipse workspace which is suitable for EASy.
     * @param projectID The unique ID of the project which should be created.
     * If <tt>null</tt> is inserted, a random ID will be generated
     * @param natures Additional natures which shall be added to the newly created IProject.
     * @param lazy if <code>true</code>, create only required parts, else assume that project does not exist before
     * @throws PersistenceException Will be thrown if the System cannot create folders and files in the parentFolder.
     * @throws CoreException If Eclipse cannot create a new IProject, e.g. because a project with the desired
     * name already exists
     * @return An data object which holds information about newly created files, folders, and the IProject.
     */
    private EclipseProjectCreationResult createEASyEclipseProject(String projectID, boolean lazy, String... natures)
        throws PersistenceException, CoreException {
        
        if (null == projectID) {
            projectID = UUID.randomUUID().toString();
        }
        
        // Create folder and files
        IPath folder = ResourcesPlugin.getWorkspace().getRoot().getLocation();
        if (null != project.getLocation()) {
            folder = project.getLocation().removeLastSegments(1);
        }
        IProjectCreationResult result = createProject(project.getName(), folder.toFile(), projectID, lazy);
        
        // Create eclipse project 
        if (!lazy) {
            project.create(new SubProgressMonitor(monitor, 1));
        }
        project.open(new SubProgressMonitor(monitor, 1));
        
        // Add natures
        if (!NatureUtils.hasNature(project, EASyNature.XTEXT_NATURE_ID)) {
            NatureUtils.addNature(project, EASyNature.XTEXT_NATURE_ID, monitor);
        }
        if (!NatureUtils.hasNature(project, EASyNature.NATURE_ID)) {
            NatureUtils.addNature(project, EASyNature.NATURE_ID, monitor);
        }
        
        return new EclipseProjectCreationResult(result, project);
    }
    
    /**
     * Creates an empty IProject inside the Eclipse workspace which is suitable for EASy.
     * @param projectID The unique ID of the project which should be created.
     * If <tt>null</tt> is inserted, a random ID will be generated
     * @param lazy if <code>true</code>, create only required parts, else assume that project does not exist before
     * @param natures Additional natures which shall be added to the newly created IProject.
     * @throws PersistenceException Will be thrown if the System cannot create folders and files in the parentFolder.
     * @throws CoreException If Eclipse cannot create a new IProject, e.g. because a project with the desired
     * name already exists
     * @return An data object which holds information about newly created files, folders, and the IProject.
     */
    public IEclipseProjectCreationResult createEASyProject(String projectID, boolean lazy, String... natures)
        throws PersistenceException, CoreException {
        
        IEclipseProjectCreationResult result = createEASyEclipseProject(projectID, lazy, natures);
        ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IWorkspaceRoot.DEPTH_INFINITE, monitor);
        
        return result;
    }
    
    /**
     * Creates an empty IProject inside the Eclipse workspace which is suitable for EASy.
     * @param projectID The unique ID of the project which should be created.
     * If <tt>null</tt> is inserted, a random ID will be generated
     * @param varModel An already existing varmodel, which should be integrated into the newly created project.
     * @param natures Additional natures which shall be added to the newly created IProject.
     * @throws PersistenceException Will be thrown if the System cannot create folders and files in the parentFolder.
     * @throws CoreException If Eclipse cannot create a new IProject, e.g. because a project with the desired
     * name already exists
     * @return An data object which holds information about newly created files, folders, and the IProject.
     * Contrary to the {@link #createEASyProject(String, boolean, String...)} method, the
     * {@link IEclipseProjectCreationResult#getVarModelProjectPath()} will return the location of the created file for
     * the given varModel.
     */
    public IEclipseProjectCreationResult createEASyProject(String projectID, Project varModel,
        String... natures) throws PersistenceException, CoreException {
        
        EclipseProjectCreationResult result = createEASyEclipseProject(projectID, false, natures);
        Project projectModel = result.getVarModel();
        if (null != projectModel && null != varModel) {
            String modelPath = PersistenceUtils.ivmlFileLocation(varModel, result.getConfigFolder().getAbsolutePath());
            File varModelLocation = new File(modelPath);
            if (varModelLocation.exists()) {
                try {
                    varModelLocation.createNewFile();
                } catch (IOException e) {
                    throw new PersistenceException(e);
                }
            }
            try {
                // Save given project
                FileWriter fWriter = new FileWriter(varModelLocation);
                IVMLWriter ivmlWriter = new IVMLWriter(fWriter);
                varModel.accept(ivmlWriter);
                ivmlWriter.flush();
                fWriter.close();
                
                // Register new project
                VarModel.INSTANCE.updateModel(varModel, varModelLocation.toURI());

                // Add Import and save created project.
                ProjectImport pi = new ProjectImport(varModel.getName(), null);
                projectModel.addImport(pi);
                fWriter = new FileWriter(result.getVarModelProjectPath());
                ivmlWriter = new IVMLWriter(fWriter);
                projectModel.accept(ivmlWriter);
                ivmlWriter.flush();
                fWriter.close();
                
                // Update project and resolve import(s)
                VarModel.INSTANCE.updateModel(projectModel, result.getVarModelProjectPath().toURI());
                
                // Save location of the newly created file of the given varModel.
                result.setVarModelProjectPath(varModelLocation);           
            } catch (IOException e) {
                throw new PersistenceException(e);
            }
        }
        
        ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IWorkspaceRoot.DEPTH_INFINITE, monitor);
        return result;
    }

    @Override
    public PersistentProject load() throws PersistenceException {
        PersistentProject pProject =  persistencer.load();
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectFolder.getName());
        if (null != project) {
            pProject.setName(project.getName());
        }
        
        return pProject;
    }

    @Override
    public void save(PLPInfo plp) throws PersistenceException {
        persistencer.save(plp);
    }

    @Override
    public IProjectCreationResult createProject(String projectName, File parentFolder, String projectID, boolean lazy)
        throws PersistenceException {
        return persistencer.createProject(projectName, parentFolder, projectID, lazy);        
    }

    @Override
    public String getProjectID() {
        return persistencer.getProjectID();
    }
    
    @Override
    public void update() throws PersistenceException {
        persistencer.update();
    }
    
    @Override
    public PathEnvironment getPathEnvironment() {
        return persistencer.getPathEnvironment();
    }

}
