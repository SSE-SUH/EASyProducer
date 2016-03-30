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
package net.ssehub.easy.varModel.management;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple comment resource emulating basic functionalities of 
 * {@link java.util.Properties}, which, however, interprets IVML
 * qualified names according to its own convention.  
 * 
 * @author Holger Eichelberger
 */
public class CommentResource {

    private static final String SEPARATOR = "=";

    private Map<String, String> mapping = new HashMap<String, String>();
 
    /**
     * Creates a comment resource.
     */
    public CommentResource() {
    }
    
    /**
     * Loads the resource from a given <code>reader</code>.
     * 
     * @param reader the reader to load the resource from
     * @throws IOException in case of I/O errors
     */
    public void load(Reader reader) throws IOException {
        LineNumberReader lnr = new LineNumberReader(reader);
        String line;
        do {
            line = lnr.readLine();
            if (null != line) {
                int pos = line.indexOf(SEPARATOR);
                if (pos > 0) {
                    String key = line.substring(0, pos).trim();
                    String value = line.substring(pos + SEPARATOR.length()).trim();
                    mapping.put(key, value);
                }
            }
        } while (null != line);
    }
    
    /**
     * Stores the resource to the given writer.
     * 
     * @param writer the writer to store the resource to
     * @throws IOException in case of I/O errors
     */
    public void store(Writer writer) throws IOException {
        PrintWriter out = new PrintWriter(writer);
        out.println("# generated by IVML core at " + Calendar.getInstance());
        for (Map.Entry<String, String> ent : mapping.entrySet()) {
            out.print(ent.getKey());
            out.print(SEPARATOR);
            out.println(ent.getValue());
        }
    }
    
    /**
     * Clears this resource.
     */
    public void clear() {
        mapping.clear();
    }

    /**
     * Returns whether this resource is empty.
     * 
     * @return <code>true</code> if it is empty, <code>false</code> else
     */
    public boolean isEmpty() {
        return mapping.isEmpty();
    }
    
    /**
     * Returns the resource mapping for the given <code>key</code>.
     * 
     * @param key the key to return the mapping for
     * @return the mapped value, may be <b>null</b> if no mapping exists
     */
    public String get(String key) {
        return mapping.get(key);
    }

    /**
     * Adds a new mapping.
     * 
     * @param key the key for the mapping (must not be <b>null</b>)
     * @param value the value to be assigned to <code>key</code>
     */
    public void put(String key, String value) {
        mapping.put(key, value);
    }
    
    /**
     * Removes the mapping stored for <code>key</code>. Nothing will happen
     * if the mapping does not exist.
     * 
     * @param key the key tor remove the mapping for
     */
    public void remove(String key) {
        mapping.remove(key);
    }
    
    /**
     * Returns whether a mapping for the given <code>key</code> is known.
     * 
     * @param key the key to look for
     * @return <code>true</code> if there is a mapping, <code>false</code> else
     */
    public boolean containsKey(String key) {
        return mapping.containsKey(key);
    }
    
    @Override
    public String toString() {
        return mapping.toString();
    }
    
}