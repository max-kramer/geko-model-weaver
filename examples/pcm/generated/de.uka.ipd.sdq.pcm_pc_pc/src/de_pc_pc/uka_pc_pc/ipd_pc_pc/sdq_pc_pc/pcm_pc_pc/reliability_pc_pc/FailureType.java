/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Abstract super class that&nbsp;provides a type definition for&nbsp;any failure-on-demand occurrence during service
 *     execution.&nbsp;
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.FailureType#getRepository__FailureType <em>Repository Failure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.Reliability_pc_pcPackage#getFailureType()
 * @model
 * @generated
 */
public interface FailureType extends Entity {
   /**
    * Returns the value of the '<em><b>Repository Failure Type</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository#getFailureTypes__Repository <em>Failure Types Repository</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Repository Failure Type</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Repository Failure Type</em>' container reference.
    * @see #setRepository__FailureType(Repository)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.Reliability_pc_pcPackage#getFailureType_Repository__FailureType()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository#getFailureTypes__Repository
    * @model opposite="failureTypes__Repository" transient="false" ordered="false"
    * @generated
    */
   Repository getRepository__FailureType();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.FailureType#getRepository__FailureType <em>Repository Failure Type</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Repository Failure Type</em>' container reference.
    * @see #getRepository__FailureType()
    * @generated
    */
   void setRepository__FailureType(Repository value);

} // FailureType
