/**
 */
package bsd_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Per Join Point Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bsd_av.PerJoinPointScope#getScopedObject <em>Scoped Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see bsd_av.Bsd_avPackage#getPerJoinPointScope()
 * @model
 * @generated
 */
public interface PerJoinPointScope extends EObject {
	/**
	 * Returns the value of the '<em><b>Scoped Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scoped Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped Object</em>' reference.
	 * @see #setScopedObject(EObject)
	 * @see bsd_av.Bsd_avPackage#getPerJoinPointScope_ScopedObject()
	 * @model required="true"
	 * @generated
	 */
	EObject getScopedObject();

	/**
	 * Sets the value of the '{@link bsd_av.PerJoinPointScope#getScopedObject <em>Scoped Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped Object</em>' reference.
	 * @see #getScopedObject()
	 * @generated
	 */
	void setScopedObject(EObject value);

} // PerJoinPointScope
