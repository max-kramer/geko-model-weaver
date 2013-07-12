/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.*;

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
public class Resourcetype_av_pcFactoryImpl extends EFactoryImpl implements Resourcetype_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Resourcetype_av_pcFactory init() {
      try {
         Resourcetype_av_pcFactory theResourcetype_av_pcFactory = (Resourcetype_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Resourcetype_av_pcPackage.eNS_URI);
         if (theResourcetype_av_pcFactory != null) {
            return theResourcetype_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Resourcetype_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourcetype_av_pcFactoryImpl() {
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
         case Resourcetype_av_pcPackage.RESOURCE_SIGNATURE: return createResourceSignature();
         case Resourcetype_av_pcPackage.PROCESSING_RESOURCE_TYPE: return createProcessingResourceType();
         case Resourcetype_av_pcPackage.RESOURCE_TYPE: return createResourceType();
         case Resourcetype_av_pcPackage.RESOURCE_REPOSITORY: return createResourceRepository();
         case Resourcetype_av_pcPackage.SCHEDULING_POLICY: return createSchedulingPolicy();
         case Resourcetype_av_pcPackage.COMMUNICATION_LINK_RESOURCE_TYPE: return createCommunicationLinkResourceType();
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE: return createResourceInterface();
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
   public Resourcetype_av_pcPackage getResourcetype_av_pcPackage() {
      return (Resourcetype_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Resourcetype_av_pcPackage getPackage() {
      return Resourcetype_av_pcPackage.eINSTANCE;
   }

} //Resourcetype_av_pcFactoryImpl
