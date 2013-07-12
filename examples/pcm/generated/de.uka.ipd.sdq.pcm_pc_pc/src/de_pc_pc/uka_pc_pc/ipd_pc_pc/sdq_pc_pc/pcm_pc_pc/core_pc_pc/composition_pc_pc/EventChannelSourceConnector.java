/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.SourceRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Channel Source Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSourceConnector#getSourceRole__EventChannelSourceRole <em>Source Role Event Channel Source Role</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSourceConnector#getAssemblyContext__EventChannelSourceConnector <em>Assembly Context Event Channel Source Connector</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector <em>Event Channel Event Channel Source Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage#getEventChannelSourceConnector()
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
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage#getEventChannelSourceConnector_SourceRole__EventChannelSourceRole()
    * @model ordered="false"
    * @generated
    */
   SourceRole getSourceRole__EventChannelSourceRole();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSourceConnector#getSourceRole__EventChannelSourceRole <em>Source Role Event Channel Source Role</em>}' reference.
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
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage#getEventChannelSourceConnector_AssemblyContext__EventChannelSourceConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getAssemblyContext__EventChannelSourceConnector();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSourceConnector#getAssemblyContext__EventChannelSourceConnector <em>Assembly Context Event Channel Source Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Assembly Context Event Channel Source Connector</em>' reference.
    * @see #getAssemblyContext__EventChannelSourceConnector()
    * @generated
    */
   void setAssemblyContext__EventChannelSourceConnector(AssemblyContext value);

   /**
    * Returns the value of the '<em><b>Event Channel Event Channel Source Connector</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannel#getEventChannelSourceConnector__EventChannel <em>Event Channel Source Connector Event Channel</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Channel Event Channel Source Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Channel Event Channel Source Connector</em>' reference.
    * @see #setEventChannel__EventChannelSourceConnector(EventChannel)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage#getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannel#getEventChannelSourceConnector__EventChannel
    * @model opposite="eventChannelSourceConnector__EventChannel" ordered="false"
    * @generated
    */
   EventChannel getEventChannel__EventChannelSourceConnector();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector <em>Event Channel Event Channel Source Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Channel Event Channel Source Connector</em>' reference.
    * @see #getEventChannel__EventChannelSourceConnector()
    * @generated
    */
   void setEventChannel__EventChannelSourceConnector(EventChannel value);

} // EventChannelSourceConnector
