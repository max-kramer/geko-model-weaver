/**
 */
package lts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lts.State#getOwningLTS <em>Owning LTS</em>}</li>
 *   <li>{@link lts.State#getName <em>Name</em>}</li>
 *   <li>{@link lts.State#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link lts.State#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see lts.LtsPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning LTS</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link lts.LTS#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning LTS</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning LTS</em>' container reference.
	 * @see #setOwningLTS(LTS)
	 * @see lts.LtsPackage#getState_OwningLTS()
	 * @see lts.LTS#getOwnedState
	 * @model opposite="ownedState" required="true" transient="false"
	 * @generated
	 */
	LTS getOwningLTS();

	/**
	 * Sets the value of the '{@link lts.State#getOwningLTS <em>Owning LTS</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning LTS</em>' container reference.
	 * @see #getOwningLTS()
	 * @generated
	 */
	void setOwningLTS(LTS value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lts.LtsPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lts.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * The list contents are of type {@link lts.Transition}.
	 * It is bidirectional and its opposite is '{@link lts.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' containment reference list.
	 * @see lts.LtsPackage#getState_OutgoingTransition()
	 * @see lts.Transition#getSource
	 * @model opposite="source" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link lts.Transition}.
	 * It is bidirectional and its opposite is '{@link lts.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see lts.LtsPackage#getState_IncomingTransition()
	 * @see lts.Transition#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncomingTransition();

} // State
