/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.util;

import de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.util.Identifier_pcValidator;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.Qosannotations_pcPackage
 * @generated
 */
public class Qosannotations_pcValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final Qosannotations_pcValidator INSTANCE = new Qosannotations_pcValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc";

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
   protected Identifier_pcValidator identifier_pcValidator;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_pcValidator() {
      super();
      identifier_pcValidator = Identifier_pcValidator.INSTANCE;
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage() {
     return Qosannotations_pcPackage.eINSTANCE;
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
         case Qosannotations_pcPackage.SPECIFIED_QO_SANNOTATION:
            return validateSpecifiedQoSAnnotation((SpecifiedQoSAnnotation)value, diagnostics, context);
         case Qosannotations_pcPackage.QO_SANNOTATIONS:
            return validateQoSAnnotations((QoSAnnotations)value, diagnostics, context);
         case Qosannotations_pcPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
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
      if (result || diagnostics != null) result &= identifier_pcValidator.validateIdentifier_idHasToBeUnique(qoSAnnotations, diagnostics, context);
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

} //Qosannotations_pcValidator
