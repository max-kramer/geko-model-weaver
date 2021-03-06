/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UsageScenarios are concurrently executed behaviours of users within one UsageModel.  It describes which
 * services are directly invoked by users in one specific use case and models the possible sequences of calling
 * them. Each UsageScenario includes a workload and a scenario behaviour. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageScenario#getUsageModel_UsageScenario <em>Usage Model Usage Scenario</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageScenario#getScenarioBehaviour_UsageScenario <em>Scenario Behaviour Usage Scenario</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageScenario#getWorkload_UsageScenario <em>Workload Usage Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getUsageScenario()
 * @model
 * @generated
 */
public interface UsageScenario extends Entity {
   /**
    * Returns the value of the '<em><b>Usage Model Usage Scenario</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageModel#getUsageScenario_UsageModel <em>Usage Scenario Usage Model</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Usage Model Usage Scenario</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Usage Model Usage Scenario</em>' container reference.
    * @see #setUsageModel_UsageScenario(UsageModel)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getUsageScenario_UsageModel_UsageScenario()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageModel#getUsageScenario_UsageModel
    * @model opposite="usageScenario_UsageModel" transient="false" ordered="false"
    * @generated
    */
   UsageModel getUsageModel_UsageScenario();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageScenario#getUsageModel_UsageScenario <em>Usage Model Usage Scenario</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Usage Model Usage Scenario</em>' container reference.
    * @see #getUsageModel_UsageScenario()
    * @generated
    */
   void setUsageModel_UsageScenario(UsageModel value);

   /**
    * Returns the value of the '<em><b>Scenario Behaviour Usage Scenario</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.ScenarioBehaviour#getUsageScenario_SenarioBehaviour <em>Usage Scenario Senario Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Scenario Behaviour Usage Scenario</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Scenario Behaviour Usage Scenario</em>' containment reference.
    * @see #setScenarioBehaviour_UsageScenario(ScenarioBehaviour)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getUsageScenario_ScenarioBehaviour_UsageScenario()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.ScenarioBehaviour#getUsageScenario_SenarioBehaviour
    * @model opposite="usageScenario_SenarioBehaviour" containment="true" ordered="false"
    * @generated
    */
   ScenarioBehaviour getScenarioBehaviour_UsageScenario();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageScenario#getScenarioBehaviour_UsageScenario <em>Scenario Behaviour Usage Scenario</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Scenario Behaviour Usage Scenario</em>' containment reference.
    * @see #getScenarioBehaviour_UsageScenario()
    * @generated
    */
   void setScenarioBehaviour_UsageScenario(ScenarioBehaviour value);

   /**
    * Returns the value of the '<em><b>Workload Usage Scenario</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Workload#getUsageScenario_Workload <em>Usage Scenario Workload</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Workload Usage Scenario</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Workload Usage Scenario</em>' containment reference.
    * @see #setWorkload_UsageScenario(Workload)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage#getUsageScenario_Workload_UsageScenario()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Workload#getUsageScenario_Workload
    * @model opposite="usageScenario_Workload" containment="true" ordered="false"
    * @generated
    */
   Workload getWorkload_UsageScenario();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.UsageScenario#getWorkload_UsageScenario <em>Workload Usage Scenario</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Workload Usage Scenario</em>' containment reference.
    * @see #getWorkload_UsageScenario()
    * @generated
    */
   void setWorkload_UsageScenario(Workload value);

} // UsageScenario
