/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.Identifier_pc_avPackage
 * @generated
 */
public interface Identifier_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Identifier_pc_avFactory eINSTANCE = de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.impl.Identifier_pc_avFactoryImpl.init();

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
   Identifier_pc_avPackage getIdentifier_pc_avPackage();

} //Identifier_pc_avFactory
