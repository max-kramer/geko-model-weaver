/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.*;

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
public class Resourceenvironment_av_pcFactoryImpl extends EFactoryImpl implements Resourceenvironment_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Resourceenvironment_av_pcFactory init() {
      try {
         Resourceenvironment_av_pcFactory theResourceenvironment_av_pcFactory = (Resourceenvironment_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Resourceenvironment_av_pcPackage.eNS_URI);
         if (theResourceenvironment_av_pcFactory != null) {
            return theResourceenvironment_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Resourceenvironment_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourceenvironment_av_pcFactoryImpl() {
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
         case Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT: return createResourceEnvironment();
         case Resourceenvironment_av_pcPackage.LINKING_RESOURCE: return createLinkingResource();
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER: return createResourceContainer();
         case Resourceenvironment_av_pcPackage.PROCESSING_RESOURCE_SPECIFICATION: return createProcessingResourceSpecification();
         case Resourceenvironment_av_pcPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION: return createCommunicationLinkResourceSpecification();
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
   public Resourceenvironment_av_pcPackage getResourceenvironment_av_pcPackage() {
      return (Resourceenvironment_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Resourceenvironment_av_pcPackage getPackage() {
      return Resourceenvironment_av_pcPackage.eINSTANCE;
   }

} //Resourceenvironment_av_pcFactoryImpl
