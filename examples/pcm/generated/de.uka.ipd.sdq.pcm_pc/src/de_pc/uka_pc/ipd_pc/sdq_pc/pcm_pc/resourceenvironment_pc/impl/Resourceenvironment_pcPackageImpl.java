/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.impl;

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

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.CommunicationLinkResourceSpecification;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.LinkingResource;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.ProcessingResourceSpecification;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.ResourceContainer;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.ResourceEnvironment;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.Resourceenvironment_pcFactory;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.Resourceenvironment_pcPackage;

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

import org.eclipse.emf.ecore.EAttribute;
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
public class Resourceenvironment_pcPackageImpl extends EPackageImpl implements Resourceenvironment_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceEnvironmentEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass linkingResourceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceContainerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass processingResourceSpecificationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass communicationLinkResourceSpecificationEClass = null;

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
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourceenvironment_pc.Resourceenvironment_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Resourceenvironment_pcPackageImpl() {
      super(eNS_URI, Resourceenvironment_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Resourceenvironment_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Resourceenvironment_pcPackage init() {
      if (isInited) return (Resourceenvironment_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pcPackage.eNS_URI);

      // Obtain or create and register package
      Resourceenvironment_pcPackageImpl theResourceenvironment_pcPackage = (Resourceenvironment_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Resourceenvironment_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Resourceenvironment_pcPackageImpl());

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
      Allocation_pcPackageImpl theAllocation_pcPackage = (Allocation_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pcPackage.eNS_URI) instanceof Allocation_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pcPackage.eNS_URI) : Allocation_pcPackage.eINSTANCE);
      Subsystem_pcPackageImpl theSubsystem_pcPackage = (Subsystem_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pcPackage.eNS_URI) instanceof Subsystem_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pcPackage.eNS_URI) : Subsystem_pcPackage.eINSTANCE);
      Completions_pcPackageImpl theCompletions_pcPackage = (Completions_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pcPackage.eNS_URI) instanceof Completions_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pcPackage.eNS_URI) : Completions_pcPackage.eINSTANCE);

      // Create package meta-data objects
      theResourceenvironment_pcPackage.createPackageContents();
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
      theAllocation_pcPackage.createPackageContents();
      theSubsystem_pcPackage.createPackageContents();
      theCompletions_pcPackage.createPackageContents();

      // Initialize created meta-data
      theResourceenvironment_pcPackage.initializePackageContents();
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
      theAllocation_pcPackage.initializePackageContents();
      theSubsystem_pcPackage.initializePackageContents();
      theCompletions_pcPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theResourceenvironment_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Resourceenvironment_pcPackage.eNS_URI, theResourceenvironment_pcPackage);
      return theResourceenvironment_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceEnvironment() {
      return resourceEnvironmentEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceEnvironment_LinkingResources__ResourceEnvironment() {
      return (EReference)resourceEnvironmentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceEnvironment_ResourceContainer_ResourceEnvironment() {
      return (EReference)resourceEnvironmentEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getLinkingResource() {
      return linkingResourceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkingResource_ConnectedResourceContainers_LinkingResource() {
      return (EReference)linkingResourceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource() {
      return (EReference)linkingResourceEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLinkingResource_ResourceEnvironment_LinkingResource() {
      return (EReference)linkingResourceEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceContainer() {
      return resourceContainerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceContainer_ActiveResourceSpecifications_ResourceContainer() {
      return (EReference)resourceContainerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceContainer_ResourceEnvironment_ResourceContainer() {
      return (EReference)resourceContainerEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceContainer_NestedResourceContainers__ResourceContainer() {
      return (EReference)resourceContainerEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceContainer_ParentResourceContainer__ResourceContainer() {
      return (EReference)resourceContainerEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProcessingResourceSpecification() {
      return processingResourceSpecificationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProcessingResourceSpecification_MTTR() {
      return (EAttribute)processingResourceSpecificationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProcessingResourceSpecification_MTTF() {
      return (EAttribute)processingResourceSpecificationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProcessingResourceSpecification_RequiredByContainer() {
      return (EAttribute)processingResourceSpecificationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProcessingResourceSpecification_SchedulingPolicy() {
      return (EReference)processingResourceSpecificationEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification() {
      return (EReference)processingResourceSpecificationEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification() {
      return (EReference)processingResourceSpecificationEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProcessingResourceSpecification_NumberOfReplicas() {
      return (EAttribute)processingResourceSpecificationEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification() {
      return (EReference)processingResourceSpecificationEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCommunicationLinkResourceSpecification() {
      return communicationLinkResourceSpecificationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification() {
      return (EReference)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCommunicationLinkResourceSpecification_FailureProbability() {
      return (EAttribute)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification() {
      return (EReference)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification() {
      return (EReference)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification() {
      return (EReference)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourceenvironment_pcFactory getResourceenvironment_pcFactory() {
      return (Resourceenvironment_pcFactory)getEFactoryInstance();
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
      resourceEnvironmentEClass = createEClass(RESOURCE_ENVIRONMENT);
      createEReference(resourceEnvironmentEClass, RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT);
      createEReference(resourceEnvironmentEClass, RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT);

      linkingResourceEClass = createEClass(LINKING_RESOURCE);
      createEReference(linkingResourceEClass, LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE);
      createEReference(linkingResourceEClass, LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE);
      createEReference(linkingResourceEClass, LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE);

      resourceContainerEClass = createEClass(RESOURCE_CONTAINER);
      createEReference(resourceContainerEClass, RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER);
      createEReference(resourceContainerEClass, RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER);
      createEReference(resourceContainerEClass, RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER);
      createEReference(resourceContainerEClass, RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER);

      processingResourceSpecificationEClass = createEClass(PROCESSING_RESOURCE_SPECIFICATION);
      createEAttribute(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__MTTR);
      createEAttribute(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__MTTF);
      createEAttribute(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER);
      createEReference(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY);
      createEReference(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION);
      createEReference(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION);
      createEAttribute(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS);
      createEReference(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION);

      communicationLinkResourceSpecificationEClass = createEClass(COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
      createEReference(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
      createEAttribute(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY);
      createEReference(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
      createEReference(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
      createEReference(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
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
      Identifier_pcPackage theIdentifier_pcPackage = (Identifier_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Identifier_pcPackage.eNS_URI);
      Resourcetype_pcPackage theResourcetype_pcPackage = (Resourcetype_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pcPackage.eNS_URI);
      Core_pcPackage theCore_pcPackage = (Core_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      resourceEnvironmentEClass.getESuperTypes().add(theEntity_pcPackage.getNamedElement());
      linkingResourceEClass.getESuperTypes().add(theEntity_pcPackage.getEntity());
      resourceContainerEClass.getESuperTypes().add(theEntity_pcPackage.getEntity());
      processingResourceSpecificationEClass.getESuperTypes().add(theIdentifier_pcPackage.getIdentifier());
      communicationLinkResourceSpecificationEClass.getESuperTypes().add(theIdentifier_pcPackage.getIdentifier());

      // Initialize classes and features; add operations and parameters
      initEClass(resourceEnvironmentEClass, ResourceEnvironment.class, "ResourceEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceEnvironment_LinkingResources__ResourceEnvironment(), this.getLinkingResource(), this.getLinkingResource_ResourceEnvironment_LinkingResource(), "linkingResources__ResourceEnvironment", null, 0, -1, ResourceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceEnvironment_ResourceContainer_ResourceEnvironment(), this.getResourceContainer(), this.getResourceContainer_ResourceEnvironment_ResourceContainer(), "resourceContainer_ResourceEnvironment", null, 0, -1, ResourceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(linkingResourceEClass, LinkingResource.class, "LinkingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getLinkingResource_ConnectedResourceContainers_LinkingResource(), this.getResourceContainer(), null, "connectedResourceContainers_LinkingResource", null, 0, -1, LinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource(), this.getCommunicationLinkResourceSpecification(), this.getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification(), "communicationLinkResourceSpecifications_LinkingResource", null, 0, 1, LinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getLinkingResource_ResourceEnvironment_LinkingResource(), this.getResourceEnvironment(), this.getResourceEnvironment_LinkingResources__ResourceEnvironment(), "resourceEnvironment_LinkingResource", null, 0, 1, LinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceContainerEClass, ResourceContainer.class, "ResourceContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceContainer_ActiveResourceSpecifications_ResourceContainer(), this.getProcessingResourceSpecification(), this.getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification(), "activeResourceSpecifications_ResourceContainer", null, 0, -1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceContainer_ResourceEnvironment_ResourceContainer(), this.getResourceEnvironment(), this.getResourceEnvironment_ResourceContainer_ResourceEnvironment(), "resourceEnvironment_ResourceContainer", null, 0, 1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceContainer_NestedResourceContainers__ResourceContainer(), this.getResourceContainer(), this.getResourceContainer_ParentResourceContainer__ResourceContainer(), "nestedResourceContainers__ResourceContainer", null, 0, -1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceContainer_ParentResourceContainer__ResourceContainer(), this.getResourceContainer(), this.getResourceContainer_NestedResourceContainers__ResourceContainer(), "parentResourceContainer__ResourceContainer", null, 0, 1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(processingResourceSpecificationEClass, ProcessingResourceSpecification.class, "ProcessingResourceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getProcessingResourceSpecification_MTTR(), ecorePackage.getEDouble(), "MTTR", "0.0", 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getProcessingResourceSpecification_MTTF(), ecorePackage.getEDouble(), "MTTF", "0.0", 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getProcessingResourceSpecification_RequiredByContainer(), ecorePackage.getEBoolean(), "requiredByContainer", null, 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_SchedulingPolicy(), theResourcetype_pcPackage.getSchedulingPolicy(), null, "schedulingPolicy", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification(), theResourcetype_pcPackage.getProcessingResourceType(), null, "activeResourceType_ActiveResourceSpecification", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable(), "processingRate_ProcessingResourceSpecification", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getProcessingResourceSpecification_NumberOfReplicas(), ecorePackage.getEInt(), "numberOfReplicas", "1", 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification(), this.getResourceContainer(), this.getResourceContainer_ActiveResourceSpecifications_ResourceContainer(), "resourceContainer_ProcessingResourceSpecification", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(communicationLinkResourceSpecificationEClass, CommunicationLinkResourceSpecification.class, "CommunicationLinkResourceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification(), this.getLinkingResource(), this.getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource(), "linkingResource_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getCommunicationLinkResourceSpecification_FailureProbability(), ecorePackage.getEDouble(), "failureProbability", "0.0", 1, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification(), theResourcetype_pcPackage.getCommunicationLinkResourceType(), null, "communicationLinkResourceType_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable(), "latency_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification(), theCore_pcPackage.getPCMRandomVariable(), theCore_pcPackage.getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable(), "throughput_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
   }

} //Resourceenvironment_pcPackageImpl
