/**
 */
package de.uni_hildesheim.sse.vil.rt.rtVil.impl;

import de.uni_hildesheim.sse.vil.rt.rtVil.FailStatement;
import de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage;
import de.uni_hildesheim.sse.vil.rt.rtVil.RuleElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.RuleElementImpl#getFail <em>Fail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleElementImpl extends de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleElementImpl implements RuleElement
{
  /**
   * The cached value of the '{@link #getFail() <em>Fail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFail()
   * @generated
   * @ordered
   */
  protected FailStatement fail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleElementImpl()
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
    return RtVilPackage.Literals.RULE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FailStatement getFail()
  {
    return fail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFail(FailStatement newFail, NotificationChain msgs)
  {
    FailStatement oldFail = fail;
    fail = newFail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.RULE_ELEMENT__FAIL, oldFail, newFail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFail(FailStatement newFail)
  {
    if (newFail != fail)
    {
      NotificationChain msgs = null;
      if (fail != null)
        msgs = ((InternalEObject)fail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.RULE_ELEMENT__FAIL, null, msgs);
      if (newFail != null)
        msgs = ((InternalEObject)newFail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.RULE_ELEMENT__FAIL, null, msgs);
      msgs = basicSetFail(newFail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.RULE_ELEMENT__FAIL, newFail, newFail));
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
      case RtVilPackage.RULE_ELEMENT__FAIL:
        return basicSetFail(null, msgs);
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
      case RtVilPackage.RULE_ELEMENT__FAIL:
        return getFail();
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
      case RtVilPackage.RULE_ELEMENT__FAIL:
        setFail((FailStatement)newValue);
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
      case RtVilPackage.RULE_ELEMENT__FAIL:
        setFail((FailStatement)null);
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
      case RtVilPackage.RULE_ELEMENT__FAIL:
        return fail != null;
    }
    return super.eIsSet(featureID);
  }

} //RuleElementImpl