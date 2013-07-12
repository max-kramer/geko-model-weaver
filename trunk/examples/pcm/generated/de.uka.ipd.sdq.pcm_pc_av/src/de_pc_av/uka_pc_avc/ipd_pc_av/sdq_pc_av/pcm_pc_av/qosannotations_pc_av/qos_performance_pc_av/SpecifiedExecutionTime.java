/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.SpecifiedQoSAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specified Execution Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Specifies an execution time
 *     in&nbsp;terms&nbsp;of&nbsp;a&nbsp;PCMRandomVariable&nbsp;which&nbsp;may&nbsp;depend&nbsp;on&nbsp;component&nbsp;or&nbsp;input&nbsp;parameters&nbsp;of&nbsp;the
 *     referenced&nbsp;service.
 * </p>
 * <p>
 *     Notes:
 * </p>
 * <p>
 *     -&nbsp;Is&nbsp;it&nbsp;correct&nbsp;that&nbsp;the&nbsp;PCMRandomvariable&nbsp;can&nbsp;depend&nbsp;on&nbsp;parameters?<br />
 *     -&nbsp;How&nbsp;is&nbsp;the&nbsp;relation&nbsp;of&nbsp;the&nbsp;specified&nbsp;QoS&nbsp;to&nbsp;the&nbsp;input&nbsp;parameters&nbsp;established?<br />
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.SpecifiedExecutionTime#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.Qos_performance_pc_avPackage#getSpecifiedExecutionTime()
 * @model
 * @generated
 */
public interface SpecifiedExecutionTime extends SpecifiedQoSAnnotation {
   /**
    * Returns the value of the '<em><b>Specification Specified Execution Time</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getSpecifiedExecutionTime_PCMRandomVariable <em>Specified Execution Time PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Specification Specified Execution Time</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Specification Specified Execution Time</em>' containment reference.
    * @see #setSpecification_SpecifiedExecutionTime(PCMRandomVariable)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.Qos_performance_pc_avPackage#getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable#getSpecifiedExecutionTime_PCMRandomVariable
    * @model opposite="specifiedExecutionTime_PCMRandomVariable" containment="true" ordered="false"
    * @generated
    */
   PCMRandomVariable getSpecification_SpecifiedExecutionTime();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.SpecifiedExecutionTime#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Specification Specified Execution Time</em>' containment reference.
    * @see #getSpecification_SpecifiedExecutionTime()
    * @generated
    */
   void setSpecification_SpecifiedExecutionTime(PCMRandomVariable value);

} // SpecifiedExecutionTime
