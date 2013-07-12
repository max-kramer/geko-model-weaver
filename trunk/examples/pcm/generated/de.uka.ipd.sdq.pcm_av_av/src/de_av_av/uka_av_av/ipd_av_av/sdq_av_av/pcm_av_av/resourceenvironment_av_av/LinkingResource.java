/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model&nbsp;element&nbsp;representing&nbsp;communication&nbsp;links&nbsp;like&nbsp;LAN,&nbsp;WAN,&nbsp;WiFi&nbsp;etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.LinkingResource#getConnectedResourceContainers_LinkingResource <em>Connected Resource Containers Linking Resource</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage#getLinkingResource()
 * @model
 * @generated
 */
public interface LinkingResource extends Entity {
   /**
    * Returns the value of the '<em><b>Connected Resource Containers Linking Resource</b></em>' reference list.
    * The list contents are of type {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.ResourceContainer}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Connected Resource Containers Linking Resource</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Connected Resource Containers Linking Resource</em>' reference list.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage#getLinkingResource_ConnectedResourceContainers_LinkingResource()
    * @model ordered="false"
    * @generated
    */
   EList<ResourceContainer> getConnectedResourceContainers_LinkingResource();

   /**
    * Returns the value of the '<em><b>Communication Link Resource Specifications Linking Resource</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Communication Link Resource Specifications Linking Resource</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Communication Link Resource Specifications Linking Resource</em>' containment reference.
    * @see #setCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage#getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification
    * @model opposite="linkingResource_CommunicationLinkResourceSpecification" containment="true" ordered="false"
    * @generated
    */
   CommunicationLinkResourceSpecification getCommunicationLinkResourceSpecifications_LinkingResource();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Communication Link Resource Specifications Linking Resource</em>' containment reference.
    * @see #getCommunicationLinkResourceSpecifications_LinkingResource()
    * @generated
    */
   void setCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification value);

   /**
    * Returns the value of the '<em><b>Resource Environment Linking Resource</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.ResourceEnvironment#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Environment Linking Resource</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Environment Linking Resource</em>' container reference.
    * @see #setResourceEnvironment_LinkingResource(ResourceEnvironment)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage#getLinkingResource_ResourceEnvironment_LinkingResource()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.ResourceEnvironment#getLinkingResources__ResourceEnvironment
    * @model opposite="linkingResources__ResourceEnvironment" transient="false" ordered="false"
    * @generated
    */
   ResourceEnvironment getResourceEnvironment_LinkingResource();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Environment Linking Resource</em>' container reference.
    * @see #getResourceEnvironment_LinkingResource()
    * @generated
    */
   void setResourceEnvironment_LinkingResource(ResourceEnvironment value);

} // LinkingResource
