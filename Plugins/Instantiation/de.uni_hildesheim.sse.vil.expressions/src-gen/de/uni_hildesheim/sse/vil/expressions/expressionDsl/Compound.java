/**
 */
package de.uni_hildesheim.sse.vil.expressions.expressionDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Compound#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Compound#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Compound#getSuper <em>Super</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Compound#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage#getCompound()
 * @model
 * @generated
 */
public interface Compound extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(String)
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage#getCompound_Abstract()
   * @model
   * @generated
   */
  String getAbstract();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Compound#getAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage#getCompound_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Compound#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super</em>' attribute.
   * @see #setSuper(String)
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage#getCompound_Super()
   * @model
   * @generated
   */
  String getSuper();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Compound#getSuper <em>Super</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super</em>' attribute.
   * @see #getSuper()
   * @generated
   */
  void setSuper(String value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage#getCompound_Vars()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getVars();

} // Compound
