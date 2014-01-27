/**
 * <copyright>
 * </copyright>
 *

 */
package de.uni_hildesheim.sse.ivml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.uni_hildesheim.sse.ivml.IvmlPackage;
import de.uni_hildesheim.sse.ivml.Typedef;
import de.uni_hildesheim.sse.ivml.TypedefCompound;
import de.uni_hildesheim.sse.ivml.TypedefEnum;
import de.uni_hildesheim.sse.ivml.TypedefMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typedef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.TypedefImpl#getTEnum <em>TEnum</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.TypedefImpl#getTCompound <em>TCompound</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.TypedefImpl#getTMapping <em>TMapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypedefImpl extends MinimalEObjectImpl.Container implements Typedef
{
  /**
   * The cached value of the '{@link #getTEnum() <em>TEnum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEnum()
   * @generated
   * @ordered
   */
  protected TypedefEnum tEnum;

  /**
   * The cached value of the '{@link #getTCompound() <em>TCompound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTCompound()
   * @generated
   * @ordered
   */
  protected TypedefCompound tCompound;

  /**
   * The cached value of the '{@link #getTMapping() <em>TMapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTMapping()
   * @generated
   * @ordered
   */
  protected TypedefMapping tMapping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypedefImpl()
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
    return IvmlPackage.Literals.TYPEDEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefEnum getTEnum()
  {
    return tEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTEnum(TypedefEnum newTEnum, NotificationChain msgs)
  {
    TypedefEnum oldTEnum = tEnum;
    tEnum = newTEnum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.TYPEDEF__TENUM, oldTEnum, newTEnum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTEnum(TypedefEnum newTEnum)
  {
    if (newTEnum != tEnum)
    {
      NotificationChain msgs = null;
      if (tEnum != null)
        msgs = ((InternalEObject)tEnum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.TYPEDEF__TENUM, null, msgs);
      if (newTEnum != null)
        msgs = ((InternalEObject)newTEnum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.TYPEDEF__TENUM, null, msgs);
      msgs = basicSetTEnum(newTEnum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.TYPEDEF__TENUM, newTEnum, newTEnum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefCompound getTCompound()
  {
    return tCompound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTCompound(TypedefCompound newTCompound, NotificationChain msgs)
  {
    TypedefCompound oldTCompound = tCompound;
    tCompound = newTCompound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.TYPEDEF__TCOMPOUND, oldTCompound, newTCompound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTCompound(TypedefCompound newTCompound)
  {
    if (newTCompound != tCompound)
    {
      NotificationChain msgs = null;
      if (tCompound != null)
        msgs = ((InternalEObject)tCompound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.TYPEDEF__TCOMPOUND, null, msgs);
      if (newTCompound != null)
        msgs = ((InternalEObject)newTCompound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.TYPEDEF__TCOMPOUND, null, msgs);
      msgs = basicSetTCompound(newTCompound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.TYPEDEF__TCOMPOUND, newTCompound, newTCompound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefMapping getTMapping()
  {
    return tMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTMapping(TypedefMapping newTMapping, NotificationChain msgs)
  {
    TypedefMapping oldTMapping = tMapping;
    tMapping = newTMapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.TYPEDEF__TMAPPING, oldTMapping, newTMapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTMapping(TypedefMapping newTMapping)
  {
    if (newTMapping != tMapping)
    {
      NotificationChain msgs = null;
      if (tMapping != null)
        msgs = ((InternalEObject)tMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.TYPEDEF__TMAPPING, null, msgs);
      if (newTMapping != null)
        msgs = ((InternalEObject)newTMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.TYPEDEF__TMAPPING, null, msgs);
      msgs = basicSetTMapping(newTMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.TYPEDEF__TMAPPING, newTMapping, newTMapping));
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
      case IvmlPackage.TYPEDEF__TENUM:
        return basicSetTEnum(null, msgs);
      case IvmlPackage.TYPEDEF__TCOMPOUND:
        return basicSetTCompound(null, msgs);
      case IvmlPackage.TYPEDEF__TMAPPING:
        return basicSetTMapping(null, msgs);
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
      case IvmlPackage.TYPEDEF__TENUM:
        return getTEnum();
      case IvmlPackage.TYPEDEF__TCOMPOUND:
        return getTCompound();
      case IvmlPackage.TYPEDEF__TMAPPING:
        return getTMapping();
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
      case IvmlPackage.TYPEDEF__TENUM:
        setTEnum((TypedefEnum)newValue);
        return;
      case IvmlPackage.TYPEDEF__TCOMPOUND:
        setTCompound((TypedefCompound)newValue);
        return;
      case IvmlPackage.TYPEDEF__TMAPPING:
        setTMapping((TypedefMapping)newValue);
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
      case IvmlPackage.TYPEDEF__TENUM:
        setTEnum((TypedefEnum)null);
        return;
      case IvmlPackage.TYPEDEF__TCOMPOUND:
        setTCompound((TypedefCompound)null);
        return;
      case IvmlPackage.TYPEDEF__TMAPPING:
        setTMapping((TypedefMapping)null);
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
      case IvmlPackage.TYPEDEF__TENUM:
        return tEnum != null;
      case IvmlPackage.TYPEDEF__TCOMPOUND:
        return tCompound != null;
      case IvmlPackage.TYPEDEF__TMAPPING:
        return tMapping != null;
    }
    return super.eIsSet(featureID);
  }

} //TypedefImpl
