/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Pc2AvMapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Pc2AvMapping.MappingEntry#getSource <em>Source</em>}</li>
 *   <li>{@link Pc2AvMapping.MappingEntry#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see Pc2AvMapping.Pc2AvMappingPackage#getMappingEntry()
 * @model
 * @generated
 */
public interface MappingEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see Pc2AvMapping.Pc2AvMappingPackage#getMappingEntry_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see Pc2AvMapping.Pc2AvMappingPackage#getMappingEntry_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getTarget();

} // MappingEntry
