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

package de.uni_hildesheim.sse.easy.cmd;

import java.io.File;
import java.io.IOException;

import de.uni_hildesheim.sse.easy_producer.core.persistence.PersistenceUtils;
import de.uni_hildesheim.sse.model.confModel.Configuration;
import de.uni_hildesheim.sse.model.management.VarModel;
import de.uni_hildesheim.sse.model.varModel.Project;
import de.uni_hildesheim.sse.reasoning.core.frontend.ReasonerFrontend;
import de.uni_hildesheim.sse.reasoning.core.reasoner.ReasonerConfiguration;
import de.uni_hildesheim.sse.reasoning.core.reasoner.ReasoningResult;
import de.uni_hildesheim.sse.utils.modelManagement.ModelManagementException;
import de.uni_hildesheim.sse.utils.modelManagement.VersionFormatException;
import de.uni_hildesheim.sse.utils.progress.ProgressObserver;

/**
 * This class is currently rather preliminary and basically intended for testing proper loading
 * of the reasoner by the EASy Loader.<br/>
 * <b>Before calling any of the methods in this class, EASy must be loaded via calling 
 * {@link LowlevelCommands#startEASy()}.</b>
 * 
 * @author Holger Eichelberger
 */
public class ReasoningCommands {

    /**
     * Checks the validity of the specified IVML model by reasoning.
     * 
     * @param project the project the model is located in
     * @param ivmlFile the IVML model file to be checked
     * @return <code>true</code> if conflict occurred, <code>false</code> else
     * 
     * @throws ModelManagementException in case that the model cannot be loaded for some reason
     */
    public static boolean checkValidity(File project, File ivmlFile) 
        throws ModelManagementException {
        de.uni_hildesheim.sse.easy_producer.core.persistence.Configuration config 
            = PersistenceUtils.getConfiguration(project);
        PersistenceUtils.addLocation(config, ProgressObserver.NO_OBSERVER);    
        Project ivmlProject = PersistenceUtils.loadModel(VarModel.INSTANCE, ivmlFile);      
        return checkValidity(ivmlProject);
    }
    
    /**
     * Checks the validity of the specified IVML model by reasoning.
     * 
     * @param project the project the model is located in
     * @param ivmlDefinition the IVML model definition
     * @return <code>true</code> if conflict occurred, <code>false</code> else
     * 
     * @throws ModelManagementException in case that the model cannot be loaded for some reason
     */
    public static boolean checkValidity(File project, ModelLoadDefinition ivmlDefinition) 
        throws ModelManagementException {
        VarModel.INSTANCE.locations().addLocation(project, ProgressObserver.NO_OBSERVER);
        Project ivmlProject = Utils.loadPreferredModel(VarModel.INSTANCE, ivmlDefinition, project);
        return checkValidity(ivmlProject);
    }

    /**
     * Checks the validity of the specified IVML model by reasoning.
     * 
     * @param project the IVML model to be checked
     * @return <code>true</code> if conflict occurred, <code>false</code> else
     */
    public static boolean checkValidity(Project project) {
        Configuration config = new Configuration(project);
        ReasonerConfiguration rConfig = new ReasonerConfiguration();
        ReasoningResult result = ReasonerFrontend.getInstance().check(project, config, rConfig, 
            ProgressObserver.NO_OBSERVER);
        return result.hasConflict();
    }
    
    /**
     * Just for testing.
     * 
     * @param args command line arguments - ignored
     * 
     * @throws IOException in case of I/O problems
     * @throws VersionFormatException in case of version specification problems
     * @throws ModelManagementException in case of problems loading the models
     */
    public static void main(String[] args) throws IOException, VersionFormatException, ModelManagementException  {
        LowlevelCommands.startEASy();
        ModelLoadDefinition mld = new ModelLoadDefinition("PL_SimElevator_frozen", "0");
        File project = new File("../EASyCommandLineTest/testdata/elevator/PL_SimElevator_frozen");
        System.out.println("has conflict: " + checkValidity(project, mld));
    }
    
}
