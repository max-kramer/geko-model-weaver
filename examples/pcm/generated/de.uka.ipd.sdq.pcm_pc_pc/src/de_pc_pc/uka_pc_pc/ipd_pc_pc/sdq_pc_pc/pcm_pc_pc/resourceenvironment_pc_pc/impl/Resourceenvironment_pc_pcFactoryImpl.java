/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.*;

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
public class Resourceenvironment_pc_pcFactoryImpl extends EFactoryImpl implements Resourceenvironment_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Resourceenvironment_pc_pcFactory init() {
      try {
         Resourceenvironment_pc_pcFactory theResourceenvironment_pc_pcFactory = (Resourceenvironment_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Resourceenvironment_pc_pcPackage.eNS_URI);
         if (theResourceenvironment_pc_pcFactory != null) {
            return theResourceenvironment_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Resourceenvironment_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourceenvironment_pc_pcFactoryImpl() {
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
         case Resourceenvironment_pc_pcPackage.RESOURCE_ENVIRONMENT: return createResourceEnvironment();
         case Resourceenvironment_pc_pcPackage.LINKING_RESOURCE: return createLinkingResource();
         case Resourceenvironment_pc_pcPackage.RESOURCE_CONTAINER: return createResourceContainer();
         case Resourceenvironment_pc_pcPackage.PROCESSING_RESOURCE_SPECIFICATION: return createProcessingResourceSpecification();
         case Resourceenvironment_pc_pcPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION: return createCommunicationLinkResourceSpecification();
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
   public Resourceenvironment_pc_pcPackage getResourceenvironment_pc_pcPackage() {
      return (Resourceenvironment_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Resourceenvironment_pc_pcPackage getPackage() {
      return Resourceenvironment_pc_pcPackage.eINSTANCE;
   }

} //Resourceenvironment_pc_pcFactoryImpl
