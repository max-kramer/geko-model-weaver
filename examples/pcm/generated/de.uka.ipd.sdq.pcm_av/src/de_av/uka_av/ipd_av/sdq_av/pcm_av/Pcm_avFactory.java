/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.Pcm_avPackage
 * @generated
 */
public interface Pcm_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Pcm_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Dummy Class</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Dummy Class</em>'.
    * @generated
    */
   DummyClass createDummyClass();

   /**
    * Returns a new object of class '<em>Advice</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Advice</em>'.
    * @generated
    */
   Advice createAdvice();

   /**
    * Returns a new object of class '<em>Global Scope</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Global Scope</em>'.
    * @generated
    */
   GlobalScope createGlobalScope();

   /**
    * Returns a new object of class '<em>Per Join Point Scope</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Per Join Point Scope</em>'.
    * @generated
    */
   PerJoinPointScope createPerJoinPointScope();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Pcm_avPackage getPcm_avPackage();

} //Pcm_avFactory
