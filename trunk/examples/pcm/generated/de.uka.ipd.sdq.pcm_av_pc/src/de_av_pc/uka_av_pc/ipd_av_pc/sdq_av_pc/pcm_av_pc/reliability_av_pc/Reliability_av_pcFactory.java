/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.Reliability_av_pcPackage
 * @generated
 */
public interface Reliability_av_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Reliability_av_pcFactory eINSTANCE = de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.impl.Reliability_av_pcFactoryImpl.init();

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
   Reliability_av_pcPackage getReliability_av_pcPackage();

} //Reliability_av_pcFactory
