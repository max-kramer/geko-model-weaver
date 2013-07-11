/**
 */
package lts_av;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lts_av.Lts_avFactory
 * @model kind="package"
 * @generated
 */
public interface Lts_avPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lts_av";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lts_advice";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lts_av";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lts_avPackage eINSTANCE = lts_av.impl.Lts_avPackageImpl.init();

	/**
	 * The meta object id for the '{@link lts_av.impl.LTSImpl <em>LTS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lts_av.impl.LTSImpl
	 * @see lts_av.impl.Lts_avPackageImpl#getLTS()
	 * @generated
	 */
	int LTS = 0;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTS__OWNED_STATE = 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTS__INITIAL_STATE = 1;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTS__CURRENT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTS__FINAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTS__NAME = 4;

	/**
	 * The number of structural features of the '<em>LTS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link lts_av.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lts_av.impl.StateImpl
	 * @see lts_av.impl.Lts_avPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Owning LTS</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_LTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITION = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lts_av.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lts_av.impl.TransitionImpl
	 * @see lts_av.impl.Lts_avPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lts_av.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lts_av.impl.AdviceImpl
	 * @see lts_av.impl.Lts_avPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lts_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lts_av.impl.GlobalScopeImpl
	 * @see lts_av.impl.Lts_avPackageImpl#getGlobalScope()
	 * @generated
	 */
	int GLOBAL_SCOPE = 4;

	/**
	 * The feature id for the '<em><b>Scoped Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCOPE__SCOPED_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Global Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCOPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lts_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lts_av.impl.PerJoinPointScopeImpl
	 * @see lts_av.impl.Lts_avPackageImpl#getPerJoinPointScope()
	 * @generated
	 */
	int PER_JOIN_POINT_SCOPE = 5;

	/**
	 * The feature id for the '<em><b>Scoped Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Per Join Point Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_JOIN_POINT_SCOPE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link lts_av.LTS <em>LTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTS</em>'.
	 * @see lts_av.LTS
	 * @generated
	 */
	EClass getLTS();

	/**
	 * Returns the meta object for the containment reference list '{@link lts_av.LTS#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State</em>'.
	 * @see lts_av.LTS#getOwnedState()
	 * @see #getLTS()
	 * @generated
	 */
	EReference getLTS_OwnedState();

	/**
	 * Returns the meta object for the reference '{@link lts_av.LTS#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see lts_av.LTS#getInitialState()
	 * @see #getLTS()
	 * @generated
	 */
	EReference getLTS_InitialState();

	/**
	 * Returns the meta object for the reference '{@link lts_av.LTS#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see lts_av.LTS#getCurrentState()
	 * @see #getLTS()
	 * @generated
	 */
	EReference getLTS_CurrentState();

	/**
	 * Returns the meta object for the reference list '{@link lts_av.LTS#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Final State</em>'.
	 * @see lts_av.LTS#getFinalState()
	 * @see #getLTS()
	 * @generated
	 */
	EReference getLTS_FinalState();

	/**
	 * Returns the meta object for the attribute '{@link lts_av.LTS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lts_av.LTS#getName()
	 * @see #getLTS()
	 * @generated
	 */
	EAttribute getLTS_Name();

	/**
	 * Returns the meta object for class '{@link lts_av.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see lts_av.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link lts_av.State#getOwningLTS <em>Owning LTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning LTS</em>'.
	 * @see lts_av.State#getOwningLTS()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningLTS();

	/**
	 * Returns the meta object for the attribute '{@link lts_av.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lts_av.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lts_av.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Transition</em>'.
	 * @see lts_av.State#getOutgoingTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransition();

	/**
	 * Returns the meta object for the reference list '{@link lts_av.State#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transition</em>'.
	 * @see lts_av.State#getIncomingTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransition();

	/**
	 * Returns the meta object for class '{@link lts_av.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see lts_av.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the container reference '{@link lts_av.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see lts_av.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link lts_av.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see lts_av.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link lts_av.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see lts_av.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link lts_av.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see lts_av.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Output();

	/**
	 * Returns the meta object for class '{@link lts_av.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see lts_av.Advice
	 * @generated
	 */
	EClass getAdvice();

	/**
	 * Returns the meta object for the containment reference list '{@link lts_av.Advice#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see lts_av.Advice#getChildren()
	 * @see #getAdvice()
	 * @generated
	 */
	EReference getAdvice_Children();

	/**
	 * Returns the meta object for class '{@link lts_av.GlobalScope <em>Global Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Scope</em>'.
	 * @see lts_av.GlobalScope
	 * @generated
	 */
	EClass getGlobalScope();

	/**
	 * Returns the meta object for the reference '{@link lts_av.GlobalScope#getScopedObject <em>Scoped Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scoped Object</em>'.
	 * @see lts_av.GlobalScope#getScopedObject()
	 * @see #getGlobalScope()
	 * @generated
	 */
	EReference getGlobalScope_ScopedObject();

	/**
	 * Returns the meta object for class '{@link lts_av.PerJoinPointScope <em>Per Join Point Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Join Point Scope</em>'.
	 * @see lts_av.PerJoinPointScope
	 * @generated
	 */
	EClass getPerJoinPointScope();

	/**
	 * Returns the meta object for the reference '{@link lts_av.PerJoinPointScope#getScopedObject <em>Scoped Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scoped Object</em>'.
	 * @see lts_av.PerJoinPointScope#getScopedObject()
	 * @see #getPerJoinPointScope()
	 * @generated
	 */
	EReference getPerJoinPointScope_ScopedObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lts_avFactory getLts_avFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lts_av.impl.LTSImpl <em>LTS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lts_av.impl.LTSImpl
		 * @see lts_av.impl.Lts_avPackageImpl#getLTS()
		 * @generated
		 */
		EClass LTS = eINSTANCE.getLTS();

		/**
		 * The meta object literal for the '<em><b>Owned State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTS__OWNED_STATE = eINSTANCE.getLTS_OwnedState();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTS__INITIAL_STATE = eINSTANCE.getLTS_InitialState();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTS__CURRENT_STATE = eINSTANCE.getLTS_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Final State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTS__FINAL_STATE = eINSTANCE.getLTS_FinalState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTS__NAME = eINSTANCE.getLTS_Name();

		/**
		 * The meta object literal for the '{@link lts_av.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lts_av.impl.StateImpl
		 * @see lts_av.impl.Lts_avPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Owning LTS</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_LTS = eINSTANCE.getState_OwningLTS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITION = eINSTANCE.getState_OutgoingTransition();

		/**
		 * The meta object literal for the '<em><b>Incoming Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITION = eINSTANCE.getState_IncomingTransition();

		/**
		 * The meta object literal for the '{@link lts_av.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lts_av.impl.TransitionImpl
		 * @see lts_av.impl.Lts_avPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '{@link lts_av.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lts_av.impl.AdviceImpl
		 * @see lts_av.impl.Lts_avPackageImpl#getAdvice()
		 * @generated
		 */
		EClass ADVICE = eINSTANCE.getAdvice();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE__CHILDREN = eINSTANCE.getAdvice_Children();

		/**
		 * The meta object literal for the '{@link lts_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lts_av.impl.GlobalScopeImpl
		 * @see lts_av.impl.Lts_avPackageImpl#getGlobalScope()
		 * @generated
		 */
		EClass GLOBAL_SCOPE = eINSTANCE.getGlobalScope();

		/**
		 * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_SCOPE__SCOPED_OBJECT = eINSTANCE.getGlobalScope_ScopedObject();

		/**
		 * The meta object literal for the '{@link lts_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lts_av.impl.PerJoinPointScopeImpl
		 * @see lts_av.impl.Lts_avPackageImpl#getPerJoinPointScope()
		 * @generated
		 */
		EClass PER_JOIN_POINT_SCOPE = eINSTANCE.getPerJoinPointScope();

		/**
		 * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = eINSTANCE.getPerJoinPointScope_ScopedObject();

	}

} //Lts_avPackage
