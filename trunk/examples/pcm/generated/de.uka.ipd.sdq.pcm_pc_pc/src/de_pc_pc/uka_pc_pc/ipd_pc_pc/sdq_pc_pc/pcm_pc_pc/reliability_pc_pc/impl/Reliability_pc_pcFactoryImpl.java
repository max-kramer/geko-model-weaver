/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.*;

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
public class Reliability_pc_pcFactoryImpl extends EFactoryImpl implements Reliability_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Reliability_pc_pcFactory init() {
      try {
         Reliability_pc_pcFactory theReliability_pc_pcFactory = (Reliability_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Reliability_pc_pcPackage.eNS_URI);
         if (theReliability_pc_pcFactory != null) {
            return theReliability_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Reliability_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Reliability_pc_pcFactoryImpl() {
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
         case Reliability_pc_pcPackage.FAILURE_OCCURRENCE_DESCRIPTION: return createFailureOccurrenceDescription();
         case Reliability_pc_pcPackage.HARDWARE_INDUCED_FAILURE_TYPE: return createHardwareInducedFailureType();
         case Reliability_pc_pcPackage.SOFTWARE_INDUCED_FAILURE_TYPE: return createSoftwareInducedFailureType();
         case Reliability_pc_pcPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: return createInternalFailureOccurrenceDescription();
         case Reliability_pc_pcPackage.NETWORK_INDUCED_FAILURE_TYPE: return createNetworkInducedFailureType();
         case Reliability_pc_pcPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: return createExternalFailureOccurrenceDescription();
         case Reliability_pc_pcPackage.RESOURCE_TIMEOUT_FAILURE_TYPE: return createResourceTimeoutFailureType();
         case Reliability_pc_pcPackage.FAILURE_TYPE: return createFailureType();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public FailureOccurrenceDescription createFailureOccurrenceDescription() {
      FailureOccurrenceDescriptionImpl failureOccurrenceDescription = new FailureOccurrenceDescriptionImpl();
      return failureOccurrenceDescription;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public HardwareInducedFailureType createHardwareInducedFailureType() {
      HardwareInducedFailureTypeImpl hardwareInducedFailureType = new HardwareInducedFailureTypeImpl();
      return hardwareInducedFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SoftwareInducedFailureType createSoftwareInducedFailureType() {
      SoftwareInducedFailureTypeImpl softwareInducedFailureType = new SoftwareInducedFailureTypeImpl();
      return softwareInducedFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InternalFailureOccurrenceDescription createInternalFailureOccurrenceDescription() {
      InternalFailureOccurrenceDescriptionImpl internalFailureOccurrenceDescription = new InternalFailureOccurrenceDescriptionImpl();
      return internalFailureOccurrenceDescription;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NetworkInducedFailureType createNetworkInducedFailureType() {
      NetworkInducedFailureTypeImpl networkInducedFailureType = new NetworkInducedFailureTypeImpl();
      return networkInducedFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExternalFailureOccurrenceDescription createExternalFailureOccurrenceDescription() {
      ExternalFailureOccurrenceDescriptionImpl externalFailureOccurrenceDescription = new ExternalFailureOccurrenceDescriptionImpl();
      return externalFailureOccurrenceDescription;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceTimeoutFailureType createResourceTimeoutFailureType() {
      ResourceTimeoutFailureTypeImpl resourceTimeoutFailureType = new ResourceTimeoutFailureTypeImpl();
      return resourceTimeoutFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public FailureType createFailureType() {
      FailureTypeImpl failureType = new FailureTypeImpl();
      return failureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Reliability_pc_pcPackage getReliability_pc_pcPackage() {
      return (Reliability_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Reliability_pc_pcPackage getPackage() {
      return Reliability_pc_pcPackage.eINSTANCE;
   }

} //Reliability_pc_pcFactoryImpl
