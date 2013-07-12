/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.NamedElement;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceInterfaceProvidingEntity;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.*;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.UnitCarryingElement;

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
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.Resourcetype_av_avPackage
 * @generated
 */
public class Resourcetype_av_avSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Resourcetype_av_avPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourcetype_av_avSwitch() {
      if (modelPackage == null) {
         modelPackage = Resourcetype_av_avPackage.eINSTANCE;
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
         case Resourcetype_av_avPackage.RESOURCE_SIGNATURE: {
            ResourceSignature resourceSignature = (ResourceSignature)theEObject;
            T result = caseResourceSignature(resourceSignature);
            if (result == null) result = caseEntity(resourceSignature);
            if (result == null) result = caseIdentifier(resourceSignature);
            if (result == null) result = caseNamedElement(resourceSignature);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourcetype_av_avPackage.PROCESSING_RESOURCE_TYPE: {
            ProcessingResourceType processingResourceType = (ProcessingResourceType)theEObject;
            T result = caseProcessingResourceType(processingResourceType);
            if (result == null) result = caseResourceType(processingResourceType);
            if (result == null) result = caseUnitCarryingElement(processingResourceType);
            if (result == null) result = caseResourceInterfaceProvidingEntity(processingResourceType);
            if (result == null) result = caseEntity(processingResourceType);
            if (result == null) result = caseIdentifier(processingResourceType);
            if (result == null) result = caseNamedElement(processingResourceType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourcetype_av_avPackage.RESOURCE_TYPE: {
            ResourceType resourceType = (ResourceType)theEObject;
            T result = caseResourceType(resourceType);
            if (result == null) result = caseUnitCarryingElement(resourceType);
            if (result == null) result = caseResourceInterfaceProvidingEntity(resourceType);
            if (result == null) result = caseEntity(resourceType);
            if (result == null) result = caseIdentifier(resourceType);
            if (result == null) result = caseNamedElement(resourceType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourcetype_av_avPackage.RESOURCE_REPOSITORY: {
            ResourceRepository resourceRepository = (ResourceRepository)theEObject;
            T result = caseResourceRepository(resourceRepository);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourcetype_av_avPackage.SCHEDULING_POLICY: {
            SchedulingPolicy schedulingPolicy = (SchedulingPolicy)theEObject;
            T result = caseSchedulingPolicy(schedulingPolicy);
            if (result == null) result = caseEntity(schedulingPolicy);
            if (result == null) result = caseIdentifier(schedulingPolicy);
            if (result == null) result = caseNamedElement(schedulingPolicy);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourcetype_av_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE: {
            CommunicationLinkResourceType communicationLinkResourceType = (CommunicationLinkResourceType)theEObject;
            T result = caseCommunicationLinkResourceType(communicationLinkResourceType);
            if (result == null) result = caseResourceType(communicationLinkResourceType);
            if (result == null) result = caseUnitCarryingElement(communicationLinkResourceType);
            if (result == null) result = caseResourceInterfaceProvidingEntity(communicationLinkResourceType);
            if (result == null) result = caseEntity(communicationLinkResourceType);
            if (result == null) result = caseIdentifier(communicationLinkResourceType);
            if (result == null) result = caseNamedElement(communicationLinkResourceType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourcetype_av_avPackage.RESOURCE_INTERFACE: {
            ResourceInterface resourceInterface = (ResourceInterface)theEObject;
            T result = caseResourceInterface(resourceInterface);
            if (result == null) result = caseEntity(resourceInterface);
            if (result == null) result = caseIdentifier(resourceInterface);
            if (result == null) result = caseNamedElement(resourceInterface);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Signature</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Signature</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceSignature(ResourceSignature object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Processing Resource Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Processing Resource Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseProcessingResourceType(ProcessingResourceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceType(ResourceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Repository</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Repository</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceRepository(ResourceRepository object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Scheduling Policy</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Scheduling Policy</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSchedulingPolicy(SchedulingPolicy object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Communication Link Resource Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Communication Link Resource Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCommunicationLinkResourceType(CommunicationLinkResourceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Interface</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Interface</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceInterface(ResourceInterface object) {
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
    * Returns the result of interpreting the object as an instance of '<em>Unit Carrying Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Unit Carrying Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUnitCarryingElement(UnitCarryingElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Interface Providing Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Interface Providing Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceInterfaceProvidingEntity(ResourceInterfaceProvidingEntity object) {
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

} //Resourcetype_av_avSwitch
