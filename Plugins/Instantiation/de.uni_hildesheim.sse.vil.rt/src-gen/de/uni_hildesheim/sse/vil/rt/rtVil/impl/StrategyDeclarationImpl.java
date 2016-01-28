/**
 */
package de.uni_hildesheim.sse.vil.rt.rtVil.impl;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Expression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ParameterList;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.VariableDeclaration;

import de.uni_hildesheim.sse.vil.rt.rtVil.BreakdownElement;
import de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage;
import de.uni_hildesheim.sse.vil.rt.rtVil.RuleElement;
import de.uni_hildesheim.sse.vil.rt.rtVil.StrategyDeclaration;
import de.uni_hildesheim.sse.vil.rt.rtVil.WeightingStatement;

import de.uni_hildesheim.sse.vilBuildLanguage.RuleConditions;

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
 * An implementation of the model object '<em><b>Strategy Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.StrategyDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.StrategyDeclarationImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.StrategyDeclarationImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.StrategyDeclarationImpl#getVarDecls <em>Var Decls</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.StrategyDeclarationImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.StrategyDeclarationImpl#getWeighting <em>Weighting</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.StrategyDeclarationImpl#getBreakdown <em>Breakdown</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.impl.StrategyDeclarationImpl#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyDeclarationImpl extends MinimalEObjectImpl.Container implements StrategyDeclaration
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
   * The cached value of the '{@link #getParamList() <em>Param List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamList()
   * @generated
   * @ordered
   */
  protected ParameterList paramList;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected RuleConditions conditions;

  /**
   * The cached value of the '{@link #getVarDecls() <em>Var Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarDecls()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> varDecls;

  /**
   * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjective()
   * @generated
   * @ordered
   */
  protected Expression objective;

  /**
   * The cached value of the '{@link #getWeighting() <em>Weighting</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeighting()
   * @generated
   * @ordered
   */
  protected WeightingStatement weighting;

  /**
   * The cached value of the '{@link #getBreakdown() <em>Breakdown</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreakdown()
   * @generated
   * @ordered
   */
  protected EList<BreakdownElement> breakdown;

  /**
   * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPost()
   * @generated
   * @ordered
   */
  protected EList<RuleElement> post;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StrategyDeclarationImpl()
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
    return RtVilPackage.Literals.STRATEGY_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.STRATEGY_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList getParamList()
  {
    return paramList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParamList(ParameterList newParamList, NotificationChain msgs)
  {
    ParameterList oldParamList = paramList;
    paramList = newParamList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.STRATEGY_DECLARATION__PARAM_LIST, oldParamList, newParamList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamList(ParameterList newParamList)
  {
    if (newParamList != paramList)
    {
      NotificationChain msgs = null;
      if (paramList != null)
        msgs = ((InternalEObject)paramList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.STRATEGY_DECLARATION__PARAM_LIST, null, msgs);
      if (newParamList != null)
        msgs = ((InternalEObject)newParamList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.STRATEGY_DECLARATION__PARAM_LIST, null, msgs);
      msgs = basicSetParamList(newParamList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.STRATEGY_DECLARATION__PARAM_LIST, newParamList, newParamList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleConditions getConditions()
  {
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditions(RuleConditions newConditions, NotificationChain msgs)
  {
    RuleConditions oldConditions = conditions;
    conditions = newConditions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.STRATEGY_DECLARATION__CONDITIONS, oldConditions, newConditions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditions(RuleConditions newConditions)
  {
    if (newConditions != conditions)
    {
      NotificationChain msgs = null;
      if (conditions != null)
        msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.STRATEGY_DECLARATION__CONDITIONS, null, msgs);
      if (newConditions != null)
        msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.STRATEGY_DECLARATION__CONDITIONS, null, msgs);
      msgs = basicSetConditions(newConditions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.STRATEGY_DECLARATION__CONDITIONS, newConditions, newConditions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getVarDecls()
  {
    if (varDecls == null)
    {
      varDecls = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, RtVilPackage.STRATEGY_DECLARATION__VAR_DECLS);
    }
    return varDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getObjective()
  {
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjective(Expression newObjective, NotificationChain msgs)
  {
    Expression oldObjective = objective;
    objective = newObjective;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.STRATEGY_DECLARATION__OBJECTIVE, oldObjective, newObjective);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjective(Expression newObjective)
  {
    if (newObjective != objective)
    {
      NotificationChain msgs = null;
      if (objective != null)
        msgs = ((InternalEObject)objective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.STRATEGY_DECLARATION__OBJECTIVE, null, msgs);
      if (newObjective != null)
        msgs = ((InternalEObject)newObjective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.STRATEGY_DECLARATION__OBJECTIVE, null, msgs);
      msgs = basicSetObjective(newObjective, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.STRATEGY_DECLARATION__OBJECTIVE, newObjective, newObjective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeightingStatement getWeighting()
  {
    return weighting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeighting(WeightingStatement newWeighting, NotificationChain msgs)
  {
    WeightingStatement oldWeighting = weighting;
    weighting = newWeighting;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtVilPackage.STRATEGY_DECLARATION__WEIGHTING, oldWeighting, newWeighting);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeighting(WeightingStatement newWeighting)
  {
    if (newWeighting != weighting)
    {
      NotificationChain msgs = null;
      if (weighting != null)
        msgs = ((InternalEObject)weighting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.STRATEGY_DECLARATION__WEIGHTING, null, msgs);
      if (newWeighting != null)
        msgs = ((InternalEObject)newWeighting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtVilPackage.STRATEGY_DECLARATION__WEIGHTING, null, msgs);
      msgs = basicSetWeighting(newWeighting, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtVilPackage.STRATEGY_DECLARATION__WEIGHTING, newWeighting, newWeighting));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BreakdownElement> getBreakdown()
  {
    if (breakdown == null)
    {
      breakdown = new EObjectContainmentEList<BreakdownElement>(BreakdownElement.class, this, RtVilPackage.STRATEGY_DECLARATION__BREAKDOWN);
    }
    return breakdown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RuleElement> getPost()
  {
    if (post == null)
    {
      post = new EObjectContainmentEList<RuleElement>(RuleElement.class, this, RtVilPackage.STRATEGY_DECLARATION__POST);
    }
    return post;
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
      case RtVilPackage.STRATEGY_DECLARATION__PARAM_LIST:
        return basicSetParamList(null, msgs);
      case RtVilPackage.STRATEGY_DECLARATION__CONDITIONS:
        return basicSetConditions(null, msgs);
      case RtVilPackage.STRATEGY_DECLARATION__VAR_DECLS:
        return ((InternalEList<?>)getVarDecls()).basicRemove(otherEnd, msgs);
      case RtVilPackage.STRATEGY_DECLARATION__OBJECTIVE:
        return basicSetObjective(null, msgs);
      case RtVilPackage.STRATEGY_DECLARATION__WEIGHTING:
        return basicSetWeighting(null, msgs);
      case RtVilPackage.STRATEGY_DECLARATION__BREAKDOWN:
        return ((InternalEList<?>)getBreakdown()).basicRemove(otherEnd, msgs);
      case RtVilPackage.STRATEGY_DECLARATION__POST:
        return ((InternalEList<?>)getPost()).basicRemove(otherEnd, msgs);
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
      case RtVilPackage.STRATEGY_DECLARATION__NAME:
        return getName();
      case RtVilPackage.STRATEGY_DECLARATION__PARAM_LIST:
        return getParamList();
      case RtVilPackage.STRATEGY_DECLARATION__CONDITIONS:
        return getConditions();
      case RtVilPackage.STRATEGY_DECLARATION__VAR_DECLS:
        return getVarDecls();
      case RtVilPackage.STRATEGY_DECLARATION__OBJECTIVE:
        return getObjective();
      case RtVilPackage.STRATEGY_DECLARATION__WEIGHTING:
        return getWeighting();
      case RtVilPackage.STRATEGY_DECLARATION__BREAKDOWN:
        return getBreakdown();
      case RtVilPackage.STRATEGY_DECLARATION__POST:
        return getPost();
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
      case RtVilPackage.STRATEGY_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__PARAM_LIST:
        setParamList((ParameterList)newValue);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__CONDITIONS:
        setConditions((RuleConditions)newValue);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__VAR_DECLS:
        getVarDecls().clear();
        getVarDecls().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__OBJECTIVE:
        setObjective((Expression)newValue);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__WEIGHTING:
        setWeighting((WeightingStatement)newValue);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__BREAKDOWN:
        getBreakdown().clear();
        getBreakdown().addAll((Collection<? extends BreakdownElement>)newValue);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__POST:
        getPost().clear();
        getPost().addAll((Collection<? extends RuleElement>)newValue);
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
      case RtVilPackage.STRATEGY_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__PARAM_LIST:
        setParamList((ParameterList)null);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__CONDITIONS:
        setConditions((RuleConditions)null);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__VAR_DECLS:
        getVarDecls().clear();
        return;
      case RtVilPackage.STRATEGY_DECLARATION__OBJECTIVE:
        setObjective((Expression)null);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__WEIGHTING:
        setWeighting((WeightingStatement)null);
        return;
      case RtVilPackage.STRATEGY_DECLARATION__BREAKDOWN:
        getBreakdown().clear();
        return;
      case RtVilPackage.STRATEGY_DECLARATION__POST:
        getPost().clear();
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
      case RtVilPackage.STRATEGY_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RtVilPackage.STRATEGY_DECLARATION__PARAM_LIST:
        return paramList != null;
      case RtVilPackage.STRATEGY_DECLARATION__CONDITIONS:
        return conditions != null;
      case RtVilPackage.STRATEGY_DECLARATION__VAR_DECLS:
        return varDecls != null && !varDecls.isEmpty();
      case RtVilPackage.STRATEGY_DECLARATION__OBJECTIVE:
        return objective != null;
      case RtVilPackage.STRATEGY_DECLARATION__WEIGHTING:
        return weighting != null;
      case RtVilPackage.STRATEGY_DECLARATION__BREAKDOWN:
        return breakdown != null && !breakdown.isEmpty();
      case RtVilPackage.STRATEGY_DECLARATION__POST:
        return post != null && !post.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //StrategyDeclarationImpl
