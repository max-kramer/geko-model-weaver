/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.protocol_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.protocol_av.Protocol_avPackage
 * @generated
 */
public interface Protocol_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Protocol_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.protocol_av.impl.Protocol_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Protocol</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Protocol</em>'.
    * @generated
    */
   Protocol createProtocol();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Protocol_avPackage getProtocol_avPackage();

} //Protocol_avFactory
