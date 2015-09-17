package de.uni_hildesheim.sse.easy_producer.core.persistence.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.uni_hildesheim.sse.easy_producer.core.persistence.standard.EASyInitializer;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.execution.TracerFactory;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.tracing.ConsoleTracerFactory;



/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID =
            "de.uni_hildesheim.sse.EASy-Producer.persistence"; //$NON-NLS-1$
    
    private static BundleContext context;

    /**
     * The constructor.
     */
    public Activator() {
        EASyInitializer.setInitializer();       
        TracerFactory.setInstance(ConsoleTracerFactory.INSTANCE);
    }

    /**
     * Getter for the context of this plug-in.
     * @return The context of this plug-in.
     */
    static BundleContext getContext() {
        return context;
    }
    
    //checkstyle: stop exception type check
    
    /**
     * {@inheritDoc}
     */
    public void start(BundleContext bundleContext) throws Exception {
        Activator.context = bundleContext;
    }

    /**
     * {@inheritDoc}
     */
    public void stop(BundleContext bundleContext) throws Exception {
        Activator.context = null;
    }
    //checkstyle: resume exception type check
}
