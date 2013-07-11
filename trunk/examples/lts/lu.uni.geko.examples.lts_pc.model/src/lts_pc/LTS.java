/**
 */
package lts_pc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LTS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lts_pc.LTS#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link lts_pc.LTS#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link lts_pc.LTS#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link lts_pc.LTS#getFinalState <em>Final State</em>}</li>
 *   <li>{@link lts_pc.LTS#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see lts_pc.Lts_pcPackage#getLTS()
 * @model
 * @generated
 */
public interface LTS extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link lts_pc.State}.
	 * It is bidirectional and its opposite is '{@link lts_pc.State#getOwningLTS <em>Owning LTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see lts_pc.Lts_pcPackage#getLTS_OwnedState()
	 * @see lts_pc.State#getOwningLTS
	 * @model opposite="owningLTS" containment="true" ordered="false"
	 * @generated
	 */
	EList<State> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see lts_pc.Lts_pcPackage#getLTS_InitialState()
	 * @model ordered="false"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link lts_pc.LTS#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see lts_pc.Lts_pcPackage#getLTS_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link lts_pc.LTS#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference list.
	 * The list contents are of type {@link lts_pc.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference list.
	 * @see lts_pc.Lts_pcPackage#getLTS_FinalState()
	 * @model ordered="false"
	 * @generated
	 */
	EList<State> getFinalState();

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
	 * @see lts_pc.Lts_pcPackage#getLTS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lts_pc.LTS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LTS
