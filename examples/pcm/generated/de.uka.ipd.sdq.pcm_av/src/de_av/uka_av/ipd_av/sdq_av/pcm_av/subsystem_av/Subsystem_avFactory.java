/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.subsystem_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.subsystem_av.Subsystem_avPackage
 * @generated
 */
public interface Subsystem_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Subsystem_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.subsystem_av.impl.Subsystem_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Sub System</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Sub System</em>'.
    * @generated
    */
   SubSystem createSubSystem();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Subsystem_avPackage getSubsystem_avPackage();

} //Subsystem_avFactory
