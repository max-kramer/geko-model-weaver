/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingEntity;

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
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.ProvidedRole#getProvidingEntity_ProvidedRole <em>Providing Entity Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getProvidedRole()
 * @model
 * @generated
 */
public interface ProvidedRole extends Role {
   /**
    * Returns the value of the '<em><b>Providing Entity Provided Role</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingEntity#getProvidedRoles_InterfaceProvidingEntity <em>Provided Roles Interface Providing Entity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the providing entity that is providing the interface associated with this role.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Providing Entity Provided Role</em>' container reference.
    * @see #setProvidingEntity_ProvidedRole(InterfaceProvidingEntity)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getProvidedRole_ProvidingEntity_ProvidedRole()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingEntity#getProvidedRoles_InterfaceProvidingEntity
    * @model opposite="providedRoles_InterfaceProvidingEntity" transient="false" ordered="false"
    * @generated
    */
   InterfaceProvidingEntity getProvidingEntity_ProvidedRole();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.ProvidedRole#getProvidingEntity_ProvidedRole <em>Providing Entity Provided Role</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Providing Entity Provided Role</em>' container reference.
    * @see #getProvidingEntity_ProvidedRole()
    * @generated
    */
   void setProvidingEntity_ProvidedRole(InterfaceProvidingEntity value);

} // ProvidedRole
