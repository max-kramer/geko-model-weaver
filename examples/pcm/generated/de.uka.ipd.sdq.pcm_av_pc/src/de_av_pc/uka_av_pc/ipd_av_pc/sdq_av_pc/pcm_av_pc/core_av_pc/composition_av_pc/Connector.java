/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Abstract superclass for all connectors.
 * </p>
 * <p>
 *     TODO:&nbsp;We&nbsp;might&nbsp;want&nbsp;to&nbsp;add&nbsp;a&nbsp;constraint&nbsp;that&nbsp;both&nbsp;sides&nbsp;of&nbsp;the&nbsp;connector&nbsp;must&nbsp;be&nbsp;not&nbsp;null.&nbsp;Then,&nbsp;we&nbsp;don't&nbsp;have&nbsp;to&nbsp;specify&nbsp;that&nbsp;for&nbsp;example&nbsp;for&nbsp;ComposedProvidingRequiringEntities&nbsp;that&nbsp;the&nbsp;ProvidedDelegationConnector&nbsp;actually&nbsp;points&nbsp;to&nbsp;something&nbsp;inner.&nbsp;If&nbsp;you&nbsp;decide&nbsp;not&nbsp;to&nbsp;add&nbsp;a&nbsp;constraint&nbsp;here,&nbsp;then&nbsp;we&nbsp;need&nbsp;a&nbsp;constraint&nbsp;there&nbsp;and&nbsp;maybe&nbsp;at&nbsp;other&nbsp;places&nbsp;--&nbsp;Anne
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Connector#getParentStructure__Connector <em>Parent Structure Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Entity {
   /**
    * Returns the value of the '<em><b>Parent Structure Connector</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.ComposedStructure#getConnectors__ComposedStructure <em>Connectors Composed Structure</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Structure Connector</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Structure Connector</em>' container reference.
    * @see #setParentStructure__Connector(ComposedStructure)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage#getConnector_ParentStructure__Connector()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.ComposedStructure#getConnectors__ComposedStructure
    * @model opposite="connectors__ComposedStructure" transient="false" ordered="false"
    * @generated
    */
   ComposedStructure getParentStructure__Connector();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Connector#getParentStructure__Connector <em>Parent Structure Connector</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent Structure Connector</em>' container reference.
    * @see #getParentStructure__Connector()
    * @generated
    */
   void setParentStructure__Connector(ComposedStructure value);

} // Connector
