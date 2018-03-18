package net.ssehub.easy.reasoning.core.reasoner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Configures the String tests for SSE reasoner.
 * 
 * @author Eichelberger
 */
public class StringTests extends AbstractTest {
    
    /**
     * Creating a test instance.
     * 
     * @param descriptor the test descriptor
     */
    protected StringTests(ITestDescriptor descriptor) {
        super(descriptor, "string");
    }

    /**
     * Initializes this Test class.
     */
    @Before
    public void setUpBeforeClass() {
        startup();
    }
    
    /**
     * Frees the memory after testing.
     */
    @After
    public void tearDownAfterClass() {
        shutdown();
    }
    
    /**
     * String defaults test.
     */
    @Test
    public void stringDefaultsTest() {
        reasoningTest("StringDefaultsTest.ivml", 0);
    } 
    
    /**
     * String assign test.
     */
    @Test
    public void stringAssignTest() {
        reasoningTest("StringAssignTest.ivml", 0);
    } 
    
    /**
     * String in compound defaults test.
     */
    @Test
    public void stringInCompoundDefaultsTest() {
        reasoningTest("StringInCompoundDefaultsTest.ivml", 0);
    } 
    
    /**
     * String in compound assign test.
     */
    @Test
    public void stringInCompoundAssignTest() {
        reasoningTest("StringInCompoundAssignTest.ivml", 0);
    } 

}