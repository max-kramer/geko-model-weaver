/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.Pcm_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.Completions_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.impl.Completions_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.Core_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.impl.Composition_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ComposedProvidingRequiringEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcFactory;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.InterfaceProvidingEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.InterfaceProvidingRequiringEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.InterfaceRequiringEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.NamedElement;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceInterfaceProvidingEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceInterfaceProvidingRequiringEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceInterfaceRequiringEntity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceProvidedRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceRequiredRole;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.util.Entity_pc_pcValidator;

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

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.Seff_performance_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl.Seff_performance_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.impl.Seff_reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.Subsystem_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.impl.Subsystem_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.impl.System_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Usagemodel_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl.Usagemodel_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Stoex_pc_pcPackage;

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
public class Entity_pc_pcPackageImpl extends EPackageImpl implements Entity_pc_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceProvidedRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass interfaceProvidingRequiringEntityEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass interfaceProvidingEntityEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass interfaceRequiringEntityEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceInterfaceRequiringEntityEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceRequiredRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceInterfaceProvidingEntityEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass composedProvidingRequiringEntityEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass namedElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceInterfaceProvidingRequiringEntityEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass entityEClass = null;

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
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Entity_pc_pcPackageImpl() {
      super(eNS_URI, Entity_pc_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Entity_pc_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Entity_pc_pcPackage init() {
      if (isInited) return (Entity_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI);

      // Obtain or create and register package
      Entity_pc_pcPackageImpl theEntity_pc_pcPackage = (Entity_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Entity_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Entity_pc_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pc_pcPackage.eINSTANCE.eClass();
      Stoex_pc_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_pc_pcPackageImpl thePcm_pc_pcPackage = (Pcm_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_pcPackage.eNS_URI) instanceof Pcm_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_pcPackage.eNS_URI) : Pcm_pc_pcPackage.eINSTANCE);
      Core_pc_pcPackageImpl theCore_pc_pcPackage = (Core_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI) instanceof Core_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI) : Core_pc_pcPackage.eINSTANCE);
      Composition_pc_pcPackageImpl theComposition_pc_pcPackage = (Composition_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI) instanceof Composition_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI) : Composition_pc_pcPackage.eINSTANCE);
      Usagemodel_pc_pcPackageImpl theUsagemodel_pc_pcPackage = (Usagemodel_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI) instanceof Usagemodel_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI) : Usagemodel_pc_pcPackage.eINSTANCE);
      Repository_pc_pcPackageImpl theRepository_pc_pcPackage = (Repository_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI) instanceof Repository_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI) : Repository_pc_pcPackage.eINSTANCE);
      Resourcetype_pc_pcPackageImpl theResourcetype_pc_pcPackage = (Resourcetype_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI) instanceof Resourcetype_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI) : Resourcetype_pc_pcPackage.eINSTANCE);
      Protocol_pc_pcPackageImpl theProtocol_pc_pcPackage = (Protocol_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_pcPackage.eNS_URI) instanceof Protocol_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_pcPackage.eNS_URI) : Protocol_pc_pcPackage.eINSTANCE);
      Parameter_pc_pcPackageImpl theParameter_pc_pcPackage = (Parameter_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_pcPackage.eNS_URI) instanceof Parameter_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_pcPackage.eNS_URI) : Parameter_pc_pcPackage.eINSTANCE);
      Reliability_pc_pcPackageImpl theReliability_pc_pcPackage = (Reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_pcPackage.eNS_URI) instanceof Reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_pcPackage.eNS_URI) : Reliability_pc_pcPackage.eINSTANCE);
      Seff_pc_pcPackageImpl theSeff_pc_pcPackage = (Seff_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI) instanceof Seff_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI) : Seff_pc_pcPackage.eINSTANCE);
      Seff_performance_pc_pcPackageImpl theSeff_performance_pc_pcPackage = (Seff_performance_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_pcPackage.eNS_URI) instanceof Seff_performance_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_pcPackage.eNS_URI) : Seff_performance_pc_pcPackage.eINSTANCE);
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
      theEntity_pc_pcPackage.createPackageContents();
      thePcm_pc_pcPackage.createPackageContents();
      theCore_pc_pcPackage.createPackageContents();
      theComposition_pc_pcPackage.createPackageContents();
      theUsagemodel_pc_pcPackage.createPackageContents();
      theRepository_pc_pcPackage.createPackageContents();
      theResourcetype_pc_pcPackage.createPackageContents();
      theProtocol_pc_pcPackage.createPackageContents();
      theParameter_pc_pcPackage.createPackageContents();
      theReliability_pc_pcPackage.createPackageContents();
      theSeff_pc_pcPackage.createPackageContents();
      theSeff_performance_pc_pcPackage.createPackageContents();
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
      theEntity_pc_pcPackage.initializePackageContents();
      thePcm_pc_pcPackage.initializePackageContents();
      theCore_pc_pcPackage.initializePackageContents();
      theComposition_pc_pcPackage.initializePackageContents();
      theUsagemodel_pc_pcPackage.initializePackageContents();
      theRepository_pc_pcPackage.initializePackageContents();
      theResourcetype_pc_pcPackage.initializePackageContents();
      theProtocol_pc_pcPackage.initializePackageContents();
      theParameter_pc_pcPackage.initializePackageContents();
      theReliability_pc_pcPackage.initializePackageContents();
      theSeff_pc_pcPackage.initializePackageContents();
      theSeff_performance_pc_pcPackage.initializePackageContents();
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
         (theEntity_pc_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Entity_pc_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theEntity_pc_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Entity_pc_pcPackage.eNS_URI, theEntity_pc_pcPackage);
      return theEntity_pc_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceProvidedRole() {
      return resourceProvidedRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceProvidedRole_ResourceInterfaceProvidingEntity__ResourceProvidedRole() {
      return (EReference)resourceProvidedRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceProvidedRole_ProvidedResourceInterface__ResourceProvidedRole() {
      return (EReference)resourceProvidedRoleEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInterfaceProvidingRequiringEntity() {
      return interfaceProvidingRequiringEntityEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInterfaceProvidingEntity() {
      return interfaceProvidingEntityEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInterfaceProvidingEntity_ProvidedRoles_InterfaceProvidingEntity() {
      return (EReference)interfaceProvidingEntityEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInterfaceRequiringEntity() {
      return interfaceRequiringEntityEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInterfaceRequiringEntity_RequiredRoles_InterfaceRequiringEntity() {
      return (EReference)interfaceRequiringEntityEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceInterfaceRequiringEntity() {
      return resourceInterfaceRequiringEntityEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceInterfaceRequiringEntity_ResourceRequiredRoles__ResourceInterfaceRequiringEntity() {
      return (EReference)resourceInterfaceRequiringEntityEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceRequiredRole() {
      return resourceRequiredRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole() {
      return (EReference)resourceRequiredRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole() {
      return (EReference)resourceRequiredRoleEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceInterfaceProvidingEntity() {
      return resourceInterfaceProvidingEntityEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity() {
      return (EReference)resourceInterfaceProvidingEntityEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getComposedProvidingRequiringEntity() {
      return composedProvidingRequiringEntityEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNamedElement() {
      return namedElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNamedElement_EntityName() {
      return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceInterfaceProvidingRequiringEntity() {
      return resourceInterfaceProvidingRequiringEntityEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEntity() {
      return entityEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entity_pc_pcFactory getEntity_pc_pcFactory() {
      return (Entity_pc_pcFactory)getEFactoryInstance();
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
      resourceProvidedRoleEClass = createEClass(RESOURCE_PROVIDED_ROLE);
      createEReference(resourceProvidedRoleEClass, RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE);
      createEReference(resourceProvidedRoleEClass, RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE);

      interfaceProvidingRequiringEntityEClass = createEClass(INTERFACE_PROVIDING_REQUIRING_ENTITY);

      interfaceProvidingEntityEClass = createEClass(INTERFACE_PROVIDING_ENTITY);
      createEReference(interfaceProvidingEntityEClass, INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY);

      interfaceRequiringEntityEClass = createEClass(INTERFACE_REQUIRING_ENTITY);
      createEReference(interfaceRequiringEntityEClass, INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY);

      resourceInterfaceRequiringEntityEClass = createEClass(RESOURCE_INTERFACE_REQUIRING_ENTITY);
      createEReference(resourceInterfaceRequiringEntityEClass, RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY);

      resourceRequiredRoleEClass = createEClass(RESOURCE_REQUIRED_ROLE);
      createEReference(resourceRequiredRoleEClass, RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE);
      createEReference(resourceRequiredRoleEClass, RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE);

      resourceInterfaceProvidingEntityEClass = createEClass(RESOURCE_INTERFACE_PROVIDING_ENTITY);
      createEReference(resourceInterfaceProvidingEntityEClass, RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY);

      composedProvidingRequiringEntityEClass = createEClass(COMPOSED_PROVIDING_REQUIRING_ENTITY);

      namedElementEClass = createEClass(NAMED_ELEMENT);
      createEAttribute(namedElementEClass, NAMED_ELEMENT__ENTITY_NAME);

      resourceInterfaceProvidingRequiringEntityEClass = createEClass(RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY);

      entityEClass = createEClass(ENTITY);
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
      Repository_pc_pcPackage theRepository_pc_pcPackage = (Repository_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI);
      Resourcetype_pc_pcPackage theResourcetype_pc_pcPackage = (Resourcetype_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI);
      Composition_pc_pcPackage theComposition_pc_pcPackage = (Composition_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI);
      Identifier_pc_pcPackage theIdentifier_pc_pcPackage = (Identifier_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Identifier_pc_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      resourceProvidedRoleEClass.getESuperTypes().add(theRepository_pc_pcPackage.getRole());
      interfaceProvidingRequiringEntityEClass.getESuperTypes().add(this.getInterfaceProvidingEntity());
      interfaceProvidingRequiringEntityEClass.getESuperTypes().add(this.getInterfaceRequiringEntity());
      interfaceProvidingEntityEClass.getESuperTypes().add(this.getEntity());
      interfaceRequiringEntityEClass.getESuperTypes().add(this.getEntity());
      interfaceRequiringEntityEClass.getESuperTypes().add(this.getResourceInterfaceRequiringEntity());
      resourceInterfaceRequiringEntityEClass.getESuperTypes().add(this.getEntity());
      resourceRequiredRoleEClass.getESuperTypes().add(theRepository_pc_pcPackage.getRole());
      resourceInterfaceProvidingEntityEClass.getESuperTypes().add(this.getEntity());
      composedProvidingRequiringEntityEClass.getESuperTypes().add(theComposition_pc_pcPackage.getComposedStructure());
      composedProvidingRequiringEntityEClass.getESuperTypes().add(this.getInterfaceProvidingRequiringEntity());
      resourceInterfaceProvidingRequiringEntityEClass.getESuperTypes().add(this.getResourceInterfaceRequiringEntity());
      resourceInterfaceProvidingRequiringEntityEClass.getESuperTypes().add(this.getResourceInterfaceProvidingEntity());
      entityEClass.getESuperTypes().add(theIdentifier_pc_pcPackage.getIdentifier());
      entityEClass.getESuperTypes().add(this.getNamedElement());

      // Initialize classes and features; add operations and parameters
      initEClass(resourceProvidedRoleEClass, ResourceProvidedRole.class, "ResourceProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceProvidedRole_ResourceInterfaceProvidingEntity__ResourceProvidedRole(), this.getResourceInterfaceProvidingEntity(), this.getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity(), "resourceInterfaceProvidingEntity__ResourceProvidedRole", null, 0, 1, ResourceProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceProvidedRole_ProvidedResourceInterface__ResourceProvidedRole(), theResourcetype_pc_pcPackage.getResourceInterface(), null, "providedResourceInterface__ResourceProvidedRole", null, 0, 1, ResourceProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(interfaceProvidingRequiringEntityEClass, InterfaceProvidingRequiringEntity.class, "InterfaceProvidingRequiringEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(interfaceProvidingEntityEClass, InterfaceProvidingEntity.class, "InterfaceProvidingEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInterfaceProvidingEntity_ProvidedRoles_InterfaceProvidingEntity(), theRepository_pc_pcPackage.getProvidedRole(), theRepository_pc_pcPackage.getProvidedRole_ProvidingEntity_ProvidedRole(), "providedRoles_InterfaceProvidingEntity", null, 0, -1, InterfaceProvidingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(interfaceRequiringEntityEClass, InterfaceRequiringEntity.class, "InterfaceRequiringEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInterfaceRequiringEntity_RequiredRoles_InterfaceRequiringEntity(), theRepository_pc_pcPackage.getRequiredRole(), theRepository_pc_pcPackage.getRequiredRole_RequiringEntity_RequiredRole(), "requiredRoles_InterfaceRequiringEntity", null, 0, -1, InterfaceRequiringEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceInterfaceRequiringEntityEClass, ResourceInterfaceRequiringEntity.class, "ResourceInterfaceRequiringEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceInterfaceRequiringEntity_ResourceRequiredRoles__ResourceInterfaceRequiringEntity(), this.getResourceRequiredRole(), this.getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole(), "resourceRequiredRoles__ResourceInterfaceRequiringEntity", null, 0, -1, ResourceInterfaceRequiringEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceRequiredRoleEClass, ResourceRequiredRole.class, "ResourceRequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole(), theResourcetype_pc_pcPackage.getResourceInterface(), null, "requiredResourceInterface__ResourceRequiredRole", null, 0, 1, ResourceRequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole(), this.getResourceInterfaceRequiringEntity(), this.getResourceInterfaceRequiringEntity_ResourceRequiredRoles__ResourceInterfaceRequiringEntity(), "resourceInterfaceRequiringEntity__ResourceRequiredRole", null, 0, 1, ResourceRequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceInterfaceProvidingEntityEClass, ResourceInterfaceProvidingEntity.class, "ResourceInterfaceProvidingEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity(), this.getResourceProvidedRole(), this.getResourceProvidedRole_ResourceInterfaceProvidingEntity__ResourceProvidedRole(), "resourceProvidedRoles__ResourceInterfaceProvidingEntity", null, 0, -1, ResourceInterfaceProvidingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(composedProvidingRequiringEntityEClass, ComposedProvidingRequiringEntity.class, "ComposedProvidingRequiringEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      EOperation op = addEOperation(composedProvidingRequiringEntityEClass, ecorePackage.getEBoolean(), "ProvidedRolesMustBeBound", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getNamedElement_EntityName(), ecorePackage.getEString(), "entityName", "aName", 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceInterfaceProvidingRequiringEntityEClass, ResourceInterfaceProvidingRequiringEntity.class, "ResourceInterfaceProvidingRequiringEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
        (composedProvidingRequiringEntityEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.providedRoles_InterfaceProvidingEntity->forAll(role|self.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::ProvidedDelegationConnector)).oclAsType(pcm::core::composition::ProvidedDelegationConnector)->exists(connector|connector.outerProvidedRole_ProvidedDelegationConnector = role))\r\n\r\n"
         });					
   }

} //Entity_pc_pcPackageImpl
