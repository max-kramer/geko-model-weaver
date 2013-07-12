/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.Resourcetype_pcPackage#getSchedulingPolicy()
 * @model
 * @generated
 */
public interface SchedulingPolicy extends Entity {
   /**
    * Returns the value of the '<em><b>Resource Repository Scheduling Policy</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.ResourceRepository#getSchedulingPolicies__ResourceRepository <em>Scheduling Policies Resource Repository</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Repository Scheduling Policy</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Repository Scheduling Policy</em>' container reference.
    * @see #setResourceRepository__SchedulingPolicy(ResourceRepository)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.Resourcetype_pcPackage#getSchedulingPolicy_ResourceRepository__SchedulingPolicy()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.ResourceRepository#getSchedulingPolicies__ResourceRepository
    * @model opposite="schedulingPolicies__ResourceRepository" transient="false" ordered="false"
    * @generated
    */
   ResourceRepository getResourceRepository__SchedulingPolicy();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Repository Scheduling Policy</em>' container reference.
    * @see #getResourceRepository__SchedulingPolicy()
    * @generated
    */
   void setResourceRepository__SchedulingPolicy(ResourceRepository value);

} // SchedulingPolicy
