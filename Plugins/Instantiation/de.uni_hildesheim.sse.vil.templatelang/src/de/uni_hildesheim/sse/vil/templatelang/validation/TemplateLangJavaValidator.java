package de.uni_hildesheim.sse.vil.templatelang.validation;

import java.io.Writer;
import java.net.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import de.uni_hildesheim.sse.vil.templatelang.TemplateLangConfig;
import de.uni_hildesheim.sse.vil.templatelang.TemplateLangModelUtility;
import de.uni_hildesheim.sse.vil.templatelang.templateLang.LanguageUnit;
import net.ssehub.easy.dslCore.TranslationResult;
import net.ssehub.easy.dslCore.validation.ValidationUtils;
import net.ssehub.easy.dslCore.validation.ValidationUtils.IModelValidationCallback;
import net.ssehub.easy.dslCore.validation.ValidationUtils.MessageType;
import net.ssehub.easy.instantiation.core.model.templateModel.Template;
import net.ssehub.easy.instantiation.core.model.templateModel.TemplateModel;
 
public class TemplateLangJavaValidator extends AbstractTemplateLangJavaValidator {

    private IModelValidationCallback<LanguageUnit, Template> callback = new IModelValidationCallback<LanguageUnit, 
        Template>() {

        @Override
        public TranslationResult<Template> createModel(LanguageUnit unit, URI uri) {
            return TemplateLangModelUtility.INSTANCE.createModel(unit, uri, false); // false = checkOnly!
        }

        @Override
        public void message(MessageType type, String message, EObject source, EStructuralFeature feature, 
            int identifier) {
            switch (type) {
            case ERROR:
                error(message, source, feature, identifier);
                break;
            case INFO:
                info(message, source, feature, identifier);
                break;
            case WARNING:
                warning(message, source, feature, identifier);
                break;
            default:
                break;
            }
        }

        @Override
        public void print(TranslationResult<Template> result, Writer out) {
            TemplateLangModelUtility.INSTANCE.print(result, out, true, false);
        }

        @Override
        public boolean isValidationEnabled(URI uri) {
            return null != TemplateModel.INSTANCE.locations().getLocationFor(uri);
        }
        
    };

    /**
     * Checks the model on top-level element layer. This method
     * is called by dynamic dispatch.
     * 
     * @param unit the variability unit to start tests with
     */
    @Check
    public void checkModel(LanguageUnit unit) {
        ValidationUtils.checkModel(unit, callback, TemplateLangConfig.isDebuggingEnabled());
    }

}
