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
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Pc2AvMapping.Mapping#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see Pc2AvMapping.Pc2AvMappingPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link Pc2AvMapping.MappingEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see Pc2AvMapping.Pc2AvMappingPackage#getMapping_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MappingEntry> getEntries();

} // Mapping
