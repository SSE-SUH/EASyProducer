package net.ssehub.easy.dslCore.ui.editors;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.validation.MarkerCreator;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.DiagnosticConverterImpl;
import org.eclipse.xtext.validation.Issue;

import net.ssehub.easy.basics.logger.EASyLoggerFactory;
import net.ssehub.easy.basics.logger.EASyLoggerFactory.EASyLogger;
import net.ssehub.easy.dslCore.IResourceInitializer;
import net.ssehub.easy.dslCore.TranslationResult;
import net.ssehub.easy.dslCore.translation.Message;
import net.ssehub.easy.dslCore.validation.ValidationUtils;

/**
 * A common extension of the general <code>org.eclipse.xtext.ui.editor.XtextEditor</code>.
 * The extension hooks into the dispose- and the getDocument-mechanism in order to register
 * or unregister a <code>de.uni_hildesheim.sse.dslcore.ui.editors.AbstractModelChangeListener</code>
 * instance, which will update the editor if the underlying data model changes.
 * 
 * @param <T> the type of the top-level language element
 * @param <R> the model type corresponding to <code>T</code> 
 * @author kroeher
 * @author Holger Eichelberger
 */
public abstract class CommonXtextEditor <T extends EObject, R> extends org.eclipse.xtext.ui.editor.XtextEditor 
    implements IUpdatableEditor {

    /**
     * The listener which will be registered to this editor in order to receive
     * notifications about updates of the underlying model.
     */
    protected AbstractModelChangeListener modelListener;
    
    @Override
    public void dispose() {
        // Unregister the model listener from the underlying model
        if (modelListener != null) {
            modelListener.unregister();
        }
        super.dispose();
    }
    
    @Override
    public IXtextDocument getDocument() {
        IXtextDocument doc = super.getDocument();
        /*
         * If the underlying data model could not be found or resolved before (the listener is not listening),
         * try to build the model based on the document that is currently edited in the editor and register
         * this editor's listener again.
         */
        if (doc != null && modelListener != null && !modelListener.isListening()) {
            //System.out.println("[CommonXtextEditor]: getDocument() - doc available");
            modelListener.setXtextDocument(doc);
            modelListener.register(this);
        }
        return doc;
    }
    
    @Override
    public void updateEditor() {
        // run this for sure in the UI thread
        Display display = Display.getDefault();
        if (!display.isDisposed()) {
            display.asyncExec(new Runnable() {
                
                @Override
                public void run() {
                    try {
                        getResource().touch(getProgressMonitor());
                    } catch (CoreException e) {
                        System.err.println("[Error] Updating editor failed: " + this);
                        e.printStackTrace();
                    }
                }
            });
        }
    }
    
    @Override
    public void doSaveAs() {
        super.doSaveAs();
        onSave();
    }

    @Override
    public void doSave(IProgressMonitor progressMonitor) {
        super.doSave(progressMonitor);
        onSave();
    }

    @Override
    public void doRevertToSaved() {
        super.doRevertToSaved();
        onSave();
    }

    /**
     * Builds up the IVML model on saving the document in the editor.
     */
    private void onSave() {
        if (modelListener != null) { // not fully happy, this was static before, i.e., guaranteed
            modelListener.buildModel(getDocument());
        }
    }

    @Override
    public void buildModel(IXtextDocument doc) {
        if (doc != null) {
            doc.readOnly(new UnitOfWork()); 
        }
    }

    // checkstyle: stop exception type check 
    
    /**
     * Implements the xText unit of work for building the model.
     * 
     * @author Holger Eichelberger
     */
    private class UnitOfWork implements IUnitOfWork<T, XtextResource> {
        
        @SuppressWarnings("unchecked")
        @Override
        public T exec(XtextResource resource) {
            T root = null;
            URI resourceURI = resource.getURI();
            List<EObject> contents = resource.getContents();
            if (null != contents) {
                root = (T) contents.get(0);
                try {
                    java.net.URI uri = null;
                    if (null != resourceURI) {
                        try {
                            IResourceInitializer rInit = getResourceInitializer();
                            if (null != rInit) {
                                uri = rInit.toNetUri(resourceURI);
                            }
                        } catch (URISyntaxException e) {
                            getLogger().error("error translating '" + resourceURI + "' while saving:" + e.getMessage());
                        }
                    }
                    TranslationResult<R> result = createModel(root, uri);
                    if (0 == result.getMessageCount()) {
                        ByteArrayOutputStream out = new ByteArrayOutputStream();
                        PrintWriter pOut = new PrintWriter(out);
                        print(result, pOut);
                        getLogger().info(out.toString());
                    } else {
                        if (ValidationUtils.PERFORM_XTEXT_VALIDATION) {
                            BasicDiagnostic diagnostic = Diagnostician.INSTANCE.createDefaultDiagnostic(root);
                            ValidationUtils.processMessages(result, diagnostic);
                        }
                    }
                    if (!ValidationUtils.PERFORM_XTEXT_VALIDATION) {
                        processMessages(result);
                    }
                } catch (Exception e) {
                    getLogger().exception(e);
                }
            }
            return root;
        }
    }

    /**
     * Processes the messages.
     * 
     * @param result the translation result
     * @throws CoreException in case of marker processing problems
     */
    private void processMessages(TranslationResult<?> result) throws CoreException {
        final IResource res = getResource();
        res.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
        DiagnosticConverterImpl conv = new DiagnosticConverterImpl();
        final MarkerCreator markerCreator = new MarkerCreator();
        for (int m = 0; m < result.getMessageCount(); m++) {
            Message message = result.getMessage(m);
            conv.convertValidatorDiagnostic(ValidationUtils.processMessage(message), new IAcceptor<Issue>() {
                
                @Override
                public void accept(Issue issue) {
                    try {
                        markerCreator.createMarker(issue, res, IMarker.PROBLEM);
                    } catch (CoreException e) {
                        getLogger().exception(e);
                    }
                }
            });
        }
    }

    /**
     * Returns the logger for this class.
     * 
     * @return the logger
     */
    private EASyLogger getLogger() {
        return EASyLoggerFactory.INSTANCE.getLogger(getClass(), getBundleId());
    }

    // checkstyle: resume exception type check 
    
    /**
     * Returns the current bundle id.
     * 
     * @return the current bundle identification
     */
    protected abstract String getBundleId();
    
    /**
     * Creates a model (while {@link #buildModel(IXtextDocument)).
     * 
     * @param root the root language element
     * @param uri the URI of the underlying document
     * @return the translation result for the created model
     */
    protected abstract TranslationResult<R> createModel(T root, java.net.URI uri);
    
    /**
     * Returns the resource initializer.
     * 
     * @return the resource initializer
     */
    protected abstract IResourceInitializer getResourceInitializer();
    
    /**
     * Prints the translation result for debugging.
     * 
     * @param result the translation result to be printed
     * @param out the output stream / writer
     */
    protected abstract void print(TranslationResult<R> result, Writer out);
}
