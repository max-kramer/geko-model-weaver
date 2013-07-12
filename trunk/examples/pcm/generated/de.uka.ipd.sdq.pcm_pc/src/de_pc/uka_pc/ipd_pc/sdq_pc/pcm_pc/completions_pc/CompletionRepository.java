/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc.CompletionRepository#getCompletions_CompletionRepository <em>Completions Completion Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc.Completions_pcPackage#getCompletionRepository()
 * @model
 * @generated
 */
public interface CompletionRepository extends EObject {
   /**
    * Returns the value of the '<em><b>Completions Completion Repository</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc.Completion}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Completions Completion Repository</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Completions Completion Repository</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc.Completions_pcPackage#getCompletionRepository_Completions_CompletionRepository()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<Completion> getCompletions_CompletionRepository();

} // CompletionRepository
