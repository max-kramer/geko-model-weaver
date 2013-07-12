/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.Pcm_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.Allocation_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.impl.Allocation_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completion;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.CompletionRepository;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avFactory;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avPackage;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.DelegatingExternalCallAction;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.NetworkDemandParametricResourceDemand;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Completions_av_avPackageImpl extends EPackageImpl implements Completions_av_avPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass completionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass completionRepositoryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass delegatingExternalCallActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass networkDemandParametricResourceDemandEClass = null;

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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.Completions_av_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Completions_av_avPackageImpl() {
      super(eNS_URI, Completions_av_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Completions_av_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Completions_av_avPackage init() {
      if (isInited) return (Completions_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Completions_av_avPackage.eNS_URI);

      // Obtain or create and register package
      Completions_av_avPackageImpl theCompletions_av_avPackage = (Completions_av_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Completions_av_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Completions_av_avPackageImpl());

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
      Allocation_av_avPackageImpl theAllocation_av_avPackage = (Allocation_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_av_avPackage.eNS_URI) instanceof Allocation_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_av_avPackage.eNS_URI) : Allocation_av_avPackage.eINSTANCE);
      Subsystem_av_avPackageImpl theSubsystem_av_avPackage = (Subsystem_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_avPackage.eNS_URI) instanceof Subsystem_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_avPackage.eNS_URI) : Subsystem_av_avPackage.eINSTANCE);

      // Create package meta-data objects
      theCompletions_av_avPackage.createPackageContents();
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
      theAllocation_av_avPackage.createPackageContents();
      theSubsystem_av_avPackage.createPackageContents();

      // Initialize created meta-data
      theCompletions_av_avPackage.initializePackageContents();
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
      theAllocation_av_avPackage.initializePackageContents();
      theSubsystem_av_avPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theCompletions_av_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Completions_av_avPackage.eNS_URI, theCompletions_av_avPackage);
      return theCompletions_av_avPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCompletion() {
      return completionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCompletionRepository() {
      return completionRepositoryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCompletionRepository_Completions_CompletionRepository() {
      return (EReference)completionRepositoryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDelegatingExternalCallAction() {
      return delegatingExternalCallActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNetworkDemandParametricResourceDemand() {
      return networkDemandParametricResourceDemandEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNetworkDemandParametricResourceDemand_RequiredCommunicationLinkResource_ParametricResourceDemand() {
      return (EReference)networkDemandParametricResourceDemandEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Completions_av_avFactory getCompletions_av_avFactory() {
      return (Completions_av_avFactory)getEFactoryInstance();
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
      completionEClass = createEClass(COMPLETION);

      completionRepositoryEClass = createEClass(COMPLETION_REPOSITORY);
      createEReference(completionRepositoryEClass, COMPLETION_REPOSITORY__COMPLETIONS_COMPLETION_REPOSITORY);

      delegatingExternalCallActionEClass = createEClass(DELEGATING_EXTERNAL_CALL_ACTION);

      networkDemandParametricResourceDemandEClass = createEClass(NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND);
      createEReference(networkDemandParametricResourceDemandEClass, NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND);
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
      Repository_av_avPackage theRepository_av_avPackage = (Repository_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_av_avPackage.eNS_URI);
      Seff_av_avPackage theSeff_av_avPackage = (Seff_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_av_avPackage.eNS_URI);
      Seff_performance_av_avPackage theSeff_performance_av_avPackage = (Seff_performance_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_avPackage.eNS_URI);
      Resourcetype_av_avPackage theResourcetype_av_avPackage = (Resourcetype_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_avPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      completionEClass.getESuperTypes().add(theEntity_av_avPackage.getComposedProvidingRequiringEntity());
      completionEClass.getESuperTypes().add(theRepository_av_avPackage.getImplementationComponentType());
      delegatingExternalCallActionEClass.getESuperTypes().add(theSeff_av_avPackage.getExternalCallAction());
      networkDemandParametricResourceDemandEClass.getESuperTypes().add(theSeff_performance_av_avPackage.getParametricResourceDemand());

      // Initialize classes and features; add operations and parameters
      initEClass(completionEClass, Completion.class, "Completion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(completionRepositoryEClass, CompletionRepository.class, "CompletionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCompletionRepository_Completions_CompletionRepository(), this.getCompletion(), null, "completions_CompletionRepository", null, 0, -1, CompletionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(delegatingExternalCallActionEClass, DelegatingExternalCallAction.class, "DelegatingExternalCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(networkDemandParametricResourceDemandEClass, NetworkDemandParametricResourceDemand.class, "NetworkDemandParametricResourceDemand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getNetworkDemandParametricResourceDemand_RequiredCommunicationLinkResource_ParametricResourceDemand(), theResourcetype_av_avPackage.getCommunicationLinkResourceType(), null, "requiredCommunicationLinkResource_ParametricResourceDemand", null, 0, 1, NetworkDemandParametricResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
   }

} //Completions_av_avPackageImpl
