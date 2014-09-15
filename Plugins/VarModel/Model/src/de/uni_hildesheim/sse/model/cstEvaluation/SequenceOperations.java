package de.uni_hildesheim.sse.model.cstEvaluation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static de.uni_hildesheim.sse.model.cstEvaluation.ContainerOperations.*;
import de.uni_hildesheim.sse.model.varModel.datatypes.IntegerType;
import de.uni_hildesheim.sse.model.varModel.datatypes.Sequence;
import de.uni_hildesheim.sse.model.varModel.values.BooleanValue;
import de.uni_hildesheim.sse.model.varModel.values.ContainerValue;
import de.uni_hildesheim.sse.model.varModel.values.IntValue;
import de.uni_hildesheim.sse.model.varModel.values.Value;
import de.uni_hildesheim.sse.model.varModel.values.ValueDoesNotMatchTypeException;
import de.uni_hildesheim.sse.model.varModel.values.ValueFactory;

/**
 * Implements sequence operations.
 * 
 * @author Holger Eichelberger
 */
public class SequenceOperations {

    /**
     * Implements the index access operation.
     */
    static final IOperationEvaluator INDEX_ACCESS = new IOperationEvaluator() {

        /**
         * {@inheritDoc}
         */
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            if (1 == arguments.length) {
                Value res = operand.getValue(arguments[0]);
                if (null != res) {
                    result = ConstantAccessor.POOL.getInstance().bind(res, operand.getContext());
                }
            }
            return result;
        }

    };

    /**
     * Implements the "first" operation.
     */
    static final IOperationEvaluator FIRST = new IOperationEvaluator() {

        /**
         * {@inheritDoc}
         */
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            Value value = operand.getValue();
            if (value instanceof ContainerValue) {
                ContainerValue cont = (ContainerValue) value;
                if (cont.getElementSize() > 0) {
                    result = ConstantAccessor.POOL.getInstance().bind(cont.getElement(0), operand.getContext());
                }
            }
            return result;
        }

    };

    /**
     * Implements the "last" operation.
     */
    static final IOperationEvaluator LAST = new IOperationEvaluator() {

        /**
         * {@inheritDoc}
         */
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            Value value = operand.getValue();
            if (value instanceof ContainerValue) {
                ContainerValue cont = (ContainerValue) value;
                int size = cont.getElementSize();
                if (size > 0) {
                    result = ConstantAccessor.POOL.getInstance().bind(cont.getElement(size - 1), operand.getContext());
                }
            }
            return result;
        }

    };

    /**
     * Implements the "hasDuplicates" operation.
     */
    static final IOperationEvaluator HAS_DUPLICATES = new IOperationEvaluator() {

        /**
         * {@inheritDoc}
         */
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            Value value = operand.getValue();
            if (value instanceof ContainerValue) {
                ContainerValue cont = (ContainerValue) value;
                boolean hasDuplicates = false;
                int size = cont.getElementSize();
                if (size > 0) {
                    Set<Value> known = new HashSet<Value>(size);
                    for (int i = 0; !hasDuplicates && i < size; i++) {
                        hasDuplicates = !known.add(cont.getElement(i));
                    }
                }
                result = ConstantAccessor.POOL.getInstance().bind(
                        BooleanValue.toBooleanValue(hasDuplicates), operand.getContext());
            }
            return result;
        }

    };
    
    /**
     * Implements the "hasDuplicates" operation.
     */
    static final IOperationEvaluator INSERT_AT = new IOperationEvaluator() {

        /**
         * {@inheritDoc}
         */
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            if (2 == arguments.length) {
                Value oValue = operand.getValue();
                Value aValue = arguments[0].getValue();
                Value insValue = arguments[1].getValue();
                if (oValue instanceof ContainerValue && aValue instanceof IntValue && null != insValue) {
                    ContainerValue cont = (ContainerValue) oValue;
                    int index = ((IntValue) aValue).getValue();
                    if (0 <= index && index <= cont.getElementSize()) { // this is an insert!
                        ArrayList<Value> tmp = new ArrayList<Value>();
                        ContainerOperations.addAll(cont, tmp);
                        tmp.add(index, insValue);
                        try {
                            Value rValue = ValueFactory.createValue(cont.getType(), tmp.toArray());
                            result = ConstantAccessor.POOL.getInstance().bind(rValue, operand.getContext());
                        } catch (ValueDoesNotMatchTypeException e) {
                            // result -> null
                        }
                    }
                }
            }
            return result;
        }

    };
    
    /**
     * Implements the "indexOf" operation.
     */
    static final IOperationEvaluator INDEX_OF = new IOperationEvaluator() {

        /**
         * {@inheritDoc}
         */
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            if (1 == arguments.length) {
                Value oValue = operand.getValue();
                Value aValue = arguments[0].getValue();
                if (oValue instanceof ContainerValue && null != aValue) {
                    ContainerValue cont = (ContainerValue) oValue;
                    try {
                        Value resVal = ValueFactory.createValue(IntegerType.TYPE, cont.indexOf(aValue));
                        result = ConstantAccessor.POOL.getInstance().bind(resVal, operand.getContext());
                    } catch (ValueDoesNotMatchTypeException e) {
                        // result -> null
                    }
                }
            }
            return result;
        }

    };


    /**
     * Implements the union operation.
     */
    static final IOperationEvaluator UNION = new Container2OperationEvaluator(new Container2Operation() {
        
        public void evaluate(ContainerValue c1, ContainerValue c2, List<Value> result) {
            ContainerOperations.addAll(c1, result);
            ContainerOperations.addAll(c2, result);
        }
    });

    /**
     * Implements the prepend operation.
     */
    static final IOperationEvaluator PREPEND = new ContainerValueOperationEvaluator(new ContainerValueOperation() {
        
        public void evaluate(ContainerValue cont, Value value, List<Value> result) {
            result.add(value);
            ContainerOperations.addAll(cont, result);
        }
    });
    
    /**
     * Implements the append operation.
     */
    static final IOperationEvaluator APPEND = new ContainerValueOperationEvaluator(new ContainerValueOperation() {
        
        public void evaluate(ContainerValue cont, Value value, List<Value> result) {
            ContainerOperations.addAll(cont, result);
            result.add(value);
        }
    });
    
    /**
     * Prevent instance creation.
     */
    private SequenceOperations() {
    }
    
    /**
     * Registers the defined operations.
     */
    public static void register() {
        EvaluatorRegistry.registerEvaluator(INDEX_ACCESS, Sequence.INDEX_ACCESS, Sequence.AT);
        EvaluatorRegistry.registerEvaluator(FIRST, Sequence.FIRST);
        EvaluatorRegistry.registerEvaluator(LAST, Sequence.LAST);
        EvaluatorRegistry.registerEvaluator(ContainerOperations.AS_SET, Sequence.AS_SET);
        EvaluatorRegistry.registerEvaluator(ContainerOperations.AS_SEQUENCE, Sequence.AS_SEQUENCE);
        EvaluatorRegistry.registerEvaluator(UNION, Sequence.UNION);
        EvaluatorRegistry.registerEvaluator(APPEND, Sequence.APPEND);
        EvaluatorRegistry.registerEvaluator(PREPEND, Sequence.PREPEND);
        EvaluatorRegistry.registerEvaluator(INSERT_AT, Sequence.INSERT_AT);
        EvaluatorRegistry.registerEvaluator(HAS_DUPLICATES, Sequence.HAS_DUPLICATES);
        EvaluatorRegistry.registerEvaluator(INDEX_OF, Sequence.INDEX_OF);
        EvaluatorRegistry.registerEvaluator(GenericOperations.EQUALS, Sequence.EQUALS);
        EvaluatorRegistry.registerEvaluator(GenericOperations.ASSIGNMENT, Sequence.ASSIGNMENT);
    }

}
