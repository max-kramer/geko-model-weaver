/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.*;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Atom;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanExpression;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Comparison;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Expression;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElse;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Power;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Product;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Term;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Unary;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.Parameter_av_avPackage
 * @generated
 */
public class Parameter_av_avAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Parameter_av_avPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter_av_avAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Parameter_av_avPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject)object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Parameter_av_avSwitch<Adapter> modelSwitch =
      new Parameter_av_avSwitch<Adapter>() {
         @Override
         public Adapter caseVariableUsage(VariableUsage object) {
            return createVariableUsageAdapter();
         }
         @Override
         public Adapter caseVariableCharacterisation(VariableCharacterisation object) {
            return createVariableCharacterisationAdapter();
         }
         @Override
         public Adapter caseCharacterisedVariable(CharacterisedVariable object) {
            return createCharacterisedVariableAdapter();
         }
         @Override
         public Adapter caseExpression(Expression object) {
            return createExpressionAdapter();
         }
         @Override
         public Adapter caseIfElse(IfElse object) {
            return createIfElseAdapter();
         }
         @Override
         public Adapter caseBooleanExpression(BooleanExpression object) {
            return createBooleanExpressionAdapter();
         }
         @Override
         public Adapter caseComparison(Comparison object) {
            return createComparisonAdapter();
         }
         @Override
         public Adapter caseTerm(Term object) {
            return createTermAdapter();
         }
         @Override
         public Adapter caseProduct(Product object) {
            return createProductAdapter();
         }
         @Override
         public Adapter casePower(Power object) {
            return createPowerAdapter();
         }
         @Override
         public Adapter caseUnary(Unary object) {
            return createUnaryAdapter();
         }
         @Override
         public Adapter caseAtom(Atom object) {
            return createAtomAdapter();
         }
         @Override
         public Adapter caseVariable(Variable object) {
            return createVariableAdapter();
         }
         @Override
         public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
         }
      };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject)target);
   }


   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.VariableUsage <em>Variable Usage</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.VariableUsage
    * @generated
    */
   public Adapter createVariableUsageAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.VariableCharacterisation <em>Variable Characterisation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.VariableCharacterisation
    * @generated
    */
   public Adapter createVariableCharacterisationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.CharacterisedVariable <em>Characterised Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.CharacterisedVariable
    * @generated
    */
   public Adapter createCharacterisedVariableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Expression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Expression
    * @generated
    */
   public Adapter createExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElse <em>If Else</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElse
    * @generated
    */
   public Adapter createIfElseAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanExpression <em>Boolean Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanExpression
    * @generated
    */
   public Adapter createBooleanExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Comparison <em>Comparison</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Comparison
    * @generated
    */
   public Adapter createComparisonAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Term <em>Term</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Term
    * @generated
    */
   public Adapter createTermAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Product <em>Product</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Product
    * @generated
    */
   public Adapter createProductAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Power <em>Power</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Power
    * @generated
    */
   public Adapter createPowerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Unary <em>Unary</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Unary
    * @generated
    */
   public Adapter createUnaryAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Atom <em>Atom</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Atom
    * @generated
    */
   public Adapter createAtomAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Variable <em>Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Variable
    * @generated
    */
   public Adapter createVariableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} //Parameter_av_avAdapterFactory
