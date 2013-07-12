/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Demanding Internal Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class representing component-internal behaviour not accessible from the component's interface. Comparable to internal method in object-oriented programming. This behaviour can be called from within a resource demanding behaviour using an InternalCallAction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingInternalBehaviour#getResourceDemandingSEFF_ResourceDemandingInternalBehaviour <em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage#getResourceDemandingInternalBehaviour()
 * @model
 * @generated
 */
public interface ResourceDemandingInternalBehaviour extends ResourceDemandingBehaviour {
   /**
    * Returns the value of the '<em><b>Resource Demanding SEFF Resource Demanding Internal Behaviour</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingSEFF#getResourceDemandingInternalBehaviours <em>Resource Demanding Internal Behaviours</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>' container reference.
    * @see #setResourceDemandingSEFF_ResourceDemandingInternalBehaviour(ResourceDemandingSEFF)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage#getResourceDemandingInternalBehaviour_ResourceDemandingSEFF_ResourceDemandingInternalBehaviour()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingSEFF#getResourceDemandingInternalBehaviours
    * @model opposite="resourceDemandingInternalBehaviours" transient="false" ordered="false"
    * @generated
    */
   ResourceDemandingSEFF getResourceDemandingSEFF_ResourceDemandingInternalBehaviour();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingInternalBehaviour#getResourceDemandingSEFF_ResourceDemandingInternalBehaviour <em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>' container reference.
    * @see #getResourceDemandingSEFF_ResourceDemandingInternalBehaviour()
    * @generated
    */
   void setResourceDemandingSEFF_ResourceDemandingInternalBehaviour(ResourceDemandingSEFF value);

} // ResourceDemandingInternalBehaviour
