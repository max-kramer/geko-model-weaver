/**
 */
package bsd_av.impl;

import bsd_av.*;

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
public class Bsd_avFactoryImpl extends EFactoryImpl implements Bsd_avFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bsd_avFactory init() {
		try {
			Bsd_avFactory theBsd_avFactory = (Bsd_avFactory)EPackage.Registry.INSTANCE.getEFactory(Bsd_avPackage.eNS_URI);
			if (theBsd_avFactory != null) {
				return theBsd_avFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bsd_avFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bsd_avFactoryImpl() {
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
			case Bsd_avPackage.NAMED_ELEMENT: return createNamedElement();
			case Bsd_avPackage.BSD: return createBSD();
			case Bsd_avPackage.LIFELINE: return createLifeline();
			case Bsd_avPackage.EVENT: return createEvent();
			case Bsd_avPackage.SEND_EVENT: return createSendEvent();
			case Bsd_avPackage.RECEIVE_EVENT: return createReceiveEvent();
			case Bsd_avPackage.PRECEDENCE_TUPLE: return createPrecedenceTuple();
			case Bsd_avPackage.MESSAGE: return createMessage();
			case Bsd_avPackage.ADVICE: return createAdvice();
			case Bsd_avPackage.GLOBAL_SCOPE: return createGlobalScope();
			case Bsd_avPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
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
	public Advice createAdvice() {
		AdviceImpl advice = new AdviceImpl();
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScope createGlobalScope() {
		GlobalScopeImpl globalScope = new GlobalScopeImpl();
		return globalScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerJoinPointScope createPerJoinPointScope() {
		PerJoinPointScopeImpl perJoinPointScope = new PerJoinPointScopeImpl();
		return perJoinPointScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bsd_avPackage getBsd_avPackage() {
		return (Bsd_avPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bsd_avPackage getPackage() {
		return Bsd_avPackage.eINSTANCE;
	}

} //Bsd_avFactoryImpl
