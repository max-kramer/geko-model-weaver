/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole <em>Required Interface Infrastructure Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage#getInfrastructureRequiredRole()
 * @model
 * @generated
 */
public interface InfrastructureRequiredRole extends RequiredRole {
   /**
    * Returns the value of the '<em><b>Required Interface Infrastructure Required Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Required Interface Infrastructure Required Role</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Required Interface Infrastructure Required Role</em>' reference.
    * @see #setRequiredInterface__InfrastructureRequiredRole(InfrastructureInterface)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage#getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole()
    * @model ordered="false"
    * @generated
    */
   InfrastructureInterface getRequiredInterface__InfrastructureRequiredRole();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole <em>Required Interface Infrastructure Required Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Interface Infrastructure Required Role</em>' reference.
    * @see #getRequiredInterface__InfrastructureRequiredRole()
    * @generated
    */
   void setRequiredInterface__InfrastructureRequiredRole(InfrastructureInterface value);

} // InfrastructureRequiredRole
