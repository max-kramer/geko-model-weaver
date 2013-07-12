/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.util.Identifier_av_avValidator;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.*;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.util.Seff_av_avValidator;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.Seff_reliability_av_avPackage
 * @generated
 */
public class Seff_reliability_av_avValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final Seff_reliability_av_avValidator INSTANCE = new Seff_reliability_av_avValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Recovery Action Behaviour Has Only One Predecessor' of 'Recovery Action Behaviour'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_HAS_ONLY_ONE_PREDECESSOR = 1;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Recovery Action Behaviour Is Not Successor Of Itself' of 'Recovery Action Behaviour'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_IS_NOT_SUCCESSOR_OF_ITSELF = 2;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Successors Of Recovery Action Behaviour Handle Disjoint Failure Types' of 'Recovery Action Behaviour'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int RECOVERY_ACTION_BEHAVIOUR__SUCCESSORS_OF_RECOVERY_ACTION_BEHAVIOUR_HANDLE_DISJOINT_FAILURE_TYPES = 3;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Primary Behaviour Of Recovery Action Must Be Set' of 'Recovery Action'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int RECOVERY_ACTION__PRIMARY_BEHAVIOUR_OF_RECOVERY_ACTION_MUST_BE_SET = 4;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

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
   protected Identifier_av_avValidator identifier_av_avValidator;

   /**
    * The cached base package validator.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Seff_av_avValidator seff_av_avValidator;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_reliability_av_avValidator() {
      super();
      identifier_av_avValidator = Identifier_av_avValidator.INSTANCE;
      seff_av_avValidator = Seff_av_avValidator.INSTANCE;
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage() {
     return Seff_reliability_av_avPackage.eINSTANCE;
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
         case Seff_reliability_av_avPackage.RECOVERY_ACTION_BEHAVIOUR:
            return validateRecoveryActionBehaviour((RecoveryActionBehaviour)value, diagnostics, context);
         case Seff_reliability_av_avPackage.RECOVERY_ACTION:
            return validateRecoveryAction((RecoveryAction)value, diagnostics, context);
         case Seff_reliability_av_avPackage.FAILURE_HANDLING_ENTITY:
            return validateFailureHandlingEntity((FailureHandlingEntity)value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateRecoveryActionBehaviour(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(recoveryActionBehaviour, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_av_avValidator.validateIdentifier_idHasToBeUnique(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= seff_av_avValidator.validateResourceDemandingBehaviour_ExactlyOneStopAction(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= seff_av_avValidator.validateResourceDemandingBehaviour_ExactlyOneStartAction(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= seff_av_avValidator.validateResourceDemandingBehaviour_EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validateRecoveryActionBehaviour_RecoveryActionBehaviourHasOnlyOnePredecessor(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validateRecoveryActionBehaviour_RecoveryActionBehaviourIsNotSuccessorOfItself(recoveryActionBehaviour, diagnostics, context);
      if (result || diagnostics != null) result &= validateRecoveryActionBehaviour_SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(recoveryActionBehaviour, diagnostics, context);
      return result;
   }

   /**
    * Validates the RecoveryActionBehaviourHasOnlyOnePredecessor constraint of '<em>Recovery Action Behaviour</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateRecoveryActionBehaviour_RecoveryActionBehaviourHasOnlyOnePredecessor(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return recoveryActionBehaviour.RecoveryActionBehaviourHasOnlyOnePredecessor(diagnostics, context);
   }

   /**
    * Validates the RecoveryActionBehaviourIsNotSuccessorOfItself constraint of '<em>Recovery Action Behaviour</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateRecoveryActionBehaviour_RecoveryActionBehaviourIsNotSuccessorOfItself(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return recoveryActionBehaviour.RecoveryActionBehaviourIsNotSuccessorOfItself(diagnostics, context);
   }

   /**
    * Validates the SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes constraint of '<em>Recovery Action Behaviour</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateRecoveryActionBehaviour_SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return recoveryActionBehaviour.SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateRecoveryAction(RecoveryAction recoveryAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(recoveryAction, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(recoveryAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recoveryAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recoveryAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recoveryAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(recoveryAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(recoveryAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(recoveryAction, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recoveryAction, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_av_avValidator.validateIdentifier_idHasToBeUnique(recoveryAction, diagnostics, context);
      if (result || diagnostics != null) result &= validateRecoveryAction_PrimaryBehaviourOfRecoveryActionMustBeSet(recoveryAction, diagnostics, context);
      return result;
   }

   /**
    * Validates the PrimaryBehaviourOfRecoveryActionMustBeSet constraint of '<em>Recovery Action</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateRecoveryAction_PrimaryBehaviourOfRecoveryActionMustBeSet(RecoveryAction recoveryAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return recoveryAction.PrimaryBehaviourOfRecoveryActionMustBeSet(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateFailureHandlingEntity(FailureHandlingEntity failureHandlingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(failureHandlingEntity, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(failureHandlingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(failureHandlingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(failureHandlingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(failureHandlingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(failureHandlingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(failureHandlingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(failureHandlingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(failureHandlingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_av_avValidator.validateIdentifier_idHasToBeUnique(failureHandlingEntity, diagnostics, context);
      return result;
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

} //Seff_reliability_av_avValidator
