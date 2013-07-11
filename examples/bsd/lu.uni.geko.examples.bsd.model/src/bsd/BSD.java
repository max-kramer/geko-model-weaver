/**
 */
package bsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bsd.BSD#getPrecendenceTuples <em>Precendence Tuples</em>}</li>
 *   <li>{@link bsd.BSD#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link bsd.BSD#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see bsd.BsdPackage#getBSD()
 * @model
 * @generated
 */
public interface BSD extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Precendence Tuples</b></em>' containment reference list.
	 * The list contents are of type {@link bsd.PrecedenceTuple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precendence Tuples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precendence Tuples</em>' containment reference list.
	 * @see bsd.BsdPackage#getBSD_PrecendenceTuples()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<PrecedenceTuple> getPrecendenceTuples();

	/**
	 * Returns the value of the '<em><b>Lifelines</b></em>' containment reference list.
	 * The list contents are of type {@link bsd.Lifeline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifelines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifelines</em>' containment reference list.
	 * @see bsd.BsdPackage#getBSD_Lifelines()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getLifelines();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link bsd.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see bsd.BsdPackage#getBSD_Messages()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Message> getMessages();

} // BSD
