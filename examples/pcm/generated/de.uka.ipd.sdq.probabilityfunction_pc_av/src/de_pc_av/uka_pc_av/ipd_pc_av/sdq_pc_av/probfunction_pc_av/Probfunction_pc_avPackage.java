/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Probfunction_pc_avFactory
 * @model kind="package"
 * @generated
 */
public interface Probfunction_pc_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "probfunction_pc_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/ProbFunction/1.0_pointcut_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "probfunction_pc_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Probfunction_pc_avPackage eINSTANCE = de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityFunctionImpl <em>Probability Function</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityFunctionImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getProbabilityFunction()
    * @generated
    */
   int PROBABILITY_FUNCTION = 2;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_FUNCTION__UNIT = Units_pc_avPackage.UNIT_CARRYING_ELEMENT__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_FUNCTION__UNIT_SPECIFICATION = Units_pc_avPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION;

   /**
    * The number of structural features of the '<em>Probability Function</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_FUNCTION_FEATURE_COUNT = Units_pc_avPackage.UNIT_CARRYING_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityDensityFunctionImpl <em>Probability Density Function</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityDensityFunctionImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getProbabilityDensityFunction()
    * @generated
    */
   int PROBABILITY_DENSITY_FUNCTION = 1;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_DENSITY_FUNCTION__UNIT = PROBABILITY_FUNCTION__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_DENSITY_FUNCTION__UNIT_SPECIFICATION = PROBABILITY_FUNCTION__UNIT_SPECIFICATION;

   /**
    * The number of structural features of the '<em>Probability Density Function</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT = PROBABILITY_FUNCTION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.BoxedPDFImpl <em>Boxed PDF</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.BoxedPDFImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getBoxedPDF()
    * @generated
    */
   int BOXED_PDF = 0;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOXED_PDF__UNIT = PROBABILITY_DENSITY_FUNCTION__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOXED_PDF__UNIT_SPECIFICATION = PROBABILITY_DENSITY_FUNCTION__UNIT_SPECIFICATION;

   /**
    * The feature id for the '<em><b>Samples</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOXED_PDF__SAMPLES = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Boxed PDF</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BOXED_PDF_FEATURE_COUNT = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ContinuousSampleImpl <em>Continuous Sample</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ContinuousSampleImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getContinuousSample()
    * @generated
    */
   int CONTINUOUS_SAMPLE = 3;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUOUS_SAMPLE__VALUE = 0;

   /**
    * The feature id for the '<em><b>Probability</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUOUS_SAMPLE__PROBABILITY = 1;

   /**
    * The number of structural features of the '<em>Continuous Sample</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUOUS_SAMPLE_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityMassFunctionImpl <em>Probability Mass Function</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityMassFunctionImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getProbabilityMassFunction()
    * @generated
    */
   int PROBABILITY_MASS_FUNCTION = 4;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_MASS_FUNCTION__UNIT = PROBABILITY_FUNCTION__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_MASS_FUNCTION__UNIT_SPECIFICATION = PROBABILITY_FUNCTION__UNIT_SPECIFICATION;

   /**
    * The feature id for the '<em><b>Samples</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_MASS_FUNCTION__SAMPLES = PROBABILITY_FUNCTION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Ordered Domain</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN = PROBABILITY_FUNCTION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Probability Mass Function</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROBABILITY_MASS_FUNCTION_FEATURE_COUNT = PROBABILITY_FUNCTION_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.SampleImpl <em>Sample</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.SampleImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getSample()
    * @generated
    */
   int SAMPLE = 5;

   /**
    * The feature id for the '<em><b>Value</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE__VALUE = 0;

   /**
    * The feature id for the '<em><b>Probability</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE__PROBABILITY = 1;

   /**
    * The number of structural features of the '<em>Sample</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.SamplePDFImpl <em>Sample PDF</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.SamplePDFImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getSamplePDF()
    * @generated
    */
   int SAMPLE_PDF = 6;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_PDF__UNIT = PROBABILITY_DENSITY_FUNCTION__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_PDF__UNIT_SPECIFICATION = PROBABILITY_DENSITY_FUNCTION__UNIT_SPECIFICATION;

   /**
    * The feature id for the '<em><b>Distance</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_PDF__DISTANCE = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Values</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_PDF__VALUES = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Sample PDF</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_PDF_FEATURE_COUNT = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ComplexImpl <em>Complex</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ComplexImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getComplex()
    * @generated
    */
   int COMPLEX = 7;

   /**
    * The feature id for the '<em><b>Real</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLEX__REAL = 0;

   /**
    * The feature id for the '<em><b>Imaginary</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLEX__IMAGINARY = 1;

   /**
    * The number of structural features of the '<em>Complex</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLEX_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ContinuousPDFImpl <em>Continuous PDF</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ContinuousPDFImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getContinuousPDF()
    * @generated
    */
   int CONTINUOUS_PDF = 8;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUOUS_PDF__UNIT = PROBABILITY_DENSITY_FUNCTION__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUOUS_PDF__UNIT_SPECIFICATION = PROBABILITY_DENSITY_FUNCTION__UNIT_SPECIFICATION;

   /**
    * The number of structural features of the '<em>Continuous PDF</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUOUS_PDF_FEATURE_COUNT = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ExponentialDistributionImpl <em>Exponential Distribution</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ExponentialDistributionImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getExponentialDistribution()
    * @generated
    */
   int EXPONENTIAL_DISTRIBUTION = 9;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPONENTIAL_DISTRIBUTION__UNIT = CONTINUOUS_PDF__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPONENTIAL_DISTRIBUTION__UNIT_SPECIFICATION = CONTINUOUS_PDF__UNIT_SPECIFICATION;

   /**
    * The feature id for the '<em><b>Rate</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPONENTIAL_DISTRIBUTION__RATE = CONTINUOUS_PDF_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Exponential Distribution</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPONENTIAL_DISTRIBUTION_FEATURE_COUNT = CONTINUOUS_PDF_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.NormalDistributionImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getNormalDistribution()
    * @generated
    */
   int NORMAL_DISTRIBUTION = 10;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NORMAL_DISTRIBUTION__UNIT = CONTINUOUS_PDF__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NORMAL_DISTRIBUTION__UNIT_SPECIFICATION = CONTINUOUS_PDF__UNIT_SPECIFICATION;

   /**
    * The feature id for the '<em><b>Mu</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NORMAL_DISTRIBUTION__MU = CONTINUOUS_PDF_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Sigma</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NORMAL_DISTRIBUTION__SIGMA = CONTINUOUS_PDF_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Normal Distribution</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NORMAL_DISTRIBUTION_FEATURE_COUNT = CONTINUOUS_PDF_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.LognormalDistributionImpl <em>Lognormal Distribution</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.LognormalDistributionImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getLognormalDistribution()
    * @generated
    */
   int LOGNORMAL_DISTRIBUTION = 11;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOGNORMAL_DISTRIBUTION__UNIT = CONTINUOUS_PDF__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOGNORMAL_DISTRIBUTION__UNIT_SPECIFICATION = CONTINUOUS_PDF__UNIT_SPECIFICATION;

   /**
    * The feature id for the '<em><b>Mu</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOGNORMAL_DISTRIBUTION__MU = CONTINUOUS_PDF_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Sigma</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOGNORMAL_DISTRIBUTION__SIGMA = CONTINUOUS_PDF_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Lognormal Distribution</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOGNORMAL_DISTRIBUTION_FEATURE_COUNT = CONTINUOUS_PDF_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.GammaDistributionImpl <em>Gamma Distribution</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.GammaDistributionImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getGammaDistribution()
    * @generated
    */
   int GAMMA_DISTRIBUTION = 12;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GAMMA_DISTRIBUTION__UNIT = CONTINUOUS_PDF__UNIT;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GAMMA_DISTRIBUTION__UNIT_SPECIFICATION = CONTINUOUS_PDF__UNIT_SPECIFICATION;

   /**
    * The feature id for the '<em><b>Alpha</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GAMMA_DISTRIBUTION__ALPHA = CONTINUOUS_PDF_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Theta</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GAMMA_DISTRIBUTION__THETA = CONTINUOUS_PDF_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Gamma Distribution</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GAMMA_DISTRIBUTION_FEATURE_COUNT = CONTINUOUS_PDF_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.PointcutImpl <em>Pointcut</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.PointcutImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getPointcut()
    * @generated
    */
   int POINTCUT = 13;

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
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.AdviceImpl <em>Advice</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.AdviceImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getAdvice()
    * @generated
    */
   int ADVICE = 14;

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
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.GlobalScopeImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getGlobalScope()
    * @generated
    */
   int GLOBAL_SCOPE = 15;

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
    * The meta object id for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.PerJoinPointScopeImpl
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getPerJoinPointScope()
    * @generated
    */
   int PER_JOIN_POINT_SCOPE = 16;

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
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.BoxedPDF <em>Boxed PDF</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Boxed PDF</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.BoxedPDF
    * @generated
    */
   EClass getBoxedPDF();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.BoxedPDF#getSamples <em>Samples</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Samples</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.BoxedPDF#getSamples()
    * @see #getBoxedPDF()
    * @generated
    */
   EReference getBoxedPDF_Samples();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityDensityFunction <em>Probability Density Function</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Probability Density Function</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityDensityFunction
    * @generated
    */
   EClass getProbabilityDensityFunction();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityFunction <em>Probability Function</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Probability Function</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityFunction
    * @generated
    */
   EClass getProbabilityFunction();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ContinuousSample <em>Continuous Sample</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Continuous Sample</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ContinuousSample
    * @generated
    */
   EClass getContinuousSample();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ContinuousSample#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ContinuousSample#getValue()
    * @see #getContinuousSample()
    * @generated
    */
   EAttribute getContinuousSample_Value();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ContinuousSample#getProbability <em>Probability</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Probability</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ContinuousSample#getProbability()
    * @see #getContinuousSample()
    * @generated
    */
   EAttribute getContinuousSample_Probability();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityMassFunction <em>Probability Mass Function</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Probability Mass Function</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityMassFunction
    * @generated
    */
   EClass getProbabilityMassFunction();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityMassFunction#getSamples <em>Samples</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Samples</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityMassFunction#getSamples()
    * @see #getProbabilityMassFunction()
    * @generated
    */
   EReference getProbabilityMassFunction_Samples();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityMassFunction#isOrderedDomain <em>Ordered Domain</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Ordered Domain</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ProbabilityMassFunction#isOrderedDomain()
    * @see #getProbabilityMassFunction()
    * @generated
    */
   EAttribute getProbabilityMassFunction_OrderedDomain();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Sample <em>Sample</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Sample</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Sample
    * @generated
    */
   EClass getSample();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Sample#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Value</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Sample#getValue()
    * @see #getSample()
    * @generated
    */
   EReference getSample_Value();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Sample#getProbability <em>Probability</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Probability</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Sample#getProbability()
    * @see #getSample()
    * @generated
    */
   EAttribute getSample_Probability();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.SamplePDF <em>Sample PDF</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Sample PDF</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.SamplePDF
    * @generated
    */
   EClass getSamplePDF();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.SamplePDF#getDistance <em>Distance</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Distance</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.SamplePDF#getDistance()
    * @see #getSamplePDF()
    * @generated
    */
   EAttribute getSamplePDF_Distance();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.SamplePDF#getValues <em>Values</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Values</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.SamplePDF#getValues()
    * @see #getSamplePDF()
    * @generated
    */
   EReference getSamplePDF_Values();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Complex <em>Complex</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Complex</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Complex
    * @generated
    */
   EClass getComplex();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Complex#getReal <em>Real</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Real</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Complex#getReal()
    * @see #getComplex()
    * @generated
    */
   EAttribute getComplex_Real();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Complex#getImaginary <em>Imaginary</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Imaginary</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Complex#getImaginary()
    * @see #getComplex()
    * @generated
    */
   EAttribute getComplex_Imaginary();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ContinuousPDF <em>Continuous PDF</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Continuous PDF</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ContinuousPDF
    * @generated
    */
   EClass getContinuousPDF();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ExponentialDistribution <em>Exponential Distribution</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Exponential Distribution</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ExponentialDistribution
    * @generated
    */
   EClass getExponentialDistribution();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ExponentialDistribution#getRate <em>Rate</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Rate</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.ExponentialDistribution#getRate()
    * @see #getExponentialDistribution()
    * @generated
    */
   EAttribute getExponentialDistribution_Rate();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.NormalDistribution <em>Normal Distribution</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Normal Distribution</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.NormalDistribution
    * @generated
    */
   EClass getNormalDistribution();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.NormalDistribution#getMu <em>Mu</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Mu</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.NormalDistribution#getMu()
    * @see #getNormalDistribution()
    * @generated
    */
   EAttribute getNormalDistribution_Mu();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.NormalDistribution#getSigma <em>Sigma</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Sigma</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.NormalDistribution#getSigma()
    * @see #getNormalDistribution()
    * @generated
    */
   EAttribute getNormalDistribution_Sigma();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.LognormalDistribution <em>Lognormal Distribution</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Lognormal Distribution</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.LognormalDistribution
    * @generated
    */
   EClass getLognormalDistribution();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.LognormalDistribution#getMu <em>Mu</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Mu</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.LognormalDistribution#getMu()
    * @see #getLognormalDistribution()
    * @generated
    */
   EAttribute getLognormalDistribution_Mu();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.LognormalDistribution#getSigma <em>Sigma</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Sigma</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.LognormalDistribution#getSigma()
    * @see #getLognormalDistribution()
    * @generated
    */
   EAttribute getLognormalDistribution_Sigma();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GammaDistribution <em>Gamma Distribution</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Gamma Distribution</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GammaDistribution
    * @generated
    */
   EClass getGammaDistribution();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GammaDistribution#getAlpha <em>Alpha</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Alpha</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GammaDistribution#getAlpha()
    * @see #getGammaDistribution()
    * @generated
    */
   EAttribute getGammaDistribution_Alpha();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GammaDistribution#getTheta <em>Theta</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Theta</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GammaDistribution#getTheta()
    * @see #getGammaDistribution()
    * @generated
    */
   EAttribute getGammaDistribution_Theta();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Pointcut <em>Pointcut</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pointcut</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Pointcut
    * @generated
    */
   EClass getPointcut();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Pointcut#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Pointcut#getChildren()
    * @see #getPointcut()
    * @generated
    */
   EReference getPointcut_Children();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Advice <em>Advice</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Advice</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Advice
    * @generated
    */
   EClass getAdvice();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Advice#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.Advice#getChildren()
    * @see #getAdvice()
    * @generated
    */
   EReference getAdvice_Children();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GlobalScope <em>Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Global Scope</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GlobalScope
    * @generated
    */
   EClass getGlobalScope();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GlobalScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.GlobalScope#getScopedObject()
    * @see #getGlobalScope()
    * @generated
    */
   EReference getGlobalScope_ScopedObject();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.PerJoinPointScope <em>Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Per Join Point Scope</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.PerJoinPointScope
    * @generated
    */
   EClass getPerJoinPointScope();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.PerJoinPointScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.PerJoinPointScope#getScopedObject()
    * @see #getPerJoinPointScope()
    * @generated
    */
   EReference getPerJoinPointScope_ScopedObject();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Probfunction_pc_avFactory getProbfunction_pc_avFactory();

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
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.BoxedPDFImpl <em>Boxed PDF</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.BoxedPDFImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getBoxedPDF()
       * @generated
       */
      EClass BOXED_PDF = eINSTANCE.getBoxedPDF();

      /**
       * The meta object literal for the '<em><b>Samples</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference BOXED_PDF__SAMPLES = eINSTANCE.getBoxedPDF_Samples();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityDensityFunctionImpl <em>Probability Density Function</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityDensityFunctionImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getProbabilityDensityFunction()
       * @generated
       */
      EClass PROBABILITY_DENSITY_FUNCTION = eINSTANCE.getProbabilityDensityFunction();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityFunctionImpl <em>Probability Function</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityFunctionImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getProbabilityFunction()
       * @generated
       */
      EClass PROBABILITY_FUNCTION = eINSTANCE.getProbabilityFunction();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ContinuousSampleImpl <em>Continuous Sample</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ContinuousSampleImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getContinuousSample()
       * @generated
       */
      EClass CONTINUOUS_SAMPLE = eINSTANCE.getContinuousSample();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute CONTINUOUS_SAMPLE__VALUE = eINSTANCE.getContinuousSample_Value();

      /**
       * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute CONTINUOUS_SAMPLE__PROBABILITY = eINSTANCE.getContinuousSample_Probability();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityMassFunctionImpl <em>Probability Mass Function</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ProbabilityMassFunctionImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getProbabilityMassFunction()
       * @generated
       */
      EClass PROBABILITY_MASS_FUNCTION = eINSTANCE.getProbabilityMassFunction();

      /**
       * The meta object literal for the '<em><b>Samples</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PROBABILITY_MASS_FUNCTION__SAMPLES = eINSTANCE.getProbabilityMassFunction_Samples();

      /**
       * The meta object literal for the '<em><b>Ordered Domain</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN = eINSTANCE.getProbabilityMassFunction_OrderedDomain();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.SampleImpl <em>Sample</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.SampleImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getSample()
       * @generated
       */
      EClass SAMPLE = eINSTANCE.getSample();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SAMPLE__VALUE = eINSTANCE.getSample_Value();

      /**
       * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute SAMPLE__PROBABILITY = eINSTANCE.getSample_Probability();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.SamplePDFImpl <em>Sample PDF</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.SamplePDFImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getSamplePDF()
       * @generated
       */
      EClass SAMPLE_PDF = eINSTANCE.getSamplePDF();

      /**
       * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute SAMPLE_PDF__DISTANCE = eINSTANCE.getSamplePDF_Distance();

      /**
       * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SAMPLE_PDF__VALUES = eINSTANCE.getSamplePDF_Values();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ComplexImpl <em>Complex</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ComplexImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getComplex()
       * @generated
       */
      EClass COMPLEX = eINSTANCE.getComplex();

      /**
       * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute COMPLEX__REAL = eINSTANCE.getComplex_Real();

      /**
       * The meta object literal for the '<em><b>Imaginary</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute COMPLEX__IMAGINARY = eINSTANCE.getComplex_Imaginary();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ContinuousPDFImpl <em>Continuous PDF</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ContinuousPDFImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getContinuousPDF()
       * @generated
       */
      EClass CONTINUOUS_PDF = eINSTANCE.getContinuousPDF();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ExponentialDistributionImpl <em>Exponential Distribution</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.ExponentialDistributionImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getExponentialDistribution()
       * @generated
       */
      EClass EXPONENTIAL_DISTRIBUTION = eINSTANCE.getExponentialDistribution();

      /**
       * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute EXPONENTIAL_DISTRIBUTION__RATE = eINSTANCE.getExponentialDistribution_Rate();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.NormalDistributionImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getNormalDistribution()
       * @generated
       */
      EClass NORMAL_DISTRIBUTION = eINSTANCE.getNormalDistribution();

      /**
       * The meta object literal for the '<em><b>Mu</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NORMAL_DISTRIBUTION__MU = eINSTANCE.getNormalDistribution_Mu();

      /**
       * The meta object literal for the '<em><b>Sigma</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NORMAL_DISTRIBUTION__SIGMA = eINSTANCE.getNormalDistribution_Sigma();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.LognormalDistributionImpl <em>Lognormal Distribution</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.LognormalDistributionImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getLognormalDistribution()
       * @generated
       */
      EClass LOGNORMAL_DISTRIBUTION = eINSTANCE.getLognormalDistribution();

      /**
       * The meta object literal for the '<em><b>Mu</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LOGNORMAL_DISTRIBUTION__MU = eINSTANCE.getLognormalDistribution_Mu();

      /**
       * The meta object literal for the '<em><b>Sigma</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LOGNORMAL_DISTRIBUTION__SIGMA = eINSTANCE.getLognormalDistribution_Sigma();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.GammaDistributionImpl <em>Gamma Distribution</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.GammaDistributionImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getGammaDistribution()
       * @generated
       */
      EClass GAMMA_DISTRIBUTION = eINSTANCE.getGammaDistribution();

      /**
       * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute GAMMA_DISTRIBUTION__ALPHA = eINSTANCE.getGammaDistribution_Alpha();

      /**
       * The meta object literal for the '<em><b>Theta</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute GAMMA_DISTRIBUTION__THETA = eINSTANCE.getGammaDistribution_Theta();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.PointcutImpl <em>Pointcut</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.PointcutImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getPointcut()
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
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.AdviceImpl <em>Advice</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.AdviceImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getAdvice()
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
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.GlobalScopeImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getGlobalScope()
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
       * The meta object literal for the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.PerJoinPointScopeImpl
       * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.probfunction_pc_av.impl.Probfunction_pc_avPackageImpl#getPerJoinPointScope()
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

   }

} //Probfunction_pc_avPackage
