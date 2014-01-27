package de.uni_hildesheim.sse.vil.templatelang.ui;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.uni_hildesheim.sse.dslCore.TranslationResult;
import de.uni_hildesheim.sse.dslCore.validation.ValidationUtils;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.templateModel.Template;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory.EASyLogger;
import de.uni_hildesheim.sse.vil.templatelang.TemplateLangModelUtility;
import de.uni_hildesheim.sse.vil.templatelang.VtlBundleId;
import de.uni_hildesheim.sse.vil.templatelang.templateLang.LanguageUnit;

/**
 * This class extends the official xText editor in order to hook into
 * the saving mechanism. The <code>afterSave</code> event provided
 * by the xText Editor Callback is not sufficient, as it is also called
 * when a in an editor is changed from outside and pushed back into 
 * the editor via the Eclipse refresh mechanism.
 * 
 * @author Holger Eichelberger
 */
public class XtextEditor extends org.eclipse.xtext.ui.editor.XtextEditor {

    /**
     * {@inheritDoc}
     */
    @Override
    public void doSaveAs() {
        super.doSaveAs();
        onSave();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doSave(IProgressMonitor progressMonitor) {
        super.doSave(progressMonitor);
        onSave();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doRevertToSaved() {
        super.doRevertToSaved();
        onSave();
    }

    /**
     * Builds up the IVML model on saving the document in the editor.
     */
    private void onSave() {
        IXtextDocument doc = getDocument();
        doc.readOnly(new IUnitOfWork<LanguageUnit, XtextResource>() {
            public LanguageUnit exec(XtextResource resource) {
                LanguageUnit root = (LanguageUnit) resource.getContents().get(0);
                EASyLogger logger = EASyLoggerFactory.INSTANCE.getLogger(getClass(), VtlBundleId.ID);
                try {
                    BasicDiagnostic diagnostic = Diagnostician.INSTANCE.createDefaultDiagnostic(root);
                    java.net.URI uri = null;
                    if (null != resource.getURI()) {
                        try {
                            uri = TemplateLangModelUtility.toNetUri(resource.getURI());
                        } catch (URISyntaxException e) {
                            logger.error("error translating '" + resource.getURI() + "' while saving:" 
                                + e.getMessage());
                        }
                    }
                    TranslationResult<Template> result = TemplateLangModelUtility.INSTANCE.createModel(root, uri, true);
                    if (0 == result.getMessageCount()) {
                        ByteArrayOutputStream out = new ByteArrayOutputStream();
                        PrintWriter pOut = new PrintWriter(out);
                        TemplateLangModelUtility.INSTANCE.print(result, pOut, true, false);
                        logger.info(out.toString());
                    } else {
                        ValidationUtils.processMessages(result, diagnostic);
                    }
                } catch (Exception e) {
                    logger.exception(e);
                }
                return root;
            }
        });

    }
    
}
