package net.ssehub.easy.instantiation.core.model.defaultInstantiators;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import net.ssehub.easy.basics.logger.EASyLoggerFactory;
import net.ssehub.easy.basics.modelManagement.IRestrictionEvaluationContext;
import net.ssehub.easy.basics.modelManagement.IVersionRestriction;
import net.ssehub.easy.basics.modelManagement.ModelImport;
import net.ssehub.easy.basics.modelManagement.ModelInfo;
import net.ssehub.easy.basics.modelManagement.ModelManagementException;
import net.ssehub.easy.basics.modelManagement.Version;
import net.ssehub.easy.instantiation.core.Bundle;
import net.ssehub.easy.instantiation.core.model.artifactModel.ArtifactFactory;
import net.ssehub.easy.instantiation.core.model.artifactModel.FileArtifact;
import net.ssehub.easy.instantiation.core.model.artifactModel.IArtifact;
import net.ssehub.easy.instantiation.core.model.artifactModel.Path;
import net.ssehub.easy.instantiation.core.model.artifactModel.VtlFileArtifact;
import net.ssehub.easy.instantiation.core.model.buildlangModel.BuildModel;
import net.ssehub.easy.instantiation.core.model.buildlangModel.Script;
import net.ssehub.easy.instantiation.core.model.common.ITerminatable;
import net.ssehub.easy.instantiation.core.model.common.ITerminator;
import net.ssehub.easy.instantiation.core.model.common.VilException;
import net.ssehub.easy.instantiation.core.model.execution.TracerFactory;
import net.ssehub.easy.instantiation.core.model.expressions.EvaluationVisitor;
import net.ssehub.easy.instantiation.core.model.expressions.ExpressionParserRegistry;
import net.ssehub.easy.instantiation.core.model.expressions.IExpressionParser;
import net.ssehub.easy.instantiation.core.model.expressions.IResolvable;
import net.ssehub.easy.instantiation.core.model.expressions.IRuntimeEnvironment;
import net.ssehub.easy.instantiation.core.model.expressions.StringReplacer;
import net.ssehub.easy.instantiation.core.model.templateModel.ITracer;
import net.ssehub.easy.instantiation.core.model.templateModel.Template;
import net.ssehub.easy.instantiation.core.model.templateModel.TemplateLangExecution;
import net.ssehub.easy.instantiation.core.model.templateModel.TemplateModel;
import net.ssehub.easy.instantiation.core.model.vilTypes.Collection;
import net.ssehub.easy.instantiation.core.model.vilTypes.Constants;
import net.ssehub.easy.instantiation.core.model.vilTypes.IVilType;
import net.ssehub.easy.instantiation.core.model.vilTypes.Instantiator;
import net.ssehub.easy.instantiation.core.model.vilTypes.ListSet;
import net.ssehub.easy.instantiation.core.model.vilTypes.OperationMeta;
import net.ssehub.easy.instantiation.core.model.vilTypes.Set;
import net.ssehub.easy.instantiation.core.model.vilTypes.TypeRegistry;
import net.ssehub.easy.instantiation.core.model.vilTypes.configuration.AbstractIvmlVariable;
import net.ssehub.easy.instantiation.core.model.vilTypes.configuration.Attribute;
import net.ssehub.easy.instantiation.core.model.vilTypes.configuration.Configuration;
import net.ssehub.easy.instantiation.core.model.vilTypes.configuration.DecisionVariable;
import net.ssehub.easy.instantiation.core.model.vilTypes.configuration.IvmlElement;

/**
 * Implements the default VIL template processor. This instantiator handles
 * two types of artifacts, VTL templates and arbitrary file artifacts. In
 * case of VTL templates it tries to obtain the related VTL script (from a registered
 * and scanned VTL location - see {@link TemplateModel#locations()} and executes
 * the VTL script. In case of another file, it takes the file contents and instantiates
 * the VTL expressions in it (if there are some).
 * 
 * @author Holger Eichelberger
 */
@Instantiator(value = "vilTemplateProcessor", acceptsImplicitParameters = true)
public class VilTemplateProcessor implements IVilType {

    /**
     * Denotes the default name of the configuration parameter ({@link TemplateLangExecution#PARAM_CONFIG}).
     */
    public static final String PARAM_CONFIG = TemplateLangExecution.PARAM_CONFIG;
    
