/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier_pcPackage
 * @generated
 */
public interface Identifier_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Identifier_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.Identifier_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Identifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Identifier</em>'.
    * @generated
    */
   Identifier createIdentifier();

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
   Identifier_pcPackage getIdentifier_pcPackage();

} //Identifier_pcFactory
