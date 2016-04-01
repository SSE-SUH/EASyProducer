/**
 */
package de.uni_hildesheim.sse.vil.rt.rtVil;

import de.uni_hildesheim.sse.vilBuildLanguage.ExpressionStatement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.IntentDeclaration#getExprStmt <em>Expr Stmt</em>}</li>
 * </ul>
 *
 * @see de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage#getIntentDeclaration()
 * @model
 * @generated
 */
public interface IntentDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Stmt</em>' containment reference.
   * @see #setExprStmt(ExpressionStatement)
   * @see de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage#getIntentDeclaration_ExprStmt()
   * @model containment="true"
   * @generated
   */
  ExpressionStatement getExprStmt();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.vil.rt.rtVil.IntentDeclaration#getExprStmt <em>Expr Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Stmt</em>' containment reference.
   * @see #getExprStmt()
   * @generated
   */
  void setExprStmt(ExpressionStatement value);

} // IntentDeclaration
