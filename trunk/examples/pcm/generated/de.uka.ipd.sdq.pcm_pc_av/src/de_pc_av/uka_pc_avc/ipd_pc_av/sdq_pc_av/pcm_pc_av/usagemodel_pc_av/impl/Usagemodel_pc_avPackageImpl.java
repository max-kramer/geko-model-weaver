/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.Identifier_pc_avPackage;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.Pcm_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av.Allocation_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av.impl.Allocation_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.Completions_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.impl.Completions_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.Core_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.impl.Composition_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.Entity_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.impl.Core_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.impl.Pcm_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.Parameter_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.impl.Parameter_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.protocol_pc_av.Protocol_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.protocol_pc_av.impl.Protocol_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.Qosannotations_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.impl.Qosannotations_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.Qos_performance_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.impl.Qos_performance_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.Qos_reliability_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.Qos_reliability_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.Reliability_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.impl.Reliability_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.Resourcetype_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.impl.Resourcetype_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.Seff_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_performance_pc_av.Seff_performance_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_performance_pc_av.impl.Seff_performance_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.Seff_reliability_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.impl.Seff_reliability_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.subsystem_pc_av.Subsystem_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.subsystem_pc_av.impl.Subsystem_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.System_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.system_pc_av.impl.System_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.AbstractUserAction;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Branch;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.BranchTransition;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.ClosedWorkload;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Delay;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.EntryLevelSystemCall;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Loop;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.OpenWorkload;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.ScenarioBehaviour;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Start;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Stop;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.UsageModel;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.UsageScenario;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Usagemodel_pc_avFactory;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Usagemodel_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.UserData;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Workload;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.util.Usagemodel_pc_avValidator;

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
public class Usagemodel_pc_avPackageImpl extends EPackageImpl implements Usagemodel_pc_avPackage {
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
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Usagemodel_pc_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Usagemodel_pc_avPackageImpl() {
      super(eNS_URI, Usagemodel_pc_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Usagemodel_pc_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Usagemodel_pc_avPackage init() {
      if (isInited) return (Usagemodel_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_avPackage.eNS_URI);

      // Obtain or create and register package
      Usagemodel_pc_avPackageImpl theUsagemodel_pc_avPackage = (Usagemodel_pc_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Usagemodel_pc_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Usagemodel_pc_avPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pc_avPackage.eINSTANCE.eClass();
      Stoex_pc_avPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_pc_avPackageImpl thePcm_pc_avPackage = (Pcm_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_avPackage.eNS_URI) instanceof Pcm_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_avPackage.eNS_URI) : Pcm_pc_avPackage.eINSTANCE);
      Core_pc_avPackageImpl theCore_pc_avPackage = (Core_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_pc_avPackage.eNS_URI) instanceof Core_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_pc_avPackage.eNS_URI) : Core_pc_avPackage.eINSTANCE);
      Entity_pc_avPackageImpl theEntity_pc_avPackage = (Entity_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_pc_avPackage.eNS_URI) instanceof Entity_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_pc_avPackage.eNS_URI) : Entity_pc_avPackage.eINSTANCE);
      Composition_pc_avPackageImpl theComposition_pc_avPackage = (Composition_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_pc_avPackage.eNS_URI) instanceof Composition_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_pc_avPackage.eNS_URI) : Composition_pc_avPackage.eINSTANCE);
      Repository_pc_avPackageImpl theRepository_pc_avPackage = (Repository_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_pc_avPackage.eNS_URI) instanceof Repository_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_pc_avPackage.eNS_URI) : Repository_pc_avPackage.eINSTANCE);
      Resourcetype_pc_avPackageImpl theResourcetype_pc_avPackage = (Resourcetype_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_avPackage.eNS_URI) instanceof Resourcetype_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_avPackage.eNS_URI) : Resourcetype_pc_avPackage.eINSTANCE);
      Protocol_pc_avPackageImpl theProtocol_pc_avPackage = (Protocol_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_avPackage.eNS_URI) instanceof Protocol_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_avPackage.eNS_URI) : Protocol_pc_avPackage.eINSTANCE);
      Parameter_pc_avPackageImpl theParameter_pc_avPackage = (Parameter_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_avPackage.eNS_URI) instanceof Parameter_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_avPackage.eNS_URI) : Parameter_pc_avPackage.eINSTANCE);
      Reliability_pc_avPackageImpl theReliability_pc_avPackage = (Reliability_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_avPackage.eNS_URI) instanceof Reliability_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_avPackage.eNS_URI) : Reliability_pc_avPackage.eINSTANCE);
      Seff_pc_avPackageImpl theSeff_pc_avPackage = (Seff_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_pc_avPackage.eNS_URI) instanceof Seff_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_pc_avPackage.eNS_URI) : Seff_pc_avPackage.eINSTANCE);
      Seff_performance_pc_avPackageImpl theSeff_performance_pc_avPackage = (Seff_performance_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_avPackage.eNS_URI) instanceof Seff_performance_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_avPackage.eNS_URI) : Seff_performance_pc_avPackage.eINSTANCE);
      Seff_reliability_pc_avPackageImpl theSeff_reliability_pc_avPackage = (Seff_reliability_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_avPackage.eNS_URI) instanceof Seff_reliability_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_avPackage.eNS_URI) : Seff_reliability_pc_avPackage.eINSTANCE);
      Qosannotations_pc_avPackageImpl theQosannotations_pc_avPackage = (Qosannotations_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_avPackage.eNS_URI) instanceof Qosannotations_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_avPackage.eNS_URI) : Qosannotations_pc_avPackage.eINSTANCE);
      Qos_performance_pc_avPackageImpl theQos_performance_pc_avPackage = (Qos_performance_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_avPackage.eNS_URI) instanceof Qos_performance_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_avPackage.eNS_URI) : Qos_performance_pc_avPackage.eINSTANCE);
      Qos_reliability_pc_avPackageImpl theQos_reliability_pc_avPackage = (Qos_reliability_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_avPackage.eNS_URI) instanceof Qos_reliability_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_avPackage.eNS_URI) : Qos_reliability_pc_avPackage.eINSTANCE);
      System_pc_avPackageImpl theSystem_pc_avPackage = (System_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_pc_avPackage.eNS_URI) instanceof System_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_pc_avPackage.eNS_URI) : System_pc_avPackage.eINSTANCE);
      Resourceenvironment_pc_avPackageImpl theResourceenvironment_pc_avPackage = (Resourceenvironment_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_avPackage.eNS_URI) instanceof Resourceenvironment_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_avPackage.eNS_URI) : Resourceenvironment_pc_avPackage.eINSTANCE);
      Allocation_pc_avPackageImpl theAllocation_pc_avPackage = (Allocation_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_avPackage.eNS_URI) instanceof Allocation_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_avPackage.eNS_URI) : Allocation_pc_avPackage.eINSTANCE);
      Subsystem_pc_avPackageImpl theSubsystem_pc_avPackage = (Subsystem_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_avPackage.eNS_URI) instanceof Subsystem_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_avPackage.eNS_URI) : Subsystem_pc_avPackage.eINSTANCE);
      Completions_pc_avPackageImpl theCompletions_pc_avPackage = (Completions_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pc_avPackage.eNS_URI) instanceof Completions_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pc_avPackage.eNS_URI) : Completions_pc_avPackage.eINSTANCE);

      // Create package meta-data objects
      theUsagemodel_pc_avPackage.createPackageContents();
      thePcm_pc_avPackage.createPackageContents();
      theCore_pc_avPackage.createPackageContents();
      theEntity_pc_avPackage.createPackageContents();
      theComposition_pc_avPackage.createPackageContents();
      theRepository_pc_avPackage.createPackageContents();
      theResourcetype_pc_avPackage.createPackageContents();
      theProtocol_pc_avPackage.createPackageContents();
      theParameter_pc_avPackage.createPackageContents();
      theReliability_pc_avPackage.createPackageContents();
      theSeff_pc_avPackage.createPackageContents();
      theSeff_performance_pc_avPackage.createPackageContents();
      theSeff_reliability_pc_avPackage.createPackageContents();
      theQosannotations_pc_avPackage.createPackageContents();
      theQos_performance_pc_avPackage.createPackageContents();
      theQos_reliability_pc_avPackage.createPackageContents();
      theSystem_pc_avPackage.createPackageContents();
      theResourceenvironment_pc_avPackage.createPackageContents();
      theAllocation_pc_avPackage.createPackageContents();
      theSubsystem_pc_avPackage.createPackageContents();
      theCompletions_pc_avPackage.createPackageContents();

      // Initialize created meta-data
      theUsagemodel_pc_avPackage.initializePackageContents();
      thePcm_pc_avPackage.initializePackageContents();
      theCore_pc_avPackage.initializePackageContents();
      theEntity_pc_avPackage.initializePackageContents();
      theComposition_pc_avPackage.initializePackageContents();
      theRepository_pc_avPackage.initializePackageContents();
      theResourcetype_pc_avPackage.initializePackageContents();
      theProtocol_pc_avPackage.initializePackageContents();
      theParameter_pc_avPackage.initializePackageContents();
      theReliability_pc_avPackage.initializePackageContents();
      theSeff_pc_avPackage.initializePackageContents();
      theSeff_performance_pc_avPackage.initializePackageContents();
      theSeff_reliability_pc_avPackage.initializePackageContents();
      theQosannotations_pc_avPackage.initializePackageContents();
      theQos_performance_pc_avPackage.initializePackageContents();
      theQos_reliability_pc_avPackage.initializePackageContents();
      theSystem_pc_avPackage.initializePackageContents();
      theResourceenvironment_pc_avPackage.initializePackageContents();
      theAllocation_pc_avPackage.initializePackageContents();
      theSubsystem_pc_avPackage.initializePackageContents();
      theCompletions_pc_avPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theUsagemodel_pc_avPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Usagemodel_pc_avValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theUsagemodel_pc_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Usagemodel_pc_avPackage.eNS_URI, theUsagemodel_pc_avPackage);
      return theUsagemodel_pc_avPackage;
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
   public Usagemodel_pc_avFactory getUsagemodel_pc_avFactory() {
      return (Usagemodel_pc_avFactory)getEFactoryInstance();
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
      Entity_pc_avPackage theEntity_pc_avPackage = (Entity_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_pc_avPackage.eNS_URI);
      Composition_pc_avPackage theComposition_pc_avPackage = (Composition_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_pc_avPackage.eNS_URI);
      Parameter_pc_avPackage theParameter_pc_avPackage = (Parameter_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_avPackage.eNS_URI);
      Repository_pc_avPackage theRepository_pc_avPackage = (Repository_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_pc_avPackage.eNS_URI);
      Core_pc_avPackage theCore_pc_avPackage = (Core_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pc_avPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      usageScenarioEClass.getESuperTypes().add(theEntity_pc_avPackage.getEntity());
      entryLevelSystemCallEClass.getESuperTypes().add(this.getAbstractUserAction());
      abstractUserActionEClass.getESuperTypes().add(theEntity_pc_avPackage.getEntity());
      scenarioBehaviourEClass.getESuperTypes().add(theEntity_pc_avPackage.getEntity());
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
      initEReference(getUserData_AssemblyContext_userData(), theComposition_pc_avPackage.getAssemblyContext(), null, "assemblyContext_userData", null, 0, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getUserData_UsageModel_UserData(), this.getUsageModel(), this.getUsageModel_UserData_UsageModel(), "usageModel_UserData", null, 0, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getUserData_UserDataParameterUsages_UserData(), theParameter_pc_avPackage.getVariableUsage(), theParameter_pc_avPackage.getVariableUsage_UserData_VariableUsage(), "userDataParameterUsages_UserData", null, 0, -1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(usageModelEClass, UsageModel.class, "UsageModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getUsageModel_UsageScenario_UsageModel(), this.getUsageScenario(), this.getUsageScenario_UsageModel_UsageScenario(), "usageScenario_UsageModel", null, 0, -1, UsageModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getUsageModel_UserData_UsageModel(), this.getUserData(), this.getUserData_UsageModel_UserData(), "userData_UsageModel", null, 0, -1, UsageModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(entryLevelSystemCallEClass, EntryLevelSystemCall.class, "EntryLevelSystemCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEntryLevelSystemCall_ProvidedRole_EntryLevelSystemCall(), theRepository_pc_avPackage.getOperationProvidedRole(), null, "providedRole_EntryLevelSystemCall", null, 0, 1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEntryLevelSystemCall_OperationSignature__EntryLevelSystemCall(), theRepository_pc_avPackage.getOperationSignature(), null, "operationSignature__EntryLevelSystemCall", null, 0, 1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEntryLevelSystemCall_OutputParameterUsages_EntryLevelSystemCall(), theParameter_pc_avPackage.getVariableUsage(), theParameter_pc_avPackage.getVariableUsage_EntryLevelSystemCall_OutputParameterUsage(), "outputParameterUsages_EntryLevelSystemCall", null, 0, -1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getEntryLevelSystemCall_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEntryLevelSystemCall_InputParameterUsages_EntryLevelSystemCall(), theParameter_pc_avPackage.getVariableUsage(), theParameter_pc_avPackage.getVariableUsage_EntryLevelSystemCall_InputParameterUsage(), "inputParameterUsages_EntryLevelSystemCall", null, 0, -1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
      initEReference(getLoop_LoopIteration_Loop(), theCore_pc_avPackage.getPCMRandomVariable(), theCore_pc_avPackage.getPCMRandomVariable_Loop_LoopIteration(), "loopIteration_Loop", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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
      initEReference(getOpenWorkload_InterArrivalTime_OpenWorkload(), theCore_pc_avPackage.getPCMRandomVariable(), theCore_pc_avPackage.getPCMRandomVariable_OpenWorkload_PCMRandomVariable(), "interArrivalTime_OpenWorkload", null, 0, 1, OpenWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(openWorkloadEClass, ecorePackage.getEBoolean(), "InterArrivalTimeInOpenWorkloadNeedsToBeSpecified", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getDelay_TimeSpecification_Delay(), theCore_pc_avPackage.getPCMRandomVariable(), theCore_pc_avPackage.getPCMRandomVariable_Delay_TimeSpecification(), "timeSpecification_Delay", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(closedWorkloadEClass, ClosedWorkload.class, "ClosedWorkload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getClosedWorkload_Population(), ecorePackage.getEInt(), "population", null, 1, 1, ClosedWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getClosedWorkload_ThinkTime_ClosedWorkload(), theCore_pc_avPackage.getPCMRandomVariable(), theCore_pc_avPackage.getPCMRandomVariable_ClosedWorkload_PCMRandomVariable(), "thinkTime_ClosedWorkload", null, 0, 1, ClosedWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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

} //Usagemodel_pc_avPackageImpl
