/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.util;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.Identifier;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.NamedElement;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.*;

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
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Usagemodel_pc_avPackage
 * @generated
 */
public class Usagemodel_pc_avSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Usagemodel_pc_avPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Usagemodel_pc_avSwitch() {
      if (modelPackage == null) {
         modelPackage = Usagemodel_pc_avPackage.eINSTANCE;
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
         case Usagemodel_pc_avPackage.WORKLOAD: {
            Workload workload = (Workload)theEObject;
            T result = caseWorkload(workload);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.USAGE_SCENARIO: {
            UsageScenario usageScenario = (UsageScenario)theEObject;
            T result = caseUsageScenario(usageScenario);
            if (result == null) result = caseEntity(usageScenario);
            if (result == null) result = caseIdentifier(usageScenario);
            if (result == null) result = caseNamedElement(usageScenario);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.USER_DATA: {
            UserData userData = (UserData)theEObject;
            T result = caseUserData(userData);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.USAGE_MODEL: {
            UsageModel usageModel = (UsageModel)theEObject;
            T result = caseUsageModel(usageModel);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.ENTRY_LEVEL_SYSTEM_CALL: {
            EntryLevelSystemCall entryLevelSystemCall = (EntryLevelSystemCall)theEObject;
            T result = caseEntryLevelSystemCall(entryLevelSystemCall);
            if (result == null) result = caseAbstractUserAction(entryLevelSystemCall);
            if (result == null) result = caseEntity(entryLevelSystemCall);
            if (result == null) result = caseIdentifier(entryLevelSystemCall);
            if (result == null) result = caseNamedElement(entryLevelSystemCall);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.ABSTRACT_USER_ACTION: {
            AbstractUserAction abstractUserAction = (AbstractUserAction)theEObject;
            T result = caseAbstractUserAction(abstractUserAction);
            if (result == null) result = caseEntity(abstractUserAction);
            if (result == null) result = caseIdentifier(abstractUserAction);
            if (result == null) result = caseNamedElement(abstractUserAction);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.SCENARIO_BEHAVIOUR: {
            ScenarioBehaviour scenarioBehaviour = (ScenarioBehaviour)theEObject;
            T result = caseScenarioBehaviour(scenarioBehaviour);
            if (result == null) result = caseEntity(scenarioBehaviour);
            if (result == null) result = caseIdentifier(scenarioBehaviour);
            if (result == null) result = caseNamedElement(scenarioBehaviour);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.BRANCH_TRANSITION: {
            BranchTransition branchTransition = (BranchTransition)theEObject;
            T result = caseBranchTransition(branchTransition);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.BRANCH: {
            Branch branch = (Branch)theEObject;
            T result = caseBranch(branch);
            if (result == null) result = caseAbstractUserAction(branch);
            if (result == null) result = caseEntity(branch);
            if (result == null) result = caseIdentifier(branch);
            if (result == null) result = caseNamedElement(branch);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.LOOP: {
            Loop loop = (Loop)theEObject;
            T result = caseLoop(loop);
            if (result == null) result = caseAbstractUserAction(loop);
            if (result == null) result = caseEntity(loop);
            if (result == null) result = caseIdentifier(loop);
            if (result == null) result = caseNamedElement(loop);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.STOP: {
            Stop stop = (Stop)theEObject;
            T result = caseStop(stop);
            if (result == null) result = caseAbstractUserAction(stop);
            if (result == null) result = caseEntity(stop);
            if (result == null) result = caseIdentifier(stop);
            if (result == null) result = caseNamedElement(stop);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.START: {
            Start start = (Start)theEObject;
            T result = caseStart(start);
            if (result == null) result = caseAbstractUserAction(start);
            if (result == null) result = caseEntity(start);
            if (result == null) result = caseIdentifier(start);
            if (result == null) result = caseNamedElement(start);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.OPEN_WORKLOAD: {
            OpenWorkload openWorkload = (OpenWorkload)theEObject;
            T result = caseOpenWorkload(openWorkload);
            if (result == null) result = caseWorkload(openWorkload);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.DELAY: {
            Delay delay = (Delay)theEObject;
            T result = caseDelay(delay);
            if (result == null) result = caseAbstractUserAction(delay);
            if (result == null) result = caseEntity(delay);
            if (result == null) result = caseIdentifier(delay);
            if (result == null) result = caseNamedElement(delay);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD: {
            ClosedWorkload closedWorkload = (ClosedWorkload)theEObject;
            T result = caseClosedWorkload(closedWorkload);
            if (result == null) result = caseWorkload(closedWorkload);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Workload</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Workload</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseWorkload(Workload object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Usage Scenario</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Usage Scenario</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUsageScenario(UsageScenario object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>User Data</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>User Data</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUserData(UserData object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Usage Model</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Usage Model</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUsageModel(UsageModel object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Entry Level System Call</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Entry Level System Call</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEntryLevelSystemCall(EntryLevelSystemCall object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Abstract User Action</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Abstract User Action</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAbstractUserAction(AbstractUserAction object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Scenario Behaviour</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Scenario Behaviour</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseScenarioBehaviour(ScenarioBehaviour object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Branch Transition</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Branch Transition</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBranchTransition(BranchTransition object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBranch(Branch object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseLoop(Loop object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStop(Stop object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Start</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStart(Start object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Open Workload</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Open Workload</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseOpenWorkload(OpenWorkload object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDelay(Delay object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Closed Workload</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Closed Workload</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseClosedWorkload(ClosedWorkload object) {
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

} //Usagemodel_pc_avSwitch
