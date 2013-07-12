/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.CommunicationLinkResourceType;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Type definition for a network-induced failure, i.e. a failure-on-demand occurrence&nbsp;due to a communication link
 *     fault. One standard type&nbsp;is pre-defined according to the pre-defined CommunicationLinkResourceType: LAN.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.Reliability_pc_pcPackage#getNetworkInducedFailureType()
 * @model
 * @generated
 */
public interface NetworkInducedFailureType extends FailureType {
   /**
    * Returns the value of the '<em><b>Communication Link Resource Type Network Induced Failure Type</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.CommunicationLinkResourceType#getNetworkInducedFailureType__CommunicationLinkResourceType <em>Network Induced Failure Type Communication Link Resource Type</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Communication Link Resource Type Network Induced Failure Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Communication Link Resource Type Network Induced Failure Type</em>' reference.
    * @see #setCommunicationLinkResourceType__NetworkInducedFailureType(CommunicationLinkResourceType)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.Reliability_pc_pcPackage#getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.CommunicationLinkResourceType#getNetworkInducedFailureType__CommunicationLinkResourceType
    * @model opposite="networkInducedFailureType__CommunicationLinkResourceType" ordered="false"
    * @generated
    */
   CommunicationLinkResourceType getCommunicationLinkResourceType__NetworkInducedFailureType();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Communication Link Resource Type Network Induced Failure Type</em>' reference.
    * @see #getCommunicationLinkResourceType__NetworkInducedFailureType()
    * @generated
    */
   void setCommunicationLinkResourceType__NetworkInducedFailureType(CommunicationLinkResourceType value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.communicationLinkResourceType__NetworkInducedFailureType <> null'"
    * @generated
    */
   boolean NetworkInducedFailureTypeHasCommunicationLinkResourceType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // NetworkInducedFailureType
