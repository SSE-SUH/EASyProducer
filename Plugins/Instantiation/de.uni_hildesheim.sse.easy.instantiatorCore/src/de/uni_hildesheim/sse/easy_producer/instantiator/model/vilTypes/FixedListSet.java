package de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes;

import java.util.List;

/**
 * Implements an array wrapper for the VIL set type which does not allow sequence
 * reordering {@link #allowSequenceAdjustment()}.
 * 
 * @author Holger Eichelberger
 *
 * @param <T> the element type
 */
public class FixedListSet<T> extends ListSet<T> {

    /**
     * Creates a new array collection wrapper.
     * 
     * @param list the wrapped list
     * @param registry the registry to convert <code>params</code>
     * @param params the type parameter characterizing <T>
     */
    public FixedListSet(List<T> list, TypeRegistry registry, Class<? extends IVilType>... params) {
        super(list, registry.convert(params));
    }
    
    /**
     * Creates a new array collection wrapper.
     * 
     * @param list the wrapped list
     * @param params the type parameter characterizing <T>
     */
    public FixedListSet(List<T> list, TypeDescriptor<? extends IVilType>... params) {
        super(list, params);
    }
    
    @Override
    public boolean allowSequenceAdjustment() {
        return false;
    }

}
