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
 * Hardware constraint: managerReq = machines->exists(Machine machine | machine.role == MachineRole.Manager) test.
 * 
 * @author Sizonenko
 * @author El-Sharkawy
 */
public class QMHardwareTest2 extends net.ssehub.easy.reasoning.core.qm.QMHardwareTest2 {
    
    /**
     * Creates a specific test instance.
     */
    public QMHardwareTest2() {
        super(TestDescriptor.INSTANCE);
    }
    
}
