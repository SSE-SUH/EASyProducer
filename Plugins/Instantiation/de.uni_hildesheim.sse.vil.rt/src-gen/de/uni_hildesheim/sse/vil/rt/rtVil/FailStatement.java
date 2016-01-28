/**
 */
package de.uni_hildesheim.sse.vil.rt.rtVil;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fail Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.FailStatement#getReason <em>Reason</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.FailStatement#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage#getFailStatement()
 * @model
 * @generated
 */
public interface FailStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reason</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reason</em>' attribute.
   * @see #setReason(String)
   * @see de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage#getFailStatement_Reason()
   * @model
   * @generated
   */
  String getReason();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.vil.rt.rtVil.FailStatement#getReason <em>Reason</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reason</em>' attribute.
   * @see #getReason()
   * @generated
   */
  void setReason(String value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference.
   * @see #setCode(Expression)
   * @see de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage#getFailStatement_Code()
   * @model containment="true"
   * @generated
   */
  Expression getCode();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.vil.rt.rtVil.FailStatement#getCode <em>Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' containment reference.
   * @see #getCode()
   * @generated
   */
  void setCode(Expression value);

} // FailStatement
