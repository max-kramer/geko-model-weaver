/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pcm_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.Allocation;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.AllocationContext;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.Allocation_pcFactory;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.Allocation_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.util.Allocation_pcValidator;

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

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.impl.Usagemodel_pcPackageImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage;

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
public class Allocation_pcPackageImpl extends EPackageImpl implements Allocation_pcPackage {
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
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.Allocation_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Allocation_pcPackageImpl() {
      super(eNS_URI, Allocation_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Allocation_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Allocation_pcPackage init() {
      if (isInited) return (Allocation_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Allocation_pcPackage.eNS_URI);

      // Obtain or create and register package
      Allocation_pcPackageImpl theAllocation_pcPackage = (Allocation_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Allocation_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Allocation_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pcPackage.eINSTANCE.eClass();
      Stoex_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_pcPackageImpl thePcm_pcPackage = (Pcm_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_pcPackage.eNS_URI) instanceof Pcm_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_pcPackage.eNS_URI) : Pcm_pcPackage.eINSTANCE);
      Core_pcPackageImpl theCore_pcPackage = (Core_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_pcPackage.eNS_URI) instanceof Core_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_pcPackage.eNS_URI) : Core_pcPackage.eINSTANCE);
      Entity_pcPackageImpl theEntity_pcPackage = (Entity_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_pcPackage.eNS_URI) instanceof Entity_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_pcPackage.eNS_URI) : Entity_pcPackage.eINSTANCE);
      Composition_pcPackageImpl theComposition_pcPackage = (Composition_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_pcPackage.eNS_URI) instanceof Composition_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_pcPackage.eNS_URI) : Composition_pcPackage.eINSTANCE);
      Usagemodel_pcPackageImpl theUsagemodel_pcPackage = (Usagemodel_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pcPackage.eNS_URI) instanceof Usagemodel_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pcPackage.eNS_URI) : Usagemodel_pcPackage.eINSTANCE);
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
      Subsystem_pcPackageImpl theSubsystem_pcPackage = (Subsystem_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pcPackage.eNS_URI) instanceof Subsystem_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pcPackage.eNS_URI) : Subsystem_pcPackage.eINSTANCE);
      Completions_pcPackageImpl theCompletions_pcPackage = (Completions_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pcPackage.eNS_URI) instanceof Completions_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pcPackage.eNS_URI) : Completions_pcPackage.eINSTANCE);

      // Create package meta-data objects
      theAllocation_pcPackage.createPackageContents();
      thePcm_pcPackage.createPackageContents();
      theCore_pcPackage.createPackageContents();
      theEntity_pcPackage.createPackageContents();
      theComposition_pcPackage.createPackageContents();
      theUsagemodel_pcPackage.createPackageContents();
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
      theSubsystem_pcPackage.createPackageContents();
      theCompletions_pcPackage.createPackageContents();

      // Initialize created meta-data
      theAllocation_pcPackage.initializePackageContents();
      thePcm_pcPackage.initializePackageContents();
      theCore_pcPackage.initializePackageContents();
      theEntity_pcPackage.initializePackageContents();
      theComposition_pcPackage.initializePackageContents();
      theUsagemodel_pcPackage.initializePackageContents();
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
      theSubsystem_pcPackage.initializePackageContents();
      theCompletions_pcPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theAllocation_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Allocation_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theAllocation_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Allocation_pcPackage.eNS_URI, theAllocation_pcPackage);
      return theAllocation_pcPackage;
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
   public Allocation_pcFactory getAllocation_pcFactory() {
      return (Allocation_pcFactory)getEFactoryInstance();
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
      Entity_pcPackage theEntity_pcPackage = (Entity_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_pcPackage.eNS_URI);
      Resourceenvironment_pcPackage theResourceenvironment_pcPackage = (Resourceenvironment_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pcPackage.eNS_URI);
      Composition_pcPackage theComposition_pcPackage = (Composition_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_pcPackage.eNS_URI);
      System_pcPackage theSystem_pcPackage = (System_pcPackage)EPackage.Registry.INSTANCE.getEPackage(System_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      allocationContextEClass.getESuperTypes().add(theEntity_pcPackage.getEntity());
      allocationEClass.getESuperTypes().add(theEntity_pcPackage.getEntity());

      // Initialize classes and features; add operations and parameters
      initEClass(allocationContextEClass, AllocationContext.class, "AllocationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAllocationContext_ResourceContainer_AllocationContext(), theResourceenvironment_pcPackage.getResourceContainer(), null, "resourceContainer_AllocationContext", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAllocationContext_AssemblyContext_AllocationContext(), theComposition_pcPackage.getAssemblyContext(), null, "assemblyContext_AllocationContext", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAllocationContext_Allocation_AllocationContext(), this.getAllocation(), this.getAllocation_AllocationContexts_Allocation(), "allocation_AllocationContext", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAllocationContext_EventChannel__AllocationContext(), theComposition_pcPackage.getEventChannel(), null, "eventChannel__AllocationContext", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(allocationContextEClass, ecorePackage.getEBoolean(), "OneAssemblyContextOrOneEventChannelShouldBeReferred", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAllocation_TargetResourceEnvironment_Allocation(), theResourceenvironment_pcPackage.getResourceEnvironment(), null, "targetResourceEnvironment_Allocation", null, 0, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAllocation_System_Allocation(), theSystem_pcPackage.getSystem(), null, "system_Allocation", null, 0, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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

} //Allocation_pcPackageImpl
