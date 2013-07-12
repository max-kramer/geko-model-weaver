/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier_pc_pcPackage
 * @generated
 */
public interface Identifier_pc_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Identifier_pc_pcFactory eINSTANCE = de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.impl.Identifier_pc_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Identifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Identifier</em>'.
    * @generated
    */
   Identifier createIdentifier();

   /**
    * Returns a new object of class '<em>Pointcut Pointcut</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Pointcut Pointcut</em>'.
    * @generated
    */
   PointcutPointcut createPointcutPointcut();

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
   Identifier_pc_pcPackage getIdentifier_pc_pcPackage();

} //Identifier_pc_pcFactory
