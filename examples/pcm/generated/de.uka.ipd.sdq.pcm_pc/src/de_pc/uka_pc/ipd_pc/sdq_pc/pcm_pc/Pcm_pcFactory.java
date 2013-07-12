/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pcm_pcPackage
 * @generated
 */
public interface Pcm_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Pcm_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.Pcm_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Dummy Class</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Dummy Class</em>'.
    * @generated
    */
   DummyClass createDummyClass();

   /**
    * Returns a new object of class '<em>Pointcut</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Pointcut</em>'.
    * @generated
    */
   Pointcut createPointcut();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Pcm_pcPackage getPcm_pcPackage();

} //Pcm_pcFactory
