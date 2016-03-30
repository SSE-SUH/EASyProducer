package net.ssehub.easy.instantiation.core.model.vilTypes;

import java.util.Iterator;

import net.ssehub.easy.instantiation.core.model.common.VilException;
import net.ssehub.easy.instantiation.core.model.expressions.ExpressionEvaluator;

/**
 * Implements an unmodifiable set wrapper. This is just a runtime type.
 * 
 * @param <T> the parameter type
 * @author Holger Eichelberger
 */
public class UnmodifiableSet<T> implements Set<T> {

    private Set<T> set;
    
    /**
     * Creates an unmodifiable set wrapper.
     * 
     * @param set the set to be wrapped
     */
    public UnmodifiableSet(Set<T> set) {
        this.set = set;
    }
    
    @Override
    public int getGenericParameterCount() {
        return set.getGenericParameterCount();
    }

    @Override
    public TypeDescriptor<?> getGenericParameterType(int index) {
        return set.getGenericParameterType(index);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean allowSequenceAdjustment() {
        return set.allowSequenceAdjustment();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean isNotEmpty() {
        return set.isNotEmpty();
    }

    @Override
    public boolean includes(T element) {
        return set.includes(element);
    }

    @Override
    public boolean excludes(T element) {
        return set.excludes(element);
    }

    @Override
    public int count(T element) {
        return set.count(element);
    }

    @Override
    public Iterator<T> iterator() {
        return set.iterator();
    }

    @Override
    public boolean isEquals(Collection<?> elements) {
        return set.isEquals(elements);
    }

    @Override
    public String getStringValue(StringComparator comparator) {
        return set.getStringValue(comparator);
    }

    @Override
    public Set<T> selectByType(TypeDescriptor<?> type) {
        return set.selectByType(type);
    }

    @Override
    public Set<T> excluding(Collection<T> set) {
        return this.set.excluding(set);
    }

    @Override
    public Set<T> including(Collection<T> set) {
        return this.set.including(set);
    }

    @Override
    @OperationMeta(genericArgument = {0 })
    public T add(T element) {
        return element; // do nothing, unmodifiable
    }

    @Override
    public boolean remove(T element) {
        // do nothing, unmodifiable
        return false;
    }

    @Override
    public Set<T> select(ExpressionEvaluator evaluator) throws VilException {
        return set.select(evaluator);
    }
    
    @OperationMeta(useParameter = 0)
    @Override
    public Set<?> collect(ExpressionEvaluator evaluator) throws VilException {
        return set.collect(evaluator);
    }
    
    @Override
    public Object apply(ExpressionEvaluator evaluator) throws VilException {
        return set.apply(evaluator);
    }

    @Override
    public Sequence<T> toSequence() {
        Sequence<T> result = set.toSequence();
        if (!(result instanceof UnmodifiableSequence)) {
            result = new UnmodifiableSequence<T>(result);
        }
        return result;
    }
    
    @Override
    public Sequence<T> asSequence() {
        return toSequence();
    }

    @Override
    public T projectSingle() {
        return set.projectSingle();
    }

    @Override
    public boolean equals(Object object) {
        return set.equals(object);
    }
    
    @Override
    public int hashCode() {
        return set.hashCode();
    }

    @Override
    public java.util.Set<T> toMappedSet() {
        return set.toMappedSet();
    }

    @Override
    public TypeDescriptor<?> getType() {
        return set.getType();
    }

    /**
     * Compute the union of this set and <code>set</code> (without duplicates).
     * 
     * @param set the elements to be unified with this set
     * @return the union of this set and <code>set</code>
     */
    @Override
    public Set<T> union(Set<T> set) {
        return this.set.union(set);
    }

    /**
     * Returns the intersection of this set with <code>set</code>.
     * 
     * @param set the elements to be unified with this set
     * @return the union of this set and <code>set</code>
     */
    @Override
    public Set<T> intersection(Set<T> set) {
        return this.set.intersection(set);
    }

}