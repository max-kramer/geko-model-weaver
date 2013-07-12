/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.Units_pc_pcPackage;

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
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Stoex_pc_pcFactory
 * @model kind="package"
 * @generated
 */
public interface Stoex_pc_pcPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "stoex_pc_pc";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/StochasticExpressions/1.0_pointcut_pointcut";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "stoex_pc_pc";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Stoex_pc_pcPackage eINSTANCE = de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.AbstractNamedReferenceImpl <em>Abstract Named Reference</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.AbstractNamedReferenceImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getAbstractNamedReference()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.VariableReferenceImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getVariableReference()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NamespaceReferenceImpl <em>Namespace Reference</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NamespaceReferenceImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getNamespaceReference()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ExpressionImpl <em>Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IfElseImpl <em>If Else</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IfElseImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getIfElse()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BooleanExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getBooleanExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ComparisonImpl <em>Comparison</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ComparisonImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getComparison()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermImpl <em>Term</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getTerm()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProductImpl <em>Product</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProductImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getProduct()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PowerImpl <em>Power</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PowerImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getPower()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.UnaryImpl <em>Unary</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.UnaryImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getUnary()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.AtomImpl <em>Atom</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.AtomImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getAtom()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.VariableImpl <em>Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.VariableImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getVariable()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermExpressionImpl <em>Term Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getTermExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProductExpressionImpl <em>Product Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProductExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getProductExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProbabilityFunctionLiteralImpl <em>Probability Function Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProbabilityFunctionLiteralImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getProbabilityFunctionLiteral()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ParenthesisImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getParenthesis()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NumericLiteralImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getNumericLiteral()
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
   int NUMERIC_LITERAL__UNIT = Units_pc_pcPackage.UNIT_CARRYING_ELEMENT__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NUMERIC_LITERAL__UNIT_SPECIFICATION = Units_pc_pcPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION;

   /**
    * The number of structural features of the '<em>Numeric Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NUMERIC_LITERAL_FEATURE_COUNT = Units_pc_pcPackage.UNIT_CARRYING_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IntLiteralImpl <em>Int Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IntLiteralImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getIntLiteral()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.DoubleLiteralImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getDoubleLiteral()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.CompareExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getCompareExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BoolLiteralImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getBoolLiteral()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.StringLiteralImpl <em>String Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.StringLiteralImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getStringLiteral()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PowerExpressionImpl <em>Power Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PowerExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getPowerExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BooleanOperatorExpressionImpl <em>Boolean Operator Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BooleanOperatorExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getBooleanOperatorExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NotExpressionImpl <em>Not Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NotExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getNotExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NegativeExpressionImpl <em>Negative Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NegativeExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getNegativeExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.FunctionLiteralImpl <em>Function Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.FunctionLiteralImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getFunctionLiteral()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IfElseExpressionImpl <em>If Else Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IfElseExpressionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getIfElseExpression()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.RandomVariableImpl <em>Random Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.RandomVariableImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getRandomVariable()
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
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PointcutPointcutImpl <em>Pointcut Pointcut</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PointcutPointcutImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getPointcutPointcut()
    * @generated
    */
   int POINTCUT_POINTCUT = 30;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POINTCUT_POINTCUT__CHILDREN = 0;

   /**
    * The number of structural features of the '<em>Pointcut Pointcut</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POINTCUT_POINTCUT_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PointcutImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getPointcut()
    * @generated
    */
   int POINTCUT = 31;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POINTCUT__CHILDREN = 0;

   /**
    * The number of structural features of the '<em>Pointcut</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POINTCUT_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermOperations <em>Term Operations</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermOperations
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getTermOperations()
    * @generated
    */
   int TERM_OPERATIONS = 32;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductOperations <em>Product Operations</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductOperations
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getProductOperations()
    * @generated
    */
   int PRODUCT_OPERATIONS = 33;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareOperations <em>Compare Operations</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareOperations
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getCompareOperations()
    * @generated
    */
   int COMPARE_OPERATIONS = 34;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperations <em>Boolean Operations</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperations
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getBooleanOperations()
    * @generated
    */
   int BOOLEAN_OPERATIONS = 35;


   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.VariableReference <em>Variable Reference</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Variable Reference</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.VariableReference
    * @generated
    */
   EClass getVariableReference();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.AbstractNamedReference <em>Abstract Named Reference</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Abstract Named Reference</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.AbstractNamedReference
    * @generated
    */
   EClass getAbstractNamedReference();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.AbstractNamedReference#getReferenceName <em>Reference Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Reference Name</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.AbstractNamedReference#getReferenceName()
    * @see #getAbstractNamedReference()
    * @generated
    */
   EAttribute getAbstractNamedReference_ReferenceName();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NamespaceReference <em>Namespace Reference</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Namespace Reference</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NamespaceReference
    * @generated
    */
   EClass getNamespaceReference();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NamespaceReference#getInnerReference_NamespaceReference <em>Inner Reference Namespace Reference</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Inner Reference Namespace Reference</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NamespaceReference#getInnerReference_NamespaceReference()
    * @see #getNamespaceReference()
    * @generated
    */
   EReference getNamespaceReference_InnerReference_NamespaceReference();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Variable <em>Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Variable</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Variable
    * @generated
    */
   EClass getVariable();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Variable#getId_Variable <em>Id Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Id Variable</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Variable#getId_Variable()
    * @see #getVariable()
    * @generated
    */
   EReference getVariable_Id_Variable();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Atom <em>Atom</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Atom</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Atom
    * @generated
    */
   EClass getAtom();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Unary <em>Unary</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unary</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Unary
    * @generated
    */
   EClass getUnary();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Power <em>Power</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Power</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Power
    * @generated
    */
   EClass getPower();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Product <em>Product</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Product</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Product
    * @generated
    */
   EClass getProduct();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Term <em>Term</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Term</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Term
    * @generated
    */
   EClass getTerm();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Comparison <em>Comparison</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Comparison</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Comparison
    * @generated
    */
   EClass getComparison();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanExpression <em>Boolean Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Boolean Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanExpression
    * @generated
    */
   EClass getBooleanExpression();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElse <em>If Else</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>If Else</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElse
    * @generated
    */
   EClass getIfElse();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Expression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Expression
    * @generated
    */
   EClass getExpression();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression <em>Term Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Term Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression
    * @generated
    */
   EClass getTermExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression#getLeft <em>Left</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Left</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression#getLeft()
    * @see #getTermExpression()
    * @generated
    */
   EReference getTermExpression_Left();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression#getRight <em>Right</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Right</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression#getRight()
    * @see #getTermExpression()
    * @generated
    */
   EReference getTermExpression_Right();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression#getOperation()
    * @see #getTermExpression()
    * @generated
    */
   EAttribute getTermExpression_Operation();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression <em>Product Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Product Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression
    * @generated
    */
   EClass getProductExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression#getLeft <em>Left</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Left</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression#getLeft()
    * @see #getProductExpression()
    * @generated
    */
   EReference getProductExpression_Left();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression#getRight <em>Right</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Right</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression#getRight()
    * @see #getProductExpression()
    * @generated
    */
   EReference getProductExpression_Right();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductExpression#getOperation()
    * @see #getProductExpression()
    * @generated
    */
   EAttribute getProductExpression_Operation();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProbabilityFunctionLiteral <em>Probability Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Probability Function Literal</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProbabilityFunctionLiteral
    * @generated
    */
   EClass getProbabilityFunctionLiteral();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProbabilityFunctionLiteral#getFunction_ProbabilityFunctionLiteral <em>Function Probability Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Function Probability Function Literal</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProbabilityFunctionLiteral#getFunction_ProbabilityFunctionLiteral()
    * @see #getProbabilityFunctionLiteral()
    * @generated
    */
   EReference getProbabilityFunctionLiteral_Function_ProbabilityFunctionLiteral();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Parenthesis <em>Parenthesis</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Parenthesis</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Parenthesis
    * @generated
    */
   EClass getParenthesis();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Parenthesis#getInnerExpression <em>Inner Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Inner Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Parenthesis#getInnerExpression()
    * @see #getParenthesis()
    * @generated
    */
   EReference getParenthesis_InnerExpression();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NumericLiteral <em>Numeric Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Numeric Literal</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NumericLiteral
    * @generated
    */
   EClass getNumericLiteral();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IntLiteral <em>Int Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Int Literal</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IntLiteral
    * @generated
    */
   EClass getIntLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IntLiteral#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IntLiteral#getValue()
    * @see #getIntLiteral()
    * @generated
    */
   EAttribute getIntLiteral_Value();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.DoubleLiteral <em>Double Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Double Literal</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.DoubleLiteral
    * @generated
    */
   EClass getDoubleLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.DoubleLiteral#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.DoubleLiteral#getValue()
    * @see #getDoubleLiteral()
    * @generated
    */
   EAttribute getDoubleLiteral_Value();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression <em>Compare Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Compare Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression
    * @generated
    */
   EClass getCompareExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression#getLeft <em>Left</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Left</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression#getLeft()
    * @see #getCompareExpression()
    * @generated
    */
   EReference getCompareExpression_Left();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression#getRight <em>Right</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Right</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression#getRight()
    * @see #getCompareExpression()
    * @generated
    */
   EReference getCompareExpression_Right();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression#getOperation()
    * @see #getCompareExpression()
    * @generated
    */
   EAttribute getCompareExpression_Operation();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BoolLiteral <em>Bool Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Bool Literal</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BoolLiteral
    * @generated
    */
   EClass getBoolLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BoolLiteral#isValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BoolLiteral#isValue()
    * @see #getBoolLiteral()
    * @generated
    */
   EAttribute getBoolLiteral_Value();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.StringLiteral <em>String Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>String Literal</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.StringLiteral
    * @generated
    */
   EClass getStringLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.StringLiteral#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.StringLiteral#getValue()
    * @see #getStringLiteral()
    * @generated
    */
   EAttribute getStringLiteral_Value();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PowerExpression <em>Power Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Power Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PowerExpression
    * @generated
    */
   EClass getPowerExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PowerExpression#getBase <em>Base</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Base</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PowerExpression#getBase()
    * @see #getPowerExpression()
    * @generated
    */
   EReference getPowerExpression_Base();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PowerExpression#getExponent <em>Exponent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Exponent</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PowerExpression#getExponent()
    * @see #getPowerExpression()
    * @generated
    */
   EReference getPowerExpression_Exponent();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression <em>Boolean Operator Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Boolean Operator Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression
    * @generated
    */
   EClass getBooleanOperatorExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression#getLeft <em>Left</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Left</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression#getLeft()
    * @see #getBooleanOperatorExpression()
    * @generated
    */
   EReference getBooleanOperatorExpression_Left();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression#getRight <em>Right</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Right</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression#getRight()
    * @see #getBooleanOperatorExpression()
    * @generated
    */
   EReference getBooleanOperatorExpression_Right();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperatorExpression#getOperation()
    * @see #getBooleanOperatorExpression()
    * @generated
    */
   EAttribute getBooleanOperatorExpression_Operation();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NotExpression <em>Not Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Not Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NotExpression
    * @generated
    */
   EClass getNotExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NotExpression#getInner <em>Inner</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Inner</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NotExpression#getInner()
    * @see #getNotExpression()
    * @generated
    */
   EReference getNotExpression_Inner();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NegativeExpression <em>Negative Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Negative Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NegativeExpression
    * @generated
    */
   EClass getNegativeExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NegativeExpression#getInner <em>Inner</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Inner</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.NegativeExpression#getInner()
    * @see #getNegativeExpression()
    * @generated
    */
   EReference getNegativeExpression_Inner();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.FunctionLiteral <em>Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Function Literal</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.FunctionLiteral
    * @generated
    */
   EClass getFunctionLiteral();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.FunctionLiteral#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.FunctionLiteral#getId()
    * @see #getFunctionLiteral()
    * @generated
    */
   EAttribute getFunctionLiteral_Id();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.FunctionLiteral#getParameters_FunctionLiteral <em>Parameters Function Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Parameters Function Literal</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.FunctionLiteral#getParameters_FunctionLiteral()
    * @see #getFunctionLiteral()
    * @generated
    */
   EReference getFunctionLiteral_Parameters_FunctionLiteral();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression <em>If Else Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>If Else Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression
    * @generated
    */
   EClass getIfElseExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression#getIfExpression <em>If Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>If Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression#getIfExpression()
    * @see #getIfElseExpression()
    * @generated
    */
   EReference getIfElseExpression_IfExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression#getElseExpression <em>Else Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Else Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression#getElseExpression()
    * @see #getIfElseExpression()
    * @generated
    */
   EReference getIfElseExpression_ElseExpression();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression#getConditionExpression <em>Condition Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Condition Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.IfElseExpression#getConditionExpression()
    * @see #getIfElseExpression()
    * @generated
    */
   EReference getIfElseExpression_ConditionExpression();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.RandomVariable <em>Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Random Variable</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.RandomVariable
    * @generated
    */
   EClass getRandomVariable();

   /**
    * Returns the meta object for the attribute '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.RandomVariable#getSpecification <em>Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Specification</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.RandomVariable#getSpecification()
    * @see #getRandomVariable()
    * @generated
    */
   EAttribute getRandomVariable_Specification();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.RandomVariable#getExpression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Expression</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.RandomVariable#getExpression()
    * @see #getRandomVariable()
    * @generated
    */
   EReference getRandomVariable_Expression();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PointcutPointcut <em>Pointcut Pointcut</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pointcut Pointcut</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PointcutPointcut
    * @generated
    */
   EClass getPointcutPointcut();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PointcutPointcut#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.PointcutPointcut#getChildren()
    * @see #getPointcutPointcut()
    * @generated
    */
   EReference getPointcutPointcut_Children();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Pointcut <em>Pointcut</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pointcut</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Pointcut
    * @generated
    */
   EClass getPointcut();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Pointcut#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Pointcut#getChildren()
    * @see #getPointcut()
    * @generated
    */
   EReference getPointcut_Children();

   /**
    * Returns the meta object for enum '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermOperations <em>Term Operations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Term Operations</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermOperations
    * @generated
    */
   EEnum getTermOperations();

   /**
    * Returns the meta object for enum '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductOperations <em>Product Operations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Product Operations</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductOperations
    * @generated
    */
   EEnum getProductOperations();

   /**
    * Returns the meta object for enum '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareOperations <em>Compare Operations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Compare Operations</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareOperations
    * @generated
    */
   EEnum getCompareOperations();

   /**
    * Returns the meta object for enum '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperations <em>Boolean Operations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Boolean Operations</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperations
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
   Stoex_pc_pcFactory getStoex_pc_pcFactory();

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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.VariableReferenceImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getVariableReference()
       * @generated
       */
      EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.AbstractNamedReferenceImpl <em>Abstract Named Reference</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.AbstractNamedReferenceImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getAbstractNamedReference()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NamespaceReferenceImpl <em>Namespace Reference</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NamespaceReferenceImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getNamespaceReference()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.VariableImpl <em>Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.VariableImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getVariable()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.AtomImpl <em>Atom</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.AtomImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getAtom()
       * @generated
       */
      EClass ATOM = eINSTANCE.getAtom();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.UnaryImpl <em>Unary</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.UnaryImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getUnary()
       * @generated
       */
      EClass UNARY = eINSTANCE.getUnary();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PowerImpl <em>Power</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PowerImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getPower()
       * @generated
       */
      EClass POWER = eINSTANCE.getPower();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProductImpl <em>Product</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProductImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getProduct()
       * @generated
       */
      EClass PRODUCT = eINSTANCE.getProduct();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermImpl <em>Term</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getTerm()
       * @generated
       */
      EClass TERM = eINSTANCE.getTerm();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ComparisonImpl <em>Comparison</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ComparisonImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getComparison()
       * @generated
       */
      EClass COMPARISON = eINSTANCE.getComparison();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BooleanExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getBooleanExpression()
       * @generated
       */
      EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IfElseImpl <em>If Else</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IfElseImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getIfElse()
       * @generated
       */
      EClass IF_ELSE = eINSTANCE.getIfElse();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ExpressionImpl <em>Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getExpression()
       * @generated
       */
      EClass EXPRESSION = eINSTANCE.getExpression();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermExpressionImpl <em>Term Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getTermExpression()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProductExpressionImpl <em>Product Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProductExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getProductExpression()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProbabilityFunctionLiteralImpl <em>Probability Function Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ProbabilityFunctionLiteralImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getProbabilityFunctionLiteral()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.ParenthesisImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getParenthesis()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NumericLiteralImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getNumericLiteral()
       * @generated
       */
      EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IntLiteralImpl <em>Int Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IntLiteralImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getIntLiteral()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.DoubleLiteralImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getDoubleLiteral()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.CompareExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getCompareExpression()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BoolLiteralImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getBoolLiteral()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.StringLiteralImpl <em>String Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.StringLiteralImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getStringLiteral()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PowerExpressionImpl <em>Power Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PowerExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getPowerExpression()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BooleanOperatorExpressionImpl <em>Boolean Operator Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.BooleanOperatorExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getBooleanOperatorExpression()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NotExpressionImpl <em>Not Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NotExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getNotExpression()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NegativeExpressionImpl <em>Negative Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.NegativeExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getNegativeExpression()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.FunctionLiteralImpl <em>Function Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.FunctionLiteralImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getFunctionLiteral()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IfElseExpressionImpl <em>If Else Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.IfElseExpressionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getIfElseExpression()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.RandomVariableImpl <em>Random Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.RandomVariableImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getRandomVariable()
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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PointcutPointcutImpl <em>Pointcut Pointcut</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PointcutPointcutImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getPointcutPointcut()
       * @generated
       */
      EClass POINTCUT_POINTCUT = eINSTANCE.getPointcutPointcut();

      /**
       * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference POINTCUT_POINTCUT__CHILDREN = eINSTANCE.getPointcutPointcut_Children();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.PointcutImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getPointcut()
       * @generated
       */
      EClass POINTCUT = eINSTANCE.getPointcut();

      /**
       * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference POINTCUT__CHILDREN = eINSTANCE.getPointcut_Children();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermOperations <em>Term Operations</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermOperations
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getTermOperations()
       * @generated
       */
      EEnum TERM_OPERATIONS = eINSTANCE.getTermOperations();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductOperations <em>Product Operations</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.ProductOperations
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getProductOperations()
       * @generated
       */
      EEnum PRODUCT_OPERATIONS = eINSTANCE.getProductOperations();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareOperations <em>Compare Operations</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareOperations
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getCompareOperations()
       * @generated
       */
      EEnum COMPARE_OPERATIONS = eINSTANCE.getCompareOperations();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperations <em>Boolean Operations</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.BooleanOperations
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.Stoex_pc_pcPackageImpl#getBooleanOperations()
       * @generated
       */
      EEnum BOOLEAN_OPERATIONS = eINSTANCE.getBooleanOperations();

   }

} //Stoex_pc_pcPackage
