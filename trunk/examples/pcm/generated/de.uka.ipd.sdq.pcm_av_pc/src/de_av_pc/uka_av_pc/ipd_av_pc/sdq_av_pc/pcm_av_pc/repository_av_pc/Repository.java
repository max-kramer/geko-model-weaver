/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.FailureType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The repository entity allows storing components, data types, and interfaces to be fetched and reused for construction of component instances as well as new component types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository#getRepositoryDescription <em>Repository Description</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository#getComponents__Repository <em>Components Repository</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository#getInterfaces__Repository <em>Interfaces Repository</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository#getFailureTypes__Repository <em>Failure Types Repository</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository#getDataTypes__Repository <em>Data Types Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends Entity {
   /**
    * Returns the value of the '<em><b>Repository Description</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents a description of the repository.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Repository Description</em>' attribute.
    * @see #setRepositoryDescription(String)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRepository_RepositoryDescription()
    * @model unique="false" ordered="false"
    * @generated
    */
   String getRepositoryDescription();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository#getRepositoryDescription <em>Repository Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Repository Description</em>' attribute.
    * @see #getRepositoryDescription()
    * @generated
    */
   void setRepositoryDescription(String value);

   /**
    * Returns the value of the '<em><b>Components Repository</b></em>' containment reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RepositoryComponent}.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RepositoryComponent#getRepository__RepositoryComponent <em>Repository Repository Component</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the provides component types stored in the repository.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Components Repository</em>' containment reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRepository_Components__Repository()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RepositoryComponent#getRepository__RepositoryComponent
    * @model opposite="repository__RepositoryComponent" containment="true" ordered="false"
    * @generated
    */
   EList<RepositoryComponent> getComponents__Repository();

   /**
    * Returns the value of the '<em><b>Interfaces Repository</b></em>' containment reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Interface}.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Interface#getRepository__Interface <em>Repository Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the interfaces stored in the repository.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Interfaces Repository</em>' containment reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRepository_Interfaces__Repository()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Interface#getRepository__Interface
    * @model opposite="repository__Interface" containment="true" ordered="false"
    * @generated
    */
   EList<Interface> getInterfaces__Repository();

   /**
    * Returns the value of the '<em><b>Failure Types Repository</b></em>' containment reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.FailureType}.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.FailureType#getRepository__FailureType <em>Repository Failure Type</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Failure Types Repository</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Failure Types Repository</em>' containment reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRepository_FailureTypes__Repository()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.FailureType#getRepository__FailureType
    * @model opposite="repository__FailureType" containment="true" ordered="false"
    * @generated
    */
   EList<FailureType> getFailureTypes__Repository();

   /**
    * Returns the value of the '<em><b>Data Types Repository</b></em>' containment reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.DataType}.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.DataType#getRepository__DataType <em>Repository Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the data types stored in the repository.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Data Types Repository</em>' containment reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRepository_DataTypes__Repository()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.DataType#getRepository__DataType
    * @model opposite="repository__DataType" containment="true" ordered="false"
    * @generated
    */
   EList<DataType> getDataTypes__Repository();

} // Repository
