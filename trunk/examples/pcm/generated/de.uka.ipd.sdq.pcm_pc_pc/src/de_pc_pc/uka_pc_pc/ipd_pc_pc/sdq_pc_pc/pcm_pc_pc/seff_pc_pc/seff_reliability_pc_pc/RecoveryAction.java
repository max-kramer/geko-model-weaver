/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.AbstractInternalControlFlowAction;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recovery Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Recover block actions are a generic failure handling technique. A recovery block consists of a a primary algorithm and one
 * or more alternatives that can be used in case of failure. If the primary algorithm fails, the next alternative is chosen.
 * Here the alternatives also support failure types. Alternatives may specify which kind of failures they can handle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.RecoveryAction#getPrimaryBehaviour__RecoveryAction <em>Primary Behaviour Recovery Action</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage#getRecoveryAction()
 * @model
 * @generated
 */
public interface RecoveryAction extends AbstractInternalControlFlowAction {
   /**
    * Returns the value of the '<em><b>Primary Behaviour Recovery Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Primary Behaviour Recovery Action</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Primary Behaviour Recovery Action</em>' reference.
    * @see #setPrimaryBehaviour__RecoveryAction(RecoveryActionBehaviour)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage#getRecoveryAction_PrimaryBehaviour__RecoveryAction()
    * @model ordered="false"
    * @generated
    */
   RecoveryActionBehaviour getPrimaryBehaviour__RecoveryAction();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.RecoveryAction#getPrimaryBehaviour__RecoveryAction <em>Primary Behaviour Recovery Action</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Primary Behaviour Recovery Action</em>' reference.
    * @see #getPrimaryBehaviour__RecoveryAction()
    * @generated
    */
   void setPrimaryBehaviour__RecoveryAction(RecoveryActionBehaviour value);

   /**
    * Returns the value of the '<em><b>Recovery Action Behaviours Recovery Action</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.RecoveryActionBehaviour}.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Recovery Action Behaviours Recovery Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Recovery Action Behaviours Recovery Action</em>' containment reference list.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage#getRecoveryAction_RecoveryActionBehaviours__RecoveryAction()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour
    * @model opposite="recoveryAction__RecoveryActionBehaviour" containment="true" ordered="false"
    * @generated
    */
   EList<RecoveryActionBehaviour> getRecoveryActionBehaviours__RecoveryAction();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.primaryBehaviour__RecoveryAction <> null'"
    * @generated
    */
   boolean PrimaryBehaviourOfRecoveryActionMustBeSet(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RecoveryAction
