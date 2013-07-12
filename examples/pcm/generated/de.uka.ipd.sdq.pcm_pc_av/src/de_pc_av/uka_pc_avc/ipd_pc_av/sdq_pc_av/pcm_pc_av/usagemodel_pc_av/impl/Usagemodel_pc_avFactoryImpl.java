/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Usagemodel_pc_avFactoryImpl extends EFactoryImpl implements Usagemodel_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Usagemodel_pc_avFactory init() {
      try {
         Usagemodel_pc_avFactory theUsagemodel_pc_avFactory = (Usagemodel_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Usagemodel_pc_avPackage.eNS_URI);
         if (theUsagemodel_pc_avFactory != null) {
            return theUsagemodel_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Usagemodel_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Usagemodel_pc_avFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case Usagemodel_pc_avPackage.WORKLOAD: return createWorkload();
         case Usagemodel_pc_avPackage.USAGE_SCENARIO: return createUsageScenario();
         case Usagemodel_pc_avPackage.USER_DATA: return createUserData();
         case Usagemodel_pc_avPackage.USAGE_MODEL: return createUsageModel();
         case Usagemodel_pc_avPackage.ENTRY_LEVEL_SYSTEM_CALL: return createEntryLevelSystemCall();
         case Usagemodel_pc_avPackage.ABSTRACT_USER_ACTION: return createAbstractUserAction();
         case Usagemodel_pc_avPackage.SCENARIO_BEHAVIOUR: return createScenarioBehaviour();
         case Usagemodel_pc_avPackage.BRANCH_TRANSITION: return createBranchTransition();
         case Usagemodel_pc_avPackage.BRANCH: return createBranch();
         case Usagemodel_pc_avPackage.LOOP: return createLoop();
         case Usagemodel_pc_avPackage.STOP: return createStop();
         case Usagemodel_pc_avPackage.START: return createStart();
         case Usagemodel_pc_avPackage.OPEN_WORKLOAD: return createOpenWorkload();
         case Usagemodel_pc_avPackage.DELAY: return createDelay();
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD: return createClosedWorkload();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Workload createWorkload() {
      WorkloadImpl workload = new WorkloadImpl();
      return workload;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UsageScenario createUsageScenario() {
      UsageScenarioImpl usageScenario = new UsageScenarioImpl();
      return usageScenario;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UserData createUserData() {
      UserDataImpl userData = new UserDataImpl();
      return userData;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UsageModel createUsageModel() {
      UsageModelImpl usageModel = new UsageModelImpl();
      return usageModel;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EntryLevelSystemCall createEntryLevelSystemCall() {
      EntryLevelSystemCallImpl entryLevelSystemCall = new EntryLevelSystemCallImpl();
      return entryLevelSystemCall;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractUserAction createAbstractUserAction() {
      AbstractUserActionImpl abstractUserAction = new AbstractUserActionImpl();
      return abstractUserAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScenarioBehaviour createScenarioBehaviour() {
      ScenarioBehaviourImpl scenarioBehaviour = new ScenarioBehaviourImpl();
      return scenarioBehaviour;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BranchTransition createBranchTransition() {
      BranchTransitionImpl branchTransition = new BranchTransitionImpl();
      return branchTransition;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Branch createBranch() {
      BranchImpl branch = new BranchImpl();
      return branch;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Loop createLoop() {
      LoopImpl loop = new LoopImpl();
      return loop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Stop createStop() {
      StopImpl stop = new StopImpl();
      return stop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Start createStart() {
      StartImpl start = new StartImpl();
      return start;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OpenWorkload createOpenWorkload() {
      OpenWorkloadImpl openWorkload = new OpenWorkloadImpl();
      return openWorkload;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Delay createDelay() {
      DelayImpl delay = new DelayImpl();
      return delay;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ClosedWorkload createClosedWorkload() {
      ClosedWorkloadImpl closedWorkload = new ClosedWorkloadImpl();
      return closedWorkload;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Usagemodel_pc_avPackage getUsagemodel_pc_avPackage() {
      return (Usagemodel_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Usagemodel_pc_avPackage getPackage() {
      return Usagemodel_pc_avPackage.eINSTANCE;
   }

} //Usagemodel_pc_avFactoryImpl
