package de.uni_hildesheim.sse.easy_producer.instantiator.model.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.IArtifact;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel.MapExpression;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.CallArgument;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.CallExpression;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.EvaluationVisitor;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.Expression;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.ExpressionException;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.VariableExpression;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.ArtifactException;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Collection;
import de.uni_hildesheim.sse.utils.modelManagement.IModel;

/**
 * Extends the basic expression evaluation visitor for the execution of those classes being
 * defined in this package.
 * 
 * @param <M> the actual model type
 * @param <O> the actual operation type
 * @param <V> the actual variable declaration type
 * 
 * @author Holger Eichelberger
 */
public abstract class ExecutionVisitor <M extends IResolvableModel<V>, O extends IResolvableOperation<V>, 
    V extends VariableDeclaration> extends EvaluationVisitor implements IVisitor {

    private RuntimeEnvironment environment;
    private ITracer tracer;
    private Map<String, Object> parameter;

    /**
     * Creates an execution visitor.
     * 
     * @param environment the runtime environment
     * @param tracer the execution tracer instance (for testing)
     * @param parameter the parameter given from outside for the execution of the model
     */
    protected ExecutionVisitor(RuntimeEnvironment environment, ITracer tracer, Map<String, Object> parameter) {
        super(environment, tracer);
        this.environment = environment;
        this.tracer = tracer;
        this.parameter = parameter;
    }
    
    /**
     * Returns the runtime environment (for testing).
     * 
     * @return the runtime environment
     */
    public RuntimeEnvironment getRuntimeEnvironment() {
        return environment;
    }

    /**
     * Returns the specified parameter.
     * 
     * @param name the name of the parameter
     * @return the value of the parameter
     */
    protected Object getParameter(String name) {
        return parameter.get(name);
    }
    
    /**
     * Returns whether the specified parameter is defined.
     * 
     * @param name the name of the parameter
     * @return <code>true</code> if the parameter is defined, <code>false</code> else
     */
    protected boolean hasParameter(String name) {
        return parameter.containsKey(name);
    }
    
    /**
     * Returns the tracer instance..
     * 
     * @return the tracer instance
     */
    protected ITracer getTracer() {
        return tracer;
    }
    
    @Override
    public Object visitVariableDeclaration(VariableDeclaration var) throws VilLanguageException {
        Object value = null;
        if (null != var.getExpression()) {
            try {
                value = var.getExpression().accept(this);
                environment.setValue(var, value);
                tracer.valueDefined(var, value);
            } catch (ExpressionException e) {
                throw new VilLanguageException(e);
            }
        }
        return value;
    }

    @Override
    public Object visitAdvice(Advice advice) throws VilLanguageException {
        // shall be ignored here
        return null;
    }

    @Override
    public Object visitExpressionStatement(ExpressionStatement statement) throws VilLanguageException {
        try {
            return statement.getExpression().accept(this);
        } catch (ExpressionException e) {
            throw new VilLanguageException(e);
        }
    }

    @Override
    protected void notifyValueDefined(VariableDeclaration var, Object val) {
        tracer.valueDefined(var, val);
    }
    
    /**
     * Specifies various types of artifact condition tests.
     * 
     * @author Holger Eichelberger
     */
    protected enum ConditionTest {
        
        /**
         * The artifact must exist {@link IArtifact#exists()}.
         */
        EXISTS,

        /**
         * Don't care for specific artifact checks.
         */
        DONT_CARE
    }
    
    /**
     * Checks the results of an evaluation of a condition.
     * 
     * @param value the evaluation result
     * @param element the element to check on
     * @param test how to test individual artifacts
     * @return <code>true</code> if the condition is fulfilled, <code>false</code> else
     */
    protected boolean checkConditionResult(Object value, Object element, ConditionTest test) {
        boolean ok = true;
        if (null == value) {
            ok = false;
        } else if (value instanceof Collection) {
            Collection<?> collection = (Collection<?>) value;
            if (0 == collection.size()) {
                ok = false;
            } else {
                Iterator<?> iter = collection.iterator();
                while (iter.hasNext()) {
                    ok = checkConditionResult(iter.next(), element, test);
                    if (!ok) {
                        break;
                    }
                }
            }
        } else if (Boolean.class.isInstance(value)) {
            ok = ((Boolean) value).booleanValue();
        } else if (value instanceof IArtifact) {
            switch (test) {
            case EXISTS:
                ok = ((IArtifact) value).exists();
                break;
            default:
                ok = true;
                break;
            }
        }
        return ok;
    }

    /**
     * Visits the related model headers.
     * 
     * @param model the model to be visited
     * @throws VilLanguageException in case that visiting fails (cyclic inclusion)
     */
    protected void visitModelHeader(IResolvableModel<V> model) throws VilLanguageException {
        Set<IResolvableModel<V>> visited = new HashSet<IResolvableModel<V>>();
        visitModelHeader(model, visited);
    }

    /**
     * Visits the related model headers.
     * 
     * @param model the model to be visited
     * @param visited the already visited models
     * @throws VilLanguageException in case that visiting fails (cyclic inclusion)
     */
    @SuppressWarnings("unchecked")
    private void visitModelHeader(IResolvableModel<V> model, Set<IResolvableModel<V>> visited) 
        throws VilLanguageException {
        if (!visited.contains(model)) {
            visited.add(model);
            environment.switchContext(model);
            processModelParameter(model);
            for (int i = 0; i < model.getImportsCount(); i++) {
                visitModelHeader((IResolvableModel<V>) model.getImport(i).getResolved(), visited);
            }
            for (int v = 0; v < model.getVariableDeclarationCount(); v++) {
                model.getVariableDeclaration(v).accept((IVisitor) this);
            }
        } else {
            throw new VilLanguageException("cyclic inclusion at " + model.getName(), 
                VilLanguageException.ID_RUNTIME_CYCLE);
        }
    }

    /**
     * Defines the value of a given model/main argument and allows (by overriding) implicit (programmed) 
     * conversion of main arguments.
     * 
     * @param param the model/main parameter corresponding to the argument
     * @param value the actual value of the argument
     * @throws VilLanguageException in case that setting the value fails due to type conflicts or as a 
     *     constant shall be modified
     */
    protected void setModelArgument(V param, Object value) throws VilLanguageException {
        environment.addValue(param, value);
    }
    
    /**
     * Processes the parameters of <code>model</code>. Calls {@link #handleParameterInSequence(IResolvableModel, Map)}.
     * 
     * @param model the model to be processed
     * @throws VilLanguageException in case of execution errors
     */
    protected void processModelParameter(IResolvableModel<V> model) throws VilLanguageException {
        Map<String, V> sParam = new HashMap<String, V>();
        for (int p = 0; p < model.getParameterCount(); p++) {
            V param = model.getParameter(p);
            sParam.put(param.getName(), param);
        }
        handleParameterInSequence(model, sParam);
        for (Map.Entry<String, Object> param : parameter.entrySet()) {
            String name = param.getKey();
            if (sParam.containsKey(name)) {
                setModelArgument(sParam.get(name), param.getValue());
                sParam.remove(name);
            }
        }
        if (!sParam.isEmpty()) {
            StringBuilder tmp = new StringBuilder();
            for (String name : sParam.keySet()) {
                if (tmp.length() > 0) {
                    tmp.append(", ");
                }
                tmp.append(name);
            }
            throw new VilLanguageException("unbound script parameter in " + model.getName() + ": " + tmp, 
                VilLanguageException.ID_RUNTIME_PARAMETER);
        }
    }

    /**
     * Handles model parameters in sequence if appropriate. If and only if mapping is possible, this method shall
     * modify <code>varMap</code> by removing assigned parameters. Otherwise, no error shall be emitted by this
     * method. Implemented empty in this class as intended for overriding.
     * 
     * @param model the model to be processed
     * @param varMap a mapping of parameter names to implementing variable declarations, to be modified as a side
     *   effect if parameters are bound
     * @throws VilLanguageException in case of execution errors
     */
    protected void handleParameterInSequence(IResolvableModel<V> model, Map<String, V> varMap) 
        throws VilLanguageException {
    }
    
    /**
     * Visits a model call expression. Currently, this method is intended
     * to facilitate reuse and not declared in the visitor in order to avoid
     * further template parameters etc. This method calls 
     * {@link #executeModelCall(IResolvableOperation)}.
     * 
     * @param call the call to be visited
     * @return the result of the execution
     * @throws ExpressionException in case that the execution fails
     */
    protected Object visitModelCallExpression(ModelCallExpression<V, M, O> call) throws ExpressionException {
        // evaluate in this context before context switch
        Object[] args = new Object[call.getArgumentsCount()];
        for (int a = 0; a < call.getArgumentsCount(); a++) {
            args[a] = call.getArgument(a).accept(this);
        }
        IModel contextModel = environment.getContextModel();
        environment.switchContext(call.getModel());
        environment.pushLevel();
        O operation = dynamicDispatch(call.getResolved(), args);
        Object result;
        try {
            for (int p = 0; p < operation.getParameterCount(); p++) {
                environment.addValue(operation.getParameter(p), args[p]);
            }
            result = executeModelCall(operation);
        } catch (VilLanguageException e) {
            throw new ExpressionException(e);
        } finally {
            try {
                environment.popLevel();
            } catch (ArtifactException e) {
                throw new ExpressionException(e);
            } finally {
                environment.switchContext(contextModel);
            }
        }
        return result;
    }
    
    /**
     * Performs the dynamic dispatch on the operation type.
     * 
     * @param operation the operation to be dispatched
     * @param args the actual arguments
     * @return <code>operation</code> or the more actual operation
     */
    protected abstract O dynamicDispatch(O operation, Object[] args);
    
    /**
     * Actually executes a model call. Basically, a subclassing visitor shall
     * call the related visit method. Currently, this method is intended
     * to facilitate reuse and not declared in the visitor in order to avoid
     * further template parameters etc.
     * 
     * @param operation the operation to be executed
     * @return the execution result
     * @throws VilLanguageException in case that execution fails
     */
    protected abstract Object executeModelCall(O operation) throws VilLanguageException;

    /**
     * Executes the main operation. Prerequisite is that (at least the leading) parameters of <code>model</code>
     * are assignable to the parameters of the <code>operation</code>. This must be ensured by the caller. More
     * parameters in <code>model</code> ("varargs" passed from the instantiator) are ignored.
     * 
     * @param model the model to execute the operation on
     * @param operation the operation
     * @return the result of the execution
     * @throws VilLanguageException if execution fails
     */
    protected Object executeMain(M model, O operation) throws VilLanguageException {
        Object result;
        environment.pushLevel();
        environment.increaseIndentation();
        // we do the main call via the call expression to get the parameter right
        // we just ignore more parameters in the model
        CallArgument[] args = new CallArgument[operation.getParameterCount()];
        for (int p = 0; p < operation.getParameterCount(); p++) {
            V opPar = operation.getParameter(p);
            V modelPar = model.getParameter(p);
            if (!opPar.getType().isAssignableFrom(modelPar.getType())) {
                throw new VilLanguageException("model parameter " + modelPar.getName() + " of type " 
                    + modelPar.getType().getVilName() + " is not assignable to parameter " + opPar.getName() 
                    + " of type " + opPar.getType().getVilName() + " in " + operation.getName(), 
                    VilLanguageException.ID_RUNTIME_TYPE);
            }
            args[p] = new CallArgument(new VariableExpression(model.getParameter(p)));
        }
        try {
            ModelCallExpression<V, M, O> call = createModelCall(model, operation, args);
            result = call.accept(this);
            //result = execute.accept(this);
        } catch (ExpressionException e) {
            throw new VilLanguageException(e);
        } finally {
            try {
                environment.decreaseIndentation();
                environment.popLevel();
            } catch (ArtifactException e) {
                throw new VilLanguageException(e);
            }
        }
        return result;
    }
    
    /**
     * Creates a model call expression instance.
     * 
     * @param model the model
     * @param operation the operation to be called on <code>model</code>
     * @param arguments the arguments
     * @return the call expression instance
     * @throws ExpressionException in case of an erroneously qualified name
     */
    protected abstract ModelCallExpression<V, M, O> createModelCall(M model, O operation, CallArgument...arguments) 
        throws ExpressionException;

    /**
     * Returns whether a rule element may fail.
     * 
     * @param elt the element to be checked
     * @return <code>true</code> if the element may fail (guard expression), <code>false</code> else
     */
    protected boolean mayFail(Object elt) {
        boolean result = false;
        if (elt instanceof ExpressionStatement) {
            ExpressionStatement ee = (ExpressionStatement) elt;
            Expression ex = ee.getExpression();
            // not nice, just an experiment
            result = !(ex instanceof CallExpression 
                || ex instanceof MapExpression || ex instanceof ModelCallExpression);
        }
        return result;
    }

}
