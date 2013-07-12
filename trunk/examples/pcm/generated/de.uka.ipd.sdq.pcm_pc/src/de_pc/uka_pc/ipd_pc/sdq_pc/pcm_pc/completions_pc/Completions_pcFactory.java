/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc.Completions_pcPackage
 * @generated
 */
public interface Completions_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Completions_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc.impl.Completions_pcFactoryImpl.init();

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
   Completions_pcPackage getCompletions_pcPackage();

} //Completions_pcFactory
