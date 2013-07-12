/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.util;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.*;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.UnitCarryingElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Stoex_pc_pcPackage
 * @generated
 */
public class Stoex_pc_pcAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Stoex_pc_pcPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Stoex_pc_pcAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Stoex_pc_pcPackage.eINSTANCE;
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
   protected Stoex_pc_pcSwitch<Adapter> modelSwitch =
      new Stoex_pc_pcSwitch<Adapter>() {
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
         public Adapter casePointcutPointcut(PointcutPointcut object) {
            return createPointcutPointcutAdapter();
         }
         @Override
         public Adapter casePointcut(Pointcut object) {
            return createPointcutAdapter();
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
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.VariableReference <em>Variable Reference</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.VariableReference
    * @generated
    */
   public Adapter createVariableReferenceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.AbstractNamedReference <em>Abstract Named Reference</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.AbstractNamedReference
    * @generated
    */
   public Adapter createAbstractNamedReferenceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NamespaceReference <em>Namespace Reference</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NamespaceReference
    * @generated
    */
   public Adapter createNamespaceReferenceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Variable <em>Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Variable
    * @generated
    */
   public Adapter createVariableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Atom <em>Atom</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Atom
    * @generated
    */
   public Adapter createAtomAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Unary <em>Unary</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Unary
    * @generated
    */
   public Adapter createUnaryAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Power <em>Power</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Power
    * @generated
    */
   public Adapter createPowerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Product <em>Product</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Product
    * @generated
    */
   public Adapter createProductAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Term <em>Term</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Term
    * @generated
    */
   public Adapter createTermAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Comparison <em>Comparison</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Comparison
    * @generated
    */
   public Adapter createComparisonAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanExpression <em>Boolean Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanExpression
    * @generated
    */
   public Adapter createBooleanExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElse <em>If Else</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElse
    * @generated
    */
   public Adapter createIfElseAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Expression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Expression
    * @generated
    */
   public Adapter createExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression <em>Term Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression
    * @generated
    */
   public Adapter createTermExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression <em>Product Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression
    * @generated
    */
   public Adapter createProductExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProbabilityFunctionLiteral <em>Probability Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProbabilityFunctionLiteral
    * @generated
    */
   public Adapter createProbabilityFunctionLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Parenthesis <em>Parenthesis</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Parenthesis
    * @generated
    */
   public Adapter createParenthesisAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NumericLiteral <em>Numeric Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NumericLiteral
    * @generated
    */
   public Adapter createNumericLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IntLiteral <em>Int Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IntLiteral
    * @generated
    */
   public Adapter createIntLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.DoubleLiteral <em>Double Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.DoubleLiteral
    * @generated
    */
   public Adapter createDoubleLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression <em>Compare Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression
    * @generated
    */
   public Adapter createCompareExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BoolLiteral <em>Bool Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BoolLiteral
    * @generated
    */
   public Adapter createBoolLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.StringLiteral <em>String Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.StringLiteral
    * @generated
    */
   public Adapter createStringLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PowerExpression <em>Power Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PowerExpression
    * @generated
    */
   public Adapter createPowerExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression <em>Boolean Operator Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression
    * @generated
    */
   public Adapter createBooleanOperatorExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NotExpression <em>Not Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NotExpression
    * @generated
    */
   public Adapter createNotExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NegativeExpression <em>Negative Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NegativeExpression
    * @generated
    */
   public Adapter createNegativeExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.FunctionLiteral <em>Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.FunctionLiteral
    * @generated
    */
   public Adapter createFunctionLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression <em>If Else Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression
    * @generated
    */
   public Adapter createIfElseExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.RandomVariable <em>Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.RandomVariable
    * @generated
    */
   public Adapter createRandomVariableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PointcutPointcut <em>Pointcut Pointcut</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PointcutPointcut
    * @generated
    */
   public Adapter createPointcutPointcutAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Pointcut <em>Pointcut</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Pointcut
    * @generated
    */
   public Adapter createPointcutAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.UnitCarryingElement <em>Unit Carrying Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.UnitCarryingElement
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

} //Stoex_pc_pcAdapterFactory
