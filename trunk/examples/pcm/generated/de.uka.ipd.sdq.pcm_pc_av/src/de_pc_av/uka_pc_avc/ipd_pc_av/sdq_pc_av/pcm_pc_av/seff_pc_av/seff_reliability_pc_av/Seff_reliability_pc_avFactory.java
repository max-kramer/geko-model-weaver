/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.Seff_reliability_pc_avPackage
 * @generated
 */
public interface Seff_reliability_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Seff_reliability_pc_avFactory eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.impl.Seff_reliability_pc_avFactoryImpl.init();

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
   Seff_reliability_pc_avPackage getSeff_reliability_pc_avPackage();

} //Seff_reliability_pc_avFactory
