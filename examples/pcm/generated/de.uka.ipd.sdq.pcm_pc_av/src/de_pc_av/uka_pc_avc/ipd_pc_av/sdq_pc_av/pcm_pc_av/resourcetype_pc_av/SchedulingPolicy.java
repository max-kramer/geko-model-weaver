/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage#getSchedulingPolicy()
 * @model
 * @generated
 */
public interface SchedulingPolicy extends Entity {
   /**
    * Returns the value of the '<em><b>Resource Repository Scheduling Policy</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceRepository#getSchedulingPolicies__ResourceRepository <em>Scheduling Policies Resource Repository</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Repository Scheduling Policy</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Repository Scheduling Policy</em>' container reference.
    * @see #setResourceRepository__SchedulingPolicy(ResourceRepository)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage#getSchedulingPolicy_ResourceRepository__SchedulingPolicy()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceRepository#getSchedulingPolicies__ResourceRepository
    * @model opposite="schedulingPolicies__ResourceRepository" transient="false" ordered="false"
    * @generated
    */
   ResourceRepository getResourceRepository__SchedulingPolicy();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Repository Scheduling Policy</em>' container reference.
    * @see #getResourceRepository__SchedulingPolicy()
    * @generated
    */
   void setResourceRepository__SchedulingPolicy(ResourceRepository value);

} // SchedulingPolicy
