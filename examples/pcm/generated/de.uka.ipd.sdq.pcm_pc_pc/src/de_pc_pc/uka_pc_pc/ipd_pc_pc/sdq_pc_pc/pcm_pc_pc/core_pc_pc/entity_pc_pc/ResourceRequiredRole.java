/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Role;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.ResourceInterface;

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
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage#getResourceRequiredRole()
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
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage#getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole()
    * @model ordered="false"
    * @generated
    */
   ResourceInterface getRequiredResourceInterface__ResourceRequiredRole();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Resource Interface Resource Required Role</em>' reference.
    * @see #getRequiredResourceInterface__ResourceRequiredRole()
    * @generated
    */
   void setRequiredResourceInterface__ResourceRequiredRole(ResourceInterface value);

   /**
    * Returns the value of the '<em><b>Resource Interface Requiring Entity Resource Required Role</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference.
    * @see #setResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage#getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity
    * @model opposite="resourceRequiredRoles__ResourceInterfaceRequiringEntity" transient="false" ordered="false"
    * @generated
    */
   ResourceInterfaceRequiringEntity getResourceInterfaceRequiringEntity__ResourceRequiredRole();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference.
    * @see #getResourceInterfaceRequiringEntity__ResourceRequiredRole()
    * @generated
    */
   void setResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity value);

} // ResourceRequiredRole
