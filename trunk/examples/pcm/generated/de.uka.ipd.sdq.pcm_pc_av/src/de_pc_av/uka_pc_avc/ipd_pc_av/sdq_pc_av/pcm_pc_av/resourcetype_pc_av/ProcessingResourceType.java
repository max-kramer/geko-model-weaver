/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.HardwareInducedFailureType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     ResourceType representation of CPU.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ProcessingResourceType#getHardwareInducedFailureType__ProcessingResourceType <em>Hardware Induced Failure Type Processing Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage#getProcessingResourceType()
 * @model
 * @generated
 */
public interface ProcessingResourceType extends ResourceType {
   /**
    * Returns the value of the '<em><b>Hardware Induced Failure Type Processing Resource Type</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Hardware Induced Failure Type Processing Resource Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Hardware Induced Failure Type Processing Resource Type</em>' reference.
    * @see #setHardwareInducedFailureType__ProcessingResourceType(HardwareInducedFailureType)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage#getProcessingResourceType_HardwareInducedFailureType__ProcessingResourceType()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType
    * @model opposite="processingResourceType__HardwareInducedFailureType" ordered="false"
    * @generated
    */
   HardwareInducedFailureType getHardwareInducedFailureType__ProcessingResourceType();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ProcessingResourceType#getHardwareInducedFailureType__ProcessingResourceType <em>Hardware Induced Failure Type Processing Resource Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Hardware Induced Failure Type Processing Resource Type</em>' reference.
    * @see #getHardwareInducedFailureType__ProcessingResourceType()
    * @generated
    */
   void setHardwareInducedFailureType__ProcessingResourceType(HardwareInducedFailureType value);

} // ProcessingResourceType
