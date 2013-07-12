/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.util.Identifier_av_avValidator;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.Qosannotations_av_avPackage
 * @generated
 */
public class Qosannotations_av_avValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final Qosannotations_av_avValidator INSTANCE = new Qosannotations_av_avValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiple Reliability Annotations Per External Call Not Allowed' of 'Qo SAnnotations'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int QO_SANNOTATIONS__MULTIPLE_RELIABILITY_ANNOTATIONS_PER_EXTERNAL_CALL_NOT_ALLOWED = 1;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

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
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_av_avValidator() {
      super();
      identifier_av_avValidator = Identifier_av_avValidator.INSTANCE;
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage() {
     return Qosannotations_av_avPackage.eINSTANCE;
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
         case Qosannotations_av_avPackage.SPECIFIED_QO_SANNOTATION:
            return validateSpecifiedQoSAnnotation((SpecifiedQoSAnnotation)value, diagnostics, context);
         case Qosannotations_av_avPackage.QO_SANNOTATIONS:
            return validateQoSAnnotations((QoSAnnotations)value, diagnostics, context);
         case Qosannotations_av_avPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
            return validateSpecifiedOutputParameterAbstraction((SpecifiedOutputParameterAbstraction)value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSpecifiedQoSAnnotation(SpecifiedQoSAnnotation specifiedQoSAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return validate_EveryDefaultConstraint(specifiedQoSAnnotation, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateQoSAnnotations(QoSAnnotations qoSAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(qoSAnnotations, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(qoSAnnotations, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qoSAnnotations, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qoSAnnotations, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qoSAnnotations, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(qoSAnnotations, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(qoSAnnotations, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(qoSAnnotations, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qoSAnnotations, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_av_avValidator.validateIdentifier_idHasToBeUnique(qoSAnnotations, diagnostics, context);
      if (result || diagnostics != null) result &= validateQoSAnnotations_MultipleReliabilityAnnotationsPerExternalCallNotAllowed(qoSAnnotations, diagnostics, context);
      return result;
   }

   /**
    * Validates the MultipleReliabilityAnnotationsPerExternalCallNotAllowed constraint of '<em>Qo SAnnotations</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateQoSAnnotations_MultipleReliabilityAnnotationsPerExternalCallNotAllowed(QoSAnnotations qoSAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return qoSAnnotations.MultipleReliabilityAnnotationsPerExternalCallNotAllowed(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSpecifiedOutputParameterAbstraction(SpecifiedOutputParameterAbstraction specifiedOutputParameterAbstraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return validate_EveryDefaultConstraint(specifiedOutputParameterAbstraction, diagnostics, context);
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

} //Qosannotations_av_avValidator
