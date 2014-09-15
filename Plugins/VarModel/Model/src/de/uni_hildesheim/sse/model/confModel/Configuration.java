/*
 * Copyright 2009-2014 University of Hildesheim, Software Systems Engineering
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.uni_hildesheim.sse.model.confModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import de.uni_hildesheim.sse.Bundle;
import de.uni_hildesheim.sse.model.management.VarModel;
import de.uni_hildesheim.sse.model.varModel.AbstractVariable;
import de.uni_hildesheim.sse.model.varModel.Attribute;
import de.uni_hildesheim.sse.model.varModel.AttributeAssignment;
import de.uni_hildesheim.sse.model.varModel.ContainableModelElement;
import de.uni_hildesheim.sse.model.varModel.DecisionVariableDeclaration;
import de.uni_hildesheim.sse.model.varModel.IFreezable;
import de.uni_hildesheim.sse.model.varModel.IModelElement;
import de.uni_hildesheim.sse.model.varModel.IProjectListener;
import de.uni_hildesheim.sse.model.varModel.Project;
import de.uni_hildesheim.sse.model.varModel.datatypes.Compound;
import de.uni_hildesheim.sse.model.varModel.datatypes.IDatatype;
import de.uni_hildesheim.sse.model.varModel.datatypes.Reference;
import de.uni_hildesheim.sse.model.varModel.datatypes.Set;
import de.uni_hildesheim.sse.model.varModel.datatypes.TypeQueries;
import de.uni_hildesheim.sse.model.varModel.filter.DeclarationFinder;
import de.uni_hildesheim.sse.model.varModel.filter.DeclarationFinder.VisibilityType;
import de.uni_hildesheim.sse.model.varModel.filter.FilterType;
import de.uni_hildesheim.sse.model.varModel.filter.FrozenElementsFinder;
import de.uni_hildesheim.sse.model.varModel.values.ReferenceValue;
import de.uni_hildesheim.sse.model.varModel.values.Value;
import de.uni_hildesheim.sse.model.varModel.values.ValueDoesNotMatchTypeException;
import de.uni_hildesheim.sse.model.varModel.values.ValueFactory;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory;

/**
 * Represents a configuration, i.e. a set of decision variables.
 * 
 * @author Holger Eichelberger
 * @author El-Sharkawy
 * @author Marcel Lueder
 */
