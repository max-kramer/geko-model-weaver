/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.CommunicationLinkResourceType;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_performance_pc_av.ParametricResourceDemand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Demand Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.NetworkDemandParametricResourceDemand#getRequiredCommunicationLinkResource_ParametricResourceDemand <em>Required Communication Link Resource Parametric Resource Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.Completions_pc_avPackage#getNetworkDemandParametricResourceDemand()
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
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.Completions_pc_avPackage#getNetworkDemandParametricResourceDemand_RequiredCommunicationLinkResource_ParametricResourceDemand()
    * @model ordered="false"
    * @generated
    */
   CommunicationLinkResourceType getRequiredCommunicationLinkResource_ParametricResourceDemand();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.NetworkDemandParametricResourceDemand#getRequiredCommunicationLinkResource_ParametricResourceDemand <em>Required Communication Link Resource Parametric Resource Demand</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Communication Link Resource Parametric Resource Demand</em>' reference.
    * @see #getRequiredCommunicationLinkResource_ParametricResourceDemand()
    * @generated
    */
   void setRequiredCommunicationLinkResource_ParametricResourceDemand(CommunicationLinkResourceType value);

} // NetworkDemandParametricResourceDemand
