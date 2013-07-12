/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a complex data type containing other data types. This construct is common in higher programming languages as record, struct, or class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeDataType#getParentType_CompositeDataType <em>Parent Type Composite Data Type</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeDataType#getInnerDeclaration_CompositeDataType <em>Inner Declaration Composite Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getCompositeDataType()
 * @model
 * @generated
 */
public interface CompositeDataType extends Entity, DataType {
   /**
    * Returns the value of the '<em><b>Parent Type Composite Data Type</b></em>' reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeDataType}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the parent type in the inheritance hierarchy. Null if there is no parent.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Parent Type Composite Data Type</em>' reference list.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getCompositeDataType_ParentType_CompositeDataType()
    * @model ordered="false"
    * @generated
    */
   EList<CompositeDataType> getParentType_CompositeDataType();

   /**
    * Returns the value of the '<em><b>Inner Declaration Composite Data Type</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InnerDeclaration}.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InnerDeclaration#getCompositeDataType_InnerDeclaration <em>Composite Data Type Inner Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the internals, i.e., named items, each of a data type, forming this composite data type.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Inner Declaration Composite Data Type</em>' containment reference list.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getCompositeDataType_InnerDeclaration_CompositeDataType()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InnerDeclaration#getCompositeDataType_InnerDeclaration
    * @model opposite="compositeDataType_InnerDeclaration" containment="true" ordered="false"
    * @generated
    */
   EList<InnerDeclaration> getInnerDeclaration_CompositeDataType();

} // CompositeDataType
