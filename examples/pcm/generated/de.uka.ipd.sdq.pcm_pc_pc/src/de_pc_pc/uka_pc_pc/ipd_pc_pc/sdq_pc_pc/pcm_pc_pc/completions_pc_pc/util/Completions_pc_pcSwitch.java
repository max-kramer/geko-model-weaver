/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.util;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.*;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ComposedStructure;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ComposedProvidingRequiringEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.InterfaceProvidingEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.InterfaceProvidingRequiringEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.InterfaceRequiringEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.NamedElement;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceInterfaceRequiringEntity;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.ImplementationComponentType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.RepositoryComponent;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.AbstractAction;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.CallAction;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.CallReturnAction;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.ExternalCallAction;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.ParametricResourceDemand;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.FailureHandlingEntity;

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
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.Completions_pc_pcPackage
 * @generated
 */
public class Completions_pc_pcSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Completions_pc_pcPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Completions_pc_pcSwitch() {
      if (modelPackage == null) {
         modelPackage = Completions_pc_pcPackage.eINSTANCE;
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
         case Completions_pc_pcPackage.COMPLETION: {
            Completion completion = (Completion)theEObject;
            T result = caseCompletion(completion);
            if (result == null) result = caseComposedProvidingRequiringEntity(completion);
            if (result == null) result = caseImplementationComponentType(completion);
            if (result == null) result = caseComposedStructure(completion);
            if (result == null) result = caseRepositoryComponent(completion);
            if (result == null) result = caseInterfaceProvidingRequiringEntity(completion);
            if (result == null) result = caseInterfaceProvidingEntity(completion);
            if (result == null) result = caseInterfaceRequiringEntity(completion);
            if (result == null) result = caseIdentifier(completion);
            if (result == null) result = caseNamedElement(completion);
            if (result == null) result = caseResourceInterfaceRequiringEntity(completion);
            if (result == null) result = caseEntity(completion);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Completions_pc_pcPackage.COMPLETION_REPOSITORY: {
            CompletionRepository completionRepository = (CompletionRepository)theEObject;
            T result = caseCompletionRepository(completionRepository);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Completions_pc_pcPackage.DELEGATING_EXTERNAL_CALL_ACTION: {
            DelegatingExternalCallAction delegatingExternalCallAction = (DelegatingExternalCallAction)theEObject;
            T result = caseDelegatingExternalCallAction(delegatingExternalCallAction);
            if (result == null) result = caseExternalCallAction(delegatingExternalCallAction);
            if (result == null) result = caseAbstractAction(delegatingExternalCallAction);
            if (result == null) result = caseCallReturnAction(delegatingExternalCallAction);
            if (result == null) result = caseFailureHandlingEntity(delegatingExternalCallAction);
            if (result == null) result = caseEntity(delegatingExternalCallAction);
            if (result == null) result = caseCallAction(delegatingExternalCallAction);
            if (result == null) result = caseIdentifier(delegatingExternalCallAction);
            if (result == null) result = caseNamedElement(delegatingExternalCallAction);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Completions_pc_pcPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND: {
            NetworkDemandParametricResourceDemand networkDemandParametricResourceDemand = (NetworkDemandParametricResourceDemand)theEObject;
            T result = caseNetworkDemandParametricResourceDemand(networkDemandParametricResourceDemand);
            if (result == null) result = caseParametricResourceDemand(networkDemandParametricResourceDemand);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Completion</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Completion</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCompletion(Completion object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Completion Repository</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Completion Repository</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCompletionRepository(CompletionRepository object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Delegating External Call Action</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Delegating External Call Action</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDelegatingExternalCallAction(DelegatingExternalCallAction object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Network Demand Parametric Resource Demand</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Network Demand Parametric Resource Demand</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNetworkDemandParametricResourceDemand(NetworkDemandParametricResourceDemand object) {
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
    * Returns the result of interpreting the object as an instance of '<em>Composed Structure</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Composed Structure</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComposedStructure(ComposedStructure object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Interface Providing Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Interface Providing Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInterfaceProvidingEntity(InterfaceProvidingEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Interface Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Interface Requiring Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceInterfaceRequiringEntity(ResourceInterfaceRequiringEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Interface Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Interface Requiring Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInterfaceRequiringEntity(InterfaceRequiringEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Interface Providing Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Interface Providing Requiring Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Composed Providing Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Composed Providing Requiring Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComposedProvidingRequiringEntity(ComposedProvidingRequiringEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Repository Component</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Repository Component</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRepositoryComponent(RepositoryComponent object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Implementation Component Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Implementation Component Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseImplementationComponentType(ImplementationComponentType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAbstractAction(AbstractAction object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Call Action</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Call Action</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCallAction(CallAction object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Call Return Action</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Call Return Action</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCallReturnAction(CallReturnAction object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Failure Handling Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Failure Handling Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseFailureHandlingEntity(FailureHandlingEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>External Call Action</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>External Call Action</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExternalCallAction(ExternalCallAction object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Parametric Resource Demand</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Parametric Resource Demand</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseParametricResourceDemand(ParametricResourceDemand object) {
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

} //Completions_pc_pcSwitch
