/**
 */
package de.uni_hildesheim.sse.vilBuildLanguage.impl;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ArgumentList;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionSpec;

import de.uni_hildesheim.sse.vilBuildLanguage.Instantiate;
import de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.InstantiateImpl#getProject <em>Project</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.InstantiateImpl#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.InstantiateImpl#getParam <em>Param</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.InstantiateImpl#getVersionSpec <em>Version Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantiateImpl extends MinimalEObjectImpl.Container implements Instantiate
{
  /**
   * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProject()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProject()
   * @generated
   * @ordered
   */
  protected String project = PROJECT_EDEFAULT;

  /**
   * The default value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleName()
   * @generated
   * @ordered
   */
  protected static final String RULE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleName()
   * @generated
   * @ordered
   */
  protected String ruleName = RULE_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getVersionSpec() <em>Version Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionSpec()
   * @generated
   * @ordered
   */
  protected VersionSpec versionSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstantiateImpl()
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
    return VilBuildLanguagePackage.Literals.INSTANTIATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProject()
  {
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProject(String newProject)
  {
    String oldProject = project;
    project = newProject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VilBuildLanguagePackage.INSTANTIATE__PROJECT, oldProject, project));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRuleName()
  {
    return ruleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleName(String newRuleName)
  {
    String oldRuleName = ruleName;
    ruleName = newRuleName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VilBuildLanguagePackage.INSTANTIATE__RULE_NAME, oldRuleName, ruleName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VilBuildLanguagePackage.INSTANTIATE__PARAM, oldParam, newParam);
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
        msgs = ((InternalEObject)param).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VilBuildLanguagePackage.INSTANTIATE__PARAM, null, msgs);
      if (newParam != null)
        msgs = ((InternalEObject)newParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VilBuildLanguagePackage.INSTANTIATE__PARAM, null, msgs);
      msgs = basicSetParam(newParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VilBuildLanguagePackage.INSTANTIATE__PARAM, newParam, newParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionSpec getVersionSpec()
  {
    return versionSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersionSpec(VersionSpec newVersionSpec, NotificationChain msgs)
  {
    VersionSpec oldVersionSpec = versionSpec;
    versionSpec = newVersionSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VilBuildLanguagePackage.INSTANTIATE__VERSION_SPEC, oldVersionSpec, newVersionSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersionSpec(VersionSpec newVersionSpec)
  {
    if (newVersionSpec != versionSpec)
    {
      NotificationChain msgs = null;
      if (versionSpec != null)
        msgs = ((InternalEObject)versionSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VilBuildLanguagePackage.INSTANTIATE__VERSION_SPEC, null, msgs);
      if (newVersionSpec != null)
        msgs = ((InternalEObject)newVersionSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VilBuildLanguagePackage.INSTANTIATE__VERSION_SPEC, null, msgs);
      msgs = basicSetVersionSpec(newVersionSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VilBuildLanguagePackage.INSTANTIATE__VERSION_SPEC, newVersionSpec, newVersionSpec));
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
      case VilBuildLanguagePackage.INSTANTIATE__PARAM:
        return basicSetParam(null, msgs);
      case VilBuildLanguagePackage.INSTANTIATE__VERSION_SPEC:
        return basicSetVersionSpec(null, msgs);
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
      case VilBuildLanguagePackage.INSTANTIATE__PROJECT:
        return getProject();
      case VilBuildLanguagePackage.INSTANTIATE__RULE_NAME:
        return getRuleName();
      case VilBuildLanguagePackage.INSTANTIATE__PARAM:
        return getParam();
      case VilBuildLanguagePackage.INSTANTIATE__VERSION_SPEC:
        return getVersionSpec();
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
      case VilBuildLanguagePackage.INSTANTIATE__PROJECT:
        setProject((String)newValue);
        return;
      case VilBuildLanguagePackage.INSTANTIATE__RULE_NAME:
        setRuleName((String)newValue);
        return;
      case VilBuildLanguagePackage.INSTANTIATE__PARAM:
        setParam((ArgumentList)newValue);
        return;
      case VilBuildLanguagePackage.INSTANTIATE__VERSION_SPEC:
        setVersionSpec((VersionSpec)newValue);
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
      case VilBuildLanguagePackage.INSTANTIATE__PROJECT:
        setProject(PROJECT_EDEFAULT);
        return;
      case VilBuildLanguagePackage.INSTANTIATE__RULE_NAME:
        setRuleName(RULE_NAME_EDEFAULT);
        return;
      case VilBuildLanguagePackage.INSTANTIATE__PARAM:
        setParam((ArgumentList)null);
        return;
      case VilBuildLanguagePackage.INSTANTIATE__VERSION_SPEC:
        setVersionSpec((VersionSpec)null);
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
      case VilBuildLanguagePackage.INSTANTIATE__PROJECT:
        return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
      case VilBuildLanguagePackage.INSTANTIATE__RULE_NAME:
        return RULE_NAME_EDEFAULT == null ? ruleName != null : !RULE_NAME_EDEFAULT.equals(ruleName);
      case VilBuildLanguagePackage.INSTANTIATE__PARAM:
        return param != null;
      case VilBuildLanguagePackage.INSTANTIATE__VERSION_SPEC:
        return versionSpec != null;
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
    result.append(" (project: ");
    result.append(project);
    result.append(", ruleName: ");
    result.append(ruleName);
    result.append(')');
    return result.toString();
  }

} //InstantiateImpl
