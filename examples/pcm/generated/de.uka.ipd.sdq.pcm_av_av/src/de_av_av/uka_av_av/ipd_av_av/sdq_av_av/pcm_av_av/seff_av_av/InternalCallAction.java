/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A "SubSEFF"-Action: Realises an internal method call within a SEFF.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.InternalCallAction#getCalledResourceDemandingInternalBehaviour <em>Called Resource Demanding Internal Behaviour</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getInternalCallAction()
 * @model
 * @generated
 */
public interface InternalCallAction extends CallAction, AbstractInternalControlFlowAction {
   /**
    * Returns the value of the '<em><b>Called Resource Demanding Internal Behaviour</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Called Resource Demanding Internal Behaviour</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Called Resource Demanding Internal Behaviour</em>' reference.
    * @see #setCalledResourceDemandingInternalBehaviour(ResourceDemandingInternalBehaviour)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getInternalCallAction_CalledResourceDemandingInternalBehaviour()
    * @model ordered="false"
    * @generated
    */
   ResourceDemandingInternalBehaviour getCalledResourceDemandingInternalBehaviour();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.InternalCallAction#getCalledResourceDemandingInternalBehaviour <em>Called Resource Demanding Internal Behaviour</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Called Resource Demanding Internal Behaviour</em>' reference.
    * @see #getCalledResourceDemandingInternalBehaviour()
    * @generated
    */
   void setCalledResourceDemandingInternalBehaviour(ResourceDemandingInternalBehaviour value);

} // InternalCallAction
