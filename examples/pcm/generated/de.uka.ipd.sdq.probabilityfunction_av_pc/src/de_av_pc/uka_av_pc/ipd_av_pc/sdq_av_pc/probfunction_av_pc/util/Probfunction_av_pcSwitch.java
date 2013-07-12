/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.util;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.*;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.UnitCarryingElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.Probfunction_av_pcPackage
 * @generated
 */
public class Probfunction_av_pcSwitch<T1> extends Switch<T1> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Probfunction_av_pcPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Probfunction_av_pcSwitch() {
      if (modelPackage == null) {
         modelPackage = Probfunction_av_pcPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T1 doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case Probfunction_av_pcPackage.BOXED_PDF: {
            BoxedPDF boxedPDF = (BoxedPDF)theEObject;
            T1 result = caseBoxedPDF(boxedPDF);
            if (result == null) result = caseProbabilityDensityFunction(boxedPDF);
            if (result == null) result = caseProbabilityFunction(boxedPDF);
            if (result == null) result = caseUnitCarryingElement(boxedPDF);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.PROBABILITY_DENSITY_FUNCTION: {
            ProbabilityDensityFunction probabilityDensityFunction = (ProbabilityDensityFunction)theEObject;
            T1 result = caseProbabilityDensityFunction(probabilityDensityFunction);
            if (result == null) result = caseProbabilityFunction(probabilityDensityFunction);
            if (result == null) result = caseUnitCarryingElement(probabilityDensityFunction);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.PROBABILITY_FUNCTION: {
            ProbabilityFunction probabilityFunction = (ProbabilityFunction)theEObject;
            T1 result = caseProbabilityFunction(probabilityFunction);
            if (result == null) result = caseUnitCarryingElement(probabilityFunction);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.CONTINUOUS_SAMPLE: {
            ContinuousSample continuousSample = (ContinuousSample)theEObject;
            T1 result = caseContinuousSample(continuousSample);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.PROBABILITY_MASS_FUNCTION: {
            ProbabilityMassFunction probabilityMassFunction = (ProbabilityMassFunction)theEObject;
            T1 result = caseProbabilityMassFunction(probabilityMassFunction);
            if (result == null) result = caseProbabilityFunction(probabilityMassFunction);
            if (result == null) result = caseUnitCarryingElement(probabilityMassFunction);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.SAMPLE: {
            Sample<?> sample = (Sample<?>)theEObject;
            T1 result = caseSample(sample);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.SAMPLE_PDF: {
            SamplePDF samplePDF = (SamplePDF)theEObject;
            T1 result = caseSamplePDF(samplePDF);
            if (result == null) result = caseProbabilityDensityFunction(samplePDF);
            if (result == null) result = caseProbabilityFunction(samplePDF);
            if (result == null) result = caseUnitCarryingElement(samplePDF);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.COMPLEX: {
            Complex complex = (Complex)theEObject;
            T1 result = caseComplex(complex);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.CONTINUOUS_PDF: {
            ContinuousPDF continuousPDF = (ContinuousPDF)theEObject;
            T1 result = caseContinuousPDF(continuousPDF);
            if (result == null) result = caseProbabilityDensityFunction(continuousPDF);
            if (result == null) result = caseProbabilityFunction(continuousPDF);
            if (result == null) result = caseUnitCarryingElement(continuousPDF);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.EXPONENTIAL_DISTRIBUTION: {
            ExponentialDistribution exponentialDistribution = (ExponentialDistribution)theEObject;
            T1 result = caseExponentialDistribution(exponentialDistribution);
            if (result == null) result = caseContinuousPDF(exponentialDistribution);
            if (result == null) result = caseProbabilityDensityFunction(exponentialDistribution);
            if (result == null) result = caseProbabilityFunction(exponentialDistribution);
            if (result == null) result = caseUnitCarryingElement(exponentialDistribution);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION: {
            NormalDistribution normalDistribution = (NormalDistribution)theEObject;
            T1 result = caseNormalDistribution(normalDistribution);
            if (result == null) result = caseContinuousPDF(normalDistribution);
            if (result == null) result = caseProbabilityDensityFunction(normalDistribution);
            if (result == null) result = caseProbabilityFunction(normalDistribution);
            if (result == null) result = caseUnitCarryingElement(normalDistribution);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.LOGNORMAL_DISTRIBUTION: {
            LognormalDistribution lognormalDistribution = (LognormalDistribution)theEObject;
            T1 result = caseLognormalDistribution(lognormalDistribution);
            if (result == null) result = caseContinuousPDF(lognormalDistribution);
            if (result == null) result = caseProbabilityDensityFunction(lognormalDistribution);
            if (result == null) result = caseProbabilityFunction(lognormalDistribution);
            if (result == null) result = caseUnitCarryingElement(lognormalDistribution);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.GAMMA_DISTRIBUTION: {
            GammaDistribution gammaDistribution = (GammaDistribution)theEObject;
            T1 result = caseGammaDistribution(gammaDistribution);
            if (result == null) result = caseContinuousPDF(gammaDistribution);
            if (result == null) result = caseProbabilityDensityFunction(gammaDistribution);
            if (result == null) result = caseProbabilityFunction(gammaDistribution);
            if (result == null) result = caseUnitCarryingElement(gammaDistribution);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.ADVICE: {
            Advice advice = (Advice)theEObject;
            T1 result = caseAdvice(advice);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.GLOBAL_SCOPE: {
            GlobalScope globalScope = (GlobalScope)theEObject;
            T1 result = caseGlobalScope(globalScope);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.PER_JOIN_POINT_SCOPE: {
            PerJoinPointScope perJoinPointScope = (PerJoinPointScope)theEObject;
            T1 result = casePerJoinPointScope(perJoinPointScope);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Probfunction_av_pcPackage.POINTCUT: {
            Pointcut pointcut = (Pointcut)theEObject;
            T1 result = casePointcut(pointcut);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Boxed PDF</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Boxed PDF</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseBoxedPDF(BoxedPDF object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Probability Density Function</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Probability Density Function</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseProbabilityDensityFunction(ProbabilityDensityFunction object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Probability Function</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Probability Function</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseProbabilityFunction(ProbabilityFunction object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Continuous Sample</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Continuous Sample</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseContinuousSample(ContinuousSample object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Probability Mass Function</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Probability Mass Function</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseProbabilityMassFunction(ProbabilityMassFunction object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Sample</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Sample</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public <T> T1 caseSample(Sample<T> object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Sample PDF</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Sample PDF</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseSamplePDF(SamplePDF object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Complex</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Complex</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseComplex(Complex object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Continuous PDF</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Continuous PDF</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseContinuousPDF(ContinuousPDF object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Exponential Distribution</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Exponential Distribution</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseExponentialDistribution(ExponentialDistribution object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Normal Distribution</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Normal Distribution</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseNormalDistribution(NormalDistribution object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Lognormal Distribution</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Lognormal Distribution</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseLognormalDistribution(LognormalDistribution object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Gamma Distribution</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Gamma Distribution</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseGammaDistribution(GammaDistribution object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Advice</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Advice</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseAdvice(Advice object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Global Scope</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Global Scope</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseGlobalScope(GlobalScope object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Per Join Point Scope</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Per Join Point Scope</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 casePerJoinPointScope(PerJoinPointScope object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Pointcut</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Pointcut</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 casePointcut(Pointcut object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Unit Carrying Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Unit Carrying Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T1 caseUnitCarryingElement(UnitCarryingElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T1 defaultCase(EObject object) {
      return null;
   }

} //Probfunction_av_pcSwitch
