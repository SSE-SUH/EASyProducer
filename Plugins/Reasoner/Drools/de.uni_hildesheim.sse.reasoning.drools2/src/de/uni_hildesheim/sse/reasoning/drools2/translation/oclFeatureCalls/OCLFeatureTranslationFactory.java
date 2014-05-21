package de.uni_hildesheim.sse.reasoning.drools2.translation.oclFeatureCalls;

import java.util.HashMap;
import java.util.Map;

import de.uni_hildesheim.sse.model.confModel.CompoundVariable;
import de.uni_hildesheim.sse.model.cst.CSTSemanticException;
import de.uni_hildesheim.sse.model.cst.OCLFeatureCall;
import de.uni_hildesheim.sse.model.varModel.datatypes.BooleanType;
import de.uni_hildesheim.sse.model.varModel.datatypes.Compound;
import de.uni_hildesheim.sse.model.varModel.datatypes.Enum;
import de.uni_hildesheim.sse.model.varModel.datatypes.IntegerType;
import de.uni_hildesheim.sse.model.varModel.datatypes.Operation;
import de.uni_hildesheim.sse.model.varModel.datatypes.RealType;
import de.uni_hildesheim.sse.model.varModel.datatypes.StringType;

/**
 * A factory for retrieving a {@link TranslationFragment}, which is able to translate a {@link OCLFeatureCall}
 * into Drools specific code, without deeper knowledge about the structure of the {@link OCLFeatureCall}.
 * @author El-Sharkawy
 * @author Sizonenko
 *
 */
public class OCLFeatureTranslationFactory {
    
    private static final Map<Operation, TranslationFragment> TRANSLATION_MAP
        = new HashMap<Operation, TranslationFragment>();
    
