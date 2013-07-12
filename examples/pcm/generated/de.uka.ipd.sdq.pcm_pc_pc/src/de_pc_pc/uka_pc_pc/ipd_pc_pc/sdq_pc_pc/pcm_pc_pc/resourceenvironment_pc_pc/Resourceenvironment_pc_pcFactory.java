/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage
 * @generated
 */
public interface Resourceenvironment_pc_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Resourceenvironment_pc_pcFactory eINSTANCE = de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.impl.Resourceenvironment_pc_pcFactoryImpl.init();

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
   Resourceenvironment_pc_pcPackage getResourceenvironment_pc_pcPackage();

} //Resourceenvironment_pc_pcFactory
