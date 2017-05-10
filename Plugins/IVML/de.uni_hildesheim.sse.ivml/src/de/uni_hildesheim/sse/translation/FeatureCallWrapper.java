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
package de.uni_hildesheim.sse.translation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_hildesheim.sse.ivml.ActualParameterList;
import de.uni_hildesheim.sse.ivml.FeatureCall;
import de.uni_hildesheim.sse.ivml.IvmlPackage;

/**
 * A call wrapper representing a set operation to be resolved as a feature call.
 * 
 * @author Holger Eichelberger
 */
class FeatureCallWrapper implements ICall {

    private FeatureCall call;

    /**
     * Creates a call wrapper for a feature call.
     * 
     * @param call the call
     */
    FeatureCallWrapper(FeatureCall call) {
        this.call = call;
    }
    
    @Override
    public String getName() {
        return call.getName();
    }

    @Override
    public ActualParameterList getArguments() {
        return call.getParam();
    }

    @Override
    public EObject getCause() {
        return call;
    }

    @Override
    public EStructuralFeature getNameFeature() {
        return IvmlPackage.Literals.FEATURE_CALL__NAME;
    }

    @Override
    public EStructuralFeature getArgumentsFeature() {
        return IvmlPackage.Literals.FEATURE_CALL__PARAM;
    }
    
}