    static {
        registerTranslationFragment(new AbsHandler(), IntegerType.ABS_INTEGER_INTEGER, RealType.ABS_REAL_REAL);
        registerTranslationFragment(new AdditionHandler(), IntegerType.PLUS_INTEGER_INTEGER,
            IntegerType.PLUS_INTEGER_REAL, RealType.PLUS_REAL_INTEGER, RealType.PLUS_REAL_REAL);
        registerTranslationFragment(new AndHandler(), BooleanType.AND);
        registerTranslationFragment(new AssignmentHandler(), IntegerType.ASSIGNMENT_INTEGER_INTEGER,
            RealType.ASSIGNMENT_REAL_INTEGER, RealType.ASSIGNMENT_REAL_REAL, StringType.ASSIGNMENT,
            BooleanType.ASSIGNMENT, Enum.ASSIGNMENT);
        registerTranslationFragment(new DivHandler(), IntegerType.DIV_INTEGER_INTEGER);
        registerTranslationFragment(new DivisionHandler(), IntegerType.DIV_INTEGER_REAL,
            IntegerType.DIVREAL_INTEGER_INTEGER, RealType.DIV_REAL_INTEGER, RealType.DIV_REAL_REAL);
        registerTranslationFragment(new EqualsHandler(), IntegerType.EQUALS_INTEGER_INTEGER,
            IntegerType.EQUALS_INTEGER_REAL, RealType.EQUALS_REAL_INTEGER, RealType.EQUALS_REAL_REAL,
            StringType.EQUALS, BooleanType.EQUALS, Enum.EQUALS);
        registerTranslationFragment(new GreaterEqHandler(), IntegerType.GREATER_EQUALS_INTEGER_INTEGER,
            IntegerType.GREATER_EQUALS_INTEGER_REAL, RealType.GREATER_EQUALS_REAL_INTEGER,
            RealType.GREATER_EQUALS_REAL_REAL);
        registerTranslationFragment(new GreaterHandler(), IntegerType.GREATER_INTEGER_INTEGER,
            IntegerType.GREATER_INTEGER_REAL, RealType.GREATER_REAL_INTEGER, RealType.GREATER_REAL_REAL);
        registerTranslationFragment(new FloorHandler(), RealType.FLOOR);
        registerTranslationFragment(new IFFHandler(), BooleanType.IFF);
        registerTranslationFragment(new ImpliesHandler(), BooleanType.IMPLIES);
        registerTranslationFragment(new InverseHandler(), IntegerType.INVERSE_INTEGER, RealType.INVERSE_REAL);
        registerTranslationFragment(new LessEqHandler(), IntegerType.LESS_EQUALS_INTEGER_INTEGER,
            IntegerType.LESS_EQUALS_INTEGER_REAL, RealType.LESS_EQUALS_REAL_INTEGER, RealType.LESS_EQUALS_REAL_REAL);
        registerTranslationFragment(new LessHandler(), IntegerType.LESS_INTEGER_INTEGER, IntegerType.LESS_INTEGER_REAL,
            RealType.LESS_REAL_INTEGER, RealType.LESS_REAL_REAL);
        registerTranslationFragment(new MaxHandler(), IntegerType.MAX_INTEGER_INTEGER, IntegerType.MAX_INTEGER_REAL,
            RealType.MAX_REAL_INTEGER, RealType.MAX_REAL_REAL);
        registerTranslationFragment(new MinHandler(), IntegerType.MIN_INTEGER_INTEGER, IntegerType.MIN_INTEGER_REAL,
            RealType.MIN_REAL_INTEGER, RealType.MIN_REAL_REAL);
        registerTranslationFragment(new ModHandler(), IntegerType.MOD_INTEGER_INTEGER, IntegerType.MOD_INTEGER_REAL,
            RealType.MOD_REAL_INTEGER, RealType.MOD_REAL_REAL);
        registerTranslationFragment(new MultiplicationHandler(), IntegerType.MULT_INTEGER_INTEGER,
            IntegerType.MULT_INTEGER_REAL, RealType.MULT_REAL_INTEGER, RealType.MULT_REAL_REAL);
        registerTranslationFragment(new NotEqualsHandler(), IntegerType.NOTEQUALS_INTEGER_INTEGER,
            IntegerType.NOTEQUALS_INTEGER_REAL, RealType.NOTEQUALS_REAL_INTEGER, RealType.NOTEQUALS_REAL_REAL,
            StringType.UNEQUALS, BooleanType.UNEQUALS, Enum.NOTEQUALS);
        registerTranslationFragment(new NotHandler(), BooleanType.NOT);
        registerTranslationFragment(new OrHandler(), BooleanType.OR);
        registerTranslationFragment(new RoundHandler(), RealType.ROUND);
        registerTranslationFragment(new StringConcatHandler(), StringType.CONCAT);
        registerTranslationFragment(new StringSizeHandler(), StringType.SIZE);
        registerTranslationFragment(new StringToIntegerHandler(), StringType.TO_INTEGER);
        registerTranslationFragment(new StringToRealHandler(), StringType.TO_REAL);
        registerTranslationFragment(new SubtractionHandler(), IntegerType.MINUS_INTEGER_INTEGER,
            IntegerType.MINUS_INTEGER_REAL, RealType.MINUS_REAL_INTEGER, RealType.MINUS_REAL_REAL);
        registerTranslationFragment(new XorHandler(), BooleanType.XOR);
        registerTranslationFragment(new IsDefinedHandler(), Compound.IS_DEFINED);
    }
    
    /**
     * Registers {@link TranslationFragment} for the specified {@link Operation}s.
     * @param fragment A {@link TranslationFragment} describing how a specific {@link Operation}
     *     shall be translated to drools.
     * @param operations A not empty/<tt>null</tt> list of operations,
     *     which can be translated by the given {@link TranslationFragment}.
     */
    static void registerTranslationFragment(TranslationFragment fragment, Operation... operations) {
        for (int i = 0; i < operations.length; i++) {
            TRANSLATION_MAP.put(operations[i], fragment);
        }
    }
    
    /**
     * Returns for the given {@link OCLFeatureCall} a {@link TranslationFragment}, which is able to translate
     * the given {@link OCLFeatureCall} automatically into Drools specific code.
     * @param constraint An {@link OCLFeatureCall}, which should be translated 
     * @return A {@link TranslationFragment} instance, which is able to translate the given {@link OCLFeatureCall}
     *     into Drools specific code.
     * @throws CSTSemanticException Will be thrown in case that {@link OCLFeatureCall#inferDatatype()} leads
     *     to this exception.
     */
    public static TranslationFragment getTranslator(OCLFeatureCall constraint) throws CSTSemanticException {
        // Ensure that constraint.getResolvedOperation() is possible
        constraint.inferDatatype();
        Operation operation = constraint.getResolvedOperation();
        TranslationFragment translator = TRANSLATION_MAP.get(operation);
        
        return translator;
    }
}
