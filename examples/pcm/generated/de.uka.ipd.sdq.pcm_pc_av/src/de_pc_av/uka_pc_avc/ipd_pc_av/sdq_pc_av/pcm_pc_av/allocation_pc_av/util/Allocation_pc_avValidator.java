/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av.util;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.util.Identifier_pc_avValidator;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av.Allocation_pc_avPackage
 * @generated
 */
public class Allocation_pc_avValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final Allocation_pc_avValidator INSTANCE = new Allocation_pc_avValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Assembly Context Or One Event Channel Should Be Referred' of 'Allocation Context'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int ALLOCATION_CONTEXT__ONE_ASSEMBLY_CONTEXT_OR_ONE_EVENT_CHANNEL_SHOULD_BE_REFERRED = 1;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Each Assembly Context Within System Has To Be Allocated Exactly Once' of 'Allocation'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int ALLOCATION__EACH_ASSEMBLY_CONTEXT_WITHIN_SYSTEM_HAS_TO_BE_ALLOCATED_EXACTLY_ONCE = 2;

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Communicating Servers Have To Be Connected By Linking Resource' of 'Allocation'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int ALLOCATION__COMMUNICATING_SERVERS_HAVE_TO_BE_CONNECTED_BY_LINKING_RESOURCE = 3;

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
    * The cached base package validator.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Identifier_pc_avValidator identifier_pc_avValidator;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Allocation_pc_avValidator() {
      super();
      identifier_pc_avValidator = Identifier_pc_avValidator.INSTANCE;
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage() {
     return Allocation_pc_avPackage.eINSTANCE;
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
         case Allocation_pc_avPackage.ALLOCATION_CONTEXT:
            return validateAllocationContext((AllocationContext)value, diagnostics, context);
         case Allocation_pc_avPackage.ALLOCATION:
            return validateAllocation((Allocation)value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateAllocationContext(AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(allocationContext, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(allocationContext, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocationContext, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocationContext, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocationContext, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocationContext, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(allocationContext, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocationContext, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocationContext, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_pc_avValidator.validateIdentifier_idHasToBeUnique(allocationContext, diagnostics, context);
      if (result || diagnostics != null) result &= validateAllocationContext_OneAssemblyContextOrOneEventChannelShouldBeReferred(allocationContext, diagnostics, context);
      return result;
   }

   /**
    * Validates the OneAssemblyContextOrOneEventChannelShouldBeReferred constraint of '<em>Allocation Context</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateAllocationContext_OneAssemblyContextOrOneEventChannelShouldBeReferred(AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return allocationContext.OneAssemblyContextOrOneEventChannelShouldBeReferred(diagnostics, context);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(allocation, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_pc_avValidator.validateIdentifier_idHasToBeUnique(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= validateAllocation_EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(allocation, diagnostics, context);
      if (result || diagnostics != null) result &= validateAllocation_CommunicatingServersHaveToBeConnectedByLinkingResource(allocation, diagnostics, context);
      return result;
   }

   /**
    * Validates the EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce constraint of '<em>Allocation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateAllocation_EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return allocation.EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(diagnostics, context);
   }

   /**
    * Validates the CommunicatingServersHaveToBeConnectedByLinkingResource constraint of '<em>Allocation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateAllocation_CommunicatingServersHaveToBeConnectedByLinkingResource(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return allocation.CommunicatingServersHaveToBeConnectedByLinkingResource(diagnostics, context);
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

} //Allocation_pc_avValidator
