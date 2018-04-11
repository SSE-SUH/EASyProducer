package test.net.ssehub.easy.reasoning.sseReasoner.performance;

import org.junit.Ignore;
import org.junit.Test;

import test.net.ssehub.easy.reasoning.sseReasoner.TestDescriptor;

/**
 * Configures the operation tests for Drools.
 * 
 * @author Sizonenko
 * @author El-Sharkawy
 */
public class HistoryStats extends net.ssehub.easy.reasoning.core.performance.HistoryStats {

    /**
     * Creates a specific test instance.
     */
    public HistoryStats() {
        super(TestDescriptor.INSTANCE);
    }
    
    /**
     * Tests history models.
     */
    @Ignore("unclear why")
    @Test    
    public void historyStatsTest() {
        super.historyStatsTest();
    } 
   
}
