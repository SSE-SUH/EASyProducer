/*
 * Copyright 2009-2013 University of Hildesheim, Software Systems Engineering
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
package net.ssehub.easy.varModel.confModel;

import net.ssehub.easy.basics.logger.EASyLoggerFactory;
import net.ssehub.easy.basics.logger.EASyLoggerFactory.EASyLogger;
import net.ssehub.easy.varModel.Bundle;
import net.ssehub.easy.varModel.model.AbstractVariable;
import net.ssehub.easy.varModel.model.DecisionVariableDeclaration;
import net.ssehub.easy.varModel.model.datatypes.Compound;
import net.ssehub.easy.varModel.model.datatypes.Container;
import net.ssehub.easy.varModel.model.datatypes.DerivedDatatype;
import net.ssehub.easy.varModel.model.values.CompoundValue;
import net.ssehub.easy.varModel.model.values.ContainerValue;
import net.ssehub.easy.varModel.model.values.Value;
import net.ssehub.easy.varModel.model.values.ValueDoesNotMatchTypeException;

/**
 * 
 * {@link VariableConfigProvider} for not nested variables.
 * 
 * @author El-Sharkawy
 *
 */
class ToplevelVarConfigProvider extends VariableConfigProvider {
    
    private static final EASyLogger LOGGER
        = EASyLoggerFactory.INSTANCE.getLogger(ToplevelVarConfigProvider.class, Bundle.ID);
    
    private Value value;
    private IAssignmentState state;
    private IDecisionVariable relatedVariable;
    
    /**
     * Sole constructor for creating a {@link VariableConfigProvider} for a toplevel {@link IDecisionVariable}.
     * @param relatedVariable The {@link IDecisionVariable} where this {@link VariableConfigProvider} belongs to
     *     (must not be <tt>null</tt>).
     * @param value The (initial) value of the related {@link IDecisionVariable} (can be <tt>null</tt> for lazy
     *     initialization).
     * @param state The initial {@link IAssignmentState} of the related {@link IDecisionVariable}.
     *     In case of <tt>null</tt> the state will be set to {@link AssignmentState#UNDEFINED}.
     */
    protected ToplevelVarConfigProvider(IDecisionVariable relatedVariable, Value value, IAssignmentState state) {
        super();
        this.relatedVariable = relatedVariable;
        this.value = value;
        if (null == state) {
            this.state = AssignmentState.UNDEFINED;
        } else {
            this.state = state;            
        }
    }

    @Override
    protected Value getValue() {
        return value;
    }

    @Override
    protected void setValue(Value value, IAssignmentState state) throws ConfigurationException {
        if (this.state != AssignmentState.FROZEN) {
            assignValue(value, state, false);
        } else if (null == this.value && this.state == AssignmentState.FROZEN && null != value
            && !value.isConfigured()) {
            // Allow lazy initialization of empty value
            this.value = value;
        } else {
            throw new ConfigurationException(getConfiguration(), 
                "decision '" + getDeclaration().getName() 
                + "' is already frozen and cannot be changed", ConfigurationException.ALREADY_FROZEN);
        }
    }

    @Override
    protected IAssignmentState getState() {
        return state;
    }
    
    @Override
    protected final void setState(IAssignmentState state) {
        this.state = state;
        getConfiguration().variableChangedState(relatedVariable);
    }

    @Override
    protected final boolean isStateChangeAllowed() {
        return true;
    }

    /**
     * Returns the Declaration of the related {@link IDecisionVariable}.
     * @return {@link IDecisionVariable#getDeclaration()}.
     */
    protected final AbstractVariable getDeclaration() {
        return relatedVariable.getDeclaration();
    }
    
    /**
     * Return the {@link Configuration} where the related {@link IDecisionVariable} belongs to.
     * @return {@link IDecisionVariable#getConfiguration()}.
     */
    protected final Configuration getConfiguration() {
        return relatedVariable.getConfiguration();
    }

    @Override
    protected void setHistoryValue(Value value, IAssignmentState state) throws ConfigurationException {
        assignValue(value, state, true);
    }

