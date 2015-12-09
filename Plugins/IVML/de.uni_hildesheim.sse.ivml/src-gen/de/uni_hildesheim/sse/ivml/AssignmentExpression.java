/**
 */
package de.uni_hildesheim.sse.ivml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.AssignmentExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.AssignmentExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getAssignmentExpression()
 * @model
 * @generated
 */
public interface AssignmentExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LogicalExpression)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getAssignmentExpression_Left()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getLeft();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.AssignmentExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LogicalExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.ivml.AssignmentExpressionPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getAssignmentExpression_Right()
   * @model containment="true"
   * @generated
   */
  EList<AssignmentExpressionPart> getRight();

} // AssignmentExpression
