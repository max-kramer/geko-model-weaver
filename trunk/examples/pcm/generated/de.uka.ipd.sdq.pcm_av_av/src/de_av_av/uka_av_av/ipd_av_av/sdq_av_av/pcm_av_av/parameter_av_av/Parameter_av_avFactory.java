/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.Parameter_av_avPackage
 * @generated
 */
public interface Parameter_av_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Parameter_av_avFactory eINSTANCE = de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.impl.Parameter_av_avFactoryImpl.init();

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
   Parameter_av_avPackage getParameter_av_avPackage();

} //Parameter_av_avFactory
