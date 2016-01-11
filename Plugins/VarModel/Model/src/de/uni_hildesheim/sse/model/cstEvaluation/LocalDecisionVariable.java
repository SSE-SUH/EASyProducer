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
package de.uni_hildesheim.sse.model.cstEvaluation;

import de.uni_hildesheim.sse.model.confModel.AssignmentState;
import de.uni_hildesheim.sse.model.confModel.CompoundVariable;
import de.uni_hildesheim.sse.model.confModel.Configuration;
import de.uni_hildesheim.sse.model.confModel.ConfigurationException;
import de.uni_hildesheim.sse.model.confModel.IAssignmentState;
import de.uni_hildesheim.sse.model.confModel.IConfiguration;
import de.uni_hildesheim.sse.model.confModel.IConfigurationElement;
import de.uni_hildesheim.sse.model.confModel.IConfigurationVisitor;
import de.uni_hildesheim.sse.model.confModel.IDecisionVariable;
import de.uni_hildesheim.sse.model.confModel.IFreezeSelector;
import de.uni_hildesheim.sse.model.varModel.AbstractVariable;
import de.uni_hildesheim.sse.model.varModel.DecisionVariableDeclaration;
import de.uni_hildesheim.sse.model.varModel.datatypes.Compound;
import de.uni_hildesheim.sse.model.varModel.datatypes.Container;
import de.uni_hildesheim.sse.model.varModel.datatypes.Reference;
import de.uni_hildesheim.sse.model.varModel.values.CompoundValue;
import de.uni_hildesheim.sse.model.varModel.values.ContainerValue;
import de.uni_hildesheim.sse.model.varModel.values.NullValue;
import de.uni_hildesheim.sse.model.varModel.values.ReferenceValue;
import de.uni_hildesheim.sse.model.varModel.values.Value;

/**
 * A local decision variable representing a parameter or a local variable. A local decision variable
 * must also return local decision variables (in order to remain "local").
 * 
 * @author Holger Eichelberger
 */
public class LocalDecisionVariable implements IDecisionVariable {

    static final String ITERATOR_RESULT_VARNAME = "*r*";
    
    private DecisionVariableDeclaration decl;
    private Value value;
    private IAssignmentState state;
    private IConfiguration conf;
    private IDecisionVariable parent;

    /**
     * Creates a local decision variable.
     * 
     * @param decl the defining variable declaration
     * @param conf the configuration
     * @param parent the parent decision variable for call-by-reference, may be <b>null</b>
     */
    public LocalDecisionVariable(DecisionVariableDeclaration decl, IConfiguration conf, IDecisionVariable parent) {
        this.decl = decl;
        this.state = AssignmentState.UNDEFINED;
        this.conf = conf;
        this.parent = parent;
    }

    @Override
    public IConfigurationElement getParent() {
        return null;
    }

    @Override
    public Configuration getConfiguration() {
        return null; // would work if the return value would be IConfiguration, let's cross our fingers
    }

    @Override
    public boolean isNested() {
        return false;
    }

    @Override
    public IAssignmentState getState() {
        return state;
    }

    @Override
    public void setValue(Value value, IAssignmentState state, IConfigurationElement nested)
        throws ConfigurationException {
        this.value = value;
        this.state = state;
    }

    @Override
    public void freeze(IFreezeSelector selector) {
        // local variables cannot be frozen
    }

    @Override
    public void unfreeze(IAssignmentState state) {
        // local variables cannot be frozen
    }
    
    @Override
    public void freeze(String nestedElement) {
        // local variables cannot be frozen
    }

    @Override
    public AbstractVariable getDeclaration() {
        return decl;
    }

    @Override
    public void accept(IConfigurationVisitor visitor) {
        // local variables cannot be visited
    }

    @Override
    public Value getValue() {
        return value;
    }

    @Override
    public void setValue(Value value, IAssignmentState state) throws ConfigurationException {
        setValue(value, state, null);
    }

    @Override
    public void setHistoryValue(Value value, IAssignmentState state) throws ConfigurationException {
        // ignore
    }

