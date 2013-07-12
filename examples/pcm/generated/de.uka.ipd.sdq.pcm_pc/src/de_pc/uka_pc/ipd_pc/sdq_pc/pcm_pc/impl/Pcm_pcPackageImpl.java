/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.DummyClass;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pcm_pcFactory;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pcm_pcPackage;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pointcut;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pcm_pcPackageImpl extends EPackageImpl implements Pcm_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass dummyClassEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass pointcutEClass = null;

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
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pcm_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Pcm_pcPackageImpl() {
      super(eNS_URI, Pcm_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Pcm_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Pcm_pcPackage init() {
      if (isInited) return (Pcm_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Pcm_pcPackage.eNS_URI);

      // Obtain or create and register package
      Pcm_pcPackageImpl thePcm_pcPackage = (Pcm_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Pcm_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Pcm_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pcPackage.eINSTANCE.eClass();
      Stoex_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
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
      Allocation_pcPackageImpl theAllocation_pcPackage = (Allocation_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pcPackage.eNS_URI) instanceof Allocation_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pcPackage.eNS_URI) : Allocation_pcPackage.eINSTANCE);
      Subsystem_pcPackageImpl theSubsystem_pcPackage = (Subsystem_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pcPackage.eNS_URI) instanceof Subsystem_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pcPackage.eNS_URI) : Subsystem_pcPackage.eINSTANCE);
      Completions_pcPackageImpl theCompletions_pcPackage = (Completions_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pcPackage.eNS_URI) instanceof Completions_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pcPackage.eNS_URI) : Completions_pcPackage.eINSTANCE);

      // Create package meta-data objects
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
      theAllocation_pcPackage.createPackageContents();
      theSubsystem_pcPackage.createPackageContents();
      theCompletions_pcPackage.createPackageContents();

      // Initialize created meta-data
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
      theAllocation_pcPackage.initializePackageContents();
      theSubsystem_pcPackage.initializePackageContents();
      theCompletions_pcPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      thePcm_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Pcm_pcPackage.eNS_URI, thePcm_pcPackage);
      return thePcm_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDummyClass() {
      return dummyClassEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPointcut() {
      return pointcutEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPointcut_Children() {
      return (EReference)pointcutEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pcm_pcFactory getPcm_pcFactory() {
      return (Pcm_pcFactory)getEFactoryInstance();
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
      dummyClassEClass = createEClass(DUMMY_CLASS);

      pointcutEClass = createEClass(POINTCUT);
      createEReference(pointcutEClass, POINTCUT__CHILDREN);
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
      Core_pcPackage theCore_pcPackage = (Core_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pcPackage.eNS_URI);
      Usagemodel_pcPackage theUsagemodel_pcPackage = (Usagemodel_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pcPackage.eNS_URI);
      Repository_pcPackage theRepository_pcPackage = (Repository_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_pcPackage.eNS_URI);
      Resourcetype_pcPackage theResourcetype_pcPackage = (Resourcetype_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pcPackage.eNS_URI);
      Protocol_pcPackage theProtocol_pcPackage = (Protocol_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Protocol_pcPackage.eNS_URI);
      Parameter_pcPackage theParameter_pcPackage = (Parameter_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_pcPackage.eNS_URI);
      Reliability_pcPackage theReliability_pcPackage = (Reliability_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Reliability_pcPackage.eNS_URI);
      Seff_pcPackage theSeff_pcPackage = (Seff_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_pcPackage.eNS_URI);
      Qosannotations_pcPackage theQosannotations_pcPackage = (Qosannotations_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pcPackage.eNS_URI);
      System_pcPackage theSystem_pcPackage = (System_pcPackage)EPackage.Registry.INSTANCE.getEPackage(System_pcPackage.eNS_URI);
      Resourceenvironment_pcPackage theResourceenvironment_pcPackage = (Resourceenvironment_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pcPackage.eNS_URI);
      Allocation_pcPackage theAllocation_pcPackage = (Allocation_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Allocation_pcPackage.eNS_URI);
      Subsystem_pcPackage theSubsystem_pcPackage = (Subsystem_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Subsystem_pcPackage.eNS_URI);
      Completions_pcPackage theCompletions_pcPackage = (Completions_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Completions_pcPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theCore_pcPackage);
      getESubpackages().add(theUsagemodel_pcPackage);
      getESubpackages().add(theRepository_pcPackage);
      getESubpackages().add(theResourcetype_pcPackage);
      getESubpackages().add(theProtocol_pcPackage);
      getESubpackages().add(theParameter_pcPackage);
      getESubpackages().add(theReliability_pcPackage);
      getESubpackages().add(theSeff_pcPackage);
      getESubpackages().add(theQosannotations_pcPackage);
      getESubpackages().add(theSystem_pcPackage);
      getESubpackages().add(theResourceenvironment_pcPackage);
      getESubpackages().add(theAllocation_pcPackage);
      getESubpackages().add(theSubsystem_pcPackage);
      getESubpackages().add(theCompletions_pcPackage);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes

      // Initialize classes and features; add operations and parameters
      initEClass(dummyClassEClass, DummyClass.class, "DummyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPointcut_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //Pcm_pcPackageImpl
