/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl;

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

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.BasicComponent;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.CollectionDataType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.CompleteComponentType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.ComponentType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.CompositeComponent;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.CompositeDataType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.DataType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.EventGroup;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.EventType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.ExceptionType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.ImplementationComponentType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureInterface;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureProvidedRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureRequiredRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureSignature;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InnerDeclaration;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Interface;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.OperationInterface;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.OperationProvidedRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.OperationRequiredRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.OperationSignature;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Parameter;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.ParameterModifier;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.PassiveResource;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.PrimitiveDataType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.PrimitiveTypeEnum;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.ProvidedRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.ProvidesComponentType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.RepositoryComponent;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcFactory;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.RequiredCharacterisation;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.RequiredRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Role;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Signature;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.SinkRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.SourceRole;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.util.Repository_pc_pcValidator;

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
import org.eclipse.emf.ecore.EEnum;
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
public class Repository_pc_pcPackageImpl extends EPackageImpl implements Repository_pc_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass passiveResourceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass basicComponentEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass implementationComponentTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass repositoryComponentEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass providedRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass parameterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass dataTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass repositoryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass interfaceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass requiredCharacterisationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass eventGroupEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass eventTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass signatureEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass exceptionTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass infrastructureSignatureEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass infrastructureInterfaceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass infrastructureRequiredRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass requiredRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass operationSignatureEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass operationInterfaceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass operationRequiredRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass sourceRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass sinkRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass operationProvidedRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass infrastructureProvidedRoleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass completeComponentTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass providesComponentTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass compositeComponentEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass primitiveDataTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass collectionDataTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass compositeDataTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass innerDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass roleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum parameterModifierEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum componentTypeEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum primitiveTypeEnumEEnum = null;

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
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Repository_pc_pcPackageImpl() {
      super(eNS_URI, Repository_pc_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Repository_pc_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Repository_pc_pcPackage init() {
      if (isInited) return (Repository_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI);

      // Obtain or create and register package
      Repository_pc_pcPackageImpl theRepository_pc_pcPackage = (Repository_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Repository_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Repository_pc_pcPackageImpl());

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
      theRepository_pc_pcPackage.createPackageContents();
      thePcm_pc_pcPackage.createPackageContents();
      theCore_pc_pcPackage.createPackageContents();
      theEntity_pc_pcPackage.createPackageContents();
      theComposition_pc_pcPackage.createPackageContents();
      theUsagemodel_pc_pcPackage.createPackageContents();
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
      theRepository_pc_pcPackage.initializePackageContents();
      thePcm_pc_pcPackage.initializePackageContents();
      theCore_pc_pcPackage.initializePackageContents();
      theEntity_pc_pcPackage.initializePackageContents();
      theComposition_pc_pcPackage.initializePackageContents();
      theUsagemodel_pc_pcPackage.initializePackageContents();
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
         (theRepository_pc_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Repository_pc_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theRepository_pc_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Repository_pc_pcPackage.eNS_URI, theRepository_pc_pcPackage);
      return theRepository_pc_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPassiveResource() {
      return passiveResourceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPassiveResource_Capacity_PassiveResource() {
      return (EReference)passiveResourceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPassiveResource_BasicComponent_PassiveResource() {
      return (EReference)passiveResourceEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPassiveResource_ResourceTimeoutFailureType__PassiveResource() {
      return (EReference)passiveResourceEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBasicComponent() {
      return basicComponentEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBasicComponent_ServiceEffectSpecifications__BasicComponent() {
      return (EReference)basicComponentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBasicComponent_PassiveResource_BasicComponent() {
      return (EReference)basicComponentEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getImplementationComponentType() {
      return implementationComponentTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getImplementationComponentType_ParentCompleteComponentTypes() {
      return (EReference)implementationComponentTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType() {
      return (EReference)implementationComponentTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getImplementationComponentType_ComponentType() {
      return (EAttribute)implementationComponentTypeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRepositoryComponent() {
      return repositoryComponentEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRepositoryComponent_Repository__RepositoryComponent() {
      return (EReference)repositoryComponentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProvidedRole() {
      return providedRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProvidedRole_ProvidingEntity_ProvidedRole() {
      return (EReference)providedRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getParameter() {
      return parameterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameter_DataType__Parameter() {
      return (EReference)parameterEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameter_InfrastructureSignature__Parameter() {
      return (EReference)parameterEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameter_OperationSignature__Parameter() {
      return (EReference)parameterEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameter_EventType__Parameter() {
      return (EReference)parameterEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getParameter_ParameterName() {
      return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getParameter_Modifier__Parameter() {
      return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameter_ResourceSignature__Parameter() {
      return (EReference)parameterEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDataType() {
      return dataTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getDataType_Repository__DataType() {
      return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRepository() {
      return repositoryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRepository_RepositoryDescription() {
      return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRepository_Components__Repository() {
      return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRepository_Interfaces__Repository() {
      return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRepository_FailureTypes__Repository() {
      return (EReference)repositoryEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRepository_DataTypes__Repository() {
      return (EReference)repositoryEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInterface() {
      return interfaceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInterface_ParentInterfaces__Interface() {
      return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInterface_Protocols__Interface() {
      return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInterface_RequiredCharacterisations() {
      return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInterface_Repository__Interface() {
      return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRequiredCharacterisation() {
      return requiredCharacterisationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRequiredCharacterisation_Type() {
      return (EAttribute)requiredCharacterisationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredCharacterisation_Parameter() {
      return (EReference)requiredCharacterisationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredCharacterisation_Interface_RequiredCharacterisation() {
      return (EReference)requiredCharacterisationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEventGroup() {
      return eventGroupEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventGroup_EventTypes__EventGroup() {
      return (EReference)eventGroupEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEventType() {
      return eventTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventType_Parameter__EventType() {
      return (EReference)eventTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEventType_EventGroup__EventType() {
      return (EReference)eventTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSignature() {
      return signatureEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSignature_Exceptions__Signature() {
      return (EReference)signatureEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSignature_FailureType() {
      return (EReference)signatureEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExceptionType() {
      return exceptionTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getExceptionType_ExceptionName() {
      return (EAttribute)exceptionTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getExceptionType_ExceptionMessage() {
      return (EAttribute)exceptionTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInfrastructureSignature() {
      return infrastructureSignatureEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInfrastructureSignature_Parameters__InfrastructureSignature() {
      return (EReference)infrastructureSignatureEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature() {
      return (EReference)infrastructureSignatureEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInfrastructureInterface() {
      return infrastructureInterfaceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface() {
      return (EReference)infrastructureInterfaceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInfrastructureRequiredRole() {
      return infrastructureRequiredRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole() {
      return (EReference)infrastructureRequiredRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRequiredRole() {
      return requiredRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRequiredRole_RequiringEntity_RequiredRole() {
      return (EReference)requiredRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getOperationSignature() {
      return operationSignatureEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getOperationSignature_Interface__OperationSignature() {
      return (EReference)operationSignatureEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getOperationSignature_Parameters__OperationSignature() {
      return (EReference)operationSignatureEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getOperationSignature_ReturnType__OperationSignature() {
      return (EReference)operationSignatureEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getOperationInterface() {
      return operationInterfaceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getOperationInterface_Signatures__OperationInterface() {
      return (EReference)operationInterfaceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getOperationRequiredRole() {
      return operationRequiredRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getOperationRequiredRole_RequiredInterface__OperationRequiredRole() {
      return (EReference)operationRequiredRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSourceRole() {
      return sourceRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSourceRole_EventGroup__SourceRole() {
      return (EReference)sourceRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSinkRole() {
      return sinkRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSinkRole_EventGroup__SinkRole() {
      return (EReference)sinkRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getOperationProvidedRole() {
      return operationProvidedRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getOperationProvidedRole_ProvidedInterface__OperationProvidedRole() {
      return (EReference)operationProvidedRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInfrastructureProvidedRole() {
      return infrastructureProvidedRoleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole() {
      return (EReference)infrastructureProvidedRoleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCompleteComponentType() {
      return completeComponentTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCompleteComponentType_ParentProvidesComponentTypes() {
      return (EReference)completeComponentTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProvidesComponentType() {
      return providesComponentTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCompositeComponent() {
      return compositeComponentEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPrimitiveDataType() {
      return primitiveDataTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getPrimitiveDataType_Type() {
      return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCollectionDataType() {
      return collectionDataTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCollectionDataType_InnerType_CollectionDataType() {
      return (EReference)collectionDataTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCompositeDataType() {
      return compositeDataTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCompositeDataType_ParentType_CompositeDataType() {
      return (EReference)compositeDataTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCompositeDataType_InnerDeclaration_CompositeDataType() {
      return (EReference)compositeDataTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInnerDeclaration() {
      return innerDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInnerDeclaration_Datatype_InnerDeclaration() {
      return (EReference)innerDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInnerDeclaration_CompositeDataType_InnerDeclaration() {
      return (EReference)innerDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRole() {
      return roleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getParameterModifier() {
      return parameterModifierEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getComponentType() {
      return componentTypeEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getPrimitiveTypeEnum() {
      return primitiveTypeEnumEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Repository_pc_pcFactory getRepository_pc_pcFactory() {
      return (Repository_pc_pcFactory)getEFactoryInstance();
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
      passiveResourceEClass = createEClass(PASSIVE_RESOURCE);
      createEReference(passiveResourceEClass, PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE);
      createEReference(passiveResourceEClass, PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE);
      createEReference(passiveResourceEClass, PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE);

      basicComponentEClass = createEClass(BASIC_COMPONENT);
      createEReference(basicComponentEClass, BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT);
      createEReference(basicComponentEClass, BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT);

      implementationComponentTypeEClass = createEClass(IMPLEMENTATION_COMPONENT_TYPE);
      createEReference(implementationComponentTypeEClass, IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES);
      createEReference(implementationComponentTypeEClass, IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE);
      createEAttribute(implementationComponentTypeEClass, IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE);

      repositoryComponentEClass = createEClass(REPOSITORY_COMPONENT);
      createEReference(repositoryComponentEClass, REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT);

      providedRoleEClass = createEClass(PROVIDED_ROLE);
      createEReference(providedRoleEClass, PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE);

      parameterEClass = createEClass(PARAMETER);
      createEReference(parameterEClass, PARAMETER__DATA_TYPE_PARAMETER);
      createEReference(parameterEClass, PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER);
      createEReference(parameterEClass, PARAMETER__OPERATION_SIGNATURE_PARAMETER);
      createEReference(parameterEClass, PARAMETER__EVENT_TYPE_PARAMETER);
      createEAttribute(parameterEClass, PARAMETER__PARAMETER_NAME);
      createEAttribute(parameterEClass, PARAMETER__MODIFIER_PARAMETER);
      createEReference(parameterEClass, PARAMETER__RESOURCE_SIGNATURE_PARAMETER);

      dataTypeEClass = createEClass(DATA_TYPE);
      createEReference(dataTypeEClass, DATA_TYPE__REPOSITORY_DATA_TYPE);

      repositoryEClass = createEClass(REPOSITORY);
      createEAttribute(repositoryEClass, REPOSITORY__REPOSITORY_DESCRIPTION);
      createEReference(repositoryEClass, REPOSITORY__COMPONENTS_REPOSITORY);
      createEReference(repositoryEClass, REPOSITORY__INTERFACES_REPOSITORY);
      createEReference(repositoryEClass, REPOSITORY__FAILURE_TYPES_REPOSITORY);
      createEReference(repositoryEClass, REPOSITORY__DATA_TYPES_REPOSITORY);

      interfaceEClass = createEClass(INTERFACE);
      createEReference(interfaceEClass, INTERFACE__PARENT_INTERFACES_INTERFACE);
      createEReference(interfaceEClass, INTERFACE__PROTOCOLS_INTERFACE);
      createEReference(interfaceEClass, INTERFACE__REQUIRED_CHARACTERISATIONS);
      createEReference(interfaceEClass, INTERFACE__REPOSITORY_INTERFACE);

      requiredCharacterisationEClass = createEClass(REQUIRED_CHARACTERISATION);
      createEAttribute(requiredCharacterisationEClass, REQUIRED_CHARACTERISATION__TYPE);
      createEReference(requiredCharacterisationEClass, REQUIRED_CHARACTERISATION__PARAMETER);
      createEReference(requiredCharacterisationEClass, REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION);

      eventGroupEClass = createEClass(EVENT_GROUP);
      createEReference(eventGroupEClass, EVENT_GROUP__EVENT_TYPES_EVENT_GROUP);

      eventTypeEClass = createEClass(EVENT_TYPE);
      createEReference(eventTypeEClass, EVENT_TYPE__PARAMETER_EVENT_TYPE);
      createEReference(eventTypeEClass, EVENT_TYPE__EVENT_GROUP_EVENT_TYPE);

      signatureEClass = createEClass(SIGNATURE);
      createEReference(signatureEClass, SIGNATURE__EXCEPTIONS_SIGNATURE);
      createEReference(signatureEClass, SIGNATURE__FAILURE_TYPE);

      exceptionTypeEClass = createEClass(EXCEPTION_TYPE);
      createEAttribute(exceptionTypeEClass, EXCEPTION_TYPE__EXCEPTION_NAME);
      createEAttribute(exceptionTypeEClass, EXCEPTION_TYPE__EXCEPTION_MESSAGE);

      infrastructureSignatureEClass = createEClass(INFRASTRUCTURE_SIGNATURE);
      createEReference(infrastructureSignatureEClass, INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE);
      createEReference(infrastructureSignatureEClass, INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE);

      infrastructureInterfaceEClass = createEClass(INFRASTRUCTURE_INTERFACE);
      createEReference(infrastructureInterfaceEClass, INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE);

      infrastructureRequiredRoleEClass = createEClass(INFRASTRUCTURE_REQUIRED_ROLE);
      createEReference(infrastructureRequiredRoleEClass, INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE);

      requiredRoleEClass = createEClass(REQUIRED_ROLE);
      createEReference(requiredRoleEClass, REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE);

      operationSignatureEClass = createEClass(OPERATION_SIGNATURE);
      createEReference(operationSignatureEClass, OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE);
      createEReference(operationSignatureEClass, OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE);
      createEReference(operationSignatureEClass, OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE);

      operationInterfaceEClass = createEClass(OPERATION_INTERFACE);
      createEReference(operationInterfaceEClass, OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE);

      operationRequiredRoleEClass = createEClass(OPERATION_REQUIRED_ROLE);
      createEReference(operationRequiredRoleEClass, OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE);

      sourceRoleEClass = createEClass(SOURCE_ROLE);
      createEReference(sourceRoleEClass, SOURCE_ROLE__EVENT_GROUP_SOURCE_ROLE);

      sinkRoleEClass = createEClass(SINK_ROLE);
      createEReference(sinkRoleEClass, SINK_ROLE__EVENT_GROUP_SINK_ROLE);

      operationProvidedRoleEClass = createEClass(OPERATION_PROVIDED_ROLE);
      createEReference(operationProvidedRoleEClass, OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE);

      infrastructureProvidedRoleEClass = createEClass(INFRASTRUCTURE_PROVIDED_ROLE);
      createEReference(infrastructureProvidedRoleEClass, INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE);

      completeComponentTypeEClass = createEClass(COMPLETE_COMPONENT_TYPE);
      createEReference(completeComponentTypeEClass, COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES);

      providesComponentTypeEClass = createEClass(PROVIDES_COMPONENT_TYPE);

      compositeComponentEClass = createEClass(COMPOSITE_COMPONENT);

      primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);
      createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__TYPE);

      collectionDataTypeEClass = createEClass(COLLECTION_DATA_TYPE);
      createEReference(collectionDataTypeEClass, COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE);

      compositeDataTypeEClass = createEClass(COMPOSITE_DATA_TYPE);
      createEReference(compositeDataTypeEClass, COMPOSITE_DATA_TYPE__PARENT_TYPE_COMPOSITE_DATA_TYPE);
      createEReference(compositeDataTypeEClass, COMPOSITE_DATA_TYPE__INNER_DECLARATION_COMPOSITE_DATA_TYPE);

      innerDeclarationEClass = createEClass(INNER_DECLARATION);
      createEReference(innerDeclarationEClass, INNER_DECLARATION__DATATYPE_INNER_DECLARATION);
      createEReference(innerDeclarationEClass, INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION);

      roleEClass = createEClass(ROLE);

      // Create enums
      parameterModifierEEnum = createEEnum(PARAMETER_MODIFIER);
      componentTypeEEnum = createEEnum(COMPONENT_TYPE);
      primitiveTypeEnumEEnum = createEEnum(PRIMITIVE_TYPE_ENUM);
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
      Entity_pc_pcPackage theEntity_pc_pcPackage = (Entity_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI);
      Core_pc_pcPackage theCore_pc_pcPackage = (Core_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI);
      Reliability_pc_pcPackage theReliability_pc_pcPackage = (Reliability_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_pcPackage.eNS_URI);
      Seff_pc_pcPackage theSeff_pc_pcPackage = (Seff_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI);
      Parameter_pc_pcPackage theParameter_pc_pcPackage = (Parameter_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_pcPackage.eNS_URI);
      Resourcetype_pc_pcPackage theResourcetype_pc_pcPackage = (Resourcetype_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI);
      Protocol_pc_pcPackage theProtocol_pc_pcPackage = (Protocol_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      passiveResourceEClass.getESuperTypes().add(theEntity_pc_pcPackage.getEntity());
      basicComponentEClass.getESuperTypes().add(this.getImplementationComponentType());
      implementationComponentTypeEClass.getESuperTypes().add(this.getRepositoryComponent());
      repositoryComponentEClass.getESuperTypes().add(theEntity_pc_pcPackage.getInterfaceProvidingRequiringEntity());
      providedRoleEClass.getESuperTypes().add(this.getRole());
      repositoryEClass.getESuperTypes().add(theEntity_pc_pcPackage.getEntity());
      interfaceEClass.getESuperTypes().add(theEntity_pc_pcPackage.getEntity());
      eventGroupEClass.getESuperTypes().add(this.getInterface());
      eventTypeEClass.getESuperTypes().add(this.getSignature());
      signatureEClass.getESuperTypes().add(theEntity_pc_pcPackage.getEntity());
      infrastructureSignatureEClass.getESuperTypes().add(this.getSignature());
      infrastructureInterfaceEClass.getESuperTypes().add(this.getInterface());
      infrastructureRequiredRoleEClass.getESuperTypes().add(this.getRequiredRole());
      requiredRoleEClass.getESuperTypes().add(this.getRole());
      operationSignatureEClass.getESuperTypes().add(this.getSignature());
      operationInterfaceEClass.getESuperTypes().add(this.getInterface());
      operationRequiredRoleEClass.getESuperTypes().add(this.getRequiredRole());
      sourceRoleEClass.getESuperTypes().add(this.getRequiredRole());
      sinkRoleEClass.getESuperTypes().add(this.getProvidedRole());
      operationProvidedRoleEClass.getESuperTypes().add(this.getProvidedRole());
      infrastructureProvidedRoleEClass.getESuperTypes().add(this.getProvidedRole());
      completeComponentTypeEClass.getESuperTypes().add(this.getRepositoryComponent());
      providesComponentTypeEClass.getESuperTypes().add(this.getRepositoryComponent());
      compositeComponentEClass.getESuperTypes().add(theEntity_pc_pcPackage.getComposedProvidingRequiringEntity());
      compositeComponentEClass.getESuperTypes().add(this.getImplementationComponentType());
      primitiveDataTypeEClass.getESuperTypes().add(this.getDataType());
      collectionDataTypeEClass.getESuperTypes().add(theEntity_pc_pcPackage.getEntity());
      collectionDataTypeEClass.getESuperTypes().add(this.getDataType());
      compositeDataTypeEClass.getESuperTypes().add(theEntity_pc_pcPackage.getEntity());
      compositeDataTypeEClass.getESuperTypes().add(this.getDataType());
      innerDeclarationEClass.getESuperTypes().add(theEntity_pc_pcPackage.getNamedElement());
      roleEClass.getESuperTypes().add(theEntity_pc_pcPackage.getEntity());

      // Initialize classes and features; add operations and parameters
      initEClass(passiveResourceEClass, PassiveResource.class, "PassiveResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPassiveResource_Capacity_PassiveResource(), theCore_pc_pcPackage.getPCMRandomVariable(), theCore_pc_pcPackage.getPCMRandomVariable_PassiveResource_capacity_PCMRandomVariable(), "capacity_PassiveResource", null, 0, 1, PassiveResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPassiveResource_BasicComponent_PassiveResource(), this.getBasicComponent(), this.getBasicComponent_PassiveResource_BasicComponent(), "basicComponent_PassiveResource", null, 0, 1, PassiveResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getPassiveResource_ResourceTimeoutFailureType__PassiveResource(), theReliability_pc_pcPackage.getResourceTimeoutFailureType(), theReliability_pc_pcPackage.getResourceTimeoutFailureType_PassiveResource__ResourceTimeoutFailureType(), "resourceTimeoutFailureType__PassiveResource", null, 0, 1, PassiveResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(basicComponentEClass, BasicComponent.class, "BasicComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getBasicComponent_ServiceEffectSpecifications__BasicComponent(), theSeff_pc_pcPackage.getServiceEffectSpecification(), theSeff_pc_pcPackage.getServiceEffectSpecification_BasicComponent_ServiceEffectSpecification(), "serviceEffectSpecifications__BasicComponent", null, 0, -1, BasicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getBasicComponent_PassiveResource_BasicComponent(), this.getPassiveResource(), this.getPassiveResource_BasicComponent_PassiveResource(), "passiveResource_BasicComponent", null, 0, -1, BasicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(basicComponentEClass, ecorePackage.getEBoolean(), "NoSeffTypeUsedTwice", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(basicComponentEClass, ecorePackage.getEBoolean(), "ProvideSameInterfacesAsImplementationType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(basicComponentEClass, ecorePackage.getEBoolean(), "RequireSameInterfacesAsImplementationType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(implementationComponentTypeEClass, ImplementationComponentType.class, "ImplementationComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getImplementationComponentType_ParentCompleteComponentTypes(), this.getCompleteComponentType(), null, "parentCompleteComponentTypes", null, 0, -1, ImplementationComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType(), theParameter_pc_pcPackage.getVariableUsage(), null, "componentParameterUsage_ImplementationComponentType", null, 0, -1, ImplementationComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getImplementationComponentType_ComponentType(), this.getComponentType(), "componentType", "BUSINESS_COMPONENT", 1, 1, ImplementationComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(implementationComponentTypeEClass, ecorePackage.getEBoolean(), "RequiredInterfacesHaveToConformToCompleteType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(implementationComponentTypeEClass, ecorePackage.getEBoolean(), "providedInterfacesHaveToConformToCompleteType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(implementationComponentTypeEClass, ecorePackage.getEBoolean(), "ProvidedInterfaceHaveToConformToComponentType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(repositoryComponentEClass, RepositoryComponent.class, "RepositoryComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRepositoryComponent_Repository__RepositoryComponent(), this.getRepository(), this.getRepository_Components__Repository(), "repository__RepositoryComponent", null, 0, 1, RepositoryComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(providedRoleEClass, ProvidedRole.class, "ProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getProvidedRole_ProvidingEntity_ProvidedRole(), theEntity_pc_pcPackage.getInterfaceProvidingEntity(), theEntity_pc_pcPackage.getInterfaceProvidingEntity_ProvidedRoles_InterfaceProvidingEntity(), "providingEntity_ProvidedRole", null, 0, 1, ProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getParameter_DataType__Parameter(), this.getDataType(), null, "dataType__Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParameter_InfrastructureSignature__Parameter(), this.getInfrastructureSignature(), this.getInfrastructureSignature_Parameters__InfrastructureSignature(), "infrastructureSignature__Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParameter_OperationSignature__Parameter(), this.getOperationSignature(), this.getOperationSignature_Parameters__OperationSignature(), "operationSignature__Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParameter_EventType__Parameter(), this.getEventType(), this.getEventType_Parameter__EventType(), "eventType__Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getParameter_ParameterName(), ecorePackage.getEString(), "parameterName", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getParameter_Modifier__Parameter(), this.getParameterModifier(), "modifier__Parameter", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getParameter_ResourceSignature__Parameter(), theResourcetype_pc_pcPackage.getResourceSignature(), theResourcetype_pc_pcPackage.getResourceSignature_Parameter__ResourceSignature(), "resourceSignature__Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getDataType_Repository__DataType(), this.getRepository(), this.getRepository_DataTypes__Repository(), "repository__DataType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getRepository_RepositoryDescription(), ecorePackage.getEString(), "repositoryDescription", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRepository_Components__Repository(), this.getRepositoryComponent(), this.getRepositoryComponent_Repository__RepositoryComponent(), "components__Repository", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRepository_Interfaces__Repository(), this.getInterface(), this.getInterface_Repository__Interface(), "interfaces__Repository", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRepository_FailureTypes__Repository(), theReliability_pc_pcPackage.getFailureType(), theReliability_pc_pcPackage.getFailureType_Repository__FailureType(), "failureTypes__Repository", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRepository_DataTypes__Repository(), this.getDataType(), this.getDataType_Repository__DataType(), "dataTypes__Repository", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInterface_ParentInterfaces__Interface(), this.getInterface(), null, "parentInterfaces__Interface", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInterface_Protocols__Interface(), theProtocol_pc_pcPackage.getProtocol(), null, "protocols__Interface", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInterface_RequiredCharacterisations(), this.getRequiredCharacterisation(), this.getRequiredCharacterisation_Interface_RequiredCharacterisation(), "requiredCharacterisations", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInterface_Repository__Interface(), this.getRepository(), this.getRepository_Interfaces__Repository(), "repository__Interface", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(interfaceEClass, ecorePackage.getEBoolean(), "NoProtocolTypeIDUsedTwice", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(requiredCharacterisationEClass, RequiredCharacterisation.class, "RequiredCharacterisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getRequiredCharacterisation_Type(), theParameter_pc_pcPackage.getVariableCharacterisationType(), "type", null, 1, 1, RequiredCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRequiredCharacterisation_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, RequiredCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getRequiredCharacterisation_Interface_RequiredCharacterisation(), this.getInterface(), this.getInterface_RequiredCharacterisations(), "interface_RequiredCharacterisation", null, 0, 1, RequiredCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(eventGroupEClass, EventGroup.class, "EventGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEventGroup_EventTypes__EventGroup(), this.getEventType(), this.getEventType_EventGroup__EventType(), "eventTypes__EventGroup", null, 0, -1, EventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEventType_Parameter__EventType(), this.getParameter(), this.getParameter_EventType__Parameter(), "parameter__EventType", null, 0, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEventType_EventGroup__EventType(), this.getEventGroup(), this.getEventGroup_EventTypes__EventGroup(), "eventGroup__EventType", null, 0, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSignature_Exceptions__Signature(), this.getExceptionType(), null, "exceptions__Signature", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSignature_FailureType(), theReliability_pc_pcPackage.getFailureType(), null, "failureType", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(exceptionTypeEClass, ExceptionType.class, "ExceptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getExceptionType_ExceptionName(), ecorePackage.getEString(), "exceptionName", null, 1, 1, ExceptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getExceptionType_ExceptionMessage(), ecorePackage.getEString(), "exceptionMessage", null, 1, 1, ExceptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(infrastructureSignatureEClass, InfrastructureSignature.class, "InfrastructureSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInfrastructureSignature_Parameters__InfrastructureSignature(), this.getParameter(), this.getParameter_InfrastructureSignature__Parameter(), "parameters__InfrastructureSignature", null, 0, -1, InfrastructureSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature(), this.getInfrastructureInterface(), this.getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface(), "infrastructureInterface__InfrastructureSignature", null, 0, 1, InfrastructureSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(infrastructureInterfaceEClass, InfrastructureInterface.class, "InfrastructureInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface(), this.getInfrastructureSignature(), this.getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature(), "infrastructureSignatures__InfrastructureInterface", null, 0, -1, InfrastructureInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(infrastructureRequiredRoleEClass, InfrastructureRequiredRole.class, "InfrastructureRequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole(), this.getInfrastructureInterface(), null, "requiredInterface__InfrastructureRequiredRole", null, 0, 1, InfrastructureRequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(requiredRoleEClass, RequiredRole.class, "RequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRequiredRole_RequiringEntity_RequiredRole(), theEntity_pc_pcPackage.getInterfaceRequiringEntity(), theEntity_pc_pcPackage.getInterfaceRequiringEntity_RequiredRoles_InterfaceRequiringEntity(), "requiringEntity_RequiredRole", null, 0, 1, RequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(operationSignatureEClass, OperationSignature.class, "OperationSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getOperationSignature_Interface__OperationSignature(), this.getOperationInterface(), this.getOperationInterface_Signatures__OperationInterface(), "interface__OperationSignature", null, 0, 1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getOperationSignature_Parameters__OperationSignature(), this.getParameter(), this.getParameter_OperationSignature__Parameter(), "parameters__OperationSignature", null, 0, -1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getOperationSignature_ReturnType__OperationSignature(), this.getDataType(), null, "returnType__OperationSignature", null, 0, 1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(operationSignatureEClass, ecorePackage.getEBoolean(), "ParameterNamesHaveToBeUniqueForASignature", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(operationInterfaceEClass, OperationInterface.class, "OperationInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getOperationInterface_Signatures__OperationInterface(), this.getOperationSignature(), this.getOperationSignature_Interface__OperationSignature(), "signatures__OperationInterface", null, 0, -1, OperationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(operationInterfaceEClass, ecorePackage.getEBoolean(), "SignaturesHaveToBeUniqueForAnInterface", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(operationRequiredRoleEClass, OperationRequiredRole.class, "OperationRequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getOperationRequiredRole_RequiredInterface__OperationRequiredRole(), this.getOperationInterface(), null, "requiredInterface__OperationRequiredRole", null, 0, 1, OperationRequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(sourceRoleEClass, SourceRole.class, "SourceRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSourceRole_EventGroup__SourceRole(), this.getEventGroup(), null, "eventGroup__SourceRole", null, 0, 1, SourceRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(sinkRoleEClass, SinkRole.class, "SinkRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSinkRole_EventGroup__SinkRole(), this.getEventGroup(), null, "eventGroup__SinkRole", null, 0, 1, SinkRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(operationProvidedRoleEClass, OperationProvidedRole.class, "OperationProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getOperationProvidedRole_ProvidedInterface__OperationProvidedRole(), this.getOperationInterface(), null, "providedInterface__OperationProvidedRole", null, 0, 1, OperationProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(infrastructureProvidedRoleEClass, InfrastructureProvidedRole.class, "InfrastructureProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole(), this.getInfrastructureInterface(), null, "providedInterface__InfrastructureProvidedRole", null, 0, 1, InfrastructureProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(completeComponentTypeEClass, CompleteComponentType.class, "CompleteComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCompleteComponentType_ParentProvidesComponentTypes(), this.getProvidesComponentType(), null, "parentProvidesComponentTypes", null, 0, -1, CompleteComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(completeComponentTypeEClass, ecorePackage.getEBoolean(), "AtLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(completeComponentTypeEClass, ecorePackage.getEBoolean(), "providedInterfacesHaveToConformToProvidedType2", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(providesComponentTypeEClass, ProvidesComponentType.class, "ProvidesComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = addEOperation(providesComponentTypeEClass, ecorePackage.getEBoolean(), "AtLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(compositeComponentEClass, CompositeComponent.class, "CompositeComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = addEOperation(compositeComponentEClass, ecorePackage.getEBoolean(), "ProvideSameInterfaces", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(compositeComponentEClass, ecorePackage.getEBoolean(), "RequireSameInterfaces", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getPrimitiveDataType_Type(), this.getPrimitiveTypeEnum(), "type", null, 1, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(collectionDataTypeEClass, CollectionDataType.class, "CollectionDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCollectionDataType_InnerType_CollectionDataType(), this.getDataType(), null, "innerType_CollectionDataType", null, 0, 1, CollectionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(compositeDataTypeEClass, CompositeDataType.class, "CompositeDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCompositeDataType_ParentType_CompositeDataType(), this.getCompositeDataType(), null, "parentType_CompositeDataType", null, 0, -1, CompositeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getCompositeDataType_InnerDeclaration_CompositeDataType(), this.getInnerDeclaration(), this.getInnerDeclaration_CompositeDataType_InnerDeclaration(), "innerDeclaration_CompositeDataType", null, 0, -1, CompositeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(innerDeclarationEClass, InnerDeclaration.class, "InnerDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInnerDeclaration_Datatype_InnerDeclaration(), this.getDataType(), null, "datatype_InnerDeclaration", null, 0, 1, InnerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getInnerDeclaration_CompositeDataType_InnerDeclaration(), this.getCompositeDataType(), this.getCompositeDataType_InnerDeclaration_CompositeDataType(), "compositeDataType_InnerDeclaration", null, 0, 1, InnerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      // Initialize enums and add enum literals
      initEEnum(parameterModifierEEnum, ParameterModifier.class, "ParameterModifier");
      addEEnumLiteral(parameterModifierEEnum, ParameterModifier.NONE);
      addEEnumLiteral(parameterModifierEEnum, ParameterModifier.IN);
      addEEnumLiteral(parameterModifierEEnum, ParameterModifier.OUT);
      addEEnumLiteral(parameterModifierEEnum, ParameterModifier.INOUT);

      initEEnum(componentTypeEEnum, ComponentType.class, "ComponentType");
      addEEnumLiteral(componentTypeEEnum, ComponentType.BUSINESS_COMPONENT);
      addEEnumLiteral(componentTypeEEnum, ComponentType.INFRASTRUCTURE_COMPONENT);

      initEEnum(primitiveTypeEnumEEnum, PrimitiveTypeEnum.class, "PrimitiveTypeEnum");
      addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT);
      addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.STRING);
      addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BOOL);
      addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.DOUBLE);
      addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.CHAR);
      addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTE);
      addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.LONG);

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
        (basicComponentEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.serviceEffectSpecifications__BasicComponent->forAll(p1, p2 |\r\n  p1 <> p2 implies (p1.describedService__SEFF = p2.describedService__SEFF implies p1.seffTypeID <> p2.seffTypeID))"
         });				
      addAnnotation
        (basicComponentEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "-- BC has to provide the same interfaces like the implementationComponentType (if set) #\r\nif\r\n\t -- apply constraint only for non-empty ImplementationComponentTypes of a BC #\r\n\tself.parentCompleteComponentTypes->notEmpty()\r\nthen\r\n\t--own interface IDs:\r\n    self.providedRoles_InterfaceProvidingEntity->collect(pr : ProvidedRole | pr.providingEntity_ProvidedRole.id)->asSet()\r\n    =\r\n    --complete type interface IDs:\r\n    self.parentCompleteComponentTypes->collect(pr | pr.providedRoles_InterfaceProvidingEntity.providingEntity_ProvidedRole.id)->asSet()\r\nelse\r\n\ttrue\r\nendif"
         });				
      addAnnotation
        (basicComponentEClass.getEOperations().get(2), 
         source, 
         new String[] {
          "body", "-- BC has to require the same interfaces like the implementationComponentType (if set) #\r\nif\r\n\t -- apply constraint only for non-empty ImplementationComponentTypes of a BC #\r\n\tself.parentCompleteComponentTypes->notEmpty()\r\nthen\r\n\t--own interface IDs:\r\n    self.requiredRoles_InterfaceRequiringEntity->select(rr |rr.oclIsTypeOf(OperationRequiredRole))->collect(rr | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole.id)->asSet()\r\n    =\r\n    --complete type interface IDs:\r\n    self.parentCompleteComponentTypes.requiredRoles_InterfaceRequiringEntity->select(rr |rr.oclIsTypeOf(OperationRequiredRole))->collect(rr | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole.id)->asSet()\r\nelse\r\n\ttrue\r\nendif"
         });							
      addAnnotation
        (implementationComponentTypeEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "-- ImplementationTypes required Interfaces have to be a subset\r\n-- of CompleteComponentType required Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \'lpar2005.pdf\' (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc1 : Bag(Interface) = Bag{} |\r\n--\t\tacc1->union(pt.requiredRoles->iterate(r : RequiredRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc2->union(r.requiredInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t\t))\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc3 : Bag(Interface) = Bag{} |\r\n--\t\tacc3->union(pt.requiredRoles->iterate(r : RequiredRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc4->union(r.requiredInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t\t))\r\n--\t)->union( -- union with anchestors found in former recursion #\r\n--\t\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc5 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc5->union(pt.requiredRoles->iterate(r : RequiredRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\t\tacc6->union(r.requiredInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t\t))\r\n--\t\t)\r\n--\t) in\r\n-- Directly required interfaces need to be a subset of required anchestorInterfaces of Supertype #\r\n--anchestorInterfaces.identifier.id->includesAll(\r\n--\tself.requiredRoles->iterate(p : RequiredRole; acc7 : Bag(String) = Bag{} |\r\n--\t\tacc7->union(p.requiredInterface.identifier.id->asBag())\r\n--\t)\t\r\n--)\r\ntrue"
         });				
      addAnnotation
        (implementationComponentTypeEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "-- ### EXACT COPY FROM ABOVE ###\r\n-- ImplementationComponentTypes provided Interfaces have to be a superset\r\n-- of CompleteComponentType provided Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \'lpar2005.pdf\' (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\tacc2->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\tacc4->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t)->union( -- union with anchestors found in former recursion #\r\n--\t\tself.providedRoles->iterate(r : ProvidedRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc6->union(r.providedInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t)\r\n--\t) in\r\n\t-- Directly provided anchestorInterfaces need to be a superset of provided interfaces of Supertype #\r\n--\tanchestorInterfaces.identifier.id->includesAll(\r\n--\t\tself.parentProvidesComponentTypes->iterate(pt : ProvidesComponentType; acc1 : Bag(String) = Bag{} |\r\n--\t\t\tpt.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(String) = Bag{} |\r\n--\t\t\t\tacc2->union(r.providedInterface.identifier.id->asBag()) -- asBag required to allow Set operations #\r\n--\t\t\t)\r\n--\t\t)\r\n--\t)\r\ntrue"
         });				
      addAnnotation
        (implementationComponentTypeEClass.getEOperations().get(2), 
         source, 
         new String[] {
          "body", "if self.componentType = ComponentType::INFRASTRUCTURE_COMPONENT then\r\n\tself.providedRoles_InterfaceProvidingEntity->select(role | role.oclIsTypeOf(OperationInterface) or role.oclIsTypeOf(EventGroup))->size() = 0\r\nelse if self.componentType = ComponentType::BUSINESS_COMPONENT then\r\n\tself.providedRoles_InterfaceProvidingEntity->select(role | role.oclIsTypeOf(InfrastructureInterface))->size() = 0\r\nelse\r\n\t1 = 0\r\nendif\r\nendif"
         });																						
      addAnnotation
        (interfaceEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.protocols__Interface->forAll(p1, p2 |\r\np1.protocolTypeID <> p2.protocolTypeID)\r\n"
         });																				
      addAnnotation
        (operationSignatureEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.parameters__OperationSignature->isUnique(p : Parameter |\r\n\tp.parameterName\r\n)"
         });								
      addAnnotation
        (operationInterfaceEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "-- full signature has to be unique \r\n-- (use of ocl-tupels) #\r\nlet sigs : Bag(\r\n\t-- parameters: Sequence of DataType, NOT name #\r\n\t-- exceptions have not to be considered #\r\n\tTuple(returnType : DataType, serviceName : String, parameters : Sequence(DataType) ) \r\n) = \r\nself.signatures__OperationInterface->collect(sig : OperationSignature |\r\n\tTuple{\r\n\t\treturnType : DataType = sig.returnType__OperationSignature,\r\n\t\tserviceName : String = sig.entityName,\r\n\t\tparameters : Sequence(DataType) = sig.parameters__OperationSignature.dataType__Parameter\r\n\t}\r\n)\r\nin\r\nsigs->isUnique(s|s)"
         });																
      addAnnotation
        (completeComponentTypeEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "(\r\n\tself.oclIsTypeOf(CompleteComponentType)\r\n\tor\r\n\tself.oclIsTypeOf(ImplementationComponentType)\r\n\tor\r\n\tself.oclIsTypeOf(CompositeComponent)\r\n\tor\r\n\tself.oclIsTypeOf(BasicComponent)\r\n)\r\nimplies\r\n(\r\n\tself.providedRoles_InterfaceProvidingEntity->size() >= 1\r\n\tor\r\n\tself.requiredRoles_InterfaceRequiringEntity->size() >= 1\r\n)"
         });				
      addAnnotation
        (completeComponentTypeEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "-- CompleteTypes provided Interfaces have to be a superset\r\n-- of ProvidesComponentType provided Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \"lpar2005.pdf\" (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\tacc2->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\tacc4->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t)->union( -- union with anchestors found in former recursion #\r\n--\t\tself.providedRoles->iterate(r : ProvidedRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc6->union(r.providedInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t)\r\n--\t) in\r\n--\t-- Directly provided anchestorInterfaces need to be a superset of provided interfaces of Supertype #\r\n--\tanchestorInterfaces.identifier.id->includesAll(\r\n--\t\tself.parentProvidesComponentTypes->iterate(pt : ProvidesComponentType; acc1 : Bag(String) = Bag{} |\r\n--\t\t\tpt.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(String) = Bag{} |\r\n--\t\t\t\tacc2->union(r.providedInterface.identifier.id->asBag()) -- asBag required to allow Set operations #\r\n--\t\t\t)\r\n--\t\t)\r\n--\t)\r\ntrue"
         });					
      addAnnotation
        (providesComponentTypeEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.oclIsTypeOf(ProvidesComponentType)\r\nimplies\r\nself.providedRoles_InterfaceProvidingEntity->size() >= 1"
         });					
      addAnnotation
        (compositeComponentEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "-- CC has to provide the same interfaces like the implementationComponentType (if set) (same OCL code like BC)#\r\nif\r\n\t -- apply constraint only for non-empty ImplementationComponentTypes of a BC #\r\n\tself.parentCompleteComponentTypes->notEmpty()\r\nthen\r\n\t--own interface IDs:\r\n    self.providedRoles_InterfaceProvidingEntity->select(pr|pr.oclIsTypeOf(OperationProvidedRole))->collect(pr : ProvidedRole | pr.oclAsType (OperationProvidedRole).providedInterface__OperationProvidedRole.id)->asSet()\r\n    =\r\n    --complete type interface IDs:\r\n    self.parentCompleteComponentTypes.providedRoles_InterfaceProvidingEntity->select(pr|pr.oclIsTypeOf(OperationProvidedRole))->collect(pr : ProvidedRole | pr.oclAsType (OperationProvidedRole).providedInterface__OperationProvidedRole.id)->asSet()\r\nelse\r\n\ttrue\r\nendif"
         });				
      addAnnotation
        (compositeComponentEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "-- CC has to require the same interfaces like the implementationComponentType (if set) (same OCL code like BC) #\r\nif\r\n\t -- apply constraint only for non-empty ImplementationComponentTypes of a BC #\r\n\tself.parentCompleteComponentTypes->notEmpty()\r\nthen\r\n\t--own interface IDs:\r\n    self.requiredRoles_InterfaceRequiringEntity->select(pr|pr.oclIsTypeOf(OperationRequiredRole))->collect(rr : RequiredRole | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole.id)->asSet()\r\n    =\r\n    --complete type interface IDs:\r\n    self.parentCompleteComponentTypes.requiredRoles_InterfaceRequiringEntity->select(pr|pr.oclIsTypeOf(OperationRequiredRole))->collect(rr : RequiredRole | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole.id)->asSet()\r\nelse\r\n\ttrue\r\nendif"
         });													
   }

} //Repository_pc_pcPackageImpl
