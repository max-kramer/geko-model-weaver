/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Role;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.ResourceInterface;

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
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage#getResourceRequiredRole()
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
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage#getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole()
    * @model ordered="false"
    * @generated
    */
   ResourceInterface getRequiredResourceInterface__ResourceRequiredRole();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Resource Interface Resource Required Role</em>' reference.
    * @see #getRequiredResourceInterface__ResourceRequiredRole()
    * @generated
    */
   void setRequiredResourceInterface__ResourceRequiredRole(ResourceInterface value);

   /**
    * Returns the value of the '<em><b>Resource Interface Requiring Entity Resource Required Role</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference.
    * @see #setResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage#getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity
    * @model opposite="resourceRequiredRoles__ResourceInterfaceRequiringEntity" transient="false" ordered="false"
    * @generated
    */
   ResourceInterfaceRequiringEntity getResourceInterfaceRequiringEntity__ResourceRequiredRole();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Interface Requiring Entity Resource Required Role</em>' container reference.
    * @see #getResourceInterfaceRequiringEntity__ResourceRequiredRole()
    * @generated
    */
   void setResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity value);

} // ResourceRequiredRole
