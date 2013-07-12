/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.AssemblyEventConnector;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannelSinkConnector;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableCharacterisation;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av.SpecifiedExecutionTime;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PassiveResource;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ProcessingResourceSpecification;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.GuardedBranchTransition;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.LoopAction;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.ClosedWorkload;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.Delay;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.Loop;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.OpenWorkload;

import de_av.uka_av.ipd_av.sdq_av.stoex_av.RandomVariable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Random Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Random variables are used to describe user and component behaviour. They allow not only constant values (e.g., 3 loop iterations), but also probabilistic values (e.g., 2 loop iterations with a probability of 0.4 and 3 loop iterations with a probability of 0.6). They are well-suited for capturing uncertainty when modelling systems during early development stages. Examples where developers may use random variables are:
 * - Characterisations of Input Parameters: Describes the QoS relevant characteristics of parameters of component services.
 * - Inter-Arrival Time: Describes how much time passes between the arrival of two subsequent users.
 * - Think Time: Describes how much time passes between the execution of a user scenario and the start of the next execution of this scenario.
 * - Loop Iteration Count: Describes the number of repetitions of a loop.
 * - Guarded Branch Transitions: Used to determine whether to conditionally execute a certain behaviour.
 * 
 * PCMRandomVariable extends RandomVariable in a way, that the only type of variables available in the PCMRandomVariable are references to variable characterisations like a.NUMBER_OF_ELEMENTS. The corresponding editors ensure that the user can enter only valid expressions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getClosedWorkload_PCMRandomVariable <em>Closed Workload PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getPassiveResource_capacity_PCMRandomVariable <em>Passive Resource capacity PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getVariableCharacterisation_Specification <em>Variable Characterisation Specification</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getInfrastructureCall__PCMRandomVariable <em>Infrastructure Call PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getResourceCall__PCMRandomVariable <em>Resource Call PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getParametricResourceDemand_PCMRandomVariable <em>Parametric Resource Demand PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getLoopAction_PCMRandomVariable <em>Loop Action PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getGuardedBranchTransition_PCMRandomVariable <em>Guarded Branch Transition PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getSpecifiedExecutionTime_PCMRandomVariable <em>Specified Execution Time PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getEventChannelSinkConnector__FilterCondition <em>Event Channel Sink Connector Filter Condition</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getAssemblyEventConnector__FilterCondition <em>Assembly Event Connector Filter Condition</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getLoop_LoopIteration <em>Loop Loop Iteration</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getOpenWorkload_PCMRandomVariable <em>Open Workload PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getDelay_TimeSpecification <em>Delay Time Specification</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable <em>Communication Link Resource Specifcation throughput PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getProcessingResourceSpecification_processingRate_PCMRandomVariable <em>Processing Resource Specification processing Rate PCM Random Variable</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getCommunicationLinkResourceSpecification_latency_PCMRandomVariable <em>Communication Link Resource Specification latency PCM Random Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable()
 * @model
 * @generated
 */
public interface PCMRandomVariable extends RandomVariable {
   /**
    * Returns the value of the '<em><b>Closed Workload PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.ClosedWorkload#getThinkTime_ClosedWorkload <em>Think Time Closed Workload</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Closed Workload PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Closed Workload PCM Random Variable</em>' container reference.
    * @see #setClosedWorkload_PCMRandomVariable(ClosedWorkload)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_ClosedWorkload_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.ClosedWorkload#getThinkTime_ClosedWorkload
    * @model opposite="thinkTime_ClosedWorkload" transient="false" ordered="false"
    * @generated
    */
   ClosedWorkload getClosedWorkload_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getClosedWorkload_PCMRandomVariable <em>Closed Workload PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Closed Workload PCM Random Variable</em>' container reference.
    * @see #getClosedWorkload_PCMRandomVariable()
    * @generated
    */
   void setClosedWorkload_PCMRandomVariable(ClosedWorkload value);

   /**
    * Returns the value of the '<em><b>Passive Resource capacity PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PassiveResource#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Passive Resource capacity PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Passive Resource capacity PCM Random Variable</em>' container reference.
    * @see #setPassiveResource_capacity_PCMRandomVariable(PassiveResource)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_PassiveResource_capacity_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PassiveResource#getCapacity_PassiveResource
    * @model opposite="capacity_PassiveResource" transient="false" ordered="false"
    * @generated
    */
   PassiveResource getPassiveResource_capacity_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getPassiveResource_capacity_PCMRandomVariable <em>Passive Resource capacity PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Passive Resource capacity PCM Random Variable</em>' container reference.
    * @see #getPassiveResource_capacity_PCMRandomVariable()
    * @generated
    */
   void setPassiveResource_capacity_PCMRandomVariable(PassiveResource value);

