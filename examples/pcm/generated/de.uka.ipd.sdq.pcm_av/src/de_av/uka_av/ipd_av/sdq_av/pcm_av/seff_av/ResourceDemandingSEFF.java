/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av;

import de_av.uka_av.ipd_av.sdq_av.identifier_av.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Demanding SEFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource demanding service effect specification (RDSEFF) is a special type of SEFF designed for performance and reliability predictions. Besides dependencies between provided and required services of a component, it additionally includes notions of resource usage, data flow, and parametric dependencies for more accurate predictions. Its control flow is hierarchically structured and can be enhanced with transition probabilities on branches and numbers of iterations on loops.
 * A ResourceDemandingSEFF is a ServiceEffectSpecification and a Resource-DemandingBehaviour at the same time inheriting from both classes. The reason for this construct lies in the fact, that ResourceDemandingBehaviours can be used recursively inside themselves to describe loop bodies or branched behaviours (explained later), and these inner behaviours should not be RDSEFFs themselves
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ResourceDemandingSEFF#getResourceDemandingInternalBehaviours <em>Resource Demanding Internal Behaviours</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getResourceDemandingSEFF()
 * @model
 * @generated
 */
public interface ResourceDemandingSEFF extends Identifier, ServiceEffectSpecification, ResourceDemandingBehaviour {
   /**
    * Returns the value of the '<em><b>Resource Demanding Internal Behaviours</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ResourceDemandingInternalBehaviour}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ResourceDemandingInternalBehaviour#getResourceDemandingSEFF_ResourceDemandingInternalBehaviour <em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Demanding Internal Behaviours</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Demanding Internal Behaviours</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getResourceDemandingSEFF_ResourceDemandingInternalBehaviours()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ResourceDemandingInternalBehaviour#getResourceDemandingSEFF_ResourceDemandingInternalBehaviour
    * @model opposite="resourceDemandingSEFF_ResourceDemandingInternalBehaviour" containment="true" ordered="false"
    * @generated
    */
   EList<ResourceDemandingInternalBehaviour> getResourceDemandingInternalBehaviours();

} // ResourceDemandingSEFF