public class Configuration implements IConfigurationVisitable, IProjectListener, Iterable<IDecisionVariable>, 
    IConfigurationElement, IConfiguration {

    /**
     * The origin project, where this configuration belongs to.
     */
    private Project project;
    
    private boolean assignValues;
    
    private LinkedHashMap<AbstractVariable, IDecisionVariable> decisions
        = new LinkedHashMap<AbstractVariable, IDecisionVariable>();
    
    private List<IConfigurationChangeListener> listeners;
    
    private Map<IDatatype, java.util.Set<Value>> allInstances;
    
    /**
     * Creates a new configuration for the given project.
     * @param project The project, where this configuration belongs to.
     * This project should already be registered at the VarModel
     * @see de.uni_hildesheim.sse.utils.modelManagement.ModelManagement
     * #updateModel(de.uni_hildesheim.sse.utils.modelManagement.IModel, java.net.URI)
     */
    public Configuration(Project project) {
        this(project, true);
    }

    /**
     * Copies a <code>configuration</code> by taking over its defined values and assignment states.
     * 
     * @param configuration the configuration to be copied
     */
    public Configuration(Configuration configuration) {
        this.project = configuration.getProject();
        VarModel.INSTANCE.events().addModelListener(project, this);
        listeners = new ArrayList<IConfigurationChangeListener>();
        if (null != project) {
            createVariables();
            for (Map.Entry<AbstractVariable, IDecisionVariable> entry : configuration.decisions.entrySet()) {
                IDecisionVariable newVar = getDecision(entry.getKey());
                if (null != newVar) {
                    IDecisionVariable oldVar = entry.getValue();
                    Value value = oldVar.getValue();
                    if (null != value) {
                        value = value.clone();
                    }
                    try {
                        newVar.setValue(value, oldVar.getState());
                    } catch (ConfigurationException e) {
                        EASyLoggerFactory.INSTANCE.getLogger(Configuration.class, Bundle.ID).exception(e);
                    }
                } // shall not occur
            }
        }
    }
    
    /**
     * Alternative constructor to avoid initial value assignment by {@link AssignmentResolver}.
     * @param project to get {@link Configuration} from.
     * @param assignValues Decision if values should be assigned by {@link AssignmentResolver}.
     */
    public Configuration(Project project, boolean assignValues) {
        this.project = project;
        this.assignValues = assignValues;
        VarModel.INSTANCE.events().addModelListener(project, this);
        listeners = new ArrayList<IConfigurationChangeListener>();
        init();
        
    }
    
    /**
     * Returns the related project.
     * 
     * @return the related project
     */
    public Project getProject() {
        return project;
    }
    
    /**
     * Returns the saved ({@link AbstractVariable}, {@link IDecisionVariable}) mapping.
     * @return A flat copy of the stored ({@link AbstractVariable}, {@link IDecisionVariable}) mappings.
     */
    @SuppressWarnings("unchecked")
    Map<AbstractVariable, IDecisionVariable> getConfiguredDecisions() {
        return (Map<AbstractVariable, IDecisionVariable>) decisions.clone();
    }
    
    /**
     * Registers a new listener.
     * @param listener A Listener which should be informed in case of changes.
     */
    public void register(IConfigurationChangeListener listener) {
        listeners.add(listener);
    }
    
    /**
     * Unregisters an listener.
     * @param listener The listener which should be unregistered.
     * @return <tt>true</tt> if this configuration contained the specified listener
     */
    public boolean unregister(IConfigurationChangeListener listener) {
        return listeners.remove(listener);
    }
    
    /**
     * This method creates the list of {@link IDecisionVariable}s
     * with initial value settings based on the given project. 
     */
    private void init() {     
        if (null != project) {
        
            VarModel.INSTANCE.resolveImports(project, null, null);
            
            //Loop adding the declarations to a list
            createVariables();            
            
            if (assignValues) {
                AssignmentResolver resolver = new AssignmentResolver(this);
                resolver.resolve();
                
                // TODO freezing shall be done incrementally by the Reasoner, currently freeze-state would not work
                // Assign frozen state to already frozen variables
                freezeValues();                
            }
        }
    }

    /**
     * This method looks for all {@link de.uni_hildesheim.sse.model.varModel.DecisionVariableDeclaration}s inside
     * the related projects, creates {@link de.uni_hildesheim.sse.model.varModel.DecisionVariableDeclaration}s and adds
     * them to this configuration.
     * While creating these {@link de.uni_hildesheim.sse.model.varModel.DecisionVariableDeclaration}s this method also
     * tries assign the specified default values to the newly created
     * {@link de.uni_hildesheim.sse.model.varModel.DecisionVariableDeclaration}s.
     */
    private void createVariables() {
        DeclarationFinder finder = new DeclarationFinder(project, FilterType.ALL, null);
        List<AbstractVariable> topLevelDeclarations = finder.getVariableDeclarations(VisibilityType.ONLY_EXPORTED);
        addVariables(topLevelDeclarations, true);
        topLevelDeclarations = finder.getVariableDeclarations(VisibilityType.ONLY_HIDDEN);       
        addVariables(topLevelDeclarations, false);
    }

    /**
     * Creates {@link IDecisionVariable}s for all given {@link AbstractVariable}s and adds them to the configuration.
     * Part of the {@link #createVariables()} method and should only be called from this method.
     * @param topLevelDeclarations The variables to add.
     * @param visible indicates whether the variable is visible to the user:
     * <ul>
     * <li><tt>true</tt>: The variable is visible by the user and can be displayed in the GUI and so on.</li> 
     * <li><tt>false</tt>: The variable is not visible by the user but must be considered in reasoning, instantiation,
     * and so on.</li> 
     * </ul>
     */
    private void addVariables(List<AbstractVariable> topLevelDeclarations, boolean visible) {
        for (int i = 0; i < topLevelDeclarations.size(); i++) {
            AbstractVariable declaration = topLevelDeclarations.get(i);
            
            try {
                createDecision(declaration, visible);
            } catch (ConfigurationException e) {
                // TODO SE: Check whether we must throw this exception
                e.printStackTrace();
            }
        }
    }

    /**
     * Creates a visible decision in this configuration. The declaration must be (indirectly) member of
     * the project represented by this configuration and not created before.
     * 
     * @param decl the declaration to create the decision for
     * @return the created decision variable, may be <b>null</b> if the conditions are not met
     * @throws ConfigurationException in case that creating the variable failed
     */
    public IDecisionVariable createDecision(AbstractVariable decl) throws ConfigurationException {
        // we need dynamic modification capabilities!
        IDecisionVariable result = null;
        if (project == decl.getTopLevelParent() && null == getDecision(decl)) {
            result = createDecision(decl, true);
        }
        return result;
    }

    /**
     * Creates a decision in this configuration. 
     * 
     * @param decl the declaration to create the decision for
     * @param visible whether the variable shall be visible
     * @return the created decision variable
     * @throws ConfigurationException in case that creating the variable failed
     */
    private IDecisionVariable createDecision(AbstractVariable decl, boolean visible) throws ConfigurationException {
        VariableCreator creator = new VariableCreator(decl, this, visible);
        IDecisionVariable variable = creator.getVariable();
        addDecision(variable);
        if (null != allInstances) {
            allInstances.remove(decl.getType()); // or in future... add to instances
        }
        return variable;
    }
    
    /**
     * Sets {@link AssignmentState#FROZEN} state to already frozen variables. 
     */
    private void freezeValues() {
        FrozenElementsFinder finder = new FrozenElementsFinder(project, FilterType.ALL);
        List<IFreezable> frozenElements = finder.getFrozenElements();
        
        for (int i = 0; i < frozenElements.size(); i++) {
            IFreezable frozenElement = frozenElements.get(i);
            if (frozenElement instanceof AbstractVariable) {
                freezeValues((AbstractVariable) frozenElement);
            } else if (frozenElement instanceof Project) {
                Project prj = (Project) frozenElement;
                for (int e = 0; e < prj.getElementCount(); e++) {
                    ContainableModelElement elt = prj.getElement(e);
                    if (elt instanceof AbstractVariable) {
                        freezeValues((AbstractVariable) elt);
                    }
                }
            }
        }
    }
    
    /**
     * Sets {@link AssignmentState#FROZEN} state to the given variables <code>var</code>. 
     * 
     * @param var the variable to be frozen
     */
    private void freezeValues(AbstractVariable var) {
        if (var.isTopLevel() || var.getParent() instanceof AttributeAssignment) {
            IDecisionVariable frozenVariable = getDecision(var);
            frozenVariable.freeze();
        } else {
            IModelElement parent = var.getParent();
            System.out.println(parent);
            //TODO SE: Handle nested Variables.
            //DecisionVariableDeclaration parent = (DecisionVariableDeclaration) frozenElement.getParent();
            //freezeNestedVariable(parent, frozenElement);
        }
    }
    
    /**
     * This method calls atm only the init() Method.
     */
    public void refresh() {
        //clean list... bad implemented just for testing
        decisions.clear();
        allInstances = null;
        init();
        //maybe keep old values
        
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).configurationRefreshed(this);
        }
    }
    
    /**
     * Adda a decision.
     * 
     * @param variable the decision to be added
     */
    //Make this method private in future.
    private void addDecision(IDecisionVariable variable) {
        decisions.put(variable.getDeclaration(), variable);
    }
    
    /**
     * Returns the number of decisions.
     * 
     * @return the number of decisions
     */
    public int getDecisionCount() {
        return decisions.size();
    }
    
    /**
     * {@inheritDoc}
     */
    public IDecisionVariable getDecision(AbstractVariable declaration) {
        return decisions.get(declaration);
    }
    
    /**
     * Returns an iterator for iterating over all stored {@link IDecisionVariable}s.
     * @return an <tt>Iterator</tt> over the {@link IDecisionVariable} in this configuration.
     */
    public Iterator<IDecisionVariable> iterator() {
        Collection<IDecisionVariable> variableCollection = decisions.values();
        return variableCollection.iterator();
    }
    
    /**
     * Clears all decisions.
     */
    public void clear() {
        decisions.clear();
        allInstances = null;
    }

    /**
     * Remove a specific decision.
     * 
     * @param variable the decision to be removed
     * @return <code>true</code> if this operation was successful, <code>false</code> else
     */
    public boolean removeDecision(IDecisionVariable variable) {
        boolean containsKey = decisions.containsKey(variable.getDeclaration());
        decisions.remove(variable.getDeclaration());
        return containsKey;
    }
    
    /**
     * Returns the name of the configuration.
     * 
     * @return the name of the configuration
     */
    public String getName() {
        return project.getName();
    }
    
    /**
     * {@inheritDoc}
     */
    public void accept(IConfigurationVisitor visitor) {
        visitor.visitConfiguration(this);
    }

    /**
     * {@inheritDoc}
     */
    public void notifyReplaced(Project oldProject, Project newProject) {
        this.project = newProject;
        refresh();
    }
    
    /**
     * Turns this configuration into a project, e.g. for writing.
     * 
     * @param ownProject return an own project (<code>true</code>) or add the 
     *   configuration to {@link #project} (<code>false</code>)
     * @return the project or <b>null</b> if not implemented (default)
     * @throws ConfigurationException in case of any configuration errors
     */
    public Project toProject(boolean ownProject) throws ConfigurationException {
        return this.toProject(ownProject, true);
    }
    
    /**
     * Turns this configuration into a project, e.g. for writing.
     * 
     * @param ownProject return an own project (<code>true</code>) or add the 
     *   configuration to {@link #project} (<code>false</code>)
     * @param onlyUserInput Specifies whether only user Input should be stored:
     *     <ul>
     *     <li><tt>true:</tt> Assignments in state {@link AssignmentState#ASSIGNED} and {@link AssignmentState#FROZEN}
     *         will be saved.</li>
     *     <li><tt>false: Assignments in state {@link AssignmentState#ASSIGNED}, {@link AssignmentState#FROZEN}, and
     *         {@link AssignmentState#DERIVED} will be saved (i.e. also computed values).</tt></li>
     *     </ul>
     * @return the project or <b>null</b> if not implemented (default)
     * @throws ConfigurationException in case of any configuration errors
     */
    public Project toProject(boolean ownProject, boolean onlyUserInput) throws ConfigurationException {
        ConfigurationSaver saver = new ConfigurationSaver(this, ownProject, onlyUserInput);
        return saver.getSavedConfiguration();
    }
    
    /**
     * {@inheritDoc}
     */
    public final Configuration getConfiguration() {
        return this;
    }
    
    /**
     * {@inheritDoc}
     */
    public IConfigurationElement getParent() {
        return null;
    }
    
    /**
     * Notifies all registered {@link IConfigurationChangeListener}s that a {@link IDecisionVariable} changed.
     * 
     * @param var the {@link IDecisionVariable} which changed. This {@link IDecisionVariable}
     * should be part of this configuration (No validation).
     * @param oldValue the old value before the change, <code>var</code> then contains the new value
     */
    void variableChanged(IDecisionVariable var, Value oldValue) {
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).itemChanged(this, var, oldValue);
        }
        if (null != allInstances) {
            java.util.Set<Value> instances = allInstances.get(var.getDeclaration().getType());
            if (null != instances) {
                Value newValue = var.getValue();
                if (oldValue != newValue) {
                    if (null != oldValue) {
                        instances.remove(oldValue);
                    }
                    instances.add(newValue);
                }
            }
        }
    }
    
    /**
     * Notifies all registered {@link IConfigurationChangeListener}s
     * that a {@link IDecisionVariable} has changed its state.
     * 
     * @param var the {@link IDecisionVariable} which changed. This {@link IDecisionVariable}
     * should be part of this configuration (No validation).
     */
    void variableChangedState(IDecisionVariable var) {
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).stateChanged(this, var);
        }
    }
    
    /**
     * Adds an attribute decision to this configuration. This method is a specific functionality for user interaction. 
     * Subclass this class and make it accessible if needed, otherwise it may break the value protection provided
     * by this class. 
     * 
     * @param attribute the attribute for which the decision shall be created
     * @param value the value of the attribute (may be <b>null</b>)
     * @param state the assignment state
     * @throws ConfigurationException in case of type conflicts
     */
    protected void addAttributeDecision(Attribute attribute, Value value, IAssignmentState state) 
        throws ConfigurationException {
        VariableCreator creator = new VariableCreator(attribute, this, true);
        IDecisionVariable var = creator.getVariable();
        var.setValue(value, state);
        decisions.put(attribute, var);
    }

    /**
     * {@inheritDoc}
     */
    public boolean isNested() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public IAssignmentState getState() {
        return null;
    }
    
    /**
     * {@inheritDoc}
     */
    public void setValue(Value value, IAssignmentState state, IConfigurationElement nested) 
        throws ConfigurationException {
        throw new ConfigurationException(getConfiguration(), "operation not supported", 
            ConfigurationException.INTERNAL);
    }
    
    /**
     * Returns the declaration of the variable.
     * 
     * @return the declaration of the decision variable
     */
    public AbstractVariable getDeclaration() {
        return null;
    }

    /**
     * Freezes the whole configuration.
     */
    public void freeze() {
        for (IDecisionVariable variable : decisions.values()) {
            variable.freeze();
        }
    }

    /**
     * Unfreezes the whole configuration.
     * 
     * @param state the target state after unfreezing (must not be {@link AssignmentState#FROZEN})
     */
    public void unfreeze(IAssignmentState state) {
        for (IDecisionVariable variable : decisions.values()) {
            variable.unfreeze(state);
        }
    }
    
    /**
     * Freezes a single variable (must be a top layer element).
     * @param nestedElement The name of the top layer variable.
     */
    public void freeze(String nestedElement) {
        for (IDecisionVariable nestedVariable : decisions.values()) {
            if (nestedVariable.getDeclaration().getName().equals(nestedElement)) {
                nestedVariable.freeze();
            }
        }
    }
    
    /**
     * Dereferences a variable.
     * 
     * @param var the variable to be dereferenced (may be <b>null</b>)
     * @return the dereferenced variable (<b>null</b> if <code>var</code> was <b>null</b>)
     */
    public static IDecisionVariable dereference(IDecisionVariable var) {
        if (null != var) {
            IDatatype type = var.getDeclaration().getType();
            while (type instanceof Reference) {
                type = ((Reference) type).getType();
                if (null != var.getValue()) {
                    DecisionVariableDeclaration refDecl = ((ReferenceValue) var.getValue()).getValue();
                    var = var.getConfiguration().getDecision(refDecl);
                } else {
                    break;
                }
            }
        }
        return var;
    }

    /**
     * Adds all values of type <code>type</code> from <code>var</code> to <code>values</code>.
     * 
     * @param var the variable to be analyzed / followed
     * @param type the type to search for
     * @param values the collected values (to be modified as a side effect)
     */
    private void addValues(IDecisionVariable var, IDatatype type, java.util.Set<Value> values) {
        for (int i = 0, n = var.getNestedElementsCount(); i < n; i++) {
            IDecisionVariable tmp = var.getNestedElement(i);
            IDatatype tmpType = tmp.getDeclaration().getType();
            if (TypeQueries.sameTypes(type, tmpType)) {
                Value val = var.getValue();
                if (null != val) {
                    values.add(val);
                }
            } else if (Reference.isReferenceTo(tmpType, type)) {
                addValues(dereference(tmp), type, values);
            } else {
                addValues(tmp, type, values);
            }
        }
    }

    /**
     * Returns all instances of the given type.
     * 
     * @param type the type to look for
     * @return all instances of <code>var</code>, may be <b>null</b> if the instances cannot be retrieved, e.g., in 
     *    case of an integer variable
     */
    public Value getAllInstances(IDatatype type) {
        if (null == allInstances) {
            allInstances = new LinkedHashMap<IDatatype, java.util.Set<Value>>();
        }
        java.util.Set<Value> instances = allInstances.get(type);
        if (null == instances && Compound.TYPE.isAssignableFrom(type)) { // check type restriction
            instances = new HashSet<Value>();
            allInstances.put(type, instances);
            for (IDecisionVariable var : decisions.values()) {
                if (TypeQueries.sameTypes(type, var.getDeclaration().getType())) {
                    Value val = var.getValue();
                    if (null != val) {
                        instances.add(val);
                    }
                } else {
                    addValues(var, type, instances);
                }
            }
        }
        Value result;
        Set setType = new Set(type.getName() + "Instances", type, null);
        try {
            result = ValueFactory.createValue(setType, null == instances ? null : instances.toArray());
        } catch (ValueDoesNotMatchTypeException e) {
            result = null;
        }
        return result;
    }
    
}
