package de.uni_hildesheim.sse.reasoning.reasoner;

import de.uni_hildesheim.sse.reasoning.core.frontend.AbstractReasonerFrontendTest;
import de.uni_hildesheim.sse.reasoning.core.frontend.TestConfiguration;

/**
 * Test utilities.
 * 
 * @author Holger Eichelberger
 */
public class Utils {

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
            "de.uni_hildesheim.sse.reasoning.reasoner.test", 
            null, 
            true, // CHECK
            false), // CONSISTENT
            ReasonerInitializer.INSTANCE);
    }

}
