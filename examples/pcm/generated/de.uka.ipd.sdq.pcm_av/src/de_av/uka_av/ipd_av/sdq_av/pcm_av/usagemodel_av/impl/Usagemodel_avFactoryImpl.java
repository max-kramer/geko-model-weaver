/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.*;

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
public class Usagemodel_avFactoryImpl extends EFactoryImpl implements Usagemodel_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Usagemodel_avFactory init() {
      try {
         Usagemodel_avFactory theUsagemodel_avFactory = (Usagemodel_avFactory)EPackage.Registry.INSTANCE.getEFactory(Usagemodel_avPackage.eNS_URI);
         if (theUsagemodel_avFactory != null) {
            return theUsagemodel_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Usagemodel_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Usagemodel_avFactoryImpl() {
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
         case Usagemodel_avPackage.WORKLOAD: return createWorkload();
         case Usagemodel_avPackage.USAGE_SCENARIO: return createUsageScenario();
         case Usagemodel_avPackage.USER_DATA: return createUserData();
         case Usagemodel_avPackage.USAGE_MODEL: return createUsageModel();
         case Usagemodel_avPackage.ENTRY_LEVEL_SYSTEM_CALL: return createEntryLevelSystemCall();
         case Usagemodel_avPackage.ABSTRACT_USER_ACTION: return createAbstractUserAction();
         case Usagemodel_avPackage.SCENARIO_BEHAVIOUR: return createScenarioBehaviour();
         case Usagemodel_avPackage.BRANCH_TRANSITION: return createBranchTransition();
         case Usagemodel_avPackage.BRANCH: return createBranch();
         case Usagemodel_avPackage.LOOP: return createLoop();
         case Usagemodel_avPackage.STOP: return createStop();
         case Usagemodel_avPackage.START: return createStart();
         case Usagemodel_avPackage.OPEN_WORKLOAD: return createOpenWorkload();
         case Usagemodel_avPackage.DELAY: return createDelay();
         case Usagemodel_avPackage.CLOSED_WORKLOAD: return createClosedWorkload();
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
   public Usagemodel_avPackage getUsagemodel_avPackage() {
      return (Usagemodel_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Usagemodel_avPackage getPackage() {
      return Usagemodel_avPackage.eINSTANCE;
   }

} //Usagemodel_avFactoryImpl
