/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.util;

import de_av.uka_av.ipd_av.sdq_av.identifier_av.util.Identifier_avValidator;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.util.Composition_avValidator;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity_avPackage
 * @generated
 */
public class Entity_avValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final Entity_avValidator INSTANCE = new Entity_avValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Provided Roles Must Be Bound' of 'Composed Providing Requiring Entity'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_MUST_BE_BOUND = 1;

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
   protected Identifier_avValidator identifier_avValidator;

   /**
    * The cached base package validator.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Composition_avValidator composition_avValidator;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entity_avValidator() {
      super();
      identifier_avValidator = Identifier_avValidator.INSTANCE;
      composition_avValidator = Composition_avValidator.INSTANCE;
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage() {
     return Entity_avPackage.eINSTANCE;
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
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE:
            return validateResourceProvidedRole((ResourceProvidedRole)value, diagnostics, context);
         case Entity_avPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY:
            return validateInterfaceProvidingRequiringEntity((InterfaceProvidingRequiringEntity)value, diagnostics, context);
         case Entity_avPackage.INTERFACE_PROVIDING_ENTITY:
            return validateInterfaceProvidingEntity((InterfaceProvidingEntity)value, diagnostics, context);
         case Entity_avPackage.INTERFACE_REQUIRING_ENTITY:
            return validateInterfaceRequiringEntity((InterfaceRequiringEntity)value, diagnostics, context);
         case Entity_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return validateResourceInterfaceRequiringEntity((ResourceInterfaceRequiringEntity)value, diagnostics, context);
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE:
            return validateResourceRequiredRole((ResourceRequiredRole)value, diagnostics, context);
         case Entity_avPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY:
            return validateResourceInterfaceProvidingEntity((ResourceInterfaceProvidingEntity)value, diagnostics, context);
         case Entity_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY:
            return validateComposedProvidingRequiringEntity((ComposedProvidingRequiringEntity)value, diagnostics, context);
         case Entity_avPackage.NAMED_ELEMENT:
            return validateNamedElement((NamedElement)value, diagnostics, context);
         case Entity_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY:
            return validateResourceInterfaceProvidingRequiringEntity((ResourceInterfaceProvidingRequiringEntity)value, diagnostics, context);
         case Entity_avPackage.ENTITY:
            return validateEntity((Entity)value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateResourceProvidedRole(ResourceProvidedRole resourceProvidedRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(resourceProvidedRole, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(resourceProvidedRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceProvidedRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceProvidedRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceProvidedRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceProvidedRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(resourceProvidedRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceProvidedRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceProvidedRole, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(resourceProvidedRole, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity interfaceProvidingRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(interfaceProvidingRequiringEntity, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(interfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(interfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(interfaceProvidingRequiringEntity, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateInterfaceProvidingEntity(InterfaceProvidingEntity interfaceProvidingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(interfaceProvidingEntity, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(interfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(interfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(interfaceProvidingEntity, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateInterfaceRequiringEntity(InterfaceRequiringEntity interfaceRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(interfaceRequiringEntity, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(interfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(interfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(interfaceRequiringEntity, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateResourceInterfaceRequiringEntity(ResourceInterfaceRequiringEntity resourceInterfaceRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(resourceInterfaceRequiringEntity, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(resourceInterfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceInterfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceInterfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceInterfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceInterfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(resourceInterfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceInterfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceInterfaceRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(resourceInterfaceRequiringEntity, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateResourceRequiredRole(ResourceRequiredRole resourceRequiredRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(resourceRequiredRole, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(resourceRequiredRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceRequiredRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceRequiredRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceRequiredRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceRequiredRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(resourceRequiredRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceRequiredRole, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceRequiredRole, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(resourceRequiredRole, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateResourceInterfaceProvidingEntity(ResourceInterfaceProvidingEntity resourceInterfaceProvidingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(resourceInterfaceProvidingEntity, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(resourceInterfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceInterfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceInterfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceInterfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceInterfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(resourceInterfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceInterfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceInterfaceProvidingEntity, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(resourceInterfaceProvidingEntity, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateComposedProvidingRequiringEntity(ComposedProvidingRequiringEntity composedProvidingRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(composedProvidingRequiringEntity, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= composition_avValidator.validateComposedStructure_MultipleConnectorsConstraint(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= composition_avValidator.validateComposedStructure_MultipleConnectorsConstraintForAssemblyConnectors(composedProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validateComposedProvidingRequiringEntity_ProvidedRolesMustBeBound(composedProvidingRequiringEntity, diagnostics, context);
      return result;
   }

   /**
    * Validates the ProvidedRolesMustBeBound constraint of '<em>Composed Providing Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateComposedProvidingRequiringEntity_ProvidedRolesMustBeBound(ComposedProvidingRequiringEntity composedProvidingRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return composedProvidingRequiringEntity.ProvidedRolesMustBeBound(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateResourceInterfaceProvidingRequiringEntity(ResourceInterfaceProvidingRequiringEntity resourceInterfaceProvidingRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(resourceInterfaceProvidingRequiringEntity, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(resourceInterfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceInterfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceInterfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceInterfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceInterfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(resourceInterfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceInterfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceInterfaceProvidingRequiringEntity, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(resourceInterfaceProvidingRequiringEntity, diagnostics, context);
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_avValidator.validateIdentifier_idHasToBeUnique(entity, diagnostics, context);
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

} //Entity_avValidator
