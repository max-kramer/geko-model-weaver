/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage
 * @generated
 */
public interface Core_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Core_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.impl.Core_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>PCM Random Variable</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>PCM Random Variable</em>'.
    * @generated
    */
   PCMRandomVariable createPCMRandomVariable();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Core_avPackage getCore_avPackage();

} //Core_avFactory
