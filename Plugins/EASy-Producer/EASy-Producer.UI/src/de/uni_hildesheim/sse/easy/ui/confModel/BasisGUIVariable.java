package de.uni_hildesheim.sse.easy.ui.confModel;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.uni_hildesheim.sse.model.confModel.IDecisionVariable;
import de.uni_hildesheim.sse.model.varModel.datatypes.IDatatype;
import de.uni_hildesheim.sse.model.varModel.datatypes.StringType;
import de.uni_hildesheim.sse.model.varModel.values.Value;
import de.uni_hildesheim.sse.model.varModel.values.ValueDoesNotMatchTypeException;
import de.uni_hildesheim.sse.model.varModel.values.ValueFactory;

/**
 * GUI representation of {@link IDecisionVariable}s which can be configured with a simple text editor.
 * 
 * @author El-Sharkawy
 *
 */
class BasisGUIVariable extends GUIVariable {
    
    /**
     * Sole constructor for this class.
     * @param variable The {@link IDecisionVariable} represented by this GUIVariable
     * @param parent The controlling composite, needed for the creation of CellEditors
     * @param config The {@link GUIConfiguration} holding this BasisGUIVariable
     * @param varParent The parent GUIVariable holding this variable. Can be <tt>null</tt> if and only if this variable
     * is a top level variable stored inside the configuration.
     */
    BasisGUIVariable(IDecisionVariable variable, Composite parent, GUIConfiguration config, GUIVariable varParent) {
        super(variable, config, varParent, parent);
    }

    @Override
    public CellEditor getCellEditor(Composite parent) {
        CellEditor result;
        if (GUIValueFactory.createUpdatableCellEditors()) {
            result = new TextGUICellEditor(parent, this);
        } else {
            result = new TextCellEditor(parent);
        }
        return result;
    }
    
    @Override
    public GUIEditor getEditor() {
        Text result = new Text(getComposite(), SWT.SINGLE | SWT.BORDER);
        result.setText(getValueText());
        return new TextGUIEditor(result);
    }

    @Override
    public String getValueText() {
        String value = null;
        if (hasNullValue()) {
            value = getNullLabel();
        } else {
            ConfigEditorValueRetriever retriever = new ConfigEditorValueRetriever(getVariable());
            value = retriever.getValue().toString();
        }
        return value;
    }

    @Override
    protected Value getValueAssignment(Object value) throws ValueDoesNotMatchTypeException {
        Value val = null;
        IDatatype type = getVariable().getDeclaration().getType();
        if (!"".equals(value) || type.isAssignableFrom(StringType.TYPE)) {
            val = ValueFactory.createValue(type, value);
        }
        
        return val;
    }

    @Override
    public Object getValue() {
        String value = "";
        if (hasValue()) {
            if (hasNullValue()) {
                value = getNullLabel();
            } else {
                value = getVariable().getValue().getValue().toString();
            }
        }
        
        return value;
    }
}
