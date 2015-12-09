/**
 */
package de.uni_hildesheim.sse.vilBuildLanguage.impl;

import de.uni_hildesheim.sse.vilBuildLanguage.Alternative;
import de.uni_hildesheim.sse.vilBuildLanguage.ExpressionStatement;
import de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.ExpressionStatementImpl#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionStatementImpl extends de.uni_hildesheim.sse.vil.expressions.expressionDsl.impl.ExpressionStatementImpl implements ExpressionStatement
{
  /**
   * The cached value of the '{@link #getAlt() <em>Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlt()
   * @generated
   * @ordered
   */
  protected Alternative alt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionStatementImpl()
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
    return VilBuildLanguagePackage.Literals.EXPRESSION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative getAlt()
  {
    return alt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlt(Alternative newAlt, NotificationChain msgs)
  {
    Alternative oldAlt = alt;
    alt = newAlt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VilBuildLanguagePackage.EXPRESSION_STATEMENT__ALT, oldAlt, newAlt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlt(Alternative newAlt)
  {
    if (newAlt != alt)
    {
      NotificationChain msgs = null;
      if (alt != null)
        msgs = ((InternalEObject)alt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VilBuildLanguagePackage.EXPRESSION_STATEMENT__ALT, null, msgs);
      if (newAlt != null)
        msgs = ((InternalEObject)newAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VilBuildLanguagePackage.EXPRESSION_STATEMENT__ALT, null, msgs);
      msgs = basicSetAlt(newAlt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VilBuildLanguagePackage.EXPRESSION_STATEMENT__ALT, newAlt, newAlt));
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
      case VilBuildLanguagePackage.EXPRESSION_STATEMENT__ALT:
        return basicSetAlt(null, msgs);
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
      case VilBuildLanguagePackage.EXPRESSION_STATEMENT__ALT:
        return getAlt();
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
      case VilBuildLanguagePackage.EXPRESSION_STATEMENT__ALT:
        setAlt((Alternative)newValue);
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
      case VilBuildLanguagePackage.EXPRESSION_STATEMENT__ALT:
        setAlt((Alternative)null);
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
      case VilBuildLanguagePackage.EXPRESSION_STATEMENT__ALT:
        return alt != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionStatementImpl
