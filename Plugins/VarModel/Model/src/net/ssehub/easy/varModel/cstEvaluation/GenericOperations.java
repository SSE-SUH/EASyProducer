/*
 * Copyright 2009-2014 University of Hildesheim, Software Systems Engineering
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ssehub.easy.varModel.cstEvaluation;

import java.util.Locale;

import net.ssehub.easy.varModel.confModel.AssignmentState;
import net.ssehub.easy.varModel.confModel.CompoundVariable;
import net.ssehub.easy.varModel.model.datatypes.AnyType;
import net.ssehub.easy.varModel.model.datatypes.IDatatype;
import net.ssehub.easy.varModel.model.datatypes.IntegerType;
import net.ssehub.easy.varModel.model.datatypes.MetaType;
import net.ssehub.easy.varModel.model.datatypes.RealType;
import net.ssehub.easy.varModel.model.datatypes.StringType;
import net.ssehub.easy.varModel.model.datatypes.TypeQueries;
import net.ssehub.easy.varModel.model.values.BooleanValue;
import net.ssehub.easy.varModel.model.values.CompoundValue;
import net.ssehub.easy.varModel.model.values.MetaTypeValue;
import net.ssehub.easy.varModel.model.values.NullValue;
import net.ssehub.easy.varModel.model.values.ReferenceValue;
import net.ssehub.easy.varModel.model.values.StringValue;
import net.ssehub.easy.varModel.model.values.Value;
import net.ssehub.easy.varModel.model.values.ValueDoesNotMatchTypeException;
import net.ssehub.easy.varModel.model.values.ValueFactory;
import net.ssehub.easy.varModel.persistency.StringProvider;

/**
 * Generic operation implementation for the individual types. Testing shall happen
 * along the operation defining types.
 * 
 * @author Holger Eichelberger
 */
public class GenericOperations {
    
