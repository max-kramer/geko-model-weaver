/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.*;

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
public class Resourceenvironment_av_avFactoryImpl extends EFactoryImpl implements Resourceenvironment_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Resourceenvironment_av_avFactory init() {
      try {
         Resourceenvironment_av_avFactory theResourceenvironment_av_avFactory = (Resourceenvironment_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Resourceenvironment_av_avPackage.eNS_URI);
         if (theResourceenvironment_av_avFactory != null) {
            return theResourceenvironment_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Resourceenvironment_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourceenvironment_av_avFactoryImpl() {
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
         case Resourceenvironment_av_avPackage.RESOURCE_ENVIRONMENT: return createResourceEnvironment();
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE: return createLinkingResource();
         case Resourceenvironment_av_avPackage.RESOURCE_CONTAINER: return createResourceContainer();
         case Resourceenvironment_av_avPackage.PROCESSING_RESOURCE_SPECIFICATION: return createProcessingResourceSpecification();
         case Resourceenvironment_av_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION: return createCommunicationLinkResourceSpecification();
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
   public Resourceenvironment_av_avPackage getResourceenvironment_av_avPackage() {
      return (Resourceenvironment_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Resourceenvironment_av_avPackage getPackage() {
      return Resourceenvironment_av_avPackage.eINSTANCE;
   }

} //Resourceenvironment_av_avFactoryImpl