    /**
     * Assigns a value. The boolean parameter facilitates a differentiation between assignment of
     * old values and new values. In case of old values, already assigned slots of a compound
     * can be set to null. This must be avoided in case of new values (incremental build up).
     * @param value the value (may be <b>null</b> for incremental buildup)
     * @param state the related assignment state
     * @param allowDeletation <tt>true</tt> if <tt>null</tt> values can overwrite already set values of an compound.
     * @throws ConfigurationException in case that the types of 
     *   {@link #getDeclaration()} and <code>value</code> do not comply
     */
    private void assignValue(Value value, IAssignmentState state, boolean allowDeletation)
        throws ConfigurationException {
        /*
         * TODO SE: Clean up code.
         */
        Value oldValue = this.value;
        if (null != value) {
            if (!getDeclaration().getType().isAssignableFrom(value.getType())) {
                throw new ConfigurationException(getConfiguration(), "type '"
                    + getDeclaration().getType().getName() 
                    + "' of variable declaration '"
                    + getDeclaration().getName()
                    + "'do not match type of value '"
                    + value.getType().getName() + "'", ConfigurationException.TYPE_MISMATCH);
            }
            /*
             * Avoid deletion of already configured nested values.
             * This is needed for the stepwise configuration of
             * (nested) CompoundValues.
             */
            if (value instanceof CompoundValue && null != oldValue && oldValue instanceof CompoundValue) {
                value = assignCompoundValue(value, state, allowDeletation, oldValue);
            } else if (value instanceof ContainerValue) {
                value = assignContainerValue(value, state, allowDeletation);
            }
        } else if (relatedVariable.getDeclaration().getType() instanceof Container && allowDeletation) {
            ContainerVariable container = (ContainerVariable) relatedVariable;
            container.clear();
        }
        this.value = value;
        this.state = state;
        getConfiguration().variableChanged(relatedVariable, oldValue);
    }
    
    /**
     * Assigns a CompoundValue.
     * 
     * @param value the value (may be <b>null</b> for incremental buildup)
     * @param state the related assignment state
     * @param allowDeletation <tt>true</tt> if <tt>null</tt> values can overwrite already set values of an compound.
     * @param oldValue copy of value.
     * @return value
     * @throws ConfigurationException in case that the types of 
     * {@link #getDeclaration()} and <code>value</code> do not comply
     */
    private Value assignCompoundValue(Value value, IAssignmentState state, boolean allowDeletation, Value oldValue)
        throws ConfigurationException {
        CompoundValue newValue = (CompoundValue) oldValue;
        if (allowDeletation) {
//            try {
            newValue = (CompoundValue) value;
//                newValue = (CompoundValue) ValueFactory.createValue(getDeclaration().getType(),
//                    (Object[]) null);
//            } catch (ValueDoesNotMatchTypeException exc) {
//                LOGGER.exception(exc);
//            }
        } else {
            try {
                newValue.copyValuesFrom((CompoundValue) value);
            } catch (ValueDoesNotMatchTypeException exc) {
                LOGGER.exception(exc);
            }
        }
        Compound cmpType = (Compound) DerivedDatatype.resolveToBasis(getDeclaration().getType());
        for (int i = 0; i < cmpType.getInheritedElementCount(); i++) {
            String slotName = cmpType.getInheritedElement(i).getName();
            CompoundVariable cmpVar = (CompoundVariable) relatedVariable;
            Value nestedValue = newValue.getNestedValue(slotName);
            IDecisionVariable var = cmpVar.getNestedVariable(slotName);
            LOGGER.info("VAR: " + var + " STATE: " + var.getState());
            if (allowDeletation) {
                if (nestedValue == null) {
                    var.setValue(nestedValue, AssignmentState.UNDEFINED);
                } else {
                    var.setValue(nestedValue, var.getState());
                }
            } else if (null != nestedValue && null != var) {
                var.setValue(nestedValue, state);
            }
        }
        value = newValue;
        return value;
    }

    /**
     * Assigns a ContainerValue.
     * 
     * @param value the value (may be <b>null</b> for incremental buildup)
     * @param state the related assignment state
     * @param allowDeletation <tt>true</tt> if <tt>null</tt> values can overwrite already set values of an compound.
     * @return value
     * @throws ConfigurationException in case that the types of 
     * {@link #getDeclaration()} and <code>value</code> do not comply
     */
    private Value assignContainerValue(Value value, IAssignmentState state, boolean allowDeletation)
        throws ConfigurationException {
        ContainerVariable container = (ContainerVariable) relatedVariable;
        if (allowDeletation) {
            container.clear();
        }
        ContainerValue conValue = (ContainerValue) value;
        this.value = value;
        for (int i = 0; i < conValue.getElementSize(); i++) {
            String nestedName = container.getElementName(i);
            //IDatatype containerType = DerivedDatatype.resolveToBasis(relatedVariable.getDeclaration().getType());
            //IDatatype type = ((Container) containerType).getContainedType();
            DecisionVariableDeclaration nestedDecl = new DecisionVariableDeclaration(nestedName,
                conValue.getElement(i).getType(), relatedVariable.getDeclaration());
            VariableCreator creator = new VariableCreator(nestedDecl, relatedVariable,
                relatedVariable.isVisible(), false);
            IDecisionVariable nestedVar = creator.getVariable();
            container.addNestedElement(nestedVar);
            Value nesValue = conValue.getElement(i);
            nestedVar.setValue(nesValue, state);
        }
        value = conValue;
        return value;
    }

    @Override
    protected void freeze(IFreezeSelector selector) {
        freeze();
    }
}
