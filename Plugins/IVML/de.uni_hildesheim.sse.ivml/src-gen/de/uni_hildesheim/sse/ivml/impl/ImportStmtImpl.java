/**
 */
package de.uni_hildesheim.sse.ivml.impl;

import de.uni_hildesheim.sse.ivml.Expression;
import de.uni_hildesheim.sse.ivml.ImportStmt;
import de.uni_hildesheim.sse.ivml.IvmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.ImportStmtImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.ImportStmtImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.ImportStmtImpl#getRestriction <em>Restriction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportStmtImpl extends MinimalEObjectImpl.Container implements ImportStmt
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected static final String INTERFACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected String interface_ = INTERFACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestriction()
   * @generated
   * @ordered
   */
  protected Expression restriction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportStmtImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IvmlPackage.Literals.IMPORT_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.IMPORT_STMT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(String newInterface)
  {
    String oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.IMPORT_STMT__INTERFACE, oldInterface, interface_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRestriction()
  {
    return restriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestriction(Expression newRestriction, NotificationChain msgs)
  {
    Expression oldRestriction = restriction;
    restriction = newRestriction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.IMPORT_STMT__RESTRICTION, oldRestriction, newRestriction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestriction(Expression newRestriction)
  {
    if (newRestriction != restriction)
    {
      NotificationChain msgs = null;
      if (restriction != null)
        msgs = ((InternalEObject)restriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.IMPORT_STMT__RESTRICTION, null, msgs);
      if (newRestriction != null)
        msgs = ((InternalEObject)newRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.IMPORT_STMT__RESTRICTION, null, msgs);
      msgs = basicSetRestriction(newRestriction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.IMPORT_STMT__RESTRICTION, newRestriction, newRestriction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IvmlPackage.IMPORT_STMT__RESTRICTION:
        return basicSetRestriction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IvmlPackage.IMPORT_STMT__NAME:
        return getName();
      case IvmlPackage.IMPORT_STMT__INTERFACE:
        return getInterface();
      case IvmlPackage.IMPORT_STMT__RESTRICTION:
        return getRestriction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IvmlPackage.IMPORT_STMT__NAME:
        setName((String)newValue);
        return;
      case IvmlPackage.IMPORT_STMT__INTERFACE:
        setInterface((String)newValue);
        return;
      case IvmlPackage.IMPORT_STMT__RESTRICTION:
        setRestriction((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IvmlPackage.IMPORT_STMT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IvmlPackage.IMPORT_STMT__INTERFACE:
        setInterface(INTERFACE_EDEFAULT);
        return;
      case IvmlPackage.IMPORT_STMT__RESTRICTION:
        setRestriction((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IvmlPackage.IMPORT_STMT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IvmlPackage.IMPORT_STMT__INTERFACE:
        return INTERFACE_EDEFAULT == null ? interface_ != null : !INTERFACE_EDEFAULT.equals(interface_);
      case IvmlPackage.IMPORT_STMT__RESTRICTION:
        return restriction != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", interface: ");
    result.append(interface_);
    result.append(')');
    return result.toString();
  }

} //ImportStmtImpl
