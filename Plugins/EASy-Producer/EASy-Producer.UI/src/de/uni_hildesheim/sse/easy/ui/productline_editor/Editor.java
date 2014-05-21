package de.uni_hildesheim.sse.easy.ui.productline_editor;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorPart;

import de.uni_hildesheim.sse.easy.ui.contributions.Contributions;
import de.uni_hildesheim.sse.easy.ui.contributions.Contributions.UIElement;
import de.uni_hildesheim.sse.easy.ui.core.contributions.ExternalEditor;
import de.uni_hildesheim.sse.easy.ui.productline_editor.configuration.AttributeValuesPage;
import de.uni_hildesheim.sse.easy.ui.productline_editor.configuration.ConfigurationPage;
import de.uni_hildesheim.sse.easy.ui.productline_editor.instantiator.InstantiatorConfigPage;
import de.uni_hildesheim.sse.easy.ui.productline_editor.project_configuration.ProjectConfigurationPage;
import de.uni_hildesheim.sse.easy_producer.core.mgmt.IProductLineProjectListener;
import de.uni_hildesheim.sse.easy_producer.core.persistence.PersistenceUtils;
import de.uni_hildesheim.sse.easy_producer.core.varMod.container.SemanticErrorDescription;
import de.uni_hildesheim.sse.easy_producer.model.ProductLineProject;
import de.uni_hildesheim.sse.easy_producer.persistency.ResourcesMgmt;

/**
 * Multipage editor for editing and configuring one product line project.
 * @author El-Sharkawy
 *
 */
public class Editor extends MultiPageEditorPart implements Observer, IPropertyListener, IEASyPageListener,
    IProductLineProjectListener {
    
    private static final Set<IEASyEditorPageCreator> SPECIALIZED_EDITOR_PAGES =
        new HashSet<IEASyEditorPageCreator>();
    
    private ProductLineProject plp;
    private boolean isDirty;
    private List<AbstractEASyEditorPage> pages;
    
    /**
     * Sole constructor for this class.
     */
    public Editor() {
        isDirty = false;
        pages = new ArrayList<AbstractEASyEditorPage>();
    }
    
    @Override
    public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
        if (!(editorInput instanceof ProductLineEditorInput)) {
            throw new PartInitException("Invalid Input: Must be ProductLineEditorInput");
        }
        
        setPartName(editorInput.getName());

        // set currentPTNID from the current Project-ID
        ProductLineEditorInput input = (ProductLineEditorInput) editorInput;
        plp = input.getPLP();
        plp.registerObserver(this);
        plp.register(this);

        super.init(site, editorInput);
        isDirty = false;
        
        List<SemanticErrorDescription> parsingErrors = plp.getParsingExceptions();
        if (!parsingErrors.isEmpty()) {
            StringBuffer errorMessage = new StringBuffer("Error(s) detected during parsing the configuration files:");
            for (int i = 0; i < parsingErrors.size(); i++) {
                SemanticErrorDescription description = parsingErrors.get(i);
                errorMessage.append("\n - File: ");
                errorMessage.append(description.getLocation());
                errorMessage.append("\n   o ");
                errorMessage.append(description.getDescription());
            }
            errorMessage.append("\n\nPlease correct this problem before (re-)opening the Product Line Editor");
            EasyProducerDialog.showErrorDialog(errorMessage.toString());
        }
    }

    @Override
    protected void createPages() {
        pages.add(new ProjectConfigurationPage(plp, getContainer()));
        pages.add(new ConfigurationPage(plp, getContainer()));
        pages.add(new InstantiatorConfigPage(getContainer(), plp));
        if (Contributions.isEnabled(UIElement.ATTRIBUTES_VALUE_PAGE)) {
            pages.add(new AttributeValuesPage(plp, getContainer()));
        }
        
        /*
         * Add editors from extension plug-ins
         */
        for (IEASyEditorPageCreator pageCreator : SPECIALIZED_EDITOR_PAGES) {
            AbstractEASyEditorPage page = pageCreator.createPage(plp, getContainer());
            if (null != page) {
                pages.add(page);
            }
        }
        
        
        for (int i = 0; i < pages.size(); i++) {
            AbstractEASyEditorPage page = pages.get(i);
            int index = addPage(page);
            setPageText(index, page.getPageText());
            addPageChangedListener(page);
            addPropertyListener(page);
            page.register(this);
        }
        
        File file = new File(PersistenceUtils.ivmlFileLocation(
            plp.getProject(), plp.getConfigLocation().getAbsolutePath()));
        if (file.exists()) {
            URI uri = file.toURI();
            if (ExternalEditor.providesEditorFor(uri)) {
                Composite editorComposite = new Composite(getContainer(), SWT.BORDER);
                editorComposite.setLayout(new FillLayout());
                
                if (ExternalEditor.embedEditor(uri, editorComposite)) {
                    addPage(1, editorComposite);
                    setPageText(1, "IVML model");
                }
            }
        }
    }
    
    @Override
    public void dispose() {
        for (int i = 0; i < pages.size(); i++) {
            pages.get(i).dispose();
        }
        super.dispose();
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
        doSaveAs();
    }

    @Override
    public void doSaveAs() {
        if (isDirty && plp.isSaveable()) {
            plp.save();
            ResourcesMgmt.INSTANCE.refreshProject(plp.getProjectName());
            isDirty = false;
            firePropertyChange(PROP_DIRTY);
        }
    }

    @Override
    public boolean isSaveAsAllowed() {
        return true;
    }

    @Override
    public void update(Observable obs, Object arg) {
        isDirty = true;
        firePropertyChange(PROP_DIRTY);
    }
    
    @Override
    public boolean isDirty() {
        return isDirty;
    }

    @Override
    public void propertyChanged(Object source, int propId) {
        isDirty = true;
        firePropertyChange(PROP_DIRTY);
    }

    @Override
    public void pageBecomesDirty(AbstractEASyEditorPage page) {
        update(null, null);
    }

    @Override
    public void configurationPulled() {
        isDirty = true;
        firePropertyChange(PROP_DIRTY);
    }

    @Override
    public void projectClosed() {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                
                page.activate(Editor.this);
                page.closeEditor(Editor.this, false);
            }
        });
    }

    /**
     * Registers a {@link IEASyEditorPageCreator} from an extension plug-in to this class.
     * New instances of this editor will now also create a nested page for the editor of the given
     * {@link IEASyEditorPageCreator}. This method should be called during the startup of eclipse and
     * before the first editor was opened.
     * 
     * @param pageCreator A {@link IEASyEditorPageCreator} of a extension plug-in which provides
     *     a new {@link AbstractEASyEditorPage}.
     */
    public static void registerNewPage(IEASyEditorPageCreator pageCreator) {
        if (null == pageCreator) {
            throw new IllegalArgumentException("null");
        }
        SPECIALIZED_EDITOR_PAGES.add(pageCreator);
    }

    @Override
    public void buildScriptChanged() {
        //No operation needed.
    }
}
