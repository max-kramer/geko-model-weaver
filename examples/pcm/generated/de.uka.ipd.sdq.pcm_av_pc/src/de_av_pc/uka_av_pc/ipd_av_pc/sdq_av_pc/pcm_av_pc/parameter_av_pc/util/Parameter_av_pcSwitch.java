/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.util;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.*;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Atom;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.BooleanExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Comparison;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Expression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IfElse;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Power;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Product;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Term;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Unary;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Variable;

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
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.Parameter_av_pcPackage
 * @generated
 */
public class Parameter_av_pcSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Parameter_av_pcPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter_av_pcSwitch() {
      if (modelPackage == null) {
         modelPackage = Parameter_av_pcPackage.eINSTANCE;
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
         case Parameter_av_pcPackage.VARIABLE_USAGE: {
            VariableUsage variableUsage = (VariableUsage)theEObject;
            T result = caseVariableUsage(variableUsage);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Parameter_av_pcPackage.VARIABLE_CHARACTERISATION: {
            VariableCharacterisation variableCharacterisation = (VariableCharacterisation)theEObject;
            T result = caseVariableCharacterisation(variableCharacterisation);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Parameter_av_pcPackage.CHARACTERISED_VARIABLE: {
            CharacterisedVariable characterisedVariable = (CharacterisedVariable)theEObject;
            T result = caseCharacterisedVariable(characterisedVariable);
            if (result == null) result = caseVariable(characterisedVariable);
            if (result == null) result = caseAtom(characterisedVariable);
            if (result == null) result = caseUnary(characterisedVariable);
            if (result == null) result = casePower(characterisedVariable);
            if (result == null) result = caseProduct(characterisedVariable);
            if (result == null) result = caseTerm(characterisedVariable);
            if (result == null) result = caseComparison(characterisedVariable);
            if (result == null) result = caseBooleanExpression(characterisedVariable);
            if (result == null) result = caseIfElse(characterisedVariable);
            if (result == null) result = caseExpression(characterisedVariable);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Variable Usage</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Variable Usage</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseVariableUsage(VariableUsage object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Variable Characterisation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Variable Characterisation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseVariableCharacterisation(VariableCharacterisation object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Characterised Variable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Characterised Variable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCharacterisedVariable(CharacterisedVariable object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExpression(Expression object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>If Else</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>If Else</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseIfElse(IfElse object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBooleanExpression(BooleanExpression object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComparison(Comparison object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Term</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTerm(Term object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Product</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseProduct(Product object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Power</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Power</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePower(Power object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Unary</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Unary</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUnary(Unary object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAtom(Atom object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseVariable(Variable object) {
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

} //Parameter_av_pcSwitch
