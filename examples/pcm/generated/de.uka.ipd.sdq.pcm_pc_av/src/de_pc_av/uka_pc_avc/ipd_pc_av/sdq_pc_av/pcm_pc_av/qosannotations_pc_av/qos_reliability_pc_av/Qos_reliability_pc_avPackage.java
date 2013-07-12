/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.Qosannotations_pc_avPackage;

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
 * Reliability&nbsp;aspects&nbsp;of&nbsp;QoS&nbsp;annotations.
 * <!-- end-model-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.Qos_reliability_pc_avFactory
 * @model kind="package"
 * @generated
 */
public interface Qos_reliability_pc_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "qos_reliability_pc_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/QoSAnnotations/QoS_Reliability/5.0_pointcut_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "_pc_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Qos_reliability_pc_avPackage eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.Qos_reliability_pc_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.SpecifiedReliabilityAnnotationImpl <em>Specified Reliability Annotation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.SpecifiedReliabilityAnnotationImpl
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.Qos_reliability_pc_avPackageImpl#getSpecifiedReliabilityAnnotation()
    * @generated
    */
   int SPECIFIED_RELIABILITY_ANNOTATION = 0;

   /**
    * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_RELIABILITY_ANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION = Qosannotations_pc_avPackage.SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION;

   /**
    * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_RELIABILITY_ANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION = Qosannotations_pc_avPackage.SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION;

   /**
    * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_RELIABILITY_ANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = Qosannotations_pc_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION;

   /**
    * The feature id for the '<em><b>External Failure Occurrence Descriptions Specified Reliability Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION = Qosannotations_pc_avPackage.SPECIFIED_QO_SANNOTATION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Specified Reliability Annotation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_RELIABILITY_ANNOTATION_FEATURE_COUNT = Qosannotations_pc_avPackage.SPECIFIED_QO_SANNOTATION_FEATURE_COUNT + 1;


   /**
    * Returns the meta object for class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.SpecifiedReliabilityAnnotation <em>Specified Reliability Annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Specified Reliability Annotation</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.SpecifiedReliabilityAnnotation
    * @generated
    */
   EClass getSpecifiedReliabilityAnnotation();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.SpecifiedReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>'.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.SpecifiedReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()
    * @see #getSpecifiedReliabilityAnnotation()
    * @generated
    */
   EReference getSpecifiedReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Qos_reliability_pc_avFactory getQos_reliability_pc_avFactory();

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
       * The meta object literal for the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.SpecifiedReliabilityAnnotationImpl <em>Specified Reliability Annotation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.SpecifiedReliabilityAnnotationImpl
       * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.Qos_reliability_pc_avPackageImpl#getSpecifiedReliabilityAnnotation()
       * @generated
       */
      EClass SPECIFIED_RELIABILITY_ANNOTATION = eINSTANCE.getSpecifiedReliabilityAnnotation();

      /**
       * The meta object literal for the '<em><b>External Failure Occurrence Descriptions Specified Reliability Annotation</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION = eINSTANCE.getSpecifiedReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();

   }

} //Qos_reliability_pc_avPackage
