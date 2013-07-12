/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract User Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * See the AbstractAction documentation for why it is advantageous
 * to model control flow in this way, as the same principle is used in the RDSEFF language. 
 * 
 * Concrete user actions of the usage model are:
 * - Branch
 * - Loop
 * - EntryLevelSystemCall
 * - Delay
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getScenarioBehaviour_AbstractUserAction <em>Scenario Behaviour Abstract User Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getAbstractUserAction()
 * @model
 * @generated
 */
public interface AbstractUserAction extends Entity {
   /**
    * Returns the value of the '<em><b>Successor</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getPredecessor <em>Predecessor</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Successor</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Successor</em>' reference.
    * @see #setSuccessor(AbstractUserAction)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getAbstractUserAction_Successor()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getPredecessor
    * @model opposite="predecessor" ordered="false"
    * @generated
    */
   AbstractUserAction getSuccessor();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getSuccessor <em>Successor</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Successor</em>' reference.
    * @see #getSuccessor()
    * @generated
    */
   void setSuccessor(AbstractUserAction value);

   /**
    * Returns the value of the '<em><b>Predecessor</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getSuccessor <em>Successor</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Predecessor</em>' reference.
    * @see #setPredecessor(AbstractUserAction)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getAbstractUserAction_Predecessor()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getSuccessor
    * @model opposite="successor" ordered="false"
    * @generated
    */
   AbstractUserAction getPredecessor();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getPredecessor <em>Predecessor</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Predecessor</em>' reference.
    * @see #getPredecessor()
    * @generated
    */
   void setPredecessor(AbstractUserAction value);

   /**
    * Returns the value of the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.ScenarioBehaviour#getActions_ScenarioBehaviour <em>Actions Scenario Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Scenario Behaviour Abstract User Action</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Scenario Behaviour Abstract User Action</em>' container reference.
    * @see #setScenarioBehaviour_AbstractUserAction(ScenarioBehaviour)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getAbstractUserAction_ScenarioBehaviour_AbstractUserAction()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.ScenarioBehaviour#getActions_ScenarioBehaviour
    * @model opposite="actions_ScenarioBehaviour" transient="false" ordered="false"
    * @generated
    */
   ScenarioBehaviour getScenarioBehaviour_AbstractUserAction();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.AbstractUserAction#getScenarioBehaviour_AbstractUserAction <em>Scenario Behaviour Abstract User Action</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Scenario Behaviour Abstract User Action</em>' container reference.
    * @see #getScenarioBehaviour_AbstractUserAction()
    * @generated
    */
   void setScenarioBehaviour_AbstractUserAction(ScenarioBehaviour value);

} // AbstractUserAction
