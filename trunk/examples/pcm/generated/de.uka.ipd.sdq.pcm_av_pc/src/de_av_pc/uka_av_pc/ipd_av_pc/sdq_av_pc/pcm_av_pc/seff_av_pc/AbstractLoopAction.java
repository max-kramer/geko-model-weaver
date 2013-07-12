/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Loop Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Abstract parent class of any loop (e.g. LoopAction)
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractLoopAction#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage#getAbstractLoopAction()
 * @model
 * @generated
 */
public interface AbstractLoopAction extends AbstractInternalControlFlowAction {
   /**
    * Returns the value of the '<em><b>Body Behaviour Loop</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ResourceDemandingBehaviour#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Body Behaviour Loop</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Body Behaviour Loop</em>' containment reference.
    * @see #setBodyBehaviour_Loop(ResourceDemandingBehaviour)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage#getAbstractLoopAction_BodyBehaviour_Loop()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ResourceDemandingBehaviour#getAbstractLoopAction_ResourceDemandingBehaviour
    * @model opposite="abstractLoopAction_ResourceDemandingBehaviour" containment="true" ordered="false"
    * @generated
    */
   ResourceDemandingBehaviour getBodyBehaviour_Loop();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractLoopAction#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Body Behaviour Loop</em>' containment reference.
    * @see #getBodyBehaviour_Loop()
    * @generated
    */
   void setBodyBehaviour_Loop(ResourceDemandingBehaviour value);

} // AbstractLoopAction
