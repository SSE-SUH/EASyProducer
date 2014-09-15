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
package de.uni_hildesheim.sse.utils.messages;

/**
 * An identifiable (to be implemented by exceptions).
 * 
 * @author Holger Eichelberger
 */
public interface IIdentifiable  {
    
    /**
     * Returns a numerical identifier representing the
     * actual {@link #getMessage() message}. This identifier is used 
     * for asserting exceptions in tests.
     * 
     * @return the identifier
     */
    public int getId();

    /**
     * Returns the actual message.
     * 
     * @return the message
     */
    public String getMessage();
    
}
