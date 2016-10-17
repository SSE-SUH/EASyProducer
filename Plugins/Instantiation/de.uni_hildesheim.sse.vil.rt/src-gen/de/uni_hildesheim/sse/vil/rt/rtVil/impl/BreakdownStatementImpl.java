/**
 */
package de.uni_hildesheim.sse.vil.rt.rtVil.impl;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ArgumentList;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Expression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.LogicalExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.QualifiedPrefix;

import de.uni_hildesheim.sse.vil.rt.rtVil.BreakdownStatement;
import de.uni_hildesheim.sse.vil.rt.rtVil.BreakdownWithPart;
import de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breakdown Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.BreakdownStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.BreakdownStatementImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.BreakdownStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.BreakdownStatementImpl#getParam <em>Param</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.BreakdownStatementImpl#getPart <em>Part</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.BreakdownStatementImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakdownStatementImpl extends MinimalEObjectImpl.Container implements BreakdownStatement
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected LogicalExpression guard;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected QualifiedPrefix name;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected ArgumentList param;

  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected EList<BreakdownWithPart> part;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected Expression time;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BreakdownStatementImpl()
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
    return RtVilPackage.Literals.BREAKDOWN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.BREAKDOWN_STATEMENT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalExpression getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(LogicalExpression newGuard, NotificationChain msgs)
  {
    LogicalExpression oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.BREAKDOWN_STATEMENT__GUARD, oldGuard, newGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(LogicalExpression newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.BREAKDOWN_STATEMENT__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.BREAKDOWN_STATEMENT__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.BREAKDOWN_STATEMENT__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedPrefix getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(QualifiedPrefix newName, NotificationChain msgs)
  {
    QualifiedPrefix oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.BREAKDOWN_STATEMENT__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(QualifiedPrefix newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.BREAKDOWN_STATEMENT__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.BREAKDOWN_STATEMENT__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.BREAKDOWN_STATEMENT__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList getParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParam(ArgumentList newParam, NotificationChain msgs)
  {
    ArgumentList oldParam = param;
    param = newParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.BREAKDOWN_STATEMENT__PARAM, oldParam, newParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(ArgumentList newParam)
  {
    if (newParam != param)
    {
      NotificationChain msgs = null;
      if (param != null)
        msgs = ((InternalEObject)param).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.BREAKDOWN_STATEMENT__PARAM, null, msgs);
      if (newParam != null)
        msgs = ((InternalEObject)newParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.BREAKDOWN_STATEMENT__PARAM, null, msgs);
      msgs = basicSetParam(newParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.BREAKDOWN_STATEMENT__PARAM, newParam, newParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BreakdownWithPart> getPart()
  {
    if (part == null)
    {
      part = new EObjectContainmentEList<BreakdownWithPart>(BreakdownWithPart.class, this, RtVilPackage.BREAKDOWN_STATEMENT__PART);
    }
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(Expression newTime, NotificationChain msgs)
  {
    Expression oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.BREAKDOWN_STATEMENT__TIME, oldTime, newTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(Expression newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.BREAKDOWN_STATEMENT__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.BREAKDOWN_STATEMENT__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.BREAKDOWN_STATEMENT__TIME, newTime, newTime));
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
      case RtVilPackage.BREAKDOWN_STATEMENT__GUARD:
        return basicSetGuard(null, msgs);
      case RtVilPackage.BREAKDOWN_STATEMENT__NAME:
        return basicSetName(null, msgs);
      case RtVilPackage.BREAKDOWN_STATEMENT__PARAM:
        return basicSetParam(null, msgs);
      case RtVilPackage.BREAKDOWN_STATEMENT__PART:
        return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
      case RtVilPackage.BREAKDOWN_STATEMENT__TIME:
        return basicSetTime(null, msgs);
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
      case RtVilPackage.BREAKDOWN_STATEMENT__TYPE:
        return getType();
      case RtVilPackage.BREAKDOWN_STATEMENT__GUARD:
        return getGuard();
      case RtVilPackage.BREAKDOWN_STATEMENT__NAME:
        return getName();
      case RtVilPackage.BREAKDOWN_STATEMENT__PARAM:
        return getParam();
      case RtVilPackage.BREAKDOWN_STATEMENT__PART:
        return getPart();
      case RtVilPackage.BREAKDOWN_STATEMENT__TIME:
        return getTime();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RtVilPackage.BREAKDOWN_STATEMENT__TYPE:
        setType((String)newValue);
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__GUARD:
        setGuard((LogicalExpression)newValue);
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__NAME:
        setName((QualifiedPrefix)newValue);
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__PARAM:
        setParam((ArgumentList)newValue);
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__PART:
        getPart().clear();
        getPart().addAll((Collection<? extends BreakdownWithPart>)newValue);
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__TIME:
        setTime((Expression)newValue);
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
      case RtVilPackage.BREAKDOWN_STATEMENT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__GUARD:
        setGuard((LogicalExpression)null);
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__NAME:
        setName((QualifiedPrefix)null);
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__PARAM:
        setParam((ArgumentList)null);
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__PART:
        getPart().clear();
        return;
      case RtVilPackage.BREAKDOWN_STATEMENT__TIME:
        setTime((Expression)null);
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
      case RtVilPackage.BREAKDOWN_STATEMENT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RtVilPackage.BREAKDOWN_STATEMENT__GUARD:
        return guard != null;
      case RtVilPackage.BREAKDOWN_STATEMENT__NAME:
        return name != null;
      case RtVilPackage.BREAKDOWN_STATEMENT__PARAM:
        return param != null;
      case RtVilPackage.BREAKDOWN_STATEMENT__PART:
        return part != null && !part.isEmpty();
      case RtVilPackage.BREAKDOWN_STATEMENT__TIME:
        return time != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //BreakdownStatementImpl
