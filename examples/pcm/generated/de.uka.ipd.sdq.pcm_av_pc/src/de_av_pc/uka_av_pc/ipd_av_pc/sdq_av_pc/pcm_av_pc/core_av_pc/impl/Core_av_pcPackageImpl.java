/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.Pcm_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.Allocation_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.impl.Allocation_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.Completions_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.impl.Completions_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.Core_av_pcFactory;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.Core_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.PCMRandomVariable;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.Composition_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.impl.Entity_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.util.Core_av_pcValidator;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.impl.Pcm_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.Parameter_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.impl.Parameter_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.protocol_av_pc.Protocol_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.protocol_av_pc.impl.Protocol_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.Qosannotations_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.impl.Qosannotations_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.Qos_performance_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.impl.Qos_performance_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.Qos_reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.impl.Qos_reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.Reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.impl.Reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.Repository_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.Resourceenvironment_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.Resourceenvironment_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.Resourcetype_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl.Resourcetype_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.impl.Seff_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.Seff_performance_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.impl.Seff_performance_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.Seff_reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.impl.Seff_reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.Subsystem_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.impl.Subsystem_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.impl.System_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.Usagemodel_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage;

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
public class Core_av_pcPackageImpl extends EPackageImpl implements Core_av_pcPackage {
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
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.Core_av_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Core_av_pcPackageImpl() {
      super(eNS_URI, Core_av_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Core_av_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Core_av_pcPackage init() {
      if (isInited) return (Core_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_av_pcPackage.eNS_URI);

      // Obtain or create and register package
      Core_av_pcPackageImpl theCore_av_pcPackage = (Core_av_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Core_av_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Core_av_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_av_pcPackage.eINSTANCE.eClass();
      Stoex_av_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_av_pcPackageImpl thePcm_av_pcPackage = (Pcm_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_av_pcPackage.eNS_URI) instanceof Pcm_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_av_pcPackage.eNS_URI) : Pcm_av_pcPackage.eINSTANCE);
      Entity_av_pcPackageImpl theEntity_av_pcPackage = (Entity_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI) instanceof Entity_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI) : Entity_av_pcPackage.eINSTANCE);
      Composition_av_pcPackageImpl theComposition_av_pcPackage = (Composition_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_av_pcPackage.eNS_URI) instanceof Composition_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_av_pcPackage.eNS_URI) : Composition_av_pcPackage.eINSTANCE);
      Usagemodel_av_pcPackageImpl theUsagemodel_av_pcPackage = (Usagemodel_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI) instanceof Usagemodel_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI) : Usagemodel_av_pcPackage.eINSTANCE);
      Repository_av_pcPackageImpl theRepository_av_pcPackage = (Repository_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI) instanceof Repository_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI) : Repository_av_pcPackage.eINSTANCE);
      Resourcetype_av_pcPackageImpl theResourcetype_av_pcPackage = (Resourcetype_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI) instanceof Resourcetype_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI) : Resourcetype_av_pcPackage.eINSTANCE);
      Protocol_av_pcPackageImpl theProtocol_av_pcPackage = (Protocol_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_av_pcPackage.eNS_URI) instanceof Protocol_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_av_pcPackage.eNS_URI) : Protocol_av_pcPackage.eINSTANCE);
      Parameter_av_pcPackageImpl theParameter_av_pcPackage = (Parameter_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI) instanceof Parameter_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI) : Parameter_av_pcPackage.eINSTANCE);
      Reliability_av_pcPackageImpl theReliability_av_pcPackage = (Reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_av_pcPackage.eNS_URI) instanceof Reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_av_pcPackage.eNS_URI) : Reliability_av_pcPackage.eINSTANCE);
      Seff_av_pcPackageImpl theSeff_av_pcPackage = (Seff_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI) instanceof Seff_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI) : Seff_av_pcPackage.eINSTANCE);
      Seff_performance_av_pcPackageImpl theSeff_performance_av_pcPackage = (Seff_performance_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI) instanceof Seff_performance_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI) : Seff_performance_av_pcPackage.eINSTANCE);
      Seff_reliability_av_pcPackageImpl theSeff_reliability_av_pcPackage = (Seff_reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_pcPackage.eNS_URI) instanceof Seff_reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_pcPackage.eNS_URI) : Seff_reliability_av_pcPackage.eINSTANCE);
      Qosannotations_av_pcPackageImpl theQosannotations_av_pcPackage = (Qosannotations_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_pcPackage.eNS_URI) instanceof Qosannotations_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_pcPackage.eNS_URI) : Qosannotations_av_pcPackage.eINSTANCE);
      Qos_performance_av_pcPackageImpl theQos_performance_av_pcPackage = (Qos_performance_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_pcPackage.eNS_URI) instanceof Qos_performance_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_pcPackage.eNS_URI) : Qos_performance_av_pcPackage.eINSTANCE);
      Qos_reliability_av_pcPackageImpl theQos_reliability_av_pcPackage = (Qos_reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_pcPackage.eNS_URI) instanceof Qos_reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_pcPackage.eNS_URI) : Qos_reliability_av_pcPackage.eINSTANCE);
      System_av_pcPackageImpl theSystem_av_pcPackage = (System_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_av_pcPackage.eNS_URI) instanceof System_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_av_pcPackage.eNS_URI) : System_av_pcPackage.eINSTANCE);
      Resourceenvironment_av_pcPackageImpl theResourceenvironment_av_pcPackage = (Resourceenvironment_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI) instanceof Resourceenvironment_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI) : Resourceenvironment_av_pcPackage.eINSTANCE);
      Allocation_av_pcPackageImpl theAllocation_av_pcPackage = (Allocation_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_av_pcPackage.eNS_URI) instanceof Allocation_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_av_pcPackage.eNS_URI) : Allocation_av_pcPackage.eINSTANCE);
      Subsystem_av_pcPackageImpl theSubsystem_av_pcPackage = (Subsystem_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_pcPackage.eNS_URI) instanceof Subsystem_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_pcPackage.eNS_URI) : Subsystem_av_pcPackage.eINSTANCE);
      Completions_av_pcPackageImpl theCompletions_av_pcPackage = (Completions_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_av_pcPackage.eNS_URI) instanceof Completions_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_av_pcPackage.eNS_URI) : Completions_av_pcPackage.eINSTANCE);

      // Create package meta-data objects
      theCore_av_pcPackage.createPackageContents();
      thePcm_av_pcPackage.createPackageContents();
      theEntity_av_pcPackage.createPackageContents();
      theComposition_av_pcPackage.createPackageContents();
      theUsagemodel_av_pcPackage.createPackageContents();
      theRepository_av_pcPackage.createPackageContents();
      theResourcetype_av_pcPackage.createPackageContents();
      theProtocol_av_pcPackage.createPackageContents();
      theParameter_av_pcPackage.createPackageContents();
      theReliability_av_pcPackage.createPackageContents();
      theSeff_av_pcPackage.createPackageContents();
      theSeff_performance_av_pcPackage.createPackageContents();
      theSeff_reliability_av_pcPackage.createPackageContents();
      theQosannotations_av_pcPackage.createPackageContents();
      theQos_performance_av_pcPackage.createPackageContents();
      theQos_reliability_av_pcPackage.createPackageContents();
      theSystem_av_pcPackage.createPackageContents();
      theResourceenvironment_av_pcPackage.createPackageContents();
      theAllocation_av_pcPackage.createPackageContents();
      theSubsystem_av_pcPackage.createPackageContents();
      theCompletions_av_pcPackage.createPackageContents();

      // Initialize created meta-data
      theCore_av_pcPackage.initializePackageContents();
      thePcm_av_pcPackage.initializePackageContents();
      theEntity_av_pcPackage.initializePackageContents();
      theComposition_av_pcPackage.initializePackageContents();
      theUsagemodel_av_pcPackage.initializePackageContents();
      theRepository_av_pcPackage.initializePackageContents();
      theResourcetype_av_pcPackage.initializePackageContents();
      theProtocol_av_pcPackage.initializePackageContents();
      theParameter_av_pcPackage.initializePackageContents();
      theReliability_av_pcPackage.initializePackageContents();
      theSeff_av_pcPackage.initializePackageContents();
      theSeff_performance_av_pcPackage.initializePackageContents();
      theSeff_reliability_av_pcPackage.initializePackageContents();
      theQosannotations_av_pcPackage.initializePackageContents();
      theQos_performance_av_pcPackage.initializePackageContents();
      theQos_reliability_av_pcPackage.initializePackageContents();
      theSystem_av_pcPackage.initializePackageContents();
      theResourceenvironment_av_pcPackage.initializePackageContents();
      theAllocation_av_pcPackage.initializePackageContents();
      theSubsystem_av_pcPackage.initializePackageContents();
      theCompletions_av_pcPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theCore_av_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Core_av_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theCore_av_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Core_av_pcPackage.eNS_URI, theCore_av_pcPackage);
      return theCore_av_pcPackage;
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
   public Core_av_pcFactory getCore_av_pcFactory() {
      return (Core_av_pcFactory)getEFactoryInstance();
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
      Entity_av_pcPackage theEntity_av_pcPackage = (Entity_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI);
      Composition_av_pcPackage theComposition_av_pcPackage = (Composition_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_av_pcPackage.eNS_URI);
      Stoex_av_pcPackage theStoex_av_pcPackage = (Stoex_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Stoex_av_pcPackage.eNS_URI);
      Usagemodel_av_pcPackage theUsagemodel_av_pcPackage = (Usagemodel_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI);
      Repository_av_pcPackage theRepository_av_pcPackage = (Repository_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI);
      Parameter_av_pcPackage theParameter_av_pcPackage = (Parameter_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI);
      Seff_performance_av_pcPackage theSeff_performance_av_pcPackage = (Seff_performance_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI);
      Seff_av_pcPackage theSeff_av_pcPackage = (Seff_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI);
      Qos_performance_av_pcPackage theQos_performance_av_pcPackage = (Qos_performance_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_pcPackage.eNS_URI);
      Resourceenvironment_av_pcPackage theResourceenvironment_av_pcPackage = (Resourceenvironment_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theEntity_av_pcPackage);
      getESubpackages().add(theComposition_av_pcPackage);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      pcmRandomVariableEClass.getESuperTypes().add(theStoex_av_pcPackage.getRandomVariable());

      // Initialize classes and features; add operations and parameters
      initEClass(pcmRandomVariableEClass, PCMRandomVariable.class, "PCMRandomVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPCMRandomVariable_ClosedWorkload_PCMRandomVariable(), theUsagemodel_av_pcPackage.getClosedWorkload(), theUsagemodel_av_pcPackage.getClosedWorkload_ThinkTime_ClosedWorkload(), "closedWorkload_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_PassiveResource_capacity_PCMRandomVariable(), theRepository_av_pcPackage.getPassiveResource(), theRepository_av_pcPackage.getPassiveResource_Capacity_PassiveResource(), "passiveResource_capacity_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_VariableCharacterisation_Specification(), theParameter_av_pcPackage.getVariableCharacterisation(), theParameter_av_pcPackage.getVariableCharacterisation_Specification_VariableCharacterisation(), "variableCharacterisation_Specification", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_InfrastructureCall__PCMRandomVariable(), theSeff_performance_av_pcPackage.getInfrastructureCall(), theSeff_performance_av_pcPackage.getInfrastructureCall_NumberOfCalls__InfrastructureCall(), "infrastructureCall__PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_ResourceCall__PCMRandomVariable(), theSeff_performance_av_pcPackage.getResourceCall(), theSeff_performance_av_pcPackage.getResourceCall_NumberOfCalls__ResourceCall(), "resourceCall__PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_ParametricResourceDemand_PCMRandomVariable(), theSeff_performance_av_pcPackage.getParametricResourceDemand(), theSeff_performance_av_pcPackage.getParametricResourceDemand_Specification_ParametericResourceDemand(), "parametricResourceDemand_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_LoopAction_PCMRandomVariable(), theSeff_av_pcPackage.getLoopAction(), theSeff_av_pcPackage.getLoopAction_IterationCount_LoopAction(), "loopAction_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_GuardedBranchTransition_PCMRandomVariable(), theSeff_av_pcPackage.getGuardedBranchTransition(), theSeff_av_pcPackage.getGuardedBranchTransition_BranchCondition_GuardedBranchTransition(), "guardedBranchTransition_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_SpecifiedExecutionTime_PCMRandomVariable(), theQos_performance_av_pcPackage.getSpecifiedExecutionTime(), theQos_performance_av_pcPackage.getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime(), "specifiedExecutionTime_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_EventChannelSinkConnector__FilterCondition(), theComposition_av_pcPackage.getEventChannelSinkConnector(), theComposition_av_pcPackage.getEventChannelSinkConnector_FilterCondition__EventChannelSinkConnector(), "eventChannelSinkConnector__FilterCondition", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_AssemblyEventConnector__FilterCondition(), theComposition_av_pcPackage.getAssemblyEventConnector(), theComposition_av_pcPackage.getAssemblyEventConnector_FilterCondition__AssemblyEventConnector(), "assemblyEventConnector__FilterCondition", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_Loop_LoopIteration(), theUsagemodel_av_pcPackage.getLoop(), theUsagemodel_av_pcPackage.getLoop_LoopIteration_Loop(), "loop_LoopIteration", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_OpenWorkload_PCMRandomVariable(), theUsagemodel_av_pcPackage.getOpenWorkload(), theUsagemodel_av_pcPackage.getOpenWorkload_InterArrivalTime_OpenWorkload(), "openWorkload_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_Delay_TimeSpecification(), theUsagemodel_av_pcPackage.getDelay(), theUsagemodel_av_pcPackage.getDelay_TimeSpecification_Delay(), "delay_TimeSpecification", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable(), theResourceenvironment_av_pcPackage.getCommunicationLinkResourceSpecification(), theResourceenvironment_av_pcPackage.getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification(), "communicationLinkResourceSpecifcation_throughput_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable(), theResourceenvironment_av_pcPackage.getProcessingResourceSpecification(), theResourceenvironment_av_pcPackage.getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification(), "processingResourceSpecification_processingRate_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable(), theResourceenvironment_av_pcPackage.getCommunicationLinkResourceSpecification(), theResourceenvironment_av_pcPackage.getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification(), "communicationLinkResourceSpecification_latency_PCMRandomVariable", null, 0, 1, PCMRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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

} //Core_av_pcPackageImpl
