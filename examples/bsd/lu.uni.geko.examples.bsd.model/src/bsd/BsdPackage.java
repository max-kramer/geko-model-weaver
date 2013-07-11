/**
 */
package bsd;

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
 * @see bsd.BsdFactory
 * @model kind="package"
 * @generated
 */
public interface BsdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bsd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lu.uni.geko.examples.bsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bsd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BsdPackage eINSTANCE = bsd.impl.BsdPackageImpl.init();

	/**
	 * The meta object id for the '{@link bsd.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bsd.impl.NamedElementImpl
	 * @see bsd.impl.BsdPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bsd.impl.BSDImpl <em>BSD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bsd.impl.BSDImpl
	 * @see bsd.impl.BsdPackageImpl#getBSD()
	 * @generated
	 */
	int BSD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Precendence Tuples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSD__PRECENDENCE_TUPLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lifelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSD__LIFELINES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSD__MESSAGES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BSD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link bsd.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bsd.impl.LifelineImpl
	 * @see bsd.impl.BsdPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bsd.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bsd.impl.EventImpl
	 * @see bsd.impl.BsdPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNING_LIFELINE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bsd.impl.SendEventImpl <em>Send Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bsd.impl.SendEventImpl
	 * @see bsd.impl.BsdPackageImpl#getSendEvent()
	 * @generated
	 */
	int SEND_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT__OWNING_LIFELINE = EVENT__OWNING_LIFELINE;

	/**
	 * The number of structural features of the '<em>Send Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bsd.impl.ReceiveEventImpl <em>Receive Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bsd.impl.ReceiveEventImpl
	 * @see bsd.impl.BsdPackageImpl#getReceiveEvent()
	 * @generated
	 */
	int RECEIVE_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__OWNING_LIFELINE = EVENT__OWNING_LIFELINE;

	/**
	 * The number of structural features of the '<em>Receive Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bsd.impl.PrecedenceTupleImpl <em>Precedence Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bsd.impl.PrecedenceTupleImpl
	 * @see bsd.impl.BsdPackageImpl#getPrecedenceTuple()
	 * @generated
	 */
	int PRECEDENCE_TUPLE = 6;

	/**
	 * The feature id for the '<em><b>Preceding Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TUPLE__PRECEDING_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Subsequent Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TUPLE__SUBSEQUENT_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Precedence Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TUPLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bsd.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bsd.impl.MessageImpl
	 * @see bsd.impl.BsdPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Send Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SEND_EVENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVE_EVENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link bsd.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see bsd.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link bsd.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bsd.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link bsd.BSD <em>BSD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSD</em>'.
	 * @see bsd.BSD
	 * @generated
	 */
	EClass getBSD();

	/**
	 * Returns the meta object for the containment reference list '{@link bsd.BSD#getPrecendenceTuples <em>Precendence Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precendence Tuples</em>'.
	 * @see bsd.BSD#getPrecendenceTuples()
	 * @see #getBSD()
	 * @generated
	 */
	EReference getBSD_PrecendenceTuples();

	/**
	 * Returns the meta object for the containment reference list '{@link bsd.BSD#getLifelines <em>Lifelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifelines</em>'.
	 * @see bsd.BSD#getLifelines()
	 * @see #getBSD()
	 * @generated
	 */
	EReference getBSD_Lifelines();

	/**
	 * Returns the meta object for the containment reference list '{@link bsd.BSD#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see bsd.BSD#getMessages()
	 * @see #getBSD()
	 * @generated
	 */
	EReference getBSD_Messages();

	/**
	 * Returns the meta object for class '{@link bsd.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see bsd.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for class '{@link bsd.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see bsd.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link bsd.Event#getOwningLifeline <em>Owning Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Lifeline</em>'.
	 * @see bsd.Event#getOwningLifeline()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_OwningLifeline();

	/**
	 * Returns the meta object for class '{@link bsd.SendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Event</em>'.
	 * @see bsd.SendEvent
	 * @generated
	 */
	EClass getSendEvent();

	/**
	 * Returns the meta object for class '{@link bsd.ReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Event</em>'.
	 * @see bsd.ReceiveEvent
	 * @generated
	 */
	EClass getReceiveEvent();

	/**
	 * Returns the meta object for class '{@link bsd.PrecedenceTuple <em>Precedence Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Tuple</em>'.
	 * @see bsd.PrecedenceTuple
	 * @generated
	 */
	EClass getPrecedenceTuple();

	/**
	 * Returns the meta object for the reference '{@link bsd.PrecedenceTuple#getPrecedingEvent <em>Preceding Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preceding Event</em>'.
	 * @see bsd.PrecedenceTuple#getPrecedingEvent()
	 * @see #getPrecedenceTuple()
	 * @generated
	 */
	EReference getPrecedenceTuple_PrecedingEvent();

	/**
	 * Returns the meta object for the reference '{@link bsd.PrecedenceTuple#getSubsequentEvent <em>Subsequent Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subsequent Event</em>'.
	 * @see bsd.PrecedenceTuple#getSubsequentEvent()
	 * @see #getPrecedenceTuple()
	 * @generated
	 */
	EReference getPrecedenceTuple_SubsequentEvent();

	/**
	 * Returns the meta object for class '{@link bsd.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see bsd.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the containment reference '{@link bsd.Message#getSendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Event</em>'.
	 * @see bsd.Message#getSendEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_SendEvent();

	/**
	 * Returns the meta object for the containment reference '{@link bsd.Message#getReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive Event</em>'.
	 * @see bsd.Message#getReceiveEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ReceiveEvent();

	/**
	 * Returns the meta object for the attribute list '{@link bsd.Message#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see bsd.Message#getParameters()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Parameters();

	/**
	 * Returns the meta object for the attribute list '{@link bsd.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see bsd.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BsdFactory getBsdFactory();

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
		 * The meta object literal for the '{@link bsd.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bsd.impl.NamedElementImpl
		 * @see bsd.impl.BsdPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link bsd.impl.BSDImpl <em>BSD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bsd.impl.BSDImpl
		 * @see bsd.impl.BsdPackageImpl#getBSD()
		 * @generated
		 */
		EClass BSD = eINSTANCE.getBSD();

		/**
		 * The meta object literal for the '<em><b>Precendence Tuples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSD__PRECENDENCE_TUPLES = eINSTANCE.getBSD_PrecendenceTuples();

		/**
		 * The meta object literal for the '<em><b>Lifelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSD__LIFELINES = eINSTANCE.getBSD_Lifelines();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSD__MESSAGES = eINSTANCE.getBSD_Messages();

		/**
		 * The meta object literal for the '{@link bsd.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bsd.impl.LifelineImpl
		 * @see bsd.impl.BsdPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '{@link bsd.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bsd.impl.EventImpl
		 * @see bsd.impl.BsdPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Owning Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__OWNING_LIFELINE = eINSTANCE.getEvent_OwningLifeline();

		/**
		 * The meta object literal for the '{@link bsd.impl.SendEventImpl <em>Send Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bsd.impl.SendEventImpl
		 * @see bsd.impl.BsdPackageImpl#getSendEvent()
		 * @generated
		 */
		EClass SEND_EVENT = eINSTANCE.getSendEvent();

		/**
		 * The meta object literal for the '{@link bsd.impl.ReceiveEventImpl <em>Receive Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bsd.impl.ReceiveEventImpl
		 * @see bsd.impl.BsdPackageImpl#getReceiveEvent()
		 * @generated
		 */
		EClass RECEIVE_EVENT = eINSTANCE.getReceiveEvent();

		/**
		 * The meta object literal for the '{@link bsd.impl.PrecedenceTupleImpl <em>Precedence Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bsd.impl.PrecedenceTupleImpl
		 * @see bsd.impl.BsdPackageImpl#getPrecedenceTuple()
		 * @generated
		 */
		EClass PRECEDENCE_TUPLE = eINSTANCE.getPrecedenceTuple();

		/**
		 * The meta object literal for the '<em><b>Preceding Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TUPLE__PRECEDING_EVENT = eINSTANCE.getPrecedenceTuple_PrecedingEvent();

		/**
		 * The meta object literal for the '<em><b>Subsequent Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TUPLE__SUBSEQUENT_EVENT = eINSTANCE.getPrecedenceTuple_SubsequentEvent();

		/**
		 * The meta object literal for the '{@link bsd.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bsd.impl.MessageImpl
		 * @see bsd.impl.BsdPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Send Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SEND_EVENT = eINSTANCE.getMessage_SendEvent();

		/**
		 * The meta object literal for the '<em><b>Receive Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECEIVE_EVENT = eINSTANCE.getMessage_ReceiveEvent();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__PARAMETERS = eINSTANCE.getMessage_Parameters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TYPE = eINSTANCE.getMessage_Type();

	}

} //BsdPackage
