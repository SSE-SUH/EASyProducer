package net.ssehub.easy.reasoning.drools2;

import net.ssehub.easy.reasoning.core.frontend.AbstractReasonerFrontendTest;
import net.ssehub.easy.reasoning.core.frontend.TestConfiguration;
import net.ssehub.easy.reasoning.drools2.DroolsReasonerInitializer;

/**
 * Test utilities.
 * 
 * @author Holger Eichelberger
 */
class Utils {

    /**
     * Prevents creation from outside.
     */
    private Utils() {
    }
    
    /**
     * Initializes the tests (reusable method).
     */
    public static final void init() {
        AbstractReasonerFrontendTest.setupTests(new TestConfiguration(
            "de.uni_hildesheim.sse.reasoning.drools2.test", 
            null, 
            true, // CHECK
            false), // CONSISTENT
            DroolsReasonerInitializer.INSTANCE);
    }

}