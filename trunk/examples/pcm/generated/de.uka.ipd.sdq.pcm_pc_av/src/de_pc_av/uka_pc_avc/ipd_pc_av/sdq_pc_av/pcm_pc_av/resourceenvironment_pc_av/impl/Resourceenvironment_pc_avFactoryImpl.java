/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.*;

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
public class Resourceenvironment_pc_avFactoryImpl extends EFactoryImpl implements Resourceenvironment_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Resourceenvironment_pc_avFactory init() {
      try {
         Resourceenvironment_pc_avFactory theResourceenvironment_pc_avFactory = (Resourceenvironment_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Resourceenvironment_pc_avPackage.eNS_URI);
         if (theResourceenvironment_pc_avFactory != null) {
            return theResourceenvironment_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Resourceenvironment_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourceenvironment_pc_avFactoryImpl() {
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
         case Resourceenvironment_pc_avPackage.RESOURCE_ENVIRONMENT: return createResourceEnvironment();
         case Resourceenvironment_pc_avPackage.LINKING_RESOURCE: return createLinkingResource();
         case Resourceenvironment_pc_avPackage.RESOURCE_CONTAINER: return createResourceContainer();
         case Resourceenvironment_pc_avPackage.PROCESSING_RESOURCE_SPECIFICATION: return createProcessingResourceSpecification();
         case Resourceenvironment_pc_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION: return createCommunicationLinkResourceSpecification();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceEnvironment createResourceEnvironment() {
      ResourceEnvironmentImpl resourceEnvironment = new ResourceEnvironmentImpl();
      return resourceEnvironment;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public LinkingResource createLinkingResource() {
      LinkingResourceImpl linkingResource = new LinkingResourceImpl();
      return linkingResource;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceContainer createResourceContainer() {
      ResourceContainerImpl resourceContainer = new ResourceContainerImpl();
      return resourceContainer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessingResourceSpecification createProcessingResourceSpecification() {
      ProcessingResourceSpecificationImpl processingResourceSpecification = new ProcessingResourceSpecificationImpl();
      return processingResourceSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceSpecification createCommunicationLinkResourceSpecification() {
      CommunicationLinkResourceSpecificationImpl communicationLinkResourceSpecification = new CommunicationLinkResourceSpecificationImpl();
      return communicationLinkResourceSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourceenvironment_pc_avPackage getResourceenvironment_pc_avPackage() {
      return (Resourceenvironment_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Resourceenvironment_pc_avPackage getPackage() {
      return Resourceenvironment_pc_avPackage.eINSTANCE;
   }

} //Resourceenvironment_pc_avFactoryImpl
