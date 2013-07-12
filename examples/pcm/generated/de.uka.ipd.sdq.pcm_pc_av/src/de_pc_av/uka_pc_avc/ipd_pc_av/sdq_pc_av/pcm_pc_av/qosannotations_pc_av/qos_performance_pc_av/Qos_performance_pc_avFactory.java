/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.Qos_performance_pc_avPackage
 * @generated
 */
public interface Qos_performance_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Qos_performance_pc_avFactory eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.impl.Qos_performance_pc_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>System Specified Execution Time</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>System Specified Execution Time</em>'.
    * @generated
    */
   SystemSpecifiedExecutionTime createSystemSpecifiedExecutionTime();

   /**
    * Returns a new object of class '<em>Specified Execution Time</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Specified Execution Time</em>'.
    * @generated
    */
   SpecifiedExecutionTime createSpecifiedExecutionTime();

   /**
    * Returns a new object of class '<em>Component Specified Execution Time</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Component Specified Execution Time</em>'.
    * @generated
    */
   ComponentSpecifiedExecutionTime createComponentSpecifiedExecutionTime();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Qos_performance_pc_avPackage getQos_performance_pc_avPackage();

} //Qos_performance_pc_avFactory
