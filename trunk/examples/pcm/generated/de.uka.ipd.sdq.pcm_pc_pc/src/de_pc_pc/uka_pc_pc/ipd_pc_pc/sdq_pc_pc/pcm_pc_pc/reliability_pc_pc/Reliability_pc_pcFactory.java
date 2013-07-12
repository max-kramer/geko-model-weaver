/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.Reliability_pc_pcPackage
 * @generated
 */
public interface Reliability_pc_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Reliability_pc_pcFactory eINSTANCE = de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.impl.Reliability_pc_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Failure Occurrence Description</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Failure Occurrence Description</em>'.
    * @generated
    */
   FailureOccurrenceDescription createFailureOccurrenceDescription();

   /**
    * Returns a new object of class '<em>Hardware Induced Failure Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Hardware Induced Failure Type</em>'.
    * @generated
    */
   HardwareInducedFailureType createHardwareInducedFailureType();

   /**
    * Returns a new object of class '<em>Software Induced Failure Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Software Induced Failure Type</em>'.
    * @generated
    */
   SoftwareInducedFailureType createSoftwareInducedFailureType();

   /**
    * Returns a new object of class '<em>Internal Failure Occurrence Description</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Internal Failure Occurrence Description</em>'.
    * @generated
    */
   InternalFailureOccurrenceDescription createInternalFailureOccurrenceDescription();

   /**
    * Returns a new object of class '<em>Network Induced Failure Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Network Induced Failure Type</em>'.
    * @generated
    */
   NetworkInducedFailureType createNetworkInducedFailureType();

   /**
    * Returns a new object of class '<em>External Failure Occurrence Description</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>External Failure Occurrence Description</em>'.
    * @generated
    */
   ExternalFailureOccurrenceDescription createExternalFailureOccurrenceDescription();

   /**
    * Returns a new object of class '<em>Resource Timeout Failure Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Timeout Failure Type</em>'.
    * @generated
    */
   ResourceTimeoutFailureType createResourceTimeoutFailureType();

   /**
    * Returns a new object of class '<em>Failure Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Failure Type</em>'.
    * @generated
    */
   FailureType createFailureType();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Reliability_pc_pcPackage getReliability_pc_pcPackage();

} //Reliability_pc_pcFactory
