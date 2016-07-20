package net.ssehub.easy.reasoning.sseReasoner.capabilities;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Tests for testing the reasoning capabilities.<br/>
 * Usually a property is used to specify the location of test data.
 * This is done with the property
 * {@link net.ssehub.easy.reasoning.core.frontend.TestConfiguration#SYSTEM_PROPERTY}. For instance: <br/>
 * <tt>-DreasonerCore.testdata.home=C:\EASyProducer-git\Plugins\Reasoner\ReasonerCore\ReasonerCore.test\testdata</tt>
 * @author Sizonenko
 * @author El-Sharkawy
 */
@RunWith(Suite.class)
@SuiteClasses({    
    AttributeTests.class,  
    CollectionConstraintsTests.class,
    FailedDecisionsTests.class,
    RuntimeReasoningTests.class,
    OperationTests.class,
    CollectionOperationsTests.class,
    StructureTests.class,
    ConstraintVariableTests.class,
    EvalTests.class
    })
public class AllTests {

}
