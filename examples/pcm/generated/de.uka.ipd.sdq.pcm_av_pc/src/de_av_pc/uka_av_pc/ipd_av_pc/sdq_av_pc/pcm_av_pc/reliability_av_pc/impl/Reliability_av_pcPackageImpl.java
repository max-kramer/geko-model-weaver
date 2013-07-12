/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.Pcm_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.Allocation_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.impl.Allocation_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.Completions_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.impl.Completions_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.Core_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.Composition_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.impl.Entity_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.impl.Core_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.impl.Pcm_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.Parameter_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.impl.Parameter_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.protocol_av_pc.Protocol_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.protocol_av_pc.impl.Protocol_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.Qosannotations_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.impl.Qosannotations_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.Qos_performance_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.impl.Qos_performance_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.Qos_reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.impl.Qos_reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.ExternalFailureOccurrenceDescription;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.FailureOccurrenceDescription;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.FailureType;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.HardwareInducedFailureType;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.InternalFailureOccurrenceDescription;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.NetworkInducedFailureType;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.Reliability_av_pcFactory;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.Reliability_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.ResourceTimeoutFailureType;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.SoftwareInducedFailureType;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.util.Reliability_av_pcValidator;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.Repository_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.Resourceenvironment_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.Resourceenvironment_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.Resourcetype_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl.Resourcetype_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.impl.Seff_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.Seff_performance_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.impl.Seff_performance_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.Seff_reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.impl.Seff_reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.Subsystem_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.impl.Subsystem_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.impl.System_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.Usagemodel_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class Reliability_av_pcPackageImpl extends EPackageImpl implements Reliability_av_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass failureOccurrenceDescriptionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass hardwareInducedFailureTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass softwareInducedFailureTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass internalFailureOccurrenceDescriptionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass networkInducedFailureTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass externalFailureOccurrenceDescriptionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceTimeoutFailureTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass failureTypeEClass = null;

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
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.Reliability_av_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Reliability_av_pcPackageImpl() {
      super(eNS_URI, Reliability_av_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Reliability_av_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Reliability_av_pcPackage init() {
      if (isInited) return (Reliability_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Reliability_av_pcPackage.eNS_URI);

      // Obtain or create and register package
      Reliability_av_pcPackageImpl theReliability_av_pcPackage = (Reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Reliability_av_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_av_pcPackage.eINSTANCE.eClass();
      Stoex_av_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_av_pcPackageImpl thePcm_av_pcPackage = (Pcm_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_av_pcPackage.eNS_URI) instanceof Pcm_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_av_pcPackage.eNS_URI) : Pcm_av_pcPackage.eINSTANCE);
      Core_av_pcPackageImpl theCore_av_pcPackage = (Core_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_av_pcPackage.eNS_URI) instanceof Core_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_av_pcPackage.eNS_URI) : Core_av_pcPackage.eINSTANCE);
      Entity_av_pcPackageImpl theEntity_av_pcPackage = (Entity_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI) instanceof Entity_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI) : Entity_av_pcPackage.eINSTANCE);
      Composition_av_pcPackageImpl theComposition_av_pcPackage = (Composition_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_av_pcPackage.eNS_URI) instanceof Composition_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_av_pcPackage.eNS_URI) : Composition_av_pcPackage.eINSTANCE);
      Usagemodel_av_pcPackageImpl theUsagemodel_av_pcPackage = (Usagemodel_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI) instanceof Usagemodel_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI) : Usagemodel_av_pcPackage.eINSTANCE);
      Repository_av_pcPackageImpl theRepository_av_pcPackage = (Repository_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI) instanceof Repository_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI) : Repository_av_pcPackage.eINSTANCE);
      Resourcetype_av_pcPackageImpl theResourcetype_av_pcPackage = (Resourcetype_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI) instanceof Resourcetype_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI) : Resourcetype_av_pcPackage.eINSTANCE);
      Protocol_av_pcPackageImpl theProtocol_av_pcPackage = (Protocol_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_av_pcPackage.eNS_URI) instanceof Protocol_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_av_pcPackage.eNS_URI) : Protocol_av_pcPackage.eINSTANCE);
      Parameter_av_pcPackageImpl theParameter_av_pcPackage = (Parameter_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI) instanceof Parameter_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI) : Parameter_av_pcPackage.eINSTANCE);
      Seff_av_pcPackageImpl theSeff_av_pcPackage = (Seff_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI) instanceof Seff_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI) : Seff_av_pcPackage.eINSTANCE);
      Seff_performance_av_pcPackageImpl theSeff_performance_av_pcPackage = (Seff_performance_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI) instanceof Seff_performance_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI) : Seff_performance_av_pcPackage.eINSTANCE);
      Seff_reliability_av_pcPackageImpl theSeff_reliability_av_pcPackage = (Seff_reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_pcPackage.eNS_URI) instanceof Seff_reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_pcPackage.eNS_URI) : Seff_reliability_av_pcPackage.eINSTANCE);
      Qosannotations_av_pcPackageImpl theQosannotations_av_pcPackage = (Qosannotations_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_pcPackage.eNS_URI) instanceof Qosannotations_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_pcPackage.eNS_URI) : Qosannotations_av_pcPackage.eINSTANCE);
      Qos_performance_av_pcPackageImpl theQos_performance_av_pcPackage = (Qos_performance_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_pcPackage.eNS_URI) instanceof Qos_performance_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_pcPackage.eNS_URI) : Qos_performance_av_pcPackage.eINSTANCE);
      Qos_reliability_av_pcPackageImpl theQos_reliability_av_pcPackage = (Qos_reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_pcPackage.eNS_URI) instanceof Qos_reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_pcPackage.eNS_URI) : Qos_reliability_av_pcPackage.eINSTANCE);
      System_av_pcPackageImpl theSystem_av_pcPackage = (System_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_av_pcPackage.eNS_URI) instanceof System_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_av_pcPackage.eNS_URI) : System_av_pcPackage.eINSTANCE);
      Resourceenvironment_av_pcPackageImpl theResourceenvironment_av_pcPackage = (Resourceenvironment_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI) instanceof Resourceenvironment_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI) : Resourceenvironment_av_pcPackage.eINSTANCE);
      Allocation_av_pcPackageImpl theAllocation_av_pcPackage = (Allocation_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_av_pcPackage.eNS_URI) instanceof Allocation_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_av_pcPackage.eNS_URI) : Allocation_av_pcPackage.eINSTANCE);
      Subsystem_av_pcPackageImpl theSubsystem_av_pcPackage = (Subsystem_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_pcPackage.eNS_URI) instanceof Subsystem_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_pcPackage.eNS_URI) : Subsystem_av_pcPackage.eINSTANCE);
      Completions_av_pcPackageImpl theCompletions_av_pcPackage = (Completions_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_av_pcPackage.eNS_URI) instanceof Completions_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_av_pcPackage.eNS_URI) : Completions_av_pcPackage.eINSTANCE);

      // Create package meta-data objects
      theReliability_av_pcPackage.createPackageContents();
      thePcm_av_pcPackage.createPackageContents();
      theCore_av_pcPackage.createPackageContents();
      theEntity_av_pcPackage.createPackageContents();
      theComposition_av_pcPackage.createPackageContents();
      theUsagemodel_av_pcPackage.createPackageContents();
      theRepository_av_pcPackage.createPackageContents();
      theResourcetype_av_pcPackage.createPackageContents();
      theProtocol_av_pcPackage.createPackageContents();
      theParameter_av_pcPackage.createPackageContents();
      theSeff_av_pcPackage.createPackageContents();
      theSeff_performance_av_pcPackage.createPackageContents();
      theSeff_reliability_av_pcPackage.createPackageContents();
      theQosannotations_av_pcPackage.createPackageContents();
      theQos_performance_av_pcPackage.createPackageContents();
      theQos_reliability_av_pcPackage.createPackageContents();
      theSystem_av_pcPackage.createPackageContents();
      theResourceenvironment_av_pcPackage.createPackageContents();
      theAllocation_av_pcPackage.createPackageContents();
      theSubsystem_av_pcPackage.createPackageContents();
      theCompletions_av_pcPackage.createPackageContents();

      // Initialize created meta-data
      theReliability_av_pcPackage.initializePackageContents();
      thePcm_av_pcPackage.initializePackageContents();
      theCore_av_pcPackage.initializePackageContents();
      theEntity_av_pcPackage.initializePackageContents();
      theComposition_av_pcPackage.initializePackageContents();
      theUsagemodel_av_pcPackage.initializePackageContents();
      theRepository_av_pcPackage.initializePackageContents();
      theResourcetype_av_pcPackage.initializePackageContents();
      theProtocol_av_pcPackage.initializePackageContents();
      theParameter_av_pcPackage.initializePackageContents();
      theSeff_av_pcPackage.initializePackageContents();
      theSeff_performance_av_pcPackage.initializePackageContents();
      theSeff_reliability_av_pcPackage.initializePackageContents();
      theQosannotations_av_pcPackage.initializePackageContents();
      theQos_performance_av_pcPackage.initializePackageContents();
      theQos_reliability_av_pcPackage.initializePackageContents();
      theSystem_av_pcPackage.initializePackageContents();
      theResourceenvironment_av_pcPackage.initializePackageContents();
      theAllocation_av_pcPackage.initializePackageContents();
      theSubsystem_av_pcPackage.initializePackageContents();
      theCompletions_av_pcPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theReliability_av_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Reliability_av_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theReliability_av_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Reliability_av_pcPackage.eNS_URI, theReliability_av_pcPackage);
      return theReliability_av_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getFailureOccurrenceDescription() {
      return failureOccurrenceDescriptionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getFailureOccurrenceDescription_FailureProbability() {
      return (EAttribute)failureOccurrenceDescriptionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getHardwareInducedFailureType() {
      return hardwareInducedFailureTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType() {
      return (EReference)hardwareInducedFailureTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSoftwareInducedFailureType() {
      return softwareInducedFailureTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType() {
      return (EReference)softwareInducedFailureTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInternalFailureOccurrenceDescription() {
      return internalFailureOccurrenceDescriptionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription() {
      return (EReference)internalFailureOccurrenceDescriptionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription() {
      return (EReference)internalFailureOccurrenceDescriptionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNetworkInducedFailureType() {
      return networkInducedFailureTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType() {
      return (EReference)networkInducedFailureTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExternalFailureOccurrenceDescription() {
      return externalFailureOccurrenceDescriptionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription() {
      return (EReference)externalFailureOccurrenceDescriptionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription() {
      return (EReference)externalFailureOccurrenceDescriptionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceTimeoutFailureType() {
      return resourceTimeoutFailureTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceTimeoutFailureType_PassiveResource__ResourceTimeoutFailureType() {
      return (EReference)resourceTimeoutFailureTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getFailureType() {
      return failureTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getFailureType_Repository__FailureType() {
      return (EReference)failureTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Reliability_av_pcFactory getReliability_av_pcFactory() {
      return (Reliability_av_pcFactory)getEFactoryInstance();
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
      failureOccurrenceDescriptionEClass = createEClass(FAILURE_OCCURRENCE_DESCRIPTION);
      createEAttribute(failureOccurrenceDescriptionEClass, FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY);

      hardwareInducedFailureTypeEClass = createEClass(HARDWARE_INDUCED_FAILURE_TYPE);
      createEReference(hardwareInducedFailureTypeEClass, HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE);

      softwareInducedFailureTypeEClass = createEClass(SOFTWARE_INDUCED_FAILURE_TYPE);
      createEReference(softwareInducedFailureTypeEClass, SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE);

      internalFailureOccurrenceDescriptionEClass = createEClass(INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
      createEReference(internalFailureOccurrenceDescriptionEClass, INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
      createEReference(internalFailureOccurrenceDescriptionEClass, INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);

      networkInducedFailureTypeEClass = createEClass(NETWORK_INDUCED_FAILURE_TYPE);
      createEReference(networkInducedFailureTypeEClass, NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE);

      externalFailureOccurrenceDescriptionEClass = createEClass(EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
      createEReference(externalFailureOccurrenceDescriptionEClass, EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
      createEReference(externalFailureOccurrenceDescriptionEClass, EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);

      resourceTimeoutFailureTypeEClass = createEClass(RESOURCE_TIMEOUT_FAILURE_TYPE);
      createEReference(resourceTimeoutFailureTypeEClass, RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE);

      failureTypeEClass = createEClass(FAILURE_TYPE);
      createEReference(failureTypeEClass, FAILURE_TYPE__REPOSITORY_FAILURE_TYPE);
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
      Resourcetype_av_pcPackage theResourcetype_av_pcPackage = (Resourcetype_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI);
      Seff_av_pcPackage theSeff_av_pcPackage = (Seff_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI);
      Qos_reliability_av_pcPackage theQos_reliability_av_pcPackage = (Qos_reliability_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_pcPackage.eNS_URI);
      Repository_av_pcPackage theRepository_av_pcPackage = (Repository_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI);
      Entity_av_pcPackage theEntity_av_pcPackage = (Entity_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      hardwareInducedFailureTypeEClass.getESuperTypes().add(this.getFailureType());
      softwareInducedFailureTypeEClass.getESuperTypes().add(this.getFailureType());
      internalFailureOccurrenceDescriptionEClass.getESuperTypes().add(this.getFailureOccurrenceDescription());
      networkInducedFailureTypeEClass.getESuperTypes().add(this.getFailureType());
      externalFailureOccurrenceDescriptionEClass.getESuperTypes().add(this.getFailureOccurrenceDescription());
      resourceTimeoutFailureTypeEClass.getESuperTypes().add(this.getSoftwareInducedFailureType());
      failureTypeEClass.getESuperTypes().add(theEntity_av_pcPackage.getEntity());

      // Initialize classes and features; add operations and parameters
      initEClass(failureOccurrenceDescriptionEClass, FailureOccurrenceDescription.class, "FailureOccurrenceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getFailureOccurrenceDescription_FailureProbability(), ecorePackage.getEDouble(), "failureProbability", null, 1, 1, FailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(failureOccurrenceDescriptionEClass, ecorePackage.getEBoolean(), "EnsureValidFailureProbabilityRange", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(hardwareInducedFailureTypeEClass, HardwareInducedFailureType.class, "HardwareInducedFailureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType(), theResourcetype_av_pcPackage.getProcessingResourceType(), theResourcetype_av_pcPackage.getProcessingResourceType_HardwareInducedFailureType__ProcessingResourceType(), "processingResourceType__HardwareInducedFailureType", null, 0, 1, HardwareInducedFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(hardwareInducedFailureTypeEClass, ecorePackage.getEBoolean(), "HardwareInducedFailureTypeHasProcessingResourceType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(softwareInducedFailureTypeEClass, SoftwareInducedFailureType.class, "SoftwareInducedFailureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType(), this.getInternalFailureOccurrenceDescription(), this.getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription(), "internalFailureOccurrenceDescriptions__SoftwareInducedFailureType", null, 0, -1, SoftwareInducedFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(internalFailureOccurrenceDescriptionEClass, InternalFailureOccurrenceDescription.class, "InternalFailureOccurrenceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription(), theSeff_av_pcPackage.getInternalAction(), theSeff_av_pcPackage.getInternalAction_InternalFailureOccurrenceDescriptions__InternalAction(), "internalAction__InternalFailureOccurrenceDescription", null, 0, 1, InternalFailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription(), this.getSoftwareInducedFailureType(), this.getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType(), "softwareInducedFailureType__InternalFailureOccurrenceDescription", null, 0, 1, InternalFailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(internalFailureOccurrenceDescriptionEClass, ecorePackage.getEBoolean(), "NoResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(networkInducedFailureTypeEClass, NetworkInducedFailureType.class, "NetworkInducedFailureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType(), theResourcetype_av_pcPackage.getCommunicationLinkResourceType(), theResourcetype_av_pcPackage.getCommunicationLinkResourceType_NetworkInducedFailureType__CommunicationLinkResourceType(), "communicationLinkResourceType__NetworkInducedFailureType", null, 0, 1, NetworkInducedFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(networkInducedFailureTypeEClass, ecorePackage.getEBoolean(), "NetworkInducedFailureTypeHasCommunicationLinkResourceType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(externalFailureOccurrenceDescriptionEClass, ExternalFailureOccurrenceDescription.class, "ExternalFailureOccurrenceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(), theQos_reliability_av_pcPackage.getSpecifiedReliabilityAnnotation(), theQos_reliability_av_pcPackage.getSpecifiedReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation(), "specifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription", null, 0, 1, ExternalFailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription(), this.getFailureType(), null, "failureType__ExternalFailureOccurrenceDescription", null, 0, 1, ExternalFailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(externalFailureOccurrenceDescriptionEClass, ecorePackage.getEBoolean(), "NoResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(resourceTimeoutFailureTypeEClass, ResourceTimeoutFailureType.class, "ResourceTimeoutFailureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceTimeoutFailureType_PassiveResource__ResourceTimeoutFailureType(), theRepository_av_pcPackage.getPassiveResource(), theRepository_av_pcPackage.getPassiveResource_ResourceTimeoutFailureType__PassiveResource(), "passiveResource__ResourceTimeoutFailureType", null, 0, 1, ResourceTimeoutFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(failureTypeEClass, FailureType.class, "FailureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getFailureType_Repository__FailureType(), theRepository_av_pcPackage.getRepository(), theRepository_av_pcPackage.getRepository_FailureTypes__Repository(), "repository__FailureType", null, 0, 1, FailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
        (failureOccurrenceDescriptionEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "(self.failureProbability.oclAsType(Real) <= 1.0) and (self.failureProbability.oclAsType(Real) >= 0.0)"
         });					
      addAnnotation
        (hardwareInducedFailureTypeEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "( self.processingResourceType__HardwareInducedFailureType <> null ) and ( not ( self.processingResourceType__HardwareInducedFailureType.oclIsTypeOf( pcm::resourcetype::CommunicationLinkResourceType ) ) )"
         });						
      addAnnotation
        (internalFailureOccurrenceDescriptionEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "not self.softwareInducedFailureType__InternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)"
         });						
      addAnnotation
        (networkInducedFailureTypeEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.communicationLinkResourceType__NetworkInducedFailureType <> null"
         });					
      addAnnotation
        (externalFailureOccurrenceDescriptionEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "not self.failureType__ExternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)"
         });						
   }

} //Reliability_av_pcPackageImpl
