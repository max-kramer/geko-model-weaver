/**
 */
package lts_av;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lts_av.Advice#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see lts_av.Lts_avPackage#getAdvice()
 * @model
 * @generated
 */
public interface Advice extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see lts_av.Lts_avPackage#getAdvice_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getChildren();

} // Advice
