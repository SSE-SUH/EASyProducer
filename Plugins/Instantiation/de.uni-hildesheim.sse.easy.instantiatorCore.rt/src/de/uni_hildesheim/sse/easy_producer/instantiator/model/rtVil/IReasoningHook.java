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
package de.uni_hildesheim.sse.easy_producer.instantiator.model.rtVil;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.configuration.Configuration;
import de.uni_hildesheim.sse.reasoning.core.reasoner.Message;
import de.uni_hildesheim.sse.utils.messages.Status;

/**
 * A reasoning hook allowing the system using the rt-VIL environment to influence the validity
 * of the (intermediate) reasoning result, e.g., to distinguish trigger constraints / variables
 * from actor (consistency) constraints / variables.
 * 
 * @author Holger Eichelberger
 */
public interface IReasoningHook {
    
    /**
     * May change the configuration before reasoning. Use this only to manipulate trigger variables.
     * Original values must be restored in {@link #postReasoning(Configuration)}.
     * 
     * @param script the rt-VIL script this method is called within
     * @param concept the specific concept on which the call is being executed
     * @param values reading access to the actual rt-VIL variable values
     * @param config the actual configuration
     */
    public void preReasoning(Script script, IRtVilConcept concept, IRtValueAccess values, Configuration config);
    
    /**
     * Analyzes a reasoning message in order to determine whether it is actually represents reasoning 
     * error. This can be used to exclude failing variables that are flagged by a certain attribute.
     * 
     * @param script the rt-VIL script this method is called within
     * @param concept the specific concept on which the call is being executed
     * @param values reading access to the actual rt-VIL variable values
     * @param message the message to be analyzed
     * @return the status, <b>null</b> if the message shall be ignored, i.e., it does not turn the 
     *     reasoning result to failed / inconsistent
     */
    public Status analyze(Script script, IRtVilConcept concept, IRtValueAccess values, Message message);
    
    /**
     * Reverts configuration changes done by {@link #preReasoning(Configuration)} after reasoning.
     * 
     * @param script the rt-VIL script this method is called within
     * @param concept the specific concept on which the call is being executed
     * @param values reading access to the actual rt-VIL variable values
     * @param config the actual configuration
     */
    public void postReasoning(Script script, IRtVilConcept concept, IRtValueAccess values, Configuration config);

}