/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.util;

import de_av.uka_av.ipd_av.sdq_av.identifier_av.util.Identifier_avValidator;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.Usagemodel_avPackage
 * @generated
 */
public class Usagemodel_avValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final Usagemodel_avValidator INSTANCE = new Usagemodel_avValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entry Level System Call Must Reference Provided Role Of ASystem' of 'Entry Level System Call'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int ENTRY_LEVEL_SYSTEM_CALL__ENTRY_LEVEL_SYSTEM_CALL_MUST_REFERENCE_PROVIDED_ROLE_OF_ASYSTEM = 1;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entry Level System Call Signature Must Match Its Provided Role' of 'Entry Level System Call'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int ENTRY_LEVEL_SYSTEM_CALL__ENTRY_LEVEL_SYSTEM_CALL_SIGNATURE_MUST_MATCH_ITS_PROVIDED_ROLE = 2;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exactlyonestart' of 'Scenario Behaviour'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int SCENARIO_BEHAVIOUR__EXACTLYONESTART = 3;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exactlyonestop' of 'Scenario Behaviour'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int SCENARIO_BEHAVIOUR__EXACTLYONESTOP = 4;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Eachuseractionexcept Startand Stopmusthaveapredecessorandsuccessor' of 'Scenario Behaviour'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int SCENARIO_BEHAVIOUR__EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR = 5;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Branch Probabilities Must Sum Up To1' of 'Branch'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int BRANCH__ALL_BRANCH_PROBABILITIES_MUST_SUM_UP_TO1 = 6;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Stop Has No Successor' of 'Stop'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int STOP__STOP_HAS_NO_SUCCESSOR = 7;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Start Has No Predecessor' of 'Start'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int START__START_HAS_NO_PREDECESSOR = 8;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inter Arrival Time In Open Workload Needs To Be Specified' of 'Open Workload'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int OPEN_WORKLOAD__INTER_ARRIVAL_TIME_IN_OPEN_WORKLOAD_NEEDS_TO_BE_SPECIFIED = 9;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Population In Closed Workload Needs To Be Specified' of 'Closed Workload'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int CLOSED_WORKLOAD__POPULATION_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_SPECIFIED = 10;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Think Time In Closed Workload Needs To Be Specified' of 'Closed Workload'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int CLOSED_WORKLOAD__THINK_TIME_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_SPECIFIED = 11;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 11;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

   /**
    * The cached base package validator.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Identifier_avValidator identifier_avValidator;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Usagemodel_avValidator() {
      super();
      identifier_avValidator = Identifier_avValidator.INSTANCE;
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage() {
     return Usagemodel_avPackage.eINSTANCE;
   }

   /**
    * Calls <code>validateXXX</code> for the corresponding classifier of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
      switch (classifierID) {
         case Usagemodel_avPackage.WORKLOAD:
            return validateWorkload((Workload)value, diagnostics, context);
         case Usagemodel_avPackage.USAGE_SCENARIO:
            return validateUsageScenario((UsageScenario)value, diagnostics, context);
         case Usagemodel_avPackage.USER_DATA:
            return validateUserData((UserData)value, diagnostics, context);
         case Usagemodel_avPackage.USAGE_MODEL:
            return validateUsageModel((UsageModel)value, diagnostics, context);
         case Usagemodel_avPackage.ENTRY_LEVEL_SYSTEM_CALL:
            return validateEntryLevelSystemCall((EntryLevelSystemCall)value, diagnostics, context);
         case Usagemodel_avPackage.ABSTRACT_USER_ACTION:
            return validateAbstractUserAction((AbstractUserAction)value, diagnostics, context);
         case Usagemodel_avPackage.SCENARIO_BEHAVIOUR:
            return validateScenarioBehaviour((ScenarioBehaviour)value, diagnostics, context);
         case Usagemodel_avPackage.BRANCH_TRANSITION:
            return validateBranchTransition((BranchTransition)value, diagnostics, context);
         case Usagemodel_avPackage.BRANCH:
            return validateBranch((Branch)value, diagnostics, context);
         case Usagemodel_avPackage.LOOP:
            return validateLoop((Loop)value, diagnostics, context);
         case Usagemodel_avPackage.STOP:
            return validateStop((Stop)value, diagnostics, context);
         case Usagemodel_avPackage.START:
            return validateStart((Start)value, diagnostics, context);
         case Usagemodel_avPackage.OPEN_WORKLOAD:
            return validateOpenWorkload((OpenWorkload)value, diagnostics, context);
         case Usagemodel_avPackage.DELAY:
            return validateDelay((Delay)value, diagnostics, context);
         case Usagemodel_avPackage.CLOSED_WORKLOAD:
            return validateClosedWorkload((ClosedWorkload)value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateWorkload(Workload workload, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return validate_EveryDefaultConstraint(workload, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateUsageScenario(UsageScenario usageScenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(usageScenario, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(usageScenario, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usageScenario, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usageScenario, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(usageScenario, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(usageScenario, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(usageScenario, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(usageScenario, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(usageScenario, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(usageScenario, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateUserData(UserData userData, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return validate_EveryDefaultConstraint(userData, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateUsageModel(UsageModel usageModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return validate_EveryDefaultConstraint(usageModel, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateEntryLevelSystemCall(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(entryLevelSystemCall, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= validateEntryLevelSystemCall_EntryLevelSystemCallMustReferenceProvidedRoleOfASystem(entryLevelSystemCall, diagnostics, context);
      if (result || diagnostics != null) result &= validateEntryLevelSystemCall_EntryLevelSystemCallSignatureMustMatchItsProvidedRole(entryLevelSystemCall, diagnostics, context);
      return result;
   }

   /**
    * Validates the EntryLevelSystemCallMustReferenceProvidedRoleOfASystem constraint of '<em>Entry Level System Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateEntryLevelSystemCall_EntryLevelSystemCallMustReferenceProvidedRoleOfASystem(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return entryLevelSystemCall.EntryLevelSystemCallMustReferenceProvidedRoleOfASystem(diagnostics, context);
   }

   /**
    * Validates the EntryLevelSystemCallSignatureMustMatchItsProvidedRole constraint of '<em>Entry Level System Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateEntryLevelSystemCall_EntryLevelSystemCallSignatureMustMatchItsProvidedRole(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return entryLevelSystemCall.EntryLevelSystemCallSignatureMustMatchItsProvidedRole(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateAbstractUserAction(AbstractUserAction abstractUserAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(abstractUserAction, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(abstractUserAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractUserAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractUserAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractUserAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractUserAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(abstractUserAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractUserAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractUserAction, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(abstractUserAction, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateScenarioBehaviour(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(scenarioBehaviour, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validateScenarioBehaviour_Exactlyonestart(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validateScenarioBehaviour_Exactlyonestop(scenarioBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validateScenarioBehaviour_EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(scenarioBehaviour, diagnostics, context);
      return result;
   }

   /**
    * Validates the Exactlyonestart constraint of '<em>Scenario Behaviour</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateScenarioBehaviour_Exactlyonestart(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return scenarioBehaviour.Exactlyonestart(diagnostics, context);
   }

   /**
    * Validates the Exactlyonestop constraint of '<em>Scenario Behaviour</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateScenarioBehaviour_Exactlyonestop(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return scenarioBehaviour.Exactlyonestop(diagnostics, context);
   }

   /**
    * Validates the EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor constraint of '<em>Scenario Behaviour</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateScenarioBehaviour_EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return scenarioBehaviour.EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateBranchTransition(BranchTransition branchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return validate_EveryDefaultConstraint(branchTransition, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(branch, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(branch, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(branch, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(branch, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(branch, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(branch, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(branch, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(branch, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(branch, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(branch, diagnostics, context);
      if (result || diagnostics != null) result &= validateBranch_AllBranchProbabilitiesMustSumUpTo1(branch, diagnostics, context);
      return result;
   }

   /**
    * Validates the AllBranchProbabilitiesMustSumUpTo1 constraint of '<em>Branch</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateBranch_AllBranchProbabilitiesMustSumUpTo1(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return branch.AllBranchProbabilitiesMustSumUpTo1(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(loop, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(loop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(loop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(loop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(loop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loop, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(loop, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStop(Stop stop, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(stop, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(stop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(stop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(stop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(stop, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stop, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(stop, diagnostics, context);
      if (result || diagnostics != null) result &= validateStop_StopHasNoSuccessor(stop, diagnostics, context);
      return result;
   }

   /**
    * Validates the StopHasNoSuccessor constraint of '<em>Stop</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStop_StopHasNoSuccessor(Stop stop, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return stop.StopHasNoSuccessor(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(start, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(start, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(start, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(start, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(start, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(start, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(start, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(start, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(start, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(start, diagnostics, context);
      if (result || diagnostics != null) result &= validateStart_StartHasNoPredecessor(start, diagnostics, context);
      return result;
   }

   /**
    * Validates the StartHasNoPredecessor constraint of '<em>Start</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateStart_StartHasNoPredecessor(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return start.StartHasNoPredecessor(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateOpenWorkload(OpenWorkload openWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(openWorkload, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(openWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(openWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(openWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(openWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(openWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(openWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(openWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(openWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validateOpenWorkload_InterArrivalTimeInOpenWorkloadNeedsToBeSpecified(openWorkload, diagnostics, context);
      return result;
   }

   /**
    * Validates the InterArrivalTimeInOpenWorkloadNeedsToBeSpecified constraint of '<em>Open Workload</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateOpenWorkload_InterArrivalTimeInOpenWorkloadNeedsToBeSpecified(OpenWorkload openWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return openWorkload.InterArrivalTimeInOpenWorkloadNeedsToBeSpecified(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateDelay(Delay delay, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(delay, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(delay, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delay, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delay, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delay, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(delay, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(delay, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(delay, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delay, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(delay, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateClosedWorkload(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(closedWorkload, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(closedWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(closedWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(closedWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(closedWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(closedWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(closedWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(closedWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(closedWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validateClosedWorkload_PopulationInClosedWorkloadNeedsToBeSpecified(closedWorkload, diagnostics, context);
      if (result || diagnostics != null) result &= validateClosedWorkload_ThinkTimeInClosedWorkloadNeedsToBeSpecified(closedWorkload, diagnostics, context);
      return result;
   }

   /**
    * Validates the PopulationInClosedWorkloadNeedsToBeSpecified constraint of '<em>Closed Workload</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateClosedWorkload_PopulationInClosedWorkloadNeedsToBeSpecified(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return closedWorkload.PopulationInClosedWorkloadNeedsToBeSpecified(diagnostics, context);
   }

   /**
    * Validates the ThinkTimeInClosedWorkloadNeedsToBeSpecified constraint of '<em>Closed Workload</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateClosedWorkload_ThinkTimeInClosedWorkloadNeedsToBeSpecified(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return closedWorkload.ThinkTimeInClosedWorkloadNeedsToBeSpecified(diagnostics, context);
   }

   /**
    * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public ResourceLocator getResourceLocator() {
      // TODO
      // Specialize this to return a resource locator for messages specific to this validator.
      // Ensure that you remove @generated or mark it @generated NOT
      return super.getResourceLocator();
   }

} //Usagemodel_avValidator