   /**
    * Returns the value of the '<em><b>Variable Characterisation Specification</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableCharacterisation#getSpecification_VariableCharacterisation <em>Specification Variable Characterisation</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Variable Characterisation Specification</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Variable Characterisation Specification</em>' container reference.
    * @see #setVariableCharacterisation_Specification(VariableCharacterisation)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_VariableCharacterisation_Specification()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableCharacterisation#getSpecification_VariableCharacterisation
    * @model opposite="specification_VariableCharacterisation" transient="false" ordered="false"
    * @generated
    */
   VariableCharacterisation getVariableCharacterisation_Specification();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getVariableCharacterisation_Specification <em>Variable Characterisation Specification</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Variable Characterisation Specification</em>' container reference.
    * @see #getVariableCharacterisation_Specification()
    * @generated
    */
   void setVariableCharacterisation_Specification(VariableCharacterisation value);

   /**
    * Returns the value of the '<em><b>Infrastructure Call PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Infrastructure Call PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Infrastructure Call PCM Random Variable</em>' container reference.
    * @see #setInfrastructureCall__PCMRandomVariable(InfrastructureCall)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_InfrastructureCall__PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getNumberOfCalls__InfrastructureCall
    * @model opposite="numberOfCalls__InfrastructureCall" transient="false" ordered="false"
    * @generated
    */
   InfrastructureCall getInfrastructureCall__PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getInfrastructureCall__PCMRandomVariable <em>Infrastructure Call PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Infrastructure Call PCM Random Variable</em>' container reference.
    * @see #getInfrastructureCall__PCMRandomVariable()
    * @generated
    */
   void setInfrastructureCall__PCMRandomVariable(InfrastructureCall value);

   /**
    * Returns the value of the '<em><b>Resource Call PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getNumberOfCalls__ResourceCall <em>Number Of Calls Resource Call</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Call PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Call PCM Random Variable</em>' container reference.
    * @see #setResourceCall__PCMRandomVariable(ResourceCall)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_ResourceCall__PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getNumberOfCalls__ResourceCall
    * @model opposite="numberOfCalls__ResourceCall" transient="false" ordered="false"
    * @generated
    */
   ResourceCall getResourceCall__PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getResourceCall__PCMRandomVariable <em>Resource Call PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Call PCM Random Variable</em>' container reference.
    * @see #getResourceCall__PCMRandomVariable()
    * @generated
    */
   void setResourceCall__PCMRandomVariable(ResourceCall value);

   /**
    * Returns the value of the '<em><b>Parametric Resource Demand PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getSpecification_ParametericResourceDemand <em>Specification Parameteric Resource Demand</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parametric Resource Demand PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parametric Resource Demand PCM Random Variable</em>' container reference.
    * @see #setParametricResourceDemand_PCMRandomVariable(ParametricResourceDemand)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_ParametricResourceDemand_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getSpecification_ParametericResourceDemand
    * @model opposite="specification_ParametericResourceDemand" transient="false" ordered="false"
    * @generated
    */
   ParametricResourceDemand getParametricResourceDemand_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getParametricResourceDemand_PCMRandomVariable <em>Parametric Resource Demand PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parametric Resource Demand PCM Random Variable</em>' container reference.
    * @see #getParametricResourceDemand_PCMRandomVariable()
    * @generated
    */
   void setParametricResourceDemand_PCMRandomVariable(ParametricResourceDemand value);

   /**
    * Returns the value of the '<em><b>Loop Action PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.LoopAction#getIterationCount_LoopAction <em>Iteration Count Loop Action</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Loop Action PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Loop Action PCM Random Variable</em>' container reference.
    * @see #setLoopAction_PCMRandomVariable(LoopAction)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_LoopAction_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.LoopAction#getIterationCount_LoopAction
    * @model opposite="iterationCount_LoopAction" transient="false" ordered="false"
    * @generated
    */
   LoopAction getLoopAction_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getLoopAction_PCMRandomVariable <em>Loop Action PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Loop Action PCM Random Variable</em>' container reference.
    * @see #getLoopAction_PCMRandomVariable()
    * @generated
    */
   void setLoopAction_PCMRandomVariable(LoopAction value);