    /**
     * Denotes the default name of the target artifact parameter ({@link TemplateLangExecution#PARAM_TARGET}).
     */
    public static final String PARAM_TARGET = TemplateLangExecution.PARAM_TARGET;

    /**
     * Instantiates <code>source</code> to <code>target</code>.
     * 
     * @param template the input template script
     * @param config the variability configuration to process
     * @param targets the target artifacts (may be modified)
     * @param other named optional parameter
     * @return the created artifacts
     * @throws VilException in case that execution fails
     */
    @OperationMeta(returnGenerics = IArtifact.class, requiresDynamicExpressionProcessing = true)
    public static Set<IArtifact> vilTemplateProcessor(FileArtifact template, Configuration config, 
        Collection<IArtifact> targets, Map<String, Object> other) throws VilException {
        List<IArtifact> result = new ArrayList<IArtifact>();
        for (IArtifact target : targets) {
            process(template, config, target, other, result);
        }
        return new ListSet<IArtifact>(result, IArtifact.class);
    }

    /**
     * Instantiates <code>source</code> to <code>target</code>.
     * 
     * @param template the input template script
     * @param config the variability configuration to process
     * @param target the target artifact (may be modified)
     * @param other named optional parameter
     * @return the created artifacts
     * @throws VilException in case that execution fails
     */
    @OperationMeta(returnGenerics = IArtifact.class, requiresDynamicExpressionProcessing = true)
    public static Set<IArtifact> vilTemplateProcessor(FileArtifact template, Configuration config, IArtifact target, 
        Map<String, Object> other) throws VilException {
        List<IArtifact> result = new ArrayList<IArtifact>();
        process(template, config, target, other, result);
        return new ListSet<IArtifact>(result, IArtifact.class);
    }
    
    /**
     * Instantiates <code>source</code> to <code>target</code>.
     * 
     * @param template the input template script
     * @param config the variability configuration to process
     * @param target the target artifact (may be modified)
     * @param other named optional parameter
     * @param result the created artifacts (modified as a side effect)
     * @throws VilException in case that execution fails
     */
    private static void process(FileArtifact template, Configuration config, IArtifact target, 
        Map<String, Object> other, List<IArtifact> result) throws VilException {
        // obtaining the expression parser for instantiation
        IExpressionParser expressionParser = ExpressionParserRegistry.getExpressionParser(
            TemplateLangExecution.LANGUAGE);
        if (null == expressionParser) {
            throw new VilException("no expression parser registered", VilException.ID_INTERNAL);
        }
        // obtaining the file contents for instantiation
        File inAbsFile = template.getPath().getAbsolutePath();
        String templateContents;
        try {
            templateContents = FileUtils.readFileToString(inAbsFile);
        } catch (IOException e) {
            throw new VilException(e.getMessage(), VilException.ID_IO);
        }
        // instantiate the file template
        RuntimeEnvironment runtimeEnvironment = new RuntimeEnvironment(config);
        ITracer tracer = TracerFactory.createTemplateLanguageTracer();
        EvaluationVisitor evaluationVisitor = new EvaluationVisitor(runtimeEnvironment, tracer);
        // TODO this operation cannot just be removed as it is the functionality of a template processor
        // TODO However, without xtext this cannot be executed at runtime :(
        String instantiatedContent = StringReplacer.substitute(templateContents, runtimeEnvironment, 
            expressionParser, evaluationVisitor);
        //String instantiatedContent = templateContents;
            
        StringWriter out = new StringWriter();
        out.append(instantiatedContent);
        out.flush();
        String tmp = out.toString();
        if (tmp.length() > 0) {
            target.getText().setText(tmp);
            target.store(); // just to be sure for the moment
        }
        // returning the affected file(s)
        result.add(target);
    }

    /**
     * Instantiates <code>source</code> to <code>target</code>.
     * 
     * @param template the input template script
     * @param config the variability configuration to process
     * @param targets the target artifacts (may be modified)
     * @param other named optional parameter
     * @return the created artifacts
     * @throws VilException in case that execution fails
     */
    @OperationMeta(returnGenerics = IArtifact.class)
    public static Set<IArtifact> vilTemplateProcessor(VtlFileArtifact template, Configuration config, 
        Collection<IArtifact> targets, Map<String, Object> other) throws VilException {
        List<IArtifact> result = new ArrayList<IArtifact>();
        for (IArtifact target : targets) {
            process(template, config, target, other, result);
        }
        return new ListSet<IArtifact>(result, IArtifact.class);
    }
    
