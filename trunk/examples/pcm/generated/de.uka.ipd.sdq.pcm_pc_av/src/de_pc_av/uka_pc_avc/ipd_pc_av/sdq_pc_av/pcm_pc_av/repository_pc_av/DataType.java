/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a data type that can be stored in a repository and used for specification and modeling of interface signatures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.DataType#getRepository__DataType <em>Repository Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
   /**
    * Returns the value of the '<em><b>Repository Data Type</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getDataTypes__Repository <em>Data Types Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property specifies the repository to which this data type belongs.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Repository Data Type</em>' container reference.
    * @see #setRepository__DataType(Repository)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getDataType_Repository__DataType()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getDataTypes__Repository
    * @model opposite="dataTypes__Repository" transient="false" ordered="false"
    * @generated
    */
   Repository getRepository__DataType();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.DataType#getRepository__DataType <em>Repository Data Type</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Repository Data Type</em>' container reference.
    * @see #getRepository__DataType()
    * @generated
    */
   void setRepository__DataType(Repository value);

} // DataType
