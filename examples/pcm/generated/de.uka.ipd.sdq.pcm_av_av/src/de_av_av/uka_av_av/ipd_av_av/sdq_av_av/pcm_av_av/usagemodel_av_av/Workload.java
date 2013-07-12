/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Workload specifies the usage intensity of a system, which relates to the number of users concurrently
 * present in the system. The PCM usage model adopts this concept from classical queueing
 * theory [123]. The specified workloads can directly be used in queueing networks or easily be mapped
 * to markings in stochastic Petri nets. Workloads can either be open or closed.
 * 
 * The algorithms used to analyse queueing networks differ depending on whether open or closed workloads
 * are modelled [123]. Some special queueing networks can only be analysed given a particular workload
 * type (open or closed). Notice, that it is possible to specify a usage model with open workload usage
 * scenarios and closed workload usage scenarios at the same time. Open and closed workloads can be
 * executed in parallel when analysing the model.
 * 
 * [123] E. Lazowska, J. Zahorjan, G. Graham, and K. Sevcik, Quantitative System Performance. Prentice
 * Hall, 1984.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.Workload#getUsageScenario_Workload <em>Usage Scenario Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.Usagemodel_av_avPackage#getWorkload()
 * @model
 * @generated
 */
public interface Workload extends EObject {
   /**
    * Returns the value of the '<em><b>Usage Scenario Workload</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.UsageScenario#getWorkload_UsageScenario <em>Workload Usage Scenario</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Usage Scenario Workload</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Usage Scenario Workload</em>' container reference.
    * @see #setUsageScenario_Workload(UsageScenario)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.Usagemodel_av_avPackage#getWorkload_UsageScenario_Workload()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.UsageScenario#getWorkload_UsageScenario
    * @model opposite="workload_UsageScenario" transient="false" ordered="false"
    * @generated
    */
   UsageScenario getUsageScenario_Workload();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.Workload#getUsageScenario_Workload <em>Usage Scenario Workload</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Usage Scenario Workload</em>' container reference.
    * @see #getUsageScenario_Workload()
    * @generated
    */
   void setUsageScenario_Workload(UsageScenario value);

} // Workload
