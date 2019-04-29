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
package test.net.ssehub.easy.reasoning.sseReasoner.qm;

import test.net.ssehub.easy.reasoning.sseReasoner.TestDescriptor;

/**
 * Hardware constraint: algNamesUnique = algorithms->collect(a|a.name).size() == algorithms.size() test.
 * 
 * @author Sizonenko
 * @author El-Sharkawy
 */
public class QMAlgorithmsTest1 extends test.net.ssehub.easy.reasoning.core.qm.QMAlgorithmsTest1 {

    /**
     * Creates a specific test instance.
     */
    public QMAlgorithmsTest1() {
        super(TestDescriptor.INSTANCE);
    }
    
}
