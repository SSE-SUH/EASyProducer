package de.uni_hildesheim.sse.model.cst;

import java.util.HashMap;
import java.util.Map;

import de.uni_hildesheim.sse.model.varModel.AbstractVariable;

/**
 * Utility class for caching / pooling variables in order to save memory.
 * Please use this class local to a model / operation in order avoid that memory
 * remains allocated although not used. 
 * 
 * @author Sascha El-Sharkawy
 * @author Holger Eichelberger
 */
public class VariablePool {

    private static final boolean ENABLE = true; // for testing, debugging, measuring
    private Map<AbstractVariable, Variable> variablesCache = new HashMap<AbstractVariable, Variable>();

    /**
     * Returns a {@link Variable} for the given {@link AbstractVariable}.
     * This method will cache already created {@link Variable}s to reduce memory consumption.
     * 
     * @param decl A {@link AbstractVariable} for which a {@link Variable} shall be created.
     * @return A cached {@link Variable} for the given {@link AbstractVariable} or a new one
     *     if no cached variable exists, a new one is created and will be cached for future calls.
     */
    public final Variable obtainVariable(AbstractVariable decl) {
        Variable variable;
        if (ENABLE) {
            variable = variablesCache.get(decl);
        } else {
            variable = null;
        }
        if (null == variable) {
            variable = new Variable(decl);
            variablesCache.put(decl, variable);
        }
        return variable;
    }
    
    /**
     * Clears this pool for reuse or to force unallocation of memory.
     */
    public final void clear() {
        variablesCache.clear();
    }
    
}
