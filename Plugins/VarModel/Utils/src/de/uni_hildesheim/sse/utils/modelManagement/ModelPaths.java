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
package de.uni_hildesheim.sse.utils.modelManagement;

import java.net.URI;
import java.util.List;

/**
 * Model paths are similar to classpaths. Currently, this class is not implemented but represents the concept.
 * Instances of this class cannot be created directly rather than being obtained from {@link ModelManagement}.
 * 
 * @author Holger Eichelberger
 */
public class ModelPaths {

    /**
     * Prevents from creating instances from outside this package.
     */
    ModelPaths() {
    }
    
    /**
     * Returns the model path for a given URI.
     * 
     * @param uri the URI pointing to the model path
     * @return the model path in terms of URIs (always <b>null</b>)
     */
    public List<String> getModelPath(URI uri) {
        // currently we do not have model paths ;)
        return null;
    }

}
