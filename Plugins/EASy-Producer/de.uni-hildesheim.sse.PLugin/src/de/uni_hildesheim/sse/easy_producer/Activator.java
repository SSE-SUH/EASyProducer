package de.uni_hildesheim.sse.easy_producer;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import de.uni_hildesheim.sse.easy_producer.core.persistence.standard.EASyInitializer;
import de.uni_hildesheim.sse.easy_producer.persistency.ResourcesMgmt;
import de.uni_hildesheim.sse.easy_producer.persistency.eclipse.PathEnvironmentFactory;
import net.ssehub.easy.basics.Environment;
import net.ssehub.easy.basics.logger.EASyLoggerFactory;
import net.ssehub.easy.basics.logger.EASyLoggerFactory.EASyLogger;

/**
 * The activator class controls the plug-in life cycle. Auto generated by RCP.
 */
public class Activator extends Plugin {

    /**
     * The plug-in ID.
     */
    public static final String PLUGIN_ID = "de.uni_hildesheim.sse.EASy-Producer";

    /**
     * The shared instance.
     */
    private static Activator plugin;

    /**
     * The constructor.
     */
    public Activator() {
        EASyInitializer.setInitializer(true);
        // TODO SE: Move this in EASy UI Bundle
        PathEnvironmentFactory.registerHandler(JavaProjectHandler.INSTANCE);
        /*
         * Add and create only a WorkspaceListener, if the Workspace was loaded, i.e. the responsible Eclipse
         * plug-in was loaded and started.
         */
        if (null != ResourcesMgmt.INSTANCE.getWorkspace()) {
            PLPWorkspaceListener.register();
        }
    }

    /**
     * The <code>AbstractUIPlugin</code> implementation of this <code>Plugin</code> method refreshes the plug-in
     * actions.<br/>
     * This instance is created.
     * 
     * @param context the bundle context for this plug-in
     * @exception Exception if this plug-in did not start up properly
     */
    // checkstyle: stop exception type check
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        if (Environment.runsInEclipse()) {
            // Has to be done after super.start() was called.
            // Otherwise the bundle is not initialized and the logger returns a NPE.
            if (!EASyLoggerFactory.DEBUG) {
                EASyLoggerFactory.INSTANCE.setLogger(new EclipseLogger(this));
            }
        }
        EASyLogger logger = EASyLoggerFactory.INSTANCE.getLogger(this.getClass(), PLUGIN_ID);
        logger.info("EASy-Producer activator called...");
    }

    /**
     * The <code>AbstractUIPlugin</code> implementation of this <code>Plugin</code> method saves this plug-in's
     * preference and dialog stores and shuts down its image registry (if they are in use).
     * 
     * @param context the bundle context for this plug-in
     * @exception Exception if this plug-in did not start up properly
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // checkstyle: resume exception type check

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }
}
