/*
 * Copyright 2009-2014 University of Hildesheim, Software Systems Engineering
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
package net.ssehub.easy.instantiation.maven;

import org.osgi.service.component.ComponentContext;

import net.ssehub.easy.dslCore.DefaultLib;
import net.ssehub.easy.instantiation.core.model.vilTypes.IRegistration;
import net.ssehub.easy.instantiation.core.model.vilTypes.TypeRegistry;

/**
 * Registers the Java additions to VIL.
 * 
 * @author Holger Eichelberger
 */
public class Registration implements IRegistration {

    private static boolean registered = false;

    /**
     * Registers the Java artifacts and instantiators.
     */
    public static final void register() {
        register(null);
    }
    
    /**
     * Registers the Java artifacts and instantiators.
     * 
     * @param context the component context, may be <b>null</b>
     */
    private static final void register(ComponentContext context) {
        if (!registered) {
            registered = true;
            TypeRegistry.DEFAULT.register(Maven.class);
            DefaultLib.appendDefaultLibURLQuietly(Registration.class.getClassLoader(), 
                Activator.BUNDLE_ID, context, "Instantiator.Maven");
        }
    }
    
    /**
     * Private method to activate plugin.
     * @param context Context.
     */
    protected void activate(ComponentContext context) {
        // this is not the official way of using DS but the official way is instable
        register(context);
    }

    /**
     * Private method to to de-activate plugin.
     * @param context Context.
     */
    protected void deactivate(ComponentContext context) {
        // this is not the official way of using DS but the official way is instable
    }

}
