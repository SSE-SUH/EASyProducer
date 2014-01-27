package de.uni_hildesheim.sse.reasoning.drools2.translation.oclFeatureCalls;

import de.uni_hildesheim.sse.model.cst.OCLFeatureCall;
import de.uni_hildesheim.sse.reasoning.drools2.translation.AbstractConstraintTranslator;

/**
 * Handler for translating {@link de.uni_hildesheim.sse.model.varModel.datatypes.OclKeyWords#GREATER_EQUALS} operations.
 * @author Sizonenko
 *
 */
class GreaterEqHandler extends TranslationFragment {
    
    /**
     * Sole constructor for this class.
     * Should prevent calling this constructor form outside of the static block.
     */
    GreaterEqHandler() {
        
    }
    
    @Override
    public synchronized void toDroolsCode(AbstractConstraintTranslator translator, OCLFeatureCall constraint) {
        constraint.getOperand().accept(translator);
        translator.append(" >= ");
        constraint.getParameter(0).accept(translator);
    }

}
