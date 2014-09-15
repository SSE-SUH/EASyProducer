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

import de.uni_hildesheim.sse.model.confModel.IDecisionVariable;

/**
 * Special {@link IValueChangeListener} which is used during the tests.
 * This listener checks, whether it was called.
 * @author El-Sharkawy
 *
 */
abstract class ValueChangeListener implements IValueChangeListener {

    private boolean wasCalled = false;
    
    /**
     * Returns whether this listener was called.
     * @return <tt>true</tt> if this listener was callled.
     */
    boolean wasCalled() {
        return wasCalled;
    }

    @Override
    public void notifyChanged(IDecisionVariable variable) {
        wasCalled = true;
        valueChanged(variable);
    }
    
    /**
     * Called if the value of a variable has been modified.
     * 
     * @param variable the modified variable
     */
    abstract void valueChanged(IDecisionVariable variable);

    @Override
    public void notifyUnresolved(IDecisionVariable variable) {
        wasCalled = true;
        valueUnresolved(variable);
    }
    
    /**
     * Called if the value of a variable cannot be modified
     * as it is unresolved.
     * 
     * @param variable the variable that cannot be modified
     */
    abstract void valueUnresolved(IDecisionVariable variable);

}