   /**
    * Returns the value of the '<em><b>Guarded Branch Transition PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.GuardedBranchTransition#getBranchCondition_GuardedBranchTransition <em>Branch Condition Guarded Branch Transition</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Guarded Branch Transition PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Guarded Branch Transition PCM Random Variable</em>' container reference.
    * @see #setGuardedBranchTransition_PCMRandomVariable(GuardedBranchTransition)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_GuardedBranchTransition_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.GuardedBranchTransition#getBranchCondition_GuardedBranchTransition
    * @model opposite="branchCondition_GuardedBranchTransition" transient="false" ordered="false"
    * @generated
    */
   GuardedBranchTransition getGuardedBranchTransition_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getGuardedBranchTransition_PCMRandomVariable <em>Guarded Branch Transition PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Guarded Branch Transition PCM Random Variable</em>' container reference.
    * @see #getGuardedBranchTransition_PCMRandomVariable()
    * @generated
    */
   void setGuardedBranchTransition_PCMRandomVariable(GuardedBranchTransition value);

   /**
    * Returns the value of the '<em><b>Specified Execution Time PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av.SpecifiedExecutionTime#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Specified Execution Time PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Specified Execution Time PCM Random Variable</em>' container reference.
    * @see #setSpecifiedExecutionTime_PCMRandomVariable(SpecifiedExecutionTime)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_SpecifiedExecutionTime_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av.SpecifiedExecutionTime#getSpecification_SpecifiedExecutionTime
    * @model opposite="specification_SpecifiedExecutionTime" transient="false" ordered="false"
    * @generated
    */
   SpecifiedExecutionTime getSpecifiedExecutionTime_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getSpecifiedExecutionTime_PCMRandomVariable <em>Specified Execution Time PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Specified Execution Time PCM Random Variable</em>' container reference.
    * @see #getSpecifiedExecutionTime_PCMRandomVariable()
    * @generated
    */
   void setSpecifiedExecutionTime_PCMRandomVariable(SpecifiedExecutionTime value);

   /**
    * Returns the value of the '<em><b>Event Channel Sink Connector Filter Condition</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannelSinkConnector#getFilterCondition__EventChannelSinkConnector <em>Filter Condition Event Channel Sink Connector</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Channel Sink Connector Filter Condition</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Channel Sink Connector Filter Condition</em>' container reference.
    * @see #setEventChannelSinkConnector__FilterCondition(EventChannelSinkConnector)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_EventChannelSinkConnector__FilterCondition()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannelSinkConnector#getFilterCondition__EventChannelSinkConnector
    * @model opposite="filterCondition__EventChannelSinkConnector" transient="false" ordered="false"
    * @generated
    */
   EventChannelSinkConnector getEventChannelSinkConnector__FilterCondition();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getEventChannelSinkConnector__FilterCondition <em>Event Channel Sink Connector Filter Condition</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Channel Sink Connector Filter Condition</em>' container reference.
    * @see #getEventChannelSinkConnector__FilterCondition()
    * @generated
    */
   void setEventChannelSinkConnector__FilterCondition(EventChannelSinkConnector value);

   /**
    * Returns the value of the '<em><b>Assembly Event Connector Filter Condition</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.AssemblyEventConnector#getFilterCondition__AssemblyEventConnector <em>Filter Condition Assembly Event Connector</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Assembly Event Connector Filter Condition</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Assembly Event Connector Filter Condition</em>' container reference.
    * @see #setAssemblyEventConnector__FilterCondition(AssemblyEventConnector)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_AssemblyEventConnector__FilterCondition()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.AssemblyEventConnector#getFilterCondition__AssemblyEventConnector
    * @model opposite="filterCondition__AssemblyEventConnector" transient="false" ordered="false"
    * @generated
    */
   AssemblyEventConnector getAssemblyEventConnector__FilterCondition();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getAssemblyEventConnector__FilterCondition <em>Assembly Event Connector Filter Condition</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Assembly Event Connector Filter Condition</em>' container reference.
    * @see #getAssemblyEventConnector__FilterCondition()
    * @generated
    */
   void setAssemblyEventConnector__FilterCondition(AssemblyEventConnector value);

   /**
    * Returns the value of the '<em><b>Loop Loop Iteration</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.Loop#getLoopIteration_Loop <em>Loop Iteration Loop</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Loop Loop Iteration</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Loop Loop Iteration</em>' container reference.
    * @see #setLoop_LoopIteration(Loop)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_Loop_LoopIteration()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.Loop#getLoopIteration_Loop
    * @model opposite="loopIteration_Loop" transient="false" ordered="false"
    * @generated
    */
   Loop getLoop_LoopIteration();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getLoop_LoopIteration <em>Loop Loop Iteration</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Loop Loop Iteration</em>' container reference.
    * @see #getLoop_LoopIteration()
    * @generated
    */
   void setLoop_LoopIteration(Loop value);