    /**
     * The generic assignment operation.
     */
    static final IOperationEvaluator ASSIGNMENT = new IOperationEvaluator() {

        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            if (arguments.length == 1 && null != operand) {
                if (operand.setValue(arguments[0].getValue())) {
                    result = ConstantAccessor.POOL.getInstance().bind(BooleanValue.TRUE, operand.getContext());
                }
            }
            return result;
        }

    };
    
    /**
     * Implements the generic equals operation.
     */
    static final IOperationEvaluator EQUALS = new IOperationEvaluator() {
        
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            return GenericOperations.equals(operand, arguments, false); 
        }
    };

    /**
     * Implements the generic not-equals operation.
     */
    static final IOperationEvaluator UNEQUALS = new IOperationEvaluator() {
        
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            return GenericOperations.equals(operand, arguments, true); 
        }
    };

    /**
     * Implements the generic toString operation.
     */
    static final IOperationEvaluator TO_STRING = new IOperationEvaluator() {
        
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            if (null != operand) {
                try {
                    Value sv = operand.getValue();
                    String sValue;
                    if (sv instanceof StringValue) {
                        // direct access, avoid IVML quoting
                        sValue = ((StringValue) sv).getValue();
                    } else {
                        sValue = StringProvider.toIvmlString(operand.getValue());
                    }
                    result = ConstantAccessor.POOL.getInstance().bind(
                        ValueFactory.createValue(StringType.TYPE, sValue), 
                        operand.getContext());
                } catch (ValueDoesNotMatchTypeException e) {
                    // result -> null
                } 
            }
            return result; 
        }
    };
    
    /**
     * Implements the "is defined" operation.
     */
    static final IOperationEvaluator IS_DEFINED = new IOperationEvaluator() {
        
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            // get state does not work as there may not be a directly underlying variable
            boolean eval;
            EvaluationContext context;
            if (null == operand) {
                eval = false;
                context = null; // replaced by caller
            } else {
                Value val = operand.getValue();
                eval = !(null == val || NullValue.INSTANCE == val);
                context = operand.getContext();
            }
            BooleanValue result = BooleanValue.toBooleanValue(eval);
            return ConstantAccessor.POOL.getInstance().bind(result, context);
        }
    };

    /**
     * Implements the "typeOf" operation.
     */
    static final IOperationEvaluator TYPE_OF = new IOperationEvaluator() {
        
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            Value oVal = operand.getValue();
            if (null != oVal) {
                try {
                    Value resVal = ValueFactory.createValue(MetaType.TYPE, oVal.getType());
                    result = ConstantAccessor.POOL.getInstance().bind(resVal, operand.getContext());
                } catch (ValueDoesNotMatchTypeException e) {
                    // result -> null
                }
            }
            return result;
        }
    };
    
    /**
     * Implements the "isTypeOf" operation.
     */
    static final IOperationEvaluator IS_TYPE_OF = new IOperationEvaluator() {
        
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            if (1 == arguments.length) {
                IDatatype oType = toType(operand.getValue());
                IDatatype aType = toType(arguments[0].getValue());
                if (null != oType && null != aType) {
                    BooleanValue res = BooleanValue.toBooleanValue(TypeQueries.sameTypes(oType, aType));
                    result = ConstantAccessor.POOL.getInstance().bind(res, operand.getContext());
                }
            }
            return result;
        }
    };
    
    /**
     * Implements the "isKindOf" operation.
     */
    static final IOperationEvaluator IS_KIND_OF = new IOperationEvaluator() {
        
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            if (1 == arguments.length) {
                IDatatype oType = toType(operand.getValue());
                IDatatype aType = toType(arguments[0].getValue());
                if (null != oType && null != aType) {
                    BooleanValue res = BooleanValue.toBooleanValue(oType.isAssignableFrom(aType));
                    result = ConstantAccessor.POOL.getInstance().bind(res, operand.getContext());
                }
            }
            return result;
        }
    };

    static final IOperationEvaluator GET_LOCALE = new IOperationEvaluator() {
        
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            try {
                result = ConstantAccessor.POOL.getInstance().bind(ValueFactory.createValue(StringType.TYPE, 
                    localeToString(operand)), operand.getContext());
            } catch (ValueDoesNotMatchTypeException e) {
                // -> null
            }
            return result;
        }
    };

    static final IOperationEvaluator SET_LOCALE = new IOperationEvaluator() {
        
        public EvaluationAccessor evaluate(EvaluationAccessor operand, EvaluationAccessor[] arguments) {
            EvaluationAccessor result = null;
            if (1 == arguments.length) {
                Value arg = arguments[0].getValue();
                if (arg instanceof StringValue) {
                    String loc = ((StringValue) arg).getValue();
                    Locale locale;
                    int pos = loc.indexOf("_");
                    if (pos < 0 && pos + 1 < loc.length()) {
                        locale = new Locale(loc);
                    } else {
                        locale = new Locale(loc.substring(0, pos), loc.substring(pos + 1));
                    }
                    operand.getContext().setLocale(locale);
                    try {
                        result = ConstantAccessor.POOL.getInstance().bind(ValueFactory.createValue(StringType.TYPE, 
                            localeToString(operand)), operand.getContext());
                    } catch (ValueDoesNotMatchTypeException e) {
                        // -> null
                    }
                }
            }
            return result;
        }
    };

    /**
     * Prevents external instantiation.
     */
    private GenericOperations() {
    }

    /**
     * Turns the locale of the accessor/context into a string.
     * 
     * @param accessor the accessor
     * @return the locale as string
     */
    public static String localeToString(EvaluationAccessor accessor) {
        return toString(accessor.getContext().getLocale());
    }

    /**
     * Turns the locale into a string.
     * 
     * @param locale the locale
     * @return the locale as string
     */
    public static String toString(Locale locale) {
        String result = locale.getLanguage();
        String ctry = locale.getCountry();
        if (ctry.length() > 0) {
            result += "_" + ctry;
        }
        return result;
    }

    /**
     * Registers the defined operations.
     */
    public static void register() {
        EvaluatorRegistry.registerEvaluator(IS_TYPE_OF, AnyType.IS_TYPE_OF);
        EvaluatorRegistry.registerEvaluator(IS_KIND_OF, AnyType.IS_KIND_OF);
        EvaluatorRegistry.registerEvaluator(GET_LOCALE, AnyType.GET_LOCALE);
        EvaluatorRegistry.registerEvaluator(SET_LOCALE, AnyType.SET_LOCALE);
    }

    /**
     * Implements a generic equality operation for basic values (excluding compounds and containers).
     * 
     * @param operand the operand value
     * @param arguments the argument values
     * @param negate whether the (boolean) result shall be negated
     * @return a boolean value if equality can be evaluated, <b>null</b> else
     */
    static EvaluationAccessor equals(EvaluationAccessor operand, EvaluationAccessor[] arguments, boolean negate) {
        EvaluationAccessor result;
        
        if (null != operand && null != arguments && arguments.length == 1) {
            Value oValue = operand.getValue();
            Value aValue = arguments[0].getValue();
            
            // Support equals on unequal datatypes (mixed Int/Real).
            if (null != oValue && oValue.getType() == RealType.TYPE && null != aValue
                && aValue.getType() == IntegerType.TYPE) {
                
                result = RealOperations.equalsRealInt(operand, arguments, negate);
            } else if (null != oValue && oValue.getType() == IntegerType.TYPE
                && null != aValue && aValue.getType() == RealType.TYPE) {
                
                result = IntegerOperations.equalsIntReal(operand, arguments, negate);
            } else {
                
                // Equals on same datatypes
                boolean equals; 
                if (!negate && operand.getContext().allowPropagation()) {
                    // special if not assigned, but assignable (not constant), we can do this now
                    if (((null == oValue || !operand.isAssigned()) && operand.isAssignable()) 
                            || isAssignableCompound(operand)) {
                        ASSIGNMENT.evaluate(operand, arguments);
                        oValue = operand.getValue();
                    } else if ((null == aValue) && arguments[0].isAssignable()) {
                        // considers the reverse case 1 == x, x undefined
                        EvaluationAccessor[] temp = new EvaluationAccessor[1];
                        temp[0] = operand;
                        ASSIGNMENT.evaluate(arguments[0], temp);
                        aValue = operand.getValue();
                    }
                }
                if (null == oValue || null == aValue) {
                    result = null;
                } else {
                    boolean operandIsRef = oValue instanceof ReferenceValue;
                    boolean parameterIsRef = aValue instanceof ReferenceValue;
                    if (null == oValue || null == aValue) {
                        // one part is undefined
                        equals = false;
                    } else if (operandIsRef != parameterIsRef) {
                        // One is a reference, the other not -> unpack both and compare values
                        oValue = operand.getDereferencedValue();
                        aValue = arguments[0].getDereferencedValue();
                        equals = oValue.equals(aValue);
                    } else {
                        // No dereferencing is needed (two references a compared based on the containing value)
                        equals = oValue.equals(aValue);
                    }
                    if (negate) {
                        equals = !equals;
                    }
                    BooleanValue resValue = BooleanValue.toBooleanValue(equals);
                    result = ConstantAccessor.POOL.getInstance().bind(resValue, operand.getContext());                
                }
            }
        } else {
            result = null;
        }
        return result;
    }

    /**
     * Implements a generic equality operation for null values.
     * 
     * @param operand the operand value
     * @param argument the argument value 
     * @param context the evaluation context
     * @param negate whether the (boolean) result shall be negated
     * @return a boolean value if equality can be evaluated, <b>null</b> else
     */
    static final EvaluationAccessor equalsNull(Value operand, Value argument, EvaluationContext context, 
        boolean negate) {
        EvaluationAccessor result;
        Boolean equals;
        if (operand instanceof NullValue) {
            if (argument instanceof NullValue) {
                equals = true;
            } else {
                equals = false;
            }
        } else if (operand != null && argument instanceof NullValue) {
            equals = false;
        } else {
            equals = null;
        }
        if (null != equals) {
            if (negate) {
                equals = !equals;
            }
            result = ConstantAccessor.POOL.getInstance().bind(BooleanValue.toBooleanValue(equals), context);
        } else {
            result = null;
        }
        return result;
    }

    /**
     * Returns the type of <code>value</code>.
     * 
     * @param value the value to be turned into its type
     * @return the type (may be <b>null</b>)
     */
    private static IDatatype toType(Value value) {
        IDatatype result;
        if (value instanceof MetaTypeValue) {
            result = ((MetaTypeValue) value).getValue();
        } else if (value != null) {
            result = value.getType();
        } else {
            result = null;
        }
        return result;
    }    
    
    /**
     * Returns true if {@link EvaluationAccessor} is a compound and 
     *  all compounds nested elements are undefined.
     * @param operand {@link EvaluationAccessor} to be checked.
     * @return true if all nested elements are undefined.
     */
    private static boolean isAssignableCompound(EvaluationAccessor operand) {       
        boolean result = false;
        if (operand.getValue() instanceof CompoundValue) {  
            result = true;
            CompoundVariable oCmp = (CompoundVariable) operand.getVariable();
            if (oCmp != null) {
                for (int i = 0; i < oCmp.getNestedElementsCount(); i++) {
                    if (oCmp.getNestedElement(i).getState() != AssignmentState.UNDEFINED) {
                        result = false;
                    }
                }                
            } else {
                result = false;
            }
        } 
        return result;        
    }
    
}
