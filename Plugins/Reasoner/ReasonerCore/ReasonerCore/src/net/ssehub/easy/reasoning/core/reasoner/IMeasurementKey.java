/*
 * Copyright 2009-2018 University of Hildesheim, Software Systems Engineering
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
package net.ssehub.easy.reasoning.core.reasoner;

/**
 * Base type for measurement keys.
 * 
 * @author Holger Eichelberger
 */
public interface IMeasurementKey {
    
    /**
     * An explanation/headline for this key.
     * 
     * @return the explanation
     */
    public String getExplanation();
    
    /**
     * Returns the name of the key.
     * 
     * @return the name
     */
    public String name();
    
    /**
     * Intended output position for printing.
     * 
     * @return an integer number; the higher the earlier the output
     */
    public int outputPos();
    
}
