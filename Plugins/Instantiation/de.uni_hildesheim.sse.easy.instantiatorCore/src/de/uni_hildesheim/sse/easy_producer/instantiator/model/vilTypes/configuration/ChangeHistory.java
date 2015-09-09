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
package de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.configuration;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.IStringValueProvider;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.IVilType;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Invisible;
import de.uni_hildesheim.sse.model.confModel.IConfigurationChangeListener;
import de.uni_hildesheim.sse.model.confModel.IDecisionVariable;
import de.uni_hildesheim.sse.model.varModel.values.NullValue;
import de.uni_hildesheim.sse.model.varModel.values.Value;

/**
 * Implements a checkpointing change history of variable changes. Changes are traced in
 * a kind of transaction marked by {@link #start()}, and ending with {@link #commit()}, {@link #rollback()} or 
 * {@link #commitAll()} on a change set stack. On committed, they are either committed in the next
 * change set on the stack or into the global set of committed variables.
 * 
 * @author Holger Eichelberger
 */
public class ChangeHistory implements IVilType, IStringValueProvider {

    private Configuration configuration;
    private CSet originalValues = new CSet();
    private CSet committed = new CSet();
    private Stack<CSet> changeSetStack = new Stack<CSet>();
    private IConfigurationChangeListener changeListener = new ChangeListener();
    
    /**
     * Creates a change history.
     * 
     * @param configuration the configuration to track changes for
     */
    ChangeHistory(Configuration configuration) {
        this.configuration = configuration;
        this.configuration.getConfiguration().register(changeListener);
    }
    
    @Override
    protected void finalize() throws Throwable {
        // for now
        this.configuration.getConfiguration().unregister(changeListener);
        super.finalize();
    }
    
    /**
     * Defines the type of a change set.
     * 
     * @author Holger Eichelberger
     */
    @SuppressWarnings("serial")
    private static class CSet extends HashMap<AbstractIvmlVariable, Value> {
        
        /**
         * Adds all {@link IvmlElement elements} to <code>result</code>.
         * 
         * @param result the set to be changed as a side effect
         */
        private void addAllIvmlElements(Set<AbstractIvmlVariable> result) {
            for (AbstractIvmlVariable var : keySet()) {
                result.add(var);
            }
        }

        /**
         * Adds all original decision variables of all {@link IvmlElement elements} to <code>result</code>.
         * 
         * @param result the set to be changed as a side effect
         */
        private void addAllDecisionVariables(Set<IDecisionVariable> result) {
            for (AbstractIvmlVariable var : keySet()) {
                result.add(var.getVariable());
            }
        }

    }

    /**
     * Implements a change listener to track reasoning changes to the configuration.
     * 
     * @author Holger Eichelberger
     */
    private class ChangeListener implements IConfigurationChangeListener {

        @Override
        public void itemChanged(de.uni_hildesheim.sse.model.confModel.Configuration config,
            IDecisionVariable changedVariable, Value oldValue) {
            // check config?
            IvmlElement elt = configuration.get(changedVariable.getDeclaration().getQualifiedName());
            if (elt instanceof AbstractIvmlVariable) {
                notifyChanged((AbstractIvmlVariable) elt, oldValue);
            }
        }

        @Override
        public void stateChanged(de.uni_hildesheim.sse.model.confModel.Configuration config,
            IDecisionVariable changedVariable) {
        }

        @Override
        public void configurationRefreshed(de.uni_hildesheim.sse.model.confModel.Configuration config) {
        }
        
    }

    /**
     * Starts a new change set.
     */
    public void start() {
        changeSetStack.push(new CSet());
    }
    
    /**
     * Rolls back the most recent change set. Nothing happens if the stack is empty.
     */
    public void rollback() {
        if (!changeSetStack.isEmpty()) {
            CSet top = changeSetStack.pop();
            for (Map.Entry<AbstractIvmlVariable, Value> entry : top.entrySet()) {
                entry.getKey().setValue(entry.getValue());
            }
        }
    }
    
