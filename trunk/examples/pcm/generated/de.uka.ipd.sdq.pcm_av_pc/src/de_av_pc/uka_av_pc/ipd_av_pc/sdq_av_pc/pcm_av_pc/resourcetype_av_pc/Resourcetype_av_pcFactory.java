/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.Resourcetype_av_pcPackage
 * @generated
 */
public interface Resourcetype_av_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Resourcetype_av_pcFactory eINSTANCE = de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl.Resourcetype_av_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Resource Signature</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Signature</em>'.
    * @generated
    */
   ResourceSignature createResourceSignature();

   /**
    * Returns a new object of class '<em>Processing Resource Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Processing Resource Type</em>'.
    * @generated
    */
   ProcessingResourceType createProcessingResourceType();

   /**
    * Returns a new object of class '<em>Resource Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Type</em>'.
    * @generated
    */
   ResourceType createResourceType();

   /**
    * Returns a new object of class '<em>Resource Repository</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Repository</em>'.
    * @generated
    */
   ResourceRepository createResourceRepository();

   /**
    * Returns a new object of class '<em>Scheduling Policy</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Scheduling Policy</em>'.
    * @generated
    */
   SchedulingPolicy createSchedulingPolicy();

   /**
    * Returns a new object of class '<em>Communication Link Resource Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Communication Link Resource Type</em>'.
    * @generated
    */
   CommunicationLinkResourceType createCommunicationLinkResourceType();

   /**
    * Returns a new object of class '<em>Resource Interface</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Interface</em>'.
    * @generated
    */
   ResourceInterface createResourceInterface();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Resourcetype_av_pcPackage getResourcetype_av_pcPackage();

} //Resourcetype_av_pcFactory
