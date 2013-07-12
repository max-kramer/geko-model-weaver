/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcPackage
 * @generated
 */
public interface Usagemodel_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Usagemodel_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.impl.Usagemodel_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Workload</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Workload</em>'.
    * @generated
    */
   Workload createWorkload();

   /**
    * Returns a new object of class '<em>Usage Scenario</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Usage Scenario</em>'.
    * @generated
    */
   UsageScenario createUsageScenario();

   /**
    * Returns a new object of class '<em>User Data</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>User Data</em>'.
    * @generated
    */
   UserData createUserData();

   /**
    * Returns a new object of class '<em>Usage Model</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Usage Model</em>'.
    * @generated
    */
   UsageModel createUsageModel();

   /**
    * Returns a new object of class '<em>Entry Level System Call</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Entry Level System Call</em>'.
    * @generated
    */
   EntryLevelSystemCall createEntryLevelSystemCall();

   /**
    * Returns a new object of class '<em>Abstract User Action</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Abstract User Action</em>'.
    * @generated
    */
   AbstractUserAction createAbstractUserAction();

   /**
    * Returns a new object of class '<em>Scenario Behaviour</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Scenario Behaviour</em>'.
    * @generated
    */
   ScenarioBehaviour createScenarioBehaviour();

   /**
    * Returns a new object of class '<em>Branch Transition</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Branch Transition</em>'.
    * @generated
    */
   BranchTransition createBranchTransition();

   /**
    * Returns a new object of class '<em>Branch</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Branch</em>'.
    * @generated
    */
   Branch createBranch();

   /**
    * Returns a new object of class '<em>Loop</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Loop</em>'.
    * @generated
    */
   Loop createLoop();

   /**
    * Returns a new object of class '<em>Stop</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Stop</em>'.
    * @generated
    */
   Stop createStop();

   /**
    * Returns a new object of class '<em>Start</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Start</em>'.
    * @generated
    */
   Start createStart();

   /**
    * Returns a new object of class '<em>Open Workload</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Open Workload</em>'.
    * @generated
    */
   OpenWorkload createOpenWorkload();

   /**
    * Returns a new object of class '<em>Delay</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Delay</em>'.
    * @generated
    */
   Delay createDelay();

   /**
    * Returns a new object of class '<em>Closed Workload</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Closed Workload</em>'.
    * @generated
    */
   ClosedWorkload createClosedWorkload();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Usagemodel_pcPackage getUsagemodel_pcPackage();

} //Usagemodel_pcFactory
