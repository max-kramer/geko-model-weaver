/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.util;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.Seff_performance_pc_pcPackage
 * @generated
 */
public class Seff_performance_pc_pcValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final Seff_performance_pc_pcValidator INSTANCE = new Seff_performance_pc_pcValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Must Belong To Used Required Role' of 'Infrastructure Call'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int INFRASTRUCTURE_CALL__SIGNATURE_MUST_BELONG_TO_USED_REQUIRED_ROLE = 1;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Referenced Required Role Must Be Required By Component' of 'Infrastructure Call'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int INFRASTRUCTURE_CALL__REFERENCED_REQUIRED_ROLE_MUST_BE_REQUIRED_BY_COMPONENT = 2;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Role Combination Must Be Unique Within Abstract Internal Control Flow Action' of 'Infrastructure Call'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int INFRASTRUCTURE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION = 3;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Signature Belongs To Resource Required Role' of 'Resource Call'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int RESOURCE_CALL__RESOURCE_SIGNATURE_BELONGS_TO_RESOURCE_REQUIRED_ROLE = 4;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Required Role Must Be Referenced By Component' of 'Resource Call'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_MUST_BE_REFERENCED_BY_COMPONENT = 5;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Role Combination Must Be Unique Within Abstract Internal Control Flow Action' of 'Resource Call'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int RESOURCE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION = 6;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Demanded Processing Resource Must Be Unique Within Abstract Internal Control Flow Action' of 'Parametric Resource Demand'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int PARAMETRIC_RESOURCE_DEMAND__DEMANDED_PROCESSING_RESOURCE_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION = 7;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_performance_pc_pcValidator() {
      super();
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage() {
     return Seff_performance_pc_pcPackage.eINSTANCE;
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
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL:
            return validateInfrastructureCall((InfrastructureCall)value, diagnostics, context);
         case Seff_performance_pc_pcPackage.RESOURCE_CALL:
            return validateResourceCall((ResourceCall)value, diagnostics, context);
         case Seff_performance_pc_pcPackage.PARAMETRIC_RESOURCE_DEMAND:
            return validateParametricResourceDemand((ParametricResourceDemand)value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateInfrastructureCall(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(infrastructureCall, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validateInfrastructureCall_SignatureMustBelongToUsedRequiredRole(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validateInfrastructureCall_ReferencedRequiredRoleMustBeRequiredByComponent(infrastructureCall, diagnostics, context);
      if (result || diagnostics != null) result &= validateInfrastructureCall_SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(infrastructureCall, diagnostics, context);
      return result;
   }

   /**
    * Validates the SignatureMustBelongToUsedRequiredRole constraint of '<em>Infrastructure Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateInfrastructureCall_SignatureMustBelongToUsedRequiredRole(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return infrastructureCall.SignatureMustBelongToUsedRequiredRole(diagnostics, context);
   }

   /**
    * Validates the ReferencedRequiredRoleMustBeRequiredByComponent constraint of '<em>Infrastructure Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateInfrastructureCall_ReferencedRequiredRoleMustBeRequiredByComponent(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return infrastructureCall.ReferencedRequiredRoleMustBeRequiredByComponent(diagnostics, context);
   }

   /**
    * Validates the SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Infrastructure Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateInfrastructureCall_SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return infrastructureCall.SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateResourceCall(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(resourceCall, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validateResourceCall_ResourceSignatureBelongsToResourceRequiredRole(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validateResourceCall_ResourceRequiredRoleMustBeReferencedByComponent(resourceCall, diagnostics, context);
      if (result || diagnostics != null) result &= validateResourceCall_SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(resourceCall, diagnostics, context);
      return result;
   }

   /**
    * Validates the ResourceSignatureBelongsToResourceRequiredRole constraint of '<em>Resource Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateResourceCall_ResourceSignatureBelongsToResourceRequiredRole(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return resourceCall.ResourceSignatureBelongsToResourceRequiredRole(diagnostics, context);
   }

   /**
    * Validates the ResourceRequiredRoleMustBeReferencedByComponent constraint of '<em>Resource Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateResourceCall_ResourceRequiredRoleMustBeReferencedByComponent(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return resourceCall.ResourceRequiredRoleMustBeReferencedByComponent(diagnostics, context);
   }

   /**
    * Validates the SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Resource Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateResourceCall_SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return resourceCall.SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateParametricResourceDemand(ParametricResourceDemand parametricResourceDemand, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(parametricResourceDemand, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(parametricResourceDemand, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parametricResourceDemand, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parametricResourceDemand, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parametricResourceDemand, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(parametricResourceDemand, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(parametricResourceDemand, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(parametricResourceDemand, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parametricResourceDemand, diagnostics, context);
      if (result || diagnostics != null) result &= validateParametricResourceDemand_DemandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction(parametricResourceDemand, diagnostics, context);
      return result;
   }

   /**
    * Validates the DemandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Parametric Resource Demand</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateParametricResourceDemand_DemandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction(ParametricResourceDemand parametricResourceDemand, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return parametricResourceDemand.DemandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction(diagnostics, context);
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

} //Seff_performance_pc_pcValidator
