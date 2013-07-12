/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.Identifier_pc_avPackage;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.Advice;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.DummyClass;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.GlobalScope;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.Pcm_pc_avFactory;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.Pcm_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.PerJoinPointScope;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.Pointcut;

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

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Usagemodel_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.impl.Usagemodel_pc_avPackageImpl;

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
public class Pcm_pc_avPackageImpl extends EPackageImpl implements Pcm_pc_avPackage {
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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass adviceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass globalScopeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass perJoinPointScopeEClass = null;

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
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.Pcm_pc_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Pcm_pc_avPackageImpl() {
      super(eNS_URI, Pcm_pc_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Pcm_pc_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Pcm_pc_avPackage init() {
      if (isInited) return (Pcm_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_avPackage.eNS_URI);

      // Obtain or create and register package
      Pcm_pc_avPackageImpl thePcm_pc_avPackage = (Pcm_pc_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Pcm_pc_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Pcm_pc_avPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pc_avPackage.eINSTANCE.eClass();
      Stoex_pc_avPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
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
      Qos_performance_pc_avPackageImpl theQos_performance_pc_avPackage = (Qos_performance_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_avPackage.eNS_URI) instanceof Qos_performance_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_avPackage.eNS_URI) : Qos_performance_pc_avPackage.eINSTANCE);
      Qos_reliability_pc_avPackageImpl theQos_reliability_pc_avPackage = (Qos_reliability_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_avPackage.eNS_URI) instanceof Qos_reliability_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_avPackage.eNS_URI) : Qos_reliability_pc_avPackage.eINSTANCE);
      System_pc_avPackageImpl theSystem_pc_avPackage = (System_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_pc_avPackage.eNS_URI) instanceof System_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_pc_avPackage.eNS_URI) : System_pc_avPackage.eINSTANCE);
      Resourceenvironment_pc_avPackageImpl theResourceenvironment_pc_avPackage = (Resourceenvironment_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_avPackage.eNS_URI) instanceof Resourceenvironment_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_avPackage.eNS_URI) : Resourceenvironment_pc_avPackage.eINSTANCE);
      Allocation_pc_avPackageImpl theAllocation_pc_avPackage = (Allocation_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_avPackage.eNS_URI) instanceof Allocation_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_avPackage.eNS_URI) : Allocation_pc_avPackage.eINSTANCE);
      Subsystem_pc_avPackageImpl theSubsystem_pc_avPackage = (Subsystem_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_avPackage.eNS_URI) instanceof Subsystem_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_avPackage.eNS_URI) : Subsystem_pc_avPackage.eINSTANCE);
      Completions_pc_avPackageImpl theCompletions_pc_avPackage = (Completions_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pc_avPackage.eNS_URI) instanceof Completions_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pc_avPackage.eNS_URI) : Completions_pc_avPackage.eINSTANCE);

      // Create package meta-data objects
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
      theQos_performance_pc_avPackage.createPackageContents();
      theQos_reliability_pc_avPackage.createPackageContents();
      theSystem_pc_avPackage.createPackageContents();
      theResourceenvironment_pc_avPackage.createPackageContents();
      theAllocation_pc_avPackage.createPackageContents();
      theSubsystem_pc_avPackage.createPackageContents();
      theCompletions_pc_avPackage.createPackageContents();

      // Initialize created meta-data
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
      theQos_performance_pc_avPackage.initializePackageContents();
      theQos_reliability_pc_avPackage.initializePackageContents();
      theSystem_pc_avPackage.initializePackageContents();
      theResourceenvironment_pc_avPackage.initializePackageContents();
      theAllocation_pc_avPackage.initializePackageContents();
      theSubsystem_pc_avPackage.initializePackageContents();
      theCompletions_pc_avPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      thePcm_pc_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Pcm_pc_avPackage.eNS_URI, thePcm_pc_avPackage);
      return thePcm_pc_avPackage;
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
   public EClass getAdvice() {
      return adviceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAdvice_Children() {
      return (EReference)adviceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getGlobalScope() {
      return globalScopeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getGlobalScope_ScopedObject() {
      return (EReference)globalScopeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPerJoinPointScope() {
      return perJoinPointScopeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPerJoinPointScope_ScopedObject() {
      return (EReference)perJoinPointScopeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pcm_pc_avFactory getPcm_pc_avFactory() {
      return (Pcm_pc_avFactory)getEFactoryInstance();
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

      adviceEClass = createEClass(ADVICE);
      createEReference(adviceEClass, ADVICE__CHILDREN);

      globalScopeEClass = createEClass(GLOBAL_SCOPE);
      createEReference(globalScopeEClass, GLOBAL_SCOPE__SCOPED_OBJECT);

      perJoinPointScopeEClass = createEClass(PER_JOIN_POINT_SCOPE);
      createEReference(perJoinPointScopeEClass, PER_JOIN_POINT_SCOPE__SCOPED_OBJECT);
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
      Core_pc_avPackage theCore_pc_avPackage = (Core_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pc_avPackage.eNS_URI);
      Usagemodel_pc_avPackage theUsagemodel_pc_avPackage = (Usagemodel_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_avPackage.eNS_URI);
      Repository_pc_avPackage theRepository_pc_avPackage = (Repository_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_pc_avPackage.eNS_URI);
      Resourcetype_pc_avPackage theResourcetype_pc_avPackage = (Resourcetype_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_avPackage.eNS_URI);
      Protocol_pc_avPackage theProtocol_pc_avPackage = (Protocol_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_avPackage.eNS_URI);
      Parameter_pc_avPackage theParameter_pc_avPackage = (Parameter_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_avPackage.eNS_URI);
      Reliability_pc_avPackage theReliability_pc_avPackage = (Reliability_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_avPackage.eNS_URI);
      Seff_pc_avPackage theSeff_pc_avPackage = (Seff_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_pc_avPackage.eNS_URI);
      Qosannotations_pc_avPackage theQosannotations_pc_avPackage = (Qosannotations_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_avPackage.eNS_URI);
      System_pc_avPackage theSystem_pc_avPackage = (System_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(System_pc_avPackage.eNS_URI);
      Resourceenvironment_pc_avPackage theResourceenvironment_pc_avPackage = (Resourceenvironment_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_avPackage.eNS_URI);
      Allocation_pc_avPackage theAllocation_pc_avPackage = (Allocation_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_avPackage.eNS_URI);
      Subsystem_pc_avPackage theSubsystem_pc_avPackage = (Subsystem_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_avPackage.eNS_URI);
      Completions_pc_avPackage theCompletions_pc_avPackage = (Completions_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Completions_pc_avPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theCore_pc_avPackage);
      getESubpackages().add(theUsagemodel_pc_avPackage);
      getESubpackages().add(theRepository_pc_avPackage);
      getESubpackages().add(theResourcetype_pc_avPackage);
      getESubpackages().add(theProtocol_pc_avPackage);
      getESubpackages().add(theParameter_pc_avPackage);
      getESubpackages().add(theReliability_pc_avPackage);
      getESubpackages().add(theSeff_pc_avPackage);
      getESubpackages().add(theQosannotations_pc_avPackage);
      getESubpackages().add(theSystem_pc_avPackage);
      getESubpackages().add(theResourceenvironment_pc_avPackage);
      getESubpackages().add(theAllocation_pc_avPackage);
      getESubpackages().add(theSubsystem_pc_avPackage);
      getESubpackages().add(theCompletions_pc_avPackage);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes

      // Initialize classes and features; add operations and parameters
      initEClass(dummyClassEClass, DummyClass.class, "DummyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPointcut_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAdvice_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(globalScopeEClass, GlobalScope.class, "GlobalScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getGlobalScope_ScopedObject(), ecorePackage.getEObject(), null, "scopedObject", null, 1, 1, GlobalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(perJoinPointScopeEClass, PerJoinPointScope.class, "PerJoinPointScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPerJoinPointScope_ScopedObject(), ecorePackage.getEObject(), null, "scopedObject", null, 1, 1, PerJoinPointScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //Pcm_pc_avPackageImpl
