/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SinkRole, extending a ProvidedRole, identifies components that provide an event handler for specific EventTypes. As for SourceRoles, the EventTypes, a SinkRole is compatible with, are defined by the associated EventGroup.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SinkRole#getEventGroup__SinkRole <em>Event Group Sink Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getSinkRole()
 * @model
 * @generated
 */
public interface SinkRole extends ProvidedRole {
   /**
    * Returns the value of the '<em><b>Event Group Sink Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Group Sink Role</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Group Sink Role</em>' reference.
    * @see #setEventGroup__SinkRole(EventGroup)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage#getSinkRole_EventGroup__SinkRole()
    * @model ordered="false"
    * @generated
    */
   EventGroup getEventGroup__SinkRole();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SinkRole#getEventGroup__SinkRole <em>Event Group Sink Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Group Sink Role</em>' reference.
    * @see #getEventGroup__SinkRole()
    * @generated
    */
   void setEventGroup__SinkRole(EventGroup value);

} // SinkRole
