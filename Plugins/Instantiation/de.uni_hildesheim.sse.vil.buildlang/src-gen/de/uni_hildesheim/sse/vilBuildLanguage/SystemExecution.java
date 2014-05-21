/**
 */
package de.uni_hildesheim.sse.vilBuildLanguage;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Call;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.SubCall;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.SystemExecution#getCall <em>Call</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vilBuildLanguage.SystemExecution#getCalls <em>Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage#getSystemExecution()
 * @model
 * @generated
 */
public interface SystemExecution extends EObject
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
   * @see #setCall(Call)
   * @see de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage#getSystemExecution_Call()
   * @model containment="true"
   * @generated
   */
  Call getCall();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.vilBuildLanguage.SystemExecution#getCall <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call</em>' containment reference.
   * @see #getCall()
   * @generated
   */
  void setCall(Call value);

  /**
   * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.SubCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calls</em>' containment reference list.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage#getSystemExecution_Calls()
   * @model containment="true"
   * @generated
   */
  EList<SubCall> getCalls();

} // SystemExecution
