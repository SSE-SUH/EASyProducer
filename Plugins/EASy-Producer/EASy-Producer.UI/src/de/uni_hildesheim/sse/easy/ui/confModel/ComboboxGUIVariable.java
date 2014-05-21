package de.uni_hildesheim.sse.easy.ui.confModel;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.swt.widgets.Composite;

import de.uni_hildesheim.sse.easy.ui.productline_editor.EasyProducerDialog;
import de.uni_hildesheim.sse.model.confModel.IDecisionVariable;
import de.uni_hildesheim.sse.model.varModel.datatypes.IDatatype;
import de.uni_hildesheim.sse.model.varModel.values.Value;
import de.uni_hildesheim.sse.model.varModel.values.ValueDoesNotMatchTypeException;
import de.uni_hildesheim.sse.model.varModel.values.ValueFactory;

/**
 * GUI representation of {@link IDecisionVariable}s which can be configured with a combo box (bounded range).
 * 
 * @author El-Sharkawy
 *
 */
class ComboboxGUIVariable extends GUIVariable {
    private ComboItem[] values;
    private IDatatype type;
    private Composite parent;
    
    /**
     * Elements of this combo box. These elements are 2-tuples:
     * <ul>
     * <li>label (string representation of possible values) for the combo box</li>
     * <li>values as needed by the set value method.</li>
     * </ul>
     * @author El-Sharkawy
     *
     */
    static class ComboItem {        
        private String label;
        private Object value;
        
        /**
         * Sole constructor for this class.
         * @param label String representation of the possible value.
         * @param value The value for setting the value.
         */
        ComboItem(String label, Object value) {
            this.label = label;
            this.value = value;
        }

        /**
         * Returns the label for this class.
         * @return The label
         */
        private String getLabel() {
            return label;
        }

        /**
         * Returns the object as needed by the setValue method.
         * @return Object for setting the value.
         */
        private Object getValue() {
            return value;
        }
    }
    
    /**
     * Sole constructor for this class.
     * @param variable The {@link IDecisionVariable} represented by this GUIVariable
     * @param parent The controlling composite, needed for the creation of CellEditors
     * @param type The type of this GUIVairable,
     * cannot be set by this constructor since RefernceTypes need a special consideration.
     * @param values The list of possible values for this GUIVariable.
     * @param confParent The parent holding this variable. Can be the {@link GUIConfiguration} if and only if
     * this variable is a top level variable stored inside the configuration.
     */
    ComboboxGUIVariable(IDecisionVariable variable, Composite parent, IDatatype type, ComboItem[] values,
        IGUIConfigurableElement confParent) {
        
        super(variable, confParent.getConfiguration(),
            confParent.getConfiguration() == confParent ? null : (GUIVariable) confParent);
        
        this.type = type;
        if (null != values) {
            this.values = values;
        } else {
            this.values = new ComboItem[] {new ComboItem("", null)};
        }
        this.parent = parent;
        
        String[] items = new String[this.values.length];
        for (int i = 0; i < items.length; i++) {
            items[i] = this.values[i].getLabel();
        }
    }

    @Override
    public CellEditor getCellEditor() {
        String[] items = new String[this.values.length];
        for (int i = 0; i < items.length; i++) {
            items[i] = this.values[i].getLabel();
        }
        return new ComboBoxCellEditor(parent, items);
    }

    @Override
    public String getValueText() {
        String result = null;
        if (hasValue() && hasNullValue()) {
            result = GUIVariable.NULL_VALUE_LABEL;
        } else {
            int selectedIndex = (Integer) getValue();
            //If user has entered a valid value by hand, than also -1 is returned :-(
            if (-1 != selectedIndex) {
                result = values[selectedIndex].getLabel();
            }
            
            /* If the variables have been changed outside the gui,
             * the combobox may be set to an old value and consequently
             * returns the wrong value
             */
            Value correctValue = getVariable().getValue();
            if (null != correctValue) {
                if (null == correctValue.getValue()) {
                    result = "";                
                }
            } else {
                result = "";
            }
        }
        
        return result;
    }

    @Override
    protected Value getValueAssignment(Object value) throws ValueDoesNotMatchTypeException {
        Value val = null;
        try {
            int selectedIndex = Integer.parseInt(String.valueOf(value));
            if (selectedIndex >= 0 && null != values[selectedIndex].getValue()) {
                Object selectedValue = values[selectedIndex].getValue();
                val = ValueFactory.createValue(type, selectedValue);
            }
        } catch (ValueDoesNotMatchTypeException e) {
            EasyProducerDialog.showErrorDialog(e.getLocalizedMessage());
        }
        
        return val;
    }

    @Override
    public Object getValue() {
        int selectedIndex = 0;
        Value val = getVariable().getValue();
        
        if (null != val) {
            Object valueItem = val.getValue();
            for (int i = 0; i < values.length && selectedIndex == 0; i++) {
                if (null != values[i].getValue() && values[i].getValue().equals(valueItem)) {
                    selectedIndex = i;
                }
            }
        }
        
        return selectedIndex;
    }
}
