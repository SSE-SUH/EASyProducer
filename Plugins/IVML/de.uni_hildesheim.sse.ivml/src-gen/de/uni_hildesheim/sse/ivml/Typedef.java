/**
 * <copyright>
 * </copyright>
 *

 */
package de.uni_hildesheim.sse.ivml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typedef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.Typedef#getTEnum <em>TEnum</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.Typedef#getTCompound <em>TCompound</em>}</li>
 *   <li>{@link de.uni_hildesheim.sse.ivml.Typedef#getTMapping <em>TMapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getTypedef()
 * @model
 * @generated
 */
public interface Typedef extends EObject
{
  /**
   * Returns the value of the '<em><b>TEnum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TEnum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TEnum</em>' containment reference.
   * @see #setTEnum(TypedefEnum)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getTypedef_TEnum()
   * @model containment="true"
   * @generated
   */
  TypedefEnum getTEnum();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.Typedef#getTEnum <em>TEnum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TEnum</em>' containment reference.
   * @see #getTEnum()
   * @generated
   */
  void setTEnum(TypedefEnum value);

  /**
   * Returns the value of the '<em><b>TCompound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TCompound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TCompound</em>' containment reference.
   * @see #setTCompound(TypedefCompound)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getTypedef_TCompound()
   * @model containment="true"
   * @generated
   */
  TypedefCompound getTCompound();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.Typedef#getTCompound <em>TCompound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TCompound</em>' containment reference.
   * @see #getTCompound()
   * @generated
   */
  void setTCompound(TypedefCompound value);

  /**
   * Returns the value of the '<em><b>TMapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TMapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TMapping</em>' containment reference.
   * @see #setTMapping(TypedefMapping)
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getTypedef_TMapping()
   * @model containment="true"
   * @generated
   */
  TypedefMapping getTMapping();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.ivml.Typedef#getTMapping <em>TMapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TMapping</em>' containment reference.
   * @see #getTMapping()
   * @generated
   */
  void setTMapping(TypedefMapping value);

} // Typedef
