/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.*;

import org.eclipse.emf.ecore.EClass;
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
public class Probfunction_av_pcFactoryImpl extends EFactoryImpl implements Probfunction_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Probfunction_av_pcFactory init() {
      try {
         Probfunction_av_pcFactory theProbfunction_av_pcFactory = (Probfunction_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Probfunction_av_pcPackage.eNS_URI);
         if (theProbfunction_av_pcFactory != null) {
            return theProbfunction_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Probfunction_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Probfunction_av_pcFactoryImpl() {
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
         case Probfunction_av_pcPackage.BOXED_PDF: return createBoxedPDF();
         case Probfunction_av_pcPackage.PROBABILITY_DENSITY_FUNCTION: return createProbabilityDensityFunction();
         case Probfunction_av_pcPackage.PROBABILITY_FUNCTION: return createProbabilityFunction();
         case Probfunction_av_pcPackage.CONTINUOUS_SAMPLE: return createContinuousSample();
         case Probfunction_av_pcPackage.PROBABILITY_MASS_FUNCTION: return createProbabilityMassFunction();
         case Probfunction_av_pcPackage.SAMPLE: return createSample();
         case Probfunction_av_pcPackage.SAMPLE_PDF: return createSamplePDF();
         case Probfunction_av_pcPackage.COMPLEX: return createComplex();
         case Probfunction_av_pcPackage.CONTINUOUS_PDF: return createContinuousPDF();
         case Probfunction_av_pcPackage.EXPONENTIAL_DISTRIBUTION: return createExponentialDistribution();
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION: return createNormalDistribution();
         case Probfunction_av_pcPackage.LOGNORMAL_DISTRIBUTION: return createLognormalDistribution();
         case Probfunction_av_pcPackage.GAMMA_DISTRIBUTION: return createGammaDistribution();
         case Probfunction_av_pcPackage.ADVICE: return createAdvice();
         case Probfunction_av_pcPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Probfunction_av_pcPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
         case Probfunction_av_pcPackage.POINTCUT: return createPointcut();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BoxedPDF createBoxedPDF() {
      BoxedPDFImpl boxedPDF = new BoxedPDFImpl();
      return boxedPDF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProbabilityDensityFunction createProbabilityDensityFunction() {
      ProbabilityDensityFunctionImpl probabilityDensityFunction = new ProbabilityDensityFunctionImpl();
      return probabilityDensityFunction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProbabilityFunction createProbabilityFunction() {
      ProbabilityFunctionImpl probabilityFunction = new ProbabilityFunctionImpl();
      return probabilityFunction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ContinuousSample createContinuousSample() {
      ContinuousSampleImpl continuousSample = new ContinuousSampleImpl();
      return continuousSample;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProbabilityMassFunction createProbabilityMassFunction() {
      ProbabilityMassFunctionImpl probabilityMassFunction = new ProbabilityMassFunctionImpl();
      return probabilityMassFunction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public <T> Sample<T> createSample() {
      SampleImpl<T> sample = new SampleImpl<T>();
      return sample;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SamplePDF createSamplePDF() {
      SamplePDFImpl samplePDF = new SamplePDFImpl();
      return samplePDF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Complex createComplex() {
      ComplexImpl complex = new ComplexImpl();
      return complex;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ContinuousPDF createContinuousPDF() {
      ContinuousPDFImpl continuousPDF = new ContinuousPDFImpl();
      return continuousPDF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExponentialDistribution createExponentialDistribution() {
      ExponentialDistributionImpl exponentialDistribution = new ExponentialDistributionImpl();
      return exponentialDistribution;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NormalDistribution createNormalDistribution() {
      NormalDistributionImpl normalDistribution = new NormalDistributionImpl();
      return normalDistribution;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public LognormalDistribution createLognormalDistribution() {
      LognormalDistributionImpl lognormalDistribution = new LognormalDistributionImpl();
      return lognormalDistribution;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GammaDistribution createGammaDistribution() {
      GammaDistributionImpl gammaDistribution = new GammaDistributionImpl();
      return gammaDistribution;
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
   public Pointcut createPointcut() {
      PointcutImpl pointcut = new PointcutImpl();
      return pointcut;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Probfunction_av_pcPackage getProbfunction_av_pcPackage() {
      return (Probfunction_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Probfunction_av_pcPackage getPackage() {
      return Probfunction_av_pcPackage.eINSTANCE;
   }

} //Probfunction_av_pcFactoryImpl
