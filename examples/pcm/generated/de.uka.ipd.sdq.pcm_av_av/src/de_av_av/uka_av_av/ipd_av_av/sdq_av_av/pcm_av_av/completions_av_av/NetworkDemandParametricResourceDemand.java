/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.CommunicationLinkResourceType;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_performance_av_av.ParametricResourceDemand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Demand Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.NetworkDemandParametricResourceDemand#getRequiredCommunicationLinkResource_ParametricResourceDemand <em>Required Communication Link Resource Parametric Resource Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avPackage#getNetworkDemandParametricResourceDemand()
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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avPackage#getNetworkDemandParametricResourceDemand_RequiredCommunicationLinkResource_ParametricResourceDemand()
    * @model ordered="false"
    * @generated
    */
   CommunicationLinkResourceType getRequiredCommunicationLinkResource_ParametricResourceDemand();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.NetworkDemandParametricResourceDemand#getRequiredCommunicationLinkResource_ParametricResourceDemand <em>Required Communication Link Resource Parametric Resource Demand</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Communication Link Resource Parametric Resource Demand</em>' reference.
    * @see #getRequiredCommunicationLinkResource_ParametricResourceDemand()
    * @generated
    */
   void setRequiredCommunicationLinkResource_ParametricResourceDemand(CommunicationLinkResourceType value);

} // NetworkDemandParametricResourceDemand