    /**
     * Commits the most recent change set into the one before or if there is none into the committed set.
     * Clears the most recent change set. Nothing happens if the stack is empty.
     */
    public void commit() {
        if (!changeSetStack.isEmpty()) {
            CSet top = changeSetStack.pop();
            CSet target;
            if (changeSetStack.isEmpty()) {
                target = committed;
            } else {
                target = changeSetStack.peek();
            }
            for (Map.Entry<AbstractIvmlVariable, Value> entry : top.entrySet()) {
                if (!target.containsKey(entry.getKey())) {
                    target.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
    
    /**
     * Commits the changes of all stacked change sets into the committed change set.
     */
    @Invisible
    public void commitAll() {
        while (!changeSetStack.isEmpty()) {
            commit();
        }
    }
    
    /**
     * Rolls back all the changes in the uncommitted stack.
     */
    @Invisible
    public void rollbackAll() {
        while (!changeSetStack.isEmpty()) {
            rollback();
        }
    }
    
    /**
     * Returns the original value of a variable before any explicit change. This method
     * is made accessible through <code>variable</code> itself.
     * 
     * @param variable the 
     * @return the original value
     */
    @Invisible
    public Value getOriginalValue(AbstractIvmlVariable variable) {
        Value value = originalValues.get(variable);
        if (null == value) {
            value = variable.getVariable().getValue();
        }
        return value;
    }

    /**
     * Rolls back all all changes.
     */
    @Invisible
    public void rollbackSimulation()  {
        rollbackAll();
        for (Map.Entry<AbstractIvmlVariable, Value> entry : committed.entrySet()) {
            entry.getKey().setValue(entry.getValue());
        }
        clear(true);
    }

    /**
     * Notifies the change set about a changed variable.
     * 
     * @param variable the variable
     * @param value the old value
     */
    @Invisible
    void notifyChanged(AbstractIvmlVariable variable, Value value) {
        CSet changeSet;
        if (!originalValues.containsKey(variable)) {
            originalValues.put(variable, variable.getVariable().getValue());
        }
        if (!changeSetStack.isEmpty()) {
            changeSet = changeSetStack.peek();
        } else {
            changeSet = committed;
        }
        if (!changeSet.containsKey(variable)) { // keep the oldest value, not the intermediate updates
            if (null == value) { // cannot play back Java null, needs IVML null to unconfigure
                value = NullValue.INSTANCE;
            }
            changeSet.put(variable, value);
        }
    }
    
    /**
     * Returns all changed variables.
     * 
     * @return all changed variables
     */
    @Invisible
    Set<AbstractIvmlVariable> changed() {
        Set<AbstractIvmlVariable> enabled = new HashSet<AbstractIvmlVariable>();
        committed.addAllIvmlElements(enabled);
        for (int i = 0; i < changeSetStack.size(); i++) {
            changeSetStack.get(i).addAllIvmlElements(enabled);
        }
        return enabled;
    }

    /**
     * Returns a filter for all changed variables.
     * 
     * @return a filter for all changed variables
     */
    @Invisible
    IVariableFilter changedFilter() {
        Set<IDecisionVariable> enabled = new HashSet<IDecisionVariable>();
        committed.addAllDecisionVariables(enabled);
        for (int i = 0; i < changeSetStack.size(); i++) {
            changeSetStack.get(i).addAllDecisionVariables(enabled);
        }
        return new SetVariablesFilter(enabled);
    }

    @Override
    @Invisible
    public String getStringValue(StringComparator comparator) {
        return "<change set>";
    }

    /**
     * Clears the history.
     * 
     * @param resetOriginalValues also reset original values
     */
    @Invisible
    public void clear(boolean resetOriginalValues) {
        changeSetStack.clear();
        committed.clear();
        if (resetOriginalValues) {
            originalValues.clear();
        }
    }
    
}
