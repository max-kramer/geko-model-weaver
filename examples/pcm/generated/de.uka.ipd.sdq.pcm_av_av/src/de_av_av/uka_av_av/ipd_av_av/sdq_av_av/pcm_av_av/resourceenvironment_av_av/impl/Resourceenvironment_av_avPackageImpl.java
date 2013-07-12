/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.Pcm_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.Allocation_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.impl.Allocation_av_avPackageImpl;

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

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.CommunicationLinkResourceSpecification;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.LinkingResource;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.ProcessingResourceSpecification;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.ResourceContainer;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.ResourceEnvironment;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avFactory;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage;

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
public class Resourceenvironment_av_avPackageImpl extends EPackageImpl implements Resourceenvironment_av_avPackage {
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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Resourceenvironment_av_avPackageImpl() {
      super(eNS_URI, Resourceenvironment_av_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Resourceenvironment_av_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Resourceenvironment_av_avPackage init() {
      if (isInited) return (Resourceenvironment_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_avPackage.eNS_URI);

      // Obtain or create and register package
      Resourceenvironment_av_avPackageImpl theResourceenvironment_av_avPackage = (Resourceenvironment_av_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Resourceenvironment_av_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Resourceenvironment_av_avPackageImpl());

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
      Allocation_av_avPackageImpl theAllocation_av_avPackage = (Allocation_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_av_avPackage.eNS_URI) instanceof Allocation_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_av_avPackage.eNS_URI) : Allocation_av_avPackage.eINSTANCE);
      Subsystem_av_avPackageImpl theSubsystem_av_avPackage = (Subsystem_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_avPackage.eNS_URI) instanceof Subsystem_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_avPackage.eNS_URI) : Subsystem_av_avPackage.eINSTANCE);
      Completions_av_avPackageImpl theCompletions_av_avPackage = (Completions_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_av_avPackage.eNS_URI) instanceof Completions_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_av_avPackage.eNS_URI) : Completions_av_avPackage.eINSTANCE);

      // Create package meta-data objects
      theResourceenvironment_av_avPackage.createPackageContents();
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
      theAllocation_av_avPackage.createPackageContents();
      theSubsystem_av_avPackage.createPackageContents();
      theCompletions_av_avPackage.createPackageContents();

      // Initialize created meta-data
      theResourceenvironment_av_avPackage.initializePackageContents();
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
      theAllocation_av_avPackage.initializePackageContents();
      theSubsystem_av_avPackage.initializePackageContents();
      theCompletions_av_avPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theResourceenvironment_av_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Resourceenvironment_av_avPackage.eNS_URI, theResourceenvironment_av_avPackage);
      return theResourceenvironment_av_avPackage;
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
   public Resourceenvironment_av_avFactory getResourceenvironment_av_avFactory() {
      return (Resourceenvironment_av_avFactory)getEFactoryInstance();
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
      Entity_av_avPackage theEntity_av_avPackage = (Entity_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_av_avPackage.eNS_URI);
      Identifier_av_avPackage theIdentifier_av_avPackage = (Identifier_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Identifier_av_avPackage.eNS_URI);
      Resourcetype_av_avPackage theResourcetype_av_avPackage = (Resourcetype_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_avPackage.eNS_URI);
      Core_av_avPackage theCore_av_avPackage = (Core_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Core_av_avPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      resourceEnvironmentEClass.getESuperTypes().add(theEntity_av_avPackage.getNamedElement());
      linkingResourceEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());
      resourceContainerEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());
      processingResourceSpecificationEClass.getESuperTypes().add(theIdentifier_av_avPackage.getIdentifier());
      communicationLinkResourceSpecificationEClass.getESuperTypes().add(theIdentifier_av_avPackage.getIdentifier());

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
      initEReference(getProcessingResourceSpecification_SchedulingPolicy(), theResourcetype_av_avPackage.getSchedulingPolicy(), null, "schedulingPolicy", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification(), theResourcetype_av_avPackage.getProcessingResourceType(), null, "activeResourceType_ActiveResourceSpecification", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification(), theCore_av_avPackage.getPCMRandomVariable(), theCore_av_avPackage.getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable(), "processingRate_ProcessingResourceSpecification", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getProcessingResourceSpecification_NumberOfReplicas(), ecorePackage.getEInt(), "numberOfReplicas", "1", 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification(), this.getResourceContainer(), this.getResourceContainer_ActiveResourceSpecifications_ResourceContainer(), "resourceContainer_ProcessingResourceSpecification", null, 0, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(communicationLinkResourceSpecificationEClass, CommunicationLinkResourceSpecification.class, "CommunicationLinkResourceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification(), this.getLinkingResource(), this.getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource(), "linkingResource_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getCommunicationLinkResourceSpecification_FailureProbability(), ecorePackage.getEDouble(), "failureProbability", "0.0", 1, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification(), theResourcetype_av_avPackage.getCommunicationLinkResourceType(), null, "communicationLinkResourceType_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification(), theCore_av_avPackage.getPCMRandomVariable(), theCore_av_avPackage.getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable(), "latency_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification(), theCore_av_avPackage.getPCMRandomVariable(), theCore_av_avPackage.getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable(), "throughput_CommunicationLinkResourceSpecification", null, 0, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
   }

} //Resourceenvironment_av_avPackageImpl
