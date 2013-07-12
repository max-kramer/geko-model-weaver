/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ResourceDemandingBehaviour;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recovery Action Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Recovery block alternative haviours represent alternatives of recovery blocks. They are resource demanding behaviours,
 *     thus any behaviour can be defined as an alternative.
 * </p>
 * <p>
 *     The alternatives of a recovery block form a chain. They are failure handling entities, i.e.&nbsp;they can handle
 *     failures that occur in previous alternatives. If one alternative fails, the next alternative is executed that can
 *     handle the failure type.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.RecoveryActionBehaviour#getFailureHandlingAlternatives__RecoveryActionBehaviour <em>Failure Handling Alternatives Recovery Action Behaviour</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.Seff_reliability_av_pcPackage#getRecoveryActionBehaviour()
 * @model
 * @generated
 */
public interface RecoveryActionBehaviour extends FailureHandlingEntity, ResourceDemandingBehaviour {
   /**
    * Returns the value of the '<em><b>Failure Handling Alternatives Recovery Action Behaviour</b></em>' reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.RecoveryActionBehaviour}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Failure Handling Alternatives Recovery Action Behaviour</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Failure Handling Alternatives Recovery Action Behaviour</em>' reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.Seff_reliability_av_pcPackage#getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour()
    * @model ordered="false"
    * @generated
    */
   EList<RecoveryActionBehaviour> getFailureHandlingAlternatives__RecoveryActionBehaviour();

   /**
    * Returns the value of the '<em><b>Recovery Action Recovery Action Behaviour</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Recovery Action Recovery Action Behaviour</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Recovery Action Recovery Action Behaviour</em>' container reference.
    * @see #setRecoveryAction__RecoveryActionBehaviour(RecoveryAction)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.Seff_reliability_av_pcPackage#getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction
    * @model opposite="recoveryActionBehaviours__RecoveryAction" transient="false" ordered="false"
    * @generated
    */
   RecoveryAction getRecoveryAction__RecoveryActionBehaviour();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Recovery Action Recovery Action Behaviour</em>' container reference.
    * @see #getRecoveryAction__RecoveryActionBehaviour()
    * @generated
    */
   void setRecoveryAction__RecoveryActionBehaviour(RecoveryAction value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.recoveryAction__RecoveryActionBehaviour.recoveryActionBehaviours__RecoveryAction->\r\n\texists(x,y:RecoveryActionBehaviour | x<>y\r\n\t\tand x.failureHandlingAlternatives__RecoveryActionBehaviour->includes(self)\r\n\t\tand y.failureHandlingAlternatives__RecoveryActionBehaviour->includes(self))'"
    * @generated
    */
   boolean RecoveryActionBehaviourHasOnlyOnePredecessor(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.failureHandlingAlternatives__RecoveryActionBehaviour->includes(self)'"
    * @generated
    */
   boolean RecoveryActionBehaviourIsNotSuccessorOfItself(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.failureHandlingAlternatives__RecoveryActionBehaviour->\r\n\texists(x,y:RecoveryActionBehaviour | x<>y and\r\n\tx.failureTypes_FailureHandlingEntity->\r\n\t\texists(f:pcm::reliability::FailureType |\r\n\t\ty.failureTypes_FailureHandlingEntity->includes(f)))'"
    * @generated
    */
   boolean SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RecoveryActionBehaviour
