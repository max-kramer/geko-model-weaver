/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StopActions end a scenario behaviour and contain only a predecessor.
 * <!-- end-model-doc -->
 *
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage#getStopAction()
 * @model
 * @generated
 */
public interface StopAction extends AbstractInternalControlFlowAction {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.successor_AbstractAction.oclIsUndefined()'"
    * @generated
    */
   boolean StopActionSuccessorMustNotBeDefined(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StopAction
