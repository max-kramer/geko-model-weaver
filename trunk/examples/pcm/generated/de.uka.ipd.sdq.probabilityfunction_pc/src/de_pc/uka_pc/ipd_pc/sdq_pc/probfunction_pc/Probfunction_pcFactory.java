/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage
 * @generated
 */
public interface Probfunction_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Probfunction_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.impl.Probfunction_pcFactoryImpl.init();

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
    * Returns a new object of class '<em>Pointcut</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Pointcut</em>'.
    * @generated
    */
   Pointcut createPointcut();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Probfunction_pcPackage getProbfunction_pcPackage();

} //Probfunction_pcFactory
