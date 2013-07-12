/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The UsageModel specifies the whole user interaction with a system from a performance viewpoint. It consists of a number of concurrently executed UsageScenarios and a set of global UserData specifications. Each UsageScenario includes a workload and a scenario behaviour. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.UsageModel#getUsageScenario_UsageModel <em>Usage Scenario Usage Model</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.UsageModel#getUserData_UsageModel <em>User Data Usage Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Usagemodel_pc_pcPackage#getUsageModel()
 * @model
 * @generated
 */
public interface UsageModel extends EObject {
   /**
    * Returns the value of the '<em><b>Usage Scenario Usage Model</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.UsageScenario}.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.UsageScenario#getUsageModel_UsageScenario <em>Usage Model Usage Scenario</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Usage Scenario Usage Model</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Usage Scenario Usage Model</em>' containment reference list.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Usagemodel_pc_pcPackage#getUsageModel_UsageScenario_UsageModel()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.UsageScenario#getUsageModel_UsageScenario
    * @model opposite="usageModel_UsageScenario" containment="true" ordered="false"
    * @generated
    */
   EList<UsageScenario> getUsageScenario_UsageModel();

   /**
    * Returns the value of the '<em><b>User Data Usage Model</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.UserData}.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.UserData#getUsageModel_UserData <em>Usage Model User Data</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>User Data Usage Model</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>User Data Usage Model</em>' containment reference list.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Usagemodel_pc_pcPackage#getUsageModel_UserData_UsageModel()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.UserData#getUsageModel_UserData
    * @model opposite="usageModel_UserData" containment="true" ordered="false"
    * @generated
    */
   EList<UserData> getUserData_UsageModel();

} // UsageModel