    /**
     * Instantiates <code>source</code> to <code>target</code>.
     * 
     * @param template the input template script
     * @param config the variability configuration to process
     * @param target the target artifact (may be modified)
     * @param other named optional parameter
     * @return the created artifacts
     * @throws VilException in case that execution fails
     */
    @OperationMeta(returnGenerics = IArtifact.class)
    public static Set<IArtifact> vilTemplateProcessor(VtlFileArtifact template, Configuration config, 
        IArtifact target, Map<String, Object> other) throws VilException {
        List<IArtifact> result = new ArrayList<IArtifact>();
        process(template, config, target, other, result);
        return new ListSet<IArtifact>(result, IArtifact.class);
    }    
    
    /**
     * Instantiates <code>source</code> to <code>target</code>.
     * 
     * @param template the input template script (as artifact)
     * @param config the variability configuration to process
     * @param target the target artifact (may be modified)
     * @param other named optional parameter
     * @param result the created artifacts (modified as a side effect)
     * @throws VilException in case that execution fails
     */
    @OperationMeta(returnGenerics = IArtifact.class)
    private static void process(VtlFileArtifact template, Configuration config, 
        IArtifact target, Map<String, Object> other, List<IArtifact> result) throws VilException {
        // obtaining the model info
        Path path = template.getPath();
        if (path.isPattern()) {
            throw new VilException("template '" + path.getPath() + "' is a pattern and cannot be instantiated", 
                VilException.ID_IO);
        } 
        File absPath = template.getPath().getAbsolutePath();
        if (!path.exists()) {
            throw new VilException("template '" + path.getPath() + "' (" + absPath + ") does not exist", 
                VilException.ID_IO);
        }
        URI uri = template.getPath().getAbsolutePath().toURI();
        ModelInfo<Template> info = TemplateModel.INSTANCE.availableModels().getInfo(uri);
        if (null == info) {
            throw new VilException("template '" + path.getPath() + "' does not contain a valid template model", 
                VilException.ID_IO);
        }
        // obtaining/loading the model
        try {
            Template model = TemplateModel.INSTANCE.load(info);
            process(model, config, target, other, result);
        } catch (ModelManagementException e) {
            throw new VilException(e.getMessage(), VilException.ID_IO);
        }
    }
    
    /**
     * Returns the applicable VTL restrictions.
     * 
     * @param templateName the name of the template to search for
     * @param other the other (named) parameters
     * @return the applicable VTL restrictions or <b>null</b> if there are none
     */
    private static ModelImport<Template> getVtlRestrictions(String templateName, Map<String, Object> other) {
        ModelImport<Template> result = null;
        if (null != other) {
            Object parent = other.get(Constants.IMPLICIT_PARENT_PARAMETER_NAME);
            if (parent instanceof Script) {
                Script script = (Script) parent;
                for (int r = 0; null == result && r < script.getVtlRestrictionsCount(); r++) {
                    ModelImport<Template> restriction = script.getVtlRestriction(r);
                    if (restriction.getName().equals(templateName)) {
                        result = restriction;
                    }
                }
            }
        }
        return result;
    }
    
    /**
     * Returns the VTL paths passed in as implicit parameter {@link Constants#IMPLICIT_PATHS_PARAMETER_NAME}.
     * 
     * @param other the other (named) parameters
     * @return the VTL paths, <b>null</b> if none were specified
     */
    private static String[] getVtlPaths(Map<String, Object> other) {
        String[] result = null;
        Object tmp = other.get(Constants.IMPLICIT_PATHS_PARAMETER_NAME);
        if (tmp instanceof String[]) {
            result = (String[]) tmp;
        }
        return result;
    }

    /**
     * Returns the parent script passed in as implicit parameter {@link Constants#IMPLICIT_PARENT_PARAMETER_NAME}.
     * 
     * @param other the other (named) parameters
     * @return the parent script, <b>null</b> if none was specified
     */
    private static Script getParent(Map<String, Object> other) {
        Script result = null;
        Object tmp = other.get(Constants.IMPLICIT_PARENT_PARAMETER_NAME);
        if (tmp instanceof Script) {
            result = (Script) tmp;
        }
        return result;
    }
    
