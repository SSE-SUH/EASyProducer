package de.uni_hildesheim.sse.easy_producer.instantiator.model.templateModel;

import de.uni_hildesheim.sse.utils.modelManagement.AbstractImportResolverPoolManager;
import de.uni_hildesheim.sse.utils.modelManagement.ImportResolver;
import de.uni_hildesheim.sse.utils.modelManagement.DefaultImportResolver;
import de.uni_hildesheim.sse.utils.modelManagement.ModelManagement;
import de.uni_hildesheim.sse.utils.pool.IPoolManager;

/**
 * Provides mechanisms for loading, linking, referring, searching and storing template models
 * according to their name, their version and their location. The name was chosen according
 * to the established naming in the variability model implementation.
 * 
 * @author Holger Eichelberger
 */
public class TemplateModel extends ModelManagement<Template> {

    /**
     * Stores the singleton instance.
     */
    public static final TemplateModel INSTANCE = new TemplateModel();

    /**
     * Singleton.
     */
    private TemplateModel() {
    }

    @Override
    protected IPoolManager<ImportResolver<Template>> createResolverPoolManager() {
        return new AbstractImportResolverPoolManager<Template>() {

            @Override
            public ImportResolver<Template> create() {
                return new DefaultImportResolver<Template>();
            }

        };
    }


}
