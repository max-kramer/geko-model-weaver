/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.SourceRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Channel Source Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSourceConnector#getSourceRole__EventChannelSourceRole <em>Source Role Event Channel Source Role</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSourceConnector#getAssemblyContext__EventChannelSourceConnector <em>Assembly Context Event Channel Source Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector <em>Event Channel Event Channel Source Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getEventChannelSourceConnector()
 * @model
 * @generated
 */
public interface EventChannelSourceConnector extends Connector {
   /**
    * Returns the value of the '<em><b>Source Role Event Channel Source Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source Role Event Channel Source Role</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source Role Event Channel Source Role</em>' reference.
    * @see #setSourceRole__EventChannelSourceRole(SourceRole)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getEventChannelSourceConnector_SourceRole__EventChannelSourceRole()
    * @model ordered="false"
    * @generated
    */
   SourceRole getSourceRole__EventChannelSourceRole();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSourceConnector#getSourceRole__EventChannelSourceRole <em>Source Role Event Channel Source Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source Role Event Channel Source Role</em>' reference.
    * @see #getSourceRole__EventChannelSourceRole()
    * @generated
    */
   void setSourceRole__EventChannelSourceRole(SourceRole value);

   /**
    * Returns the value of the '<em><b>Assembly Context Event Channel Source Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Assembly Context Event Channel Source Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Assembly Context Event Channel Source Connector</em>' reference.
    * @see #setAssemblyContext__EventChannelSourceConnector(AssemblyContext)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getEventChannelSourceConnector_AssemblyContext__EventChannelSourceConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getAssemblyContext__EventChannelSourceConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSourceConnector#getAssemblyContext__EventChannelSourceConnector <em>Assembly Context Event Channel Source Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Assembly Context Event Channel Source Connector</em>' reference.
    * @see #getAssemblyContext__EventChannelSourceConnector()
    * @generated
    */
   void setAssemblyContext__EventChannelSourceConnector(AssemblyContext value);

   /**
    * Returns the value of the '<em><b>Event Channel Event Channel Source Connector</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannel#getEventChannelSourceConnector__EventChannel <em>Event Channel Source Connector Event Channel</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Channel Event Channel Source Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Channel Event Channel Source Connector</em>' reference.
    * @see #setEventChannel__EventChannelSourceConnector(EventChannel)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannel#getEventChannelSourceConnector__EventChannel
    * @model opposite="eventChannelSourceConnector__EventChannel" ordered="false"
    * @generated
    */
   EventChannel getEventChannel__EventChannelSourceConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector <em>Event Channel Event Channel Source Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Channel Event Channel Source Connector</em>' reference.
    * @see #getEventChannel__EventChannelSourceConnector()
    * @generated
    */
   void setEventChannel__EventChannelSourceConnector(EventChannel value);

} // EventChannelSourceConnector
