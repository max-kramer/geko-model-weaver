/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Entity_pc_pcFactoryImpl extends EFactoryImpl implements Entity_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Entity_pc_pcFactory init() {
      try {
         Entity_pc_pcFactory theEntity_pc_pcFactory = (Entity_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Entity_pc_pcPackage.eNS_URI);
         if (theEntity_pc_pcFactory != null) {
            return theEntity_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Entity_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entity_pc_pcFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case Entity_pc_pcPackage.RESOURCE_PROVIDED_ROLE: return createResourceProvidedRole();
         case Entity_pc_pcPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY: return createInterfaceProvidingRequiringEntity();
         case Entity_pc_pcPackage.INTERFACE_PROVIDING_ENTITY: return createInterfaceProvidingEntity();
         case Entity_pc_pcPackage.INTERFACE_REQUIRING_ENTITY: return createInterfaceRequiringEntity();
         case Entity_pc_pcPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY: return createResourceInterfaceRequiringEntity();
         case Entity_pc_pcPackage.RESOURCE_REQUIRED_ROLE: return createResourceRequiredRole();
         case Entity_pc_pcPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY: return createResourceInterfaceProvidingEntity();
         case Entity_pc_pcPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY: return createComposedProvidingRequiringEntity();
         case Entity_pc_pcPackage.NAMED_ELEMENT: return createNamedElement();
         case Entity_pc_pcPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY: return createResourceInterfaceProvidingRequiringEntity();
         case Entity_pc_pcPackage.ENTITY: return createEntity();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceProvidedRole createResourceProvidedRole() {
      ResourceProvidedRoleImpl resourceProvidedRole = new ResourceProvidedRoleImpl();
      return resourceProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InterfaceProvidingRequiringEntity createInterfaceProvidingRequiringEntity() {
      InterfaceProvidingRequiringEntityImpl interfaceProvidingRequiringEntity = new InterfaceProvidingRequiringEntityImpl();
      return interfaceProvidingRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InterfaceProvidingEntity createInterfaceProvidingEntity() {
      InterfaceProvidingEntityImpl interfaceProvidingEntity = new InterfaceProvidingEntityImpl();
      return interfaceProvidingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InterfaceRequiringEntity createInterfaceRequiringEntity() {
      InterfaceRequiringEntityImpl interfaceRequiringEntity = new InterfaceRequiringEntityImpl();
      return interfaceRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterfaceRequiringEntity createResourceInterfaceRequiringEntity() {
      ResourceInterfaceRequiringEntityImpl resourceInterfaceRequiringEntity = new ResourceInterfaceRequiringEntityImpl();
      return resourceInterfaceRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole createResourceRequiredRole() {
      ResourceRequiredRoleImpl resourceRequiredRole = new ResourceRequiredRoleImpl();
      return resourceRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterfaceProvidingEntity createResourceInterfaceProvidingEntity() {
      ResourceInterfaceProvidingEntityImpl resourceInterfaceProvidingEntity = new ResourceInterfaceProvidingEntityImpl();
      return resourceInterfaceProvidingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComposedProvidingRequiringEntity createComposedProvidingRequiringEntity() {
      ComposedProvidingRequiringEntityImpl composedProvidingRequiringEntity = new ComposedProvidingRequiringEntityImpl();
      return composedProvidingRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NamedElement createNamedElement() {
      NamedElementImpl namedElement = new NamedElementImpl();
      return namedElement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterfaceProvidingRequiringEntity createResourceInterfaceProvidingRequiringEntity() {
      ResourceInterfaceProvidingRequiringEntityImpl resourceInterfaceProvidingRequiringEntity = new ResourceInterfaceProvidingRequiringEntityImpl();
      return resourceInterfaceProvidingRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entity createEntity() {
      EntityImpl entity = new EntityImpl();
      return entity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entity_pc_pcPackage getEntity_pc_pcPackage() {
      return (Entity_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Entity_pc_pcPackage getPackage() {
      return Entity_pc_pcPackage.eINSTANCE;
   }

} //Entity_pc_pcFactoryImpl
