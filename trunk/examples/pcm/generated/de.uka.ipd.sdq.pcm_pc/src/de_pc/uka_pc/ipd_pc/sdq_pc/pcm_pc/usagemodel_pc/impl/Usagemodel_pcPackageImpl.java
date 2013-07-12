/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pcm_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.Allocation_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.impl.Allocation_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc.Completions_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.completions_pc.impl.Completions_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.Core_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.Composition_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.impl.Composition_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.impl.Entity_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.impl.Core_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.Pcm_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.Parameter_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.impl.Parameter_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.protocol_pc.Protocol_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.protocol_pc.impl.Protocol_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.Qosannotations_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.impl.Qosannotations_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.qos_performance_pc.Qos_performance_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.qos_performance_pc.impl.Qos_performance_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.qos_reliability_pc.Qos_reliability_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.qos_reliability_pc.impl.Qos_reliability_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.Reliability_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.impl.Reliability_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.impl.Repository_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.Resourceenvironment_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.impl.Resourceenvironment_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.Resourcetype_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.impl.Resourcetype_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.impl.Seff_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.Seff_performance_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.impl.Seff_performance_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.Seff_reliability_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.Seff_reliability_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.subsystem_pc.Subsystem_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.subsystem_pc.impl.Subsystem_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.system_pc.System_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.system_pc.impl.System_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.AbstractUserAction;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Branch;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.BranchTransition;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.ClosedWorkload;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Delay;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.EntryLevelSystemCall;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Loop;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.OpenWorkload;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.ScenarioBehaviour;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Start;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Stop;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.UsageModel;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.UsageScenario;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcFactory;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcPackage;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.UserData;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Workload;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.util.Usagemodel_pcValidator;

