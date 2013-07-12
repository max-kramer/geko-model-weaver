/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.Resourceenvironment_av_pcPackage
 * @generated
 */
public interface Resourceenvironment_av_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Resourceenvironment_av_pcFactory eINSTANCE = de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.Resourceenvironment_av_pcFactoryImpl.init();

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
   Resourceenvironment_av_pcPackage getResourceenvironment_av_pcPackage();

} //Resourceenvironment_av_pcFactory
