/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a primitive data type such as integer, string, and double.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PrimitiveDataType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage#getPrimitiveDataType()
 * @model
 * @generated
 */
public interface PrimitiveDataType extends DataType {
   /**
    * Returns the value of the '<em><b>Type</b></em>' attribute.
    * The literals are from the enumeration {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PrimitiveTypeEnum}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represent the base type of this type, e.g., if this type represents the integer interval (1..5), the base type will be INT.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Type</em>' attribute.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PrimitiveTypeEnum
    * @see #setType(PrimitiveTypeEnum)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage#getPrimitiveDataType_Type()
    * @model required="true" ordered="false"
    * @generated
    */
   PrimitiveTypeEnum getType();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PrimitiveDataType#getType <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Type</em>' attribute.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PrimitiveTypeEnum
    * @see #getType()
    * @generated
    */
   void setType(PrimitiveTypeEnum value);

} // PrimitiveDataType
