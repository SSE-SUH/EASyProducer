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
 * A representation of the model object '<em><b>Variability Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.ivml.VariabilityUnit#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getVariabilityUnit()
 * @model
 * @generated
 */
public interface VariabilityUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_hildesheim.sse.ivml.Project}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projects</em>' containment reference list.
   * @see de.uni_hildesheim.sse.ivml.IvmlPackage#getVariabilityUnit_Projects()
   * @model containment="true"
   * @generated
   */
  EList<Project> getProjects();

} // VariabilityUnit