    /**
     * Instantiates <code>source</code> to <code>target</code>. Versions restrictions may implicitly
     * be specified as {@link Constants#IMPLICIT_PARENT_PARAMETER_NAME implicit parent parameter name}
     * in terms of a Script instance.
     * 
     * @param templateName the name of the template
     * @param config the variability configuration to process
     * @param targets the target artifacts (may be modified)
     * @param other named optional parameter
     * @return the created artifacts
     * @throws VilException in case that execution fails
     */
    @OperationMeta(returnGenerics = IArtifact.class)
    public static Set<IArtifact> vilTemplateProcessor(String templateName, Configuration config, 
        Collection<IArtifact> targets, Map<String, Object> other) throws VilException {
        Set<IArtifact> result = null;
        try {
            // ugly manual dispatch but String as first parameter without further parameters does not lead 
            // to an artifact conversion
            Path path = Path.convert(templateName);
            FileArtifact art = ArtifactFactory.createArtifact(FileArtifact.class, path.getAbsolutePath(), 
                path.getArtifactModel());
            if (art instanceof VtlFileArtifact) {
                result = vilTemplateProcessor((VtlFileArtifact) art, config, targets, other);
            } else {
                result = vilTemplateProcessor(art, config, targets, other);
            }
        } catch (VilException e) {
            // don't care
        }
        if (null == result) {
            List<IArtifact> tmp = new ArrayList<IArtifact>();
            Template template = obtainTemplate(templateName, getVtlRestrictions(templateName, other), 
                 getVtlPaths(other), config.getRootScript());
            for (IArtifact target : targets) {
                process(template, config, target, other, tmp);
            }
            result = new ListSet<IArtifact>(tmp, IArtifact.class);
        }
        return result;
    }
    
    /**
     * Instantiates <code>source</code> to <code>target</code>. Versions restrictions may implicitly
     * be specified as {@link Constants#IMPLICIT_PARENT_PARAMETER_NAME implicit parent parameter name}
     * in terms of a Script instance.
     * 
     * @param templateName the name of the template
     * @param config the variability configuration to process
     * @param target the target artifact (may be modified)
     * @param other named optional parameter
     * @return the created artifacts
     * @throws VilException in case that execution fails
     */
    @OperationMeta(returnGenerics = IArtifact.class)
    public static Set<IArtifact> vilTemplateProcessor(String templateName, Configuration config, 
        IArtifact target, Map<String, Object> other) throws VilException {
        Set<IArtifact> result = null;
        try {
            // ugly manual dispatch but String as first parameter without further parameters does not lead 
            // to an artifact conversion
            Path path = Path.convert(templateName);
            FileArtifact art = ArtifactFactory.createArtifact(FileArtifact.class, path.getAbsolutePath(), 
                path.getArtifactModel());
            if (art instanceof VtlFileArtifact) {
                result = vilTemplateProcessor((VtlFileArtifact) art, config, target, other);
            } else {
                result = vilTemplateProcessor(art, config, target, other);
            }
        } catch (VilException e) {
            // don't care
        }
        if (null == result) {
            List<IArtifact> tmp = new ArrayList<IArtifact>();
            Script caller = config.getRootScript();
            if (null == caller) {
                caller = getParent(other);
            }
            String[] possiblePaths = getVtlPaths(other);
            Template template = obtainTemplate(templateName, getVtlRestrictions(templateName, other), 
                possiblePaths, caller);
            if (null != template) {
                process(template, config, target, other, tmp);
                result = new ListSet<IArtifact>(tmp, IArtifact.class);
            } else {
                StringBuffer errMsg = new StringBuffer("The script \"");
                errMsg.append(templateName);
                errMsg.append("\" coult not be loaded, maybe it is not parseable.");
                if (null != possiblePaths && possiblePaths.length > 0) {
                    errMsg.append("Please check whether one of the following paths contains a valid template file:\n");
                    errMsg.append(" - ");
                    errMsg.append(possiblePaths[0]);
                    for (int i = 1; i < possiblePaths.length; i++) {
                        errMsg.append("\n - ");
                        errMsg.append(possiblePaths[i]);
                    }
                    throw new VilException(errMsg.toString() , VilException.ID_NOT_FOUND);
                }
            }
        }
        return result;
    }
    
