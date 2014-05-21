package de.uni_hildesheim.sse.reasoning.drools2.translation.oclFeatureCalls;

import de.uni_hildesheim.sse.model.cst.OCLFeatureCall;
import de.uni_hildesheim.sse.model.varModel.datatypes.IntegerType;
import de.uni_hildesheim.sse.reasoning.drools2.translation.AbstractConstraintTranslator;

/**
 * Handler for translating {@link de.uni_hildesheim.sse.model.varModel.datatypes.OclKeyWords#MOD} operations.
 * @author Sizonenko
 *
 */
class ModHandler extends TranslationFragment {

    static {
        OCLFeatureTranslationFactory.registerTranslationFragment(new ModHandler(),
            IntegerType.MOD_INTEGER_INTEGER, IntegerType.MOD_INTEGER_REAL);
    }
    
    /**
     * Sole constructor for this class.
     * Should prevent calling this constructor form outside of the static block.
     */
    ModHandler() {}
    
    @Override
    public synchronized void toDroolsCode(AbstractConstraintTranslator translator, OCLFeatureCall constraint) {
        translator.append(" mod(");
        constraint.getOperand().accept(translator);
        translator.append(", ");
        constraint.getParameter(0).accept(translator);
        translator.append(")");
    }

}
