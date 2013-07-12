/**
 */
package de_av.uka_av.ipd_av.sdq_av.probfunction_av.impl;

import de_av.uka_av.ipd_av.sdq_av.probfunction_av.*;

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
public class Probfunction_avFactoryImpl extends EFactoryImpl implements Probfunction_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Probfunction_avFactory init() {
      try {
         Probfunction_avFactory theProbfunction_avFactory = (Probfunction_avFactory)EPackage.Registry.INSTANCE.getEFactory(Probfunction_avPackage.eNS_URI);
         if (theProbfunction_avFactory != null) {
            return theProbfunction_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Probfunction_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Probfunction_avFactoryImpl() {
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
         case Probfunction_avPackage.BOXED_PDF: return createBoxedPDF();
         case Probfunction_avPackage.PROBABILITY_DENSITY_FUNCTION: return createProbabilityDensityFunction();
         case Probfunction_avPackage.PROBABILITY_FUNCTION: return createProbabilityFunction();
         case Probfunction_avPackage.CONTINUOUS_SAMPLE: return createContinuousSample();
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION: return createProbabilityMassFunction();
         case Probfunction_avPackage.SAMPLE: return createSample();
         case Probfunction_avPackage.SAMPLE_PDF: return createSamplePDF();
         case Probfunction_avPackage.COMPLEX: return createComplex();
         case Probfunction_avPackage.CONTINUOUS_PDF: return createContinuousPDF();
         case Probfunction_avPackage.EXPONENTIAL_DISTRIBUTION: return createExponentialDistribution();
         case Probfunction_avPackage.NORMAL_DISTRIBUTION: return createNormalDistribution();
         case Probfunction_avPackage.LOGNORMAL_DISTRIBUTION: return createLognormalDistribution();
         case Probfunction_avPackage.GAMMA_DISTRIBUTION: return createGammaDistribution();
         case Probfunction_avPackage.ADVICE: return createAdvice();
         case Probfunction_avPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Probfunction_avPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
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
   public Probfunction_avPackage getProbfunction_avPackage() {
      return (Probfunction_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Probfunction_avPackage getPackage() {
      return Probfunction_avPackage.eINSTANCE;
   }

} //Probfunction_avFactoryImpl
