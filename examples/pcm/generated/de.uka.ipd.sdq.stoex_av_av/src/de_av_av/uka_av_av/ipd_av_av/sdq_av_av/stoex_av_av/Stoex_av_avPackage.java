/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.Units_av_avPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avFactory
 * @model kind="package"
 * @generated
 */
public interface Stoex_av_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "stoex_av_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/StochasticExpressions/1.0_advice_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "stoex_av_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Stoex_av_avPackage eINSTANCE = de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AbstractNamedReferenceImpl <em>Abstract Named Reference</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AbstractNamedReferenceImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getAbstractNamedReference()
    * @generated
    */
   int ABSTRACT_NAMED_REFERENCE = 1;

   /**
    * The feature id for the '<em><b>Reference Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME = 0;

   /**
    * The number of structural features of the '<em>Abstract Named Reference</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_NAMED_REFERENCE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.VariableReferenceImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getVariableReference()
    * @generated
    */
   int VARIABLE_REFERENCE = 0;

   /**
    * The feature id for the '<em><b>Reference Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE__REFERENCE_NAME = ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME;

   /**
    * The number of structural features of the '<em>Variable Reference</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE_FEATURE_COUNT = ABSTRACT_NAMED_REFERENCE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NamespaceReferenceImpl <em>Namespace Reference</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NamespaceReferenceImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getNamespaceReference()
    * @generated
    */
   int NAMESPACE_REFERENCE = 2;

   /**
    * The feature id for the '<em><b>Reference Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMESPACE_REFERENCE__REFERENCE_NAME = ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME;

   /**
    * The feature id for the '<em><b>Inner Reference Namespace Reference</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE = ABSTRACT_NAMED_REFERENCE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Namespace Reference</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMESPACE_REFERENCE_FEATURE_COUNT = ABSTRACT_NAMED_REFERENCE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ExpressionImpl <em>Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getExpression()
    * @generated
    */
   int EXPRESSION = 12;

   /**
    * The number of structural features of the '<em>Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IfElseImpl <em>If Else</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IfElseImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getIfElse()
    * @generated
    */
   int IF_ELSE = 11;

   /**
    * The number of structural features of the '<em>If Else</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_ELSE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BooleanExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getBooleanExpression()
    * @generated
    */
   int BOOLEAN_EXPRESSION = 10;

   /**
    * The number of structural features of the '<em>Boolean Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOOLEAN_EXPRESSION_FEATURE_COUNT = IF_ELSE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ComparisonImpl <em>Comparison</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ComparisonImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getComparison()
    * @generated
    */
   int COMPARISON = 9;

   /**
    * The number of structural features of the '<em>Comparison</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.TermImpl <em>Term</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.TermImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getTerm()
    * @generated
    */
   int TERM = 8;

   /**
    * The number of structural features of the '<em>Term</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TERM_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProductImpl <em>Product</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProductImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getProduct()
    * @generated
    */
   int PRODUCT = 7;

   /**
    * The number of structural features of the '<em>Product</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRODUCT_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PowerImpl <em>Power</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PowerImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getPower()
    * @generated
    */
   int POWER = 6;

   /**
    * The number of structural features of the '<em>Power</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POWER_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.UnaryImpl <em>Unary</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.UnaryImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getUnary()
    * @generated
    */
   int UNARY = 5;

   /**
    * The number of structural features of the '<em>Unary</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNARY_FEATURE_COUNT = POWER_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AtomImpl <em>Atom</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AtomImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getAtom()
    * @generated
    */
   int ATOM = 4;

   /**
    * The number of structural features of the '<em>Atom</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ATOM_FEATURE_COUNT = UNARY_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.VariableImpl <em>Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.VariableImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getVariable()
    * @generated
    */
   int VARIABLE = 3;

   /**
    * The feature id for the '<em><b>Id Variable</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE__ID_VARIABLE = ATOM_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.TermExpressionImpl <em>Term Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.TermExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getTermExpression()
    * @generated
    */
   int TERM_EXPRESSION = 13;

   /**
    * The feature id for the '<em><b>Left</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TERM_EXPRESSION__LEFT = TERM_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Right</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TERM_EXPRESSION__RIGHT = TERM_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Operation</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TERM_EXPRESSION__OPERATION = TERM_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Term Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TERM_EXPRESSION_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProductExpressionImpl <em>Product Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProductExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getProductExpression()
    * @generated
    */
   int PRODUCT_EXPRESSION = 14;

   /**
    * The feature id for the '<em><b>Left</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRODUCT_EXPRESSION__LEFT = PRODUCT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Right</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRODUCT_EXPRESSION__RIGHT = PRODUCT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Operation</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRODUCT_EXPRESSION__OPERATION = PRODUCT_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Product Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRODUCT_EXPRESSION_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProbabilityFunctionLiteralImpl <em>Probability Function Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProbabilityFunctionLiteralImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getProbabilityFunctionLiteral()
    * @generated
    */
   int PROBABILITY_FUNCTION_LITERAL = 15;

   /**
    * The feature id for the '<em><b>Function Probability Function Literal</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_FUNCTION_LITERAL__FUNCTION_PROBABILITY_FUNCTION_LITERAL = ATOM_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Probability Function Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_FUNCTION_LITERAL_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ParenthesisImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getParenthesis()
    * @generated
    */
   int PARENTHESIS = 16;

   /**
    * The feature id for the '<em><b>Inner Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARENTHESIS__INNER_EXPRESSION = ATOM_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Parenthesis</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARENTHESIS_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NumericLiteralImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getNumericLiteral()
    * @generated
    */
   int NUMERIC_LITERAL = 17;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NUMERIC_LITERAL__UNIT = Units_av_avPackage.UNIT_CARRYING_ELEMENT__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NUMERIC_LITERAL__UNIT_SPECIFICATION = Units_av_avPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION;

   /**
    * The number of structural features of the '<em>Numeric Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NUMERIC_LITERAL_FEATURE_COUNT = Units_av_avPackage.UNIT_CARRYING_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IntLiteralImpl <em>Int Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IntLiteralImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getIntLiteral()
    * @generated
    */
   int INT_LITERAL = 18;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INT_LITERAL__UNIT = NUMERIC_LITERAL__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INT_LITERAL__UNIT_SPECIFICATION = NUMERIC_LITERAL__UNIT_SPECIFICATION;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INT_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Int Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INT_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.DoubleLiteralImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getDoubleLiteral()
    * @generated
    */
   int DOUBLE_LITERAL = 19;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DOUBLE_LITERAL__UNIT = NUMERIC_LITERAL__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DOUBLE_LITERAL__UNIT_SPECIFICATION = NUMERIC_LITERAL__UNIT_SPECIFICATION;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DOUBLE_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Double Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DOUBLE_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.CompareExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getCompareExpression()
    * @generated
    */
   int COMPARE_EXPRESSION = 20;

   /**
    * The feature id for the '<em><b>Left</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARE_EXPRESSION__LEFT = COMPARISON_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Right</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARE_EXPRESSION__RIGHT = COMPARISON_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Operation</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARE_EXPRESSION__OPERATION = COMPARISON_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Compare Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARE_EXPRESSION_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BoolLiteralImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getBoolLiteral()
    * @generated
    */
   int BOOL_LITERAL = 21;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOOL_LITERAL__VALUE = ATOM_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Bool Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOOL_LITERAL_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.StringLiteralImpl <em>String Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.StringLiteralImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getStringLiteral()
    * @generated
    */
   int STRING_LITERAL = 22;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRING_LITERAL__VALUE = ATOM_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>String Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRING_LITERAL_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PowerExpressionImpl <em>Power Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PowerExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getPowerExpression()
    * @generated
    */
   int POWER_EXPRESSION = 23;

   /**
    * The feature id for the '<em><b>Base</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POWER_EXPRESSION__BASE = POWER_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Exponent</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POWER_EXPRESSION__EXPONENT = POWER_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Power Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POWER_EXPRESSION_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BooleanOperatorExpressionImpl <em>Boolean Operator Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BooleanOperatorExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getBooleanOperatorExpression()
    * @generated
    */
   int BOOLEAN_OPERATOR_EXPRESSION = 24;

   /**
    * The feature id for the '<em><b>Left</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOOLEAN_OPERATOR_EXPRESSION__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Right</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOOLEAN_OPERATOR_EXPRESSION__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Operation</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOOLEAN_OPERATOR_EXPRESSION__OPERATION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Boolean Operator Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOOLEAN_OPERATOR_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NotExpressionImpl <em>Not Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NotExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getNotExpression()
    * @generated
    */
   int NOT_EXPRESSION = 25;

   /**
    * The feature id for the '<em><b>Inner</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION__INNER = UNARY_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Not Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION_FEATURE_COUNT = UNARY_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NegativeExpressionImpl <em>Negative Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NegativeExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getNegativeExpression()
    * @generated
    */
   int NEGATIVE_EXPRESSION = 26;

   /**
    * The feature id for the '<em><b>Inner</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NEGATIVE_EXPRESSION__INNER = UNARY_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Negative Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NEGATIVE_EXPRESSION_FEATURE_COUNT = UNARY_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.FunctionLiteralImpl <em>Function Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.FunctionLiteralImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getFunctionLiteral()
    * @generated
    */
   int FUNCTION_LITERAL = 27;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FUNCTION_LITERAL__ID = ATOM_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Parameters Function Literal</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL = ATOM_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Function Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FUNCTION_LITERAL_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IfElseExpressionImpl <em>If Else Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IfElseExpressionImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getIfElseExpression()
    * @generated
    */
   int IF_ELSE_EXPRESSION = 28;

   /**
    * The feature id for the '<em><b>If Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_ELSE_EXPRESSION__IF_EXPRESSION = IF_ELSE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_ELSE_EXPRESSION__ELSE_EXPRESSION = IF_ELSE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_ELSE_EXPRESSION__CONDITION_EXPRESSION = IF_ELSE_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>If Else Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_ELSE_EXPRESSION_FEATURE_COUNT = IF_ELSE_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.RandomVariableImpl <em>Random Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.RandomVariableImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getRandomVariable()
    * @generated
    */
   int RANDOM_VARIABLE = 29;

   /**
    * The feature id for the '<em><b>Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RANDOM_VARIABLE__SPECIFICATION = 0;

   /**
    * The feature id for the '<em><b>Expression</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RANDOM_VARIABLE__EXPRESSION = 1;

   /**
    * The number of structural features of the '<em>Random Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RANDOM_VARIABLE_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AdviceAdviceImpl <em>Advice Advice</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AdviceAdviceImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getAdviceAdvice()
    * @generated
    */
   int ADVICE_ADVICE = 30;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ADVICE_ADVICE__CHILDREN = 0;

   /**
    * The number of structural features of the '<em>Advice Advice</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ADVICE_ADVICE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.GlobalScopeGlobalScopeImpl <em>Global Scope Global Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.GlobalScopeGlobalScopeImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getGlobalScopeGlobalScope()
    * @generated
    */
   int GLOBAL_SCOPE_GLOBAL_SCOPE = 31;

   /**
    * The feature id for the '<em><b>Scoped Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GLOBAL_SCOPE_GLOBAL_SCOPE__SCOPED_OBJECT = 0;

   /**
    * The number of structural features of the '<em>Global Scope Global Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GLOBAL_SCOPE_GLOBAL_SCOPE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PerJoinPointScopePerJoinPointScopeImpl <em>Per Join Point Scope Per Join Point Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PerJoinPointScopePerJoinPointScopeImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getPerJoinPointScopePerJoinPointScope()
    * @generated
    */
   int PER_JOIN_POINT_SCOPE_PER_JOIN_POINT_SCOPE = 32;

   /**
    * The feature id for the '<em><b>Scoped Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PER_JOIN_POINT_SCOPE_PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = 0;

   /**
    * The number of structural features of the '<em>Per Join Point Scope Per Join Point Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PER_JOIN_POINT_SCOPE_PER_JOIN_POINT_SCOPE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AdviceImpl <em>Advice</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AdviceImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getAdvice()
    * @generated
    */
   int ADVICE = 33;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ADVICE__CHILDREN = 0;

   /**
    * The number of structural features of the '<em>Advice</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ADVICE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.GlobalScopeImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getGlobalScope()
    * @generated
    */
   int GLOBAL_SCOPE = 34;

   /**
    * The feature id for the '<em><b>Scoped Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GLOBAL_SCOPE__SCOPED_OBJECT = 0;

   /**
    * The number of structural features of the '<em>Global Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GLOBAL_SCOPE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PerJoinPointScopeImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getPerJoinPointScope()
    * @generated
    */
   int PER_JOIN_POINT_SCOPE = 35;

   /**
    * The feature id for the '<em><b>Scoped Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = 0;

   /**
    * The number of structural features of the '<em>Per Join Point Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PER_JOIN_POINT_SCOPE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermOperations <em>Term Operations</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermOperations
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getTermOperations()
    * @generated
    */
   int TERM_OPERATIONS = 36;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductOperations <em>Product Operations</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductOperations
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getProductOperations()
    * @generated
    */
   int PRODUCT_OPERATIONS = 37;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareOperations <em>Compare Operations</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareOperations
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getCompareOperations()
    * @generated
    */
   int COMPARE_OPERATIONS = 38;

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperations <em>Boolean Operations</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperations
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getBooleanOperations()
    * @generated
    */
   int BOOLEAN_OPERATIONS = 39;


   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.VariableReference <em>Variable Reference</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Variable Reference</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.VariableReference
    * @generated
    */
   EClass getVariableReference();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.AbstractNamedReference <em>Abstract Named Reference</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Abstract Named Reference</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.AbstractNamedReference
    * @generated
    */
   EClass getAbstractNamedReference();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.AbstractNamedReference#getReferenceName <em>Reference Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Reference Name</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.AbstractNamedReference#getReferenceName()
    * @see #getAbstractNamedReference()
    * @generated
    */
   EAttribute getAbstractNamedReference_ReferenceName();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NamespaceReference <em>Namespace Reference</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Namespace Reference</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NamespaceReference
    * @generated
    */
   EClass getNamespaceReference();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NamespaceReference#getInnerReference_NamespaceReference <em>Inner Reference Namespace Reference</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Inner Reference Namespace Reference</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NamespaceReference#getInnerReference_NamespaceReference()
    * @see #getNamespaceReference()
    * @generated
    */
   EReference getNamespaceReference_InnerReference_NamespaceReference();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Variable <em>Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Variable</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Variable
    * @generated
    */
   EClass getVariable();

   /**
    * Returns the meta object for the reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Variable#getId_Variable <em>Id Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Id Variable</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Variable#getId_Variable()
    * @see #getVariable()
    * @generated
    */
   EReference getVariable_Id_Variable();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Atom <em>Atom</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Atom</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Atom
    * @generated
    */
   EClass getAtom();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Unary <em>Unary</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unary</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Unary
    * @generated
    */
   EClass getUnary();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Power <em>Power</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Power</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Power
    * @generated
    */
   EClass getPower();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Product <em>Product</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Product</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Product
    * @generated
    */
   EClass getProduct();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Term <em>Term</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Term</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Term
    * @generated
    */
   EClass getTerm();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Comparison <em>Comparison</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Comparison</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Comparison
    * @generated
    */
   EClass getComparison();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanExpression <em>Boolean Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Boolean Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanExpression
    * @generated
    */
   EClass getBooleanExpression();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElse <em>If Else</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>If Else</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElse
    * @generated
    */
   EClass getIfElse();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Expression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Expression
    * @generated
    */
   EClass getExpression();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermExpression <em>Term Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Term Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermExpression
    * @generated
    */
   EClass getTermExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermExpression#getLeft <em>Left</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Left</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermExpression#getLeft()
    * @see #getTermExpression()
    * @generated
    */
   EReference getTermExpression_Left();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermExpression#getRight <em>Right</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Right</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermExpression#getRight()
    * @see #getTermExpression()
    * @generated
    */
   EReference getTermExpression_Right();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermExpression#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermExpression#getOperation()
    * @see #getTermExpression()
    * @generated
    */
   EAttribute getTermExpression_Operation();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression <em>Product Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Product Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression
    * @generated
    */
   EClass getProductExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getLeft <em>Left</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Left</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getLeft()
    * @see #getProductExpression()
    * @generated
    */
   EReference getProductExpression_Left();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getRight <em>Right</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Right</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getRight()
    * @see #getProductExpression()
    * @generated
    */
   EReference getProductExpression_Right();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getOperation()
    * @see #getProductExpression()
    * @generated
    */
   EAttribute getProductExpression_Operation();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProbabilityFunctionLiteral <em>Probability Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Probability Function Literal</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProbabilityFunctionLiteral
    * @generated
    */
   EClass getProbabilityFunctionLiteral();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProbabilityFunctionLiteral#getFunction_ProbabilityFunctionLiteral <em>Function Probability Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Function Probability Function Literal</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProbabilityFunctionLiteral#getFunction_ProbabilityFunctionLiteral()
    * @see #getProbabilityFunctionLiteral()
    * @generated
    */
   EReference getProbabilityFunctionLiteral_Function_ProbabilityFunctionLiteral();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Parenthesis <em>Parenthesis</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Parenthesis</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Parenthesis
    * @generated
    */
   EClass getParenthesis();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Parenthesis#getInnerExpression <em>Inner Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Inner Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Parenthesis#getInnerExpression()
    * @see #getParenthesis()
    * @generated
    */
   EReference getParenthesis_InnerExpression();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NumericLiteral <em>Numeric Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Numeric Literal</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NumericLiteral
    * @generated
    */
   EClass getNumericLiteral();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IntLiteral <em>Int Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Int Literal</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IntLiteral
    * @generated
    */
   EClass getIntLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IntLiteral#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IntLiteral#getValue()
    * @see #getIntLiteral()
    * @generated
    */
   EAttribute getIntLiteral_Value();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.DoubleLiteral <em>Double Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Double Literal</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.DoubleLiteral
    * @generated
    */
   EClass getDoubleLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.DoubleLiteral#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.DoubleLiteral#getValue()
    * @see #getDoubleLiteral()
    * @generated
    */
   EAttribute getDoubleLiteral_Value();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareExpression <em>Compare Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Compare Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareExpression
    * @generated
    */
   EClass getCompareExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareExpression#getLeft <em>Left</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Left</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareExpression#getLeft()
    * @see #getCompareExpression()
    * @generated
    */
   EReference getCompareExpression_Left();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareExpression#getRight <em>Right</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Right</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareExpression#getRight()
    * @see #getCompareExpression()
    * @generated
    */
   EReference getCompareExpression_Right();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareExpression#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareExpression#getOperation()
    * @see #getCompareExpression()
    * @generated
    */
   EAttribute getCompareExpression_Operation();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BoolLiteral <em>Bool Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Bool Literal</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BoolLiteral
    * @generated
    */
   EClass getBoolLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BoolLiteral#isValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BoolLiteral#isValue()
    * @see #getBoolLiteral()
    * @generated
    */
   EAttribute getBoolLiteral_Value();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.StringLiteral <em>String Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>String Literal</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.StringLiteral
    * @generated
    */
   EClass getStringLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.StringLiteral#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.StringLiteral#getValue()
    * @see #getStringLiteral()
    * @generated
    */
   EAttribute getStringLiteral_Value();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PowerExpression <em>Power Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Power Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PowerExpression
    * @generated
    */
   EClass getPowerExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PowerExpression#getBase <em>Base</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Base</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PowerExpression#getBase()
    * @see #getPowerExpression()
    * @generated
    */
   EReference getPowerExpression_Base();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PowerExpression#getExponent <em>Exponent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Exponent</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PowerExpression#getExponent()
    * @see #getPowerExpression()
    * @generated
    */
   EReference getPowerExpression_Exponent();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperatorExpression <em>Boolean Operator Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Boolean Operator Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperatorExpression
    * @generated
    */
   EClass getBooleanOperatorExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperatorExpression#getLeft <em>Left</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Left</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperatorExpression#getLeft()
    * @see #getBooleanOperatorExpression()
    * @generated
    */
   EReference getBooleanOperatorExpression_Left();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperatorExpression#getRight <em>Right</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Right</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperatorExpression#getRight()
    * @see #getBooleanOperatorExpression()
    * @generated
    */
   EReference getBooleanOperatorExpression_Right();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperatorExpression#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperatorExpression#getOperation()
    * @see #getBooleanOperatorExpression()
    * @generated
    */
   EAttribute getBooleanOperatorExpression_Operation();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NotExpression <em>Not Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Not Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NotExpression
    * @generated
    */
   EClass getNotExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NotExpression#getInner <em>Inner</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Inner</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NotExpression#getInner()
    * @see #getNotExpression()
    * @generated
    */
   EReference getNotExpression_Inner();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NegativeExpression <em>Negative Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Negative Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NegativeExpression
    * @generated
    */
   EClass getNegativeExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NegativeExpression#getInner <em>Inner</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Inner</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NegativeExpression#getInner()
    * @see #getNegativeExpression()
    * @generated
    */
   EReference getNegativeExpression_Inner();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.FunctionLiteral <em>Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Function Literal</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.FunctionLiteral
    * @generated
    */
   EClass getFunctionLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.FunctionLiteral#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.FunctionLiteral#getId()
    * @see #getFunctionLiteral()
    * @generated
    */
   EAttribute getFunctionLiteral_Id();

   /**
    * Returns the meta object for the containment reference list '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.FunctionLiteral#getParameters_FunctionLiteral <em>Parameters Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Parameters Function Literal</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.FunctionLiteral#getParameters_FunctionLiteral()
    * @see #getFunctionLiteral()
    * @generated
    */
   EReference getFunctionLiteral_Parameters_FunctionLiteral();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElseExpression <em>If Else Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>If Else Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElseExpression
    * @generated
    */
   EClass getIfElseExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElseExpression#getIfExpression <em>If Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>If Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElseExpression#getIfExpression()
    * @see #getIfElseExpression()
    * @generated
    */
   EReference getIfElseExpression_IfExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElseExpression#getElseExpression <em>Else Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Else Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElseExpression#getElseExpression()
    * @see #getIfElseExpression()
    * @generated
    */
   EReference getIfElseExpression_ElseExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElseExpression#getConditionExpression <em>Condition Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Condition Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.IfElseExpression#getConditionExpression()
    * @see #getIfElseExpression()
    * @generated
    */
   EReference getIfElseExpression_ConditionExpression();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.RandomVariable <em>Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Random Variable</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.RandomVariable
    * @generated
    */
   EClass getRandomVariable();

   /**
    * Returns the meta object for the attribute '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.RandomVariable#getSpecification <em>Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Specification</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.RandomVariable#getSpecification()
    * @see #getRandomVariable()
    * @generated
    */
   EAttribute getRandomVariable_Specification();

   /**
    * Returns the meta object for the reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.RandomVariable#getExpression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Expression</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.RandomVariable#getExpression()
    * @see #getRandomVariable()
    * @generated
    */
   EReference getRandomVariable_Expression();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.AdviceAdvice <em>Advice Advice</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Advice Advice</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.AdviceAdvice
    * @generated
    */
   EClass getAdviceAdvice();

   /**
    * Returns the meta object for the containment reference list '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.AdviceAdvice#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.AdviceAdvice#getChildren()
    * @see #getAdviceAdvice()
    * @generated
    */
   EReference getAdviceAdvice_Children();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.GlobalScopeGlobalScope <em>Global Scope Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Global Scope Global Scope</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.GlobalScopeGlobalScope
    * @generated
    */
   EClass getGlobalScopeGlobalScope();

   /**
    * Returns the meta object for the reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.GlobalScopeGlobalScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.GlobalScopeGlobalScope#getScopedObject()
    * @see #getGlobalScopeGlobalScope()
    * @generated
    */
   EReference getGlobalScopeGlobalScope_ScopedObject();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PerJoinPointScopePerJoinPointScope <em>Per Join Point Scope Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Per Join Point Scope Per Join Point Scope</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PerJoinPointScopePerJoinPointScope
    * @generated
    */
   EClass getPerJoinPointScopePerJoinPointScope();

   /**
    * Returns the meta object for the reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PerJoinPointScopePerJoinPointScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PerJoinPointScopePerJoinPointScope#getScopedObject()
    * @see #getPerJoinPointScopePerJoinPointScope()
    * @generated
    */
   EReference getPerJoinPointScopePerJoinPointScope_ScopedObject();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Advice <em>Advice</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Advice</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Advice
    * @generated
    */
   EClass getAdvice();

   /**
    * Returns the meta object for the containment reference list '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Advice#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Advice#getChildren()
    * @see #getAdvice()
    * @generated
    */
   EReference getAdvice_Children();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.GlobalScope <em>Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Global Scope</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.GlobalScope
    * @generated
    */
   EClass getGlobalScope();

   /**
    * Returns the meta object for the reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.GlobalScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.GlobalScope#getScopedObject()
    * @see #getGlobalScope()
    * @generated
    */
   EReference getGlobalScope_ScopedObject();

   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PerJoinPointScope <em>Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Per Join Point Scope</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PerJoinPointScope
    * @generated
    */
   EClass getPerJoinPointScope();

   /**
    * Returns the meta object for the reference '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PerJoinPointScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.PerJoinPointScope#getScopedObject()
    * @see #getPerJoinPointScope()
    * @generated
    */
   EReference getPerJoinPointScope_ScopedObject();

   /**
    * Returns the meta object for enum '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermOperations <em>Term Operations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Term Operations</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermOperations
    * @generated
    */
   EEnum getTermOperations();

   /**
    * Returns the meta object for enum '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductOperations <em>Product Operations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Product Operations</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductOperations
    * @generated
    */
   EEnum getProductOperations();

   /**
    * Returns the meta object for enum '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareOperations <em>Compare Operations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Compare Operations</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareOperations
    * @generated
    */
   EEnum getCompareOperations();

   /**
    * Returns the meta object for enum '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperations <em>Boolean Operations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Boolean Operations</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperations
    * @generated
    */
   EEnum getBooleanOperations();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Stoex_av_avFactory getStoex_av_avFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.VariableReferenceImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getVariableReference()
       * @generated
       */
      EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AbstractNamedReferenceImpl <em>Abstract Named Reference</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AbstractNamedReferenceImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getAbstractNamedReference()
       * @generated
       */
      EClass ABSTRACT_NAMED_REFERENCE = eINSTANCE.getAbstractNamedReference();

      /**
       * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME = eINSTANCE.getAbstractNamedReference_ReferenceName();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NamespaceReferenceImpl <em>Namespace Reference</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NamespaceReferenceImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getNamespaceReference()
       * @generated
       */
      EClass NAMESPACE_REFERENCE = eINSTANCE.getNamespaceReference();

      /**
       * The meta object literal for the '<em><b>Inner Reference Namespace Reference</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE = eINSTANCE.getNamespaceReference_InnerReference_NamespaceReference();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.VariableImpl <em>Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.VariableImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getVariable()
       * @generated
       */
      EClass VARIABLE = eINSTANCE.getVariable();

      /**
       * The meta object literal for the '<em><b>Id Variable</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VARIABLE__ID_VARIABLE = eINSTANCE.getVariable_Id_Variable();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AtomImpl <em>Atom</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AtomImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getAtom()
       * @generated
       */
      EClass ATOM = eINSTANCE.getAtom();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.UnaryImpl <em>Unary</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.UnaryImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getUnary()
       * @generated
       */
      EClass UNARY = eINSTANCE.getUnary();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PowerImpl <em>Power</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PowerImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getPower()
       * @generated
       */
      EClass POWER = eINSTANCE.getPower();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProductImpl <em>Product</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProductImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getProduct()
       * @generated
       */
      EClass PRODUCT = eINSTANCE.getProduct();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.TermImpl <em>Term</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.TermImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getTerm()
       * @generated
       */
      EClass TERM = eINSTANCE.getTerm();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ComparisonImpl <em>Comparison</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ComparisonImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getComparison()
       * @generated
       */
      EClass COMPARISON = eINSTANCE.getComparison();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BooleanExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getBooleanExpression()
       * @generated
       */
      EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IfElseImpl <em>If Else</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IfElseImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getIfElse()
       * @generated
       */
      EClass IF_ELSE = eINSTANCE.getIfElse();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ExpressionImpl <em>Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getExpression()
       * @generated
       */
      EClass EXPRESSION = eINSTANCE.getExpression();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.TermExpressionImpl <em>Term Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.TermExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getTermExpression()
       * @generated
       */
      EClass TERM_EXPRESSION = eINSTANCE.getTermExpression();

      /**
       * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TERM_EXPRESSION__LEFT = eINSTANCE.getTermExpression_Left();

      /**
       * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TERM_EXPRESSION__RIGHT = eINSTANCE.getTermExpression_Right();

      /**
       * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute TERM_EXPRESSION__OPERATION = eINSTANCE.getTermExpression_Operation();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProductExpressionImpl <em>Product Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProductExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getProductExpression()
       * @generated
       */
      EClass PRODUCT_EXPRESSION = eINSTANCE.getProductExpression();

      /**
       * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PRODUCT_EXPRESSION__LEFT = eINSTANCE.getProductExpression_Left();

      /**
       * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PRODUCT_EXPRESSION__RIGHT = eINSTANCE.getProductExpression_Right();

      /**
       * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PRODUCT_EXPRESSION__OPERATION = eINSTANCE.getProductExpression_Operation();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProbabilityFunctionLiteralImpl <em>Probability Function Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ProbabilityFunctionLiteralImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getProbabilityFunctionLiteral()
       * @generated
       */
      EClass PROBABILITY_FUNCTION_LITERAL = eINSTANCE.getProbabilityFunctionLiteral();

      /**
       * The meta object literal for the '<em><b>Function Probability Function Literal</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PROBABILITY_FUNCTION_LITERAL__FUNCTION_PROBABILITY_FUNCTION_LITERAL = eINSTANCE.getProbabilityFunctionLiteral_Function_ProbabilityFunctionLiteral();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.ParenthesisImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getParenthesis()
       * @generated
       */
      EClass PARENTHESIS = eINSTANCE.getParenthesis();

      /**
       * The meta object literal for the '<em><b>Inner Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARENTHESIS__INNER_EXPRESSION = eINSTANCE.getParenthesis_InnerExpression();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NumericLiteralImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getNumericLiteral()
       * @generated
       */
      EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IntLiteralImpl <em>Int Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IntLiteralImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getIntLiteral()
       * @generated
       */
      EClass INT_LITERAL = eINSTANCE.getIntLiteral();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.DoubleLiteralImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getDoubleLiteral()
       * @generated
       */
      EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.CompareExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getCompareExpression()
       * @generated
       */
      EClass COMPARE_EXPRESSION = eINSTANCE.getCompareExpression();

      /**
       * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPARE_EXPRESSION__LEFT = eINSTANCE.getCompareExpression_Left();

      /**
       * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPARE_EXPRESSION__RIGHT = eINSTANCE.getCompareExpression_Right();

      /**
       * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute COMPARE_EXPRESSION__OPERATION = eINSTANCE.getCompareExpression_Operation();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BoolLiteralImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getBoolLiteral()
       * @generated
       */
      EClass BOOL_LITERAL = eINSTANCE.getBoolLiteral();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute BOOL_LITERAL__VALUE = eINSTANCE.getBoolLiteral_Value();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.StringLiteralImpl <em>String Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.StringLiteralImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getStringLiteral()
       * @generated
       */
      EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PowerExpressionImpl <em>Power Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PowerExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getPowerExpression()
       * @generated
       */
      EClass POWER_EXPRESSION = eINSTANCE.getPowerExpression();

      /**
       * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference POWER_EXPRESSION__BASE = eINSTANCE.getPowerExpression_Base();

      /**
       * The meta object literal for the '<em><b>Exponent</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference POWER_EXPRESSION__EXPONENT = eINSTANCE.getPowerExpression_Exponent();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BooleanOperatorExpressionImpl <em>Boolean Operator Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.BooleanOperatorExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getBooleanOperatorExpression()
       * @generated
       */
      EClass BOOLEAN_OPERATOR_EXPRESSION = eINSTANCE.getBooleanOperatorExpression();

      /**
       * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference BOOLEAN_OPERATOR_EXPRESSION__LEFT = eINSTANCE.getBooleanOperatorExpression_Left();

      /**
       * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference BOOLEAN_OPERATOR_EXPRESSION__RIGHT = eINSTANCE.getBooleanOperatorExpression_Right();

      /**
       * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute BOOLEAN_OPERATOR_EXPRESSION__OPERATION = eINSTANCE.getBooleanOperatorExpression_Operation();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NotExpressionImpl <em>Not Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NotExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getNotExpression()
       * @generated
       */
      EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

      /**
       * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NOT_EXPRESSION__INNER = eINSTANCE.getNotExpression_Inner();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NegativeExpressionImpl <em>Negative Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NegativeExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getNegativeExpression()
       * @generated
       */
      EClass NEGATIVE_EXPRESSION = eINSTANCE.getNegativeExpression();

      /**
       * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NEGATIVE_EXPRESSION__INNER = eINSTANCE.getNegativeExpression_Inner();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.FunctionLiteralImpl <em>Function Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.FunctionLiteralImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getFunctionLiteral()
       * @generated
       */
      EClass FUNCTION_LITERAL = eINSTANCE.getFunctionLiteral();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute FUNCTION_LITERAL__ID = eINSTANCE.getFunctionLiteral_Id();

      /**
       * The meta object literal for the '<em><b>Parameters Function Literal</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference FUNCTION_LITERAL__PARAMETERS_FUNCTION_LITERAL = eINSTANCE.getFunctionLiteral_Parameters_FunctionLiteral();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IfElseExpressionImpl <em>If Else Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.IfElseExpressionImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getIfElseExpression()
       * @generated
       */
      EClass IF_ELSE_EXPRESSION = eINSTANCE.getIfElseExpression();

      /**
       * The meta object literal for the '<em><b>If Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference IF_ELSE_EXPRESSION__IF_EXPRESSION = eINSTANCE.getIfElseExpression_IfExpression();

      /**
       * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference IF_ELSE_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getIfElseExpression_ElseExpression();

      /**
       * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference IF_ELSE_EXPRESSION__CONDITION_EXPRESSION = eINSTANCE.getIfElseExpression_ConditionExpression();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.RandomVariableImpl <em>Random Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.RandomVariableImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getRandomVariable()
       * @generated
       */
      EClass RANDOM_VARIABLE = eINSTANCE.getRandomVariable();

      /**
       * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute RANDOM_VARIABLE__SPECIFICATION = eINSTANCE.getRandomVariable_Specification();

      /**
       * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RANDOM_VARIABLE__EXPRESSION = eINSTANCE.getRandomVariable_Expression();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AdviceAdviceImpl <em>Advice Advice</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AdviceAdviceImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getAdviceAdvice()
       * @generated
       */
      EClass ADVICE_ADVICE = eINSTANCE.getAdviceAdvice();

      /**
       * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ADVICE_ADVICE__CHILDREN = eINSTANCE.getAdviceAdvice_Children();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.GlobalScopeGlobalScopeImpl <em>Global Scope Global Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.GlobalScopeGlobalScopeImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getGlobalScopeGlobalScope()
       * @generated
       */
      EClass GLOBAL_SCOPE_GLOBAL_SCOPE = eINSTANCE.getGlobalScopeGlobalScope();

      /**
       * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference GLOBAL_SCOPE_GLOBAL_SCOPE__SCOPED_OBJECT = eINSTANCE.getGlobalScopeGlobalScope_ScopedObject();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PerJoinPointScopePerJoinPointScopeImpl <em>Per Join Point Scope Per Join Point Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PerJoinPointScopePerJoinPointScopeImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getPerJoinPointScopePerJoinPointScope()
       * @generated
       */
      EClass PER_JOIN_POINT_SCOPE_PER_JOIN_POINT_SCOPE = eINSTANCE.getPerJoinPointScopePerJoinPointScope();

      /**
       * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PER_JOIN_POINT_SCOPE_PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = eINSTANCE.getPerJoinPointScopePerJoinPointScope_ScopedObject();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AdviceImpl <em>Advice</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.AdviceImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getAdvice()
       * @generated
       */
      EClass ADVICE = eINSTANCE.getAdvice();

      /**
       * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ADVICE__CHILDREN = eINSTANCE.getAdvice_Children();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.GlobalScopeImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getGlobalScope()
       * @generated
       */
      EClass GLOBAL_SCOPE = eINSTANCE.getGlobalScope();

      /**
       * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference GLOBAL_SCOPE__SCOPED_OBJECT = eINSTANCE.getGlobalScope_ScopedObject();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.PerJoinPointScopeImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getPerJoinPointScope()
       * @generated
       */
      EClass PER_JOIN_POINT_SCOPE = eINSTANCE.getPerJoinPointScope();

      /**
       * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = eINSTANCE.getPerJoinPointScope_ScopedObject();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermOperations <em>Term Operations</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.TermOperations
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getTermOperations()
       * @generated
       */
      EEnum TERM_OPERATIONS = eINSTANCE.getTermOperations();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductOperations <em>Product Operations</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductOperations
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getProductOperations()
       * @generated
       */
      EEnum PRODUCT_OPERATIONS = eINSTANCE.getProductOperations();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareOperations <em>Compare Operations</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.CompareOperations
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getCompareOperations()
       * @generated
       */
      EEnum COMPARE_OPERATIONS = eINSTANCE.getCompareOperations();

      /**
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperations <em>Boolean Operations</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.BooleanOperations
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.Stoex_av_avPackageImpl#getBooleanOperations()
       * @generated
       */
      EEnum BOOLEAN_OPERATIONS = eINSTANCE.getBooleanOperations();

   }

} //Stoex_av_avPackage
