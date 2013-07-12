/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage
 * @generated
 */
public interface Composition_av_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Composition_av_pcFactory eINSTANCE = de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.Composition_av_pcFactoryImpl.init();

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
   Composition_av_pcPackage getComposition_av_pcPackage();

} //Composition_av_pcFactory
