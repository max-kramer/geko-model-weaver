/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.*;

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
public class Reliability_avFactoryImpl extends EFactoryImpl implements Reliability_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Reliability_avFactory init() {
      try {
         Reliability_avFactory theReliability_avFactory = (Reliability_avFactory)EPackage.Registry.INSTANCE.getEFactory(Reliability_avPackage.eNS_URI);
         if (theReliability_avFactory != null) {
            return theReliability_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Reliability_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Reliability_avFactoryImpl() {
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
         case Reliability_avPackage.FAILURE_OCCURRENCE_DESCRIPTION: return createFailureOccurrenceDescription();
         case Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE: return createHardwareInducedFailureType();
         case Reliability_avPackage.SOFTWARE_INDUCED_FAILURE_TYPE: return createSoftwareInducedFailureType();
         case Reliability_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: return createInternalFailureOccurrenceDescription();
         case Reliability_avPackage.NETWORK_INDUCED_FAILURE_TYPE: return createNetworkInducedFailureType();
         case Reliability_avPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: return createExternalFailureOccurrenceDescription();
         case Reliability_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE: return createResourceTimeoutFailureType();
         case Reliability_avPackage.FAILURE_TYPE: return createFailureType();
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
   public Reliability_avPackage getReliability_avPackage() {
      return (Reliability_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Reliability_avPackage getPackage() {
      return Reliability_avPackage.eINSTANCE;
   }

} //Reliability_avFactoryImpl
