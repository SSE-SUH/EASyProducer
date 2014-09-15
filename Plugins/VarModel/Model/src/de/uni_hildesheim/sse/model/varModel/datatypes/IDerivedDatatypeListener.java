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
package de.uni_hildesheim.sse.model.varModel.datatypes;


/**
 * Interface for <tt>DecisionVariableDeclaration</tt>s of {@link DerivedDatatype} to get informed
 * whenever the constraints of the related {@link DerivedDatatype} changes.
 * @author El-Sharkawy
 *
 */
public interface IDerivedDatatypeListener {
    
    /**
     * Causes the <tt>DecisionVariableDeclaration</tt> to generate new internal constraints based
     * on the new constraints stored inside the {@link DerivedDatatype} . 
     */
    public void constraintsChanged();

}
