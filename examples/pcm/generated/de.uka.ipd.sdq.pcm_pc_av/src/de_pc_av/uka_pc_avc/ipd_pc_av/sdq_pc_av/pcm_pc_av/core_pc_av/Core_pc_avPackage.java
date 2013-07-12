/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage;

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
 * <!-- begin-model-doc -->
 * This package contains the PCM Core meta-classes used throughout the PCM: entities carrying a  globally unique ID (GUID), an abstract model for entities which provide and require interfaces, and  an abstract model to describe entities composed from other entities.
 * <!-- end-model-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.Core_pc_avFactory
 * @model kind="package"
 * @generated
 */
public interface Core_pc_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "core_pc_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/Core/5.0_pointcut_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "core_pc_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Core_pc_avPackage eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.impl.Core_pc_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.impl.PCMRandomVariableImpl <em>PCM Random Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.impl.PCMRandomVariableImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.impl.Core_pc_avPackageImpl#getPCMRandomVariable()
    * @generated
    */
   int PCM_RANDOM_VARIABLE = 0;

   /**
    * The feature id for the '<em><b>Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__SPECIFICATION = Stoex_pc_avPackage.RANDOM_VARIABLE__SPECIFICATION;

   /**
    * The feature id for the '<em><b>Expression</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__EXPRESSION = Stoex_pc_avPackage.RANDOM_VARIABLE__EXPRESSION;

   /**
    * The feature id for the '<em><b>Closed Workload PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__CLOSED_WORKLOAD_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Passive Resource capacity PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__PASSIVE_RESOURCE_CAPACITY_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Variable Characterisation Specification</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__VARIABLE_CHARACTERISATION_SPECIFICATION = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Infrastructure Call PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__INFRASTRUCTURE_CALL_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Resource Call PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__RESOURCE_CALL_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Parametric Resource Demand PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__PARAMETRIC_RESOURCE_DEMAND_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Loop Action PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__LOOP_ACTION_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 6;

   /**
    * The feature id for the '<em><b>Guarded Branch Transition PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__GUARDED_BRANCH_TRANSITION_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 7;

   /**
    * The feature id for the '<em><b>Specified Execution Time PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__SPECIFIED_EXECUTION_TIME_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 8;

   /**
    * The feature id for the '<em><b>Event Channel Sink Connector Filter Condition</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__EVENT_CHANNEL_SINK_CONNECTOR_FILTER_CONDITION = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 9;

   /**
    * The feature id for the '<em><b>Assembly Event Connector Filter Condition</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__ASSEMBLY_EVENT_CONNECTOR_FILTER_CONDITION = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 10;

   /**
    * The feature id for the '<em><b>Loop Loop Iteration</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__LOOP_LOOP_ITERATION = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 11;

   /**
    * The feature id for the '<em><b>Open Workload PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__OPEN_WORKLOAD_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 12;

   /**
    * The feature id for the '<em><b>Delay Time Specification</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__DELAY_TIME_SPECIFICATION = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 13;

   /**
    * The feature id for the '<em><b>Communication Link Resource Specifcation throughput PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFCATION_THROUGHPUT_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 14;

   /**
    * The feature id for the '<em><b>Processing Resource Specification processing Rate PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__PROCESSING_RESOURCE_SPECIFICATION_PROCESSING_RATE_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 15;

   /**
    * The feature id for the '<em><b>Communication Link Resource Specification latency PCM Random Variable</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFICATION_LATENCY_PCM_RANDOM_VARIABLE = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 16;

   /**
    * The number of structural features of the '<em>PCM Random Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PCM_RANDOM_VARIABLE_FEATURE_COUNT = Stoex_pc_avPackage.RANDOM_VARIABLE_FEATURE_COUNT + 17;


   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable <em>PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable
    * @generated
    */
   EClass getPCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getClosedWorkload_PCMRandomVariable <em>Closed Workload PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Closed Workload PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getClosedWorkload_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_ClosedWorkload_PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getPassiveResource_capacity_PCMRandomVariable <em>Passive Resource capacity PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Passive Resource capacity PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getPassiveResource_capacity_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_PassiveResource_capacity_PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getVariableCharacterisation_Specification <em>Variable Characterisation Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Variable Characterisation Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getVariableCharacterisation_Specification()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_VariableCharacterisation_Specification();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getInfrastructureCall__PCMRandomVariable <em>Infrastructure Call PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Infrastructure Call PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getInfrastructureCall__PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_InfrastructureCall__PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getResourceCall__PCMRandomVariable <em>Resource Call PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Resource Call PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getResourceCall__PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_ResourceCall__PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getParametricResourceDemand_PCMRandomVariable <em>Parametric Resource Demand PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Parametric Resource Demand PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getParametricResourceDemand_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_ParametricResourceDemand_PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getLoopAction_PCMRandomVariable <em>Loop Action PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Loop Action PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getLoopAction_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_LoopAction_PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getGuardedBranchTransition_PCMRandomVariable <em>Guarded Branch Transition PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Guarded Branch Transition PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getGuardedBranchTransition_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_GuardedBranchTransition_PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getSpecifiedExecutionTime_PCMRandomVariable <em>Specified Execution Time PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Specified Execution Time PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getSpecifiedExecutionTime_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_SpecifiedExecutionTime_PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getEventChannelSinkConnector__FilterCondition <em>Event Channel Sink Connector Filter Condition</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Event Channel Sink Connector Filter Condition</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getEventChannelSinkConnector__FilterCondition()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_EventChannelSinkConnector__FilterCondition();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getAssemblyEventConnector__FilterCondition <em>Assembly Event Connector Filter Condition</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Assembly Event Connector Filter Condition</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getAssemblyEventConnector__FilterCondition()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_AssemblyEventConnector__FilterCondition();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getLoop_LoopIteration <em>Loop Loop Iteration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Loop Loop Iteration</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getLoop_LoopIteration()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_Loop_LoopIteration();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getOpenWorkload_PCMRandomVariable <em>Open Workload PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Open Workload PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getOpenWorkload_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_OpenWorkload_PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getDelay_TimeSpecification <em>Delay Time Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Delay Time Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getDelay_TimeSpecification()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_Delay_TimeSpecification();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable <em>Communication Link Resource Specifcation throughput PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Communication Link Resource Specifcation throughput PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getProcessingResourceSpecification_processingRate_PCMRandomVariable <em>Processing Resource Specification processing Rate PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Processing Resource Specification processing Rate PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getProcessingResourceSpecification_processingRate_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getCommunicationLinkResourceSpecification_latency_PCMRandomVariable <em>Communication Link Resource Specification latency PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Communication Link Resource Specification latency PCM Random Variable</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getCommunicationLinkResourceSpecification_latency_PCMRandomVariable()
    * @see #getPCMRandomVariable()
    * @generated
    */
   EReference getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Core_pc_avFactory getCore_pc_avFactory();

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
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.impl.PCMRandomVariableImpl <em>PCM Random Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.impl.PCMRandomVariableImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.impl.Core_pc_avPackageImpl#getPCMRandomVariable()
       * @generated
       */
      EClass PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Closed Workload PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__CLOSED_WORKLOAD_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_ClosedWorkload_PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Passive Resource capacity PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__PASSIVE_RESOURCE_CAPACITY_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_PassiveResource_capacity_PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Variable Characterisation Specification</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__VARIABLE_CHARACTERISATION_SPECIFICATION = eINSTANCE.getPCMRandomVariable_VariableCharacterisation_Specification();

      /**
       * The meta object literal for the '<em><b>Infrastructure Call PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__INFRASTRUCTURE_CALL_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_InfrastructureCall__PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Resource Call PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__RESOURCE_CALL_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_ResourceCall__PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Parametric Resource Demand PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__PARAMETRIC_RESOURCE_DEMAND_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_ParametricResourceDemand_PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Loop Action PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__LOOP_ACTION_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_LoopAction_PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Guarded Branch Transition PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__GUARDED_BRANCH_TRANSITION_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_GuardedBranchTransition_PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Specified Execution Time PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__SPECIFIED_EXECUTION_TIME_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_SpecifiedExecutionTime_PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Event Channel Sink Connector Filter Condition</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__EVENT_CHANNEL_SINK_CONNECTOR_FILTER_CONDITION = eINSTANCE.getPCMRandomVariable_EventChannelSinkConnector__FilterCondition();

      /**
       * The meta object literal for the '<em><b>Assembly Event Connector Filter Condition</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__ASSEMBLY_EVENT_CONNECTOR_FILTER_CONDITION = eINSTANCE.getPCMRandomVariable_AssemblyEventConnector__FilterCondition();

      /**
       * The meta object literal for the '<em><b>Loop Loop Iteration</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__LOOP_LOOP_ITERATION = eINSTANCE.getPCMRandomVariable_Loop_LoopIteration();

      /**
       * The meta object literal for the '<em><b>Open Workload PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__OPEN_WORKLOAD_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_OpenWorkload_PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Delay Time Specification</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__DELAY_TIME_SPECIFICATION = eINSTANCE.getPCMRandomVariable_Delay_TimeSpecification();

      /**
       * The meta object literal for the '<em><b>Communication Link Resource Specifcation throughput PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFCATION_THROUGHPUT_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Processing Resource Specification processing Rate PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__PROCESSING_RESOURCE_SPECIFICATION_PROCESSING_RATE_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable();

      /**
       * The meta object literal for the '<em><b>Communication Link Resource Specification latency PCM Random Variable</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFICATION_LATENCY_PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable();

   }

} //Core_pc_avPackage
