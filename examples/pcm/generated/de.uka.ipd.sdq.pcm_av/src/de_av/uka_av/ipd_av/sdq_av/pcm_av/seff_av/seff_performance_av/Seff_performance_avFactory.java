/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.Seff_performance_avPackage
 * @generated
 */
public interface Seff_performance_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Seff_performance_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.Seff_performance_avFactoryImpl.init();

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
   Seff_performance_avPackage getSeff_performance_avPackage();

} //Seff_performance_avFactory
