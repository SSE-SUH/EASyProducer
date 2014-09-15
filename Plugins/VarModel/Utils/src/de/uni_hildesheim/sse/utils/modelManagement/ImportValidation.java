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
package de.uni_hildesheim.sse.utils.modelManagement;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.uni_hildesheim.sse.utils.internal.Bundle;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory.EASyLogger;
import de.uni_hildesheim.sse.utils.messages.IMessage;
import de.uni_hildesheim.sse.utils.messages.Message;
import de.uni_hildesheim.sse.utils.messages.Status;

/**
 * checks, if a model is valid due to having unique imports.
 * 
 * @param <M> the specific model type
 * 
 * @author J�hne
 */
class ImportValidation <M extends IModel> {
    private ArrayList<ModelInfo<M>> importedModelInfos;
    private IModelRepository<M> repository;
    private ArrayList<Blacklist<M>> blacklists;
    private ArrayList<ModelInfo<M>> modelsToVisit;
    private HashMap<ModelInfo<M>, ArrayList<String>> modelNamesToVisit;
    private List<IMessage> messages;
    private final boolean isCONFLICT = true;
    private boolean isValid = true;

    /**
     * constructor.
     * 
     * @param repository 
     *            model repository
     * @param messages
     *            errormessagelist.
     */
    public ImportValidation(IModelRepository<M> repository, List<IMessage> messages) {
        modelsToVisit = new ArrayList<ModelInfo<M>>();
        importedModelInfos = new ArrayList<ModelInfo<M>>();
        this.repository = repository;
        this.messages = messages;
        blacklists = new ArrayList<Blacklist<M>>();
        modelNamesToVisit = new HashMap<ModelInfo<M>, ArrayList<String>>();
    }

    /**
     * Hier wird das Root-Modell eingef�gt, und dann werden alle Projekte rekursiv gepr�ft.
     * 
     * @param context the resolution context pointing to the root model
     * @return list of imported modelInfos.
     */
    public ArrayList<ModelInfo<M>> validateModel(ResolutionContext<M> context) {
        isValid = true;
        M model = context.getModel();
        URI uri = context.getModelURI();
        importedModelInfos.add(new ModelInfo<M>(model, uri));
        modelsToVisit.add(repository.getModelInfo(model.getName(), model.getVersion(), uri));
        while (validateQueue(context) && modelsToVisit.size() > 0) {
            modelNamesToVisit.clear();
            for (Blacklist<M> blacklist : blacklists) {
                blacklist.clearTemporaryRestrictions();
            }
        }
        EASyLogger logger = EASyLoggerFactory.INSTANCE.getLogger(getClass(), Bundle.ID);
        if (isValid && isRetrospectivelyValid()) {
            logger.info("Model " + model + " is valid!");
        } else {
            logger.error("Model " + model + " is not valid!");
            importedModelInfos.clear();
        }
        return importedModelInfos;
    }

    /**
     * Checks each model from the importlist, if it's still valid, although there were imports by (grand-)children.
     * 
     * @return if >all< imports are still valid
     */
    private boolean isRetrospectivelyValid() {
        for (final ModelInfo<M> modelInfoImport : importedModelInfos) { // retrospective Validation:
            if (blacklistExists(modelInfoImport.getName())) {
                Blacklist<M> retrospectiveValidation = getBlacklist(modelInfoImport.getName());
                if (!retrospectiveValidation.isValidPermanentOnly(modelInfoImport.getVersion())) {
                    isValid = false;
                    messages.add(new IMessage() {

                        public Status getStatus() {
                            return Status.ERROR;
                        }

                        public String getDescription() {
                            return "Retrospective validation fails with model: " + modelInfoImport.getName();
                        }
                    });
                }
            }
        }
        return isValid;
    }

    /**
     * Returns, if the model is valid or not.
     * 
     * @return validation status
     */
    public boolean wasSuccessful() {
        return isValid;
    }

    /**
     * adds restrictions and tries to import all models.
     * 
     * @param context the resolution context providing access to the model paths
     * @return if all imports are valid.
     */
    private boolean validateQueue(ResolutionContext<M> context) {
        addRestrictions(isCONFLICT);
        addRestrictions(!isCONFLICT); // seperated for later handling whether it's an import or conflict
        boolean success = addQueue(context);
        return success;
    }

    /**
     * Fills the blacklists with given restrictions.
     * 
     * @param isConflict
     *            from the importing model.
     */
    private void addRestrictions(boolean isConflict) {
        if (modelsToVisit.size() > 0) {
            for (ModelInfo<M> pinfo : modelsToVisit) {
                for (int i = 0; i < pinfo.getImportsCount(); i++) {
                    if (!pinfo.getImport(i).isConflict()) {
                        if (modelNamesToVisit.get(pinfo) == null
                                || !modelNamesToVisit.get(pinfo).contains(pinfo.getImport(i).getName())) {
                            if (modelNamesToVisit.get(pinfo) == null) {
                                modelNamesToVisit.put(pinfo, new ArrayList<String>());
                            }
                            modelNamesToVisit.get(pinfo).add(pinfo.getImport(i).getName());
                        }
                    }
                    if (pinfo.getImport(i).isConflict() == isConflict) {
                        for (int r = 0; r < pinfo.getImport(i).getRestrictionsCount(); r++) {
                            addRestriction(pinfo.getImport(i).getRestriction(r), isConflict, pinfo);
                        }
                    }
                }
            }

        }
    }

