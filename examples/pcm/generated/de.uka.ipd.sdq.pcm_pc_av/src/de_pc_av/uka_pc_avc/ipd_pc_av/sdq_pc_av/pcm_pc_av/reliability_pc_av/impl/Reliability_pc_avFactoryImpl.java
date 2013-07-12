/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.*;

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
public class Reliability_pc_avFactoryImpl extends EFactoryImpl implements Reliability_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Reliability_pc_avFactory init() {
      try {
         Reliability_pc_avFactory theReliability_pc_avFactory = (Reliability_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Reliability_pc_avPackage.eNS_URI);
         if (theReliability_pc_avFactory != null) {
            return theReliability_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Reliability_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Reliability_pc_avFactoryImpl() {
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
         case Reliability_pc_avPackage.FAILURE_OCCURRENCE_DESCRIPTION: return createFailureOccurrenceDescription();
         case Reliability_pc_avPackage.HARDWARE_INDUCED_FAILURE_TYPE: return createHardwareInducedFailureType();
         case Reliability_pc_avPackage.SOFTWARE_INDUCED_FAILURE_TYPE: return createSoftwareInducedFailureType();
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: return createInternalFailureOccurrenceDescription();
         case Reliability_pc_avPackage.NETWORK_INDUCED_FAILURE_TYPE: return createNetworkInducedFailureType();
         case Reliability_pc_avPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: return createExternalFailureOccurrenceDescription();
         case Reliability_pc_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE: return createResourceTimeoutFailureType();
         case Reliability_pc_avPackage.FAILURE_TYPE: return createFailureType();
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
   public Reliability_pc_avPackage getReliability_pc_avPackage() {
      return (Reliability_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Reliability_pc_avPackage getPackage() {
      return Reliability_pc_avPackage.eINSTANCE;
   }

} //Reliability_pc_avFactoryImpl
