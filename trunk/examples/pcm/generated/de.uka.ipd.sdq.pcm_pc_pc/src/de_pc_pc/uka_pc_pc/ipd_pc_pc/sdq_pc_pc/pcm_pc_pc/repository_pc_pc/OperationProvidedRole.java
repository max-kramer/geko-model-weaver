/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Provided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents the provided operation interfaces. The PCM uses the association of an operation interface to a component to determine its role. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.OperationProvidedRole#getProvidedInterface__OperationProvidedRole <em>Provided Interface Operation Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage#getOperationProvidedRole()
 * @model
 * @generated
 */
public interface OperationProvidedRole extends ProvidedRole {
   /**
    * Returns the value of the '<em><b>Provided Interface Operation Provided Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the corresponding interface that is provided by this role.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Provided Interface Operation Provided Role</em>' reference.
    * @see #setProvidedInterface__OperationProvidedRole(OperationInterface)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage#getOperationProvidedRole_ProvidedInterface__OperationProvidedRole()
    * @model ordered="false"
    * @generated
    */
   OperationInterface getProvidedInterface__OperationProvidedRole();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.OperationProvidedRole#getProvidedInterface__OperationProvidedRole <em>Provided Interface Operation Provided Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Provided Interface Operation Provided Role</em>' reference.
    * @see #getProvidedInterface__OperationProvidedRole()
    * @generated
    */
   void setProvidedInterface__OperationProvidedRole(OperationInterface value);

} // OperationProvidedRole
