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
package net.ssehub.easy.varModel.model.filter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import net.ssehub.easy.varModel.model.filter.mandatoryVars.MandatoryDeclarationClassifierTest;

/**
 * Test Suite for running tests of this package, the tests for the filters.
 * @author El-Sharkawy
 *
 */
@RunWith(Suite.class)
@SuiteClasses({
    AbstractFrozenElementsFinderTest.class,
    ConstraintSeparatorTest.class,
    DatatypeFinderTest.class,
    FreezeBlockFinderTest.class,
    FrozenElementsFinderTest.class,
    IDecisionVariableInConstraintFinderTest.class,
    ProjectInterfaceTest.class,
    ReferenceValueFinderTest.class,
    
    // Sub packages
    MandatoryDeclarationClassifierTest.class
    })
public class AllFilterTests {

}
