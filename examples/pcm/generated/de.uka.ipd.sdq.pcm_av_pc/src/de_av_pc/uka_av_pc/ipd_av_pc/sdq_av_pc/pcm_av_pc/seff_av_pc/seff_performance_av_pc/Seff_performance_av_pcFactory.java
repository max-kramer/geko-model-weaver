/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.Seff_performance_av_pcPackage
 * @generated
 */
public interface Seff_performance_av_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Seff_performance_av_pcFactory eINSTANCE = de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.impl.Seff_performance_av_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Infrastructure Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Infrastructure Call</em>'.
    * @generated
    */
   InfrastructureCall createInfrastructureCall();

   /**
    * Returns a new object of class '<em>Resource Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Resource Call</em>'.
    * @generated
    */
   ResourceCall createResourceCall();

   /**
    * Returns a new object of class '<em>Parametric Resource Demand</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Parametric Resource Demand</em>'.
    * @generated
    */
   ParametricResourceDemand createParametricResourceDemand();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Seff_performance_av_pcPackage getSeff_performance_av_pcPackage();

} //Seff_performance_av_pcFactory
