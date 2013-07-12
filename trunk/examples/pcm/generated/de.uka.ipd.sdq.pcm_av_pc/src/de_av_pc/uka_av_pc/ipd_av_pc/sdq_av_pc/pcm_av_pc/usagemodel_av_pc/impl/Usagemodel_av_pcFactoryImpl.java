/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.*;

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
public class Usagemodel_av_pcFactoryImpl extends EFactoryImpl implements Usagemodel_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Usagemodel_av_pcFactory init() {
      try {
         Usagemodel_av_pcFactory theUsagemodel_av_pcFactory = (Usagemodel_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Usagemodel_av_pcPackage.eNS_URI);
         if (theUsagemodel_av_pcFactory != null) {
            return theUsagemodel_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Usagemodel_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Usagemodel_av_pcFactoryImpl() {
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
         case Usagemodel_av_pcPackage.WORKLOAD: return createWorkload();
         case Usagemodel_av_pcPackage.USAGE_SCENARIO: return createUsageScenario();
         case Usagemodel_av_pcPackage.USER_DATA: return createUserData();
         case Usagemodel_av_pcPackage.USAGE_MODEL: return createUsageModel();
         case Usagemodel_av_pcPackage.ENTRY_LEVEL_SYSTEM_CALL: return createEntryLevelSystemCall();
         case Usagemodel_av_pcPackage.ABSTRACT_USER_ACTION: return createAbstractUserAction();
         case Usagemodel_av_pcPackage.SCENARIO_BEHAVIOUR: return createScenarioBehaviour();
         case Usagemodel_av_pcPackage.BRANCH_TRANSITION: return createBranchTransition();
         case Usagemodel_av_pcPackage.BRANCH: return createBranch();
         case Usagemodel_av_pcPackage.LOOP: return createLoop();
         case Usagemodel_av_pcPackage.STOP: return createStop();
         case Usagemodel_av_pcPackage.START: return createStart();
         case Usagemodel_av_pcPackage.OPEN_WORKLOAD: return createOpenWorkload();
         case Usagemodel_av_pcPackage.DELAY: return createDelay();
         case Usagemodel_av_pcPackage.CLOSED_WORKLOAD: return createClosedWorkload();
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
   public Usagemodel_av_pcPackage getUsagemodel_av_pcPackage() {
      return (Usagemodel_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Usagemodel_av_pcPackage getPackage() {
      return Usagemodel_av_pcPackage.eINSTANCE;
   }

} //Usagemodel_av_pcFactoryImpl
