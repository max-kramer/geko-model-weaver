/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.NetworkInducedFailureType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ResourceType representing communication links like, LAN, WAN, WiFi etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.CommunicationLinkResourceType#getNetworkInducedFailureType__CommunicationLinkResourceType <em>Network Induced Failure Type Communication Link Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.Resourcetype_pc_pcPackage#getCommunicationLinkResourceType()
 * @model
 * @generated
 */
public interface CommunicationLinkResourceType extends ResourceType {
   /**
    * Returns the value of the '<em><b>Network Induced Failure Type Communication Link Resource Type</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Network Induced Failure Type Communication Link Resource Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Network Induced Failure Type Communication Link Resource Type</em>' reference.
    * @see #setNetworkInducedFailureType__CommunicationLinkResourceType(NetworkInducedFailureType)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.Resourcetype_pc_pcPackage#getCommunicationLinkResourceType_NetworkInducedFailureType__CommunicationLinkResourceType()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType
    * @model opposite="communicationLinkResourceType__NetworkInducedFailureType" ordered="false"
    * @generated
    */
   NetworkInducedFailureType getNetworkInducedFailureType__CommunicationLinkResourceType();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.CommunicationLinkResourceType#getNetworkInducedFailureType__CommunicationLinkResourceType <em>Network Induced Failure Type Communication Link Resource Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Network Induced Failure Type Communication Link Resource Type</em>' reference.
    * @see #getNetworkInducedFailureType__CommunicationLinkResourceType()
    * @generated
    */
   void setNetworkInducedFailureType__CommunicationLinkResourceType(NetworkInducedFailureType value);

} // CommunicationLinkResourceType
