/**
 */
package de.uni_hildesheim.sse.vil.expressions.expressionDsl.impl;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Constant;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Expression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionOrQualifiedExecution;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.SubCall;

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
 * An implementation of the model object '<em><b>Expression Or Qualified Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.impl.ExpressionOrQualifiedExecutionImpl#getVal <em>Val</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.impl.ExpressionOrQualifiedExecutionImpl#getParenthesis <em>Parenthesis</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.impl.ExpressionOrQualifiedExecutionImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionOrQualifiedExecutionImpl extends MinimalEObjectImpl.Container implements ExpressionOrQualifiedExecution
{
  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Constant val;

  /**
   * The cached value of the '{@link #getParenthesis() <em>Parenthesis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParenthesis()
   * @generated
   * @ordered
   */
  protected Expression parenthesis;

  /**
   * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalls()
   * @generated
   * @ordered
   */
  protected EList<SubCall> calls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionOrQualifiedExecutionImpl()
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
    return ExpressionDslPackage.Literals.EXPRESSION_OR_QUALIFIED_EXECUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(Constant newVal, NotificationChain msgs)
  {
    Constant oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__VAL, oldVal, newVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(Constant newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__VAL, newVal, newVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getParenthesis()
  {
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParenthesis(Expression newParenthesis, NotificationChain msgs)
  {
    Expression oldParenthesis = parenthesis;
    parenthesis = newParenthesis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS, oldParenthesis, newParenthesis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParenthesis(Expression newParenthesis)
  {
    if (newParenthesis != parenthesis)
    {
      NotificationChain msgs = null;
      if (parenthesis != null)
        msgs = ((InternalEObject)parenthesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS, null, msgs);
      if (newParenthesis != null)
        msgs = ((InternalEObject)newParenthesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS, null, msgs);
      msgs = basicSetParenthesis(newParenthesis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS, newParenthesis, newParenthesis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubCall> getCalls()
  {
    if (calls == null)
    {
      calls = new EObjectContainmentEList<SubCall>(SubCall.class, this, ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__CALLS);
    }
    return calls;
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
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__VAL:
        return basicSetVal(null, msgs);
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS:
        return basicSetParenthesis(null, msgs);
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__CALLS:
        return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
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
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__VAL:
        return getVal();
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS:
        return getParenthesis();
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__CALLS:
        return getCalls();
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
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__VAL:
        setVal((Constant)newValue);
        return;
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS:
        setParenthesis((Expression)newValue);
        return;
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__CALLS:
        getCalls().clear();
        getCalls().addAll((Collection<? extends SubCall>)newValue);
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
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__VAL:
        setVal((Constant)null);
        return;
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS:
        setParenthesis((Expression)null);
        return;
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__CALLS:
        getCalls().clear();
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
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__VAL:
        return val != null;
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS:
        return parenthesis != null;
      case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION__CALLS:
        return calls != null && !calls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpressionOrQualifiedExecutionImpl
