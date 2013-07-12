/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.impl;

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

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.InfrastructureCall;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ParametricResourceDemand;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ResourceCall;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.Seff_performance_pcFactory;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.Seff_performance_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.util.Seff_performance_pcValidator;

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
public class Seff_performance_pcPackageImpl extends EPackageImpl implements Seff_performance_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass infrastructureCallEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceCallEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass parametricResourceDemandEClass = null;

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
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.Seff_performance_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Seff_performance_pcPackageImpl() {
      super(eNS_URI, Seff_performance_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Seff_performance_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Seff_performance_pcPackage init() {
      if (isInited) return (Seff_performance_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pcPackage.eNS_URI);

      // Obtain or create and register package
      Seff_performance_pcPackageImpl theSeff_performance_pcPackage = (Seff_performance_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Seff_performance_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Seff_performance_pcPackageImpl());

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
      theSeff_performance_pcPackage.createPackageContents();
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
      theSeff_performance_pcPackage.initializePackageContents();
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
         (theSeff_performance_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Seff_performance_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theSeff_performance_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Seff_performance_pcPackage.eNS_URI, theSeff_performance_pcPackage);
      return theSeff_performance_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInfrastructureCall() {
      return infrastructureCallEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInfrastructureCall_Signature__InfrastructureCall() {
      return (EReference)infrastructureCallEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInfrastructureCall_NumberOfCalls__InfrastructureCall() {
      return (EReference)infrastructureCallEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInfrastructureCall_Action__InfrastructureCall() {
      return (EReference)infrastructureCallEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInfrastructureCall_RequiredRole__InfrastructureCall() {
      return (EReference)infrastructureCallEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceCall() {
      return resourceCallEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceCall_Action__ResourceCall() {
      return (EReference)resourceCallEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceCall_ResourceRequiredRole__ResourceCall() {
      return (EReference)resourceCallEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceCall_Signature__ResourceCall() {
      return (EReference)resourceCallEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceCall_NumberOfCalls__ResourceCall() {
      return (EReference)resourceCallEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getParametricResourceDemand() {
      return parametricResourceDemandEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParametricResourceDemand_Specification_ParametericResourceDemand() {
      return (EReference)parametricResourceDemandEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParametricResourceDemand_RequiredResource_ParametricResourceDemand() {
      return (EReference)parametricResourceDemandEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParametricResourceDemand_Action_ParametricResourceDemand() {
      return (EReference)parametricResourceDemandEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_performance_pcFactory getSeff_performance_pcFactory() {
      return (Seff_performance_pcFactory)getEFactoryInstance();
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
      infrastructureCallEClass = createEClass(INFRASTRUCTURE_CALL);
      createEReference(infrastructureCallEClass, INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL);
      createEReference(infrastructureCallEClass, INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL);
      createEReference(infrastructureCallEClass, INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL);
      createEReference(infrastructureCallEClass, INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL);

      resourceCallEClass = createEClass(RESOURCE_CALL);
      createEReference(resourceCallEClass, RESOURCE_CALL__ACTION_RESOURCE_CALL);
      createEReference(resourceCallEClass, RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL);
      createEReference(resourceCallEClass, RESOURCE_CALL__SIGNATURE_RESOURCE_CALL);
      createEReference(resourceCallEClass, RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL);

      parametricResourceDemandEClass = createEClass(PARAMETRIC_RESOURCE_DEMAND);
      createEReference(parametricResourceDemandEClass, PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND);
      createEReference(parametricResourceDemandEClass, PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND);
      createEReference(parametricResourceDemandEClass, PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND);
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
      Seff_pcPackage theSeff_pcPackage = (Seff_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_pcPackage.eNS_URI);
      Repository_pcPackage theRepository_pcPackage = (Repository_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_pcPackage.eNS_URI);
      Core_pcPackage theCore_pcPackage = (Core_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pcPackage.eNS_URI);
      Entity_pcPackage theEntity_pcPackage = (Entity_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_pcPackage.eNS_URI);
      Resourcetype_pcPackage theResourcetype_pcPackage = (Resourcetype_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      infrastructureCallEClass.getESuperTypes().add(theSeff_pcPackage.getCallAction());
      resourceCallEClass.getESuperTypes().add(theSeff_pcPackage.getCallAction());

      // Initialize classes and features; add operations and parameters
      initEClass(infrastructureCallEClass, InfrastructureCall.class, "InfrastructureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInfrastructureCall_Signature__InfrastructureCall(), theRepository_pcPackage.getInfrastructureSignature(), null, "signature__InfrastructureCall", null, 0, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInfrastructureCall_NumberOfCalls__InfrastructureCall(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_InfrastructureCall__PCMRandomVariable(), "numberOfCalls__InfrastructureCall", null, 0, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInfrastructureCall_Action__InfrastructureCall(), theSeff_pcPackage.getAbstractInternalControlFlowAction(), theSeff_pcPackage.getAbstractInternalControlFlowAction_InfrastructureCall__Action(), "action__InfrastructureCall", null, 0, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInfrastructureCall_RequiredRole__InfrastructureCall(), theRepository_pcPackage.getInfrastructureRequiredRole(), null, "requiredRole__InfrastructureCall", null, 0, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(infrastructureCallEClass, ecorePackage.getEBoolean(), "SignatureMustBelongToUsedRequiredRole", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(infrastructureCallEClass, ecorePackage.getEBoolean(), "ReferencedRequiredRoleMustBeRequiredByComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(infrastructureCallEClass, ecorePackage.getEBoolean(), "SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(resourceCallEClass, ResourceCall.class, "ResourceCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceCall_Action__ResourceCall(), theSeff_pcPackage.getAbstractInternalControlFlowAction(), theSeff_pcPackage.getAbstractInternalControlFlowAction_ResourceCall__Action(), "action__ResourceCall", null, 0, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceCall_ResourceRequiredRole__ResourceCall(), theEntity_pcPackage.getResourceRequiredRole(), null, "resourceRequiredRole__ResourceCall", null, 0, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceCall_Signature__ResourceCall(), theResourcetype_pcPackage.getResourceSignature(), null, "signature__ResourceCall", null, 0, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceCall_NumberOfCalls__ResourceCall(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_ResourceCall__PCMRandomVariable(), "numberOfCalls__ResourceCall", null, 0, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(resourceCallEClass, ecorePackage.getEBoolean(), "ResourceSignatureBelongsToResourceRequiredRole", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(resourceCallEClass, ecorePackage.getEBoolean(), "ResourceRequiredRoleMustBeReferencedByComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(resourceCallEClass, ecorePackage.getEBoolean(), "SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(parametricResourceDemandEClass, ParametricResourceDemand.class, "ParametricResourceDemand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getParametricResourceDemand_Specification_ParametericResourceDemand(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_ParametricResourceDemand_PCMRandomVariable(), "specification_ParametericResourceDemand", null, 0, 1, ParametricResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParametricResourceDemand_RequiredResource_ParametricResourceDemand(), theResourcetype_pcPackage.getProcessingResourceType(), null, "requiredResource_ParametricResourceDemand", null, 0, 1, ParametricResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParametricResourceDemand_Action_ParametricResourceDemand(), theSeff_pcPackage.getAbstractInternalControlFlowAction(), theSeff_pcPackage.getAbstractInternalControlFlowAction_ResourceDemand_Action(), "action_ParametricResourceDemand", null, 0, 1, ParametricResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(parametricResourceDemandEClass, ecorePackage.getEBoolean(), "DemandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction", 0, 1, IS_UNIQUE, IS_ORDERED);
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
        (infrastructureCallEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "signature__InfrastructureCall.infrastructureInterface__InfrastructureSignature = requiredRole__InfrastructureCall.requiredInterface__InfrastructureRequiredRole"
         });				
      addAnnotation
        (infrastructureCallEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(pcm::core::entity::InterfaceRequiringEntity)).oclAsType(pcm::core::entity::InterfaceRequiringEntity).requiredRoles_InterfaceRequiringEntity->includes(self.requiredRole__InfrastructureCall)"
         });				
      addAnnotation
        (infrastructureCallEClass.getEOperations().get(2), 
         source, 
         new String[] {
          "body", "self.action__InfrastructureCall.infrastructureCall__Action->select(call | call.requiredRole__InfrastructureCall = self.requiredRole__InfrastructureCall and call.signature__InfrastructureCall=self.signature__InfrastructureCall)->size() = 1"
         });				
      addAnnotation
        (resourceCallEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.resourceRequiredRole__ResourceCall.requiredResourceInterface__ResourceRequiredRole.resourceSignatures__ResourceInterface->includes(self.signature__ResourceCall)"
         });				
      addAnnotation
        (resourceCallEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(pcm::core::entity::ResourceInterfaceRequiringEntity)).oclAsType(pcm::core::entity::ResourceInterfaceRequiringEntity).resourceRequiredRoles__ResourceInterfaceRequiringEntity->includes(self.resourceRequiredRole__ResourceCall)"
         });				
      addAnnotation
        (resourceCallEClass.getEOperations().get(2), 
         source, 
         new String[] {
          "body", "self.action__ResourceCall.resourceCall__Action->select(call | call.resourceRequiredRole__ResourceCall=self.resourceRequiredRole__ResourceCall and call.signature__ResourceCall=self.signature__ResourceCall)->size() = 1"
         });					
      addAnnotation
        (parametricResourceDemandEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.action_ParametricResourceDemand.resourceDemand_Action->select(prd | prd.requiredResource_ParametricResourceDemand=self.requiredResource_ParametricResourceDemand)->size() = 1"
         });		
   }

} //Seff_performance_pcPackageImpl
