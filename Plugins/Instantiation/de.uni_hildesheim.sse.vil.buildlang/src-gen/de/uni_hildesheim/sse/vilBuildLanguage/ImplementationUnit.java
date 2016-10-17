/**
 */
package de.uni_hildesheim.sse.vilBuildLanguage;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Import;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit#getImports <em>Imports</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit#getRequires <em>Requires</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @see de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage#getImplementationUnit()
 * @model
 * @generated
 */
public interface ImplementationUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage#getImplementationUnit_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.vilBuildLanguage.Require}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' containment reference list.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage#getImplementationUnit_Requires()
   * @model containment="true"
   * @generated
   */
  EList<Require> getRequires();

  /**
   * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scripts</em>' containment reference list.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage#getImplementationUnit_Scripts()
   * @model containment="true"
   * @generated
   */
  EList<LanguageUnit> getScripts();

} // ImplementationUnit
