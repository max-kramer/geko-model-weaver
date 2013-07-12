/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.*;

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
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.Units_av_avPackage
 * @generated
 */
public class Units_av_avSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Units_av_avPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_av_avSwitch() {
      if (modelPackage == null) {
         modelPackage = Units_av_avPackage.eINSTANCE;
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
         case Units_av_avPackage.UNIT_CARRYING_ELEMENT: {
            UnitCarryingElement unitCarryingElement = (UnitCarryingElement)theEObject;
            T result = caseUnitCarryingElement(unitCarryingElement);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.UNIT: {
            Unit unit = (Unit)theEObject;
            T result = caseUnit(unit);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.BASE_UNIT: {
            BaseUnit baseUnit = (BaseUnit)theEObject;
            T result = caseBaseUnit(baseUnit);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.UNIT_REPOSITORY: {
            UnitRepository unitRepository = (UnitRepository)theEObject;
            T result = caseUnitRepository(unitRepository);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.UNIT_MULTIPLICATION: {
            UnitMultiplication unitMultiplication = (UnitMultiplication)theEObject;
            T result = caseUnitMultiplication(unitMultiplication);
            if (result == null) result = caseUnit(unitMultiplication);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.UNIT_POWER: {
            UnitPower unitPower = (UnitPower)theEObject;
            T result = caseUnitPower(unitPower);
            if (result == null) result = caseUnit(unitPower);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.UNIT_LITERAL: {
            UnitLiteral unitLiteral = (UnitLiteral)theEObject;
            T result = caseUnitLiteral(unitLiteral);
            if (result == null) result = caseUnit(unitLiteral);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.ADVICE_ADVICE: {
            AdviceAdvice adviceAdvice = (AdviceAdvice)theEObject;
            T result = caseAdviceAdvice(adviceAdvice);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.GLOBAL_SCOPE_GLOBAL_SCOPE: {
            GlobalScopeGlobalScope globalScopeGlobalScope = (GlobalScopeGlobalScope)theEObject;
            T result = caseGlobalScopeGlobalScope(globalScopeGlobalScope);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.PER_JOIN_POINT_SCOPE_PER_JOIN_POINT_SCOPE: {
            PerJoinPointScopePerJoinPointScope perJoinPointScopePerJoinPointScope = (PerJoinPointScopePerJoinPointScope)theEObject;
            T result = casePerJoinPointScopePerJoinPointScope(perJoinPointScopePerJoinPointScope);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.ADVICE: {
            Advice advice = (Advice)theEObject;
            T result = caseAdvice(advice);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.GLOBAL_SCOPE: {
            GlobalScope globalScope = (GlobalScope)theEObject;
            T result = caseGlobalScope(globalScope);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Units_av_avPackage.PER_JOIN_POINT_SCOPE: {
            PerJoinPointScope perJoinPointScope = (PerJoinPointScope)theEObject;
            T result = casePerJoinPointScope(perJoinPointScope);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Unit Carrying Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Unit Carrying Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUnitCarryingElement(UnitCarryingElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUnit(Unit object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Base Unit</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Base Unit</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBaseUnit(BaseUnit object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Unit Repository</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Unit Repository</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUnitRepository(UnitRepository object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Unit Multiplication</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Unit Multiplication</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUnitMultiplication(UnitMultiplication object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Unit Power</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Unit Power</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUnitPower(UnitPower object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Unit Literal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Unit Literal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUnitLiteral(UnitLiteral object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Advice Advice</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Advice Advice</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAdviceAdvice(AdviceAdvice object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Global Scope Global Scope</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Global Scope Global Scope</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGlobalScopeGlobalScope(GlobalScopeGlobalScope object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Per Join Point Scope Per Join Point Scope</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Per Join Point Scope Per Join Point Scope</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePerJoinPointScopePerJoinPointScope(PerJoinPointScopePerJoinPointScope object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Advice</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Advice</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAdvice(Advice object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Global Scope</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Global Scope</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGlobalScope(GlobalScope object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Per Join Point Scope</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Per Join Point Scope</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePerJoinPointScope(PerJoinPointScope object) {
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

} //Units_av_avSwitch
