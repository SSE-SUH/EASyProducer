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
package de.uni_hildesheim.sse.model.varModel;

import de.uni_hildesheim.sse.model.varModel.datatypes.IDatatype;

/**
 * Facilitates attribute propagation to parent project.
 * 
 * @author Holger Eichelberger
 */
class ProjectDecisionVariableDeclaration extends DecisionVariableDeclaration {
    
    /**
     * Constructor for decision variable declaration.
     * @param name Name of the decision variable declaration
     * @param type type of the new VariableDeclaration
     * @param parent the object, in which this specific one is embedded
     */
    public ProjectDecisionVariableDeclaration(String name, IDatatype type, ModelElement parent) {
        super(name, type, parent);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean attribute(Attribute attribute) {
        return super.attribute(attribute) && getParent().propagateAttribute(attribute);
    }
    
}