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
package de.uni_hildesheim.sse.reasoning.qm;


import java.io.File;

import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_hildesheim.sse.reasoning.reasoner.Utils;
import net.ssehub.easy.reasonerCore.frontend.MismatchedTest;

/**
 * Qualimaster model test.
 * Model is valid.
 * 
 * @author Sizonenko
 * @author El-Sharkawy
 */
public class QMMismatchedTest extends MismatchedTest {
    
    /**
     * Initializes the tests (for single execution outside the suite).
     */
    @BeforeClass
    public static void setUpBeforeClass() {
        Utils.init();
    }
    
}
