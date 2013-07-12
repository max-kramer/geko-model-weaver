/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceRequiringEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Required roles list the interfaces required by a component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RequiredRole#getRequiringEntity_RequiredRole <em>Requiring Entity Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRequiredRole()
 * @model
 * @generated
 */
public interface RequiredRole extends Role {
   /**
    * Returns the value of the '<em><b>Requiring Entity Required Role</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceRequiringEntity#getRequiredRoles_InterfaceRequiringEntity <em>Required Roles Interface Requiring Entity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the interface requiring entity that requires this interface.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Requiring Entity Required Role</em>' container reference.
    * @see #setRequiringEntity_RequiredRole(InterfaceRequiringEntity)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRequiredRole_RequiringEntity_RequiredRole()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceRequiringEntity#getRequiredRoles_InterfaceRequiringEntity
    * @model opposite="requiredRoles_InterfaceRequiringEntity" transient="false" ordered="false"
    * @generated
    */
   InterfaceRequiringEntity getRequiringEntity_RequiredRole();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RequiredRole#getRequiringEntity_RequiredRole <em>Requiring Entity Required Role</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Requiring Entity Required Role</em>' container reference.
    * @see #getRequiringEntity_RequiredRole()
    * @generated
    */
   void setRequiringEntity_RequiredRole(InterfaceRequiringEntity value);

} // RequiredRole
