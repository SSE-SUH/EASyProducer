package test.de.uni_hildesheim.sse.aspectj;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import test.de.uni_hildesheim.sse.vil.buildlang.AbstractExecutionTest;
import test.de.uni_hildesheim.sse.vil.buildlang.BuildLangTestConfigurer;
import test.de.uni_hildesheim.sse.vil.buildlang.ITestConfigurer;
import net.ssehub.easy.instantiation.aspectj.Registration;
import net.ssehub.easy.instantiation.core.model.buildlangModel.Script;

/**
 * Tests for the basic language.
 * 
 * @author Holger Eichelberger
 */
public class ExecutionTests extends AbstractExecutionTest<Script> {

    private static ExecutionTests tests;
    
    @Override
    protected ITestConfigurer<Script> createTestConfigurer() {
        return new BuildLangTestConfigurer("instantiator.aspectj.testdata.home");
    }

    @Override
    protected void furtherInitialization() {
        Registration.register();
    }
    
    /**
     * Starts up the test.
     */
    @BeforeClass
    public static void startUp() {
        tests = new ExecutionTests();
    }

    /**
     * Tears down the test.
     */
    @AfterClass
    public static void shutDown() {
        if (null != tests) {
            tests.cleanTemp();
            tests = null;
        }
    }

    /**
     * The execution of the aspectJ compiler.
     * 
     * @throws IOException should not occur
     */
    @Test
    public void testAspectJ() throws IOException {
        assertSelfInstantiate("aspectj");
    }

}
