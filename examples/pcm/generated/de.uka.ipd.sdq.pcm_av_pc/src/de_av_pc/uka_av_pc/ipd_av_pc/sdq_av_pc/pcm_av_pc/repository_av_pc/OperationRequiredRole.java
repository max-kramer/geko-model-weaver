/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc;


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
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.OperationRequiredRole#getRequiredInterface__OperationRequiredRole <em>Required Interface Operation Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getOperationRequiredRole()
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
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getOperationRequiredRole_RequiredInterface__OperationRequiredRole()
    * @model ordered="false"
    * @generated
    */
   OperationInterface getRequiredInterface__OperationRequiredRole();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.OperationRequiredRole#getRequiredInterface__OperationRequiredRole <em>Required Interface Operation Required Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Interface Operation Required Role</em>' reference.
    * @see #getRequiredInterface__OperationRequiredRole()
    * @generated
    */
   void setRequiredInterface__OperationRequiredRole(OperationInterface value);

} // OperationRequiredRole
