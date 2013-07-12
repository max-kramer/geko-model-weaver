/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.impl;

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

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.ComponentSpecifiedExecutionTime;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.Qos_performance_pc_avFactory;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.Qos_performance_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.SpecifiedExecutionTime;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.SystemSpecifiedExecutionTime;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.util.Qos_performance_pc_avValidator;

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

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Usagemodel_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.impl.Usagemodel_pc_avPackageImpl;

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
public class Qos_performance_pc_avPackageImpl extends EPackageImpl implements Qos_performance_pc_avPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass systemSpecifiedExecutionTimeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass specifiedExecutionTimeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass componentSpecifiedExecutionTimeEClass = null;

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
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.Qos_performance_pc_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Qos_performance_pc_avPackageImpl() {
      super(eNS_URI, Qos_performance_pc_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Qos_performance_pc_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Qos_performance_pc_avPackage init() {
      if (isInited) return (Qos_performance_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_avPackage.eNS_URI);

      // Obtain or create and register package
      Qos_performance_pc_avPackageImpl theQos_performance_pc_avPackage = (Qos_performance_pc_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Qos_performance_pc_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Qos_performance_pc_avPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pc_avPackage.eINSTANCE.eClass();
      Stoex_pc_avPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_pc_avPackageImpl thePcm_pc_avPackage = (Pcm_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_avPackage.eNS_URI) instanceof Pcm_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_avPackage.eNS_URI) : Pcm_pc_avPackage.eINSTANCE);
      Core_pc_avPackageImpl theCore_pc_avPackage = (Core_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_pc_avPackage.eNS_URI) instanceof Core_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_pc_avPackage.eNS_URI) : Core_pc_avPackage.eINSTANCE);
      Entity_pc_avPackageImpl theEntity_pc_avPackage = (Entity_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_pc_avPackage.eNS_URI) instanceof Entity_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_pc_avPackage.eNS_URI) : Entity_pc_avPackage.eINSTANCE);
      Composition_pc_avPackageImpl theComposition_pc_avPackage = (Composition_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_pc_avPackage.eNS_URI) instanceof Composition_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_pc_avPackage.eNS_URI) : Composition_pc_avPackage.eINSTANCE);
      Usagemodel_pc_avPackageImpl theUsagemodel_pc_avPackage = (Usagemodel_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_avPackage.eNS_URI) instanceof Usagemodel_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_avPackage.eNS_URI) : Usagemodel_pc_avPackage.eINSTANCE);
      Repository_pc_avPackageImpl theRepository_pc_avPackage = (Repository_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_pc_avPackage.eNS_URI) instanceof Repository_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_pc_avPackage.eNS_URI) : Repository_pc_avPackage.eINSTANCE);
      Resourcetype_pc_avPackageImpl theResourcetype_pc_avPackage = (Resourcetype_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_avPackage.eNS_URI) instanceof Resourcetype_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_avPackage.eNS_URI) : Resourcetype_pc_avPackage.eINSTANCE);
      Protocol_pc_avPackageImpl theProtocol_pc_avPackage = (Protocol_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_avPackage.eNS_URI) instanceof Protocol_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_avPackage.eNS_URI) : Protocol_pc_avPackage.eINSTANCE);
      Parameter_pc_avPackageImpl theParameter_pc_avPackage = (Parameter_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_avPackage.eNS_URI) instanceof Parameter_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_avPackage.eNS_URI) : Parameter_pc_avPackage.eINSTANCE);
      Reliability_pc_avPackageImpl theReliability_pc_avPackage = (Reliability_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_avPackage.eNS_URI) instanceof Reliability_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_avPackage.eNS_URI) : Reliability_pc_avPackage.eINSTANCE);
      Seff_pc_avPackageImpl theSeff_pc_avPackage = (Seff_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_pc_avPackage.eNS_URI) instanceof Seff_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_pc_avPackage.eNS_URI) : Seff_pc_avPackage.eINSTANCE);
      Seff_performance_pc_avPackageImpl theSeff_performance_pc_avPackage = (Seff_performance_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_avPackage.eNS_URI) instanceof Seff_performance_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_avPackage.eNS_URI) : Seff_performance_pc_avPackage.eINSTANCE);
      Seff_reliability_pc_avPackageImpl theSeff_reliability_pc_avPackage = (Seff_reliability_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_avPackage.eNS_URI) instanceof Seff_reliability_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_avPackage.eNS_URI) : Seff_reliability_pc_avPackage.eINSTANCE);
      Qosannotations_pc_avPackageImpl theQosannotations_pc_avPackage = (Qosannotations_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_avPackage.eNS_URI) instanceof Qosannotations_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_avPackage.eNS_URI) : Qosannotations_pc_avPackage.eINSTANCE);
      Qos_reliability_pc_avPackageImpl theQos_reliability_pc_avPackage = (Qos_reliability_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_avPackage.eNS_URI) instanceof Qos_reliability_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_avPackage.eNS_URI) : Qos_reliability_pc_avPackage.eINSTANCE);
      System_pc_avPackageImpl theSystem_pc_avPackage = (System_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_pc_avPackage.eNS_URI) instanceof System_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_pc_avPackage.eNS_URI) : System_pc_avPackage.eINSTANCE);
      Resourceenvironment_pc_avPackageImpl theResourceenvironment_pc_avPackage = (Resourceenvironment_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_avPackage.eNS_URI) instanceof Resourceenvironment_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_avPackage.eNS_URI) : Resourceenvironment_pc_avPackage.eINSTANCE);
      Allocation_pc_avPackageImpl theAllocation_pc_avPackage = (Allocation_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_avPackage.eNS_URI) instanceof Allocation_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_avPackage.eNS_URI) : Allocation_pc_avPackage.eINSTANCE);
      Subsystem_pc_avPackageImpl theSubsystem_pc_avPackage = (Subsystem_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_avPackage.eNS_URI) instanceof Subsystem_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_avPackage.eNS_URI) : Subsystem_pc_avPackage.eINSTANCE);
      Completions_pc_avPackageImpl theCompletions_pc_avPackage = (Completions_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pc_avPackage.eNS_URI) instanceof Completions_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pc_avPackage.eNS_URI) : Completions_pc_avPackage.eINSTANCE);

      // Create package meta-data objects
      theQos_performance_pc_avPackage.createPackageContents();
      thePcm_pc_avPackage.createPackageContents();
      theCore_pc_avPackage.createPackageContents();
      theEntity_pc_avPackage.createPackageContents();
      theComposition_pc_avPackage.createPackageContents();
      theUsagemodel_pc_avPackage.createPackageContents();
      theRepository_pc_avPackage.createPackageContents();
      theResourcetype_pc_avPackage.createPackageContents();
      theProtocol_pc_avPackage.createPackageContents();
      theParameter_pc_avPackage.createPackageContents();
      theReliability_pc_avPackage.createPackageContents();
      theSeff_pc_avPackage.createPackageContents();
      theSeff_performance_pc_avPackage.createPackageContents();
      theSeff_reliability_pc_avPackage.createPackageContents();
      theQosannotations_pc_avPackage.createPackageContents();
      theQos_reliability_pc_avPackage.createPackageContents();
      theSystem_pc_avPackage.createPackageContents();
      theResourceenvironment_pc_avPackage.createPackageContents();
      theAllocation_pc_avPackage.createPackageContents();
      theSubsystem_pc_avPackage.createPackageContents();
      theCompletions_pc_avPackage.createPackageContents();

      // Initialize created meta-data
      theQos_performance_pc_avPackage.initializePackageContents();
      thePcm_pc_avPackage.initializePackageContents();
      theCore_pc_avPackage.initializePackageContents();
      theEntity_pc_avPackage.initializePackageContents();
      theComposition_pc_avPackage.initializePackageContents();
      theUsagemodel_pc_avPackage.initializePackageContents();
      theRepository_pc_avPackage.initializePackageContents();
      theResourcetype_pc_avPackage.initializePackageContents();
      theProtocol_pc_avPackage.initializePackageContents();
      theParameter_pc_avPackage.initializePackageContents();
      theReliability_pc_avPackage.initializePackageContents();
      theSeff_pc_avPackage.initializePackageContents();
      theSeff_performance_pc_avPackage.initializePackageContents();
      theSeff_reliability_pc_avPackage.initializePackageContents();
      theQosannotations_pc_avPackage.initializePackageContents();
      theQos_reliability_pc_avPackage.initializePackageContents();
      theSystem_pc_avPackage.initializePackageContents();
      theResourceenvironment_pc_avPackage.initializePackageContents();
      theAllocation_pc_avPackage.initializePackageContents();
      theSubsystem_pc_avPackage.initializePackageContents();
      theCompletions_pc_avPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theQos_performance_pc_avPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Qos_performance_pc_avValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theQos_performance_pc_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Qos_performance_pc_avPackage.eNS_URI, theQos_performance_pc_avPackage);
      return theQos_performance_pc_avPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSystemSpecifiedExecutionTime() {
      return systemSpecifiedExecutionTimeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSpecifiedExecutionTime() {
      return specifiedExecutionTimeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime() {
      return (EReference)specifiedExecutionTimeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getComponentSpecifiedExecutionTime() {
      return componentSpecifiedExecutionTimeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getComponentSpecifiedExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime() {
      return (EReference)componentSpecifiedExecutionTimeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_performance_pc_avFactory getQos_performance_pc_avFactory() {
      return (Qos_performance_pc_avFactory)getEFactoryInstance();
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
      systemSpecifiedExecutionTimeEClass = createEClass(SYSTEM_SPECIFIED_EXECUTION_TIME);

      specifiedExecutionTimeEClass = createEClass(SPECIFIED_EXECUTION_TIME);
      createEReference(specifiedExecutionTimeEClass, SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME);

      componentSpecifiedExecutionTimeEClass = createEClass(COMPONENT_SPECIFIED_EXECUTION_TIME);
      createEReference(componentSpecifiedExecutionTimeEClass, COMPONENT_SPECIFIED_EXECUTION_TIME__ASSEMBLY_CONTEXT_COMPONENT_SPECIFIED_EXECUTION_TIME);
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
      Qosannotations_pc_avPackage theQosannotations_pc_avPackage = (Qosannotations_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_avPackage.eNS_URI);
      Core_pc_avPackage theCore_pc_avPackage = (Core_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pc_avPackage.eNS_URI);
      Composition_pc_avPackage theComposition_pc_avPackage = (Composition_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_pc_avPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      systemSpecifiedExecutionTimeEClass.getESuperTypes().add(this.getSpecifiedExecutionTime());
      specifiedExecutionTimeEClass.getESuperTypes().add(theQosannotations_pc_avPackage.getSpecifiedQoSAnnotation());
      componentSpecifiedExecutionTimeEClass.getESuperTypes().add(this.getSpecifiedExecutionTime());

      // Initialize classes and features; add operations and parameters
      initEClass(systemSpecifiedExecutionTimeEClass, SystemSpecifiedExecutionTime.class, "SystemSpecifiedExecutionTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      EOperation op = addEOperation(systemSpecifiedExecutionTimeEClass, ecorePackage.getEBoolean(), "SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(specifiedExecutionTimeEClass, SpecifiedExecutionTime.class, "SpecifiedExecutionTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime(), theCore_pc_avPackage.getPCMRandomVariable(), theCore_pc_avPackage.getPCMRandomVariable_SpecifiedExecutionTime_PCMRandomVariable(), "specification_SpecifiedExecutionTime", null, 0, 1, SpecifiedExecutionTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(componentSpecifiedExecutionTimeEClass, ComponentSpecifiedExecutionTime.class, "ComponentSpecifiedExecutionTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getComponentSpecifiedExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime(), theComposition_pc_avPackage.getAssemblyContext(), null, "assemblyContext_ComponentSpecifiedExecutionTime", null, 0, 1, ComponentSpecifiedExecutionTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
        (systemSpecifiedExecutionTimeEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(pcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(pcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(pcm::system::System))\r\n"
         });				
   }

} //Qos_performance_pc_avPackageImpl
