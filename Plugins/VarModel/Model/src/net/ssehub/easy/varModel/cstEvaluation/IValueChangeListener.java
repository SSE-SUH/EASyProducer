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
package net.ssehub.easy.varModel.cstEvaluation;

import net.ssehub.easy.varModel.confModel.IDecisionVariable;
import net.ssehub.easy.varModel.model.values.Value;

/**
 * Is called when the {@link EvaluationVisitor} changes a value in the configuration.
 * 
 * @author Holger Eichelberger
 */
public interface IValueChangeListener {
    
    /**
     * Called if the value of a variable has been modified.
     * 
     * @param variable the modified variable
     * @param oldValue the value of <code>variable</code> before the change (may be <b>null</b>)
     */
    public void notifyChanged(IDecisionVariable variable, Value oldValue);
    
    /**
     * Called if an assignment to the given <code>variable</code> failed as the defining
     * expression cannot be evaluated, e.g., due to an undefined variable.
     * 
     * @param variable the variable that the evaluator was about to modify
     */
    public void notifyUnresolved(IDecisionVariable variable);
}