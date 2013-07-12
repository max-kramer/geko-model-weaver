/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Repository element of&nbsp;the resource environment
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceEnvironment#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceEnvironment#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avPackage#getResourceEnvironment()
 * @model
 * @generated
 */
public interface ResourceEnvironment extends NamedElement {
   /**
    * Returns the value of the '<em><b>Linking Resources Resource Environment</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource}.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Linking Resources Resource Environment</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Linking Resources Resource Environment</em>' containment reference list.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avPackage#getResourceEnvironment_LinkingResources__ResourceEnvironment()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource#getResourceEnvironment_LinkingResource
    * @model opposite="resourceEnvironment_LinkingResource" containment="true" ordered="false"
    * @generated
    */
   EList<LinkingResource> getLinkingResources__ResourceEnvironment();

   /**
    * Returns the value of the '<em><b>Resource Container Resource Environment</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer}.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Container Resource Environment</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Container Resource Environment</em>' containment reference list.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avPackage#getResourceEnvironment_ResourceContainer_ResourceEnvironment()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getResourceEnvironment_ResourceContainer
    * @model opposite="resourceEnvironment_ResourceContainer" containment="true" ordered="false"
    * @generated
    */
   EList<ResourceContainer> getResourceContainer_ResourceEnvironment();

} // ResourceEnvironment
