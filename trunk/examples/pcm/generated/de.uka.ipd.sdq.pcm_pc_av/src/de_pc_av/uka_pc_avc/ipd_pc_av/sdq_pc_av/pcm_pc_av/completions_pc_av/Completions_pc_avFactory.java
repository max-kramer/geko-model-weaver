/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.Completions_pc_avPackage
 * @generated
 */
public interface Completions_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Completions_pc_avFactory eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.impl.Completions_pc_avFactoryImpl.init();

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
   Completions_pc_avPackage getCompletions_pc_avPackage();

} //Completions_pc_avFactory
