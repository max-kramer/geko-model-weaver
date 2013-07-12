/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.*;

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
public class Resourcetype_av_avFactoryImpl extends EFactoryImpl implements Resourcetype_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Resourcetype_av_avFactory init() {
      try {
         Resourcetype_av_avFactory theResourcetype_av_avFactory = (Resourcetype_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Resourcetype_av_avPackage.eNS_URI);
         if (theResourcetype_av_avFactory != null) {
            return theResourcetype_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Resourcetype_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourcetype_av_avFactoryImpl() {
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
         case Resourcetype_av_avPackage.RESOURCE_SIGNATURE: return createResourceSignature();
         case Resourcetype_av_avPackage.PROCESSING_RESOURCE_TYPE: return createProcessingResourceType();
         case Resourcetype_av_avPackage.RESOURCE_TYPE: return createResourceType();
         case Resourcetype_av_avPackage.RESOURCE_REPOSITORY: return createResourceRepository();
         case Resourcetype_av_avPackage.SCHEDULING_POLICY: return createSchedulingPolicy();
         case Resourcetype_av_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE: return createCommunicationLinkResourceType();
         case Resourcetype_av_avPackage.RESOURCE_INTERFACE: return createResourceInterface();
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
   public Resourcetype_av_avPackage getResourcetype_av_avPackage() {
      return (Resourcetype_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Resourcetype_av_avPackage getPackage() {
      return Resourcetype_av_avPackage.eINSTANCE;
   }

} //Resourcetype_av_avFactoryImpl
