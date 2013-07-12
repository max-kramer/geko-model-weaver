/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The main package contributing component types and interfaces.
 * <!-- end-model-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avFactory
 * @model kind="package"
 * @generated
 */
public interface Repository_pc_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "repository_pc_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/Repository/5.0_pointcut_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "repository_pc_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Repository_pc_avPackage eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PassiveResourceImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getPassiveResource()
    * @generated
    */
   int PASSIVE_RESOURCE = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PASSIVE_RESOURCE__ID = Entity_pc_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PASSIVE_RESOURCE__ENTITY_NAME = Entity_pc_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Capacity Passive Resource</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Basic Component Passive Resource</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Resource Timeout Failure Type Passive Resource</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Passive Resource</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PASSIVE_RESOURCE_FEATURE_COUNT = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RepositoryComponentImpl <em>Repository Component</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RepositoryComponentImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRepositoryComponent()
    * @generated
    */
   int REPOSITORY_COMPONENT = 3;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY_COMPONENT__ID = Entity_pc_avPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY_COMPONENT__ENTITY_NAME = Entity_pc_avPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = Entity_pc_avPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

   /**
    * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = Entity_pc_avPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = Entity_pc_avPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT = Entity_pc_avPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Repository Component</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY_COMPONENT_FEATURE_COUNT = Entity_pc_avPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ImplementationComponentTypeImpl <em>Implementation Component Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ImplementationComponentTypeImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getImplementationComponentType()
    * @generated
    */
   int IMPLEMENTATION_COMPONENT_TYPE = 2;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE__ID = REPOSITORY_COMPONENT__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE__ENTITY_NAME = REPOSITORY_COMPONENT__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

   /**
    * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE__REPOSITORY_REPOSITORY_COMPONENT = REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;

   /**
    * The feature id for the '<em><b>Parent Complete Component Types</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES = REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = REPOSITORY_COMPONENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Component Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE = REPOSITORY_COMPONENT_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Implementation Component Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT = REPOSITORY_COMPONENT_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.BasicComponentImpl <em>Basic Component</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.BasicComponentImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getBasicComponent()
    * @generated
    */
   int BASIC_COMPONENT = 1;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__ID = IMPLEMENTATION_COMPONENT_TYPE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__ENTITY_NAME = IMPLEMENTATION_COMPONENT_TYPE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

   /**
    * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = IMPLEMENTATION_COMPONENT_TYPE__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT = IMPLEMENTATION_COMPONENT_TYPE__REPOSITORY_REPOSITORY_COMPONENT;

   /**
    * The feature id for the '<em><b>Parent Complete Component Types</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES = IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES;

   /**
    * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE;

   /**
    * The feature id for the '<em><b>Component Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__COMPONENT_TYPE = IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE;

   /**
    * The feature id for the '<em><b>Service Effect Specifications Basic Component</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT = IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Passive Resource Basic Component</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT = IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Basic Component</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASIC_COMPONENT_FEATURE_COUNT = IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RoleImpl <em>Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RoleImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRole()
    * @generated
    */
   int ROLE = 32;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROLE__ID = Entity_pc_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROLE__ENTITY_NAME = Entity_pc_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The number of structural features of the '<em>Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROLE_FEATURE_COUNT = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ProvidedRoleImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getProvidedRole()
    * @generated
    */
   int PROVIDED_ROLE = 4;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDED_ROLE__ID = ROLE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDED_ROLE__ENTITY_NAME = ROLE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = ROLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Provided Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ParameterImpl <em>Parameter</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ParameterImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getParameter()
    * @generated
    */
   int PARAMETER = 5;

   /**
    * The feature id for the '<em><b>Data Type Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__DATA_TYPE_PARAMETER = 0;

   /**
    * The feature id for the '<em><b>Infrastructure Signature Parameter</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER = 1;

   /**
    * The feature id for the '<em><b>Operation Signature Parameter</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__OPERATION_SIGNATURE_PARAMETER = 2;

   /**
    * The feature id for the '<em><b>Event Type Parameter</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__EVENT_TYPE_PARAMETER = 3;

   /**
    * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__PARAMETER_NAME = 4;

   /**
    * The feature id for the '<em><b>Modifier Parameter</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__MODIFIER_PARAMETER = 5;

   /**
    * The feature id for the '<em><b>Resource Signature Parameter</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__RESOURCE_SIGNATURE_PARAMETER = 6;

   /**
    * The number of structural features of the '<em>Parameter</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_FEATURE_COUNT = 7;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.DataTypeImpl <em>Data Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.DataTypeImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getDataType()
    * @generated
    */
   int DATA_TYPE = 6;

   /**
    * The feature id for the '<em><b>Repository Data Type</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_TYPE__REPOSITORY_DATA_TYPE = 0;

   /**
    * The number of structural features of the '<em>Data Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_TYPE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RepositoryImpl <em>Repository</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RepositoryImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRepository()
    * @generated
    */
   int REPOSITORY = 7;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY__ID = Entity_pc_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY__ENTITY_NAME = Entity_pc_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Repository Description</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY__REPOSITORY_DESCRIPTION = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Components Repository</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY__COMPONENTS_REPOSITORY = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Interfaces Repository</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY__INTERFACES_REPOSITORY = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Failure Types Repository</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY__FAILURE_TYPES_REPOSITORY = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Data Types Repository</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY__DATA_TYPES_REPOSITORY = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>Repository</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPOSITORY_FEATURE_COUNT = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 5;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InterfaceImpl <em>Interface</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InterfaceImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInterface()
    * @generated
    */
   int INTERFACE = 8;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INTERFACE__ID = Entity_pc_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INTERFACE__ENTITY_NAME = Entity_pc_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INTERFACE__PARENT_INTERFACES_INTERFACE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INTERFACE__PROTOCOLS_INTERFACE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INTERFACE__REQUIRED_CHARACTERISATIONS = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Repository Interface</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INTERFACE__REPOSITORY_INTERFACE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Interface</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INTERFACE_FEATURE_COUNT = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredCharacterisationImpl <em>Required Characterisation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredCharacterisationImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRequiredCharacterisation()
    * @generated
    */
   int REQUIRED_CHARACTERISATION = 9;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REQUIRED_CHARACTERISATION__TYPE = 0;

   /**
    * The feature id for the '<em><b>Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REQUIRED_CHARACTERISATION__PARAMETER = 1;

   /**
    * The feature id for the '<em><b>Interface Required Characterisation</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION = 2;

   /**
    * The number of structural features of the '<em>Required Characterisation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REQUIRED_CHARACTERISATION_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.EventGroupImpl <em>Event Group</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.EventGroupImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getEventGroup()
    * @generated
    */
   int EVENT_GROUP = 10;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_GROUP__ID = INTERFACE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_GROUP__ENTITY_NAME = INTERFACE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_GROUP__PARENT_INTERFACES_INTERFACE = INTERFACE__PARENT_INTERFACES_INTERFACE;

   /**
    * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_GROUP__PROTOCOLS_INTERFACE = INTERFACE__PROTOCOLS_INTERFACE;

   /**
    * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_GROUP__REQUIRED_CHARACTERISATIONS = INTERFACE__REQUIRED_CHARACTERISATIONS;

   /**
    * The feature id for the '<em><b>Repository Interface</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_GROUP__REPOSITORY_INTERFACE = INTERFACE__REPOSITORY_INTERFACE;

   /**
    * The feature id for the '<em><b>Event Types Event Group</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_GROUP__EVENT_TYPES_EVENT_GROUP = INTERFACE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Event Group</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_GROUP_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SignatureImpl <em>Signature</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SignatureImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getSignature()
    * @generated
    */
   int SIGNATURE = 12;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SIGNATURE__ID = Entity_pc_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SIGNATURE__ENTITY_NAME = Entity_pc_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Exceptions Signature</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SIGNATURE__EXCEPTIONS_SIGNATURE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Failure Type</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SIGNATURE__FAILURE_TYPE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Signature</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SIGNATURE_FEATURE_COUNT = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.EventTypeImpl <em>Event Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.EventTypeImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getEventType()
    * @generated
    */
   int EVENT_TYPE = 11;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_TYPE__ID = SIGNATURE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_TYPE__ENTITY_NAME = SIGNATURE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Exceptions Signature</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_TYPE__EXCEPTIONS_SIGNATURE = SIGNATURE__EXCEPTIONS_SIGNATURE;

   /**
    * The feature id for the '<em><b>Failure Type</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_TYPE__FAILURE_TYPE = SIGNATURE__FAILURE_TYPE;

   /**
    * The feature id for the '<em><b>Parameter Event Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_TYPE__PARAMETER_EVENT_TYPE = SIGNATURE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Event Group Event Type</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_TYPE__EVENT_GROUP_EVENT_TYPE = SIGNATURE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Event Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EVENT_TYPE_FEATURE_COUNT = SIGNATURE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ExceptionTypeImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getExceptionType()
    * @generated
    */
   int EXCEPTION_TYPE = 13;

   /**
    * The feature id for the '<em><b>Exception Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_TYPE__EXCEPTION_NAME = 0;

   /**
    * The feature id for the '<em><b>Exception Message</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_TYPE__EXCEPTION_MESSAGE = 1;

   /**
    * The number of structural features of the '<em>Exception Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_TYPE_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureSignatureImpl <em>Infrastructure Signature</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureSignatureImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInfrastructureSignature()
    * @generated
    */
   int INFRASTRUCTURE_SIGNATURE = 14;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_SIGNATURE__ID = SIGNATURE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_SIGNATURE__ENTITY_NAME = SIGNATURE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Exceptions Signature</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_SIGNATURE__EXCEPTIONS_SIGNATURE = SIGNATURE__EXCEPTIONS_SIGNATURE;

   /**
    * The feature id for the '<em><b>Failure Type</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_SIGNATURE__FAILURE_TYPE = SIGNATURE__FAILURE_TYPE;

   /**
    * The feature id for the '<em><b>Parameters Infrastructure Signature</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE = SIGNATURE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Infrastructure Interface Infrastructure Signature</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE = SIGNATURE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Infrastructure Signature</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_SIGNATURE_FEATURE_COUNT = SIGNATURE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureInterfaceImpl <em>Infrastructure Interface</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureInterfaceImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInfrastructureInterface()
    * @generated
    */
   int INFRASTRUCTURE_INTERFACE = 15;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_INTERFACE__ID = INTERFACE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_INTERFACE__ENTITY_NAME = INTERFACE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_INTERFACE__PARENT_INTERFACES_INTERFACE = INTERFACE__PARENT_INTERFACES_INTERFACE;

   /**
    * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_INTERFACE__PROTOCOLS_INTERFACE = INTERFACE__PROTOCOLS_INTERFACE;

   /**
    * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_INTERFACE__REQUIRED_CHARACTERISATIONS = INTERFACE__REQUIRED_CHARACTERISATIONS;

   /**
    * The feature id for the '<em><b>Repository Interface</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_INTERFACE__REPOSITORY_INTERFACE = INTERFACE__REPOSITORY_INTERFACE;

   /**
    * The feature id for the '<em><b>Infrastructure Signatures Infrastructure Interface</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE = INTERFACE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Infrastructure Interface</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredRoleImpl <em>Required Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredRoleImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRequiredRole()
    * @generated
    */
   int REQUIRED_ROLE = 17;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REQUIRED_ROLE__ID = ROLE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REQUIRED_ROLE__ENTITY_NAME = ROLE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = ROLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Required Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REQUIRED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureRequiredRoleImpl <em>Infrastructure Required Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureRequiredRoleImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInfrastructureRequiredRole()
    * @generated
    */
   int INFRASTRUCTURE_REQUIRED_ROLE = 16;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_REQUIRED_ROLE__ID = REQUIRED_ROLE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_REQUIRED_ROLE__ENTITY_NAME = REQUIRED_ROLE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE;

   /**
    * The feature id for the '<em><b>Required Interface Infrastructure Required Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE = REQUIRED_ROLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Infrastructure Required Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_REQUIRED_ROLE_FEATURE_COUNT = REQUIRED_ROLE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationSignatureImpl <em>Operation Signature</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationSignatureImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getOperationSignature()
    * @generated
    */
   int OPERATION_SIGNATURE = 18;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_SIGNATURE__ID = SIGNATURE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_SIGNATURE__ENTITY_NAME = SIGNATURE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Exceptions Signature</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_SIGNATURE__EXCEPTIONS_SIGNATURE = SIGNATURE__EXCEPTIONS_SIGNATURE;

   /**
    * The feature id for the '<em><b>Failure Type</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_SIGNATURE__FAILURE_TYPE = SIGNATURE__FAILURE_TYPE;

   /**
    * The feature id for the '<em><b>Interface Operation Signature</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE = SIGNATURE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Parameters Operation Signature</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE = SIGNATURE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Return Type Operation Signature</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE = SIGNATURE_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Operation Signature</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_SIGNATURE_FEATURE_COUNT = SIGNATURE_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationInterfaceImpl <em>Operation Interface</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationInterfaceImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getOperationInterface()
    * @generated
    */
   int OPERATION_INTERFACE = 19;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_INTERFACE__ID = INTERFACE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_INTERFACE__ENTITY_NAME = INTERFACE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_INTERFACE__PARENT_INTERFACES_INTERFACE = INTERFACE__PARENT_INTERFACES_INTERFACE;

   /**
    * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_INTERFACE__PROTOCOLS_INTERFACE = INTERFACE__PROTOCOLS_INTERFACE;

   /**
    * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_INTERFACE__REQUIRED_CHARACTERISATIONS = INTERFACE__REQUIRED_CHARACTERISATIONS;

   /**
    * The feature id for the '<em><b>Repository Interface</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_INTERFACE__REPOSITORY_INTERFACE = INTERFACE__REPOSITORY_INTERFACE;

   /**
    * The feature id for the '<em><b>Signatures Operation Interface</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE = INTERFACE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Operation Interface</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationRequiredRoleImpl <em>Operation Required Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationRequiredRoleImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getOperationRequiredRole()
    * @generated
    */
   int OPERATION_REQUIRED_ROLE = 20;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_REQUIRED_ROLE__ID = REQUIRED_ROLE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_REQUIRED_ROLE__ENTITY_NAME = REQUIRED_ROLE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE;

   /**
    * The feature id for the '<em><b>Required Interface Operation Required Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE = REQUIRED_ROLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Operation Required Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_REQUIRED_ROLE_FEATURE_COUNT = REQUIRED_ROLE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SourceRoleImpl <em>Source Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SourceRoleImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getSourceRole()
    * @generated
    */
   int SOURCE_ROLE = 21;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SOURCE_ROLE__ID = REQUIRED_ROLE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SOURCE_ROLE__ENTITY_NAME = REQUIRED_ROLE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SOURCE_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE;

   /**
    * The feature id for the '<em><b>Event Group Source Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SOURCE_ROLE__EVENT_GROUP_SOURCE_ROLE = REQUIRED_ROLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Source Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SOURCE_ROLE_FEATURE_COUNT = REQUIRED_ROLE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SinkRoleImpl <em>Sink Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SinkRoleImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getSinkRole()
    * @generated
    */
   int SINK_ROLE = 22;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINK_ROLE__ID = PROVIDED_ROLE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINK_ROLE__ENTITY_NAME = PROVIDED_ROLE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINK_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE;

   /**
    * The feature id for the '<em><b>Event Group Sink Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINK_ROLE__EVENT_GROUP_SINK_ROLE = PROVIDED_ROLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Sink Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINK_ROLE_FEATURE_COUNT = PROVIDED_ROLE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationProvidedRoleImpl <em>Operation Provided Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationProvidedRoleImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getOperationProvidedRole()
    * @generated
    */
   int OPERATION_PROVIDED_ROLE = 23;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_PROVIDED_ROLE__ID = PROVIDED_ROLE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_PROVIDED_ROLE__ENTITY_NAME = PROVIDED_ROLE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE;

   /**
    * The feature id for the '<em><b>Provided Interface Operation Provided Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE = PROVIDED_ROLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Operation Provided Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_PROVIDED_ROLE_FEATURE_COUNT = PROVIDED_ROLE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureProvidedRoleImpl <em>Infrastructure Provided Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureProvidedRoleImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInfrastructureProvidedRole()
    * @generated
    */
   int INFRASTRUCTURE_PROVIDED_ROLE = 24;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_PROVIDED_ROLE__ID = PROVIDED_ROLE__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_PROVIDED_ROLE__ENTITY_NAME = PROVIDED_ROLE__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE;

   /**
    * The feature id for the '<em><b>Provided Interface Infrastructure Provided Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE = PROVIDED_ROLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Infrastructure Provided Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_PROVIDED_ROLE_FEATURE_COUNT = PROVIDED_ROLE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompleteComponentTypeImpl <em>Complete Component Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompleteComponentTypeImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getCompleteComponentType()
    * @generated
    */
   int COMPLETE_COMPONENT_TYPE = 25;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETE_COMPONENT_TYPE__ID = REPOSITORY_COMPONENT__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETE_COMPONENT_TYPE__ENTITY_NAME = REPOSITORY_COMPONENT__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETE_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

   /**
    * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETE_COMPONENT_TYPE__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETE_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETE_COMPONENT_TYPE__REPOSITORY_REPOSITORY_COMPONENT = REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;

   /**
    * The feature id for the '<em><b>Parent Provides Component Types</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES = REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Complete Component Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPLETE_COMPONENT_TYPE_FEATURE_COUNT = REPOSITORY_COMPONENT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ProvidesComponentTypeImpl <em>Provides Component Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ProvidesComponentTypeImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getProvidesComponentType()
    * @generated
    */
   int PROVIDES_COMPONENT_TYPE = 26;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDES_COMPONENT_TYPE__ID = REPOSITORY_COMPONENT__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDES_COMPONENT_TYPE__ENTITY_NAME = REPOSITORY_COMPONENT__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDES_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

   /**
    * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDES_COMPONENT_TYPE__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDES_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDES_COMPONENT_TYPE__REPOSITORY_REPOSITORY_COMPONENT = REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;

   /**
    * The number of structural features of the '<em>Provides Component Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROVIDES_COMPONENT_TYPE_FEATURE_COUNT = REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompositeComponentImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getCompositeComponent()
    * @generated
    */
   int COMPOSITE_COMPONENT = 27;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__ID = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__ENTITY_NAME = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Assembly Contexts Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;

   /**
    * The feature id for the '<em><b>Resource Required Delegation Connectors Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;

   /**
    * The feature id for the '<em><b>Event Channel Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__EVENT_CHANNEL_COMPOSED_STRUCTURE = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__EVENT_CHANNEL_COMPOSED_STRUCTURE;

   /**
    * The feature id for the '<em><b>Connectors Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__CONNECTORS_COMPOSED_STRUCTURE = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__CONNECTORS_COMPOSED_STRUCTURE;

   /**
    * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

   /**
    * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

   /**
    * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Parent Complete Component Types</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Component Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT__COMPONENT_TYPE = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Composite Component</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_COMPONENT_FEATURE_COUNT = Entity_pc_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PrimitiveDataTypeImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getPrimitiveDataType()
    * @generated
    */
   int PRIMITIVE_DATA_TYPE = 28;

   /**
    * The feature id for the '<em><b>Repository Data Type</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_DATA_TYPE__REPOSITORY_DATA_TYPE = DATA_TYPE__REPOSITORY_DATA_TYPE;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_DATA_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Primitive Data Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CollectionDataTypeImpl <em>Collection Data Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CollectionDataTypeImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getCollectionDataType()
    * @generated
    */
   int COLLECTION_DATA_TYPE = 29;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLECTION_DATA_TYPE__ID = Entity_pc_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLECTION_DATA_TYPE__ENTITY_NAME = Entity_pc_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Repository Data Type</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Inner Type Collection Data Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Collection Data Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COLLECTION_DATA_TYPE_FEATURE_COUNT = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompositeDataTypeImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getCompositeDataType()
    * @generated
    */
   int COMPOSITE_DATA_TYPE = 30;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_DATA_TYPE__ID = Entity_pc_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_DATA_TYPE__ENTITY_NAME = Entity_pc_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Repository Data Type</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_DATA_TYPE__REPOSITORY_DATA_TYPE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Parent Type Composite Data Type</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_DATA_TYPE__PARENT_TYPE_COMPOSITE_DATA_TYPE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Inner Declaration Composite Data Type</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_DATA_TYPE__INNER_DECLARATION_COMPOSITE_DATA_TYPE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Composite Data Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOSITE_DATA_TYPE_FEATURE_COUNT = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InnerDeclarationImpl <em>Inner Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InnerDeclarationImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInnerDeclaration()
    * @generated
    */
   int INNER_DECLARATION = 31;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INNER_DECLARATION__ENTITY_NAME = Entity_pc_avPackage.NAMED_ELEMENT__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Datatype Inner Declaration</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INNER_DECLARATION__DATATYPE_INNER_DECLARATION = Entity_pc_avPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Composite Data Type Inner Declaration</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION = Entity_pc_avPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Inner Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INNER_DECLARATION_FEATURE_COUNT = Entity_pc_avPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ParameterModifier <em>Parameter Modifier</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ParameterModifier
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getParameterModifier()
    * @generated
    */
   int PARAMETER_MODIFIER = 33;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ComponentType <em>Component Type</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ComponentType
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getComponentType()
    * @generated
    */
   int COMPONENT_TYPE = 34;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveTypeEnum <em>Primitive Type Enum</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveTypeEnum
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getPrimitiveTypeEnum()
    * @generated
    */
   int PRIMITIVE_TYPE_ENUM = 35;


   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PassiveResource <em>Passive Resource</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Passive Resource</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PassiveResource
    * @generated
    */
   EClass getPassiveResource();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PassiveResource#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Capacity Passive Resource</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PassiveResource#getCapacity_PassiveResource()
    * @see #getPassiveResource()
    * @generated
    */
   EReference getPassiveResource_Capacity_PassiveResource();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PassiveResource#getBasicComponent_PassiveResource <em>Basic Component Passive Resource</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Basic Component Passive Resource</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PassiveResource#getBasicComponent_PassiveResource()
    * @see #getPassiveResource()
    * @generated
    */
   EReference getPassiveResource_BasicComponent_PassiveResource();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PassiveResource#getResourceTimeoutFailureType__PassiveResource <em>Resource Timeout Failure Type Passive Resource</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Resource Timeout Failure Type Passive Resource</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PassiveResource#getResourceTimeoutFailureType__PassiveResource()
    * @see #getPassiveResource()
    * @generated
    */
   EReference getPassiveResource_ResourceTimeoutFailureType__PassiveResource();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.BasicComponent <em>Basic Component</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Basic Component</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.BasicComponent
    * @generated
    */
   EClass getBasicComponent();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.BasicComponent#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Service Effect Specifications Basic Component</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.BasicComponent#getServiceEffectSpecifications__BasicComponent()
    * @see #getBasicComponent()
    * @generated
    */
   EReference getBasicComponent_ServiceEffectSpecifications__BasicComponent();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.BasicComponent#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Passive Resource Basic Component</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.BasicComponent#getPassiveResource_BasicComponent()
    * @see #getBasicComponent()
    * @generated
    */
   EReference getBasicComponent_PassiveResource_BasicComponent();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ImplementationComponentType <em>Implementation Component Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Implementation Component Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ImplementationComponentType
    * @generated
    */
   EClass getImplementationComponentType();

   /**
    * Returns the meta object for the reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ImplementationComponentType#getParentCompleteComponentTypes <em>Parent Complete Component Types</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Parent Complete Component Types</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ImplementationComponentType#getParentCompleteComponentTypes()
    * @see #getImplementationComponentType()
    * @generated
    */
   EReference getImplementationComponentType_ParentCompleteComponentTypes();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ImplementationComponentType#getComponentParameterUsage_ImplementationComponentType <em>Component Parameter Usage Implementation Component Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Component Parameter Usage Implementation Component Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ImplementationComponentType#getComponentParameterUsage_ImplementationComponentType()
    * @see #getImplementationComponentType()
    * @generated
    */
   EReference getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ImplementationComponentType#getComponentType <em>Component Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Component Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ImplementationComponentType#getComponentType()
    * @see #getImplementationComponentType()
    * @generated
    */
   EAttribute getImplementationComponentType_ComponentType();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RepositoryComponent <em>Repository Component</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Repository Component</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RepositoryComponent
    * @generated
    */
   EClass getRepositoryComponent();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RepositoryComponent#getRepository__RepositoryComponent <em>Repository Repository Component</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Repository Repository Component</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RepositoryComponent#getRepository__RepositoryComponent()
    * @see #getRepositoryComponent()
    * @generated
    */
   EReference getRepositoryComponent_Repository__RepositoryComponent();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ProvidedRole <em>Provided Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Provided Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ProvidedRole
    * @generated
    */
   EClass getProvidedRole();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ProvidedRole#getProvidingEntity_ProvidedRole <em>Providing Entity Provided Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Providing Entity Provided Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ProvidedRole#getProvidingEntity_ProvidedRole()
    * @see #getProvidedRole()
    * @generated
    */
   EReference getProvidedRole_ProvidingEntity_ProvidedRole();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter <em>Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Parameter</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter
    * @generated
    */
   EClass getParameter();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getDataType__Parameter <em>Data Type Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Data Type Parameter</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getDataType__Parameter()
    * @see #getParameter()
    * @generated
    */
   EReference getParameter_DataType__Parameter();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getInfrastructureSignature__Parameter <em>Infrastructure Signature Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Infrastructure Signature Parameter</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getInfrastructureSignature__Parameter()
    * @see #getParameter()
    * @generated
    */
   EReference getParameter_InfrastructureSignature__Parameter();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getOperationSignature__Parameter <em>Operation Signature Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Operation Signature Parameter</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getOperationSignature__Parameter()
    * @see #getParameter()
    * @generated
    */
   EReference getParameter_OperationSignature__Parameter();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getEventType__Parameter <em>Event Type Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Event Type Parameter</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getEventType__Parameter()
    * @see #getParameter()
    * @generated
    */
   EReference getParameter_EventType__Parameter();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getParameterName <em>Parameter Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Parameter Name</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getParameterName()
    * @see #getParameter()
    * @generated
    */
   EAttribute getParameter_ParameterName();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getModifier__Parameter <em>Modifier Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Modifier Parameter</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getModifier__Parameter()
    * @see #getParameter()
    * @generated
    */
   EAttribute getParameter_Modifier__Parameter();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getResourceSignature__Parameter <em>Resource Signature Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Resource Signature Parameter</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter#getResourceSignature__Parameter()
    * @see #getParameter()
    * @generated
    */
   EReference getParameter_ResourceSignature__Parameter();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.DataType <em>Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Data Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.DataType
    * @generated
    */
   EClass getDataType();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.DataType#getRepository__DataType <em>Repository Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Repository Data Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.DataType#getRepository__DataType()
    * @see #getDataType()
    * @generated
    */
   EReference getDataType_Repository__DataType();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository <em>Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Repository</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository
    * @generated
    */
   EClass getRepository();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getRepositoryDescription <em>Repository Description</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Repository Description</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getRepositoryDescription()
    * @see #getRepository()
    * @generated
    */
   EAttribute getRepository_RepositoryDescription();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getComponents__Repository <em>Components Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Components Repository</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getComponents__Repository()
    * @see #getRepository()
    * @generated
    */
   EReference getRepository_Components__Repository();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getInterfaces__Repository <em>Interfaces Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Interfaces Repository</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getInterfaces__Repository()
    * @see #getRepository()
    * @generated
    */
   EReference getRepository_Interfaces__Repository();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getFailureTypes__Repository <em>Failure Types Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Failure Types Repository</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getFailureTypes__Repository()
    * @see #getRepository()
    * @generated
    */
   EReference getRepository_FailureTypes__Repository();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getDataTypes__Repository <em>Data Types Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Data Types Repository</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository#getDataTypes__Repository()
    * @see #getRepository()
    * @generated
    */
   EReference getRepository_DataTypes__Repository();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface <em>Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Interface</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface
    * @generated
    */
   EClass getInterface();

   /**
    * Returns the meta object for the reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface#getParentInterfaces__Interface <em>Parent Interfaces Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Parent Interfaces Interface</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface#getParentInterfaces__Interface()
    * @see #getInterface()
    * @generated
    */
   EReference getInterface_ParentInterfaces__Interface();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface#getProtocols__Interface <em>Protocols Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Protocols Interface</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface#getProtocols__Interface()
    * @see #getInterface()
    * @generated
    */
   EReference getInterface_Protocols__Interface();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface#getRequiredCharacterisations <em>Required Characterisations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Required Characterisations</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface#getRequiredCharacterisations()
    * @see #getInterface()
    * @generated
    */
   EReference getInterface_RequiredCharacterisations();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface#getRepository__Interface <em>Repository Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Repository Interface</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Interface#getRepository__Interface()
    * @see #getInterface()
    * @generated
    */
   EReference getInterface_Repository__Interface();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredCharacterisation <em>Required Characterisation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Required Characterisation</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredCharacterisation
    * @generated
    */
   EClass getRequiredCharacterisation();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredCharacterisation#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredCharacterisation#getType()
    * @see #getRequiredCharacterisation()
    * @generated
    */
   EAttribute getRequiredCharacterisation_Type();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredCharacterisation#getParameter <em>Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Parameter</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredCharacterisation#getParameter()
    * @see #getRequiredCharacterisation()
    * @generated
    */
   EReference getRequiredCharacterisation_Parameter();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredCharacterisation#getInterface_RequiredCharacterisation <em>Interface Required Characterisation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Interface Required Characterisation</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredCharacterisation#getInterface_RequiredCharacterisation()
    * @see #getRequiredCharacterisation()
    * @generated
    */
   EReference getRequiredCharacterisation_Interface_RequiredCharacterisation();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventGroup <em>Event Group</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Event Group</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventGroup
    * @generated
    */
   EClass getEventGroup();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventGroup#getEventTypes__EventGroup <em>Event Types Event Group</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Event Types Event Group</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventGroup#getEventTypes__EventGroup()
    * @see #getEventGroup()
    * @generated
    */
   EReference getEventGroup_EventTypes__EventGroup();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventType <em>Event Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Event Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventType
    * @generated
    */
   EClass getEventType();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventType#getParameter__EventType <em>Parameter Event Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Parameter Event Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventType#getParameter__EventType()
    * @see #getEventType()
    * @generated
    */
   EReference getEventType_Parameter__EventType();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventType#getEventGroup__EventType <em>Event Group Event Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Event Group Event Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.EventType#getEventGroup__EventType()
    * @see #getEventType()
    * @generated
    */
   EReference getEventType_EventGroup__EventType();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Signature <em>Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Signature</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Signature
    * @generated
    */
   EClass getSignature();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Signature#getExceptions__Signature <em>Exceptions Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Exceptions Signature</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Signature#getExceptions__Signature()
    * @see #getSignature()
    * @generated
    */
   EReference getSignature_Exceptions__Signature();

   /**
    * Returns the meta object for the reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Signature#getFailureType <em>Failure Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Failure Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Signature#getFailureType()
    * @see #getSignature()
    * @generated
    */
   EReference getSignature_FailureType();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ExceptionType <em>Exception Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Exception Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ExceptionType
    * @generated
    */
   EClass getExceptionType();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ExceptionType#getExceptionName <em>Exception Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Exception Name</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ExceptionType#getExceptionName()
    * @see #getExceptionType()
    * @generated
    */
   EAttribute getExceptionType_ExceptionName();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ExceptionType#getExceptionMessage <em>Exception Message</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Exception Message</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ExceptionType#getExceptionMessage()
    * @see #getExceptionType()
    * @generated
    */
   EAttribute getExceptionType_ExceptionMessage();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureSignature <em>Infrastructure Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Infrastructure Signature</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureSignature
    * @generated
    */
   EClass getInfrastructureSignature();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureSignature#getParameters__InfrastructureSignature <em>Parameters Infrastructure Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Parameters Infrastructure Signature</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureSignature#getParameters__InfrastructureSignature()
    * @see #getInfrastructureSignature()
    * @generated
    */
   EReference getInfrastructureSignature_Parameters__InfrastructureSignature();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Infrastructure Interface Infrastructure Signature</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature()
    * @see #getInfrastructureSignature()
    * @generated
    */
   EReference getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureInterface <em>Infrastructure Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Infrastructure Interface</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureInterface
    * @generated
    */
   EClass getInfrastructureInterface();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface <em>Infrastructure Signatures Infrastructure Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Infrastructure Signatures Infrastructure Interface</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface()
    * @see #getInfrastructureInterface()
    * @generated
    */
   EReference getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureRequiredRole <em>Infrastructure Required Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Infrastructure Required Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureRequiredRole
    * @generated
    */
   EClass getInfrastructureRequiredRole();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole <em>Required Interface Infrastructure Required Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Required Interface Infrastructure Required Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole()
    * @see #getInfrastructureRequiredRole()
    * @generated
    */
   EReference getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredRole <em>Required Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Required Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredRole
    * @generated
    */
   EClass getRequiredRole();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredRole#getRequiringEntity_RequiredRole <em>Requiring Entity Required Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Requiring Entity Required Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredRole#getRequiringEntity_RequiredRole()
    * @see #getRequiredRole()
    * @generated
    */
   EReference getRequiredRole_RequiringEntity_RequiredRole();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationSignature <em>Operation Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Operation Signature</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationSignature
    * @generated
    */
   EClass getOperationSignature();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationSignature#getInterface__OperationSignature <em>Interface Operation Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Interface Operation Signature</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationSignature#getInterface__OperationSignature()
    * @see #getOperationSignature()
    * @generated
    */
   EReference getOperationSignature_Interface__OperationSignature();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationSignature#getParameters__OperationSignature <em>Parameters Operation Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Parameters Operation Signature</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationSignature#getParameters__OperationSignature()
    * @see #getOperationSignature()
    * @generated
    */
   EReference getOperationSignature_Parameters__OperationSignature();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationSignature#getReturnType__OperationSignature <em>Return Type Operation Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Return Type Operation Signature</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationSignature#getReturnType__OperationSignature()
    * @see #getOperationSignature()
    * @generated
    */
   EReference getOperationSignature_ReturnType__OperationSignature();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationInterface <em>Operation Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Operation Interface</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationInterface
    * @generated
    */
   EClass getOperationInterface();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationInterface#getSignatures__OperationInterface <em>Signatures Operation Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Signatures Operation Interface</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationInterface#getSignatures__OperationInterface()
    * @see #getOperationInterface()
    * @generated
    */
   EReference getOperationInterface_Signatures__OperationInterface();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationRequiredRole <em>Operation Required Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Operation Required Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationRequiredRole
    * @generated
    */
   EClass getOperationRequiredRole();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationRequiredRole#getRequiredInterface__OperationRequiredRole <em>Required Interface Operation Required Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Required Interface Operation Required Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationRequiredRole#getRequiredInterface__OperationRequiredRole()
    * @see #getOperationRequiredRole()
    * @generated
    */
   EReference getOperationRequiredRole_RequiredInterface__OperationRequiredRole();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SourceRole <em>Source Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Source Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SourceRole
    * @generated
    */
   EClass getSourceRole();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SourceRole#getEventGroup__SourceRole <em>Event Group Source Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Event Group Source Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SourceRole#getEventGroup__SourceRole()
    * @see #getSourceRole()
    * @generated
    */
   EReference getSourceRole_EventGroup__SourceRole();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SinkRole <em>Sink Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Sink Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SinkRole
    * @generated
    */
   EClass getSinkRole();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SinkRole#getEventGroup__SinkRole <em>Event Group Sink Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Event Group Sink Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.SinkRole#getEventGroup__SinkRole()
    * @see #getSinkRole()
    * @generated
    */
   EReference getSinkRole_EventGroup__SinkRole();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationProvidedRole <em>Operation Provided Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Operation Provided Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationProvidedRole
    * @generated
    */
   EClass getOperationProvidedRole();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationProvidedRole#getProvidedInterface__OperationProvidedRole <em>Provided Interface Operation Provided Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Provided Interface Operation Provided Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.OperationProvidedRole#getProvidedInterface__OperationProvidedRole()
    * @see #getOperationProvidedRole()
    * @generated
    */
   EReference getOperationProvidedRole_ProvidedInterface__OperationProvidedRole();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureProvidedRole <em>Infrastructure Provided Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Infrastructure Provided Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureProvidedRole
    * @generated
    */
   EClass getInfrastructureProvidedRole();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureProvidedRole#getProvidedInterface__InfrastructureProvidedRole <em>Provided Interface Infrastructure Provided Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Provided Interface Infrastructure Provided Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureProvidedRole#getProvidedInterface__InfrastructureProvidedRole()
    * @see #getInfrastructureProvidedRole()
    * @generated
    */
   EReference getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompleteComponentType <em>Complete Component Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Complete Component Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompleteComponentType
    * @generated
    */
   EClass getCompleteComponentType();

   /**
    * Returns the meta object for the reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompleteComponentType#getParentProvidesComponentTypes <em>Parent Provides Component Types</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Parent Provides Component Types</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompleteComponentType#getParentProvidesComponentTypes()
    * @see #getCompleteComponentType()
    * @generated
    */
   EReference getCompleteComponentType_ParentProvidesComponentTypes();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ProvidesComponentType <em>Provides Component Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Provides Component Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ProvidesComponentType
    * @generated
    */
   EClass getProvidesComponentType();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeComponent <em>Composite Component</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Composite Component</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeComponent
    * @generated
    */
   EClass getCompositeComponent();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveDataType <em>Primitive Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Primitive Data Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveDataType
    * @generated
    */
   EClass getPrimitiveDataType();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveDataType#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveDataType#getType()
    * @see #getPrimitiveDataType()
    * @generated
    */
   EAttribute getPrimitiveDataType_Type();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CollectionDataType <em>Collection Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Collection Data Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CollectionDataType
    * @generated
    */
   EClass getCollectionDataType();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CollectionDataType#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Inner Type Collection Data Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CollectionDataType#getInnerType_CollectionDataType()
    * @see #getCollectionDataType()
    * @generated
    */
   EReference getCollectionDataType_InnerType_CollectionDataType();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeDataType <em>Composite Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Composite Data Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeDataType
    * @generated
    */
   EClass getCompositeDataType();

   /**
    * Returns the meta object for the reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeDataType#getParentType_CompositeDataType <em>Parent Type Composite Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Parent Type Composite Data Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeDataType#getParentType_CompositeDataType()
    * @see #getCompositeDataType()
    * @generated
    */
   EReference getCompositeDataType_ParentType_CompositeDataType();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeDataType#getInnerDeclaration_CompositeDataType <em>Inner Declaration Composite Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Inner Declaration Composite Data Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.CompositeDataType#getInnerDeclaration_CompositeDataType()
    * @see #getCompositeDataType()
    * @generated
    */
   EReference getCompositeDataType_InnerDeclaration_CompositeDataType();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InnerDeclaration <em>Inner Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Inner Declaration</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InnerDeclaration
    * @generated
    */
   EClass getInnerDeclaration();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InnerDeclaration#getDatatype_InnerDeclaration <em>Datatype Inner Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Datatype Inner Declaration</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InnerDeclaration#getDatatype_InnerDeclaration()
    * @see #getInnerDeclaration()
    * @generated
    */
   EReference getInnerDeclaration_Datatype_InnerDeclaration();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InnerDeclaration#getCompositeDataType_InnerDeclaration <em>Composite Data Type Inner Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Composite Data Type Inner Declaration</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InnerDeclaration#getCompositeDataType_InnerDeclaration()
    * @see #getInnerDeclaration()
    * @generated
    */
   EReference getInnerDeclaration_CompositeDataType_InnerDeclaration();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Role <em>Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Role</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Role
    * @generated
    */
   EClass getRole();

   /**
    * Returns the meta object for enum '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ParameterModifier <em>Parameter Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Parameter Modifier</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ParameterModifier
    * @generated
    */
   EEnum getParameterModifier();

   /**
    * Returns the meta object for enum '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ComponentType <em>Component Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Component Type</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ComponentType
    * @generated
    */
   EEnum getComponentType();

   /**
    * Returns the meta object for enum '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveTypeEnum <em>Primitive Type Enum</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Primitive Type Enum</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveTypeEnum
    * @generated
    */
   EEnum getPrimitiveTypeEnum();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Repository_pc_avFactory getRepository_pc_avFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PassiveResourceImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getPassiveResource()
       * @generated
       */
      EClass PASSIVE_RESOURCE = eINSTANCE.getPassiveResource();

      /**
       * The meta object literal for the '<em><b>Capacity Passive Resource</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE = eINSTANCE.getPassiveResource_Capacity_PassiveResource();

      /**
       * The meta object literal for the '<em><b>Basic Component Passive Resource</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE = eINSTANCE.getPassiveResource_BasicComponent_PassiveResource();

      /**
       * The meta object literal for the '<em><b>Resource Timeout Failure Type Passive Resource</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE = eINSTANCE.getPassiveResource_ResourceTimeoutFailureType__PassiveResource();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.BasicComponentImpl <em>Basic Component</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.BasicComponentImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getBasicComponent()
       * @generated
       */
      EClass BASIC_COMPONENT = eINSTANCE.getBasicComponent();

      /**
       * The meta object literal for the '<em><b>Service Effect Specifications Basic Component</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT = eINSTANCE.getBasicComponent_ServiceEffectSpecifications__BasicComponent();

      /**
       * The meta object literal for the '<em><b>Passive Resource Basic Component</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT = eINSTANCE.getBasicComponent_PassiveResource_BasicComponent();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ImplementationComponentTypeImpl <em>Implementation Component Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ImplementationComponentTypeImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getImplementationComponentType()
       * @generated
       */
      EClass IMPLEMENTATION_COMPONENT_TYPE = eINSTANCE.getImplementationComponentType();

      /**
       * The meta object literal for the '<em><b>Parent Complete Component Types</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES = eINSTANCE.getImplementationComponentType_ParentCompleteComponentTypes();

      /**
       * The meta object literal for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = eINSTANCE.getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType();

      /**
       * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE = eINSTANCE.getImplementationComponentType_ComponentType();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RepositoryComponentImpl <em>Repository Component</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RepositoryComponentImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRepositoryComponent()
       * @generated
       */
      EClass REPOSITORY_COMPONENT = eINSTANCE.getRepositoryComponent();

      /**
       * The meta object literal for the '<em><b>Repository Repository Component</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT = eINSTANCE.getRepositoryComponent_Repository__RepositoryComponent();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ProvidedRoleImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getProvidedRole()
       * @generated
       */
      EClass PROVIDED_ROLE = eINSTANCE.getProvidedRole();

      /**
       * The meta object literal for the '<em><b>Providing Entity Provided Role</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = eINSTANCE.getProvidedRole_ProvidingEntity_ProvidedRole();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ParameterImpl <em>Parameter</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ParameterImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getParameter()
       * @generated
       */
      EClass PARAMETER = eINSTANCE.getParameter();

      /**
       * The meta object literal for the '<em><b>Data Type Parameter</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETER__DATA_TYPE_PARAMETER = eINSTANCE.getParameter_DataType__Parameter();

      /**
       * The meta object literal for the '<em><b>Infrastructure Signature Parameter</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER = eINSTANCE.getParameter_InfrastructureSignature__Parameter();

      /**
       * The meta object literal for the '<em><b>Operation Signature Parameter</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETER__OPERATION_SIGNATURE_PARAMETER = eINSTANCE.getParameter_OperationSignature__Parameter();

      /**
       * The meta object literal for the '<em><b>Event Type Parameter</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETER__EVENT_TYPE_PARAMETER = eINSTANCE.getParameter_EventType__Parameter();

      /**
       * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_ParameterName();

      /**
       * The meta object literal for the '<em><b>Modifier Parameter</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PARAMETER__MODIFIER_PARAMETER = eINSTANCE.getParameter_Modifier__Parameter();

      /**
       * The meta object literal for the '<em><b>Resource Signature Parameter</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETER__RESOURCE_SIGNATURE_PARAMETER = eINSTANCE.getParameter_ResourceSignature__Parameter();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.DataTypeImpl <em>Data Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.DataTypeImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getDataType()
       * @generated
       */
      EClass DATA_TYPE = eINSTANCE.getDataType();

      /**
       * The meta object literal for the '<em><b>Repository Data Type</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DATA_TYPE__REPOSITORY_DATA_TYPE = eINSTANCE.getDataType_Repository__DataType();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RepositoryImpl <em>Repository</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RepositoryImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRepository()
       * @generated
       */
      EClass REPOSITORY = eINSTANCE.getRepository();

      /**
       * The meta object literal for the '<em><b>Repository Description</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute REPOSITORY__REPOSITORY_DESCRIPTION = eINSTANCE.getRepository_RepositoryDescription();

      /**
       * The meta object literal for the '<em><b>Components Repository</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REPOSITORY__COMPONENTS_REPOSITORY = eINSTANCE.getRepository_Components__Repository();

      /**
       * The meta object literal for the '<em><b>Interfaces Repository</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REPOSITORY__INTERFACES_REPOSITORY = eINSTANCE.getRepository_Interfaces__Repository();

      /**
       * The meta object literal for the '<em><b>Failure Types Repository</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REPOSITORY__FAILURE_TYPES_REPOSITORY = eINSTANCE.getRepository_FailureTypes__Repository();

      /**
       * The meta object literal for the '<em><b>Data Types Repository</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REPOSITORY__DATA_TYPES_REPOSITORY = eINSTANCE.getRepository_DataTypes__Repository();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InterfaceImpl <em>Interface</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InterfaceImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInterface()
       * @generated
       */
      EClass INTERFACE = eINSTANCE.getInterface();

      /**
       * The meta object literal for the '<em><b>Parent Interfaces Interface</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INTERFACE__PARENT_INTERFACES_INTERFACE = eINSTANCE.getInterface_ParentInterfaces__Interface();

      /**
       * The meta object literal for the '<em><b>Protocols Interface</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INTERFACE__PROTOCOLS_INTERFACE = eINSTANCE.getInterface_Protocols__Interface();

      /**
       * The meta object literal for the '<em><b>Required Characterisations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INTERFACE__REQUIRED_CHARACTERISATIONS = eINSTANCE.getInterface_RequiredCharacterisations();

      /**
       * The meta object literal for the '<em><b>Repository Interface</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INTERFACE__REPOSITORY_INTERFACE = eINSTANCE.getInterface_Repository__Interface();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredCharacterisationImpl <em>Required Characterisation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredCharacterisationImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRequiredCharacterisation()
       * @generated
       */
      EClass REQUIRED_CHARACTERISATION = eINSTANCE.getRequiredCharacterisation();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute REQUIRED_CHARACTERISATION__TYPE = eINSTANCE.getRequiredCharacterisation_Type();

      /**
       * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REQUIRED_CHARACTERISATION__PARAMETER = eINSTANCE.getRequiredCharacterisation_Parameter();

      /**
       * The meta object literal for the '<em><b>Interface Required Characterisation</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION = eINSTANCE.getRequiredCharacterisation_Interface_RequiredCharacterisation();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.EventGroupImpl <em>Event Group</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.EventGroupImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getEventGroup()
       * @generated
       */
      EClass EVENT_GROUP = eINSTANCE.getEventGroup();

      /**
       * The meta object literal for the '<em><b>Event Types Event Group</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EVENT_GROUP__EVENT_TYPES_EVENT_GROUP = eINSTANCE.getEventGroup_EventTypes__EventGroup();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.EventTypeImpl <em>Event Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.EventTypeImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getEventType()
       * @generated
       */
      EClass EVENT_TYPE = eINSTANCE.getEventType();

      /**
       * The meta object literal for the '<em><b>Parameter Event Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EVENT_TYPE__PARAMETER_EVENT_TYPE = eINSTANCE.getEventType_Parameter__EventType();

      /**
       * The meta object literal for the '<em><b>Event Group Event Type</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EVENT_TYPE__EVENT_GROUP_EVENT_TYPE = eINSTANCE.getEventType_EventGroup__EventType();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SignatureImpl <em>Signature</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SignatureImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getSignature()
       * @generated
       */
      EClass SIGNATURE = eINSTANCE.getSignature();

      /**
       * The meta object literal for the '<em><b>Exceptions Signature</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SIGNATURE__EXCEPTIONS_SIGNATURE = eINSTANCE.getSignature_Exceptions__Signature();

      /**
       * The meta object literal for the '<em><b>Failure Type</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SIGNATURE__FAILURE_TYPE = eINSTANCE.getSignature_FailureType();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ExceptionTypeImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getExceptionType()
       * @generated
       */
      EClass EXCEPTION_TYPE = eINSTANCE.getExceptionType();

      /**
       * The meta object literal for the '<em><b>Exception Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute EXCEPTION_TYPE__EXCEPTION_NAME = eINSTANCE.getExceptionType_ExceptionName();

      /**
       * The meta object literal for the '<em><b>Exception Message</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute EXCEPTION_TYPE__EXCEPTION_MESSAGE = eINSTANCE.getExceptionType_ExceptionMessage();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureSignatureImpl <em>Infrastructure Signature</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureSignatureImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInfrastructureSignature()
       * @generated
       */
      EClass INFRASTRUCTURE_SIGNATURE = eINSTANCE.getInfrastructureSignature();

      /**
       * The meta object literal for the '<em><b>Parameters Infrastructure Signature</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE = eINSTANCE.getInfrastructureSignature_Parameters__InfrastructureSignature();

      /**
       * The meta object literal for the '<em><b>Infrastructure Interface Infrastructure Signature</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE = eINSTANCE.getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureInterfaceImpl <em>Infrastructure Interface</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureInterfaceImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInfrastructureInterface()
       * @generated
       */
      EClass INFRASTRUCTURE_INTERFACE = eINSTANCE.getInfrastructureInterface();

      /**
       * The meta object literal for the '<em><b>Infrastructure Signatures Infrastructure Interface</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE = eINSTANCE.getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureRequiredRoleImpl <em>Infrastructure Required Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureRequiredRoleImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInfrastructureRequiredRole()
       * @generated
       */
      EClass INFRASTRUCTURE_REQUIRED_ROLE = eINSTANCE.getInfrastructureRequiredRole();

      /**
       * The meta object literal for the '<em><b>Required Interface Infrastructure Required Role</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE = eINSTANCE.getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredRoleImpl <em>Required Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RequiredRoleImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRequiredRole()
       * @generated
       */
      EClass REQUIRED_ROLE = eINSTANCE.getRequiredRole();

      /**
       * The meta object literal for the '<em><b>Requiring Entity Required Role</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = eINSTANCE.getRequiredRole_RequiringEntity_RequiredRole();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationSignatureImpl <em>Operation Signature</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationSignatureImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getOperationSignature()
       * @generated
       */
      EClass OPERATION_SIGNATURE = eINSTANCE.getOperationSignature();

      /**
       * The meta object literal for the '<em><b>Interface Operation Signature</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE = eINSTANCE.getOperationSignature_Interface__OperationSignature();

      /**
       * The meta object literal for the '<em><b>Parameters Operation Signature</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE = eINSTANCE.getOperationSignature_Parameters__OperationSignature();

      /**
       * The meta object literal for the '<em><b>Return Type Operation Signature</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE = eINSTANCE.getOperationSignature_ReturnType__OperationSignature();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationInterfaceImpl <em>Operation Interface</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationInterfaceImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getOperationInterface()
       * @generated
       */
      EClass OPERATION_INTERFACE = eINSTANCE.getOperationInterface();

      /**
       * The meta object literal for the '<em><b>Signatures Operation Interface</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE = eINSTANCE.getOperationInterface_Signatures__OperationInterface();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationRequiredRoleImpl <em>Operation Required Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationRequiredRoleImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getOperationRequiredRole()
       * @generated
       */
      EClass OPERATION_REQUIRED_ROLE = eINSTANCE.getOperationRequiredRole();

      /**
       * The meta object literal for the '<em><b>Required Interface Operation Required Role</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE = eINSTANCE.getOperationRequiredRole_RequiredInterface__OperationRequiredRole();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SourceRoleImpl <em>Source Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SourceRoleImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getSourceRole()
       * @generated
       */
      EClass SOURCE_ROLE = eINSTANCE.getSourceRole();

      /**
       * The meta object literal for the '<em><b>Event Group Source Role</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SOURCE_ROLE__EVENT_GROUP_SOURCE_ROLE = eINSTANCE.getSourceRole_EventGroup__SourceRole();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SinkRoleImpl <em>Sink Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SinkRoleImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getSinkRole()
       * @generated
       */
      EClass SINK_ROLE = eINSTANCE.getSinkRole();

      /**
       * The meta object literal for the '<em><b>Event Group Sink Role</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SINK_ROLE__EVENT_GROUP_SINK_ROLE = eINSTANCE.getSinkRole_EventGroup__SinkRole();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationProvidedRoleImpl <em>Operation Provided Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.OperationProvidedRoleImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getOperationProvidedRole()
       * @generated
       */
      EClass OPERATION_PROVIDED_ROLE = eINSTANCE.getOperationProvidedRole();

      /**
       * The meta object literal for the '<em><b>Provided Interface Operation Provided Role</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE = eINSTANCE.getOperationProvidedRole_ProvidedInterface__OperationProvidedRole();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureProvidedRoleImpl <em>Infrastructure Provided Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureProvidedRoleImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInfrastructureProvidedRole()
       * @generated
       */
      EClass INFRASTRUCTURE_PROVIDED_ROLE = eINSTANCE.getInfrastructureProvidedRole();

      /**
       * The meta object literal for the '<em><b>Provided Interface Infrastructure Provided Role</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE = eINSTANCE.getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompleteComponentTypeImpl <em>Complete Component Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompleteComponentTypeImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getCompleteComponentType()
       * @generated
       */
      EClass COMPLETE_COMPONENT_TYPE = eINSTANCE.getCompleteComponentType();

      /**
       * The meta object literal for the '<em><b>Parent Provides Component Types</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES = eINSTANCE.getCompleteComponentType_ParentProvidesComponentTypes();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ProvidesComponentTypeImpl <em>Provides Component Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.ProvidesComponentTypeImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getProvidesComponentType()
       * @generated
       */
      EClass PROVIDES_COMPONENT_TYPE = eINSTANCE.getProvidesComponentType();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompositeComponentImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getCompositeComponent()
       * @generated
       */
      EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PrimitiveDataTypeImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getPrimitiveDataType()
       * @generated
       */
      EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PRIMITIVE_DATA_TYPE__TYPE = eINSTANCE.getPrimitiveDataType_Type();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CollectionDataTypeImpl <em>Collection Data Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CollectionDataTypeImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getCollectionDataType()
       * @generated
       */
      EClass COLLECTION_DATA_TYPE = eINSTANCE.getCollectionDataType();

      /**
       * The meta object literal for the '<em><b>Inner Type Collection Data Type</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE = eINSTANCE.getCollectionDataType_InnerType_CollectionDataType();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.CompositeDataTypeImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getCompositeDataType()
       * @generated
       */
      EClass COMPOSITE_DATA_TYPE = eINSTANCE.getCompositeDataType();

      /**
       * The meta object literal for the '<em><b>Parent Type Composite Data Type</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPOSITE_DATA_TYPE__PARENT_TYPE_COMPOSITE_DATA_TYPE = eINSTANCE.getCompositeDataType_ParentType_CompositeDataType();

      /**
       * The meta object literal for the '<em><b>Inner Declaration Composite Data Type</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPOSITE_DATA_TYPE__INNER_DECLARATION_COMPOSITE_DATA_TYPE = eINSTANCE.getCompositeDataType_InnerDeclaration_CompositeDataType();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InnerDeclarationImpl <em>Inner Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InnerDeclarationImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getInnerDeclaration()
       * @generated
       */
      EClass INNER_DECLARATION = eINSTANCE.getInnerDeclaration();

      /**
       * The meta object literal for the '<em><b>Datatype Inner Declaration</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INNER_DECLARATION__DATATYPE_INNER_DECLARATION = eINSTANCE.getInnerDeclaration_Datatype_InnerDeclaration();

      /**
       * The meta object literal for the '<em><b>Composite Data Type Inner Declaration</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION = eINSTANCE.getInnerDeclaration_CompositeDataType_InnerDeclaration();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RoleImpl <em>Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.RoleImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getRole()
       * @generated
       */
      EClass ROLE = eINSTANCE.getRole();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ParameterModifier <em>Parameter Modifier</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ParameterModifier
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getParameterModifier()
       * @generated
       */
      EEnum PARAMETER_MODIFIER = eINSTANCE.getParameterModifier();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ComponentType <em>Component Type</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ComponentType
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getComponentType()
       * @generated
       */
      EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveTypeEnum <em>Primitive Type Enum</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PrimitiveTypeEnum
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.Repository_pc_avPackageImpl#getPrimitiveTypeEnum()
       * @generated
       */
      EEnum PRIMITIVE_TYPE_ENUM = eINSTANCE.getPrimitiveTypeEnum();

   }

} //Repository_pc_avPackage
