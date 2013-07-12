/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity;

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
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.CollectionDataType#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage#getCollectionDataType()
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
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage#getCollectionDataType_InnerType_CollectionDataType()
    * @model ordered="false"
    * @generated
    */
   DataType getInnerType_CollectionDataType();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.CollectionDataType#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Inner Type Collection Data Type</em>' reference.
    * @see #getInnerType_CollectionDataType()
    * @generated
    */
   void setInnerType_CollectionDataType(DataType value);

} // CollectionDataType