    /**
     * Prunes <code>info</code> by removing all information objects that are not in one of the <code>vtlPaths</code>.
     * 
     * @param info the information objects to be pruned (may be <b>null</b>)
     * @param vtlPaths the paths to be used for pruning (may be <b>null</b>)
     */
    private static void pruneByPaths(List<ModelInfo<Template>> info, String[] vtlPaths) {
        if (null != info && null != vtlPaths) {
            for (int i = info.size() - 1; i >= 0; i--) {
                ModelInfo<Template> tmp = info.get(i);
                String location = new File(tmp.getLocation()).getAbsolutePath();
                boolean found = false;
                for (int p = 0; !found && p < vtlPaths.length; p++) {
                    found = location.startsWith(vtlPaths[p]);
                }
                if (!found) {
                    info.remove(i);
                }
            }
        }
        // getting rid of unrelated paths is just a first solution
    }

    // checkstyle: stop exception type check
    
    /**
     * Obtains the template for <code>templateName</code> and <code>version</code>.
     * 
     * @param templateName the name of the template
     * @param restrictions the VTL resolution restrictions (may be <b>null</b>)
     * @param vtlPaths the VTL path(s) of the source project(s) (may be <b>null</b>)
     * @param caller the root executing script for URI-based model resolution
     * @return the template model
     * @throws VilException in case that execution fails
     */
    private static Template obtainTemplate(String templateName, ModelImport<Template> restrictions, String[] vtlPaths, 
        Script caller) throws VilException {
        Template model = null;
        try {
            URI baseURI = null;
            IRestrictionEvaluationContext context;
            if (null != caller) { // shall always be the case from VIL
                ModelInfo<Script> cInfo = BuildModel.INSTANCE.availableModels().getModelInfo(caller);
                baseURI = cInfo.getLocation();
                context = caller.getRestrictionEvaluationContext();
            } else {
                // fallback: case unclear - tests only?
                List<ModelInfo<Template>> infos = TemplateModel.INSTANCE.availableModels().getModelInfo(templateName, 
                    (Version) null);
                pruneByPaths(infos, vtlPaths);
                if (null == infos || infos.isEmpty()) {
                    throw new VilException(templateName + " cannot be found", 
                        VilException.ID_IO);
                }
                if (infos.size() > 1) {
                    throw new VilException(templateName + " is ambigous (" + infos.size() 
                        + " models found)", VilException.ID_IO);
                }
                ModelInfo<Template> info = infos.get(0);
                baseURI = info.getLocation();
                Template tpl = info.getResolved();
                if (null == tpl) {
                    tpl = TemplateModel.INSTANCE.load(info);
                }
                context = tpl.getRestrictionEvaluationContext();
            }
            IVersionRestriction restriction;
            if (null != restrictions) {
                restriction = restrictions.getVersionRestriction();
            } else {
                restriction = null;
            }
            model = TemplateModel.INSTANCE.resolve(templateName, restriction, baseURI, context);
            if (model.isDirty()) {
                Template old = model;
                model = TemplateModel.INSTANCE.reload(model);
                EASyLoggerFactory.INSTANCE.getLogger(VilTemplateProcessor.class, Bundle.ID).info("Reloading model " 
                    + model.getName() + " " + System.identityHashCode(model) + " as it was marked dirty: " 
                    + (old != model)); // for Cui
            }
        } catch (ModelManagementException e) {
            throw new VilException(e.getMessage(), e.getId());
        } catch (RuntimeException e) {
            // checkstyle: runtime errors in the implementation are otherwise not shown
            throw new VilException(e, VilException.ID_RUNTIME_EXECUTION);
        }
        return model;
    }
    
    // checkstyle: resume exception type check
    
