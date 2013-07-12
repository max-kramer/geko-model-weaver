/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc.util;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc.Qos_reliability_pc_pcPackage
 * @generated
 */
public class Qos_reliability_pc_pcValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final Qos_reliability_pc_pcValidator INSTANCE = new Qos_reliability_pc_pcValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Specified Reliability Annotation Must Reference Required Role Of ASystem' of 'Specified Reliability Annotation'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int SPECIFIED_RELIABILITY_ANNOTATION__SPECIFIED_RELIABILITY_ANNOTATION_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM = 1;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sum Of Reliability Annotation Failure Probabilities Must Not Exceed1' of 'Specified Reliability Annotation'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int SPECIFIED_RELIABILITY_ANNOTATION__SUM_OF_RELIABILITY_ANNOTATION_FAILURE_PROBABILITIES_MUST_NOT_EXCEED1 = 2;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiple External Occurrence Descriptions Per Failure Type Not Allowed' of 'Specified Reliability Annotation'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int SPECIFIED_RELIABILITY_ANNOTATION__MULTIPLE_EXTERNAL_OCCURRENCE_DESCRIPTIONS_PER_FAILURE_TYPE_NOT_ALLOWED = 3;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

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
   public Qos_reliability_pc_pcValidator() {
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
     return Qos_reliability_pc_pcPackage.eINSTANCE;
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
         case Qos_reliability_pc_pcPackage.SPECIFIED_RELIABILITY_ANNOTATION:
            return validateSpecifiedReliabilityAnnotation((SpecifiedReliabilityAnnotation)value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSpecifiedReliabilityAnnotation(SpecifiedReliabilityAnnotation specifiedReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(specifiedReliabilityAnnotation, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validateSpecifiedReliabilityAnnotation_SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validateSpecifiedReliabilityAnnotation_SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(specifiedReliabilityAnnotation, diagnostics, context);
      if (result || diagnostics != null) result &= validateSpecifiedReliabilityAnnotation_MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(specifiedReliabilityAnnotation, diagnostics, context);
      return result;
   }

   /**
    * Validates the SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem constraint of '<em>Specified Reliability Annotation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSpecifiedReliabilityAnnotation_SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(SpecifiedReliabilityAnnotation specifiedReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return specifiedReliabilityAnnotation.SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(diagnostics, context);
   }

   /**
    * Validates the SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1 constraint of '<em>Specified Reliability Annotation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSpecifiedReliabilityAnnotation_SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(SpecifiedReliabilityAnnotation specifiedReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return specifiedReliabilityAnnotation.SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(diagnostics, context);
   }

   /**
    * Validates the MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed constraint of '<em>Specified Reliability Annotation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSpecifiedReliabilityAnnotation_MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(SpecifiedReliabilityAnnotation specifiedReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return specifiedReliabilityAnnotation.MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(diagnostics, context);
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

} //Qos_reliability_pc_pcValidator
