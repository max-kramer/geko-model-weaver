/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.Pcm_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.Completions_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.impl.Completions_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.Core_pc_pcFactory;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.Core_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.PCMRandomVariable;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.impl.Composition_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.impl.Entity_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.util.Core_pc_pcValidator;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.impl.Pcm_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.Parameter_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.impl.Parameter_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.protocol_pc_pc.Protocol_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.protocol_pc_pc.impl.Protocol_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.Qosannotations_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.Qos_performance_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc.Qos_reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc.impl.Qos_reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.Reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.impl.Reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl.Repository_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.impl.Resourceenvironment_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.Resourcetype_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.impl.Resourcetype_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl.Seff_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.Seff_performance_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl.Seff_performance_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.impl.Seff_reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.Subsystem_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.impl.Subsystem_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.impl.System_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Usagemodel_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl.Usagemodel_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Stoex_pc_pcPackage;

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
public class Core_pc_pcPackageImpl extends EPackageImpl implements Core_pc_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass pcmRandomVariableEClass = null;

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
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.Core_pc_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Core_pc_pcPackageImpl() {
      super(eNS_URI, Core_pc_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Core_pc_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Core_pc_pcPackage init() {
      if (isInited) return (Core_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI);

      // Obtain or create and register package
      Core_pc_pcPackageImpl theCore_pc_pcPackage = (Core_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Core_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Core_pc_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pc_pcPackage.eINSTANCE.eClass();
      Stoex_pc_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_pc_pcPackageImpl thePcm_pc_pcPackage = (Pcm_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_pcPackage.eNS_URI) instanceof Pcm_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_pcPackage.eNS_URI) : Pcm_pc_pcPackage.eINSTANCE);
      Entity_pc_pcPackageImpl theEntity_pc_pcPackage = (Entity_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI) instanceof Entity_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI) : Entity_pc_pcPackage.eINSTANCE);
      Composition_pc_pcPackageImpl theComposition_pc_pcPackage = (Composition_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI) instanceof Composition_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI) : Composition_pc_pcPackage.eINSTANCE);
      Usagemodel_pc_pcPackageImpl theUsagemodel_pc_pcPackage = (Usagemodel_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI) instanceof Usagemodel_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI) : Usagemodel_pc_pcPackage.eINSTANCE);
      Repository_pc_pcPackageImpl theRepository_pc_pcPackage = (Repository_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI) instanceof Repository_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI) : Repository_pc_pcPackage.eINSTANCE);
      Resourcetype_pc_pcPackageImpl theResourcetype_pc_pcPackage = (Resourcetype_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI) instanceof Resourcetype_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI) : Resourcetype_pc_pcPackage.eINSTANCE);
      Protocol_pc_pcPackageImpl theProtocol_pc_pcPackage = (Protocol_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_pcPackage.eNS_URI) instanceof Protocol_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_pcPackage.eNS_URI) : Protocol_pc_pcPackage.eINSTANCE);
      Parameter_pc_pcPackageImpl theParameter_pc_pcPackage = (Parameter_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_pcPackage.eNS_URI) instanceof Parameter_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_pcPackage.eNS_URI) : Parameter_pc_pcPackage.eINSTANCE);
      Reliability_pc_pcPackageImpl theReliability_pc_pcPackage = (Reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_pcPackage.eNS_URI) instanceof Reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_pcPackage.eNS_URI) : Reliability_pc_pcPackage.eINSTANCE);
      Seff_pc_pcPackageImpl theSeff_pc_pcPackage = (Seff_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI) instanceof Seff_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI) : Seff_pc_pcPackage.eINSTANCE);
      Seff_performance_pc_pcPackageImpl theSeff_performance_pc_pcPackage = (Seff_performance_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_pcPackage.eNS_URI) instanceof Seff_performance_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_pcPackage.eNS_URI) : Seff_performance_pc_pcPackage.eINSTANCE);
      Seff_reliability_pc_pcPackageImpl theSeff_reliability_pc_pcPackage = (Seff_reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_pcPackage.eNS_URI) instanceof Seff_reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_pcPackage.eNS_URI) : Seff_reliability_pc_pcPackage.eINSTANCE);
      Qosannotations_pc_pcPackageImpl theQosannotations_pc_pcPackage = (Qosannotations_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_pcPackage.eNS_URI) instanceof Qosannotations_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_pcPackage.eNS_URI) : Qosannotations_pc_pcPackage.eINSTANCE);
      Qos_performance_pc_pcPackageImpl theQos_performance_pc_pcPackage = (Qos_performance_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_pcPackage.eNS_URI) instanceof Qos_performance_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_pcPackage.eNS_URI) : Qos_performance_pc_pcPackage.eINSTANCE);
      Qos_reliability_pc_pcPackageImpl theQos_reliability_pc_pcPackage = (Qos_reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_pcPackage.eNS_URI) instanceof Qos_reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_pcPackage.eNS_URI) : Qos_reliability_pc_pcPackage.eINSTANCE);
      System_pc_pcPackageImpl theSystem_pc_pcPackage = (System_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_pc_pcPackage.eNS_URI) instanceof System_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_pc_pcPackage.eNS_URI) : System_pc_pcPackage.eINSTANCE);
      Resourceenvironment_pc_pcPackageImpl theResourceenvironment_pc_pcPackage = (Resourceenvironment_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_pcPackage.eNS_URI) instanceof Resourceenvironment_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_pcPackage.eNS_URI) : Resourceenvironment_pc_pcPackage.eINSTANCE);
      Allocation_pc_pcPackageImpl theAllocation_pc_pcPackage = (Allocation_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_pcPackage.eNS_URI) instanceof Allocation_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_pcPackage.eNS_URI) : Allocation_pc_pcPackage.eINSTANCE);
      Subsystem_pc_pcPackageImpl theSubsystem_pc_pcPackage = (Subsystem_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_pcPackage.eNS_URI) instanceof Subsystem_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_pcPackage.eNS_URI) : Subsystem_pc_pcPackage.eINSTANCE);
      Completions_pc_pcPackageImpl theCompletions_pc_pcPackage = (Completions_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pc_pcPackage.eNS_URI) instanceof Completions_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pc_pcPackage.eNS_URI) : Completions_pc_pcPackage.eINSTANCE);

      // Create package meta-data objects
      theCore_pc_pcPackage.createPackageContents();
      thePcm_pc_pcPackage.createPackageContents();
      theEntity_pc_pcPackage.createPackageContents();
      theComposition_pc_pcPackage.createPackageContents();
      theUsagemodel_pc_pcPackage.createPackageContents();
      theRepository_pc_pcPackage.createPackageContents();
      theResourcetype_pc_pcPackage.createPackageContents();
      theProtocol_pc_pcPackage.createPackageContents();
      theParameter_pc_pcPackage.createPackageContents();
      theReliability_pc_pcPackage.createPackageContents();
      theSeff_pc_pcPackage.createPackageContents();
      theSeff_performance_pc_pcPackage.createPackageContents();
      theSeff_reliability_pc_pcPackage.createPackageContents();
      theQosannotations_pc_pcPackage.createPackageContents();
      theQos_performance_pc_pcPackage.createPackageContents();
      theQos_reliability_pc_pcPackage.createPackageContents();
      theSystem_pc_pcPackage.createPackageContents();
      theResourceenvironment_pc_pcPackage.createPackageContents();
      theAllocation_pc_pcPackage.createPackageContents();
      theSubsystem_pc_pcPackage.createPackageContents();
      theCompletions_pc_pcPackage.createPackageContents();

      // Initialize created meta-data
      theCore_pc_pcPackage.initializePackageContents();
      thePcm_pc_pcPackage.initializePackageContents();
      theEntity_pc_pcPackage.initializePackageContents();
      theComposition_pc_pcPackage.initializePackageContents();
      theUsagemodel_pc_pcPackage.initializePackageContents();
      theRepository_pc_pcPackage.initializePackageContents();
      theResourcetype_pc_pcPackage.initializePackageContents();
      theProtocol_pc_pcPackage.initializePackageContents();
      theParameter_pc_pcPackage.initializePackageContents();
      theReliability_pc_pcPackage.initializePackageContents();
      theSeff_pc_pcPackage.initializePackageContents();
      theSeff_performance_pc_pcPackage.initializePackageContents();
      theSeff_reliability_pc_pcPackage.initializePackageContents();
      theQosannotations_pc_pcPackage.initializePackageContents();
      theQos_performance_pc_pcPackage.initializePackageContents();
      theQos_reliability_pc_pcPackage.initializePackageContents();
      theSystem_pc_pcPackage.initializePackageContents();
      theResourceenvironment_pc_pcPackage.initializePackageContents();
      theAllocation_pc_pcPackage.initializePackageContents();
      theSubsystem_pc_pcPackage.initializePackageContents();
      theCompletions_pc_pcPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theCore_pc_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Core_pc_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theCore_pc_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Core_pc_pcPackage.eNS_URI, theCore_pc_pcPackage);
      return theCore_pc_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPCMRandomVariable() {
      return pcmRandomVariableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_ClosedWorkload_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_PassiveResource_capacity_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_VariableCharacterisation_Specification() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_InfrastructureCall__PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_ResourceCall__PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_ParametricResourceDemand_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_LoopAction_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_GuardedBranchTransition_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_SpecifiedExecutionTime_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_EventChannelSinkConnector__FilterCondition() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_AssemblyEventConnector__FilterCondition() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(10);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_Loop_LoopIteration() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(11);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_OpenWorkload_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(12);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_Delay_TimeSpecification() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(13);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(14);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(15);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable() {
      return (EReference)pcmRandomVariableEClass.getEStructuralFeatures().get(16);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Core_pc_pcFactory getCore_pc_pcFactory() {
      return (Core_pc_pcFactory)getEFactoryInstance();
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
      pcmRandomVariableEClass = createEClass(PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__CLOSED_WORKLOAD_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__PASSIVE_RESOURCE_CAPACITY_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__VARIABLE_CHARACTERISATION_SPECIFICATION);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__INFRASTRUCTURE_CALL_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__RESOURCE_CALL_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__PARAMETRIC_RESOURCE_DEMAND_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__LOOP_ACTION_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__GUARDED_BRANCH_TRANSITION_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__SPECIFIED_EXECUTION_TIME_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__EVENT_CHANNEL_SINK_CONNECTOR_FILTER_CONDITION);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__ASSEMBLY_EVENT_CONNECTOR_FILTER_CONDITION);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__LOOP_LOOP_ITERATION);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__OPEN_WORKLOAD_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__DELAY_TIME_SPECIFICATION);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFCATION_THROUGHPUT_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__PROCESSING_RESOURCE_SPECIFICATION_PROCESSING_RATE_PCM_RANDOM_VARIABLE);
      createEReference(pcmRandomVariableEClass, PCM_RANDOM_VARIABLE__COMMUNICATION_LINK_RESOURCE_SPECIFICATION_LATENCY_PCM_RANDOM_VARIABLE);
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
      Entity_pc_pcPackage theEntity_pc_pcPackage = (Entity_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI);
      Composition_pc_pcPackage theComposition_pc_pcPackage = (Composition_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI);
      Stoex_pc_pcPackage theStoex_pc_pcPackage = (Stoex_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Stoex_pc_pcPackage.eNS_URI);
      Usagemodel_pc_pcPackage theUsagemodel_pc_pcPackage = (Usagemodel_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI);
      Repository_pc_pcPackage theRepository_pc_pcPackage = (Repository_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI);
      Parameter_pc_pcPackage theParameter_pc_pcPackage = (Parameter_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_pcPackage.eNS_URI);
      Seff_performance_pc_pcPackage theSeff_performance_pc_pcPackage = (Seff_performance_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_pcPackage.eNS_URI);
      Seff_pc_pcPackage theSeff_pc_pcPackage = (Seff_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI);
      Qos_performance_pc_pcPackage theQos_performance_pc_pcPackage = (Qos_performance_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_pcPackage.eNS_URI);
      Resourceenvironment_pc_pcPackage theResourceenvironment_pc_pcPackage = (Resourceenvironment_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_pcPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theEntity_pc_pcPackage);
      getESubpackages().add(theComposition_pc_pcPackage);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      pcmRandomVariableEClass.getESuperTypes().add(theStoex_pc_pcPackage.getRandomVariable());

      // Initialize classes and features; add operations and parameters
      initEClass(pcmRandomVariableEClass, PCMRandomVariable.class, "PCMRandomVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPCMRandomVariable_ClosedWorkload_PCMRandomVariable(), theUsagemodel_pc_pcPackage.getClosedWorkload(), theUsagemodel_pc_pcPackage.getClosedWorkload_ThinkTime_ClosedWorkload(), "closedWorkload_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_PassiveResource_capacity_PCMRandomVariable(), theRepository_pc_pcPackage.getPassiveResource(), theRepository_pc_pcPackage.getPassiveResource_Capacity_PassiveResource(), "passiveResource_capacity_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_VariableCharacterisation_Specification(), theParameter_pc_pcPackage.getVariableCharacterisation(), theParameter_pc_pcPackage.getVariableCharacterisation_Specification_VariableCharacterisation(), "variableCharacterisation_Specification", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_InfrastructureCall__PCMRandomVariable(), theSeff_performance_pc_pcPackage.getInfrastructureCall(), theSeff_performance_pc_pcPackage.getInfrastructureCall_NumberOfCalls__InfrastructureCall(), "infrastructureCall__PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_ResourceCall__PCMRandomVariable(), theSeff_performance_pc_pcPackage.getResourceCall(), theSeff_performance_pc_pcPackage.getResourceCall_NumberOfCalls__ResourceCall(), "resourceCall__PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_ParametricResourceDemand_PCMRandomVariable(), theSeff_performance_pc_pcPackage.getParametricResourceDemand(), theSeff_performance_pc_pcPackage.getParametricResourceDemand_Specification_ParametericResourceDemand(), "parametricResourceDemand_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_LoopAction_PCMRandomVariable(), theSeff_pc_pcPackage.getLoopAction(), theSeff_pc_pcPackage.getLoopAction_IterationCount_LoopAction(), "loopAction_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_GuardedBranchTransition_PCMRandomVariable(), theSeff_pc_pcPackage.getGuardedBranchTransition(), theSeff_pc_pcPackage.getGuardedBranchTransition_BranchCondition_GuardedBranchTransition(), "guardedBranchTransition_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_SpecifiedExecutionTime_PCMRandomVariable(), theQos_performance_pc_pcPackage.getSpecifiedExecutionTime(), theQos_performance_pc_pcPackage.getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime(), "specifiedExecutionTime_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_EventChannelSinkConnector__FilterCondition(), theComposition_pc_pcPackage.getEventChannelSinkConnector(), theComposition_pc_pcPackage.getEventChannelSinkConnector_FilterCondition__EventChannelSinkConnector(), "eventChannelSinkConnector__FilterCondition", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_AssemblyEventConnector__FilterCondition(), theComposition_pc_pcPackage.getAssemblyEventConnector(), theComposition_pc_pcPackage.getAssemblyEventConnector_FilterCondition__AssemblyEventConnector(), "assemblyEventConnector__FilterCondition", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_Loop_LoopIteration(), theUsagemodel_pc_pcPackage.getLoop(), theUsagemodel_pc_pcPackage.getLoop_LoopIteration_Loop(), "loop_LoopIteration", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_OpenWorkload_PCMRandomVariable(), theUsagemodel_pc_pcPackage.getOpenWorkload(), theUsagemodel_pc_pcPackage.getOpenWorkload_InterArrivalTime_OpenWorkload(), "openWorkload_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_Delay_TimeSpecification(), theUsagemodel_pc_pcPackage.getDelay(), theUsagemodel_pc_pcPackage.getDelay_TimeSpecification_Delay(), "delay_TimeSpecification", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable(), theResourceenvironment_pc_pcPackage.getCommunicationLinkResourceSpecification(), theResourceenvironment_pc_pcPackage.getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification(), "communicationLinkResourceSpecifcation_throughput_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable(), theResourceenvironment_pc_pcPackage.getProcessingResourceSpecification(), theResourceenvironment_pc_pcPackage.getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification(), "processingResourceSpecification_processingRate_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable(), theResourceenvironment_pc_pcPackage.getCommunicationLinkResourceSpecification(), theResourceenvironment_pc_pcPackage.getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification(), "communicationLinkResourceSpecification_latency_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(pcmRandomVariableEClass, ecorePackage.getEBoolean(), "SpecificationMustNotBeNULL", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
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
        (pcmRandomVariableEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "not self.specification.oclIsUndefined() and self.specification <> \'\'"
         });		
   }

} //Core_pc_pcPackageImpl
