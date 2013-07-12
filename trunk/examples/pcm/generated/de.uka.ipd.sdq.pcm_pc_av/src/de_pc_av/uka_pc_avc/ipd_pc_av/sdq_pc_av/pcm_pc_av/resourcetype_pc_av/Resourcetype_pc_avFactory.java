/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage
 * @generated
 */
public interface Resourcetype_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Resourcetype_pc_avFactory eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.impl.Resourcetype_pc_avFactoryImpl.init();

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
   Resourcetype_pc_avPackage getResourcetype_pc_avPackage();

} //Resourcetype_pc_avFactory
