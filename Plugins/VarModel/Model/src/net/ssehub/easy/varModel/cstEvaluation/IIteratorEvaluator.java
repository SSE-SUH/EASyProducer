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

import java.util.Map;

import net.ssehub.easy.varModel.model.datatypes.IDatatype;
import net.ssehub.easy.varModel.model.values.Value;
import net.ssehub.easy.varModel.model.values.ValueDoesNotMatchTypeException;

/**
 * Provides an iterator aggregation function. Please note that aggregation functions do not have
 * a state, i.e., no own memory.
 * 
 * @author Holger Eichelberger
 */
public interface IIteratorEvaluator {

    /**
     * Returns the start result. Used in case of all operations where the start result is implicitly clear
     * from the operation itself and not explicitly defined in the model.
     * 
     * @param type the type of the return value
     * @param iterType the type of the iterator expression
     * @return the start value (must comply to <code>type</code>)
     * @throws ValueDoesNotMatchTypeException in case of type compatibility problems
     */
    public Value getStartResult(IDatatype type, IDatatype iterType) throws ValueDoesNotMatchTypeException;
    
    /**
     * Aggregate <code>value</code> to <code>result</code>.
     * 
     * @param result the aggregating result
     * @param iter the current value of the iterator
     * @param value the value to be aggregated
     * @param data arbitrary data to be hold while actually evaluating the function
     * @return a boolean value to indicate whether iteration/evaluation shall stop (<code>true</code> if iteration 
     *   shall stop due to this evaluation, <code>false</code> else), a collection of values as instance of 
     *   {@link ListWrapperValue} where to go on
     * @throws ValueDoesNotMatchTypeException in case of type compatibility problems
     */
    public Value aggregate(EvaluationAccessor result, Value iter, EvaluationAccessor value, Map<Object, Object> data) 
        throws ValueDoesNotMatchTypeException;
    
    /**
     * Called to post-process the actual result at the end after the last iteration. 
     * 
     * @param result the aggregated result so far
     * @param data arbitrary data to be hold while actually evaluating the function
     * @throws ValueDoesNotMatchTypeException in case of type compatibility problems
     */
    public void postProcessResult(EvaluationAccessor result, Map<Object, Object> data) 
        throws ValueDoesNotMatchTypeException;

}
