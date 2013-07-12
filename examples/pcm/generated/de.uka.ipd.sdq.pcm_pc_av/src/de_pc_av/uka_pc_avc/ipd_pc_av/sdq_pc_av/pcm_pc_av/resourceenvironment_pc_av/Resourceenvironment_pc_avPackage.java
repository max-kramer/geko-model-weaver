/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.Identifier_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * Package of entities representing the execution environment of a component based software system
 * <!-- end-model-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.Resourceenvironment_pc_avFactory
 * @model kind="package"
 * @generated
 */
public interface Resourceenvironment_pc_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "resourceenvironment_pc_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/ResourceEnvironment/5.0_pointcut_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "resourceenvironment_pc_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Resourceenvironment_pc_avPackage eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ResourceEnvironmentImpl <em>Resource Environment</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ResourceEnvironmentImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getResourceEnvironment()
    * @generated
    */
   int RESOURCE_ENVIRONMENT = 0;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_ENVIRONMENT__ENTITY_NAME = Entity_pc_avPackage.NAMED_ELEMENT__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Linking Resources Resource Environment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT = Entity_pc_avPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Resource Container Resource Environment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT = Entity_pc_avPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Resource Environment</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_ENVIRONMENT_FEATURE_COUNT = Entity_pc_avPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.LinkingResourceImpl <em>Linking Resource</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.LinkingResourceImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getLinkingResource()
    * @generated
    */
   int LINKING_RESOURCE = 1;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINKING_RESOURCE__ID = Entity_pc_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINKING_RESOURCE__ENTITY_NAME = Entity_pc_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Connected Resource Containers Linking Resource</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Communication Link Resource Specifications Linking Resource</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Resource Environment Linking Resource</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Linking Resource</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINKING_RESOURCE_FEATURE_COUNT = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ResourceContainerImpl <em>Resource Container</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ResourceContainerImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getResourceContainer()
    * @generated
    */
   int RESOURCE_CONTAINER = 2;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CONTAINER__ID = Entity_pc_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CONTAINER__ENTITY_NAME = Entity_pc_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Resource Environment Resource Container</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Parent Resource Container Resource Container</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Resource Container</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CONTAINER_FEATURE_COUNT = Entity_pc_avPackage.ENTITY_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ProcessingResourceSpecificationImpl <em>Processing Resource Specification</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ProcessingResourceSpecificationImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getProcessingResourceSpecification()
    * @generated
    */
   int PROCESSING_RESOURCE_SPECIFICATION = 3;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION__ID = Identifier_pc_avPackage.IDENTIFIER__ID;

   /**
    * The feature id for the '<em><b>MTTR</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION__MTTR = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>MTTF</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION__MTTF = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Required By Container</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Scheduling Policy</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Processing Rate Processing Resource Specification</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 6;

   /**
    * The feature id for the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 7;

   /**
    * The number of structural features of the '<em>Processing Resource Specification</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 8;

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.CommunicationLinkResourceSpecificationImpl <em>Communication Link Resource Specification</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.CommunicationLinkResourceSpecificationImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getCommunicationLinkResourceSpecification()
    * @generated
    */
   int COMMUNICATION_LINK_RESOURCE_SPECIFICATION = 4;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__ID = Identifier_pc_avPackage.IDENTIFIER__ID;

   /**
    * The feature id for the '<em><b>Linking Resource Communication Link Resource Specification</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Latency Communication Link Resource Specification</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Throughput Communication Link Resource Specification</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>Communication Link Resource Specification</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMUNICATION_LINK_RESOURCE_SPECIFICATION_FEATURE_COUNT = Identifier_pc_avPackage.IDENTIFIER_FEATURE_COUNT + 5;


   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceEnvironment <em>Resource Environment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Resource Environment</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceEnvironment
    * @generated
    */
   EClass getResourceEnvironment();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceEnvironment#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Linking Resources Resource Environment</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceEnvironment#getLinkingResources__ResourceEnvironment()
    * @see #getResourceEnvironment()
    * @generated
    */
   EReference getResourceEnvironment_LinkingResources__ResourceEnvironment();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceEnvironment#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Resource Container Resource Environment</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceEnvironment#getResourceContainer_ResourceEnvironment()
    * @see #getResourceEnvironment()
    * @generated
    */
   EReference getResourceEnvironment_ResourceContainer_ResourceEnvironment();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource <em>Linking Resource</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Linking Resource</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource
    * @generated
    */
   EClass getLinkingResource();

   /**
    * Returns the meta object for the reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource#getConnectedResourceContainers_LinkingResource <em>Connected Resource Containers Linking Resource</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Connected Resource Containers Linking Resource</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource#getConnectedResourceContainers_LinkingResource()
    * @see #getLinkingResource()
    * @generated
    */
   EReference getLinkingResource_ConnectedResourceContainers_LinkingResource();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Communication Link Resource Specifications Linking Resource</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource()
    * @see #getLinkingResource()
    * @generated
    */
   EReference getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Resource Environment Linking Resource</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.LinkingResource#getResourceEnvironment_LinkingResource()
    * @see #getLinkingResource()
    * @generated
    */
   EReference getLinkingResource_ResourceEnvironment_LinkingResource();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer <em>Resource Container</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Resource Container</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer
    * @generated
    */
   EClass getResourceContainer();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Active Resource Specifications Resource Container</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getActiveResourceSpecifications_ResourceContainer()
    * @see #getResourceContainer()
    * @generated
    */
   EReference getResourceContainer_ActiveResourceSpecifications_ResourceContainer();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Resource Environment Resource Container</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getResourceEnvironment_ResourceContainer()
    * @see #getResourceContainer()
    * @generated
    */
   EReference getResourceContainer_ResourceEnvironment_ResourceContainer();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getNestedResourceContainers__ResourceContainer <em>Nested Resource Containers Resource Container</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Nested Resource Containers Resource Container</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getNestedResourceContainers__ResourceContainer()
    * @see #getResourceContainer()
    * @generated
    */
   EReference getResourceContainer_NestedResourceContainers__ResourceContainer();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Parent Resource Container Resource Container</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ResourceContainer#getParentResourceContainer__ResourceContainer()
    * @see #getResourceContainer()
    * @generated
    */
   EReference getResourceContainer_ParentResourceContainer__ResourceContainer();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification <em>Processing Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Processing Resource Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification
    * @generated
    */
   EClass getProcessingResourceSpecification();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getMTTR <em>MTTR</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>MTTR</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getMTTR()
    * @see #getProcessingResourceSpecification()
    * @generated
    */
   EAttribute getProcessingResourceSpecification_MTTR();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getMTTF <em>MTTF</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>MTTF</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getMTTF()
    * @see #getProcessingResourceSpecification()
    * @generated
    */
   EAttribute getProcessingResourceSpecification_MTTF();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#isRequiredByContainer <em>Required By Container</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Required By Container</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#isRequiredByContainer()
    * @see #getProcessingResourceSpecification()
    * @generated
    */
   EAttribute getProcessingResourceSpecification_RequiredByContainer();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scheduling Policy</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getSchedulingPolicy()
    * @see #getProcessingResourceSpecification()
    * @generated
    */
   EReference getProcessingResourceSpecification_SchedulingPolicy();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Active Resource Type Active Resource Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification()
    * @see #getProcessingResourceSpecification()
    * @generated
    */
   EReference getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getProcessingRate_ProcessingResourceSpecification <em>Processing Rate Processing Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Processing Rate Processing Resource Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getProcessingRate_ProcessingResourceSpecification()
    * @see #getProcessingResourceSpecification()
    * @generated
    */
   EReference getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getNumberOfReplicas <em>Number Of Replicas</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Number Of Replicas</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getNumberOfReplicas()
    * @see #getProcessingResourceSpecification()
    * @generated
    */
   EAttribute getProcessingResourceSpecification_NumberOfReplicas();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification <em>Resource Container Processing Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Resource Container Processing Resource Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification()
    * @see #getProcessingResourceSpecification()
    * @generated
    */
   EReference getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification();

   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification <em>Communication Link Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Communication Link Resource Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification
    * @generated
    */
   EClass getCommunicationLinkResourceSpecification();

   /**
    * Returns the meta object for the container reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Linking Resource Communication Link Resource Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification()
    * @see #getCommunicationLinkResourceSpecification()
    * @generated
    */
   EReference getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification();

   /**
    * Returns the meta object for the attribute '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getFailureProbability <em>Failure Probability</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Failure Probability</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getFailureProbability()
    * @see #getCommunicationLinkResourceSpecification()
    * @generated
    */
   EAttribute getCommunicationLinkResourceSpecification_FailureProbability();

   /**
    * Returns the meta object for the reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Communication Link Resource Type Communication Link Resource Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification()
    * @see #getCommunicationLinkResourceSpecification()
    * @generated
    */
   EReference getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Latency Communication Link Resource Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification()
    * @see #getCommunicationLinkResourceSpecification()
    * @generated
    */
   EReference getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Throughput Communication Link Resource Specification</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification()
    * @see #getCommunicationLinkResourceSpecification()
    * @generated
    */
   EReference getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Resourceenvironment_pc_avFactory getResourceenvironment_pc_avFactory();

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
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ResourceEnvironmentImpl <em>Resource Environment</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ResourceEnvironmentImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getResourceEnvironment()
       * @generated
       */
      EClass RESOURCE_ENVIRONMENT = eINSTANCE.getResourceEnvironment();

      /**
       * The meta object literal for the '<em><b>Linking Resources Resource Environment</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT = eINSTANCE.getResourceEnvironment_LinkingResources__ResourceEnvironment();

      /**
       * The meta object literal for the '<em><b>Resource Container Resource Environment</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT = eINSTANCE.getResourceEnvironment_ResourceContainer_ResourceEnvironment();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.LinkingResourceImpl <em>Linking Resource</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.LinkingResourceImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getLinkingResource()
       * @generated
       */
      EClass LINKING_RESOURCE = eINSTANCE.getLinkingResource();

      /**
       * The meta object literal for the '<em><b>Connected Resource Containers Linking Resource</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE = eINSTANCE.getLinkingResource_ConnectedResourceContainers_LinkingResource();

      /**
       * The meta object literal for the '<em><b>Communication Link Resource Specifications Linking Resource</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE = eINSTANCE.getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource();

      /**
       * The meta object literal for the '<em><b>Resource Environment Linking Resource</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE = eINSTANCE.getLinkingResource_ResourceEnvironment_LinkingResource();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ResourceContainerImpl <em>Resource Container</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ResourceContainerImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getResourceContainer()
       * @generated
       */
      EClass RESOURCE_CONTAINER = eINSTANCE.getResourceContainer();

      /**
       * The meta object literal for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_ActiveResourceSpecifications_ResourceContainer();

      /**
       * The meta object literal for the '<em><b>Resource Environment Resource Container</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_ResourceEnvironment_ResourceContainer();

      /**
       * The meta object literal for the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_NestedResourceContainers__ResourceContainer();

      /**
       * The meta object literal for the '<em><b>Parent Resource Container Resource Container</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_ParentResourceContainer__ResourceContainer();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ProcessingResourceSpecificationImpl <em>Processing Resource Specification</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.ProcessingResourceSpecificationImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getProcessingResourceSpecification()
       * @generated
       */
      EClass PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification();

      /**
       * The meta object literal for the '<em><b>MTTR</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PROCESSING_RESOURCE_SPECIFICATION__MTTR = eINSTANCE.getProcessingResourceSpecification_MTTR();

      /**
       * The meta object literal for the '<em><b>MTTF</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PROCESSING_RESOURCE_SPECIFICATION__MTTF = eINSTANCE.getProcessingResourceSpecification_MTTF();

      /**
       * The meta object literal for the '<em><b>Required By Container</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER = eINSTANCE.getProcessingResourceSpecification_RequiredByContainer();

      /**
       * The meta object literal for the '<em><b>Scheduling Policy</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = eINSTANCE.getProcessingResourceSpecification_SchedulingPolicy();

      /**
       * The meta object literal for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification();

      /**
       * The meta object literal for the '<em><b>Processing Rate Processing Resource Specification</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification();

      /**
       * The meta object literal for the '<em><b>Number Of Replicas</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = eINSTANCE.getProcessingResourceSpecification_NumberOfReplicas();

      /**
       * The meta object literal for the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification();

      /**
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.CommunicationLinkResourceSpecificationImpl <em>Communication Link Resource Specification</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.CommunicationLinkResourceSpecificationImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourceenvironment_pc_av.impl.Resourceenvironment_pc_avPackageImpl#getCommunicationLinkResourceSpecification()
       * @generated
       */
      EClass COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification();

      /**
       * The meta object literal for the '<em><b>Linking Resource Communication Link Resource Specification</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification();

      /**
       * The meta object literal for the '<em><b>Failure Probability</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY = eINSTANCE.getCommunicationLinkResourceSpecification_FailureProbability();

      /**
       * The meta object literal for the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification();

      /**
       * The meta object literal for the '<em><b>Latency Communication Link Resource Specification</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification();

      /**
       * The meta object literal for the '<em><b>Throughput Communication Link Resource Specification</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification();

   }

} //Resourceenvironment_pc_avPackage
