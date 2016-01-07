/*
 * Copyright 2009-2016 University of Hildesheim, Software Systems Engineering
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
package de.uni_hildesheim.sse.model.varModel.filter.mandatoryVars;

/**
 * Settings for the {@link MandatoryDeclarationClassifier}.
 * @author El-Sharkawy
 *
 */
public class MandatoryClassifierSettings {
    
    /**
     * Consider default values as already assigned values.
     * <tt>true</tt>: Variables with default values are not mandatory, as there is already a value specified (default)
     * <tt>false</tt>: Variables with default values should be (re-)assigned by the user, if used in a constraint. 
     */
    private boolean considerDefaultValues;
    
    /**
     * Consider enumeration variables as mandatory, even if they don't have a default value.
     * <tt>true</tt>: Enumerations are mandatory, as they enforce to select exact one value. 
     * <tt>false</tt>: Enumerations are not mandatory, as all other variables (default)
     */
    private boolean considerEnumerationsAsMandatory;

    /**
     * Creates default settings.
     */
    public MandatoryClassifierSettings() {
        considerDefaultValues = true;
        considerEnumerationsAsMandatory = false;
    }
    
    /**
     * Returns whether default values should be threaten as already set values.
     * @return
     *   <tt>true</tt>: Variables with default values are not mandatory, as there is already a value specified
     *   <tt>false</tt>: Variables with default values should be (re-)assigned by the user, if used in a constraint. 
     */
    boolean considerDefaultValues() {
        return considerDefaultValues;
    }
    
    /**
     * Specification, whether default values shall be considered.
     * @param considerDefaultValues
     *   <tt>true</tt>: Variables with default values are not mandatory, as there is already a value specified
     *   <tt>false</tt>: Variables with default values should be (re-)assigned by the user, if used in a constraint. 
     */
    public void setDefaultValueConsideration(boolean considerDefaultValues) {
        this.considerDefaultValues = considerDefaultValues;
    }
    
    /**
     * Returns whether enumumeration variables shall be treaten as mandatory variables.
     * @return
     *   <tt>true</tt>: Enumerations are mandatory, as they enforce to select exact one value. 
     *   <tt>false</tt>: Enumerations are not mandatory, as all other variables
     */
    boolean treatEnumsAsMandatory() {
        return considerEnumerationsAsMandatory;
    }
    
    /**
     * Specification, whether enumeration variables shall be considered as mandatory as exactly one value should
     * be selected.
     * @param considerEnumerationsAsMandatory
     *   <tt>true</tt>: Enumerations are mandatory, as they enforce to select exact one value. 
     *   <tt>false</tt>: Enumerations are not mandatory, as all other variables
     */
    public void setTreatEnumsAsMandatory(boolean considerEnumerationsAsMandatory) {
        this.considerEnumerationsAsMandatory = considerEnumerationsAsMandatory;
    }
}
