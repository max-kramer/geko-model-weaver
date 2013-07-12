/**
 */
package de_av.uka_av.ipd_av.sdq_av.stoex_av.util;

import de_av.uka_av.ipd_av.sdq_av.stoex_av.*;

import de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage
 * @generated
 */
public class Stoex_avAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Stoex_avPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Stoex_avAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Stoex_avPackage.eINSTANCE;
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
   protected Stoex_avSwitch<Adapter> modelSwitch =
      new Stoex_avSwitch<Adapter>() {
         @Override
         public Adapter caseVariableReference(VariableReference object) {
            return createVariableReferenceAdapter();
         }
         @Override
         public Adapter caseAbstractNamedReference(AbstractNamedReference object) {
            return createAbstractNamedReferenceAdapter();
         }
         @Override
         public Adapter caseNamespaceReference(NamespaceReference object) {
            return createNamespaceReferenceAdapter();
         }
         @Override
         public Adapter caseVariable(Variable object) {
            return createVariableAdapter();
         }
         @Override
         public Adapter caseAtom(Atom object) {
            return createAtomAdapter();
         }
         @Override
         public Adapter caseUnary(Unary object) {
            return createUnaryAdapter();
         }
         @Override
         public Adapter casePower(Power object) {
            return createPowerAdapter();
         }
         @Override
         public Adapter caseProduct(Product object) {
            return createProductAdapter();
         }
         @Override
         public Adapter caseTerm(Term object) {
            return createTermAdapter();
         }
         @Override
         public Adapter caseComparison(Comparison object) {
            return createComparisonAdapter();
         }
         @Override
         public Adapter caseBooleanExpression(BooleanExpression object) {
            return createBooleanExpressionAdapter();
         }
         @Override
         public Adapter caseIfElse(IfElse object) {
            return createIfElseAdapter();
         }
         @Override
         public Adapter caseExpression(Expression object) {
            return createExpressionAdapter();
         }
         @Override
         public Adapter caseTermExpression(TermExpression object) {
            return createTermExpressionAdapter();
         }
         @Override
         public Adapter caseProductExpression(ProductExpression object) {
            return createProductExpressionAdapter();
         }
         @Override
         public Adapter caseProbabilityFunctionLiteral(ProbabilityFunctionLiteral object) {
            return createProbabilityFunctionLiteralAdapter();
         }
         @Override
         public Adapter caseParenthesis(Parenthesis object) {
            return createParenthesisAdapter();
         }
         @Override
         public Adapter caseNumericLiteral(NumericLiteral object) {
            return createNumericLiteralAdapter();
         }
         @Override
         public Adapter caseIntLiteral(IntLiteral object) {
            return createIntLiteralAdapter();
         }
         @Override
         public Adapter caseDoubleLiteral(DoubleLiteral object) {
            return createDoubleLiteralAdapter();
         }
         @Override
         public Adapter caseCompareExpression(CompareExpression object) {
            return createCompareExpressionAdapter();
         }
         @Override
         public Adapter caseBoolLiteral(BoolLiteral object) {
            return createBoolLiteralAdapter();
         }
         @Override
         public Adapter caseStringLiteral(StringLiteral object) {
            return createStringLiteralAdapter();
         }
         @Override
         public Adapter casePowerExpression(PowerExpression object) {
            return createPowerExpressionAdapter();
         }
         @Override
         public Adapter caseBooleanOperatorExpression(BooleanOperatorExpression object) {
            return createBooleanOperatorExpressionAdapter();
         }
         @Override
         public Adapter caseNotExpression(NotExpression object) {
            return createNotExpressionAdapter();
         }
         @Override
         public Adapter caseNegativeExpression(NegativeExpression object) {
            return createNegativeExpressionAdapter();
         }
         @Override
         public Adapter caseFunctionLiteral(FunctionLiteral object) {
            return createFunctionLiteralAdapter();
         }
         @Override
         public Adapter caseIfElseExpression(IfElseExpression object) {
            return createIfElseExpressionAdapter();
         }
         @Override
         public Adapter caseRandomVariable(RandomVariable object) {
            return createRandomVariableAdapter();
         }
         @Override
         public Adapter caseAdvice(Advice object) {
            return createAdviceAdapter();
         }
         @Override
         public Adapter caseGlobalScope(GlobalScope object) {
            return createGlobalScopeAdapter();
         }
         @Override
         public Adapter casePerJoinPointScope(PerJoinPointScope object) {
            return createPerJoinPointScopeAdapter();
         }
         @Override
         public Adapter caseUnitCarryingElement(UnitCarryingElement object) {
            return createUnitCarryingElementAdapter();
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
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.VariableReference <em>Variable Reference</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.VariableReference
    * @generated
    */
   public Adapter createVariableReferenceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.AbstractNamedReference <em>Abstract Named Reference</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.AbstractNamedReference
    * @generated
    */
   public Adapter createAbstractNamedReferenceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.NamespaceReference <em>Namespace Reference</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.NamespaceReference
    * @generated
    */
   public Adapter createNamespaceReferenceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Variable <em>Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Variable
    * @generated
    */
   public Adapter createVariableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Atom <em>Atom</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Atom
    * @generated
    */
   public Adapter createAtomAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Unary <em>Unary</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Unary
    * @generated
    */
   public Adapter createUnaryAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Power <em>Power</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Power
    * @generated
    */
   public Adapter createPowerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Product <em>Product</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Product
    * @generated
    */
   public Adapter createProductAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Term <em>Term</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Term
    * @generated
    */
   public Adapter createTermAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Comparison <em>Comparison</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Comparison
    * @generated
    */
   public Adapter createComparisonAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.BooleanExpression <em>Boolean Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.BooleanExpression
    * @generated
    */
   public Adapter createBooleanExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.IfElse <em>If Else</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.IfElse
    * @generated
    */
   public Adapter createIfElseAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Expression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Expression
    * @generated
    */
   public Adapter createExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.TermExpression <em>Term Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.TermExpression
    * @generated
    */
   public Adapter createTermExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.ProductExpression <em>Product Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.ProductExpression
    * @generated
    */
   public Adapter createProductExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.ProbabilityFunctionLiteral <em>Probability Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.ProbabilityFunctionLiteral
    * @generated
    */
   public Adapter createProbabilityFunctionLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Parenthesis <em>Parenthesis</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Parenthesis
    * @generated
    */
   public Adapter createParenthesisAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.NumericLiteral <em>Numeric Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.NumericLiteral
    * @generated
    */
   public Adapter createNumericLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.IntLiteral <em>Int Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.IntLiteral
    * @generated
    */
   public Adapter createIntLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.DoubleLiteral <em>Double Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.DoubleLiteral
    * @generated
    */
   public Adapter createDoubleLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.CompareExpression <em>Compare Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.CompareExpression
    * @generated
    */
   public Adapter createCompareExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.BoolLiteral <em>Bool Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.BoolLiteral
    * @generated
    */
   public Adapter createBoolLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.StringLiteral <em>String Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.StringLiteral
    * @generated
    */
   public Adapter createStringLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.PowerExpression <em>Power Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.PowerExpression
    * @generated
    */
   public Adapter createPowerExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.BooleanOperatorExpression <em>Boolean Operator Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.BooleanOperatorExpression
    * @generated
    */
   public Adapter createBooleanOperatorExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.NotExpression <em>Not Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.NotExpression
    * @generated
    */
   public Adapter createNotExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.NegativeExpression <em>Negative Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.NegativeExpression
    * @generated
    */
   public Adapter createNegativeExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.FunctionLiteral <em>Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.FunctionLiteral
    * @generated
    */
   public Adapter createFunctionLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.IfElseExpression <em>If Else Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.IfElseExpression
    * @generated
    */
   public Adapter createIfElseExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.RandomVariable <em>Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.RandomVariable
    * @generated
    */
   public Adapter createRandomVariableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Advice <em>Advice</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Advice
    * @generated
    */
   public Adapter createAdviceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.GlobalScope <em>Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.GlobalScope
    * @generated
    */
   public Adapter createGlobalScopeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.PerJoinPointScope <em>Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.PerJoinPointScope
    * @generated
    */
   public Adapter createPerJoinPointScopeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement <em>Unit Carrying Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement
    * @generated
    */
   public Adapter createUnitCarryingElementAdapter() {
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

} //Stoex_avAdapterFactory
