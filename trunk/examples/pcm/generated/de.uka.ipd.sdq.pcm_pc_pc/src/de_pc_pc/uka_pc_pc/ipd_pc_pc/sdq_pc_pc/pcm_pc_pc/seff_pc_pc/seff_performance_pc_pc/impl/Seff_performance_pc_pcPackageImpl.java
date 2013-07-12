/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.Pcm_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.Completions_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.impl.Completions_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.Core_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.impl.Composition_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.impl.Entity_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.impl.Core_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.impl.Pcm_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.Parameter_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.impl.Parameter_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.protocol_pc_pc.Protocol_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.protocol_pc_pc.impl.Protocol_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.Qosannotations_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.Qos_performance_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc.Qos_reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc.impl.Qos_reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.Reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.impl.Reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl.Repository_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.impl.Resourceenvironment_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.Resourcetype_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.impl.Resourcetype_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl.Seff_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.InfrastructureCall;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.ParametricResourceDemand;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.ResourceCall;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.Seff_performance_pc_pcFactory;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.Seff_performance_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.util.Seff_performance_pc_pcValidator;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.impl.Seff_reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.Subsystem_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.impl.Subsystem_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.impl.System_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Usagemodel_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl.Usagemodel_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Stoex_pc_pcPackage;

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
public class Seff_performance_pc_pcPackageImpl extends EPackageImpl implements Seff_performance_pc_pcPackage {
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
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.Seff_performance_pc_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Seff_performance_pc_pcPackageImpl() {
      super(eNS_URI, Seff_performance_pc_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Seff_performance_pc_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Seff_performance_pc_pcPackage init() {
      if (isInited) return (Seff_performance_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_pcPackage.eNS_URI);

      // Obtain or create and register package
      Seff_performance_pc_pcPackageImpl theSeff_performance_pc_pcPackage = (Seff_performance_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Seff_performance_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Seff_performance_pc_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pc_pcPackage.eINSTANCE.eClass();
      Stoex_pc_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_pc_pcPackageImpl thePcm_pc_pcPackage = (Pcm_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_pcPackage.eNS_URI) instanceof Pcm_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_pcPackage.eNS_URI) : Pcm_pc_pcPackage.eINSTANCE);
      Core_pc_pcPackageImpl theCore_pc_pcPackage = (Core_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI) instanceof Core_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI) : Core_pc_pcPackage.eINSTANCE);
      Entity_pc_pcPackageImpl theEntity_pc_pcPackage = (Entity_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI) instanceof Entity_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI) : Entity_pc_pcPackage.eINSTANCE);
      Composition_pc_pcPackageImpl theComposition_pc_pcPackage = (Composition_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI) instanceof Composition_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI) : Composition_pc_pcPackage.eINSTANCE);
      Usagemodel_pc_pcPackageImpl theUsagemodel_pc_pcPackage = (Usagemodel_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI) instanceof Usagemodel_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI) : Usagemodel_pc_pcPackage.eINSTANCE);
      Repository_pc_pcPackageImpl theRepository_pc_pcPackage = (Repository_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI) instanceof Repository_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI) : Repository_pc_pcPackage.eINSTANCE);
      Resourcetype_pc_pcPackageImpl theResourcetype_pc_pcPackage = (Resourcetype_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI) instanceof Resourcetype_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI) : Resourcetype_pc_pcPackage.eINSTANCE);
      Protocol_pc_pcPackageImpl theProtocol_pc_pcPackage = (Protocol_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_pcPackage.eNS_URI) instanceof Protocol_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_pcPackage.eNS_URI) : Protocol_pc_pcPackage.eINSTANCE);
      Parameter_pc_pcPackageImpl theParameter_pc_pcPackage = (Parameter_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_pcPackage.eNS_URI) instanceof Parameter_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_pcPackage.eNS_URI) : Parameter_pc_pcPackage.eINSTANCE);
      Reliability_pc_pcPackageImpl theReliability_pc_pcPackage = (Reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_pcPackage.eNS_URI) instanceof Reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_pcPackage.eNS_URI) : Reliability_pc_pcPackage.eINSTANCE);
      Seff_pc_pcPackageImpl theSeff_pc_pcPackage = (Seff_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI) instanceof Seff_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI) : Seff_pc_pcPackage.eINSTANCE);
      Seff_reliability_pc_pcPackageImpl theSeff_reliability_pc_pcPackage = (Seff_reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_pcPackage.eNS_URI) instanceof Seff_reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_pcPackage.eNS_URI) : Seff_reliability_pc_pcPackage.eINSTANCE);
      Qosannotations_pc_pcPackageImpl theQosannotations_pc_pcPackage = (Qosannotations_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_pcPackage.eNS_URI) instanceof Qosannotations_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_pcPackage.eNS_URI) : Qosannotations_pc_pcPackage.eINSTANCE);
      Qos_performance_pc_pcPackageImpl theQos_performance_pc_pcPackage = (Qos_performance_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_pcPackage.eNS_URI) instanceof Qos_performance_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_pcPackage.eNS_URI) : Qos_performance_pc_pcPackage.eINSTANCE);
      Qos_reliability_pc_pcPackageImpl theQos_reliability_pc_pcPackage = (Qos_reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_pcPackage.eNS_URI) instanceof Qos_reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_pcPackage.eNS_URI) : Qos_reliability_pc_pcPackage.eINSTANCE);
      System_pc_pcPackageImpl theSystem_pc_pcPackage = (System_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_pc_pcPackage.eNS_URI) instanceof System_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_pc_pcPackage.eNS_URI) : System_pc_pcPackage.eINSTANCE);
      Resourceenvironment_pc_pcPackageImpl theResourceenvironment_pc_pcPackage = (Resourceenvironment_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_pcPackage.eNS_URI) instanceof Resourceenvironment_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_pcPackage.eNS_URI) : Resourceenvironment_pc_pcPackage.eINSTANCE);
      Allocation_pc_pcPackageImpl theAllocation_pc_pcPackage = (Allocation_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_pcPackage.eNS_URI) instanceof Allocation_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_pcPackage.eNS_URI) : Allocation_pc_pcPackage.eINSTANCE);
      Subsystem_pc_pcPackageImpl theSubsystem_pc_pcPackage = (Subsystem_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_pcPackage.eNS_URI) instanceof Subsystem_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_pcPackage.eNS_URI) : Subsystem_pc_pcPackage.eINSTANCE);
      Completions_pc_pcPackageImpl theCompletions_pc_pcPackage = (Completions_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pc_pcPackage.eNS_URI) instanceof Completions_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pc_pcPackage.eNS_URI) : Completions_pc_pcPackage.eINSTANCE);

      // Create package meta-data objects
      theSeff_performance_pc_pcPackage.createPackageContents();
      thePcm_pc_pcPackage.createPackageContents();
      theCore_pc_pcPackage.createPackageContents();
      theEntity_pc_pcPackage.createPackageContents();
      theComposition_pc_pcPackage.createPackageContents();
      theUsagemodel_pc_pcPackage.createPackageContents();
      theRepository_pc_pcPackage.createPackageContents();
      theResourcetype_pc_pcPackage.createPackageContents();
      theProtocol_pc_pcPackage.createPackageContents();
      theParameter_pc_pcPackage.createPackageContents();
      theReliability_pc_pcPackage.createPackageContents();
      theSeff_pc_pcPackage.createPackageContents();
      theSeff_reliability_pc_pcPackage.createPackageContents();
      theQosannotations_pc_pcPackage.createPackageContents();
      theQos_performance_pc_pcPackage.createPackageContents();
      theQos_reliability_pc_pcPackage.createPackageContents();
      theSystem_pc_pcPackage.createPackageContents();
      theResourceenvironment_pc_pcPackage.createPackageContents();
      theAllocation_pc_pcPackage.createPackageContents();
      theSubsystem_pc_pcPackage.createPackageContents();
      theCompletions_pc_pcPackage.createPackageContents();

      // Initialize created meta-data
      theSeff_performance_pc_pcPackage.initializePackageContents();
      thePcm_pc_pcPackage.initializePackageContents();
      theCore_pc_pcPackage.initializePackageContents();
      theEntity_pc_pcPackage.initializePackageContents();
      theComposition_pc_pcPackage.initializePackageContents();
      theUsagemodel_pc_pcPackage.initializePackageContents();
      theRepository_pc_pcPackage.initializePackageContents();
      theResourcetype_pc_pcPackage.initializePackageContents();
      theProtocol_pc_pcPackage.initializePackageContents();
      theParameter_pc_pcPackage.initializePackageContents();
      theReliability_pc_pcPackage.initializePackageContents();
      theSeff_pc_pcPackage.initializePackageContents();
      theSeff_reliability_pc_pcPackage.initializePackageContents();
      theQosannotations_pc_pcPackage.initializePackageContents();
      theQos_performance_pc_pcPackage.initializePackageContents();
      theQos_reliability_pc_pcPackage.initializePackageContents();
      theSystem_pc_pcPackage.initializePackageContents();
      theResourceenvironment_pc_pcPackage.initializePackageContents();
      theAllocation_pc_pcPackage.initializePackageContents();
      theSubsystem_pc_pcPackage.initializePackageContents();
      theCompletions_pc_pcPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theSeff_performance_pc_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Seff_performance_pc_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theSeff_performance_pc_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Seff_performance_pc_pcPackage.eNS_URI, theSeff_performance_pc_pcPackage);
      return theSeff_performance_pc_pcPackage;
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
   public Seff_performance_pc_pcFactory getSeff_performance_pc_pcFactory() {
      return (Seff_performance_pc_pcFactory)getEFactoryInstance();
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
      Seff_pc_pcPackage theSeff_pc_pcPackage = (Seff_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI);
      Repository_pc_pcPackage theRepository_pc_pcPackage = (Repository_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI);
      Core_pc_pcPackage theCore_pc_pcPackage = (Core_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI);
      Entity_pc_pcPackage theEntity_pc_pcPackage = (Entity_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI);
      Resourcetype_pc_pcPackage theResourcetype_pc_pcPackage = (Resourcetype_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      infrastructureCallEClass.getESuperTypes().add(theSeff_pc_pcPackage.getCallAction());
      resourceCallEClass.getESuperTypes().add(theSeff_pc_pcPackage.getCallAction());

      // Initialize classes and features; add operations and parameters
      initEClass(infrastructureCallEClass, InfrastructureCall.class, "InfrastructureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInfrastructureCall_Signature__InfrastructureCall(), theRepository_pc_pcPackage.getInfrastructureSignature(), null, "signature__InfrastructureCall", null, 0, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInfrastructureCall_NumberOfCalls__InfrastructureCall(), theCore_pc_pcPackage.getPCMRandomVariable(), theCore_pc_pcPackage.getPCMRandomVariable_InfrastructureCall__PCMRandomVariable(), "numberOfCalls__InfrastructureCall", null, 0, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInfrastructureCall_Action__InfrastructureCall(), theSeff_pc_pcPackage.getAbstractInternalControlFlowAction(), theSeff_pc_pcPackage.getAbstractInternalControlFlowAction_InfrastructureCall__Action(), "action__InfrastructureCall", null, 0, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInfrastructureCall_RequiredRole__InfrastructureCall(), theRepository_pc_pcPackage.getInfrastructureRequiredRole(), null, "requiredRole__InfrastructureCall", null, 0, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
      initEReference(getResourceCall_Action__ResourceCall(), theSeff_pc_pcPackage.getAbstractInternalControlFlowAction(), theSeff_pc_pcPackage.getAbstractInternalControlFlowAction_ResourceCall__Action(), "action__ResourceCall", null, 0, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceCall_ResourceRequiredRole__ResourceCall(), theEntity_pc_pcPackage.getResourceRequiredRole(), null, "resourceRequiredRole__ResourceCall", null, 0, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceCall_Signature__ResourceCall(), theResourcetype_pc_pcPackage.getResourceSignature(), null, "signature__ResourceCall", null, 0, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceCall_NumberOfCalls__ResourceCall(), theCore_pc_pcPackage.getPCMRandomVariable(), theCore_pc_pcPackage.getPCMRandomVariable_ResourceCall__PCMRandomVariable(), "numberOfCalls__ResourceCall", null, 0, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
      initEReference(getParametricResourceDemand_Specification_ParametericResourceDemand(), theCore_pc_pcPackage.getPCMRandomVariable(), theCore_pc_pcPackage.getPCMRandomVariable_ParametricResourceDemand_PCMRandomVariable(), "specification_ParametericResourceDemand", null, 0, 1, ParametricResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParametricResourceDemand_RequiredResource_ParametricResourceDemand(), theResourcetype_pc_pcPackage.getProcessingResourceType(), null, "requiredResource_ParametricResourceDemand", null, 0, 1, ParametricResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParametricResourceDemand_Action_ParametricResourceDemand(), theSeff_pc_pcPackage.getAbstractInternalControlFlowAction(), theSeff_pc_pcPackage.getAbstractInternalControlFlowAction_ResourceDemand_Action(), "action_ParametricResourceDemand", null, 0, 1, ParametricResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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

} //Seff_performance_pc_pcPackageImpl
