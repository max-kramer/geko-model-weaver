/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl;

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

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.Qos_performance_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_performance_pc_av.impl.Qos_performance_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.Qos_reliability_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.Qos_reliability_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.Reliability_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.impl.Reliability_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceEnvironment;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avFactory;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avPackage;

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
public class Resourceenvironment_pc_avPackageImpl extends EPackageImpl implements Resourceenvironment_pc_avPackage {
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
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Resourceenvironment_pc_avPackageImpl() {
      super(eNS_URI, Resourceenvironment_pc_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Resourceenvironment_pc_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Resourceenvironment_pc_avPackage init() {
      if (isInited) return (Resourceenvironment_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_avPackage.eNS_URI);

      // Obtain or create and register package
      Resourceenvironment_pc_avPackageImpl theResourceenvironment_pc_avPackage = (Resourceenvironment_pc_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Resourceenvironment_pc_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Resourceenvironment_pc_avPackageImpl());

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
      Qos_performance_pc_avPackageImpl theQos_performance_pc_avPackage = (Qos_performance_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_avPackage.eNS_URI) instanceof Qos_performance_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_avPackage.eNS_URI) : Qos_performance_pc_avPackage.eINSTANCE);
      Qos_reliability_pc_avPackageImpl theQos_reliability_pc_avPackage = (Qos_reliability_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_avPackage.eNS_URI) instanceof Qos_reliability_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_avPackage.eNS_URI) : Qos_reliability_pc_avPackage.eINSTANCE);
      System_pc_avPackageImpl theSystem_pc_avPackage = (System_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_pc_avPackage.eNS_URI) instanceof System_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_pc_avPackage.eNS_URI) : System_pc_avPackage.eINSTANCE);
      Allocation_pc_avPackageImpl theAllocation_pc_avPackage = (Allocation_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_avPackage.eNS_URI) instanceof Allocation_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_avPackage.eNS_URI) : Allocation_pc_avPackage.eINSTANCE);
      Subsystem_pc_avPackageImpl theSubsystem_pc_avPackage = (Subsystem_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_avPackage.eNS_URI) instanceof Subsystem_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_avPackage.eNS_URI) : Subsystem_pc_avPackage.eINSTANCE);
      Completions_pc_avPackageImpl theCompletions_pc_avPackage = (Completions_pc_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pc_avPackage.eNS_URI) instanceof Completions_pc_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pc_avPackage.eNS_URI) : Completions_pc_avPackage.eINSTANCE);

      // Create package meta-data objects
      theResourceenvironment_pc_avPackage.createPackageContents();
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
      theAllocation_pc_avPackage.createPackageContents();
      theSubsystem_pc_avPackage.createPackageContents();
      theCompletions_pc_avPackage.createPackageContents();

      // Initialize created meta-data
      theResourceenvironment_pc_avPackage.initializePackageContents();
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
      theAllocation_pc_avPackage.initializePackageContents();
      theSubsystem_pc_avPackage.initializePackageContents();
      theCompletions_pc_avPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theResourceenvironment_pc_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Resourceenvironment_pc_avPackage.eNS_URI, theResourceenvironment_pc_avPackage);
      return theResourceenvironment_pc_avPackage;
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
   public Resourceenvironment_pc_avFactory getResourceenvironment_pc_avFactory() {
      return (Resourceenvironment_pc_avFactory)getEFactoryInstance();
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
      Entity_pc_avPackage theEntity_pc_avPackage = (Entity_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_pc_avPackage.eNS_URI);
      Identifier_pc_avPackage theIdentifier_pc_avPackage = (Identifier_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Identifier_pc_avPackage.eNS_URI);
      Resourcetype_pc_avPackage theResourcetype_pc_avPackage = (Resourcetype_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_avPackage.eNS_URI);
      Core_pc_avPackage theCore_pc_avPackage = (Core_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pc_avPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      resourceEnvironmentEClass.getESuperTypes().add(theEntity_pc_avPackage.getNamedElement());
      linkingResourceEClass.getESuperTypes().add(theEntity_pc_avPackage.getEntity());
      resourceContainerEClass.getESuperTypes().add(theEntity_pc_avPackage.getEntity());
      processingResourceSpecificationEClass.getESuperTypes().add(theIdentifier_pc_avPackage.getIdentifier());
      communicationLinkResourceSpecificationEClass.getESuperTypes().add(theIdentifier_pc_avPackage.getIdentifier());

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
      initEReference(getProcessingResourceSpecification_SchedulingPolicy(), theResourcetype_pc_avPackage.getSchedulingPolicy(), null, "schedulingPolicy", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification(), theResourcetype_pc_avPackage.getProcessingResourceType(), null, "activeResourceType_ActiveResourceSpecification", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification(), theCore_pc_avPackage.getPCMRandomVariable(), theCore_pc_avPackage.getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable(), "processingRate_ProcessingResourceSpecification", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getProcessingResourceSpecification_NumberOfReplicas(), ecorePackage.getEInt(), "numberOfReplicas", "1", 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification(), this.getResourceContainer(), this.getResourceContainer_ActiveResourceSpecifications_ResourceContainer(), "resourceContainer_ProcessingResourceSpecification", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(communicationLinkResourceSpecificationEClass, CommunicationLinkResourceSpecification.class, "CommunicationLinkResourceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification(), this.getLinkingResource(), this.getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource(), "linkingResource_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getCommunicationLinkResourceSpecification_FailureProbability(), ecorePackage.getEDouble(), "failureProbability", "0.0", 1, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification(), theResourcetype_pc_avPackage.getCommunicationLinkResourceType(), null, "communicationLinkResourceType_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification(), theCore_pc_avPackage.getPCMRandomVariable(), theCore_pc_avPackage.getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable(), "latency_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification(), theCore_pc_avPackage.getPCMRandomVariable(), theCore_pc_avPackage.getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable(), "throughput_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
   }

} //Resourceenvironment_pc_avPackageImpl
