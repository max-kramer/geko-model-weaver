/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.FailureType;

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
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.FailureHandlingEntity#getFailureTypes_FailureHandlingEntity <em>Failure Types Failure Handling Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage#getFailureHandlingEntity()
 * @model
 * @generated
 */
public interface FailureHandlingEntity extends Entity {
   /**
    * Returns the value of the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
    * The list contents are of type {@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.FailureType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Failure Types Failure Handling Entity</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Failure Types Failure Handling Entity</em>' reference list.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage#getFailureHandlingEntity_FailureTypes_FailureHandlingEntity()
    * @model ordered="false"
    * @generated
    */
   EList<FailureType> getFailureTypes_FailureHandlingEntity();

} // FailureHandlingEntity
