/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characterised Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A characterised variable is a special variable which contains a performance abstraction of a data type. It can be transformed in a named reference and a variable characterisation. It has to end always with a variable characterisation type. Examples are "a.NUMBER_OF_ELEMENTS" or "array.STRUCTURE".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.CharacterisedVariable#getCharacterisationType <em>Characterisation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.Parameter_pc_avPackage#getCharacterisedVariable()
 * @model
 * @generated
 */
public interface CharacterisedVariable extends Variable {
   /**
    * Returns the value of the '<em><b>Characterisation Type</b></em>' attribute.
    * The literals are from the enumeration {@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableCharacterisationType}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * The type of the characterisation of the characterised variable. The type can be any of the varibale characterisation types, i.e., STRUCTURE, NUMBER_OF_ELEMENTS, TYPE, VALUE, or BYTESIZE.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Characterisation Type</em>' attribute.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableCharacterisationType
    * @see #setCharacterisationType(VariableCharacterisationType)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.Parameter_pc_avPackage#getCharacterisedVariable_CharacterisationType()
    * @model required="true" ordered="false"
    * @generated
    */
   VariableCharacterisationType getCharacterisationType();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.CharacterisedVariable#getCharacterisationType <em>Characterisation Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Characterisation Type</em>' attribute.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableCharacterisationType
    * @see #getCharacterisationType()
    * @generated
    */
   void setCharacterisationType(VariableCharacterisationType value);

} // CharacterisedVariable
