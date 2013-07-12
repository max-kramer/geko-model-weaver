/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.InterfaceProvidingEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provided roles list the interfaces offered by a component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ProvidedRole#getProvidingEntity_ProvidedRole <em>Providing Entity Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getProvidedRole()
 * @model
 * @generated
 */
public interface ProvidedRole extends Role {
   /**
    * Returns the value of the '<em><b>Providing Entity Provided Role</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.InterfaceProvidingEntity#getProvidedRoles_InterfaceProvidingEntity <em>Provided Roles Interface Providing Entity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the providing entity that is providing the interface associated with this role.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Providing Entity Provided Role</em>' container reference.
    * @see #setProvidingEntity_ProvidedRole(InterfaceProvidingEntity)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getProvidedRole_ProvidingEntity_ProvidedRole()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.InterfaceProvidingEntity#getProvidedRoles_InterfaceProvidingEntity
    * @model opposite="providedRoles_InterfaceProvidingEntity" transient="false" ordered="false"
    * @generated
    */
   InterfaceProvidingEntity getProvidingEntity_ProvidedRole();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ProvidedRole#getProvidingEntity_ProvidedRole <em>Providing Entity Provided Role</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Providing Entity Provided Role</em>' container reference.
    * @see #getProvidingEntity_ProvidedRole()
    * @generated
    */
   void setProvidingEntity_ProvidedRole(InterfaceProvidingEntity value);

} // ProvidedRole
