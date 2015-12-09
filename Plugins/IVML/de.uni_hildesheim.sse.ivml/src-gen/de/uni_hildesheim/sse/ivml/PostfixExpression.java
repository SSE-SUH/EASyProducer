/**
 */
package de.uni_hildesheim.sse.ivml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.PostfixExpression#getCall <em>Call</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.PostfixExpression#getFCalls <em>FCalls</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.PostfixExpression#getAccess <em>Access</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.PostfixExpression#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getPostfixExpression()
 * @model
 * @generated
 */
public interface PostfixExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call</em>' containment reference.
   * @see #setCall(FeatureCall)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getPostfixExpression_Call()
   * @model containment="true"
   * @generated
   */
  FeatureCall getCall();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.PostfixExpression#getCall <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call</em>' containment reference.
   * @see #getCall()
   * @generated
   */
  void setCall(FeatureCall value);

  /**
   * Returns the value of the '<em><b>FCalls</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.ivml.Call}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>FCalls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>FCalls</em>' containment reference list.
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getPostfixExpression_FCalls()
   * @model containment="true"
   * @generated
   */
  EList<Call> getFCalls();

  /**
   * Returns the value of the '<em><b>Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' containment reference.
   * @see #setAccess(ExpressionAccess)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getPostfixExpression_Access()
   * @model containment="true"
   * @generated
   */
  ExpressionAccess getAccess();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.PostfixExpression#getAccess <em>Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' containment reference.
   * @see #getAccess()
   * @generated
   */
  void setAccess(ExpressionAccess value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PrimaryExpression)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getPostfixExpression_Left()
   * @model containment="true"
   * @generated
   */
  PrimaryExpression getLeft();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.PostfixExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PrimaryExpression value);

} // PostfixExpression
