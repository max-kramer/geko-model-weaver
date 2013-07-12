/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extendable repository of resource types of the PCM. The resource type repository is intentionally left open to support
 * arbitrary resources in the future
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceRepository#getResourceInterfaces__ResourceRepository <em>Resource Interfaces Resource Repository</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceRepository#getSchedulingPolicies__ResourceRepository <em>Scheduling Policies Resource Repository</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceRepository#getAvailableResourceTypes_ResourceRepository <em>Available Resource Types Resource Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage#getResourceRepository()
 * @model
 * @generated
 */
public interface ResourceRepository extends EObject {
   /**
    * Returns the value of the '<em><b>Resource Interfaces Resource Repository</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceInterface}.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceInterface#getResourceRepository__ResourceInterface <em>Resource Repository Resource Interface</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Interfaces Resource Repository</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Interfaces Resource Repository</em>' containment reference list.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage#getResourceRepository_ResourceInterfaces__ResourceRepository()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceInterface#getResourceRepository__ResourceInterface
    * @model opposite="resourceRepository__ResourceInterface" containment="true" ordered="false"
    * @generated
    */
   EList<ResourceInterface> getResourceInterfaces__ResourceRepository();

   /**
    * Returns the value of the '<em><b>Scheduling Policies Resource Repository</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.SchedulingPolicy}.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Scheduling Policies Resource Repository</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Scheduling Policies Resource Repository</em>' containment reference list.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage#getResourceRepository_SchedulingPolicies__ResourceRepository()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.SchedulingPolicy#getResourceRepository__SchedulingPolicy
    * @model opposite="resourceRepository__SchedulingPolicy" containment="true" ordered="false"
    * @generated
    */
   EList<SchedulingPolicy> getSchedulingPolicies__ResourceRepository();

   /**
    * Returns the value of the '<em><b>Available Resource Types Resource Repository</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceType}.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceType#getResourceRepository_ResourceType <em>Resource Repository Resource Type</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Available Resource Types Resource Repository</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Available Resource Types Resource Repository</em>' containment reference list.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage#getResourceRepository_AvailableResourceTypes_ResourceRepository()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceType#getResourceRepository_ResourceType
    * @model opposite="resourceRepository_ResourceType" containment="true" ordered="false"
    * @generated
    */
   EList<ResourceType> getAvailableResourceTypes_ResourceRepository();

} // ResourceRepository
