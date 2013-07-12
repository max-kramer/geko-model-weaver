/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.Reliability_avPackage
 * @generated
 */
public interface Reliability_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Reliability_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.impl.Reliability_avFactoryImpl.init();

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
   Reliability_avPackage getReliability_avPackage();

} //Reliability_avFactory
