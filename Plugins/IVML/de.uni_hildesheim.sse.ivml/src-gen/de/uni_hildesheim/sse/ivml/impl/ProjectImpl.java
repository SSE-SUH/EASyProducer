/**
 * <copyright>
 * </copyright>
 *

 */
package de.uni_hildesheim.sse.ivml.impl;

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

import de.uni_hildesheim.sse.ivml.ConflictStmt;
import de.uni_hildesheim.sse.ivml.ImportStmt;
import de.uni_hildesheim.sse.ivml.InterfaceDeclaration;
import de.uni_hildesheim.sse.ivml.IvmlPackage;
import de.uni_hildesheim.sse.ivml.Project;
import de.uni_hildesheim.sse.ivml.ProjectContents;
import de.uni_hildesheim.sse.ivml.VersionStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.ProjectImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.ProjectImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.ProjectImpl#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.ProjectImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.impl.ProjectImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project
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
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected VersionStmt version;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportStmt> imports;

  /**
   * The cached value of the '{@link #getConflicts() <em>Conflicts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConflicts()
   * @generated
   * @ordered
   */
  protected EList<ConflictStmt> conflicts;

  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<InterfaceDeclaration> interfaces;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected ProjectContents contents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectImpl()
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
    return IvmlPackage.Literals.PROJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.PROJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionStmt getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersion(VersionStmt newVersion, NotificationChain msgs)
  {
    VersionStmt oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.PROJECT__VERSION, oldVersion, newVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(VersionStmt newVersion)
  {
    if (newVersion != version)
    {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PROJECT__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PROJECT__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.PROJECT__VERSION, newVersion, newVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportStmt> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportStmt>(ImportStmt.class, this, IvmlPackage.PROJECT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConflictStmt> getConflicts()
  {
    if (conflicts == null)
    {
      conflicts = new EObjectContainmentEList<ConflictStmt>(ConflictStmt.class, this, IvmlPackage.PROJECT__CONFLICTS);
    }
    return conflicts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceDeclaration> getInterfaces()
  {
    if (interfaces == null)
    {
      interfaces = new EObjectContainmentEList<InterfaceDeclaration>(InterfaceDeclaration.class, this, IvmlPackage.PROJECT__INTERFACES);
    }
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectContents getContents()
  {
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContents(ProjectContents newContents, NotificationChain msgs)
  {
    ProjectContents oldContents = contents;
    contents = newContents;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IvmlPackage.PROJECT__CONTENTS, oldContents, newContents);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContents(ProjectContents newContents)
  {
    if (newContents != contents)
    {
      NotificationChain msgs = null;
      if (contents != null)
        msgs = ((InternalEObject)contents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PROJECT__CONTENTS, null, msgs);
      if (newContents != null)
        msgs = ((InternalEObject)newContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IvmlPackage.PROJECT__CONTENTS, null, msgs);
      msgs = basicSetContents(newContents, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IvmlPackage.PROJECT__CONTENTS, newContents, newContents));
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
      case IvmlPackage.PROJECT__VERSION:
        return basicSetVersion(null, msgs);
      case IvmlPackage.PROJECT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case IvmlPackage.PROJECT__CONFLICTS:
        return ((InternalEList<?>)getConflicts()).basicRemove(otherEnd, msgs);
      case IvmlPackage.PROJECT__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
      case IvmlPackage.PROJECT__CONTENTS:
        return basicSetContents(null, msgs);
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
      case IvmlPackage.PROJECT__NAME:
        return getName();
      case IvmlPackage.PROJECT__VERSION:
        return getVersion();
      case IvmlPackage.PROJECT__IMPORTS:
        return getImports();
      case IvmlPackage.PROJECT__CONFLICTS:
        return getConflicts();
      case IvmlPackage.PROJECT__INTERFACES:
        return getInterfaces();
      case IvmlPackage.PROJECT__CONTENTS:
        return getContents();
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
      case IvmlPackage.PROJECT__NAME:
        setName((String)newValue);
        return;
      case IvmlPackage.PROJECT__VERSION:
        setVersion((VersionStmt)newValue);
        return;
      case IvmlPackage.PROJECT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportStmt>)newValue);
        return;
      case IvmlPackage.PROJECT__CONFLICTS:
        getConflicts().clear();
        getConflicts().addAll((Collection<? extends ConflictStmt>)newValue);
        return;
      case IvmlPackage.PROJECT__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends InterfaceDeclaration>)newValue);
        return;
      case IvmlPackage.PROJECT__CONTENTS:
        setContents((ProjectContents)newValue);
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
      case IvmlPackage.PROJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IvmlPackage.PROJECT__VERSION:
        setVersion((VersionStmt)null);
        return;
      case IvmlPackage.PROJECT__IMPORTS:
        getImports().clear();
        return;
      case IvmlPackage.PROJECT__CONFLICTS:
        getConflicts().clear();
        return;
      case IvmlPackage.PROJECT__INTERFACES:
        getInterfaces().clear();
        return;
      case IvmlPackage.PROJECT__CONTENTS:
        setContents((ProjectContents)null);
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
      case IvmlPackage.PROJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IvmlPackage.PROJECT__VERSION:
        return version != null;
      case IvmlPackage.PROJECT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case IvmlPackage.PROJECT__CONFLICTS:
        return conflicts != null && !conflicts.isEmpty();
      case IvmlPackage.PROJECT__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
      case IvmlPackage.PROJECT__CONTENTS:
        return contents != null;
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

} //ProjectImpl
