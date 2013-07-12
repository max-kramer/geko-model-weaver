/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.EventType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.SourceRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EmitEventAction specifies when a component emits an event during its processing. To enable the specification of the EventType characteristics, the EmitEventAction extends the CallAction. The EmitEventAction defines which type of events are emited, their characteristics and the SourceRole that triggered. Each EmitEventAction is limited to one type of events. To support multiple types of events, multiple EmitEventActions have to be used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.EmitEventAction#getEventType__EmitEventAction <em>Event Type Emit Event Action</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.EmitEventAction#getSourceRole__EmitEventAction <em>Source Role Emit Event Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage#getEmitEventAction()
 * @model
 * @generated
 */
public interface EmitEventAction extends AbstractAction, CallAction {
   /**
    * Returns the value of the '<em><b>Event Type Emit Event Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Type Emit Event Action</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Type Emit Event Action</em>' reference.
    * @see #setEventType__EmitEventAction(EventType)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage#getEmitEventAction_EventType__EmitEventAction()
    * @model ordered="false"
    * @generated
    */
   EventType getEventType__EmitEventAction();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.EmitEventAction#getEventType__EmitEventAction <em>Event Type Emit Event Action</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Type Emit Event Action</em>' reference.
    * @see #getEventType__EmitEventAction()
    * @generated
    */
   void setEventType__EmitEventAction(EventType value);

   /**
    * Returns the value of the '<em><b>Source Role Emit Event Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source Role Emit Event Action</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source Role Emit Event Action</em>' reference.
    * @see #setSourceRole__EmitEventAction(SourceRole)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage#getEmitEventAction_SourceRole__EmitEventAction()
    * @model ordered="false"
    * @generated
    */
   SourceRole getSourceRole__EmitEventAction();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.EmitEventAction#getSourceRole__EmitEventAction <em>Source Role Emit Event Action</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source Role Emit Event Action</em>' reference.
    * @see #getSourceRole__EmitEventAction()
    * @generated
    */
   void setSourceRole__EmitEventAction(SourceRole value);

} // EmitEventAction
