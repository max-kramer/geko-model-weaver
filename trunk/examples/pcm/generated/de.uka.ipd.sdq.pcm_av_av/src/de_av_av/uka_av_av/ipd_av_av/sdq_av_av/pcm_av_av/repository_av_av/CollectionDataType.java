/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a collection data type, e.g.,. a list, array, set, of items of the a particular type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.CollectionDataType#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getCollectionDataType()
 * @model
 * @generated
 */
public interface CollectionDataType extends Entity, DataType {
   /**
    * Returns the value of the '<em><b>Inner Type Collection Data Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the type of items contained in the collection data type.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Inner Type Collection Data Type</em>' reference.
    * @see #setInnerType_CollectionDataType(DataType)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getCollectionDataType_InnerType_CollectionDataType()
    * @model ordered="false"
    * @generated
    */
   DataType getInnerType_CollectionDataType();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.CollectionDataType#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Inner Type Collection Data Type</em>' reference.
    * @see #getInnerType_CollectionDataType()
    * @generated
    */
   void setInnerType_CollectionDataType(DataType value);

} // CollectionDataType
