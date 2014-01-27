/**
 * <copyright>
 * </copyright>
 *

 */
package de.uni_hildesheim.sse.ivml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.Eval#getNested <em>Nested</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.Eval#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getEval()
 * @model
 * @generated
 */
public interface Eval extends EObject
{
  /**
   * Returns the value of the '<em><b>Nested</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.ivml.Eval}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested</em>' containment reference list.
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getEval_Nested()
   * @model containment="true"
   * @generated
   */
  EList<Eval> getNested();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.ivml.ExpressionStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getEval_Statements()
   * @model containment="true"
   * @generated
   */
  EList<ExpressionStatement> getStatements();

} // Eval
