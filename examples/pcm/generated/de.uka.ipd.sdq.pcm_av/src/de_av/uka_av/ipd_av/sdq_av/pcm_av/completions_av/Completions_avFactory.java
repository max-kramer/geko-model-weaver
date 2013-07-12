/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.Completions_avPackage
 * @generated
 */
public interface Completions_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Completions_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl.Completions_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Completion</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Completion</em>'.
    * @generated
    */
   Completion createCompletion();

   /**
    * Returns a new object of class '<em>Completion Repository</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Completion Repository</em>'.
    * @generated
    */
   CompletionRepository createCompletionRepository();

   /**
    * Returns a new object of class '<em>Delegating External Call Action</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Delegating External Call Action</em>'.
    * @generated
    */
   DelegatingExternalCallAction createDelegatingExternalCallAction();

   /**
    * Returns a new object of class '<em>Network Demand Parametric Resource Demand</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Network Demand Parametric Resource Demand</em>'.
    * @generated
    */
   NetworkDemandParametricResourceDemand createNetworkDemandParametricResourceDemand();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Completions_avPackage getCompletions_avPackage();

} //Completions_avFactory
