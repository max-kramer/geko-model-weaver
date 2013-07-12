/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System_avPackage
 * @generated
 */
public interface System_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   System_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.impl.System_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>System</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>System</em>'.
    * @generated
    */
   System createSystem();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   System_avPackage getSystem_avPackage();

} //System_avFactory
