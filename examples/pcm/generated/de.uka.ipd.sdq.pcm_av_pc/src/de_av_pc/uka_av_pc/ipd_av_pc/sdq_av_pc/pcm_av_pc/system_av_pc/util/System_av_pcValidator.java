/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.util;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.util.Identifier_av_pcValidator;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.util.Composition_av_pcValidator;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.util.Entity_av_pcValidator;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System_av_pcPackage;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System_av_pcPackage
 * @generated
 */
public class System_av_pcValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final System_av_pcValidator INSTANCE = new System_av_pcValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'System Must Have At Least One Provided Role' of 'System'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int SYSTEM__SYSTEM_MUST_HAVE_AT_LEAST_ONE_PROVIDED_ROLE = 1;

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
   protected Identifier_av_pcValidator identifier_av_pcValidator;

   /**
    * The cached base package validator.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Composition_av_pcValidator composition_av_pcValidator;

   /**
    * The cached base package validator.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Entity_av_pcValidator entity_av_pcValidator;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public System_av_pcValidator() {
      super();
      identifier_av_pcValidator = Identifier_av_pcValidator.INSTANCE;
      composition_av_pcValidator = Composition_av_pcValidator.INSTANCE;
      entity_av_pcValidator = Entity_av_pcValidator.INSTANCE;
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage() {
     return System_av_pcPackage.eINSTANCE;
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
         case System_av_pcPackage.SYSTEM:
            return validateSystem((de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System)value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSystem(de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_av_pcValidator.validateIdentifier_idHasToBeUnique(system, diagnostics, context);
      if (result || diagnostics != null) result &= composition_av_pcValidator.validateComposedStructure_MultipleConnectorsConstraint(system, diagnostics, context);
      if (result || diagnostics != null) result &= composition_av_pcValidator.validateComposedStructure_MultipleConnectorsConstraintForAssemblyConnectors(system, diagnostics, context);
      if (result || diagnostics != null) result &= entity_av_pcValidator.validateComposedProvidingRequiringEntity_ProvidedRolesMustBeBound(system, diagnostics, context);
      if (result || diagnostics != null) result &= validateSystem_SystemMustHaveAtLeastOneProvidedRole(system, diagnostics, context);
      return result;
   }

   /**
    * Validates the SystemMustHaveAtLeastOneProvidedRole constraint of '<em>System</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSystem_SystemMustHaveAtLeastOneProvidedRole(de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return system.SystemMustHaveAtLeastOneProvidedRole(diagnostics, context);
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

} //System_av_pcValidator
