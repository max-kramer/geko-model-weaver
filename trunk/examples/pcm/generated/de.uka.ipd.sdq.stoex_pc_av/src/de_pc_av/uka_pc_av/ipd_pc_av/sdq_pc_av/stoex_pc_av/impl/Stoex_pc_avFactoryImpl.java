/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Stoex_pc_avFactoryImpl extends EFactoryImpl implements Stoex_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Stoex_pc_avFactory init() {
      try {
         Stoex_pc_avFactory theStoex_pc_avFactory = (Stoex_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Stoex_pc_avPackage.eNS_URI);
         if (theStoex_pc_avFactory != null) {
            return theStoex_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Stoex_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Stoex_pc_avFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case Stoex_pc_avPackage.VARIABLE_REFERENCE: return createVariableReference();
         case Stoex_pc_avPackage.ABSTRACT_NAMED_REFERENCE: return createAbstractNamedReference();
         case Stoex_pc_avPackage.NAMESPACE_REFERENCE: return createNamespaceReference();
         case Stoex_pc_avPackage.VARIABLE: return createVariable();
         case Stoex_pc_avPackage.ATOM: return createAtom();
         case Stoex_pc_avPackage.UNARY: return createUnary();
         case Stoex_pc_avPackage.POWER: return createPower();
         case Stoex_pc_avPackage.PRODUCT: return createProduct();
         case Stoex_pc_avPackage.TERM: return createTerm();
         case Stoex_pc_avPackage.COMPARISON: return createComparison();
         case Stoex_pc_avPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
         case Stoex_pc_avPackage.IF_ELSE: return createIfElse();
         case Stoex_pc_avPackage.EXPRESSION: return createExpression();
         case Stoex_pc_avPackage.TERM_EXPRESSION: return createTermExpression();
         case Stoex_pc_avPackage.PRODUCT_EXPRESSION: return createProductExpression();
         case Stoex_pc_avPackage.PROBABILITY_FUNCTION_LITERAL: return createProbabilityFunctionLiteral();
         case Stoex_pc_avPackage.PARENTHESIS: return createParenthesis();
         case Stoex_pc_avPackage.NUMERIC_LITERAL: return createNumericLiteral();
         case Stoex_pc_avPackage.INT_LITERAL: return createIntLiteral();
         case Stoex_pc_avPackage.DOUBLE_LITERAL: return createDoubleLiteral();
         case Stoex_pc_avPackage.COMPARE_EXPRESSION: return createCompareExpression();
         case Stoex_pc_avPackage.BOOL_LITERAL: return createBoolLiteral();
         case Stoex_pc_avPackage.STRING_LITERAL: return createStringLiteral();
         case Stoex_pc_avPackage.POWER_EXPRESSION: return createPowerExpression();
         case Stoex_pc_avPackage.BOOLEAN_OPERATOR_EXPRESSION: return createBooleanOperatorExpression();
         case Stoex_pc_avPackage.NOT_EXPRESSION: return createNotExpression();
         case Stoex_pc_avPackage.NEGATIVE_EXPRESSION: return createNegativeExpression();
         case Stoex_pc_avPackage.FUNCTION_LITERAL: return createFunctionLiteral();
         case Stoex_pc_avPackage.IF_ELSE_EXPRESSION: return createIfElseExpression();
         case Stoex_pc_avPackage.RANDOM_VARIABLE: return createRandomVariable();
         case Stoex_pc_avPackage.POINTCUT: return createPointcut();
         case Stoex_pc_avPackage.ADVICE: return createAdvice();
         case Stoex_pc_avPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Stoex_pc_avPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue) {
      switch (eDataType.getClassifierID()) {
         case Stoex_pc_avPackage.TERM_OPERATIONS:
            return createTermOperationsFromString(eDataType, initialValue);
         case Stoex_pc_avPackage.PRODUCT_OPERATIONS:
            return createProductOperationsFromString(eDataType, initialValue);
         case Stoex_pc_avPackage.COMPARE_OPERATIONS:
            return createCompareOperationsFromString(eDataType, initialValue);
         case Stoex_pc_avPackage.BOOLEAN_OPERATIONS:
            return createBooleanOperationsFromString(eDataType, initialValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue) {
      switch (eDataType.getClassifierID()) {
         case Stoex_pc_avPackage.TERM_OPERATIONS:
            return convertTermOperationsToString(eDataType, instanceValue);
         case Stoex_pc_avPackage.PRODUCT_OPERATIONS:
            return convertProductOperationsToString(eDataType, instanceValue);
         case Stoex_pc_avPackage.COMPARE_OPERATIONS:
            return convertCompareOperationsToString(eDataType, instanceValue);
         case Stoex_pc_avPackage.BOOLEAN_OPERATIONS:
            return convertBooleanOperationsToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableReference createVariableReference() {
      VariableReferenceImpl variableReference = new VariableReferenceImpl();
      return variableReference;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractNamedReference createAbstractNamedReference() {
      AbstractNamedReferenceImpl abstractNamedReference = new AbstractNamedReferenceImpl();
      return abstractNamedReference;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NamespaceReference createNamespaceReference() {
      NamespaceReferenceImpl namespaceReference = new NamespaceReferenceImpl();
      return namespaceReference;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Variable createVariable() {
      VariableImpl variable = new VariableImpl();
      return variable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Atom createAtom() {
      AtomImpl atom = new AtomImpl();
      return atom;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Unary createUnary() {
      UnaryImpl unary = new UnaryImpl();
      return unary;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Power createPower() {
      PowerImpl power = new PowerImpl();
      return power;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Product createProduct() {
      ProductImpl product = new ProductImpl();
      return product;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Term createTerm() {
      TermImpl term = new TermImpl();
      return term;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Comparison createComparison() {
      ComparisonImpl comparison = new ComparisonImpl();
      return comparison;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BooleanExpression createBooleanExpression() {
      BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
      return booleanExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public IfElse createIfElse() {
      IfElseImpl ifElse = new IfElseImpl();
      return ifElse;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Expression createExpression() {
      ExpressionImpl expression = new ExpressionImpl();
      return expression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TermExpression createTermExpression() {
      TermExpressionImpl termExpression = new TermExpressionImpl();
      return termExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProductExpression createProductExpression() {
      ProductExpressionImpl productExpression = new ProductExpressionImpl();
      return productExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProbabilityFunctionLiteral createProbabilityFunctionLiteral() {
      ProbabilityFunctionLiteralImpl probabilityFunctionLiteral = new ProbabilityFunctionLiteralImpl();
      return probabilityFunctionLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parenthesis createParenthesis() {
      ParenthesisImpl parenthesis = new ParenthesisImpl();
      return parenthesis;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NumericLiteral createNumericLiteral() {
      NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
      return numericLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public IntLiteral createIntLiteral() {
      IntLiteralImpl intLiteral = new IntLiteralImpl();
      return intLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DoubleLiteral createDoubleLiteral() {
      DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
      return doubleLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompareExpression createCompareExpression() {
      CompareExpressionImpl compareExpression = new CompareExpressionImpl();
      return compareExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BoolLiteral createBoolLiteral() {
      BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
      return boolLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StringLiteral createStringLiteral() {
      StringLiteralImpl stringLiteral = new StringLiteralImpl();
      return stringLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PowerExpression createPowerExpression() {
      PowerExpressionImpl powerExpression = new PowerExpressionImpl();
      return powerExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BooleanOperatorExpression createBooleanOperatorExpression() {
      BooleanOperatorExpressionImpl booleanOperatorExpression = new BooleanOperatorExpressionImpl();
      return booleanOperatorExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotExpression createNotExpression() {
      NotExpressionImpl notExpression = new NotExpressionImpl();
      return notExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NegativeExpression createNegativeExpression() {
      NegativeExpressionImpl negativeExpression = new NegativeExpressionImpl();
      return negativeExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public FunctionLiteral createFunctionLiteral() {
      FunctionLiteralImpl functionLiteral = new FunctionLiteralImpl();
      return functionLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public IfElseExpression createIfElseExpression() {
      IfElseExpressionImpl ifElseExpression = new IfElseExpressionImpl();
      return ifElseExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RandomVariable createRandomVariable() {
      RandomVariableImpl randomVariable = new RandomVariableImpl();
      return randomVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pointcut createPointcut() {
      PointcutImpl pointcut = new PointcutImpl();
      return pointcut;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Advice createAdvice() {
      AdviceImpl advice = new AdviceImpl();
      return advice;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GlobalScope createGlobalScope() {
      GlobalScopeImpl globalScope = new GlobalScopeImpl();
      return globalScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PerJoinPointScope createPerJoinPointScope() {
      PerJoinPointScopeImpl perJoinPointScope = new PerJoinPointScopeImpl();
      return perJoinPointScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TermOperations createTermOperationsFromString(EDataType eDataType, String initialValue) {
      TermOperations result = TermOperations.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertTermOperationsToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProductOperations createProductOperationsFromString(EDataType eDataType, String initialValue) {
      ProductOperations result = ProductOperations.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertProductOperationsToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompareOperations createCompareOperationsFromString(EDataType eDataType, String initialValue) {
      CompareOperations result = CompareOperations.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertCompareOperationsToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BooleanOperations createBooleanOperationsFromString(EDataType eDataType, String initialValue) {
      BooleanOperations result = BooleanOperations.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertBooleanOperationsToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Stoex_pc_avPackage getStoex_pc_avPackage() {
      return (Stoex_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Stoex_pc_avPackage getPackage() {
      return Stoex_pc_avPackage.eINSTANCE;
   }

} //Stoex_pc_avFactoryImpl
