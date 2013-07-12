/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.impl;

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

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.impl.Resourceenvironment_av_avPackageImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.CommunicationLinkResourceType;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ProcessingResourceType;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ResourceInterface;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ResourceRepository;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ResourceSignature;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ResourceType;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.Resourcetype_av_avFactory;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.Resourcetype_av_avPackage;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.SchedulingPolicy;

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

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.Units_av_avPackage;

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
public class Resourcetype_av_avPackageImpl extends EPackageImpl implements Resourcetype_av_avPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceSignatureEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass processingResourceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceRepositoryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass schedulingPolicyEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass communicationLinkResourceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceInterfaceEClass = null;

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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.Resourcetype_av_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Resourcetype_av_avPackageImpl() {
      super(eNS_URI, Resourcetype_av_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Resourcetype_av_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Resourcetype_av_avPackage init() {
      if (isInited) return (Resourcetype_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_avPackage.eNS_URI);

      // Obtain or create and register package
      Resourcetype_av_avPackageImpl theResourcetype_av_avPackage = (Resourcetype_av_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Resourcetype_av_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Resourcetype_av_avPackageImpl());

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
      Completions_av_avPackageImpl theCompletions_av_avPackage = (Completions_av_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_av_avPackage.eNS_URI) instanceof Completions_av_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_av_avPackage.eNS_URI) : Completions_av_avPackage.eINSTANCE);

      // Create package meta-data objects
      theResourcetype_av_avPackage.createPackageContents();
      thePcm_av_avPackage.createPackageContents();
      theCore_av_avPackage.createPackageContents();
      theEntity_av_avPackage.createPackageContents();
      theComposition_av_avPackage.createPackageContents();
      theUsagemodel_av_avPackage.createPackageContents();
      theRepository_av_avPackage.createPackageContents();
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
      theCompletions_av_avPackage.createPackageContents();

      // Initialize created meta-data
      theResourcetype_av_avPackage.initializePackageContents();
      thePcm_av_avPackage.initializePackageContents();
      theCore_av_avPackage.initializePackageContents();
      theEntity_av_avPackage.initializePackageContents();
      theComposition_av_avPackage.initializePackageContents();
      theUsagemodel_av_avPackage.initializePackageContents();
      theRepository_av_avPackage.initializePackageContents();
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
      theCompletions_av_avPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theResourcetype_av_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Resourcetype_av_avPackage.eNS_URI, theResourcetype_av_avPackage);
      return theResourcetype_av_avPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceSignature() {
      return resourceSignatureEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceSignature_Parameter__ResourceSignature() {
      return (EReference)resourceSignatureEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getResourceSignature_ResourceServiceId() {
      return (EAttribute)resourceSignatureEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceSignature_ResourceInterface__ResourceSignature() {
      return (EReference)resourceSignatureEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProcessingResourceType() {
      return processingResourceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProcessingResourceType_HardwareInducedFailureType__ProcessingResourceType() {
      return (EReference)processingResourceTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceType() {
      return resourceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceType_ResourceRepository_ResourceType() {
      return (EReference)resourceTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceRepository() {
      return resourceRepositoryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceRepository_ResourceInterfaces__ResourceRepository() {
      return (EReference)resourceRepositoryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceRepository_SchedulingPolicies__ResourceRepository() {
      return (EReference)resourceRepositoryEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceRepository_AvailableResourceTypes_ResourceRepository() {
      return (EReference)resourceRepositoryEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSchedulingPolicy() {
      return schedulingPolicyEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSchedulingPolicy_ResourceRepository__SchedulingPolicy() {
      return (EReference)schedulingPolicyEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCommunicationLinkResourceType() {
      return communicationLinkResourceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCommunicationLinkResourceType_NetworkInducedFailureType__CommunicationLinkResourceType() {
      return (EReference)communicationLinkResourceTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceInterface() {
      return resourceInterfaceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceInterface_ResourceRepository__ResourceInterface() {
      return (EReference)resourceInterfaceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceInterface_ResourceSignatures__ResourceInterface() {
      return (EReference)resourceInterfaceEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourcetype_av_avFactory getResourcetype_av_avFactory() {
      return (Resourcetype_av_avFactory)getEFactoryInstance();
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
      resourceSignatureEClass = createEClass(RESOURCE_SIGNATURE);
      createEReference(resourceSignatureEClass, RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE);
      createEAttribute(resourceSignatureEClass, RESOURCE_SIGNATURE__RESOURCE_SERVICE_ID);
      createEReference(resourceSignatureEClass, RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE);

      processingResourceTypeEClass = createEClass(PROCESSING_RESOURCE_TYPE);
      createEReference(processingResourceTypeEClass, PROCESSING_RESOURCE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_PROCESSING_RESOURCE_TYPE);

      resourceTypeEClass = createEClass(RESOURCE_TYPE);
      createEReference(resourceTypeEClass, RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE);

      resourceRepositoryEClass = createEClass(RESOURCE_REPOSITORY);
      createEReference(resourceRepositoryEClass, RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY);
      createEReference(resourceRepositoryEClass, RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY);
      createEReference(resourceRepositoryEClass, RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY);

      schedulingPolicyEClass = createEClass(SCHEDULING_POLICY);
      createEReference(schedulingPolicyEClass, SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY);

      communicationLinkResourceTypeEClass = createEClass(COMMUNICATION_LINK_RESOURCE_TYPE);
      createEReference(communicationLinkResourceTypeEClass, COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE);

      resourceInterfaceEClass = createEClass(RESOURCE_INTERFACE);
      createEReference(resourceInterfaceEClass, RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE);
      createEReference(resourceInterfaceEClass, RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE);
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
      Reliability_av_avPackage theReliability_av_avPackage = (Reliability_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Reliability_av_avPackage.eNS_URI);
      Units_av_avPackage theUnits_av_avPackage = (Units_av_avPackage)EPackage.Registry.INSTANCE.getEPackage(Units_av_avPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      resourceSignatureEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());
      processingResourceTypeEClass.getESuperTypes().add(this.getResourceType());
      resourceTypeEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());
      resourceTypeEClass.getESuperTypes().add(theUnits_av_avPackage.getUnitCarryingElement());
      resourceTypeEClass.getESuperTypes().add(theEntity_av_avPackage.getResourceInterfaceProvidingEntity());
      schedulingPolicyEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());
      communicationLinkResourceTypeEClass.getESuperTypes().add(this.getResourceType());
      resourceInterfaceEClass.getESuperTypes().add(theEntity_av_avPackage.getEntity());

      // Initialize classes and features; add operations and parameters
      initEClass(resourceSignatureEClass, ResourceSignature.class, "ResourceSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceSignature_Parameter__ResourceSignature(), theRepository_av_avPackage.getParameter(), theRepository_av_avPackage.getParameter_ResourceSignature__Parameter(), "parameter__ResourceSignature", null, 0, 1, ResourceSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getResourceSignature_ResourceServiceId(), ecorePackage.getEInt(), "resourceServiceId", null, 1, 1, ResourceSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceSignature_ResourceInterface__ResourceSignature(), this.getResourceInterface(), this.getResourceInterface_ResourceSignatures__ResourceInterface(), "resourceInterface__ResourceSignature", null, 0, 1, ResourceSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(processingResourceTypeEClass, ProcessingResourceType.class, "ProcessingResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getProcessingResourceType_HardwareInducedFailureType__ProcessingResourceType(), theReliability_av_avPackage.getHardwareInducedFailureType(), theReliability_av_avPackage.getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType(), "hardwareInducedFailureType__ProcessingResourceType", null, 0, 1, ProcessingResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceType_ResourceRepository_ResourceType(), this.getResourceRepository(), this.getResourceRepository_AvailableResourceTypes_ResourceRepository(), "resourceRepository_ResourceType", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceRepositoryEClass, ResourceRepository.class, "ResourceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceRepository_ResourceInterfaces__ResourceRepository(), this.getResourceInterface(), this.getResourceInterface_ResourceRepository__ResourceInterface(), "resourceInterfaces__ResourceRepository", null, 0, -1, ResourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceRepository_SchedulingPolicies__ResourceRepository(), this.getSchedulingPolicy(), this.getSchedulingPolicy_ResourceRepository__SchedulingPolicy(), "schedulingPolicies__ResourceRepository", null, 0, -1, ResourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceRepository_AvailableResourceTypes_ResourceRepository(), this.getResourceType(), this.getResourceType_ResourceRepository_ResourceType(), "availableResourceTypes_ResourceRepository", null, 0, -1, ResourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(schedulingPolicyEClass, SchedulingPolicy.class, "SchedulingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSchedulingPolicy_ResourceRepository__SchedulingPolicy(), this.getResourceRepository(), this.getResourceRepository_SchedulingPolicies__ResourceRepository(), "resourceRepository__SchedulingPolicy", null, 0, 1, SchedulingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(communicationLinkResourceTypeEClass, CommunicationLinkResourceType.class, "CommunicationLinkResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCommunicationLinkResourceType_NetworkInducedFailureType__CommunicationLinkResourceType(), theReliability_av_avPackage.getNetworkInducedFailureType(), theReliability_av_avPackage.getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType(), "networkInducedFailureType__CommunicationLinkResourceType", null, 0, 1, CommunicationLinkResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceInterfaceEClass, ResourceInterface.class, "ResourceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceInterface_ResourceRepository__ResourceInterface(), this.getResourceRepository(), this.getResourceRepository_ResourceInterfaces__ResourceRepository(), "resourceRepository__ResourceInterface", null, 0, 1, ResourceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceInterface_ResourceSignatures__ResourceInterface(), this.getResourceSignature(), this.getResourceSignature_ResourceInterface__ResourceSignature(), "resourceSignatures__ResourceInterface", null, 0, -1, ResourceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
   }

} //Resourcetype_av_avPackageImpl
