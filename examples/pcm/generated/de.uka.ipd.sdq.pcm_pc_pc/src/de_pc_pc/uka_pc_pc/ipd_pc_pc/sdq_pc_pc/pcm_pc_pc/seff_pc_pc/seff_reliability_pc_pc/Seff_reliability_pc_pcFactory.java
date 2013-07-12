/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage
 * @generated
 */
public interface Seff_reliability_pc_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Seff_reliability_pc_pcFactory eINSTANCE = de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.impl.Seff_reliability_pc_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Recovery Action Behaviour</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Recovery Action Behaviour</em>'.
    * @generated
    */
   RecoveryActionBehaviour createRecoveryActionBehaviour();

   /**
    * Returns a new object of class '<em>Recovery Action</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Recovery Action</em>'.
    * @generated
    */
   RecoveryAction createRecoveryAction();

   /**
    * Returns a new object of class '<em>Failure Handling Entity</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Failure Handling Entity</em>'.
    * @generated
    */
   FailureHandlingEntity createFailureHandlingEntity();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Seff_reliability_pc_pcPackage getSeff_reliability_pc_pcPackage();

} //Seff_reliability_pc_pcFactory
