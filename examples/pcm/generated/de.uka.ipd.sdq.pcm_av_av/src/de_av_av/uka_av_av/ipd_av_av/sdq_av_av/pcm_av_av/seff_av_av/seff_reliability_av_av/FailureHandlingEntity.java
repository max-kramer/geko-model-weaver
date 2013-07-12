/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.FailureType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Handling Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Failure handling entities are any program constructs that can handle failures. Instances of failure handling entities
 *     specify any number of failure types that can be handled.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.FailureHandlingEntity#getFailureTypes_FailureHandlingEntity <em>Failure Types Failure Handling Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.Seff_reliability_av_avPackage#getFailureHandlingEntity()
 * @model
 * @generated
 */
public interface FailureHandlingEntity extends Entity {
   /**
    * Returns the value of the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
    * The list contents are of type {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.FailureType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Failure Types Failure Handling Entity</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Failure Types Failure Handling Entity</em>' reference list.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.Seff_reliability_av_avPackage#getFailureHandlingEntity_FailureTypes_FailureHandlingEntity()
    * @model ordered="false"
    * @generated
    */
   EList<FailureType> getFailureTypes_FailureHandlingEntity();

} // FailureHandlingEntity
