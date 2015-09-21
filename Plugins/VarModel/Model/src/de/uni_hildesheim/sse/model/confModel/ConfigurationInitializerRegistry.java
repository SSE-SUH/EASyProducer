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
package de.uni_hildesheim.sse.model.confModel;

import java.util.List;

import de.uni_hildesheim.sse.utils.messages.Message;
import de.uni_hildesheim.sse.utils.progress.ProgressObserver;

/**
 * Externalizes the initialization of a configuration, so that a specific reasoner can do this job.
 * 
 * @author Holger Eichelberger
 */
public class ConfigurationInitializerRegistry {

    private static IConfigurationInitializer initializer = Configuration.DEFAULT_INITIALIZER;
    
    /**
     * Defines the interface for the configuration initializer.
     * 
     * @author Holger Eichelberger
     */
    public interface IConfigurationInitializer {
        
        /**
         * Initializes the configuration.
         * 
         * @param config the configuration to be initialized
         * @param observer a progress observer on the initialization progress
         * @return any messages occurring during the initialization, <b>null</b> or empty denote no problems. The
         *   result may also consist of warnings only.
         */
        public List<Message> initializeConfiguration(Configuration config, ProgressObserver observer);
        
    }
    
    /**
     * Defines the global initializer.
     * 
     * @param init the initializer instance
     * @throws IllegalArgumentException if <code>init == <b>null</b></code>
     */
    public static void setInitializer(IConfigurationInitializer init) {
        if (null != init) {
            initializer = init;
        }
    }
    
    /**
     * Returns the global initializer.
     * 
     * @return the initializer instance to use
     */
    public static IConfigurationInitializer getInitializer() {
        return initializer;
    }

}