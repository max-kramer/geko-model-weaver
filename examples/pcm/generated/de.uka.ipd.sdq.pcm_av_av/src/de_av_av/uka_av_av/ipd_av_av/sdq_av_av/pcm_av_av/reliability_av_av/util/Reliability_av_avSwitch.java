/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.NamedElement;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.Reliability_av_avPackage
 * @generated
 */
public class Reliability_av_avSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Reliability_av_avPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Reliability_av_avSwitch() {
      if (modelPackage == null) {
         modelPackage = Reliability_av_avPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case Reliability_av_avPackage.FAILURE_OCCURRENCE_DESCRIPTION: {
            FailureOccurrenceDescription failureOccurrenceDescription = (FailureOccurrenceDescription)theEObject;
            T result = caseFailureOccurrenceDescription(failureOccurrenceDescription);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Reliability_av_avPackage.HARDWARE_INDUCED_FAILURE_TYPE: {
            HardwareInducedFailureType hardwareInducedFailureType = (HardwareInducedFailureType)theEObject;
            T result = caseHardwareInducedFailureType(hardwareInducedFailureType);
            if (result == null) result = caseFailureType(hardwareInducedFailureType);
            if (result == null) result = caseEntity(hardwareInducedFailureType);
            if (result == null) result = caseIdentifier(hardwareInducedFailureType);
            if (result == null) result = caseNamedElement(hardwareInducedFailureType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Reliability_av_avPackage.SOFTWARE_INDUCED_FAILURE_TYPE: {
            SoftwareInducedFailureType softwareInducedFailureType = (SoftwareInducedFailureType)theEObject;
            T result = caseSoftwareInducedFailureType(softwareInducedFailureType);
            if (result == null) result = caseFailureType(softwareInducedFailureType);
            if (result == null) result = caseEntity(softwareInducedFailureType);
            if (result == null) result = caseIdentifier(softwareInducedFailureType);
            if (result == null) result = caseNamedElement(softwareInducedFailureType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Reliability_av_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: {
            InternalFailureOccurrenceDescription internalFailureOccurrenceDescription = (InternalFailureOccurrenceDescription)theEObject;
            T result = caseInternalFailureOccurrenceDescription(internalFailureOccurrenceDescription);
            if (result == null) result = caseFailureOccurrenceDescription(internalFailureOccurrenceDescription);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Reliability_av_avPackage.NETWORK_INDUCED_FAILURE_TYPE: {
            NetworkInducedFailureType networkInducedFailureType = (NetworkInducedFailureType)theEObject;
            T result = caseNetworkInducedFailureType(networkInducedFailureType);
            if (result == null) result = caseFailureType(networkInducedFailureType);
            if (result == null) result = caseEntity(networkInducedFailureType);
            if (result == null) result = caseIdentifier(networkInducedFailureType);
            if (result == null) result = caseNamedElement(networkInducedFailureType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Reliability_av_avPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: {
            ExternalFailureOccurrenceDescription externalFailureOccurrenceDescription = (ExternalFailureOccurrenceDescription)theEObject;
            T result = caseExternalFailureOccurrenceDescription(externalFailureOccurrenceDescription);
            if (result == null) result = caseFailureOccurrenceDescription(externalFailureOccurrenceDescription);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE: {
            ResourceTimeoutFailureType resourceTimeoutFailureType = (ResourceTimeoutFailureType)theEObject;
            T result = caseResourceTimeoutFailureType(resourceTimeoutFailureType);
            if (result == null) result = caseSoftwareInducedFailureType(resourceTimeoutFailureType);
            if (result == null) result = caseFailureType(resourceTimeoutFailureType);
            if (result == null) result = caseEntity(resourceTimeoutFailureType);
            if (result == null) result = caseIdentifier(resourceTimeoutFailureType);
            if (result == null) result = caseNamedElement(resourceTimeoutFailureType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Reliability_av_avPackage.FAILURE_TYPE: {
            FailureType failureType = (FailureType)theEObject;
            T result = caseFailureType(failureType);
            if (result == null) result = caseEntity(failureType);
            if (result == null) result = caseIdentifier(failureType);
            if (result == null) result = caseNamedElement(failureType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Failure Occurrence Description</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Failure Occurrence Description</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseFailureOccurrenceDescription(FailureOccurrenceDescription object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Hardware Induced Failure Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Hardware Induced Failure Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseHardwareInducedFailureType(HardwareInducedFailureType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Software Induced Failure Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Software Induced Failure Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSoftwareInducedFailureType(SoftwareInducedFailureType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Internal Failure Occurrence Description</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Internal Failure Occurrence Description</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInternalFailureOccurrenceDescription(InternalFailureOccurrenceDescription object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Network Induced Failure Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Network Induced Failure Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNetworkInducedFailureType(NetworkInducedFailureType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>External Failure Occurrence Description</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>External Failure Occurrence Description</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExternalFailureOccurrenceDescription(ExternalFailureOccurrenceDescription object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Timeout Failure Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Timeout Failure Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceTimeoutFailureType(ResourceTimeoutFailureType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Failure Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Failure Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseFailureType(FailureType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseIdentifier(Identifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNamedElement(NamedElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEntity(Entity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} //Reliability_av_avSwitch