    @Override
    public int getNestedElementsCount() {
        int result;
        if (null != parent) {
            result = parent.getNestedElementsCount();
        } else if (value instanceof ContainerValue) {
            result = ((ContainerValue) value).getElementSize();
        } else if (value instanceof CompoundValue) {
            result = ((Compound) value.getType()).getElementCount();
        } else {
            result = 0;
        }
        return result;
    }
    
    /**
     * Dereferences a value.
     * 
     * @param conf the configuration access
     * @param value the value to be dereferenced
     * @return the dereferenced value
     */
    static Value dereference(IConfiguration conf, Value value) {
        while (value instanceof ReferenceValue) {
            IDecisionVariable var = conf.getDecision(((ReferenceValue) value).getValue());
            if (null != var) {
                value = var.getValue();
            }
        }
        return value;
    }

    @Override
    public IDecisionVariable getNestedElement(int index) {
        IDecisionVariable result;
        if (null != parent) {
            result = parent.getNestedElement(index);
        }
        if (value instanceof ContainerValue) {
            Value cValue = ((ContainerValue) value).getElement(index);
            Container cType = (Container) cValue.getType();
            LocalDecisionVariable var = new LocalDecisionVariable(new DecisionVariableDeclaration(String.valueOf(index),
                cType.getContainedType(), cType), conf, null);
            try {
                var.setValue(cValue, AssignmentState.ASSIGNED);
            } catch (ConfigurationException e) {
            }
            result = var;
        } else if (value instanceof CompoundValue) {
            CompoundValue cValue = (CompoundValue) value;
            Compound type = (Compound) cValue.getType();
            DecisionVariableDeclaration slotDecl = type.getElement(index);
            LocalDecisionVariable var = new LocalDecisionVariable(slotDecl, conf, null);
            Value slotValue = cValue.getNestedValue(slotDecl.getName());
            try {
                var.setValue(slotValue, AssignmentState.ASSIGNED);
            } catch (ConfigurationException e) {
            }
            result = var;
        } else {
            result = null;
        }
        return result;
    }
    
    /**
     * Returns the nested variable for the given slot name.
     * 
     * @param slotName the slot name
     * @return the nested variable or <b>null</b> if it does not exist
     */
    public IDecisionVariable getNestedVariable(String slotName) {
        IDecisionVariable result = null;
        if (parent instanceof CompoundVariable) {
            result = ((CompoundVariable) parent).getNestedVariable(slotName);
        } else {
            Value tmp = dereference(conf, value);
            if (tmp instanceof CompoundValue) { // not available for Container
                CompoundValue cValue = (CompoundValue) tmp;
                Compound type = (Compound) cValue.getType();
                DecisionVariableDeclaration slotDecl = type.getElement(slotName);
                if (null != slotDecl) {
                    Value slotValue = cValue.getNestedValue(slotName);
                    if (!Reference.TYPE.isAssignableFrom(slotDecl.getType())) { // don't dereference references
                        slotValue = dereference(conf, slotValue);
                    }
                    LocalDecisionVariable var = new LocalDecisionVariable(slotDecl, conf, null);
                    if (null != slotValue) {
                        try {
                            var.setValue(slotValue, AssignmentState.ASSIGNED);
                        } catch (ConfigurationException e) {
                        }
                    }
                    result = var;
                }
            } 
        }
        return result;
    }

    @Override
    public int getAttributesCount() {
        return 0;
    }

    @Override
    public IDecisionVariable getAttribute(int index) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int getNestedDepth() {
        return 0;
    }

    @Override
    public boolean isVisible() {
        return false;
    }

    @Override
    public boolean hasValue() {
        return null != value;
    }

    @Override
    public boolean hasNullValue() {
        return NullValue.INSTANCE == value;
    }

    @Override
    public boolean removeDerivedValues() {
        // Should not be needed here.
        return false;
    }

    @Override
    public String getQualifiedName() {
        return getDeclaration().getQualifiedName();
    }
}
