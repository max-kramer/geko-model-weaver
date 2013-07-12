/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avPackage
 * @generated
 */
public interface Resourceenvironment_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Resourceenvironment_pc_avFactory eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Resource Environment</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Environment</em>'.
    * @generated
    */
   ResourceEnvironment createResourceEnvironment();

   /**
    * Returns a new object of class '<em>Linking Resource</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Linking Resource</em>'.
    * @generated
    */
   LinkingResource createLinkingResource();

   /**
    * Returns a new object of class '<em>Resource Container</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Container</em>'.
    * @generated
    */
   ResourceContainer createResourceContainer();

   /**
    * Returns a new object of class '<em>Processing Resource Specification</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Processing Resource Specification</em>'.
    * @generated
    */
   ProcessingResourceSpecification createProcessingResourceSpecification();

   /**
    * Returns a new object of class '<em>Communication Link Resource Specification</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Communication Link Resource Specification</em>'.
    * @generated
    */
   CommunicationLinkResourceSpecification createCommunicationLinkResourceSpecification();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Resourceenvironment_pc_avPackage getResourceenvironment_pc_avPackage();

} //Resourceenvironment_pc_avFactory
