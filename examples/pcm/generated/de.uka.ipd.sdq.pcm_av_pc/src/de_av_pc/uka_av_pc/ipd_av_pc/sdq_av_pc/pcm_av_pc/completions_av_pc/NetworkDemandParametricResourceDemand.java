/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.CommunicationLinkResourceType;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.ParametricResourceDemand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Demand Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.NetworkDemandParametricResourceDemand#getRequiredCommunicationLinkResource_ParametricResourceDemand <em>Required Communication Link Resource Parametric Resource Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.Completions_av_pcPackage#getNetworkDemandParametricResourceDemand()
 * @model
 * @generated
 */
public interface NetworkDemandParametricResourceDemand extends ParametricResourceDemand {
   /**
    * Returns the value of the '<em><b>Required Communication Link Resource Parametric Resource Demand</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Required Communication Link Resource Parametric Resource Demand</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Required Communication Link Resource Parametric Resource Demand</em>' reference.
    * @see #setRequiredCommunicationLinkResource_ParametricResourceDemand(CommunicationLinkResourceType)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.Completions_av_pcPackage#getNetworkDemandParametricResourceDemand_RequiredCommunicationLinkResource_ParametricResourceDemand()
    * @model ordered="false"
    * @generated
    */
   CommunicationLinkResourceType getRequiredCommunicationLinkResource_ParametricResourceDemand();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.NetworkDemandParametricResourceDemand#getRequiredCommunicationLinkResource_ParametricResourceDemand <em>Required Communication Link Resource Parametric Resource Demand</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Communication Link Resource Parametric Resource Demand</em>' reference.
    * @see #getRequiredCommunicationLinkResource_ParametricResourceDemand()
    * @generated
    */
   void setRequiredCommunicationLinkResource_ParametricResourceDemand(CommunicationLinkResourceType value);

} // NetworkDemandParametricResourceDemand
