/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents the required operation interfaces. The PCM uses the association of an operation interface to a component to determine its role. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationRequiredRole#getRequiredInterface__OperationRequiredRole <em>Required Interface Operation Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getOperationRequiredRole()
 * @model
 * @generated
 */
public interface OperationRequiredRole extends RequiredRole {
   /**
    * Returns the value of the '<em><b>Required Interface Operation Required Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the interfaces that is required by this role.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Required Interface Operation Required Role</em>' reference.
    * @see #setRequiredInterface__OperationRequiredRole(OperationInterface)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getOperationRequiredRole_RequiredInterface__OperationRequiredRole()
    * @model ordered="false"
    * @generated
    */
   OperationInterface getRequiredInterface__OperationRequiredRole();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationRequiredRole#getRequiredInterface__OperationRequiredRole <em>Required Interface Operation Required Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Interface Operation Required Role</em>' reference.
    * @see #getRequiredInterface__OperationRequiredRole()
    * @generated
    */
   void setRequiredInterface__OperationRequiredRole(OperationInterface value);

} // OperationRequiredRole
