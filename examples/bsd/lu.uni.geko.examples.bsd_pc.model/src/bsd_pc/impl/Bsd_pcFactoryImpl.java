/**
 */
package bsd_pc.impl;

import bsd_pc.*;

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
public class Bsd_pcFactoryImpl extends EFactoryImpl implements Bsd_pcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bsd_pcFactory init() {
		try {
			Bsd_pcFactory theBsd_pcFactory = (Bsd_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Bsd_pcPackage.eNS_URI);
			if (theBsd_pcFactory != null) {
				return theBsd_pcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bsd_pcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bsd_pcFactoryImpl() {
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
			case Bsd_pcPackage.NAMED_ELEMENT: return createNamedElement();
			case Bsd_pcPackage.BSD: return createBSD();
			case Bsd_pcPackage.LIFELINE: return createLifeline();
			case Bsd_pcPackage.EVENT: return createEvent();
			case Bsd_pcPackage.SEND_EVENT: return createSendEvent();
			case Bsd_pcPackage.RECEIVE_EVENT: return createReceiveEvent();
			case Bsd_pcPackage.PRECEDENCE_TUPLE: return createPrecedenceTuple();
			case Bsd_pcPackage.MESSAGE: return createMessage();
			case Bsd_pcPackage.POINTCUT: return createPointcut();
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
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
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
	public Pointcut createPointcut() {
		PointcutImpl pointcut = new PointcutImpl();
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bsd_pcPackage getBsd_pcPackage() {
		return (Bsd_pcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bsd_pcPackage getPackage() {
		return Bsd_pcPackage.eINSTANCE;
	}

} //Bsd_pcFactoryImpl
