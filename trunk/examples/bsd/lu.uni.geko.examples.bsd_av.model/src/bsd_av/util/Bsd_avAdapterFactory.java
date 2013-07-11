/**
 */
package bsd_av.util;

import bsd_av.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bsd_av.Bsd_avPackage
 * @generated
 */
public class Bsd_avAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Bsd_avPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bsd_avAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Bsd_avPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bsd_avSwitch<Adapter> modelSwitch =
		new Bsd_avSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseBSD(BSD object) {
				return createBSDAdapter();
			}
			@Override
			public Adapter caseLifeline(Lifeline object) {
				return createLifelineAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseSendEvent(SendEvent object) {
				return createSendEventAdapter();
			}
			@Override
			public Adapter caseReceiveEvent(ReceiveEvent object) {
				return createReceiveEventAdapter();
			}
			@Override
			public Adapter casePrecedenceTuple(PrecedenceTuple object) {
				return createPrecedenceTupleAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseAdvice(Advice object) {
				return createAdviceAdapter();
			}
			@Override
			public Adapter caseGlobalScope(GlobalScope object) {
				return createGlobalScopeAdapter();
			}
			@Override
			public Adapter casePerJoinPointScope(PerJoinPointScope object) {
				return createPerJoinPointScopeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.BSD <em>BSD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.BSD
	 * @generated
	 */
	public Adapter createBSDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.Lifeline
	 * @generated
	 */
	public Adapter createLifelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.SendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.SendEvent
	 * @generated
	 */
	public Adapter createSendEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.ReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.ReceiveEvent
	 * @generated
	 */
	public Adapter createReceiveEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.PrecedenceTuple <em>Precedence Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.PrecedenceTuple
	 * @generated
	 */
	public Adapter createPrecedenceTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.Advice
	 * @generated
	 */
	public Adapter createAdviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.GlobalScope <em>Global Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.GlobalScope
	 * @generated
	 */
	public Adapter createGlobalScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bsd_av.PerJoinPointScope <em>Per Join Point Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bsd_av.PerJoinPointScope
	 * @generated
	 */
	public Adapter createPerJoinPointScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Bsd_avAdapterFactory
