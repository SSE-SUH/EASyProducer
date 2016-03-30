package net.ssehub.easy.varModel.cstEvaluation;

import java.util.Map;

import net.ssehub.easy.varModel.model.datatypes.IDatatype;
import net.ssehub.easy.varModel.model.values.BooleanValue;
import net.ssehub.easy.varModel.model.values.ContainerValue;
import net.ssehub.easy.varModel.model.values.NullValue;
import net.ssehub.easy.varModel.model.values.Value;
import net.ssehub.easy.varModel.model.values.ValueDoesNotMatchTypeException;
import net.ssehub.easy.varModel.model.values.ValueFactory;

/**
 * Implements the container iterators.
 * 
 * @author Holger Eichelberger
 */
class ContainerIterators {
    
    /**
     * Implements {@link net.ssehub.easy.varModel.model.datatypes.Container#APPLY}.
     */
    static final IIteratorEvaluator APPLY = new IIteratorEvaluator() {

        @Override
        public boolean aggregate(EvaluationAccessor result, Value iter, EvaluationAccessor value, 
            Map<Object, Object> data) throws ValueDoesNotMatchTypeException {
            // actual aggregation is defined by the apply expression, do not do here anything :o
            //result.setValue(value.getValue());
            return false;
        }

        @Override
        public Value getStartResult(IDatatype type) throws ValueDoesNotMatchTypeException {
            return null; // explicit defined, shall never be called
        }
        
    };

    /**
     * Implements {@link net.ssehub.easy.varModel.model.datatypes.Container#FORALL}.
     */
    static final IIteratorEvaluator FOR_ALL = new IIteratorEvaluator() {

        @Override
        public boolean aggregate(EvaluationAccessor result, Value iter, EvaluationAccessor value, 
            Map<Object, Object> data) throws ValueDoesNotMatchTypeException {
            if (!(BooleanValue.TRUE.equals(result.getValue()) 
                && BooleanValue.TRUE.equals(value.getValue()))) {
                // forAll is only true if all evaluations are true
                result.setValue(BooleanValue.FALSE);
            }
            return false;
        }

        public Value getStartResult(IDatatype type) throws ValueDoesNotMatchTypeException {
            return BooleanValue.TRUE;
        }
        
    };

    /**
     * Implements {@link net.ssehub.easy.varModel.model.datatypes.Container#EXISTS}.
     */
    static final IIteratorEvaluator EXISTS = new IIteratorEvaluator() {
        
        @Override
        public boolean aggregate(EvaluationAccessor result, Value iter, EvaluationAccessor value, 
            Map<Object, Object> data) throws ValueDoesNotMatchTypeException {
            boolean stop;
            if (BooleanValue.TRUE.equals(value.getValue())) {
                // exists is fine with the first evaluation result that is true
                result.setValue(BooleanValue.TRUE);
                stop = true;
            } else {
                stop = false;
            }
            return stop;
        }

        @Override
        public Value getStartResult(IDatatype type) throws ValueDoesNotMatchTypeException {
            return BooleanValue.FALSE;
        }

    };

    /**
     * Implements {@link net.ssehub.easy.varModel.model.datatypes.Container#IS_UNIQUE}.
     */
    static final IIteratorEvaluator IS_UNIQUE = new IIteratorEvaluator() {
        
        @Override
        public boolean aggregate(EvaluationAccessor result, Value iter, EvaluationAccessor value, 
            Map<Object, Object> data) throws ValueDoesNotMatchTypeException {
            boolean stop;
            Value val = value.getValue();
            if (data.containsKey(val)) {
                stop = true;
                result.setValue(BooleanValue.FALSE);
            } else {
                data.put(val, null);
                stop = false;
            }
            return stop;
        }

        @Override
        public Value getStartResult(IDatatype type) throws ValueDoesNotMatchTypeException {
            return BooleanValue.TRUE;
        }

    };

    /**
     * Implements {@link net.ssehub.easy.varModel.model.datatypes.Container#ANY}.
     */
    static final IIteratorEvaluator ANY = new IIteratorEvaluator() {
        
        @Override
        public boolean aggregate(EvaluationAccessor result, Value iter, EvaluationAccessor value, 
            Map<Object, Object> data) {
            boolean stop;
            if (BooleanValue.TRUE.equals(value.getValue())) {
                stop = true;
                result.setValue(iter);
            } else {
                stop = false;
            }
            return stop;
        }

        @Override
        public Value getStartResult(IDatatype type) throws ValueDoesNotMatchTypeException {
            return NullValue.INSTANCE;
        }

    };

    /**
     * Implements {@link net.ssehub.easy.varModel.model.datatypes.Container#ONE}.
     */
    static final IIteratorEvaluator ONE = new IIteratorEvaluator() {
        
        @Override
        public boolean aggregate(EvaluationAccessor result, Value iter, EvaluationAccessor value, 
            Map<Object, Object> data) throws ValueDoesNotMatchTypeException {
            boolean stop;
            if (BooleanValue.TRUE.equals(value.getValue())) {
                stop = !NullValue.INSTANCE.equals(result.getValue());
                result.setValue(iter);
            } else {
                stop = false;
            }
            return stop;
        }

        @Override
        public Value getStartResult(IDatatype type) throws ValueDoesNotMatchTypeException {
            return NullValue.INSTANCE;
        }

    };

    /**
     * Implements an evaluator adaptor for collecting operations.
     * 
     * @author Holger Eichelberger
     */
    abstract static class CollectingIteratorEvaluator implements IIteratorEvaluator {

        @Override
        public Value getStartResult(IDatatype type) throws ValueDoesNotMatchTypeException {
            return ValueFactory.createValue(type, (Object[]) null);
        }

    }

    /**
     * Implements {@link net.ssehub.easy.varModel.model.datatypes.Container#COLLECT}.
     */
    static final IIteratorEvaluator COLLECT = new CollectingIteratorEvaluator() {
        
        @Override
        public boolean aggregate(EvaluationAccessor result, Value iter, EvaluationAccessor value, 
            Map<Object, Object> data) throws ValueDoesNotMatchTypeException {
            Value cVal = result.getValue();
            if (cVal instanceof ContainerValue) {
                ((ContainerValue) cVal).addElement(value.getValue());
            }
            return false;
        }

    };

    /**
     * Implements {@link net.ssehub.easy.varModel.model.datatypes.Container#SELECT} and
     * {@link net.ssehub.easy.varModel.model.datatypes.Container#REJECT}.
     */
    static class CollectIteratorEvaluator extends CollectingIteratorEvaluator {
        
        private BooleanValue condition;
        
        /**
         * Creates a collect iterator evaluator.
         * 
         * @param condition the boolean value that must be met by the iterated expression results
         */
        CollectIteratorEvaluator(BooleanValue condition) {
            this.condition = condition;
        }
        
        @Override
        public boolean aggregate(EvaluationAccessor result, Value iter, EvaluationAccessor value, 
            Map<Object, Object> data) throws ValueDoesNotMatchTypeException {
            Value cVal = result.getValue();
            if (condition.equals(value.getValue()) && cVal instanceof ContainerValue) {
                ((ContainerValue) cVal).addElement(iter);
            }
            return false;
        }

    };
    
    /**
     * Prevents external creation.
     */
    private ContainerIterators() {
    }
    
}