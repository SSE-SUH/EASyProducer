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
package de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.common.VilException;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.ExpressionEvaluator;

/**
 * Defines the interface representing a set. The iterator
 * is an internal type which is not registered in the {@link TypeRegistry}.
 * Please note that iterator with one type parameter will be represented by the
 * iterator itself, iterators over multiple types by an iterator over an object
 * array of instances which can be cast into the given types.
 * 
 * This interface and {@link Sequence} shall not be applied together in one class!
 * 
 * @param <T> the element type
 * 
 * @author Holger Eichelberger
 */
public interface Set<T> extends Collection<T> {

    /**
     * Does type selection of artifacts.
     * 
     * @param type the target type
     * @return the selected artifacts (the type will be adjusted to the actual
     *   type for <code>type</code>)
     */
    @OperationMeta(returnGenerics = IVilType.class)
    public Set<T> selectByType(TypeDescriptor<?> type);
    
    /**
     * Exclude the elements in <code>set</code>.
     * @param set the elements to be excluded
     * @return this set without the elements in <code>set</code>
     */
    @OperationMeta(returnGenerics = IVilType.class)
    public Set<T> excluding(Collection<T> set);

    /**
     * Include the elements in <code>set</code>. Duplicates will not be included.
     * @param set the elements to be excluded
     * @return this set without the elements in <code>set</code>
     */
    @OperationMeta(returnGenerics = IVilType.class)
    public Set<T> including(Collection<T> set);
    
    /**
     * Adds an element to this set.
     * 
     * @param element the element to be added
     * @return <code>element</code>
     */
    @OperationMeta(genericArgument = {0 })
    public T add(T element);
    
    /**
     * Removes the given element from this sequence.
     * 
     * @param element the element to be removed
     * @return <code>true</code> of the element was removed, <code>false</code> else
     */
    public boolean remove(T element);
    
    /**
     * Selects elements in this set according to the given expression.
     * 
     * @param evaluator the evaluator (results must evaluate to Boolean results)
     * @return the selected elements
     * @throws VilException in case that selection fails
     */
    public Set<T> select(ExpressionEvaluator evaluator) throws VilException;

    /**
     * Collects the application of <code>evaluator</code> to each individual element.
     * 
     * @param evaluator the evaluator (results must evaluate to Boolean results)
     * @return the application results
     * @throws VilException in case that application fails
     */
    public Set<?> collect(ExpressionEvaluator evaluator) throws VilException;
    
    /**
     * Processes elements in this set by applying to given expression.
     * 
     * @param evaluator the evaluator holding the iterator / expression to apply
     * @return the aggregated value, <b>null</b> in case of no aggregation
     * @throws VilException in case that selection fails
     */
    @OperationMeta(allowsAggregation = true)
    public Object apply(ExpressionEvaluator evaluator) throws VilException;
    
    /**
     * Turns this set into a sequence.
     * 
     * @return the set containing the elements of this set
     */
    public Sequence<T> toSequence();

    /**
     * In case that the sequence has exactly one element, this will be returned.
     * 
     * @return the only element or <b>null</b>
     */
    public T projectSingle();

    /**
     * Converts back to a set for utilizing this with external classes.
     * 
     * @return the internal map
     */
    @Invisible
    public java.util.Set<T> toMappedSet();

}
