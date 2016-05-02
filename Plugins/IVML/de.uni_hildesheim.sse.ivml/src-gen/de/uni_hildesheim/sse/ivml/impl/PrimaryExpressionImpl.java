/**
 */
package de.uni_hildesheim.sse.ivml.impl;

import de.uni_hildesheim.sse.ivml.Call;
import de.uni_hildesheim.sse.ivml.Expression;
import de.uni_hildesheim.sse.ivml.ExpressionAccess;
import de.uni_hildesheim.sse.ivml.IfExpression;
import de.uni_hildesheim.sse.ivml.IvmlPackage;
import de.uni_hildesheim.sse.ivml.Literal;
import de.uni_hildesheim.sse.ivml.PrimaryExpression;

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
 * An implementation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.PrimaryExpressionImpl#getLit <em>Lit</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.PrimaryExpressionImpl#getEx <em>Ex</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.PrimaryExpressionImpl#getIfEx <em>If Ex</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.PrimaryExpressionImpl#getRefEx <em>Ref Ex</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.PrimaryExpressionImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.PrimaryExpressionImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryExpressionImpl extends MinimalEObjectImpl.Container implements PrimaryExpression
{
  /**
   * The cached value of the '{@link #getLit() <em>Lit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected Literal lit;

  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected Expression ex;

  /**
   * The cached value of the '{@link #getIfEx() <em>If Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfEx()
   * @generated
   * @ordered
   */
  protected IfExpression ifEx;

  /**
   * The cached value of the '{@link #getRefEx() <em>Ref Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEx()
   * @generated
   * @ordered
   */
  protected Expression refEx;

  /**
   * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalls()
   * @generated
   * @ordered
   */
  protected EList<Call> calls;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected ExpressionAccess access;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryExpressionImpl()
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
    return IvmlPackage.Literals.PRIMARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getLit()
  {
    return lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLit(Literal newLit, NotificationChain msgs)
  {
    Literal oldLit = lit;
    lit = newLit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__LIT, oldLit, newLit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLit(Literal newLit)
  {
    if (newLit != lit)
    {
      NotificationChain msgs = null;
      if (lit != null)
        msgs = ((InternalEObject)lit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__LIT, null, msgs);
      if (newLit != null)
        msgs = ((InternalEObject)newLit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__LIT, null, msgs);
      msgs = basicSetLit(newLit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__LIT, newLit, newLit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getEx()
  {
    return ex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx(Expression newEx, NotificationChain msgs)
  {
    Expression oldEx = ex;
    ex = newEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__EX, oldEx, newEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx(Expression newEx)
  {
    if (newEx != ex)
    {
      NotificationChain msgs = null;
      if (ex != null)
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__EX, newEx, newEx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExpression getIfEx()
  {
    return ifEx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfEx(IfExpression newIfEx, NotificationChain msgs)
  {
    IfExpression oldIfEx = ifEx;
    ifEx = newIfEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__IF_EX, oldIfEx, newIfEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfEx(IfExpression newIfEx)
  {
    if (newIfEx != ifEx)
    {
      NotificationChain msgs = null;
      if (ifEx != null)
        msgs = ((InternalEObject)ifEx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__IF_EX, null, msgs);
      if (newIfEx != null)
        msgs = ((InternalEObject)newIfEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__IF_EX, null, msgs);
      msgs = basicSetIfEx(newIfEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__IF_EX, newIfEx, newIfEx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRefEx()
  {
    return refEx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefEx(Expression newRefEx, NotificationChain msgs)
  {
    Expression oldRefEx = refEx;
    refEx = newRefEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__REF_EX, oldRefEx, newRefEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefEx(Expression newRefEx)
  {
    if (newRefEx != refEx)
    {
      NotificationChain msgs = null;
      if (refEx != null)
        msgs = ((InternalEObject)refEx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__REF_EX, null, msgs);
      if (newRefEx != null)
        msgs = ((InternalEObject)newRefEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__REF_EX, null, msgs);
      msgs = basicSetRefEx(newRefEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__REF_EX, newRefEx, newRefEx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Call> getCalls()
  {
    if (calls == null)
    {
      calls = new EObjectContainmentEList<Call>(Call.class, this, IvmlPackage.PRIMARY_EXPRESSION__CALLS);
    }
    return calls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionAccess getAccess()
  {
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccess(ExpressionAccess newAccess, NotificationChain msgs)
  {
    ExpressionAccess oldAccess = access;
    access = newAccess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__ACCESS, oldAccess, newAccess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(ExpressionAccess newAccess)
  {
    if (newAccess != access)
    {
      NotificationChain msgs = null;
      if (access != null)
        msgs = ((InternalEObject)access).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__ACCESS, null, msgs);
      if (newAccess != null)
        msgs = ((InternalEObject)newAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PRIMARY_EXPRESSION__ACCESS, null, msgs);
      msgs = basicSetAccess(newAccess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.PRIMARY_EXPRESSION__ACCESS, newAccess, newAccess));
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
      case IvmlPackage.PRIMARY_EXPRESSION__LIT:
        return basicSetLit(null, msgs);
      case IvmlPackage.PRIMARY_EXPRESSION__EX:
        return basicSetEx(null, msgs);
      case IvmlPackage.PRIMARY_EXPRESSION__IF_EX:
        return basicSetIfEx(null, msgs);
      case IvmlPackage.PRIMARY_EXPRESSION__REF_EX:
        return basicSetRefEx(null, msgs);
      case IvmlPackage.PRIMARY_EXPRESSION__CALLS:
        return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
      case IvmlPackage.PRIMARY_EXPRESSION__ACCESS:
        return basicSetAccess(null, msgs);
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
      case IvmlPackage.PRIMARY_EXPRESSION__LIT:
        return getLit();
      case IvmlPackage.PRIMARY_EXPRESSION__EX:
        return getEx();
      case IvmlPackage.PRIMARY_EXPRESSION__IF_EX:
        return getIfEx();
      case IvmlPackage.PRIMARY_EXPRESSION__REF_EX:
        return getRefEx();
      case IvmlPackage.PRIMARY_EXPRESSION__CALLS:
        return getCalls();
      case IvmlPackage.PRIMARY_EXPRESSION__ACCESS:
        return getAccess();
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
      case IvmlPackage.PRIMARY_EXPRESSION__LIT:
        setLit((Literal)newValue);
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__EX:
        setEx((Expression)newValue);
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__IF_EX:
        setIfEx((IfExpression)newValue);
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__REF_EX:
        setRefEx((Expression)newValue);
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__CALLS:
        getCalls().clear();
        getCalls().addAll((Collection<? extends Call>)newValue);
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__ACCESS:
        setAccess((ExpressionAccess)newValue);
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
      case IvmlPackage.PRIMARY_EXPRESSION__LIT:
        setLit((Literal)null);
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__EX:
        setEx((Expression)null);
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__IF_EX:
        setIfEx((IfExpression)null);
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__REF_EX:
        setRefEx((Expression)null);
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__CALLS:
        getCalls().clear();
        return;
      case IvmlPackage.PRIMARY_EXPRESSION__ACCESS:
        setAccess((ExpressionAccess)null);
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
      case IvmlPackage.PRIMARY_EXPRESSION__LIT:
        return lit != null;
      case IvmlPackage.PRIMARY_EXPRESSION__EX:
        return ex != null;
      case IvmlPackage.PRIMARY_EXPRESSION__IF_EX:
        return ifEx != null;
      case IvmlPackage.PRIMARY_EXPRESSION__REF_EX:
        return refEx != null;
      case IvmlPackage.PRIMARY_EXPRESSION__CALLS:
        return calls != null && !calls.isEmpty();
      case IvmlPackage.PRIMARY_EXPRESSION__ACCESS:
        return access != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimaryExpressionImpl
