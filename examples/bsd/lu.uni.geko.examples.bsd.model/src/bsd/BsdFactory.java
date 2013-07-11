/**
 */
package bsd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bsd.BsdPackage
 * @generated
 */
public interface BsdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BsdFactory eINSTANCE = bsd.impl.BsdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>BSD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BSD</em>'.
	 * @generated
	 */
	BSD createBSD();

	/**
	 * Returns a new object of class '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lifeline</em>'.
	 * @generated
	 */
	Lifeline createLifeline();

	/**
	 * Returns a new object of class '<em>Send Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Event</em>'.
	 * @generated
	 */
	SendEvent createSendEvent();

	/**
	 * Returns a new object of class '<em>Receive Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Event</em>'.
	 * @generated
	 */
	ReceiveEvent createReceiveEvent();

	/**
	 * Returns a new object of class '<em>Precedence Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence Tuple</em>'.
	 * @generated
	 */
	PrecedenceTuple createPrecedenceTuple();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BsdPackage getBsdPackage();

} //BsdFactory
