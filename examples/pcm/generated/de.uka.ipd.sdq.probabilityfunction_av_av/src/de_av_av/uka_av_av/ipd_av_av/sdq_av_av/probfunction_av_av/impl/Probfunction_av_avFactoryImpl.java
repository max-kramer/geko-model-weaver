/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av.*;

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
public class Probfunction_av_avFactoryImpl extends EFactoryImpl implements Probfunction_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Probfunction_av_avFactory init() {
      try {
         Probfunction_av_avFactory theProbfunction_av_avFactory = (Probfunction_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Probfunction_av_avPackage.eNS_URI);
         if (theProbfunction_av_avFactory != null) {
            return theProbfunction_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Probfunction_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Probfunction_av_avFactoryImpl() {
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
         case Probfunction_av_avPackage.BOXED_PDF: return createBoxedPDF();
         case Probfunction_av_avPackage.PROBABILITY_DENSITY_FUNCTION: return createProbabilityDensityFunction();
         case Probfunction_av_avPackage.PROBABILITY_FUNCTION: return createProbabilityFunction();
         case Probfunction_av_avPackage.CONTINUOUS_SAMPLE: return createContinuousSample();
         case Probfunction_av_avPackage.PROBABILITY_MASS_FUNCTION: return createProbabilityMassFunction();
         case Probfunction_av_avPackage.SAMPLE: return createSample();
         case Probfunction_av_avPackage.SAMPLE_PDF: return createSamplePDF();
         case Probfunction_av_avPackage.COMPLEX: return createComplex();
         case Probfunction_av_avPackage.CONTINUOUS_PDF: return createContinuousPDF();
         case Probfunction_av_avPackage.EXPONENTIAL_DISTRIBUTION: return createExponentialDistribution();
         case Probfunction_av_avPackage.NORMAL_DISTRIBUTION: return createNormalDistribution();
         case Probfunction_av_avPackage.LOGNORMAL_DISTRIBUTION: return createLognormalDistribution();
         case Probfunction_av_avPackage.GAMMA_DISTRIBUTION: return createGammaDistribution();
         case Probfunction_av_avPackage.ADVICE_ADVICE: return createAdviceAdvice();
         case Probfunction_av_avPackage.GLOBAL_SCOPE_GLOBAL_SCOPE: return createGlobalScopeGlobalScope();
         case Probfunction_av_avPackage.PER_JOIN_POINT_SCOPE_PER_JOIN_POINT_SCOPE: return createPerJoinPointScopePerJoinPointScope();
         case Probfunction_av_avPackage.ADVICE: return createAdvice();
         case Probfunction_av_avPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Probfunction_av_avPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
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
   public AdviceAdvice createAdviceAdvice() {
      AdviceAdviceImpl adviceAdvice = new AdviceAdviceImpl();
      return adviceAdvice;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GlobalScopeGlobalScope createGlobalScopeGlobalScope() {
      GlobalScopeGlobalScopeImpl globalScopeGlobalScope = new GlobalScopeGlobalScopeImpl();
      return globalScopeGlobalScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PerJoinPointScopePerJoinPointScope createPerJoinPointScopePerJoinPointScope() {
      PerJoinPointScopePerJoinPointScopeImpl perJoinPointScopePerJoinPointScope = new PerJoinPointScopePerJoinPointScopeImpl();
      return perJoinPointScopePerJoinPointScope;
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
   public Probfunction_av_avPackage getProbfunction_av_avPackage() {
      return (Probfunction_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Probfunction_av_avPackage getPackage() {
      return Probfunction_av_avPackage.eINSTANCE;
   }

} //Probfunction_av_avFactoryImpl
