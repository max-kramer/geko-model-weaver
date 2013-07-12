/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.EventGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannel#getEventGroup__EventChannel <em>Event Group Event Channel</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannel#getEventChannelSourceConnector__EventChannel <em>Event Channel Source Connector Event Channel</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannel#getEventChannelSinkConnector__EventChannel <em>Event Channel Sink Connector Event Channel</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannel#getParentStructure__EventChannel <em>Parent Structure Event Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage#getEventChannel()
 * @model
 * @generated
 */
public interface EventChannel extends Entity {
   /**
    * Returns the value of the '<em><b>Event Group Event Channel</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Group Event Channel</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Group Event Channel</em>' reference.
    * @see #setEventGroup__EventChannel(EventGroup)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage#getEventChannel_EventGroup__EventChannel()
    * @model ordered="false"
    * @generated
    */
   EventGroup getEventGroup__EventChannel();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannel#getEventGroup__EventChannel <em>Event Group Event Channel</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Group Event Channel</em>' reference.
    * @see #getEventGroup__EventChannel()
    * @generated
    */
   void setEventGroup__EventChannel(EventGroup value);

   /**
    * Returns the value of the '<em><b>Event Channel Source Connector Event Channel</b></em>' reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannelSourceConnector}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector <em>Event Channel Event Channel Source Connector</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Channel Source Connector Event Channel</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Channel Source Connector Event Channel</em>' reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage#getEventChannel_EventChannelSourceConnector__EventChannel()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector
    * @model opposite="eventChannel__EventChannelSourceConnector" ordered="false"
    * @generated
    */
   EList<EventChannelSourceConnector> getEventChannelSourceConnector__EventChannel();

   /**
    * Returns the value of the '<em><b>Event Channel Sink Connector Event Channel</b></em>' reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannelSinkConnector}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannelSinkConnector#getEventChannel__EventChannelSinkConnector <em>Event Channel Event Channel Sink Connector</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Channel Sink Connector Event Channel</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Channel Sink Connector Event Channel</em>' reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage#getEventChannel_EventChannelSinkConnector__EventChannel()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannelSinkConnector#getEventChannel__EventChannelSinkConnector
    * @model opposite="eventChannel__EventChannelSinkConnector" ordered="false"
    * @generated
    */
   EList<EventChannelSinkConnector> getEventChannelSinkConnector__EventChannel();

   /**
    * Returns the value of the '<em><b>Parent Structure Event Channel</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.ComposedStructure#getEventChannel__ComposedStructure <em>Event Channel Composed Structure</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Structure Event Channel</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Structure Event Channel</em>' container reference.
    * @see #setParentStructure__EventChannel(ComposedStructure)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage#getEventChannel_ParentStructure__EventChannel()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.ComposedStructure#getEventChannel__ComposedStructure
    * @model opposite="eventChannel__ComposedStructure" transient="false" ordered="false"
    * @generated
    */
   ComposedStructure getParentStructure__EventChannel();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.EventChannel#getParentStructure__EventChannel <em>Parent Structure Event Channel</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent Structure Event Channel</em>' container reference.
    * @see #getParentStructure__EventChannel()
    * @generated
    */
   void setParentStructure__EventChannel(ComposedStructure value);

} // EventChannel
