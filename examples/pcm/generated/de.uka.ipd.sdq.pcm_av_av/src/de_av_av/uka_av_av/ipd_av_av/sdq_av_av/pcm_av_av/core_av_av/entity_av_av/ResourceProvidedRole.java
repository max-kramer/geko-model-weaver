/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Role;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ResourceInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Provided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceProvidedRole#getProvidedResourceInterface__ResourceProvidedRole <em>Provided Resource Interface Resource Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage#getResourceProvidedRole()
 * @model
 * @generated
 */
public interface ResourceProvidedRole extends Role {
   /**
    * Returns the value of the '<em><b>Resource Interface Providing Entity Resource Provided Role</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity <em>Resource Provided Roles Resource Interface Providing Entity</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Interface Providing Entity Resource Provided Role</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Interface Providing Entity Resource Provided Role</em>' container reference.
    * @see #setResourceInterfaceProvidingEntity__ResourceProvidedRole(ResourceInterfaceProvidingEntity)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage#getResourceProvidedRole_ResourceInterfaceProvidingEntity__ResourceProvidedRole()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity
    * @model opposite="resourceProvidedRoles__ResourceInterfaceProvidingEntity" transient="false" ordered="false"
    * @generated
    */
   ResourceInterfaceProvidingEntity getResourceInterfaceProvidingEntity__ResourceProvidedRole();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Interface Providing Entity Resource Provided Role</em>' container reference.
    * @see #getResourceInterfaceProvidingEntity__ResourceProvidedRole()
    * @generated
    */
   void setResourceInterfaceProvidingEntity__ResourceProvidedRole(ResourceInterfaceProvidingEntity value);

   /**
    * Returns the value of the '<em><b>Provided Resource Interface Resource Provided Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Provided Resource Interface Resource Provided Role</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Provided Resource Interface Resource Provided Role</em>' reference.
    * @see #setProvidedResourceInterface__ResourceProvidedRole(ResourceInterface)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage#getResourceProvidedRole_ProvidedResourceInterface__ResourceProvidedRole()
    * @model ordered="false"
    * @generated
    */
   ResourceInterface getProvidedResourceInterface__ResourceProvidedRole();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.ResourceProvidedRole#getProvidedResourceInterface__ResourceProvidedRole <em>Provided Resource Interface Resource Provided Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Provided Resource Interface Resource Provided Role</em>' reference.
    * @see #getProvidedResourceInterface__ResourceProvidedRole()
    * @generated
    */
   void setProvidedResourceInterface__ResourceProvidedRole(ResourceInterface value);

} // ResourceProvidedRole
