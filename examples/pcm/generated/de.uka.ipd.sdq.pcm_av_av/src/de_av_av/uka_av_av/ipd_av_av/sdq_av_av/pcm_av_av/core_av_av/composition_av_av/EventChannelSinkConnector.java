/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.PCMRandomVariable;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.SinkRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Channel Sink Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector#getSinkRole__EventChannelSinkConnector <em>Sink Role Event Channel Sink Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector#getFilterCondition__EventChannelSinkConnector <em>Filter Condition Event Channel Sink Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector#getAssemblyContext__EventChannelSinkConnector <em>Assembly Context Event Channel Sink Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector#getEventChannel__EventChannelSinkConnector <em>Event Channel Event Channel Sink Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getEventChannelSinkConnector()
 * @model
 * @generated
 */
public interface EventChannelSinkConnector extends Connector {
   /**
    * Returns the value of the '<em><b>Sink Role Event Channel Sink Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sink Role Event Channel Sink Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sink Role Event Channel Sink Connector</em>' reference.
    * @see #setSinkRole__EventChannelSinkConnector(SinkRole)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getEventChannelSinkConnector_SinkRole__EventChannelSinkConnector()
    * @model ordered="false"
    * @generated
    */
   SinkRole getSinkRole__EventChannelSinkConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector#getSinkRole__EventChannelSinkConnector <em>Sink Role Event Channel Sink Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Sink Role Event Channel Sink Connector</em>' reference.
    * @see #getSinkRole__EventChannelSinkConnector()
    * @generated
    */
   void setSinkRole__EventChannelSinkConnector(SinkRole value);

   /**
    * Returns the value of the '<em><b>Filter Condition Event Channel Sink Connector</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.PCMRandomVariable#getEventChannelSinkConnector__FilterCondition <em>Event Channel Sink Connector Filter Condition</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Filter Condition Event Channel Sink Connector</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Filter Condition Event Channel Sink Connector</em>' containment reference.
    * @see #setFilterCondition__EventChannelSinkConnector(PCMRandomVariable)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getEventChannelSinkConnector_FilterCondition__EventChannelSinkConnector()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.PCMRandomVariable#getEventChannelSinkConnector__FilterCondition
    * @model opposite="eventChannelSinkConnector__FilterCondition" containment="true" ordered="false"
    * @generated
    */
   PCMRandomVariable getFilterCondition__EventChannelSinkConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector#getFilterCondition__EventChannelSinkConnector <em>Filter Condition Event Channel Sink Connector</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Filter Condition Event Channel Sink Connector</em>' containment reference.
    * @see #getFilterCondition__EventChannelSinkConnector()
    * @generated
    */
   void setFilterCondition__EventChannelSinkConnector(PCMRandomVariable value);

   /**
    * Returns the value of the '<em><b>Assembly Context Event Channel Sink Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Assembly Context Event Channel Sink Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Assembly Context Event Channel Sink Connector</em>' reference.
    * @see #setAssemblyContext__EventChannelSinkConnector(AssemblyContext)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getEventChannelSinkConnector_AssemblyContext__EventChannelSinkConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getAssemblyContext__EventChannelSinkConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector#getAssemblyContext__EventChannelSinkConnector <em>Assembly Context Event Channel Sink Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Assembly Context Event Channel Sink Connector</em>' reference.
    * @see #getAssemblyContext__EventChannelSinkConnector()
    * @generated
    */
   void setAssemblyContext__EventChannelSinkConnector(AssemblyContext value);

   /**
    * Returns the value of the '<em><b>Event Channel Event Channel Sink Connector</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannel#getEventChannelSinkConnector__EventChannel <em>Event Channel Sink Connector Event Channel</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Channel Event Channel Sink Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Channel Event Channel Sink Connector</em>' reference.
    * @see #setEventChannel__EventChannelSinkConnector(EventChannel)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getEventChannelSinkConnector_EventChannel__EventChannelSinkConnector()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannel#getEventChannelSinkConnector__EventChannel
    * @model opposite="eventChannelSinkConnector__EventChannel" ordered="false"
    * @generated
    */
   EventChannel getEventChannel__EventChannelSinkConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector#getEventChannel__EventChannelSinkConnector <em>Event Channel Event Channel Sink Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Channel Event Channel Sink Connector</em>' reference.
    * @see #getEventChannel__EventChannelSinkConnector()
    * @generated
    */
   void setEventChannel__EventChannelSinkConnector(EventChannel value);

} // EventChannelSinkConnector