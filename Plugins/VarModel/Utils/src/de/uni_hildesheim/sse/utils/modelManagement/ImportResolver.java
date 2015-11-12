/*
 * Copyright 2009-2015 University of Hildesheim, Software Systems Engineering
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
package de.uni_hildesheim.sse.utils.modelManagement;

import java.net.URI;
import java.util.List;

import de.uni_hildesheim.sse.utils.messages.IMessage;

/**
 * Basic implementation of a model import resolver. 
 * 
 * @param <M> the specific model type
 * 
 * @author Holger Eichelberger
 */
public abstract class ImportResolver<M extends IModel> { // once, this class had some implementation

    /**
     * Clears this instance for reuse.
     */
    public void clear() {
    }
    
    /**
     * Resolves the imports of the given <code>model</code> and returns
     * messages on failures. Exceptions might be appropriate here but the
     * caller shall be able to decide how to handle the level of detail, i.e.
     * whether the first message shall be emitted or all. May modify <code>model</code>
     * as a side effect.
     * 
     * @param model the model to be resolved
     * @param uri the URI of the model to resolve (in order to find the closest 
     *   model, may be <b>null</b>)
     * @param inProgress the model information objects of the models currently being 
     *   processed at once (may be <b>null</b>)  
     * @param repository the model repository
     * @param evaluationContext the context for evaluating import restrictions (variable definitions... 
     *   interpreted locally)
     * @return messages which occur during resolution
     */
    public abstract List<IMessage> resolveImports(M model, URI uri, List<ModelInfo<M>> inProgress, 
        IModelRepository<M> repository, IRestrictionEvaluationContext evaluationContext);

    /**
     * Resolves the denoted model considering the given <code>restrictions</code>.
     * 
     * @param modelName the name of the model
     * @param restriction the version restriction (may be <b>null</b> if there is none)
     * @param baseUri the URI to start resolving from (may be the URI of a model)
     * @param repository the model repository
     * @param evaluationContext the context for evaluating import restrictions (variable definitions... 
     *   interpreted locally)
     * @return the resolved model
     * @throws ModelManagementException in case of resolution failures
     */
    public abstract M resolve(String modelName, IVersionRestriction restriction, URI baseUri, 
        IModelRepository<M> repository, IRestrictionEvaluationContext evaluationContext) 
        throws ModelManagementException;
    
}
