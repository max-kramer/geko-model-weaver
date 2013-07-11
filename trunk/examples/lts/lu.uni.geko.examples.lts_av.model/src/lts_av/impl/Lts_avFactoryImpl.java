/**
 */
package lts_av.impl;

import lts_av.*;

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
public class Lts_avFactoryImpl extends EFactoryImpl implements Lts_avFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lts_avFactory init() {
		try {
			Lts_avFactory theLts_avFactory = (Lts_avFactory)EPackage.Registry.INSTANCE.getEFactory(Lts_avPackage.eNS_URI);
			if (theLts_avFactory != null) {
				return theLts_avFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lts_avFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lts_avFactoryImpl() {
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
			case Lts_avPackage.LTS: return createLTS();
			case Lts_avPackage.STATE: return createState();
			case Lts_avPackage.TRANSITION: return createTransition();
			case Lts_avPackage.ADVICE: return createAdvice();
			case Lts_avPackage.GLOBAL_SCOPE: return createGlobalScope();
			case Lts_avPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTS createLTS() {
		LTSImpl lts = new LTSImpl();
		return lts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
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
	public Lts_avPackage getLts_avPackage() {
		return (Lts_avPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lts_avPackage getPackage() {
		return Lts_avPackage.eINSTANCE;
	}

} //Lts_avFactoryImpl
