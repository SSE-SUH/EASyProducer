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
package net.ssehub.easy.instantiation.core.model.expressions;

import java.util.Locale;

import net.ssehub.easy.basics.DefaultLocale;
import net.ssehub.easy.instantiation.core.model.common.RuntimeEnvironment;

/**
 * An abstract base tracer implementation storing the actual locale.
 * 
 * @author Holger Eichelberger
 */
public abstract class AbstractTracerBase implements ITracer {

    private Locale locale = DefaultLocale.getDefaultLocale();
    private RuntimeEnvironment<?, ?> environment;
    
    @Override
    public Locale getLocale() {
        return locale;
    }
    
    @Override
    public void setLocale(Locale locale) {
        if (null != locale) {
            this.locale = locale;
        }
    }

    @Override
    public void setRuntimeEnvironment(RuntimeEnvironment<?, ?> environment) {
        this.environment = environment;
    }

    @Override
    public RuntimeEnvironment<?, ?> getRuntimeEnvironment() {
        return environment;
    }
    
}
