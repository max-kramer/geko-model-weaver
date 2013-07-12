/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity_av_avPackage;

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
 * The system package holds only the System meta class. A system is the most high-level and out-most compositional entity of the PCM. It defines the boundaries of a modelled application. Only systems (more precisely provided services of a system) can be accessed from usage profile. Systems also can carry QoS-Annotations, a special means to express fixed QoS properties of services that are required at the system boundary.
 * <!-- end-model-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.System_av_avFactory
 * @model kind="package"
 * @generated
 */
public interface System_av_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "system_av_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/System/5.0_advice_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "system_av_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   System_av_avPackage eINSTANCE = de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.impl.System_av_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.impl.SystemImpl <em>System</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.impl.SystemImpl
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.impl.System_av_avPackageImpl#getSystem()
    * @generated
    */
   int SYSTEM = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__ID = Entity_av_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__ENTITY_NAME = Entity_av_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Assembly Contexts Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE = Entity_av_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Resource Required Delegation Connectors Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE = Entity_av_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Event Channel Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE = Entity_av_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Connectors Composed Structure</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__CONNECTORS_COMPOSED_STRUCTURE = Entity_av_avPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = Entity_av_avPackage.ENTITY_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = Entity_av_avPackage.ENTITY_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = Entity_av_avPackage.ENTITY_FEATURE_COUNT + 6;

   /**
    * The feature id for the '<em><b>Qos Annotations System</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM__QOS_ANNOTATIONS_SYSTEM = Entity_av_avPackage.ENTITY_FEATURE_COUNT + 7;

   /**
    * The number of structural features of the '<em>System</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM_FEATURE_COUNT = Entity_av_avPackage.ENTITY_FEATURE_COUNT + 8;


   /**
    * Returns the meta object for class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.System <em>System</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>System</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.System
    * @generated
    */
   EClass getSystem();

   /**
    * Returns the meta object for the containment reference list '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.System#getQosAnnotations_System <em>Qos Annotations System</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Qos Annotations System</em>'.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.System#getQosAnnotations_System()
    * @see #getSystem()
    * @generated
    */
   EReference getSystem_QosAnnotations_System();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   System_av_avFactory getSystem_av_avFactory();

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
       * The meta object literal for the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.impl.SystemImpl <em>System</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.impl.SystemImpl
       * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.system_av_av.impl.System_av_avPackageImpl#getSystem()
       * @generated
       */
      EClass SYSTEM = eINSTANCE.getSystem();

      /**
       * The meta object literal for the '<em><b>Qos Annotations System</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SYSTEM__QOS_ANNOTATIONS_SYSTEM = eINSTANCE.getSystem_QosAnnotations_System();

   }

} //System_av_avPackage
