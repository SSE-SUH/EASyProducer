/*
* generated by Xtext
*/
package de.uni_hildesheim.sse.vil.rt.validation;

import java.io.Writer;
import java.net.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import de.uni_hildesheim.sse.BuildLangConfig;
import de.uni_hildesheim.sse.vil.rt.RtVilModelUtility;
import de.uni_hildesheim.sse.vil.rt.rtVil.ImplementationUnit;
import net.ssehub.easy.dslCore.TranslationResult;
import net.ssehub.easy.dslCore.validation.ValidationUtils;
import net.ssehub.easy.dslCore.validation.ValidationUtils.IModelValidationCallback;
import net.ssehub.easy.dslCore.validation.ValidationUtils.MessageType;
import net.ssehub.easy.instantiation.rt.core.model.rtVil.RtVilModel;
import net.ssehub.easy.instantiation.rt.core.model.rtVil.Script;

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class RtVilJavaValidator extends de.uni_hildesheim.sse.vil.rt.validation.AbstractRtVilJavaValidator {

    
    private IModelValidationCallback<ImplementationUnit, Script> callback = new IModelValidationCallback<
        ImplementationUnit, Script>() {

        @Override
        public TranslationResult<Script> createModel(ImplementationUnit unit, URI uri) {
            return RtVilModelUtility.INSTANCE.createRtModel(unit, uri, false); // false = checkOnly!
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
        public void print(TranslationResult<Script> result, Writer out) {
            RtVilModelUtility.INSTANCE.print(result, out, true, false);
        }
        
        @Override
        public boolean isValidationEnabled(URI uri) {
            return null != RtVilModel.INSTANCE.locations().getLocationFor(uri);
        }
        
    };

    @Override
    @Check
    public void checkModel(de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit unit) {
        // no action, overwrite VIL
    }
    
    /**
     * Checks the model on top-level element layer. This method
     * is called by dynamic dispatch.
     * 
     * @param unit the variability unit to start tests with
     */
    @Check
    public void checkModel(ImplementationUnit unit) {
        ValidationUtils.checkModel(unit, callback, BuildLangConfig.isDebuggingEnabled()); // take settings from VIL
    }

}
