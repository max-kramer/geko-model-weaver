/**
 */
package bsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bsd.Event#getOwningLifeline <em>Owning Lifeline</em>}</li>
 * </ul>
 * </p>
 *
 * @see bsd.BsdPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Lifeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Lifeline</em>' reference.
	 * @see #setOwningLifeline(Lifeline)
	 * @see bsd.BsdPackage#getEvent_OwningLifeline()
	 * @model required="true"
	 * @generated
	 */
	Lifeline getOwningLifeline();

	/**
	 * Sets the value of the '{@link bsd.Event#getOwningLifeline <em>Owning Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Lifeline</em>' reference.
	 * @see #getOwningLifeline()
	 * @generated
	 */
	void setOwningLifeline(Lifeline value);

} // Event
