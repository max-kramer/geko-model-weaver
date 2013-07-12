/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.*;

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
public class Resourcetype_pc_pcFactoryImpl extends EFactoryImpl implements Resourcetype_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Resourcetype_pc_pcFactory init() {
      try {
         Resourcetype_pc_pcFactory theResourcetype_pc_pcFactory = (Resourcetype_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Resourcetype_pc_pcPackage.eNS_URI);
         if (theResourcetype_pc_pcFactory != null) {
            return theResourcetype_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Resourcetype_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourcetype_pc_pcFactoryImpl() {
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
         case Resourcetype_pc_pcPackage.RESOURCE_SIGNATURE: return createResourceSignature();
         case Resourcetype_pc_pcPackage.PROCESSING_RESOURCE_TYPE: return createProcessingResourceType();
         case Resourcetype_pc_pcPackage.RESOURCE_TYPE: return createResourceType();
         case Resourcetype_pc_pcPackage.RESOURCE_REPOSITORY: return createResourceRepository();
         case Resourcetype_pc_pcPackage.SCHEDULING_POLICY: return createSchedulingPolicy();
         case Resourcetype_pc_pcPackage.COMMUNICATION_LINK_RESOURCE_TYPE: return createCommunicationLinkResourceType();
         case Resourcetype_pc_pcPackage.RESOURCE_INTERFACE: return createResourceInterface();
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
   public Resourcetype_pc_pcPackage getResourcetype_pc_pcPackage() {
      return (Resourcetype_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Resourcetype_pc_pcPackage getPackage() {
      return Resourcetype_pc_pcPackage.eINSTANCE;
   }

} //Resourcetype_pc_pcFactoryImpl
