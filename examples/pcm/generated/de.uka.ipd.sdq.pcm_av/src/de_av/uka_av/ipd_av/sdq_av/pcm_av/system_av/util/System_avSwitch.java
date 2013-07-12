/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.util;

import de_av.uka_av.ipd_av.sdq_av.identifier_av.Identifier;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.ComposedStructure;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ComposedProvidingRequiringEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.InterfaceProvidingEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.InterfaceProvidingRequiringEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.InterfaceRequiringEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.NamedElement;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceInterfaceRequiringEntity;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System_avPackage;

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
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System_avPackage
 * @generated
 */
public class System_avSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static System_avPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public System_avSwitch() {
      if (modelPackage == null) {
         modelPackage = System_avPackage.eINSTANCE;
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
         case System_avPackage.SYSTEM: {
            de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System system = (de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System)theEObject;
            T result = caseSystem(system);
            if (result == null) result = caseComposedProvidingRequiringEntity(system);
            if (result == null) result = caseIdentifier(system);
            if (result == null) result = caseNamedElement(system);
            if (result == null) result = caseComposedStructure(system);
            if (result == null) result = caseInterfaceProvidingRequiringEntity(system);
            if (result == null) result = caseInterfaceProvidingEntity(system);
            if (result == null) result = caseInterfaceRequiringEntity(system);
            if (result == null) result = caseResourceInterfaceRequiringEntity(system);
            if (result == null) result = caseEntity(system);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>System</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>System</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSystem(de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System object) {
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
    * Returns the result of interpreting the object as an instance of '<em>Composed Structure</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Composed Structure</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComposedStructure(ComposedStructure object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Interface Providing Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Interface Providing Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInterfaceProvidingEntity(InterfaceProvidingEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Interface Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Interface Requiring Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceInterfaceRequiringEntity(ResourceInterfaceRequiringEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Interface Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Interface Requiring Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInterfaceRequiringEntity(InterfaceRequiringEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Interface Providing Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Interface Providing Requiring Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Composed Providing Requiring Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Composed Providing Requiring Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComposedProvidingRequiringEntity(ComposedProvidingRequiringEntity object) {
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

} //System_avSwitch
