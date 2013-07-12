/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.protocol_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.protocol_pc.Protocol_pcPackage
 * @generated
 */
public interface Protocol_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Protocol_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.protocol_pc.impl.Protocol_pcFactoryImpl.init();

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
   Protocol_pcPackage getProtocol_pcPackage();

} //Protocol_pcFactory