    /**
     * checks if the imports were valid.
     * 
     * @param context the resolution context providing access to the model paths
     * @return if the imports were valid -> continue or invalid -> break.
     */
    private boolean addQueue(ResolutionContext<M> context) {

        ArrayList<ModelInfo<M>> temp = fillVisitList(context);
        if (isValid) {
            for (ModelInfo<M> modelInfo : temp) {
                importedModelInfos.add(modelInfo);
            }
            modelsToVisit = temp;
        }

        return isValid;
    }

    /**
     * fills the importlist.
     * 
     * @param context the resolution context providing access to the model paths
     * @return the list with all imports.
     */
    private ArrayList<ModelInfo<M>> fillVisitList(ResolutionContext<M> context) {
        ArrayList<ModelInfo<M>> modelImportList = new ArrayList<ModelInfo<M>>();
        for (final ModelInfo<M> parentModelInfo : modelNamesToVisit.keySet()) {
            if (!isValid) {
                break;
            }
            for (final String modelImport : modelNamesToVisit.get(parentModelInfo)) {
                if (!isValid) {
                    break;
                }
                List<VersionedModelInfos<M>> versionedModelList = repository.getAvailable(modelImport);
                int importCounter = 0;
                if (versionedModelList != null) {
                    for (VersionedModelInfos<M> modelInfo : versionedModelList) {
                        if (!isValid) {
                            break;
                        }
                        ModelInfo<M> closestModelInfo = modelInfo.getByClosestUri(
                            parentModelInfo.getLocation(), context.getModelPaths());
                        if (null != closestModelInfo) {
                            if (blacklistExists(closestModelInfo.getName())) {
                                Blacklist<M> blacklist = getBlacklist(closestModelInfo.getName());
                                if (blacklist.isValid(closestModelInfo.getVersion(), parentModelInfo)) {
                                    modelImportList.add(closestModelInfo);
                                    importCounter++;
                                }
                            } else {
                                for (ModelInfo<M> pInfo : importedModelInfos) { 
                                    // ModelInfo is already checked -> cycle
                                    if (pInfo.getName().compareTo(closestModelInfo.getName()) == 0
                                           && Version.equals(pInfo.getVersion(), closestModelInfo.getVersion())
                                           && pInfo.getLocation().compareTo(closestModelInfo.getLocation()) == 0) {
                                        messages.add(new Message("The import of "
                                                    + closestModelInfo.getName()
                                                    + " causes an infinite import-loop", Status.ERROR));    
                                        isValid = false;
                                        break;
                                    }
                                }
                                if (isValid) {
                                    modelImportList.add(closestModelInfo);
                                    importCounter++;
                                }
                            }
                        }

                    }
                }
                if (isValid && importCounter > 1) { // TODO: Multiple choices: pick first?, pick last? -> ask user !
                    messages.add(new IMessage() {
                        public Status getStatus() {
                            return Status.ERROR;
                        }
                        public String getDescription() {
                            return parentModelInfo.getName() + " failed importing the model: "
                                    + modelImport + " due to many possible imports!";
                        }
                    });
                    isValid = false;
                } else if (isValid && importCounter == 0) {
                    messages.add(new Message(parentModelInfo.getName() + " failed importing the model: "
                            + modelImport + " because there is no valid model existing!"
                            , Status.ERROR));
                    isValid = false;
                }
            }
        }
        return modelImportList;
    }

    /**
     * adds given restriction and creates a new blacklist if needed.
     * 
     * @param versionRestriction
     *            to add.
     * @param isConflict
     *            if it's a conflict or an import
     * @param modelInfo for temporaryRestrictions.
     */
    private void addRestriction(VersionRestriction versionRestriction, boolean isConflict,
        ModelInfo<M> modelInfo) {
        Blacklist<M> blacklist = null;
        if (blacklistExists(versionRestriction.getName())) {
            blacklist = getBlacklist(versionRestriction.getName());
        } else {
            blacklist = new Blacklist<M>(versionRestriction.getName());
            blacklists.add(blacklist);
        }
        blacklist.addRestriction(versionRestriction, isConflict, modelInfo);
    }

    /**
     * Returns blacklist by name.
     * 
     * @param modelName
     *            .
     * @return the blacklist with given name.
     */
    private Blacklist<M> getBlacklist(String modelName) {
        Blacklist<M> output = null;
        for (Blacklist<M> blacklist : blacklists) {
            if (blacklist.getModelName().compareTo(modelName) == 0) {
                output = blacklist;
                break;
            }
        }
        return output;
    }

    /**
     * checks for blacklist-existence.
     * 
     * @param modelName
     *            of the blacklist.
     * @return if it was found or not.
     */
    private boolean blacklistExists(String modelName) {
        return (getBlacklist(modelName) != null);
    }

}
