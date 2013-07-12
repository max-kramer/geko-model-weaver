/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Loop models a repeated sequence of actions in the user flow. It contains a nested ScenarioBehaviour specifying the loop body, and a RandomVariable specifying the number of iterations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Loop#getLoopIteration_Loop <em>Loop Iteration Loop</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Loop#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends AbstractUserAction {
   /**
    * Returns the value of the '<em><b>Loop Iteration Loop</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.PCMRandomVariable#getLoop_LoopIteration <em>Loop Loop Iteration</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Loop Iteration Loop</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Loop Iteration Loop</em>' containment reference.
    * @see #setLoopIteration_Loop(PCMRandomVariable)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getLoop_LoopIteration_Loop()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.PCMRandomVariable#getLoop_LoopIteration
    * @model opposite="loop_LoopIteration" containment="true" ordered="false"
    * @generated
    */
   PCMRandomVariable getLoopIteration_Loop();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Loop#getLoopIteration_Loop <em>Loop Iteration Loop</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Loop Iteration Loop</em>' containment reference.
    * @see #getLoopIteration_Loop()
    * @generated
    */
   void setLoopIteration_Loop(PCMRandomVariable value);

   /**
    * Returns the value of the '<em><b>Body Behaviour Loop</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.ScenarioBehaviour#getLoop_ScenarioBehaviour <em>Loop Scenario Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Body Behaviour Loop</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Body Behaviour Loop</em>' containment reference.
    * @see #setBodyBehaviour_Loop(ScenarioBehaviour)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getLoop_BodyBehaviour_Loop()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.ScenarioBehaviour#getLoop_ScenarioBehaviour
    * @model opposite="loop_ScenarioBehaviour" containment="true" ordered="false"
    * @generated
    */
   ScenarioBehaviour getBodyBehaviour_Loop();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Loop#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Body Behaviour Loop</em>' containment reference.
    * @see #getBodyBehaviour_Loop()
    * @generated
    */
   void setBodyBehaviour_Loop(ScenarioBehaviour value);

} // Loop
