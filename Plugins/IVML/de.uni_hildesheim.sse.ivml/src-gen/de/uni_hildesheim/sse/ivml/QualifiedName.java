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
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.QualifiedName#getQName <em>QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QualifiedName extends EObject
{
  /**
   * Returns the value of the '<em><b>QName</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>QName</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>QName</em>' attribute list.
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getQualifiedName_QName()
   * @model unique="false"
   * @generated
   */
  EList<String> getQName();

} // QualifiedName
