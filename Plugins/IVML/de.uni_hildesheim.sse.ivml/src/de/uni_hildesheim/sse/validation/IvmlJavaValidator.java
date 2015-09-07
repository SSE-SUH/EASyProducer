package de.uni_hildesheim.sse.validation;

import java.io.Writer;
import java.net.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import de.uni_hildesheim.sse.Config;
import de.uni_hildesheim.sse.ModelUtility;
import de.uni_hildesheim.sse.dslCore.TranslationResult;
import de.uni_hildesheim.sse.dslCore.validation.ValidationUtils;
import de.uni_hildesheim.sse.dslCore.validation.ValidationUtils.IModelValidationCallback;
import de.uni_hildesheim.sse.dslCore.validation.ValidationUtils.MessageType;
import de.uni_hildesheim.sse.ivml.VariabilityUnit;
import de.uni_hildesheim.sse.model.management.VarModel;
import de.uni_hildesheim.sse.model.varModel.Project;

/**
 * The on-the-fly validator calling the model transformation mechanism.
 */
public class IvmlJavaValidator extends AbstractIvmlJavaValidator {

    private IModelValidationCallback<VariabilityUnit, Project> callback = new IModelValidationCallback<VariabilityUnit, 
        Project>() {

        @Override
        public TranslationResult<Project> createModel(VariabilityUnit unit, URI uri) {
            return ModelUtility.INSTANCE.createVarModel(unit, uri, false); // false = checkOnly!
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
        public void print(TranslationResult<Project> result, Writer out) {
            ModelUtility.INSTANCE.print(result, out, true, false);
        }

        @Override
        public boolean isValidationEnabled(URI uri) {
            return null != VarModel.INSTANCE.locations().getLocationFor(uri);
        }
        
    };
    
    /**
     * Checks the model on top-level element layer. This method
     * is called by dynamic dispatch.
     * 
     * @param unit the variability unit to start tests with
     */
    @Check
    public void checkModel(VariabilityUnit unit) {
        ValidationUtils.checkModel(unit, callback, Config.isDebuggingEnabled());
    }
    
}
