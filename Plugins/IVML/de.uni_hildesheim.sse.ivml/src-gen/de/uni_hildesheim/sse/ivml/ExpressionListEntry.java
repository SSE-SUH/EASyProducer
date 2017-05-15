/**
 */
package de.uni_hildesheim.sse.ivml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression List Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.ExpressionListEntry#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.ExpressionListEntry#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.ExpressionListEntry#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.ExpressionListEntry#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getExpressionListEntry()
 * @model
 * @generated
 */
public interface ExpressionListEntry extends EObject
{
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
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getExpressionListEntry_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.ExpressionListEntry#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrib</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrib</em>' attribute.
   * @see #setAttrib(String)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getExpressionListEntry_Attrib()
   * @model
   * @generated
   */
  String getAttrib();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.ExpressionListEntry#getAttrib <em>Attrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrib</em>' attribute.
   * @see #getAttrib()
   * @generated
   */
  void setAttrib(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ImplicationExpression)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getExpressionListEntry_Value()
   * @model containment="true"
   * @generated
   */
  ImplicationExpression getValue();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.ExpressionListEntry#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ImplicationExpression value);

  /**
   * Returns the value of the '<em><b>Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' containment reference.
   * @see #setContainer(ContainerInitializer)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getExpressionListEntry_Container()
   * @model containment="true"
   * @generated
   */
  ContainerInitializer getContainer();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.ExpressionListEntry#getContainer <em>Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' containment reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(ContainerInitializer value);

} // ExpressionListEntry
