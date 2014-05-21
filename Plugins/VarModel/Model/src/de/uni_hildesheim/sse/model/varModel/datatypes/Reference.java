package de.uni_hildesheim.sse.model.varModel.datatypes;

import de.uni_hildesheim.sse.model.varModel.IModelVisitor;
import de.uni_hildesheim.sse.model.varModel.ModelElement;


/** 
 * A reference allows the definition of individual configurations of an (external) element for the referencing element.
 * Currently, operations such as assignments are represented as the respective operations of the base type. Actually, 
 * this may be confusing / wrong. See {@link de.uni_hildesheim.sse.model.cst.ConstraintSyntaxTree#inferDatatype()}.
 * 
 * @author heiko beck
 * @author Holger Eichelberger
 **/
public class Reference extends CustomDatatype {
    
    // DO !NOT! touch the // checkstyle: comments!

    // checkstyle: stop declaration order check

    static final DelegatingType DTYPE = new DelegatingType();
    
    /**
     * This constant represents the common type of all references. Each specific reference type 
     * is assignable to this type.
     */
    public static final IDatatype TYPE = DTYPE;

    public static final Operation TYPE_OF = new Operation(MetaType.TYPE, OclKeyWords.TYPE_OF, TYPE);
    public static final Operation EQUALS 
        = Operation.createInfixOperator(BooleanType.TYPE, OclKeyWords.EQUALS, TYPE, TYPE);
    public static final Operation UNEQUALS 
        = Operation.createInfixOperator(BooleanType.TYPE, OclKeyWords.UNEQUALS, TYPE, TYPE);
    public static final Operation ASSIGNMENT 
        = Operation.createInfixOperator(BooleanType.TYPE, OclKeyWords.ASSIGNMENT, TYPE, TYPE);
    public static final Operation IS_DEFINED = new Operation(BooleanType.TYPE, OclKeyWords.IS_DEFINED, TYPE);    
 
    // checkstyle: resume declaration order check
    
    static {
        DTYPE.setDelegate(new Reference());
        DTYPE.addOperation(TYPE_OF);
        DTYPE.addOperation(IS_DEFINED);
        DTYPE.addOperation(EQUALS);
        DTYPE.addOperation(UNEQUALS);
        DTYPE.addOperation(ASSIGNMENT);
    }
    
    private IDatatype type;

    /**
     * Creates the singleton instance for {@link #TYPE}.
     */
    private Reference() {
        this("<Reference>", null, null);
    }
    
    /**
     * Constructor for the reference.
     * @param name Name of reference
     * @param type the type to refer to
     * @param parent the object, in which this specific one is embedded
     */
    public Reference(String name, IDatatype type, ModelElement parent) {
        super(name, DTYPE, parent);
        this.type = type;
    }
    
    /**
     * Returns the type this reference is referring to.
     * 
     * @return the type
     */
    public IDatatype getType() {
        return type;
    }

    /** 
     * Accept method for the visitor.
     * 
     * @param visitor The visitor, which should process this model element.
     */
    public void accept(IModelVisitor visitor) {
        visitor.visitReference(this);
    }

    /**
     * {@inheritDoc}
     */
    public void accept(IDatatypeVisitor visitor) {
        visitor.visitReference(this);
    }
    
    /**
    * Determines if the data type represented by this
    * object is either the same as, or is a supertype of 
    * <code>type</code>.
    * 
    * @param type the type being checked
    * @return <code>true</code> if this type is either the same or a 
    *   supertype of <code>type</code>, <code>true</code> else
    */
    public boolean isAssignableFrom(IDatatype type) {
        boolean isAssignable = AnyType.TYPE == type;
        if (super.isAssignableFrom(type) && type instanceof Reference) {
            Reference r = (Reference) type;
            if (null == this.type) {
                isAssignable = true; // this is akin to Reference.INSTANCE so everything reference can be assinged
            } else {
                if (null != r.type) {
                    isAssignable = this.type.isAssignableFrom(r.type);
                }
            }
        }
        return isAssignable;
    }
    
    /**
     * Aims at dereference <code>type</code> in case that it is a reference.
     * 
     * @param type the type to dereference
     * @return the dereferenced type (or <code>type</code> if <code>type</code> was not a reference)
     */
    public static IDatatype dereference(IDatatype type) {
        // TODO actually I'm not happy about this explicit dereferencing
        IDatatype result;
        if (type instanceof Reference) {
            result = ((Reference) type).getType();
        } else {
            result = type;
        }
        return result;
    }

    /**
     * Dereferences all datatypes in <code>type</code>.
     * 
     * @param types the types to be dereferenced
     */
    public static void dereference(IDatatype[] types) {
        if (null != types) {
            for (int p = 0; p < types.length; p++) {
                types[p] = Reference.dereference(types[p]);
            }            
        }
    }

}
