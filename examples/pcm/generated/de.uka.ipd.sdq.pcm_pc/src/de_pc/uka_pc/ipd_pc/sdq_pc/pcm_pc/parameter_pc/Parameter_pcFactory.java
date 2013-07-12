/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.Parameter_pcPackage
 * @generated
 */
public interface Parameter_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Parameter_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.impl.Parameter_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Variable Usage</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Variable Usage</em>'.
    * @generated
    */
   VariableUsage createVariableUsage();

   /**
    * Returns a new object of class '<em>Variable Characterisation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Variable Characterisation</em>'.
    * @generated
    */
   VariableCharacterisation createVariableCharacterisation();

   /**
    * Returns a new object of class '<em>Characterised Variable</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Characterised Variable</em>'.
    * @generated
    */
   CharacterisedVariable createCharacterisedVariable();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Parameter_pcPackage getParameter_pcPackage();

} //Parameter_pcFactory
