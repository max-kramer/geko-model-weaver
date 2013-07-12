/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.Pcm_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.Allocation;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.AllocationContext;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.Allocation_av_avFactory;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.Allocation_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.util.Allocation_av_avValidator;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl.Completions_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.Core_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.impl.Composition_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.impl.Entity_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.impl.Core_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.impl.Pcm_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.Parameter_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.impl.Parameter_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.protocol_av_av.Protocol_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.protocol_av_av.impl.Protocol_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.Qosannotations_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.impl.Qosannotations_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.Qos_performance_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.impl.Qos_performance_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_reliability_av_av.Qos_reliability_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_reliability_av_av.impl.Qos_reliability_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.Reliability_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.impl.Reliability_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.Repository_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.impl.Resourceenvironment_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.Resourcetype_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.impl.Resourcetype_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.impl.Seff_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_performance_av_av.Seff_performance_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_performance_av_av.impl.Seff_performance_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.Seff_reliability_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.seff_reliability_av_av.impl.Seff_reliability_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.subsystem_av_av.Subsystem_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.subsystem_av_av.impl.Subsystem_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.System_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.impl.System_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.Usagemodel_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.usagemodel_av_av.impl.Usagemodel_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage;

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
public class Allocation_av_avPackageImpl extends EPackageImpl implements Allocation_av_avPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass allocationContextEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass allocationEClass = null;

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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.Allocation_av_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Allocation_av_avPackageImpl() {
      super(eNS_URI, Allocation_av_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Allocation_av_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Allocation_av_avPackage init() {
      if (isInited) return (Allocation_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Allocation_av_avPackage.eNS_URI);

      // Obtain or create and register package
      Allocation_av_avPackageImpl theAllocation_av_avPackage = (Allocation_av_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Allocation_av_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Allocation_av_avPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_av_avPackage.eINSTANCE.eClass();
      Stoex_av_avPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_av_avPackageImpl thePcm_av_avPackage = (Pcm_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_av_avPackage.eNS_URI) instanceof Pcm_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_av_avPackage.eNS_URI) : Pcm_av_avPackage.eINSTANCE);
      Core_av_avPackageImpl theCore_av_avPackage = (Core_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_av_avPackage.eNS_URI) instanceof Core_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_av_avPackage.eNS_URI) : Core_av_avPackage.eINSTANCE);
      Entity_av_avPackageImpl theEntity_av_avPackage = (Entity_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_av_avPackage.eNS_URI) instanceof Entity_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_av_avPackage.eNS_URI) : Entity_av_avPackage.eINSTANCE);
      Composition_av_avPackageImpl theComposition_av_avPackage = (Composition_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_av_avPackage.eNS_URI) instanceof Composition_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_av_avPackage.eNS_URI) : Composition_av_avPackage.eINSTANCE);
      Usagemodel_av_avPackageImpl theUsagemodel_av_avPackage = (Usagemodel_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_avPackage.eNS_URI) instanceof Usagemodel_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_avPackage.eNS_URI) : Usagemodel_av_avPackage.eINSTANCE);
      Repository_av_avPackageImpl theRepository_av_avPackage = (Repository_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_av_avPackage.eNS_URI) instanceof Repository_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_av_avPackage.eNS_URI) : Repository_av_avPackage.eINSTANCE);
      Resourcetype_av_avPackageImpl theResourcetype_av_avPackage = (Resourcetype_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_avPackage.eNS_URI) instanceof Resourcetype_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_avPackage.eNS_URI) : Resourcetype_av_avPackage.eINSTANCE);
      Protocol_av_avPackageImpl theProtocol_av_avPackage = (Protocol_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_av_avPackage.eNS_URI) instanceof Protocol_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_av_avPackage.eNS_URI) : Protocol_av_avPackage.eINSTANCE);
      Parameter_av_avPackageImpl theParameter_av_avPackage = (Parameter_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_av_avPackage.eNS_URI) instanceof Parameter_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_av_avPackage.eNS_URI) : Parameter_av_avPackage.eINSTANCE);
      Reliability_av_avPackageImpl theReliability_av_avPackage = (Reliability_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_av_avPackage.eNS_URI) instanceof Reliability_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_av_avPackage.eNS_URI) : Reliability_av_avPackage.eINSTANCE);
      Seff_av_avPackageImpl theSeff_av_avPackage = (Seff_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_av_avPackage.eNS_URI) instanceof Seff_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_av_avPackage.eNS_URI) : Seff_av_avPackage.eINSTANCE);
      Seff_performance_av_avPackageImpl theSeff_performance_av_avPackage = (Seff_performance_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_avPackage.eNS_URI) instanceof Seff_performance_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_avPackage.eNS_URI) : Seff_performance_av_avPackage.eINSTANCE);
      Seff_reliability_av_avPackageImpl theSeff_reliability_av_avPackage = (Seff_reliability_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_avPackage.eNS_URI) instanceof Seff_reliability_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_avPackage.eNS_URI) : Seff_reliability_av_avPackage.eINSTANCE);
      Qosannotations_av_avPackageImpl theQosannotations_av_avPackage = (Qosannotations_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_avPackage.eNS_URI) instanceof Qosannotations_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_avPackage.eNS_URI) : Qosannotations_av_avPackage.eINSTANCE);
      Qos_performance_av_avPackageImpl theQos_performance_av_avPackage = (Qos_performance_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_avPackage.eNS_URI) instanceof Qos_performance_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_avPackage.eNS_URI) : Qos_performance_av_avPackage.eINSTANCE);
      Qos_reliability_av_avPackageImpl theQos_reliability_av_avPackage = (Qos_reliability_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_avPackage.eNS_URI) instanceof Qos_reliability_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_avPackage.eNS_URI) : Qos_reliability_av_avPackage.eINSTANCE);
      System_av_avPackageImpl theSystem_av_avPackage = (System_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_av_avPackage.eNS_URI) instanceof System_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_av_avPackage.eNS_URI) : System_av_avPackage.eINSTANCE);
      Resourceenvironment_av_avPackageImpl theResourceenvironment_av_avPackage = (Resourceenvironment_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_avPackage.eNS_URI) instanceof Resourceenvironment_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_avPackage.eNS_URI) : Resourceenvironment_av_avPackage.eINSTANCE);
      Subsystem_av_avPackageImpl theSubsystem_av_avPackage = (Subsystem_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_avPackage.eNS_URI) instanceof Subsystem_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_avPackage.eNS_URI) : Subsystem_av_avPackage.eINSTANCE);
      Completions_av_avPackageImpl theCompletions_av_avPackage = (Completions_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_av_avPackage.eNS_URI) instanceof Completions_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_av_avPackage.eNS_URI) : Completions_av_avPackage.eINSTANCE);

      // Create package meta-data objects
      theAllocation_av_avPackage.createPackageContents();
      thePcm_av_avPackage.createPackageContents();
      theCore_av_avPackage.createPackageContents();
      theEntity_av_avPackage.createPackageContents();
      theComposition_av_avPackage.createPackageContents();
      theUsagemodel_av_avPackage.createPackageContents();
      theRepository_av_avPackage.createPackageContents();
      theResourcetype_av_avPackage.createPackageContents();
      theProtocol_av_avPackage.createPackageContents();
      theParameter_av_avPackage.createPackageContents();
      theReliability_av_avPackage.createPackageContents();
      theSeff_av_avPackage.createPackageContents();
      theSeff_performance_av_avPackage.createPackageContents();
      theSeff_reliability_av_avPackage.createPackageContents();
      theQosannotations_av_avPackage.createPackageContents();
      theQos_performance_av_avPackage.createPackageContents();
      theQos_reliability_av_avPackage.createPackageContents();
      theSystem_av_avPackage.createPackageContents();
      theResourceenvironment_av_avPackage.createPackageContents();
      theSubsystem_av_avPackage.createPackageContents();
      theCompletions_av_avPackage.createPackageContents();

      // Initialize created meta-data
      theAllocation_av_avPackage.initializePackageContents();
      thePcm_av_avPackage.initializePackageContents();
      theCore_av_avPackage.initializePackageContents();
      theEntity_av_avPackage.initializePackageContents();
      theComposition_av_avPackage.initializePackageContents();
      theUsagemodel_av_avPackage.initializePackageContents();
      theRepository_av_avPackage.initializePackageContents();
      theResourcetype_av_avPackage.initializePackageContents();
      theProtocol_av_avPackage.initializePackageContents();
      theParameter_av_avPackage.initializePackageContents();
      theReliability_av_avPackage.initializePackageContents();
      theSeff_av_avPackage.initializePackageContents();
      theSeff_performance_av_avPackage.initializePackageContents();
      theSeff_reliability_av_avPackage.initializePackageContents();
      theQosannotations_av_avPackage.initializePackageContents();
      theQos_performance_av_avPackage.initializePackageContents();
      theQos_reliability_av_avPackage.initializePackageContents();
      theSystem_av_avPackage.initializePackageContents();
      theResourceenvironment_av_avPackage.initializePackageContents();
      theSubsystem_av_avPackage.initializePackageContents();
      theCompletions_av_avPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theAllocation_av_avPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Allocation_av_avValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theAllocation_av_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Allocation_av_avPackage.eNS_URI, theAllocation_av_avPackage);
      return theAllocation_av_avPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAllocationContext() {
      return allocationContextEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAllocationContext_ResourceContainer_AllocationContext() {
      return (EReference)allocationContextEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAllocationContext_AssemblyContext_AllocationContext() {
      return (EReference)allocationContextEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAllocationContext_Allocation_AllocationContext() {
      return (EReference)allocationContextEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAllocationContext_EventChannel__AllocationContext() {
      return (EReference)allocationContextEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAllocation() {
      return allocationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAllocation_TargetResourceEnvironment_Allocation() {
      return (EReference)allocationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAllocation_System_Allocation() {
      return (EReference)allocationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAllocation_AllocationContexts_Allocation() {
      return (EReference)allocationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Allocation_av_avFactory getAllocation_av_avFactory() {
      return (Allocation_av_avFactory)getEFactoryInstance();
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
      allocationContextEClass = createEClass(ALLOCATION_CONTEXT);
      createEReference(allocationContextEClass, ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT);
      createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT);
      createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT);
      createEReference(allocationContextEClass, ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT);

      allocationEClass = createEClass(ALLOCATION);
      createEReference(allocationEClass, ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION);
      createEReference(allocationEClass, ALLOCATION__SYSTEM_ALLOCATION);
      createEReference(allocationEClass, ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION);
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
      Entity_av_avPackage theEntity_av_avPackage = (Entity_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_av_avPackage.eNS_URI);
      Resourceenvironment_av_avPackage theResourceenvironment_av_avPackage = (Resourceenvironment_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_avPackage.eNS_URI);
      Composition_av_avPackage theComposition_av_avPackage = (Composition_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_av_avPackage.eNS_URI);
      System_av_avPackage theSystem_av_avPackage = (System_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(System_av_avPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      allocationContextEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());
      allocationEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());

      // Initialize classes and features; add operations and parameters
      initEClass(allocationContextEClass, AllocationContext.class, "AllocationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAllocationContext_ResourceContainer_AllocationContext(), theResourceenvironment_av_avPackage.getResourceContainer(), null, "resourceContainer_AllocationContext", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAllocationContext_AssemblyContext_AllocationContext(), theComposition_av_avPackage.getAssemblyContext(), null, "assemblyContext_AllocationContext", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAllocationContext_Allocation_AllocationContext(), this.getAllocation(), this.getAllocation_AllocationContexts_Allocation(), "allocation_AllocationContext", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAllocationContext_EventChannel__AllocationContext(), theComposition_av_avPackage.getEventChannel(), null, "eventChannel__AllocationContext", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(allocationContextEClass, ecorePackage.getEBoolean(), "OneAssemblyContextOrOneEventChannelShouldBeReferred", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAllocation_TargetResourceEnvironment_Allocation(), theResourceenvironment_av_avPackage.getResourceEnvironment(), null, "targetResourceEnvironment_Allocation", null, 0, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAllocation_System_Allocation(), theSystem_av_avPackage.getSystem(), null, "system_Allocation", null, 0, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAllocation_AllocationContexts_Allocation(), this.getAllocationContext(), this.getAllocationContext_Allocation_AllocationContext(), "allocationContexts_Allocation", null, 0, -1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(allocationEClass, ecorePackage.getEBoolean(), "EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(allocationEClass, ecorePackage.getEBoolean(), "CommunicatingServersHaveToBeConnectedByLinkingResource", 0, 1, IS_UNIQUE, IS_ORDERED);
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
        (allocationContextEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "not(self.assemblyContext_AllocationContext.oclIsUndefined()) xor not(self.eventChannel__AllocationContext.oclIsUndefined())"
         });					
      addAnnotation
        (allocationEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "-- Get all AssemblyContexts used by this system, that is \r\n-- 1) the AssemblyContexts directly used in the system and \r\nself.system_Allocation.assemblyContexts__ComposedStructure\r\n-- 2) the AssemblyContexts used by SubSystems in the System. Note that if a SubSystem also contains other Subsystems,\r\n-- we need to get those AssemblyContexts too: Thus, we use a closure here\r\n->union(self.system_Allocation.assemblyContexts__ComposedStructure->closure(\r\nencapsulatedComponent__AssemblyContext->select(composites|composites.oclIsTypeOf(pcm::subsystem::SubSystem)).oclAsType(pcm::subsystem::SubSystem)\r\n.assemblyContexts__ComposedStructure))\r\n--Now, after we collected all AssemblyContexts somehow used, we check whether they need to be allocated \r\n--and if yes, if they are allocated.\r\n->forAll(assemblyCtx|\r\n--AssemblyContexts that contain SubSystems do not need to be allocated\r\nassemblyCtx.encapsulatedComponent__AssemblyContext.oclIsTypeOf(pcm::subsystem::SubSystem) or\r\n--All others need to be allocated. \r\nself.allocationContexts_Allocation->select(allocationCtx|\r\nallocationCtx.assemblyContext_AllocationContext = assemblyCtx)->size() = 1)"
         });					
      addAnnotation
        (allocationEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.allocationContexts_Allocation->forAll(a | self.allocationContexts_Allocation->forAll(b | \r\n    --- if a and b are not on the same server\r\n    (a.resourceContainer_AllocationContext <> b.resourceContainer_AllocationContext \r\n    and\r\n    --  and if the assembly contexts of a and b are connected\r\n      self.system_Allocation.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::AssemblyConnector)).oclAsType(pcm::core::composition::AssemblyConnector)->exists(conn | \r\n         (conn.providingAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext  \r\n         and \r\n         conn.requiringAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext )\r\n         or \r\n          (conn.providingAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext  \r\n         and \r\n         conn.requiringAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext )\r\n       )\r\n     )\r\n     -- then the servers have to be connected by a linking resource\r\n     implies \r\n     self.targetResourceEnvironment_Allocation.linkingResources__ResourceEnvironment->exists(l | \r\n        -- l connects the two\r\n        l.connectedResourceContainers_LinkingResource->includes(a.resourceContainer_AllocationContext)\r\n        and \r\n        l.connectedResourceContainers_LinkingResource->includes(b.resourceContainer_AllocationContext)\r\n     )\r\n  ))"
         });		
   }

} //Allocation_av_avPackageImpl
