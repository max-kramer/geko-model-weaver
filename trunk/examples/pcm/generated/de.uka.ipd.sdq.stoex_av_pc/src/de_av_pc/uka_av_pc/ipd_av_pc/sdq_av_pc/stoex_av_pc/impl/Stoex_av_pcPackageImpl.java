/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.Probfunction_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.AbstractNamedReference;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Advice;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Atom;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.BoolLiteral;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.BooleanExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.BooleanOperations;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.BooleanOperatorExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.CompareExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.CompareOperations;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Comparison;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.DoubleLiteral;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Expression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.FunctionLiteral;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.GlobalScope;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IfElse;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IfElseExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IntLiteral;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.NamespaceReference;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.NegativeExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.NotExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.NumericLiteral;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Parenthesis;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.PerJoinPointScope;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Pointcut;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Power;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.PowerExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.ProbabilityFunctionLiteral;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Product;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.ProductExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.ProductOperations;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.RandomVariable;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcFactory;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.StringLiteral;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Term;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermOperations;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Unary;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Variable;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.VariableReference;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.Units_av_pcPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Stoex_av_pcPackageImpl extends EPackageImpl implements Stoex_av_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass variableReferenceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractNamedReferenceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass namespaceReferenceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass variableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass atomEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass unaryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass powerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass productEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass termEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass comparisonEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass booleanExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass ifElseEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass expressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass termExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass productExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass probabilityFunctionLiteralEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass parenthesisEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass numericLiteralEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass intLiteralEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass doubleLiteralEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass compareExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass boolLiteralEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass stringLiteralEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass powerExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass booleanOperatorExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass notExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass negativeExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass functionLiteralEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass ifElseExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass randomVariableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass adviceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass globalScopeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass perJoinPointScopeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass pointcutEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum termOperationsEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum productOperationsEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum compareOperationsEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum booleanOperationsEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Stoex_av_pcPackageImpl() {
      super(eNS_URI, Stoex_av_pcFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link Stoex_av_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Stoex_av_pcPackage init() {
      if (isInited) return (Stoex_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Stoex_av_pcPackage.eNS_URI);

      // Obtain or create and register package
      Stoex_av_pcPackageImpl theStoex_av_pcPackage = (Stoex_av_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Stoex_av_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Stoex_av_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Probfunction_av_pcPackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theStoex_av_pcPackage.createPackageContents();

      // Initialize created meta-data
      theStoex_av_pcPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theStoex_av_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Stoex_av_pcPackage.eNS_URI, theStoex_av_pcPackage);
      return theStoex_av_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getVariableReference() {
      return variableReferenceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractNamedReference() {
      return abstractNamedReferenceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAbstractNamedReference_ReferenceName() {
      return (EAttribute)abstractNamedReferenceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNamespaceReference() {
      return namespaceReferenceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNamespaceReference_InnerReference_NamespaceReference() {
      return (EReference)namespaceReferenceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getVariable() {
      return variableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariable_Id_Variable() {
      return (EReference)variableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAtom() {
      return atomEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUnary() {
      return unaryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPower() {
      return powerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProduct() {
      return productEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getTerm() {
      return termEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getComparison() {
      return comparisonEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBooleanExpression() {
      return booleanExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getIfElse() {
      return ifElseEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExpression() {
      return expressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getTermExpression() {
      return termExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getTermExpression_Left() {
      return (EReference)termExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getTermExpression_Right() {
      return (EReference)termExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getTermExpression_Operation() {
      return (EAttribute)termExpressionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProductExpression() {
      return productExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProductExpression_Left() {
      return (EReference)productExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProductExpression_Right() {
      return (EReference)productExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProductExpression_Operation() {
      return (EAttribute)productExpressionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProbabilityFunctionLiteral() {
      return probabilityFunctionLiteralEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProbabilityFunctionLiteral_Function_ProbabilityFunctionLiteral() {
      return (EReference)probabilityFunctionLiteralEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getParenthesis() {
      return parenthesisEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParenthesis_InnerExpression() {
      return (EReference)parenthesisEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNumericLiteral() {
      return numericLiteralEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getIntLiteral() {
      return intLiteralEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getIntLiteral_Value() {
      return (EAttribute)intLiteralEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDoubleLiteral() {
      return doubleLiteralEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getDoubleLiteral_Value() {
      return (EAttribute)doubleLiteralEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCompareExpression() {
      return compareExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCompareExpression_Left() {
      return (EReference)compareExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCompareExpression_Right() {
      return (EReference)compareExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCompareExpression_Operation() {
      return (EAttribute)compareExpressionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBoolLiteral() {
      return boolLiteralEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getBoolLiteral_Value() {
      return (EAttribute)boolLiteralEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getStringLiteral() {
      return stringLiteralEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getStringLiteral_Value() {
      return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPowerExpression() {
      return powerExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPowerExpression_Base() {
      return (EReference)powerExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPowerExpression_Exponent() {
      return (EReference)powerExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBooleanOperatorExpression() {
      return booleanOperatorExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBooleanOperatorExpression_Left() {
      return (EReference)booleanOperatorExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBooleanOperatorExpression_Right() {
      return (EReference)booleanOperatorExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getBooleanOperatorExpression_Operation() {
      return (EAttribute)booleanOperatorExpressionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNotExpression() {
      return notExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNotExpression_Inner() {
      return (EReference)notExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNegativeExpression() {
      return negativeExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNegativeExpression_Inner() {
      return (EReference)negativeExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getFunctionLiteral() {
      return functionLiteralEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getFunctionLiteral_Id() {
      return (EAttribute)functionLiteralEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getFunctionLiteral_Parameters_FunctionLiteral() {
      return (EReference)functionLiteralEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getIfElseExpression() {
      return ifElseExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getIfElseExpression_IfExpression() {
      return (EReference)ifElseExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getIfElseExpression_ElseExpression() {
      return (EReference)ifElseExpressionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getIfElseExpression_ConditionExpression() {
      return (EReference)ifElseExpressionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRandomVariable() {
      return randomVariableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRandomVariable_Specification() {
      return (EAttribute)randomVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRandomVariable_Expression() {
      return (EReference)randomVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAdvice() {
      return adviceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAdvice_Children() {
      return (EReference)adviceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getGlobalScope() {
      return globalScopeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getGlobalScope_ScopedObject() {
      return (EReference)globalScopeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPerJoinPointScope() {
      return perJoinPointScopeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPerJoinPointScope_ScopedObject() {
      return (EReference)perJoinPointScopeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPointcut() {
      return pointcutEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPointcut_Children() {
      return (EReference)pointcutEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getTermOperations() {
      return termOperationsEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getProductOperations() {
      return productOperationsEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getCompareOperations() {
      return compareOperationsEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getBooleanOperations() {
      return booleanOperationsEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Stoex_av_pcFactory getStoex_av_pcFactory() {
      return (Stoex_av_pcFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents() {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      variableReferenceEClass = createEClass(VARIABLE_REFERENCE);

      abstractNamedReferenceEClass = createEClass(ABSTRACT_NAMED_REFERENCE);
      createEAttribute(abstractNamedReferenceEClass, ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME);

      namespaceReferenceEClass = createEClass(NAMESPACE_REFERENCE);
      createEReference(namespaceReferenceEClass, NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE);

      variableEClass = createEClass(VARIABLE);
      createEReference(variableEClass, VARIABLE__ID_VARIABLE);

      atomEClass = createEClass(ATOM);

      unaryEClass = createEClass(UNARY);

      powerEClass = createEClass(POWER);

      productEClass = createEClass(PRODUCT);

      termEClass = createEClass(TERM);

      comparisonEClass = createEClass(COMPARISON);

      booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

      ifElseEClass = createEClass(IF_ELSE);

      expressionEClass = createEClass(EXPRESSION);

      termExpressionEClass = createEClass(TERM_EXPRESSION);
      createEReference(termExpressionEClass, TERM_EXPRESSION__LEFT);
      createEReference(termExpressionEClass, TERM_EXPRESSION__RIGHT);
      createEAttribute(termExpressionEClass, TERM_EXPRESSION__OPERATION);

      productExpressionEClass = createEClass(PRODUCT_EXPRESSION);
      createEReference(productExpressionEClass, PRODUCT_EXPRESSION__LEFT);
      createEReference(productExpressionEClass, PRODUCT_EXPRESSION__RIGHT);
      createEAttribute(productExpressionEClass, PRODUCT_EXPRESSION__OPERATION);

      probabilityFunctionLiteralEClass = createEClass(PROBABILITY_FUNCTION_LITERAL);
      createEReference(probabilityFunctionLiteralEClass, PROBABILITY_FUNCTION_LITERAL__FUNCTION_PROBABILITY_FUNCTION_LITERAL);

      parenthesisEClass = createEClass(PARENTHESIS);
      createEReference(parenthesisEClass, PARENTHESIS__INNER_EXPRESSION);

      numericLiteralEClass = createEClass(NUMERIC_LITERAL);

      intLiteralEClass = createEClass(INT_LITERAL);
      createEAttribute(intLiteralEClass, INT_LITERAL__VALUE);

      doubleLiteralEClass = createEClass(DOUBLE_LITERAL);
      createEAttribute(doubleLiteralEClass, DOUBLE_LITERAL__VALUE);

      compareExpressionEClass = createEClass(COMPARE_EXPRESSION);
      createEReference(compareExpressionEClass, COMPARE_EXPRESSION__LEFT);
      createEReference(compareExpressionEClass, COMPARE_EXPRESSION__RIGHT);
      createEAttribute(compareExpressionEClass, COMPARE_EXPRESSION__OPERATION);

      boolLiteralEClass = createEClass(BOOL_LITERAL);
      createEAttribute(boolLiteralEClass, BOOL_LITERAL__VALUE);

      stringLiteralEClass = createEClass(STRING_LITERAL);
      createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

      powerExpressionEClass = createEClass(POWER_EXPRESSION);
      createEReference(powerExpressionEClass, POWER_EXPRESSION__BASE);
      createEReference(powerExpressionEClass, POWER_EXPRESSION__EXPONENT);

      booleanOperatorExpressionEClass = createEClass(BOOLEAN_OPERATOR_EXPRESSION);
      createEReference(booleanOperatorExpressionEClass, BOOLEAN_OPERATOR_EXPRESSION__LEFT);
      createEReference(booleanOperatorExpressionEClass, BOOLEAN_OPERATOR_EXPRESSION__RIGHT);
      createEAttribute(booleanOperatorExpressionEClass, BOOLEAN_OPERATOR_EXPRESSION__OPERATION);

      notExpressionEClass = createEClass(NOT_EXPRESSION);
      createEReference(notExpressionEClass, NOT_EXPRESSION__INNER);

      negativeExpressionEClass = createEClass(NEGATIVE_EXPRESSION);
      createEReference(negativeExpressionEClass, NEGATIVE_EXPRESSION__INNER);

      functionLiteralEClass = createEClass(FUNCTION_LITERAL);
      createEAttribute(functionLiteralEClass, FUNCTION_LITERAL__ID);
      createEReference(functionLiteralEClass, FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL);

      ifElseExpressionEClass = createEClass(IF_ELSE_EXPRESSION);
      createEReference(ifElseExpressionEClass, IF_ELSE_EXPRESSION__IF_EXPRESSION);
      createEReference(ifElseExpressionEClass, IF_ELSE_EXPRESSION__ELSE_EXPRESSION);
      createEReference(ifElseExpressionEClass, IF_ELSE_EXPRESSION__CONDITION_EXPRESSION);

      randomVariableEClass = createEClass(RANDOM_VARIABLE);
      createEAttribute(randomVariableEClass, RANDOM_VARIABLE__SPECIFICATION);
      createEReference(randomVariableEClass, RANDOM_VARIABLE__EXPRESSION);

      adviceEClass = createEClass(ADVICE);
      createEReference(adviceEClass, ADVICE__CHILDREN);

      globalScopeEClass = createEClass(GLOBAL_SCOPE);
      createEReference(globalScopeEClass, GLOBAL_SCOPE__SCOPED_OBJECT);

      perJoinPointScopeEClass = createEClass(PER_JOIN_POINT_SCOPE);
      createEReference(perJoinPointScopeEClass, PER_JOIN_POINT_SCOPE__SCOPED_OBJECT);

      pointcutEClass = createEClass(POINTCUT);
      createEReference(pointcutEClass, POINTCUT__CHILDREN);

      // Create enums
      termOperationsEEnum = createEEnum(TERM_OPERATIONS);
      productOperationsEEnum = createEEnum(PRODUCT_OPERATIONS);
      compareOperationsEEnum = createEEnum(COMPARE_OPERATIONS);
      booleanOperationsEEnum = createEEnum(BOOLEAN_OPERATIONS);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents() {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      Probfunction_av_pcPackage theProbfunction_av_pcPackage = (Probfunction_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Probfunction_av_pcPackage.eNS_URI);
      Units_av_pcPackage theUnits_av_pcPackage = (Units_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Units_av_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      variableReferenceEClass.getESuperTypes().add(this.getAbstractNamedReference());
      namespaceReferenceEClass.getESuperTypes().add(this.getAbstractNamedReference());
      variableEClass.getESuperTypes().add(this.getAtom());
      atomEClass.getESuperTypes().add(this.getUnary());
      unaryEClass.getESuperTypes().add(this.getPower());
      powerEClass.getESuperTypes().add(this.getProduct());
      productEClass.getESuperTypes().add(this.getTerm());
      termEClass.getESuperTypes().add(this.getComparison());
      comparisonEClass.getESuperTypes().add(this.getBooleanExpression());
      booleanExpressionEClass.getESuperTypes().add(this.getIfElse());
      ifElseEClass.getESuperTypes().add(this.getExpression());
      termExpressionEClass.getESuperTypes().add(this.getTerm());
      productExpressionEClass.getESuperTypes().add(this.getProduct());
      probabilityFunctionLiteralEClass.getESuperTypes().add(this.getAtom());
      parenthesisEClass.getESuperTypes().add(this.getAtom());
      numericLiteralEClass.getESuperTypes().add(theUnits_av_pcPackage.getUnitCarryingElement());
      numericLiteralEClass.getESuperTypes().add(this.getAtom());
      intLiteralEClass.getESuperTypes().add(this.getNumericLiteral());
      doubleLiteralEClass.getESuperTypes().add(this.getNumericLiteral());
      compareExpressionEClass.getESuperTypes().add(this.getComparison());
      boolLiteralEClass.getESuperTypes().add(this.getAtom());
      stringLiteralEClass.getESuperTypes().add(this.getAtom());
      powerExpressionEClass.getESuperTypes().add(this.getPower());
      booleanOperatorExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
      notExpressionEClass.getESuperTypes().add(this.getUnary());
      negativeExpressionEClass.getESuperTypes().add(this.getUnary());
      functionLiteralEClass.getESuperTypes().add(this.getAtom());
      ifElseExpressionEClass.getESuperTypes().add(this.getIfElse());

      // Initialize classes and features; add operations and parameters
      initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(abstractNamedReferenceEClass, AbstractNamedReference.class, "AbstractNamedReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAbstractNamedReference_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 1, 1, AbstractNamedReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(namespaceReferenceEClass, NamespaceReference.class, "NamespaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getNamespaceReference_InnerReference_NamespaceReference(), this.getAbstractNamedReference(), null, "innerReference_NamespaceReference", null, 0, 1, NamespaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getVariable_Id_Variable(), this.getAbstractNamedReference(), null, "id_Variable", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(unaryEClass, Unary.class, "Unary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(powerEClass, Power.class, "Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(ifElseEClass, IfElse.class, "IfElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(termExpressionEClass, TermExpression.class, "TermExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getTermExpression_Left(), this.getTerm(), null, "left", null, 0, 1, TermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getTermExpression_Right(), this.getProduct(), null, "right", null, 0, 1, TermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getTermExpression_Operation(), this.getTermOperations(), "operation", null, 1, 1, TermExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(productExpressionEClass, ProductExpression.class, "ProductExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getProductExpression_Left(), this.getProduct(), null, "left", null, 0, 1, ProductExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProductExpression_Right(), this.getPower(), null, "right", null, 0, 1, ProductExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getProductExpression_Operation(), this.getProductOperations(), "operation", null, 1, 1, ProductExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(probabilityFunctionLiteralEClass, ProbabilityFunctionLiteral.class, "ProbabilityFunctionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getProbabilityFunctionLiteral_Function_ProbabilityFunctionLiteral(), theProbfunction_av_pcPackage.getProbabilityFunction(), null, "function_ProbabilityFunctionLiteral", null, 0, 1, ProbabilityFunctionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(parenthesisEClass, Parenthesis.class, "Parenthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getParenthesis_InnerExpression(), this.getExpression(), null, "innerExpression", null, 0, 1, Parenthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(intLiteralEClass, IntLiteral.class, "IntLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getIntLiteral_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(doubleLiteralEClass, DoubleLiteral.class, "DoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getDoubleLiteral_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(compareExpressionEClass, CompareExpression.class, "CompareExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCompareExpression_Left(), this.getTerm(), null, "left", null, 0, 1, CompareExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCompareExpression_Right(), this.getTerm(), null, "right", null, 0, 1, CompareExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getCompareExpression_Operation(), this.getCompareOperations(), "operation", null, 1, 1, CompareExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(boolLiteralEClass, BoolLiteral.class, "BoolLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getBoolLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BoolLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(powerExpressionEClass, PowerExpression.class, "PowerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPowerExpression_Base(), this.getPower(), null, "base", null, 0, 1, PowerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPowerExpression_Exponent(), this.getUnary(), null, "exponent", null, 0, 1, PowerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(booleanOperatorExpressionEClass, BooleanOperatorExpression.class, "BooleanOperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getBooleanOperatorExpression_Left(), this.getBooleanExpression(), null, "left", null, 0, 1, BooleanOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getBooleanOperatorExpression_Right(), this.getBooleanExpression(), null, "right", null, 0, 1, BooleanOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getBooleanOperatorExpression_Operation(), this.getBooleanOperations(), "operation", null, 1, 1, BooleanOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getNotExpression_Inner(), this.getUnary(), null, "inner", null, 0, 1, NotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(negativeExpressionEClass, NegativeExpression.class, "NegativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getNegativeExpression_Inner(), this.getUnary(), null, "inner", null, 0, 1, NegativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(functionLiteralEClass, FunctionLiteral.class, "FunctionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getFunctionLiteral_Id(), ecorePackage.getEString(), "id", null, 1, 1, FunctionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getFunctionLiteral_Parameters_FunctionLiteral(), this.getExpression(), null, "parameters_FunctionLiteral", null, 0, -1, FunctionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(ifElseExpressionEClass, IfElseExpression.class, "IfElseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getIfElseExpression_IfExpression(), this.getBooleanExpression(), null, "ifExpression", null, 0, 1, IfElseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getIfElseExpression_ElseExpression(), this.getBooleanExpression(), null, "elseExpression", null, 0, 1, IfElseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getIfElseExpression_ConditionExpression(), this.getBooleanExpression(), null, "conditionExpression", null, 0, 1, IfElseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(randomVariableEClass, RandomVariable.class, "RandomVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getRandomVariable_Specification(), ecorePackage.getEString(), "specification", null, 1, 1, RandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRandomVariable_Expression(), this.getExpression(), null, "expression", null, 0, 1, RandomVariable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

      initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAdvice_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(globalScopeEClass, GlobalScope.class, "GlobalScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getGlobalScope_ScopedObject(), ecorePackage.getEObject(), null, "scopedObject", null, 0, 1, GlobalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(perJoinPointScopeEClass, PerJoinPointScope.class, "PerJoinPointScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPerJoinPointScope_ScopedObject(), ecorePackage.getEObject(), null, "scopedObject", null, 0, 1, PerJoinPointScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPointcut_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(termOperationsEEnum, TermOperations.class, "TermOperations");
      addEEnumLiteral(termOperationsEEnum, TermOperations.ADD);
      addEEnumLiteral(termOperationsEEnum, TermOperations.SUB);

      initEEnum(productOperationsEEnum, ProductOperations.class, "ProductOperations");
      addEEnumLiteral(productOperationsEEnum, ProductOperations.MULT);
      addEEnumLiteral(productOperationsEEnum, ProductOperations.DIV);
      addEEnumLiteral(productOperationsEEnum, ProductOperations.MOD);

      initEEnum(compareOperationsEEnum, CompareOperations.class, "CompareOperations");
      addEEnumLiteral(compareOperationsEEnum, CompareOperations.GREATER);
      addEEnumLiteral(compareOperationsEEnum, CompareOperations.EQUALS);
      addEEnumLiteral(compareOperationsEEnum, CompareOperations.LESS);
      addEEnumLiteral(compareOperationsEEnum, CompareOperations.NOTEQUAL);
      addEEnumLiteral(compareOperationsEEnum, CompareOperations.LESSEQUAL);
      addEEnumLiteral(compareOperationsEEnum, CompareOperations.GREATEREQUAL);

      initEEnum(booleanOperationsEEnum, BooleanOperations.class, "BooleanOperations");
      addEEnumLiteral(booleanOperationsEEnum, BooleanOperations.AND);
      addEEnumLiteral(booleanOperationsEEnum, BooleanOperations.OR);
      addEEnumLiteral(booleanOperationsEEnum, BooleanOperations.XOR);

      // Create resource
      createResource(eNS_URI);

      // Create annotations
      // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
      createExtendedMetaDataAnnotations();
   }

   /**
    * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createExtendedMetaDataAnnotations() {
      String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
      addAnnotation
        (getRandomVariable_Expression(), 
         source, 
         new String[] {
          "name", "",
          "namespace", ""
         });	
   }

} //Stoex_av_pcPackageImpl