import de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Usagemodel_pcPackageImpl extends EPackageImpl implements Usagemodel_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass workloadEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass usageScenarioEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass userDataEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass usageModelEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass entryLevelSystemCallEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractUserActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass scenarioBehaviourEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass branchTransitionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass branchEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass loopEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass stopEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass startEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass openWorkloadEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass delayEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass closedWorkloadEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Usagemodel_pcPackageImpl() {
      super(eNS_URI, Usagemodel_pcFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link Usagemodel_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Usagemodel_pcPackage init() {
      if (isInited) return (Usagemodel_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pcPackage.eNS_URI);

      // Obtain or create and register package
      Usagemodel_pcPackageImpl theUsagemodel_pcPackage = (Usagemodel_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Usagemodel_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Usagemodel_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pcPackage.eINSTANCE.eClass();
      Stoex_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_pcPackageImpl thePcm_pcPackage = (Pcm_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_pcPackage.eNS_URI) instanceof Pcm_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_pcPackage.eNS_URI) : Pcm_pcPackage.eINSTANCE);
      Core_pcPackageImpl theCore_pcPackage = (Core_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_pcPackage.eNS_URI) instanceof Core_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_pcPackage.eNS_URI) : Core_pcPackage.eINSTANCE);
      Entity_pcPackageImpl theEntity_pcPackage = (Entity_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_pcPackage.eNS_URI) instanceof Entity_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_pcPackage.eNS_URI) : Entity_pcPackage.eINSTANCE);
      Composition_pcPackageImpl theComposition_pcPackage = (Composition_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_pcPackage.eNS_URI) instanceof Composition_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_pcPackage.eNS_URI) : Composition_pcPackage.eINSTANCE);
      Repository_pcPackageImpl theRepository_pcPackage = (Repository_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_pcPackage.eNS_URI) instanceof Repository_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_pcPackage.eNS_URI) : Repository_pcPackage.eINSTANCE);
      Resourcetype_pcPackageImpl theResourcetype_pcPackage = (Resourcetype_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pcPackage.eNS_URI) instanceof Resourcetype_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pcPackage.eNS_URI) : Resourcetype_pcPackage.eINSTANCE);
      Protocol_pcPackageImpl theProtocol_pcPackage = (Protocol_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_pcPackage.eNS_URI) instanceof Protocol_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_pcPackage.eNS_URI) : Protocol_pcPackage.eINSTANCE);
      Parameter_pcPackageImpl theParameter_pcPackage = (Parameter_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_pcPackage.eNS_URI) instanceof Parameter_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_pcPackage.eNS_URI) : Parameter_pcPackage.eINSTANCE);
      Reliability_pcPackageImpl theReliability_pcPackage = (Reliability_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_pcPackage.eNS_URI) instanceof Reliability_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_pcPackage.eNS_URI) : Reliability_pcPackage.eINSTANCE);
      Seff_pcPackageImpl theSeff_pcPackage = (Seff_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_pcPackage.eNS_URI) instanceof Seff_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_pcPackage.eNS_URI) : Seff_pcPackage.eINSTANCE);
      Seff_performance_pcPackageImpl theSeff_performance_pcPackage = (Seff_performance_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pcPackage.eNS_URI) instanceof Seff_performance_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pcPackage.eNS_URI) : Seff_performance_pcPackage.eINSTANCE);
      Seff_reliability_pcPackageImpl theSeff_reliability_pcPackage = (Seff_reliability_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pcPackage.eNS_URI) instanceof Seff_reliability_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pcPackage.eNS_URI) : Seff_reliability_pcPackage.eINSTANCE);
      Qosannotations_pcPackageImpl theQosannotations_pcPackage = (Qosannotations_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pcPackage.eNS_URI) instanceof Qosannotations_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pcPackage.eNS_URI) : Qosannotations_pcPackage.eINSTANCE);
      Qos_performance_pcPackageImpl theQos_performance_pcPackage = (Qos_performance_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pcPackage.eNS_URI) instanceof Qos_performance_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pcPackage.eNS_URI) : Qos_performance_pcPackage.eINSTANCE);
      Qos_reliability_pcPackageImpl theQos_reliability_pcPackage = (Qos_reliability_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pcPackage.eNS_URI) instanceof Qos_reliability_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pcPackage.eNS_URI) : Qos_reliability_pcPackage.eINSTANCE);
      System_pcPackageImpl theSystem_pcPackage = (System_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_pcPackage.eNS_URI) instanceof System_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_pcPackage.eNS_URI) : System_pcPackage.eINSTANCE);
      Resourceenvironment_pcPackageImpl theResourceenvironment_pcPackage = (Resourceenvironment_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pcPackage.eNS_URI) instanceof Resourceenvironment_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pcPackage.eNS_URI) : Resourceenvironment_pcPackage.eINSTANCE);
      Allocation_pcPackageImpl theAllocation_pcPackage = (Allocation_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pcPackage.eNS_URI) instanceof Allocation_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pcPackage.eNS_URI) : Allocation_pcPackage.eINSTANCE);
      Subsystem_pcPackageImpl theSubsystem_pcPackage = (Subsystem_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pcPackage.eNS_URI) instanceof Subsystem_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pcPackage.eNS_URI) : Subsystem_pcPackage.eINSTANCE);
      Completions_pcPackageImpl theCompletions_pcPackage = (Completions_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pcPackage.eNS_URI) instanceof Completions_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pcPackage.eNS_URI) : Completions_pcPackage.eINSTANCE);

      // Create package meta-data objects
      theUsagemodel_pcPackage.createPackageContents();
      thePcm_pcPackage.createPackageContents();
      theCore_pcPackage.createPackageContents();
      theEntity_pcPackage.createPackageContents();
      theComposition_pcPackage.createPackageContents();
      theRepository_pcPackage.createPackageContents();
      theResourcetype_pcPackage.createPackageContents();
      theProtocol_pcPackage.createPackageContents();
      theParameter_pcPackage.createPackageContents();
      theReliability_pcPackage.createPackageContents();
      theSeff_pcPackage.createPackageContents();
      theSeff_performance_pcPackage.createPackageContents();
      theSeff_reliability_pcPackage.createPackageContents();
      theQosannotations_pcPackage.createPackageContents();
      theQos_performance_pcPackage.createPackageContents();
      theQos_reliability_pcPackage.createPackageContents();
      theSystem_pcPackage.createPackageContents();
      theResourceenvironment_pcPackage.createPackageContents();
      theAllocation_pcPackage.createPackageContents();
      theSubsystem_pcPackage.createPackageContents();
      theCompletions_pcPackage.createPackageContents();

      // Initialize created meta-data
      theUsagemodel_pcPackage.initializePackageContents();
      thePcm_pcPackage.initializePackageContents();
      theCore_pcPackage.initializePackageContents();
      theEntity_pcPackage.initializePackageContents();
      theComposition_pcPackage.initializePackageContents();
      theRepository_pcPackage.initializePackageContents();
      theResourcetype_pcPackage.initializePackageContents();
      theProtocol_pcPackage.initializePackageContents();
      theParameter_pcPackage.initializePackageContents();
      theReliability_pcPackage.initializePackageContents();
      theSeff_pcPackage.initializePackageContents();
      theSeff_performance_pcPackage.initializePackageContents();
      theSeff_reliability_pcPackage.initializePackageContents();
      theQosannotations_pcPackage.initializePackageContents();
      theQos_performance_pcPackage.initializePackageContents();
      theQos_reliability_pcPackage.initializePackageContents();
      theSystem_pcPackage.initializePackageContents();
      theResourceenvironment_pcPackage.initializePackageContents();
      theAllocation_pcPackage.initializePackageContents();
      theSubsystem_pcPackage.initializePackageContents();
      theCompletions_pcPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theUsagemodel_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Usagemodel_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theUsagemodel_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Usagemodel_pcPackage.eNS_URI, theUsagemodel_pcPackage);
      return theUsagemodel_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getWorkload() {
      return workloadEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getWorkload_UsageScenario_Workload() {
      return (EReference)workloadEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUsageScenario() {
      return usageScenarioEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUsageScenario_UsageModel_UsageScenario() {
      return (EReference)usageScenarioEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUsageScenario_ScenarioBehaviour_UsageScenario() {
      return (EReference)usageScenarioEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUsageScenario_Workload_UsageScenario() {
      return (EReference)usageScenarioEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUserData() {
      return userDataEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUserData_AssemblyContext_userData() {
      return (EReference)userDataEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUserData_UsageModel_UserData() {
      return (EReference)userDataEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUserData_UserDataParameterUsages_UserData() {
      return (EReference)userDataEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUsageModel() {
      return usageModelEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUsageModel_UsageScenario_UsageModel() {
      return (EReference)usageModelEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUsageModel_UserData_UsageModel() {
      return (EReference)usageModelEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEntryLevelSystemCall() {
      return entryLevelSystemCallEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEntryLevelSystemCall_ProvidedRole_EntryLevelSystemCall() {
      return (EReference)entryLevelSystemCallEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEntryLevelSystemCall_OperationSignature__EntryLevelSystemCall() {
      return (EReference)entryLevelSystemCallEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEntryLevelSystemCall_OutputParameterUsages_EntryLevelSystemCall() {
      return (EReference)entryLevelSystemCallEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEntryLevelSystemCall_Priority() {
      return (EAttribute)entryLevelSystemCallEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEntryLevelSystemCall_InputParameterUsages_EntryLevelSystemCall() {
      return (EReference)entryLevelSystemCallEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractUserAction() {
      return abstractUserActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractUserAction_Successor() {
      return (EReference)abstractUserActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractUserAction_Predecessor() {
      return (EReference)abstractUserActionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractUserAction_ScenarioBehaviour_AbstractUserAction() {
      return (EReference)abstractUserActionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getScenarioBehaviour() {
      return scenarioBehaviourEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScenarioBehaviour_UsageScenario_SenarioBehaviour() {
      return (EReference)scenarioBehaviourEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScenarioBehaviour_BranchTransition_ScenarioBehaviour() {
      return (EReference)scenarioBehaviourEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScenarioBehaviour_Loop_ScenarioBehaviour() {
      return (EReference)scenarioBehaviourEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getScenarioBehaviour_Actions_ScenarioBehaviour() {
      return (EReference)scenarioBehaviourEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBranchTransition() {
      return branchTransitionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getBranchTransition_BranchProbability() {
      return (EAttribute)branchTransitionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBranchTransition_Branch_BranchTransition() {
      return (EReference)branchTransitionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBranchTransition_BranchedBehaviour_BranchTransition() {
      return (EReference)branchTransitionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBranch() {
      return branchEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBranch_BranchTransitions_Branch() {
      return (EReference)branchEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getLoop() {
      return loopEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLoop_LoopIteration_Loop() {
      return (EReference)loopEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLoop_BodyBehaviour_Loop() {
      return (EReference)loopEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getStop() {
      return stopEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getStart() {
      return startEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getOpenWorkload() {
      return openWorkloadEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getOpenWorkload_InterArrivalTime_OpenWorkload() {
      return (EReference)openWorkloadEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDelay() {
      return delayEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getDelay_TimeSpecification_Delay() {
      return (EReference)delayEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getClosedWorkload() {
      return closedWorkloadEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getClosedWorkload_Population() {
      return (EAttribute)closedWorkloadEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getClosedWorkload_ThinkTime_ClosedWorkload() {
      return (EReference)closedWorkloadEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Usagemodel_pcFactory getUsagemodel_pcFactory() {
      return (Usagemodel_pcFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents() {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      workloadEClass = createEClass(WORKLOAD);
      createEReference(workloadEClass, WORKLOAD__USAGE_SCENARIO_WORKLOAD);

      usageScenarioEClass = createEClass(USAGE_SCENARIO);
      createEReference(usageScenarioEClass, USAGE_SCENARIO__USAGE_MODEL_USAGE_SCENARIO);
      createEReference(usageScenarioEClass, USAGE_SCENARIO__SCENARIO_BEHAVIOUR_USAGE_SCENARIO);
      createEReference(usageScenarioEClass, USAGE_SCENARIO__WORKLOAD_USAGE_SCENARIO);

      userDataEClass = createEClass(USER_DATA);
      createEReference(userDataEClass, USER_DATA__ASSEMBLY_CONTEXT_USER_DATA);
      createEReference(userDataEClass, USER_DATA__USAGE_MODEL_USER_DATA);
      createEReference(userDataEClass, USER_DATA__USER_DATA_PARAMETER_USAGES_USER_DATA);

      usageModelEClass = createEClass(USAGE_MODEL);
      createEReference(usageModelEClass, USAGE_MODEL__USAGE_SCENARIO_USAGE_MODEL);
      createEReference(usageModelEClass, USAGE_MODEL__USER_DATA_USAGE_MODEL);

      entryLevelSystemCallEClass = createEClass(ENTRY_LEVEL_SYSTEM_CALL);
      createEReference(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__PROVIDED_ROLE_ENTRY_LEVEL_SYSTEM_CALL);
      createEReference(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_ENTRY_LEVEL_SYSTEM_CALL);
      createEReference(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_ENTRY_LEVEL_SYSTEM_CALL);
      createEAttribute(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__PRIORITY);
      createEReference(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_ENTRY_LEVEL_SYSTEM_CALL);

      abstractUserActionEClass = createEClass(ABSTRACT_USER_ACTION);
      createEReference(abstractUserActionEClass, ABSTRACT_USER_ACTION__SUCCESSOR);
      createEReference(abstractUserActionEClass, ABSTRACT_USER_ACTION__PREDECESSOR);
      createEReference(abstractUserActionEClass, ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION);

      scenarioBehaviourEClass = createEClass(SCENARIO_BEHAVIOUR);
      createEReference(scenarioBehaviourEClass, SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR);
      createEReference(scenarioBehaviourEClass, SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR);
      createEReference(scenarioBehaviourEClass, SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR);
      createEReference(scenarioBehaviourEClass, SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR);

      branchTransitionEClass = createEClass(BRANCH_TRANSITION);
      createEAttribute(branchTransitionEClass, BRANCH_TRANSITION__BRANCH_PROBABILITY);
      createEReference(branchTransitionEClass, BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION);
      createEReference(branchTransitionEClass, BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION);

      branchEClass = createEClass(BRANCH);
      createEReference(branchEClass, BRANCH__BRANCH_TRANSITIONS_BRANCH);

      loopEClass = createEClass(LOOP);
      createEReference(loopEClass, LOOP__LOOP_ITERATION_LOOP);
      createEReference(loopEClass, LOOP__BODY_BEHAVIOUR_LOOP);

      stopEClass = createEClass(STOP);

      startEClass = createEClass(START);

      openWorkloadEClass = createEClass(OPEN_WORKLOAD);
      createEReference(openWorkloadEClass, OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD);

      delayEClass = createEClass(DELAY);
      createEReference(delayEClass, DELAY__TIME_SPECIFICATION_DELAY);

      closedWorkloadEClass = createEClass(CLOSED_WORKLOAD);
      createEAttribute(closedWorkloadEClass, CLOSED_WORKLOAD__POPULATION);
      createEReference(closedWorkloadEClass, CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents() {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      Entity_pcPackage theEntity_pcPackage = (Entity_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_pcPackage.eNS_URI);
      Composition_pcPackage theComposition_pcPackage = (Composition_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_pcPackage.eNS_URI);
      Parameter_pcPackage theParameter_pcPackage = (Parameter_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_pcPackage.eNS_URI);
      Repository_pcPackage theRepository_pcPackage = (Repository_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_pcPackage.eNS_URI);
      Core_pcPackage theCore_pcPackage = (Core_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      usageScenarioEClass.getESuperTypes().add(theEntity_pcPackage.getEntity());
      entryLevelSystemCallEClass.getESuperTypes().add(this.getAbstractUserAction());
      abstractUserActionEClass.getESuperTypes().add(theEntity_pcPackage.getEntity());
      scenarioBehaviourEClass.getESuperTypes().add(theEntity_pcPackage.getEntity());
      branchEClass.getESuperTypes().add(this.getAbstractUserAction());
      loopEClass.getESuperTypes().add(this.getAbstractUserAction());
      stopEClass.getESuperTypes().add(this.getAbstractUserAction());
      startEClass.getESuperTypes().add(this.getAbstractUserAction());
      openWorkloadEClass.getESuperTypes().add(this.getWorkload());
      delayEClass.getESuperTypes().add(this.getAbstractUserAction());
      closedWorkloadEClass.getESuperTypes().add(this.getWorkload());

      // Initialize classes and features; add operations and parameters
      initEClass(workloadEClass, Workload.class, "Workload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getWorkload_UsageScenario_Workload(), this.getUsageScenario(), this.getUsageScenario_Workload_UsageScenario(), "usageScenario_Workload", null, 0, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(usageScenarioEClass, UsageScenario.class, "UsageScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getUsageScenario_UsageModel_UsageScenario(), this.getUsageModel(), this.getUsageModel_UsageScenario_UsageModel(), "usageModel_UsageScenario", null, 0, 1, UsageScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getUsageScenario_ScenarioBehaviour_UsageScenario(), this.getScenarioBehaviour(), this.getScenarioBehaviour_UsageScenario_SenarioBehaviour(), "scenarioBehaviour_UsageScenario", null, 0, 1, UsageScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getUsageScenario_Workload_UsageScenario(), this.getWorkload(), this.getWorkload_UsageScenario_Workload(), "workload_UsageScenario", null, 0, 1, UsageScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(userDataEClass, UserData.class, "UserData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getUserData_AssemblyContext_userData(), theComposition_pcPackage.getAssemblyContext(), null, "assemblyContext_userData", null, 0, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getUserData_UsageModel_UserData(), this.getUsageModel(), this.getUsageModel_UserData_UsageModel(), "usageModel_UserData", null, 0, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getUserData_UserDataParameterUsages_UserData(), theParameter_pcPackage.getVariableUsage(), theParameter_pcPackage.getVariableUsage_UserData_VariableUsage(), "userDataParameterUsages_UserData", null, 0, -1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(usageModelEClass, UsageModel.class, "UsageModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getUsageModel_UsageScenario_UsageModel(), this.getUsageScenario(), this.getUsageScenario_UsageModel_UsageScenario(), "usageScenario_UsageModel", null, 0, -1, UsageModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getUsageModel_UserData_UsageModel(), this.getUserData(), this.getUserData_UsageModel_UserData(), "userData_UsageModel", null, 0, -1, UsageModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(entryLevelSystemCallEClass, EntryLevelSystemCall.class, "EntryLevelSystemCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEntryLevelSystemCall_ProvidedRole_EntryLevelSystemCall(), theRepository_pcPackage.getOperationProvidedRole(), null, "providedRole_EntryLevelSystemCall", null, 0, 1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEntryLevelSystemCall_OperationSignature__EntryLevelSystemCall(), theRepository_pcPackage.getOperationSignature(), null, "operationSignature__EntryLevelSystemCall", null, 0, 1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEntryLevelSystemCall_OutputParameterUsages_EntryLevelSystemCall(), theParameter_pcPackage.getVariableUsage(), theParameter_pcPackage.getVariableUsage_EntryLevelSystemCall_OutputParameterUsage(), "outputParameterUsages_EntryLevelSystemCall", null, 0, -1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getEntryLevelSystemCall_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEntryLevelSystemCall_InputParameterUsages_EntryLevelSystemCall(), theParameter_pcPackage.getVariableUsage(), theParameter_pcPackage.getVariableUsage_EntryLevelSystemCall_InputParameterUsage(), "inputParameterUsages_EntryLevelSystemCall", null, 0, -1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(entryLevelSystemCallEClass, ecorePackage.getEBoolean(), "EntryLevelSystemCallMustReferenceProvidedRoleOfASystem", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(entryLevelSystemCallEClass, ecorePackage.getEBoolean(), "EntryLevelSystemCallSignatureMustMatchItsProvidedRole", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(abstractUserActionEClass, AbstractUserAction.class, "AbstractUserAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAbstractUserAction_Successor(), this.getAbstractUserAction(), this.getAbstractUserAction_Predecessor(), "successor", null, 0, 1, AbstractUserAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractUserAction_Predecessor(), this.getAbstractUserAction(), this.getAbstractUserAction_Successor(), "predecessor", null, 0, 1, AbstractUserAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractUserAction_ScenarioBehaviour_AbstractUserAction(), this.getScenarioBehaviour(), this.getScenarioBehaviour_Actions_ScenarioBehaviour(), "scenarioBehaviour_AbstractUserAction", null, 0, 1, AbstractUserAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(scenarioBehaviourEClass, ScenarioBehaviour.class, "ScenarioBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getScenarioBehaviour_UsageScenario_SenarioBehaviour(), this.getUsageScenario(), this.getUsageScenario_ScenarioBehaviour_UsageScenario(), "usageScenario_SenarioBehaviour", null, 0, 1, ScenarioBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getScenarioBehaviour_BranchTransition_ScenarioBehaviour(), this.getBranchTransition(), this.getBranchTransition_BranchedBehaviour_BranchTransition(), "branchTransition_ScenarioBehaviour", null, 0, 1, ScenarioBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getScenarioBehaviour_Loop_ScenarioBehaviour(), this.getLoop(), this.getLoop_BodyBehaviour_Loop(), "loop_ScenarioBehaviour", null, 0, 1, ScenarioBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getScenarioBehaviour_Actions_ScenarioBehaviour(), this.getAbstractUserAction(), this.getAbstractUserAction_ScenarioBehaviour_AbstractUserAction(), "actions_ScenarioBehaviour", null, 0, -1, ScenarioBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(scenarioBehaviourEClass, ecorePackage.getEBoolean(), "Exactlyonestart", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(scenarioBehaviourEClass, ecorePackage.getEBoolean(), "Exactlyonestop", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(scenarioBehaviourEClass, ecorePackage.getEBoolean(), "EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(branchTransitionEClass, BranchTransition.class, "BranchTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getBranchTransition_BranchProbability(), ecorePackage.getEDouble(), "branchProbability", null, 1, 1, BranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getBranchTransition_Branch_BranchTransition(), this.getBranch(), this.getBranch_BranchTransitions_Branch(), "branch_BranchTransition", null, 0, 1, BranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getBranchTransition_BranchedBehaviour_BranchTransition(), this.getScenarioBehaviour(), this.getScenarioBehaviour_BranchTransition_ScenarioBehaviour(), "branchedBehaviour_BranchTransition", null, 0, 1, BranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getBranch_BranchTransitions_Branch(), this.getBranchTransition(), this.getBranchTransition_Branch_BranchTransition(), "branchTransitions_Branch", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(branchEClass, ecorePackage.getEBoolean(), "AllBranchProbabilitiesMustSumUpTo1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getLoop_LoopIteration_Loop(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_Loop_LoopIteration(), "loopIteration_Loop", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLoop_BodyBehaviour_Loop(), this.getScenarioBehaviour(), this.getScenarioBehaviour_Loop_ScenarioBehaviour(), "bodyBehaviour_Loop", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = addEOperation(stopEClass, ecorePackage.getEBoolean(), "StopHasNoSuccessor", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = addEOperation(startEClass, ecorePackage.getEBoolean(), "StartHasNoPredecessor", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(openWorkloadEClass, OpenWorkload.class, "OpenWorkload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getOpenWorkload_InterArrivalTime_OpenWorkload(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_OpenWorkload_PCMRandomVariable(), "interArrivalTime_OpenWorkload", null, 0, 1, OpenWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(openWorkloadEClass, ecorePackage.getEBoolean(), "InterArrivalTimeInOpenWorkloadNeedsToBeSpecified", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getDelay_TimeSpecification_Delay(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_Delay_TimeSpecification(), "timeSpecification_Delay", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(closedWorkloadEClass, ClosedWorkload.class, "ClosedWorkload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getClosedWorkload_Population(), ecorePackage.getEInt(), "population", null, 1, 1, ClosedWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getClosedWorkload_ThinkTime_ClosedWorkload(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_ClosedWorkload_PCMRandomVariable(), "thinkTime_ClosedWorkload", null, 0, 1, ClosedWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(closedWorkloadEClass, ecorePackage.getEBoolean(), "PopulationInClosedWorkloadNeedsToBeSpecified", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(closedWorkloadEClass, ecorePackage.getEBoolean(), "ThinkTimeInClosedWorkloadNeedsToBeSpecified", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      // Create annotations
      // http://www.eclipse.org/uml2/1.1.0/GenModel
      createGenModel_1Annotations();
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModel_1Annotations() {
      String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";								
      addAnnotation
        (entryLevelSystemCallEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.providedRole_EntryLevelSystemCall.providingEntity_ProvidedRole.oclIsTypeOf(pcm::system::System)"
         });				
      addAnnotation
        (entryLevelSystemCallEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.providedRole_EntryLevelSystemCall.providedInterface__OperationProvidedRole.signatures__OperationInterface->includes(self.operationSignature__EntryLevelSystemCall)"
         });						
      addAnnotation
        (scenarioBehaviourEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.actions_ScenarioBehaviour->select(s|s.oclIsTypeOf(Start))->size() = 1"
         });				
      addAnnotation
        (scenarioBehaviourEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.actions_ScenarioBehaviour->select(s|s.oclIsTypeOf(Stop))->size() = 1"
         });				
      addAnnotation
        (scenarioBehaviourEClass.getEOperations().get(2), 
         source, 
         new String[] {
          "body", "not self.actions_ScenarioBehaviour->select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))->exists(a|a.oclAsType(AbstractUserAction).predecessor.oclIsUndefined()) and not self.actions_ScenarioBehaviour->select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))->exists(a|a.oclAsType(AbstractUserAction).successor.oclIsUndefined())"
         });						
      addAnnotation
        (branchEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self->collect(branchTransitions_Branch.branchProbability)->sum() > 0.999 and self->collect(branchTransitions_Branch.branchProbability)->sum() <1.001"
         });						
      addAnnotation
        (stopEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.successor.oclIsUndefined()"
         });					
      addAnnotation
        (startEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.predecessor.oclIsUndefined()"
         });					
      addAnnotation
        (openWorkloadEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "not self.interArrivalTime_OpenWorkload.oclIsUndefined() and self.interArrivalTime_OpenWorkload.specification <> \'\'"
         });						
      addAnnotation
        (closedWorkloadEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "not self.population.oclIsUndefined() and self.population <> \'\'"
         });				
      addAnnotation
        (closedWorkloadEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "not self.thinkTime_ClosedWorkload.oclIsUndefined() and self.thinkTime_ClosedWorkload.specification <> \'\'"
         });		
   }

} //Usagemodel_pcPackageImpl
