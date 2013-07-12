/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_performance_av_av.Seff_performance_av_avPackage;

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
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avFactory
 * @model kind="package"
 * @generated
 */
public interface Completions_av_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "completions_av_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/Completions/1.0_advice_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "completions_av_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Completions_av_avPackage eINSTANCE = de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.CompletionImpl <em>Completion</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.CompletionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl#getCompletion()
    * @generated
    */
   int COMPLETION = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__ID = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__ENTITY_NAME = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Assembly Contexts Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;

   /**
    * The feature id for the '<em><b>Resource Required Delegation Connectors Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;

   /**
    * The feature id for the '<em><b>Event Channel Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__EVENT_CHANNEL_COMPOSED_STRUCTURE = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__EVENT_CHANNEL_COMPOSED_STRUCTURE;

   /**
    * The feature id for the '<em><b>Connectors Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__CONNECTORS_COMPOSED_STRUCTURE = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__CONNECTORS_COMPOSED_STRUCTURE;

   /**
    * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

   /**
    * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__REPOSITORY_REPOSITORY_COMPONENT = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Parent Complete Component Types</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__PARENT_COMPLETE_COMPONENT_TYPES = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Component Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION__COMPONENT_TYPE = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Completion</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION_FEATURE_COUNT = Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.CompletionRepositoryImpl <em>Completion Repository</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.CompletionRepositoryImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl#getCompletionRepository()
    * @generated
    */
   int COMPLETION_REPOSITORY = 1;

   /**
    * The feature id for the '<em><b>Completions Completion Repository</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION_REPOSITORY__COMPLETIONS_COMPLETION_REPOSITORY = 0;

   /**
    * The number of structural features of the '<em>Completion Repository</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETION_REPOSITORY_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.DelegatingExternalCallActionImpl <em>Delegating External Call Action</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.DelegatingExternalCallActionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl#getDelegatingExternalCallAction()
    * @generated
    */
   int DELEGATING_EXTERNAL_CALL_ACTION = 2;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__ID = Seff_av_avPackage.EXTERNAL_CALL_ACTION__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__ENTITY_NAME = Seff_av_avPackage.EXTERNAL_CALL_ACTION__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION = Seff_av_avPackage.EXTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION;

   /**
    * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION = Seff_av_avPackage.EXTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION;

   /**
    * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = Seff_av_avPackage.EXTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

   /**
    * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = Seff_av_avPackage.EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;

   /**
    * The feature id for the '<em><b>Return Variable Usage Call Return Action</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION = Seff_av_avPackage.EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION;

   /**
    * The feature id for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = Seff_av_avPackage.EXTERNAL_CALL_ACTION__FAILURE_TYPES_FAILURE_HANDLING_ENTITY;

   /**
    * The feature id for the '<em><b>Called Service External Service</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE = Seff_av_avPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE;

   /**
    * The feature id for the '<em><b>Role External Service</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE = Seff_av_avPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE;

   /**
    * The feature id for the '<em><b>Retry Count</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION__RETRY_COUNT = Seff_av_avPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT;

   /**
    * The number of structural features of the '<em>Delegating External Call Action</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DELEGATING_EXTERNAL_CALL_ACTION_FEATURE_COUNT = Seff_av_avPackage.EXTERNAL_CALL_ACTION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.NetworkDemandParametricResourceDemandImpl <em>Network Demand Parametric Resource Demand</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.NetworkDemandParametricResourceDemandImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl#getNetworkDemandParametricResourceDemand()
    * @generated
    */
   int NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND = 3;

   /**
    * The feature id for the '<em><b>Specification Parameteric Resource Demand</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND = Seff_performance_av_avPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND;

   /**
    * The feature id for the '<em><b>Required Resource Parametric Resource Demand</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND = Seff_performance_av_avPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND;

   /**
    * The feature id for the '<em><b>Action Parametric Resource Demand</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND = Seff_performance_av_avPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND;

   /**
    * The feature id for the '<em><b>Required Communication Link Resource Parametric Resource Demand</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND = Seff_performance_av_avPackage.PARAMETRIC_RESOURCE_DEMAND_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Network Demand Parametric Resource Demand</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND_FEATURE_COUNT = Seff_performance_av_avPackage.PARAMETRIC_RESOURCE_DEMAND_FEATURE_COUNT + 1;


   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completion <em>Completion</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Completion</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completion
    * @generated
    */
   EClass getCompletion();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.CompletionRepository <em>Completion Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Completion Repository</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.CompletionRepository
    * @generated
    */
   EClass getCompletionRepository();

   /**
    * Returns the meta object for the containment reference list '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.CompletionRepository#getCompletions_CompletionRepository <em>Completions Completion Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Completions Completion Repository</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.CompletionRepository#getCompletions_CompletionRepository()
    * @see #getCompletionRepository()
    * @generated
    */
   EReference getCompletionRepository_Completions_CompletionRepository();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.DelegatingExternalCallAction <em>Delegating External Call Action</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Delegating External Call Action</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.DelegatingExternalCallAction
    * @generated
    */
   EClass getDelegatingExternalCallAction();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.NetworkDemandParametricResourceDemand <em>Network Demand Parametric Resource Demand</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Network Demand Parametric Resource Demand</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.NetworkDemandParametricResourceDemand
    * @generated
    */
   EClass getNetworkDemandParametricResourceDemand();

   /**
    * Returns the meta object for the reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.NetworkDemandParametricResourceDemand#getRequiredCommunicationLinkResource_ParametricResourceDemand <em>Required Communication Link Resource Parametric Resource Demand</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Required Communication Link Resource Parametric Resource Demand</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.NetworkDemandParametricResourceDemand#getRequiredCommunicationLinkResource_ParametricResourceDemand()
    * @see #getNetworkDemandParametricResourceDemand()
    * @generated
    */
   EReference getNetworkDemandParametricResourceDemand_RequiredCommunicationLinkResource_ParametricResourceDemand();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Completions_av_avFactory getCompletions_av_avFactory();

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
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.CompletionImpl <em>Completion</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.CompletionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl#getCompletion()
       * @generated
       */
      EClass COMPLETION = eINSTANCE.getCompletion();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.CompletionRepositoryImpl <em>Completion Repository</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.CompletionRepositoryImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl#getCompletionRepository()
       * @generated
       */
      EClass COMPLETION_REPOSITORY = eINSTANCE.getCompletionRepository();

      /**
       * The meta object literal for the '<em><b>Completions Completion Repository</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPLETION_REPOSITORY__COMPLETIONS_COMPLETION_REPOSITORY = eINSTANCE.getCompletionRepository_Completions_CompletionRepository();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.DelegatingExternalCallActionImpl <em>Delegating External Call Action</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.DelegatingExternalCallActionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl#getDelegatingExternalCallAction()
       * @generated
       */
      EClass DELEGATING_EXTERNAL_CALL_ACTION = eINSTANCE.getDelegatingExternalCallAction();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.NetworkDemandParametricResourceDemandImpl <em>Network Demand Parametric Resource Demand</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.NetworkDemandParametricResourceDemandImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl#getNetworkDemandParametricResourceDemand()
       * @generated
       */
      EClass NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND = eINSTANCE.getNetworkDemandParametricResourceDemand();

      /**
       * The meta object literal for the '<em><b>Required Communication Link Resource Parametric Resource Demand</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND = eINSTANCE.getNetworkDemandParametricResourceDemand_RequiredCommunicationLinkResource_ParametricResourceDemand();

   }

} //Completions_av_avPackage
