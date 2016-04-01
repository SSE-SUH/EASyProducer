/**
 */
package de.uni_hildesheim.sse.vil.rt.rtVil.impl;

import de.uni_hildesheim.sse.vil.rt.rtVil.LanguageUnit;
import de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage;
import de.uni_hildesheim.sse.vil.rt.rtVil.rtContents;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.LanguageUnitImpl#getRtContents <em>Rt Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageUnitImpl extends de.uni_hildesheim.sse.vilBuildLanguage.impl.LanguageUnitImpl implements LanguageUnit
{
  /**
   * The cached value of the '{@link #getRtContents() <em>Rt Contents</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRtContents()
   * @generated
   * @ordered
   */
  protected rtContents rtContents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LanguageUnitImpl()
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
    return RtVilPackage.Literals.LANGUAGE_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rtContents getRtContents()
  {
    return rtContents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRtContents(rtContents newRtContents, NotificationChain msgs)
  {
    rtContents oldRtContents = rtContents;
    rtContents = newRtContents;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.LANGUAGE_UNIT__RT_CONTENTS, oldRtContents, newRtContents);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRtContents(rtContents newRtContents)
  {
    if (newRtContents != rtContents)
    {
      NotificationChain msgs = null;
      if (rtContents != null)
        msgs = ((InternalEObject)rtContents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.LANGUAGE_UNIT__RT_CONTENTS, null, msgs);
      if (newRtContents != null)
        msgs = ((InternalEObject)newRtContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.LANGUAGE_UNIT__RT_CONTENTS, null, msgs);
      msgs = basicSetRtContents(newRtContents, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.LANGUAGE_UNIT__RT_CONTENTS, newRtContents, newRtContents));
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
      case RtVilPackage.LANGUAGE_UNIT__RT_CONTENTS:
        return basicSetRtContents(null, msgs);
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
      case RtVilPackage.LANGUAGE_UNIT__RT_CONTENTS:
        return getRtContents();
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
      case RtVilPackage.LANGUAGE_UNIT__RT_CONTENTS:
        setRtContents((rtContents)newValue);
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
      case RtVilPackage.LANGUAGE_UNIT__RT_CONTENTS:
        setRtContents((rtContents)null);
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
      case RtVilPackage.LANGUAGE_UNIT__RT_CONTENTS:
        return rtContents != null;
    }
    return super.eIsSet(featureID);
  }

} //LanguageUnitImpl
