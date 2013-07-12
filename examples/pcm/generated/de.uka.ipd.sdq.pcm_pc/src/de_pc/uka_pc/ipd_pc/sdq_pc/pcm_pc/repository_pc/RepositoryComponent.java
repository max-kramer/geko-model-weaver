/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.InterfaceProvidingRequiringEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract superclass of all component types which can be part of a component repository
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.RepositoryComponent#getRepository__RepositoryComponent <em>Repository Repository Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage#getRepositoryComponent()
 * @model
 * @generated
 */
public interface RepositoryComponent extends InterfaceProvidingRequiringEntity {
   /**
    * Returns the value of the '<em><b>Repository Repository Component</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository#getComponents__Repository <em>Components Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the repository where this entity is stored.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Repository Repository Component</em>' container reference.
    * @see #setRepository__RepositoryComponent(Repository)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage#getRepositoryComponent_Repository__RepositoryComponent()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository#getComponents__Repository
    * @model opposite="components__Repository" transient="false" ordered="false"
    * @generated
    */
   Repository getRepository__RepositoryComponent();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.RepositoryComponent#getRepository__RepositoryComponent <em>Repository Repository Component</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Repository Repository Component</em>' container reference.
    * @see #getRepository__RepositoryComponent()
    * @generated
    */
   void setRepository__RepositoryComponent(Repository value);

} // RepositoryComponent
