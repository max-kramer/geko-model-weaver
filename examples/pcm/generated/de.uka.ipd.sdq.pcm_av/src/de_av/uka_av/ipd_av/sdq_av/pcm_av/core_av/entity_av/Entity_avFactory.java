/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity_avPackage
 * @generated
 */
public interface Entity_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Entity_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.Entity_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Resource Provided Role</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Provided Role</em>'.
    * @generated
    */
   ResourceProvidedRole createResourceProvidedRole();

   /**
    * Returns a new object of class '<em>Interface Providing Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Interface Providing Requiring Entity</em>'.
    * @generated
    */
   InterfaceProvidingRequiringEntity createInterfaceProvidingRequiringEntity();

   /**
    * Returns a new object of class '<em>Interface Providing Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Interface Providing Entity</em>'.
    * @generated
    */
   InterfaceProvidingEntity createInterfaceProvidingEntity();

   /**
    * Returns a new object of class '<em>Interface Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Interface Requiring Entity</em>'.
    * @generated
    */
   InterfaceRequiringEntity createInterfaceRequiringEntity();

   /**
    * Returns a new object of class '<em>Resource Interface Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Interface Requiring Entity</em>'.
    * @generated
    */
   ResourceInterfaceRequiringEntity createResourceInterfaceRequiringEntity();

   /**
    * Returns a new object of class '<em>Resource Required Role</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Required Role</em>'.
    * @generated
    */
   ResourceRequiredRole createResourceRequiredRole();

   /**
    * Returns a new object of class '<em>Resource Interface Providing Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Interface Providing Entity</em>'.
    * @generated
    */
   ResourceInterfaceProvidingEntity createResourceInterfaceProvidingEntity();

   /**
    * Returns a new object of class '<em>Composed Providing Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Composed Providing Requiring Entity</em>'.
    * @generated
    */
   ComposedProvidingRequiringEntity createComposedProvidingRequiringEntity();

   /**
    * Returns a new object of class '<em>Named Element</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Named Element</em>'.
    * @generated
    */
   NamedElement createNamedElement();

   /**
    * Returns a new object of class '<em>Resource Interface Providing Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Interface Providing Requiring Entity</em>'.
    * @generated
    */
   ResourceInterfaceProvidingRequiringEntity createResourceInterfaceProvidingRequiringEntity();

   /**
    * Returns a new object of class '<em>Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Entity</em>'.
    * @generated
    */
   Entity createEntity();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Entity_avPackage getEntity_avPackage();

} //Entity_avFactory
