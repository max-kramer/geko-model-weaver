/**
 */
package bsd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bsd.PrecedenceTuple#getPrecedingEvent <em>Preceding Event</em>}</li>
 *   <li>{@link bsd.PrecedenceTuple#getSubsequentEvent <em>Subsequent Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see bsd.BsdPackage#getPrecedenceTuple()
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
	 * @see bsd.BsdPackage#getPrecedenceTuple_PrecedingEvent()
	 * @model required="true"
	 * @generated
	 */
	Event getPrecedingEvent();

	/**
	 * Sets the value of the '{@link bsd.PrecedenceTuple#getPrecedingEvent <em>Preceding Event</em>}' reference.
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
	 * @see bsd.BsdPackage#getPrecedenceTuple_SubsequentEvent()
	 * @model required="true"
	 * @generated
	 */
	Event getSubsequentEvent();

	/**
	 * Sets the value of the '{@link bsd.PrecedenceTuple#getSubsequentEvent <em>Subsequent Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsequent Event</em>' reference.
	 * @see #getSubsequentEvent()
	 * @generated
	 */
	void setSubsequentEvent(Event value);

} // PrecedenceTuple
