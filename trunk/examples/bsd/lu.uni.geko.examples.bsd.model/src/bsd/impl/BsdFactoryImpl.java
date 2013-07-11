/**
 */
package bsd.impl;

import bsd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BsdFactoryImpl extends EFactoryImpl implements BsdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BsdFactory init() {
		try {
			BsdFactory theBsdFactory = (BsdFactory)EPackage.Registry.INSTANCE.getEFactory(BsdPackage.eNS_URI);
			if (theBsdFactory != null) {
				return theBsdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BsdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BsdPackage.NAMED_ELEMENT: return createNamedElement();
			case BsdPackage.BSD: return createBSD();
			case BsdPackage.LIFELINE: return createLifeline();
			case BsdPackage.SEND_EVENT: return createSendEvent();
			case BsdPackage.RECEIVE_EVENT: return createReceiveEvent();
			case BsdPackage.PRECEDENCE_TUPLE: return createPrecedenceTuple();
			case BsdPackage.MESSAGE: return createMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSD createBSD() {
		BSDImpl bsd = new BSDImpl();
		return bsd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendEvent createSendEvent() {
		SendEventImpl sendEvent = new SendEventImpl();
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveEvent createReceiveEvent() {
		ReceiveEventImpl receiveEvent = new ReceiveEventImpl();
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceTuple createPrecedenceTuple() {
		PrecedenceTupleImpl precedenceTuple = new PrecedenceTupleImpl();
		return precedenceTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsdPackage getBsdPackage() {
		return (BsdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BsdPackage getPackage() {
		return BsdPackage.eINSTANCE;
	}

} //BsdFactoryImpl