   /**
    * Returns the value of the '<em><b>Open Workload PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.OpenWorkload#getInterArrivalTime_OpenWorkload <em>Inter Arrival Time Open Workload</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Open Workload PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Open Workload PCM Random Variable</em>' container reference.
    * @see #setOpenWorkload_PCMRandomVariable(OpenWorkload)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_OpenWorkload_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.OpenWorkload#getInterArrivalTime_OpenWorkload
    * @model opposite="interArrivalTime_OpenWorkload" transient="false" ordered="false"
    * @generated
    */
   OpenWorkload getOpenWorkload_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getOpenWorkload_PCMRandomVariable <em>Open Workload PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Open Workload PCM Random Variable</em>' container reference.
    * @see #getOpenWorkload_PCMRandomVariable()
    * @generated
    */
   void setOpenWorkload_PCMRandomVariable(OpenWorkload value);

   /**
    * Returns the value of the '<em><b>Delay Time Specification</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.Delay#getTimeSpecification_Delay <em>Time Specification Delay</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Delay Time Specification</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Delay Time Specification</em>' container reference.
    * @see #setDelay_TimeSpecification(Delay)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_Delay_TimeSpecification()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.Delay#getTimeSpecification_Delay
    * @model opposite="timeSpecification_Delay" transient="false" ordered="false"
    * @generated
    */
   Delay getDelay_TimeSpecification();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getDelay_TimeSpecification <em>Delay Time Specification</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Delay Time Specification</em>' container reference.
    * @see #getDelay_TimeSpecification()
    * @generated
    */
   void setDelay_TimeSpecification(Delay value);

   /**
    * Returns the value of the '<em><b>Communication Link Resource Specifcation throughput PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Communication Link Resource Specifcation throughput PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Communication Link Resource Specifcation throughput PCM Random Variable</em>' container reference.
    * @see #setCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable(CommunicationLinkResourceSpecification)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification
    * @model opposite="throughput_CommunicationLinkResourceSpecification" transient="false" ordered="false"
    * @generated
    */
   CommunicationLinkResourceSpecification getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable <em>Communication Link Resource Specifcation throughput PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Communication Link Resource Specifcation throughput PCM Random Variable</em>' container reference.
    * @see #getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable()
    * @generated
    */
   void setCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable(CommunicationLinkResourceSpecification value);

   /**
    * Returns the value of the '<em><b>Processing Resource Specification processing Rate PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ProcessingResourceSpecification#getProcessingRate_ProcessingResourceSpecification <em>Processing Rate Processing Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Processing Resource Specification processing Rate PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Processing Resource Specification processing Rate PCM Random Variable</em>' container reference.
    * @see #setProcessingResourceSpecification_processingRate_PCMRandomVariable(ProcessingResourceSpecification)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ProcessingResourceSpecification#getProcessingRate_ProcessingResourceSpecification
    * @model opposite="processingRate_ProcessingResourceSpecification" transient="false" ordered="false"
    * @generated
    */
   ProcessingResourceSpecification getProcessingResourceSpecification_processingRate_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getProcessingResourceSpecification_processingRate_PCMRandomVariable <em>Processing Resource Specification processing Rate PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Processing Resource Specification processing Rate PCM Random Variable</em>' container reference.
    * @see #getProcessingResourceSpecification_processingRate_PCMRandomVariable()
    * @generated
    */
   void setProcessingResourceSpecification_processingRate_PCMRandomVariable(ProcessingResourceSpecification value);

   /**
    * Returns the value of the '<em><b>Communication Link Resource Specification latency PCM Random Variable</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Communication Link Resource Specification latency PCM Random Variable</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Communication Link Resource Specification latency PCM Random Variable</em>' container reference.
    * @see #setCommunicationLinkResourceSpecification_latency_PCMRandomVariable(CommunicationLinkResourceSpecification)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage#getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification
    * @model opposite="latency_CommunicationLinkResourceSpecification" transient="false" ordered="false"
    * @generated
    */
   CommunicationLinkResourceSpecification getCommunicationLinkResourceSpecification_latency_PCMRandomVariable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getCommunicationLinkResourceSpecification_latency_PCMRandomVariable <em>Communication Link Resource Specification latency PCM Random Variable</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Communication Link Resource Specification latency PCM Random Variable</em>' container reference.
    * @see #getCommunicationLinkResourceSpecification_latency_PCMRandomVariable()
    * @generated
    */
   void setCommunicationLinkResourceSpecification_latency_PCMRandomVariable(CommunicationLinkResourceSpecification value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.specification.oclIsUndefined() and self.specification <> \'\''"
    * @generated
    */
   boolean SpecificationMustNotBeNULL(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PCMRandomVariable