    /**
     * Instantiates <code>source</code> to <code>target</code>.
     * 
     * @param template the input template script (as template instance)
     * @param config the variability configuration to process
     * @param target the target artifact (may be modified)
     * @param other named optional parameter
     * @param result the created artifacts (modified as a side effect)
     * @throws VilException in case that execution fails
     */
    @OperationMeta(returnGenerics = IArtifact.class)
    private static void process(Template template, Configuration config, 
        IArtifact target, Map<String, Object> other, List<IArtifact> result) throws VilException {
        ITerminator terminator = null;
        TemplateLangExecution exec = null;
        // executing the model
        try {
            StringWriter out = new StringWriter();
            Map<String, Object> localParam = new HashMap<String, Object>();
            // put default parameter
            localParam.put(PARAM_CONFIG, config);
            localParam.put(PARAM_TARGET, target);
            // put other parameter (default may be overridden if used differently)
            localParam.putAll(other);
            // put default parameters for sure
            localParam.put(TemplateLangExecution.PARAM_CONFIG_SURE, config);
            localParam.put(TemplateLangExecution.PARAM_TARGET_SURE, target);
            ITracer tracer = TracerFactory.createTemplateLanguageTracer();
            exec = new TemplateLangExecution(tracer, out, localParam);
            if (null != other) {
                Object tmp = other.get(Constants.IMPLICIT_TERMINATOR_NAME);
                if (tmp instanceof ITerminator) {
                    terminator = (ITerminator) tmp;
                    terminator.register(exec);
                }
            }
            template.accept(exec);
            String tmp = out.toString();
            if (tmp.length() > 0) {
                target.getText().setText(tmp);
                target.store(); // just to be sure for the moment
            }
        } catch (VilException e) {
            unregisterTerminatable(terminator, exec);
            EASyLoggerFactory.INSTANCE.getLogger(VilTemplateProcessor.class, Bundle.ID).exception(e);
            throw new VilException(e.getMessage(), VilException.ID_WHILE_INSTANTIATION);
        }
        result.add(target);
    }

    /**
     * Clears the terminator from a potential execution instance.
     * 
     * @param terminator the terminator (may be <b>null</b>)
     * @param terminatable the terminatable (may be <b>null</b>)
     */
    private static void unregisterTerminatable(ITerminator terminator, ITerminatable terminatable) {
        if (null != terminator && null != terminatable) {
            terminator.unregister(terminatable);
        }
    }

    /**
     * Creates a specific runtime environment which contains the variables of a configuration.
     * 
     * @author Holger Eichelberger
     */
    private static class RuntimeEnvironment implements IRuntimeEnvironment {

        private Map<IResolvable, Object> values = new HashMap<IResolvable, Object>();
        private Map<String, IvmlElement> nameMap = new HashMap<String, IvmlElement>();

        /**
         * Creates a new runtime environment.
         * 
         * @param config the configuration used to fill this environment
         */
        RuntimeEnvironment(Configuration config) {
            Iterator<DecisionVariable> vIter = config.variables().iterator();
            while (vIter.hasNext()) {
                addVariable(vIter.next());
            }
            Iterator<Attribute> aIter = config.attributes().iterator();
            while (aIter.hasNext()) {
                addVariable(aIter.next());
            }
        }
        
        /**
         * Adds an IVML variable to the runtime environment.
         * 
         * @param var the variable to be added
         */
        private void addVariable(AbstractIvmlVariable var) {
            nameMap.put(var.getQualifiedName(), var);
            values.put(var, var.getValue());
            Iterator<DecisionVariable> vIter = var.variables().iterator();
            while (vIter.hasNext()) {
                addVariable(vIter.next());
            }
            Iterator<Attribute> aIter = var.attributes().iterator();
            while (aIter.hasNext()) {
                addVariable(aIter.next());
            }
        }
        
        @Override
        public Object getValue(IResolvable resolvable) throws VilException {
            Object result;
            if (resolvable instanceof IvmlElement) {
                result = ((IvmlElement) resolvable).getValue();
            } else {
                if (values.containsKey(resolvable)) {
                    result = values.get(resolvable);
                } else {
                    throw new VilException(resolvable.getName() + " is not defined", 
                        VilException.ID_RUNTIME);
                }
            }
            return result;
        }

        @Override
        public IResolvable get(String name) {
            return nameMap.get(name);
        }

        @Override
        public void setValue(IResolvable var, Object object) throws VilException {
            if (var instanceof IvmlElement) {
                throw new VilException("cannot change configuration", VilException.ID_SEMANTIC);
            } else {
                values.put(var, object);
            }
        }

        @Override
        public Object getIvmlValue(String name) throws VilException {
            return nameMap.get(name);
        }

        @Override
        public String[] getContextPaths() {
            return null;
        }

        @Override
        public TypeRegistry getTypeRegistry() {
            return TypeRegistry.DEFAULT; // TODO unsure whether local is needed
        }

        @Override
        public void storeArtifacts() throws VilException {
        }
        
    }

}
