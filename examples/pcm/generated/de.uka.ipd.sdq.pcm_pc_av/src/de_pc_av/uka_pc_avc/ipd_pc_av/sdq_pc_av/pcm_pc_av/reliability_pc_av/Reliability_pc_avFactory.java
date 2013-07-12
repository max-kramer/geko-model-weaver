/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.Reliability_pc_avPackage
 * @generated
 */
public interface Reliability_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Reliability_pc_avFactory eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.impl.Reliability_pc_avFactoryImpl.init();

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
   Reliability_pc_avPackage getReliability_pc_avPackage();

} //Reliability_pc_avFactory
