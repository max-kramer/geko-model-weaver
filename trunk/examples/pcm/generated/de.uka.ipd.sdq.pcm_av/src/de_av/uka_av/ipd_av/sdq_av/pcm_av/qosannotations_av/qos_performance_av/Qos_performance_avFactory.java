/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av.Qos_performance_avPackage
 * @generated
 */
public interface Qos_performance_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Qos_performance_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av.impl.Qos_performance_avFactoryImpl.init();

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
   Qos_performance_avPackage getQos_performance_avPackage();

} //Qos_performance_avFactory
