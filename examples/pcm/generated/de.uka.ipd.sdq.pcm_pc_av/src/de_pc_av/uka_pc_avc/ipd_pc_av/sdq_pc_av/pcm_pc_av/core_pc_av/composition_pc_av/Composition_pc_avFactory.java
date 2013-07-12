/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage
 * @generated
 */
public interface Composition_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Composition_pc_avFactory eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.impl.Composition_pc_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Delegation Connector</em>'.
    * @generated
    */
   DelegationConnector createDelegationConnector();

   /**
    * Returns a new object of class '<em>Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Connector</em>'.
    * @generated
    */
   Connector createConnector();

   /**
    * Returns a new object of class '<em>Composed Structure</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Composed Structure</em>'.
    * @generated
    */
   ComposedStructure createComposedStructure();

   /**
    * Returns a new object of class '<em>Resource Required Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Required Delegation Connector</em>'.
    * @generated
    */
   ResourceRequiredDelegationConnector createResourceRequiredDelegationConnector();

   /**
    * Returns a new object of class '<em>Event Channel</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Event Channel</em>'.
    * @generated
    */
   EventChannel createEventChannel();

   /**
    * Returns a new object of class '<em>Event Channel Source Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Event Channel Source Connector</em>'.
    * @generated
    */
   EventChannelSourceConnector createEventChannelSourceConnector();

   /**
    * Returns a new object of class '<em>Event Channel Sink Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Event Channel Sink Connector</em>'.
    * @generated
    */
   EventChannelSinkConnector createEventChannelSinkConnector();

   /**
    * Returns a new object of class '<em>Provided Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Provided Delegation Connector</em>'.
    * @generated
    */
   ProvidedDelegationConnector createProvidedDelegationConnector();

   /**
    * Returns a new object of class '<em>Required Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Required Delegation Connector</em>'.
    * @generated
    */
   RequiredDelegationConnector createRequiredDelegationConnector();

   /**
    * Returns a new object of class '<em>Assembly Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Assembly Connector</em>'.
    * @generated
    */
   AssemblyConnector createAssemblyConnector();

   /**
    * Returns a new object of class '<em>Assembly Event Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Assembly Event Connector</em>'.
    * @generated
    */
   AssemblyEventConnector createAssemblyEventConnector();

   /**
    * Returns a new object of class '<em>Source Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Source Delegation Connector</em>'.
    * @generated
    */
   SourceDelegationConnector createSourceDelegationConnector();

   /**
    * Returns a new object of class '<em>Sink Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Sink Delegation Connector</em>'.
    * @generated
    */
   SinkDelegationConnector createSinkDelegationConnector();

   /**
    * Returns a new object of class '<em>Assembly Infrastructure Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Assembly Infrastructure Connector</em>'.
    * @generated
    */
   AssemblyInfrastructureConnector createAssemblyInfrastructureConnector();

   /**
    * Returns a new object of class '<em>Provided Infrastructure Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Provided Infrastructure Delegation Connector</em>'.
    * @generated
    */
   ProvidedInfrastructureDelegationConnector createProvidedInfrastructureDelegationConnector();

   /**
    * Returns a new object of class '<em>Required Infrastructure Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Required Infrastructure Delegation Connector</em>'.
    * @generated
    */
   RequiredInfrastructureDelegationConnector createRequiredInfrastructureDelegationConnector();

   /**
    * Returns a new object of class '<em>Required Resource Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Required Resource Delegation Connector</em>'.
    * @generated
    */
   RequiredResourceDelegationConnector createRequiredResourceDelegationConnector();

   /**
    * Returns a new object of class '<em>Assembly Context</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Assembly Context</em>'.
    * @generated
    */
   AssemblyContext createAssemblyContext();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Composition_pc_avPackage getComposition_pc_avPackage();

} //Composition_pc_avFactory
