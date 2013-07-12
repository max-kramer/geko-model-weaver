/**
 */
package de_av.uka_av.ipd_av.sdq_av.probfunction_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.probfunction_av.Probfunction_avPackage
 * @generated
 */
public interface Probfunction_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Probfunction_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.probfunction_av.impl.Probfunction_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Boxed PDF</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Boxed PDF</em>'.
    * @generated
    */
   BoxedPDF createBoxedPDF();

   /**
    * Returns a new object of class '<em>Probability Density Function</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Probability Density Function</em>'.
    * @generated
    */
   ProbabilityDensityFunction createProbabilityDensityFunction();

   /**
    * Returns a new object of class '<em>Probability Function</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Probability Function</em>'.
    * @generated
    */
   ProbabilityFunction createProbabilityFunction();

   /**
    * Returns a new object of class '<em>Continuous Sample</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Continuous Sample</em>'.
    * @generated
    */
   ContinuousSample createContinuousSample();

   /**
    * Returns a new object of class '<em>Probability Mass Function</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Probability Mass Function</em>'.
    * @generated
    */
   ProbabilityMassFunction createProbabilityMassFunction();

   /**
    * Returns a new object of class '<em>Sample</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Sample</em>'.
    * @generated
    */
   <T> Sample<T> createSample();

   /**
    * Returns a new object of class '<em>Sample PDF</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Sample PDF</em>'.
    * @generated
    */
   SamplePDF createSamplePDF();

   /**
    * Returns a new object of class '<em>Complex</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Complex</em>'.
    * @generated
    */
   Complex createComplex();

   /**
    * Returns a new object of class '<em>Continuous PDF</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Continuous PDF</em>'.
    * @generated
    */
   ContinuousPDF createContinuousPDF();

   /**
    * Returns a new object of class '<em>Exponential Distribution</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Exponential Distribution</em>'.
    * @generated
    */
   ExponentialDistribution createExponentialDistribution();

   /**
    * Returns a new object of class '<em>Normal Distribution</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Normal Distribution</em>'.
    * @generated
    */
   NormalDistribution createNormalDistribution();

   /**
    * Returns a new object of class '<em>Lognormal Distribution</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Lognormal Distribution</em>'.
    * @generated
    */
   LognormalDistribution createLognormalDistribution();

   /**
    * Returns a new object of class '<em>Gamma Distribution</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Gamma Distribution</em>'.
    * @generated
    */
   GammaDistribution createGammaDistribution();

   /**
    * Returns a new object of class '<em>Advice</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Advice</em>'.
    * @generated
    */
   Advice createAdvice();

   /**
    * Returns a new object of class '<em>Global Scope</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Global Scope</em>'.
    * @generated
    */
   GlobalScope createGlobalScope();

   /**
    * Returns a new object of class '<em>Per Join Point Scope</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Per Join Point Scope</em>'.
    * @generated
    */
   PerJoinPointScope createPerJoinPointScope();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Probfunction_avPackage getProbfunction_avPackage();

} //Probfunction_avFactory
