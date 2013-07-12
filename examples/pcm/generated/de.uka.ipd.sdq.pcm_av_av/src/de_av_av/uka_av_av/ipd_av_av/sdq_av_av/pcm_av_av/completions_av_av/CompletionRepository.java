/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av;

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
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.CompletionRepository#getCompletions_CompletionRepository <em>Completions Completion Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avPackage#getCompletionRepository()
 * @model
 * @generated
 */
public interface CompletionRepository extends EObject {
   /**
    * Returns the value of the '<em><b>Completions Completion Repository</b></em>' containment reference list.
    * The list contents are of type {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completion}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Completions Completion Repository</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Completions Completion Repository</em>' containment reference list.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avPackage#getCompletionRepository_Completions_CompletionRepository()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<Completion> getCompletions_CompletionRepository();

} // CompletionRepository
