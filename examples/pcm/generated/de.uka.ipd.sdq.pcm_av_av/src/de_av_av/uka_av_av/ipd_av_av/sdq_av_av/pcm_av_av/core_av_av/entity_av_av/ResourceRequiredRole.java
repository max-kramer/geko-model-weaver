/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Role;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ResourceInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Required role for resource interface access of a component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage#getResourceRequiredRole()
 * @model
 * @generated
 */
public interface ResourceRequiredRole extends Role {
   /**
    * Returns the value of the '<em><b>Required Resource Interface Resource Required Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Required Resource Interface Resource Required Role</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Required Resource Interface Resource Required Role</em>' reference.
    * @see #setRequiredResourceInterface__ResourceRequiredRole(ResourceInterface)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage#getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole()
    * @model ordered="false"
    * @generated
    */
   ResourceInterface getRequiredResourceInterface__ResourceRequiredRole();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Resource Interface Resource Required Role</em>' reference.
    * @see #getRequiredResourceInterface__ResourceRequiredRole()
    * @generated
    */
   void setRequiredResourceInterface__ResourceRequiredRole(ResourceInterface value);

   /**
    * Returns the value of the '<em><b>Resource Interface Requiring Entity Resource Required Role</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference.
    * @see #setResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage#getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity
    * @model opposite="resourceRequiredRoles__ResourceInterfaceRequiringEntity" transient="false" ordered="false"
    * @generated
    */
   ResourceInterfaceRequiringEntity getResourceInterfaceRequiringEntity__ResourceRequiredRole();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference.
    * @see #getResourceInterfaceRequiringEntity__ResourceRequiredRole()
    * @generated
    */
   void setResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity value);

} // ResourceRequiredRole
