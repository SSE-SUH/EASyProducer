package de.uni_hildesheim.sse.easy.ui.productline_editor.configuration;

import java.util.HashMap;
import java.util.Map;

import de.uni_hildesheim.sse.easy.ui.confModel.GUIVariable;
import de.uni_hildesheim.sse.model.confModel.IDecisionVariable;
import de.uni_hildesheim.sse.model.varModel.Attribute;
import de.uni_hildesheim.sse.model.varModel.values.Value;

/**
 * Filter for filtering elements having certain attribute assignments.
 * @author El-Sharkawy
 *
 */
class AttributeFilter extends AbstractConfigurationFilter {
    private Map<String, AttributeFilterItem> attributes;
    
    /**
     * One attribute value which other variables should have.
     * These item allows to differentiate between:
     * <ul>
     * <li>Nothing was specified for a certain attribute</li>
     * <li>An attribute with value <tt>null</tt> was specified</li>
     * </ul>
     * @author El-Sharkawy
     *
     */
    private static class AttributeFilterItem {
        private Value value;
        
        /**
         * Sole constructor for this item.
         * @param value The value for a specific attribute (the attribute's name will be saved inside
         *     the map). This value can be <tt>null</tt>.
         */
        private AttributeFilterItem(Value value) {
            this.value = value;
        }

        /**
         * Getter for the attribute.
         * @return the value (can be <tt>null</tt>).
         */
        private Value getValue() {
            return value;
        }
    }
    
    /**
     * Creates a new filter which will filter variables, having not at least one attribute assignment
     * of the specified list.
     */
    AttributeFilter() {
        super(false);
        attributes = new HashMap<String, AttributeFilterItem>();
    }
    
    /**
     * Creates a key based on a given attribute.
     * If the same attribute is applied on different elements than the same key should be returned.
     * @param attr The attribute for which a key (String) shall be created (must not be <tt>null</tt>.
     * @return A key to identify the attribute.
     */
    private static String attributeToKey(Attribute attr) {
        return attr.getName();
    }
    
    /**
     * Adds an attribute to this filter. Filtered items must have the same attribute and the same value set.
     * @param attribute The Attribute which other variables should have.
     * @param value The value of the attribute which the variables should have. Can be <tt>null</tt>,
     *     than the variable's attribute value must also be <tt>null</tt>.
     */
    public void add(Attribute attribute, Value value) {
        if (attribute.getType().isAssignableFrom(value.getType())) {
            attributes.put(attributeToKey(attribute), new AttributeFilterItem(value));
        }
    }

    @Override
    protected boolean checkVariable(GUIVariable variable) {
        boolean displayVariable = false;
        IDecisionVariable nestedVariable = variable.getVariable();
        
        for (int i = 0; i < nestedVariable.getAttributesCount() && !displayVariable; i++) {
            IDecisionVariable varAttribute = nestedVariable.getAttribute(i);
            Attribute attribute = (Attribute) varAttribute.getDeclaration();                       
            AttributeFilterItem filterItem = attributes.get(attributeToKey(attribute));
            //Check whether something was specified for this attribute
            if (null != filterItem) {
                // Check whether null was specified for this attribute
                if (null == filterItem.getValue()) {
                    displayVariable = null == varAttribute.getValue();                        
                } else {
                    displayVariable = filterItem.getValue().equals(varAttribute.getValue());
                }
            }
        }
        
        // Check childs, if this variable should not be displayed
        for (int i = 0; i < variable.getNestedElementsCount() && !displayVariable; i++) {
            displayVariable = checkVariable(variable.getNestedElement(i));
        }
        
        return displayVariable;
    }
}
