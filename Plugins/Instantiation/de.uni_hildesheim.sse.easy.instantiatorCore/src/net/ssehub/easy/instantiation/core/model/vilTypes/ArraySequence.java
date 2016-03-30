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
package net.ssehub.easy.instantiation.core.model.vilTypes;

import net.ssehub.easy.instantiation.core.model.common.VilException;
import net.ssehub.easy.instantiation.core.model.expressions.ExpressionEvaluator;

/**
 * Implements an array wrapper for the VIL sequence type.
 * 
 * @author Holger Eichelberger
 *
 * @param <T> the element type
 */
public class ArraySequence<T> extends AbstractArrayWrapper<T> implements Sequence<T> {

    /**
     * Creates a new array collection wrapper using the default type registry.
     * 
     * @param array the wrapped array
     * @param param the only type parameter characterizing <T>
     */
    public ArraySequence(T[] array, Class<?> param) {
        super(array, TypeRegistry.DEFAULT, false, param);
    }
    
    /**
     * Creates a new array collection wrapper.
     * 
     * @param array the wrapped array
     * @param param the only type parameter characterizing <T>
     * @param registry the type registry to be used for conversion of <code>param</code>
     */
    public ArraySequence(T[] array, Class<?> param, TypeRegistry registry) {
        super(array, registry, false, param);
    }

    /**
     * Creates a new array collection wrapper.
     * 
     * @param array the wrapped array
     * @param params the type parameter characterizing <T>
     */
    public ArraySequence(T[] array, TypeDescriptor<?>... params) {
        super(array, false, params);
    }
    
    @Override
    public T at(int index) {
        T[] array = getArray();
        T result;
        if (null == array || index < 0 || index >= array.length) {
            result = null;
        } else {
            result = array[index];
        }
        return result;
    }
    
    @Override
    public T get(int index) {
        return at(index);
    }

    /**
     * Returns an empty sequence for one type parameter.
     * 
     * @param param the type parameter characterizing <T>
     * @param registry the type registry to use
     * @return an empty sequence
     * @param <T> the element type
     */
    @Invisible
    public static final <T> Sequence<T> empty(Class<?> param, TypeRegistry registry) {
        return empty(registry.findType(param));
    }
    
    /**
     * Returns an empty sequence for one type parameter.
     * 
     * @param param the type parameter characterizing <T>
     * @return an empty sequence
     * @param <T> the element type
     */
    @Invisible
    public static final <T> Sequence<T> empty(TypeDescriptor<?> param) {
        TypeDescriptor<?>[] params = TypeDescriptor.createArray(1);
        params[0] = param;
        return new ArraySequence<T>(null, params);
    }

    @Override
    @OperationMeta(returnGenerics = IVilType.class)
    public Sequence<T> selectByType(TypeDescriptor<?> type) {
        return new ListSequence<T>(selectByType(this, type), getGenericParameter());
    }

    @Override
    @OperationMeta(returnGenerics = IVilType.class)
    public Sequence<T> excluding(Collection<T> sequence) {
        return new ListSequence<T>(excluding(this, sequence), getGenericParameter());
    }
    
    @Override
    @OperationMeta(returnGenerics = IVilType.class)
    public Sequence<T> append(Collection<T> sequence) {
        return new ListSequence<T>(append(this, sequence), getGenericParameter());
    }

    @Override
    public Sequence<T> select(ExpressionEvaluator evaluator) throws VilException {
        TypeDescriptor<?>[] param = TypeDescriptor.createArray(1);
        param[0] = evaluator.getIteratorVariable().getType();
        return new ListSequence<T>(select(this, evaluator), param);
    }

    @OperationMeta(useParameter = 0)
    @Override
    public Sequence<?> collect(ExpressionEvaluator evaluator) throws VilException {
        TypeDescriptor<?>[] param = TypeDescriptor.createArray(1);
        param[0] = evaluator.inferType();
        return new ListSequence<Object>(collect(this, evaluator), param);
    }
    
    @Override
    public Object apply(ExpressionEvaluator evaluator) throws VilException {
        return AbstractCollectionWrapper.apply(this, evaluator);
    }

    @Override
    @OperationMeta(name = "equals")
    public boolean isEquals(Collection<?> elements) {
        return equals(this, elements);
    }

    @Override
    public Set<T> toSet() {
        return new ArraySet<T>(getArray(), getGenericParameter());
    }
    
    @Override
    public Set<T> asSet() {
        return toSet();
    }

    @Override
    @OperationMeta(returnGenerics = IVilType.class)
    public Sequence<T> sortAlpha() {
        Sequence<T> result;
        if (null == getArray()) {
            result = this;
        } else {
            result = new ListSequence<T>(sortAlphaImpl(), getGenericParameter());
        }
        return result;
    }
    
    @Override
    @OperationMeta(returnGenerics = IVilType.class)
    public Sequence<T> sort(ExpressionEvaluator evaluator) throws VilException {
        Sequence<T> result;
        if (null == getArray()) {
            result = this;
        } else {
            result = new ListSequence<T>(sortImpl(evaluator), getGenericParameter());
        }
        return result;
    }
    
    @Override
    @OperationMeta(returnGenerics = IVilType.class)
    public Sequence<T> revert() {
        Sequence<T> result;
        if (null == getArray()) {
            result = this;
        } else {
            result = new ListSequence<T>(revertImpl(), getGenericParameter());
        }
        return result;
    }

    @Override
    public T first() {
        T[] array = getArray();
        T result;
        if (0 == array.length) {
            result = null;
        } else {
            result = array[0];
        }
        return result;
    }

    @Override
    public T last() {
        T[] array = getArray();
        T result;
        if (0 == array.length) {
            result = null;
        } else {
            result = getArray()[size() - 1];
        }
        return result;
    }

    @Override
    public int indexOf(T element) {
        T[] array = getArray();
        int result = -1;
        for (int i = 0; result < 0 && i < array.length; i++) {
            T elt = array[i];
            if ((null == element && null == elt) 
                || (null != element && element.equals(array[i]))) {
                result = i;
            }
        }
        return result;
    }

    @Override
    @OperationMeta(genericArgument = {0 })
    public T add(T element) {
        extendCapacity(1);
        T[] array = getArray();
        array[array.length - 1] = element;
        return element;
    }

    @Override
    public Map<T, T> mapSequence(Sequence<T> other) {
        return SequenceOperations.mapSequence(this, other);
    }

    @Override
    public Map<T, T> mapAny(Sequence<T> other) {
        return SequenceOperations.mapAny(this, other);
    }

}