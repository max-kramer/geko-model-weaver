/**
 */
package bsd_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bsd_av.PrecedenceTuple#getPrecedingEvent <em>Preceding Event</em>}</li>
 *   <li>{@link bsd_av.PrecedenceTuple#getSubsequentEvent <em>Subsequent Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see bsd_av.Bsd_avPackage#getPrecedenceTuple()
 * @model
 * @generated
 */
public interface PrecedenceTuple extends EObject {
	/**
	 * Returns the value of the '<em><b>Preceding Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preceding Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preceding Event</em>' reference.
	 * @see #setPrecedingEvent(Event)
	 * @see bsd_av.Bsd_avPackage#getPrecedenceTuple_PrecedingEvent()
	 * @model
	 * @generated
	 */
	Event getPrecedingEvent();

	/**
	 * Sets the value of the '{@link bsd_av.PrecedenceTuple#getPrecedingEvent <em>Preceding Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding Event</em>' reference.
	 * @see #getPrecedingEvent()
	 * @generated
	 */
	void setPrecedingEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Subsequent Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsequent Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsequent Event</em>' reference.
	 * @see #setSubsequentEvent(Event)
	 * @see bsd_av.Bsd_avPackage#getPrecedenceTuple_SubsequentEvent()
	 * @model
	 * @generated
	 */
	Event getSubsequentEvent();

	/**
	 * Sets the value of the '{@link bsd_av.PrecedenceTuple#getSubsequentEvent <em>Subsequent Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsequent Event</em>' reference.
	 * @see #getSubsequentEvent()
	 * @generated
	 */
	void setSubsequentEvent(Event value);

} // PrecedenceTuple
