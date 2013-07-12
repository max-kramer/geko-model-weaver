/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.*;

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
public class Resourcetype_pc_avFactoryImpl extends EFactoryImpl implements Resourcetype_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Resourcetype_pc_avFactory init() {
      try {
         Resourcetype_pc_avFactory theResourcetype_pc_avFactory = (Resourcetype_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Resourcetype_pc_avPackage.eNS_URI);
         if (theResourcetype_pc_avFactory != null) {
            return theResourcetype_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Resourcetype_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourcetype_pc_avFactoryImpl() {
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
         case Resourcetype_pc_avPackage.RESOURCE_SIGNATURE: return createResourceSignature();
         case Resourcetype_pc_avPackage.PROCESSING_RESOURCE_TYPE: return createProcessingResourceType();
         case Resourcetype_pc_avPackage.RESOURCE_TYPE: return createResourceType();
         case Resourcetype_pc_avPackage.RESOURCE_REPOSITORY: return createResourceRepository();
         case Resourcetype_pc_avPackage.SCHEDULING_POLICY: return createSchedulingPolicy();
         case Resourcetype_pc_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE: return createCommunicationLinkResourceType();
         case Resourcetype_pc_avPackage.RESOURCE_INTERFACE: return createResourceInterface();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceSignature createResourceSignature() {
      ResourceSignatureImpl resourceSignature = new ResourceSignatureImpl();
      return resourceSignature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessingResourceType createProcessingResourceType() {
      ProcessingResourceTypeImpl processingResourceType = new ProcessingResourceTypeImpl();
      return processingResourceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceType createResourceType() {
      ResourceTypeImpl resourceType = new ResourceTypeImpl();
      return resourceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRepository createResourceRepository() {
      ResourceRepositoryImpl resourceRepository = new ResourceRepositoryImpl();
      return resourceRepository;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SchedulingPolicy createSchedulingPolicy() {
      SchedulingPolicyImpl schedulingPolicy = new SchedulingPolicyImpl();
      return schedulingPolicy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceType createCommunicationLinkResourceType() {
      CommunicationLinkResourceTypeImpl communicationLinkResourceType = new CommunicationLinkResourceTypeImpl();
      return communicationLinkResourceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterface createResourceInterface() {
      ResourceInterfaceImpl resourceInterface = new ResourceInterfaceImpl();
      return resourceInterface;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourcetype_pc_avPackage getResourcetype_pc_avPackage() {
      return (Resourcetype_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Resourcetype_pc_avPackage getPackage() {
      return Resourcetype_pc_avPackage.eINSTANCE;
   }

} //Resourcetype_pc_avFactoryImpl
