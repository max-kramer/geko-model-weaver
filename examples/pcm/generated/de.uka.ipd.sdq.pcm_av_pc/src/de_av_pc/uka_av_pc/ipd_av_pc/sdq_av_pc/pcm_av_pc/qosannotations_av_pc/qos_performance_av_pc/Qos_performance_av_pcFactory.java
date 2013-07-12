/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.Qos_performance_av_pcPackage
 * @generated
 */
public interface Qos_performance_av_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Qos_performance_av_pcFactory eINSTANCE = de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.impl.Qos_performance_av_pcFactoryImpl.init();

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
   Qos_performance_av_pcPackage getQos_performance_av_pcPackage();

} //Qos_performance_av_pcFactory
