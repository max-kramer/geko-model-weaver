/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.NamedElement;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.*;

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
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage
 * @generated
 */
public class Resourceenvironment_av_avSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Resourceenvironment_av_avPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourceenvironment_av_avSwitch() {
      if (modelPackage == null) {
         modelPackage = Resourceenvironment_av_avPackage.eINSTANCE;
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
         case Resourceenvironment_av_avPackage.RESOURCE_ENVIRONMENT: {
            ResourceEnvironment resourceEnvironment = (ResourceEnvironment)theEObject;
            T result = caseResourceEnvironment(resourceEnvironment);
            if (result == null) result = caseNamedElement(resourceEnvironment);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE: {
            LinkingResource linkingResource = (LinkingResource)theEObject;
            T result = caseLinkingResource(linkingResource);
            if (result == null) result = caseEntity(linkingResource);
            if (result == null) result = caseIdentifier(linkingResource);
            if (result == null) result = caseNamedElement(linkingResource);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourceenvironment_av_avPackage.RESOURCE_CONTAINER: {
            ResourceContainer resourceContainer = (ResourceContainer)theEObject;
            T result = caseResourceContainer(resourceContainer);
            if (result == null) result = caseEntity(resourceContainer);
            if (result == null) result = caseIdentifier(resourceContainer);
            if (result == null) result = caseNamedElement(resourceContainer);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourceenvironment_av_avPackage.PROCESSING_RESOURCE_SPECIFICATION: {
            ProcessingResourceSpecification processingResourceSpecification = (ProcessingResourceSpecification)theEObject;
            T result = caseProcessingResourceSpecification(processingResourceSpecification);
            if (result == null) result = caseIdentifier(processingResourceSpecification);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Resourceenvironment_av_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION: {
            CommunicationLinkResourceSpecification communicationLinkResourceSpecification = (CommunicationLinkResourceSpecification)theEObject;
            T result = caseCommunicationLinkResourceSpecification(communicationLinkResourceSpecification);
            if (result == null) result = caseIdentifier(communicationLinkResourceSpecification);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Environment</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Environment</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceEnvironment(ResourceEnvironment object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Linking Resource</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Linking Resource</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseLinkingResource(LinkingResource object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Container</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Container</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceContainer(ResourceContainer object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Processing Resource Specification</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Processing Resource Specification</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseProcessingResourceSpecification(ProcessingResourceSpecification object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Communication Link Resource Specification</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Communication Link Resource Specification</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCommunicationLinkResourceSpecification(CommunicationLinkResourceSpecification object) {
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

} //Resourceenvironment_av_avSwitch
