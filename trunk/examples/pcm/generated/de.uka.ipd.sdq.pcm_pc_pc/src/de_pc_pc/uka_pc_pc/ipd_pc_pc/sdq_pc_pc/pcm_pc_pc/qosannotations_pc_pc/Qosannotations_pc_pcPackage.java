/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage;

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
 * This package contains elements to specify fixed QoS attributes of system-external services.
 * <!-- end-model-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.Qosannotations_pc_pcFactory
 * @model kind="package"
 * @generated
 */
public interface Qosannotations_pc_pcPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "qosannotations_pc_pc";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/QoSAnnotations/5.0_pointcut_pointcut";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "qosannotations_pc_pc";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Qosannotations_pc_pcPackage eINSTANCE = de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.SpecifiedQoSAnnotationImpl <em>Specified Qo SAnnotation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.SpecifiedQoSAnnotationImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl#getSpecifiedQoSAnnotation()
    * @generated
    */
   int SPECIFIED_QO_SANNOTATION = 0;

   /**
    * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION = 0;

   /**
    * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION = 1;

   /**
    * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = 2;

   /**
    * The number of structural features of the '<em>Specified Qo SAnnotation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_QO_SANNOTATION_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.QoSAnnotationsImpl <em>Qo SAnnotations</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.QoSAnnotationsImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl#getQoSAnnotations()
    * @generated
    */
   int QO_SANNOTATIONS = 1;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int QO_SANNOTATIONS__ID = Entity_pc_pcPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int QO_SANNOTATIONS__ENTITY_NAME = Entity_pc_pcPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>System Qo SAnnotations</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Specified Qo SAnnotations Qo SAnnotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Qo SAnnotations</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int QO_SANNOTATIONS_FEATURE_COUNT = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.SpecifiedOutputParameterAbstractionImpl <em>Specified Output Parameter Abstraction</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.SpecifiedOutputParameterAbstractionImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl#getSpecifiedOutputParameterAbstraction()
    * @generated
    */
   int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 2;

   /**
    * The feature id for the '<em><b>Signature Specified Output Parameter Abstraction</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 0;

   /**
    * The feature id for the '<em><b>Role Specified Output Parameter Abstraction</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 1;

   /**
    * The feature id for the '<em><b>Expected External Outputs Specified Output Parameter Abstraction</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 2;

   /**
    * The feature id for the '<em><b>Qos Annotations Specified Output Parameter Abstraction</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 3;

   /**
    * The number of structural features of the '<em>Specified Output Parameter Abstraction</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION_FEATURE_COUNT = 4;


   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation <em>Specified Qo SAnnotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Specified Qo SAnnotation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation
    * @generated
    */
   EClass getSpecifiedQoSAnnotation();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation#getSignature_SpecifiedQoSAnnation <em>Signature Specified Qo SAnnation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Signature Specified Qo SAnnation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation#getSignature_SpecifiedQoSAnnation()
    * @see #getSpecifiedQoSAnnotation()
    * @generated
    */
   EReference getSpecifiedQoSAnnotation_Signature_SpecifiedQoSAnnation();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation#getRole_SpecifiedQoSAnnotation <em>Role Specified Qo SAnnotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Role Specified Qo SAnnotation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation#getRole_SpecifiedQoSAnnotation()
    * @see #getSpecifiedQoSAnnotation()
    * @generated
    */
   EReference getSpecifiedQoSAnnotation_Role_SpecifiedQoSAnnotation();

   /**
    * Returns the meta object for the container reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Qos Annotations Specified Qo SAnnotation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation()
    * @see #getSpecifiedQoSAnnotation()
    * @generated
    */
   EReference getSpecifiedQoSAnnotation_QosAnnotations_SpecifiedQoSAnnotation();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.QoSAnnotations <em>Qo SAnnotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Qo SAnnotations</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.QoSAnnotations
    * @generated
    */
   EClass getQoSAnnotations();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.QoSAnnotations#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Specified Output Parameter Abstractions Qo SAnnotations</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.QoSAnnotations#getSpecifiedOutputParameterAbstractions_QoSAnnotations()
    * @see #getQoSAnnotations()
    * @generated
    */
   EReference getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations();

   /**
    * Returns the meta object for the container reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.QoSAnnotations#getSystem_QoSAnnotations <em>System Qo SAnnotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>System Qo SAnnotations</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.QoSAnnotations#getSystem_QoSAnnotations()
    * @see #getQoSAnnotations()
    * @generated
    */
   EReference getQoSAnnotations_System_QoSAnnotations();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.QoSAnnotations#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Specified Qo SAnnotations Qo SAnnotations</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.QoSAnnotations#getSpecifiedQoSAnnotations_QoSAnnotations()
    * @see #getQoSAnnotations()
    * @generated
    */
   EReference getQoSAnnotations_SpecifiedQoSAnnotations_QoSAnnotations();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction <em>Specified Output Parameter Abstraction</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Specified Output Parameter Abstraction</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction
    * @generated
    */
   EClass getSpecifiedOutputParameterAbstraction();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction#getSignature_SpecifiedOutputParameterAbstraction <em>Signature Specified Output Parameter Abstraction</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Signature Specified Output Parameter Abstraction</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction#getSignature_SpecifiedOutputParameterAbstraction()
    * @see #getSpecifiedOutputParameterAbstraction()
    * @generated
    */
   EReference getSpecifiedOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction#getRole_SpecifiedOutputParameterAbstraction <em>Role Specified Output Parameter Abstraction</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Role Specified Output Parameter Abstraction</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction#getRole_SpecifiedOutputParameterAbstraction()
    * @see #getSpecifiedOutputParameterAbstraction()
    * @generated
    */
   EReference getSpecifiedOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction#getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction <em>Expected External Outputs Specified Output Parameter Abstraction</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Expected External Outputs Specified Output Parameter Abstraction</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction#getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction()
    * @see #getSpecifiedOutputParameterAbstraction()
    * @generated
    */
   EReference getSpecifiedOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction();

   /**
    * Returns the meta object for the container reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction <em>Qos Annotations Specified Output Parameter Abstraction</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Qos Annotations Specified Output Parameter Abstraction</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction()
    * @see #getSpecifiedOutputParameterAbstraction()
    * @generated
    */
   EReference getSpecifiedOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Qosannotations_pc_pcFactory getQosannotations_pc_pcFactory();

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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.SpecifiedQoSAnnotationImpl <em>Specified Qo SAnnotation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.SpecifiedQoSAnnotationImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl#getSpecifiedQoSAnnotation()
       * @generated
       */
      EClass SPECIFIED_QO_SANNOTATION = eINSTANCE.getSpecifiedQoSAnnotation();

      /**
       * The meta object literal for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION = eINSTANCE.getSpecifiedQoSAnnotation_Signature_SpecifiedQoSAnnation();

      /**
       * The meta object literal for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION = eINSTANCE.getSpecifiedQoSAnnotation_Role_SpecifiedQoSAnnotation();

      /**
       * The meta object literal for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = eINSTANCE.getSpecifiedQoSAnnotation_QosAnnotations_SpecifiedQoSAnnotation();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.QoSAnnotationsImpl <em>Qo SAnnotations</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.QoSAnnotationsImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl#getQoSAnnotations()
       * @generated
       */
      EClass QO_SANNOTATIONS = eINSTANCE.getQoSAnnotations();

      /**
       * The meta object literal for the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS = eINSTANCE.getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations();

      /**
       * The meta object literal for the '<em><b>System Qo SAnnotations</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS = eINSTANCE.getQoSAnnotations_System_QoSAnnotations();

      /**
       * The meta object literal for the '<em><b>Specified Qo SAnnotations Qo SAnnotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS = eINSTANCE.getQoSAnnotations_SpecifiedQoSAnnotations_QoSAnnotations();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.SpecifiedOutputParameterAbstractionImpl <em>Specified Output Parameter Abstraction</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.SpecifiedOutputParameterAbstractionImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl#getSpecifiedOutputParameterAbstraction()
       * @generated
       */
      EClass SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction();

      /**
       * The meta object literal for the '<em><b>Signature Specified Output Parameter Abstraction</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction();

      /**
       * The meta object literal for the '<em><b>Role Specified Output Parameter Abstraction</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction();

      /**
       * The meta object literal for the '<em><b>Expected External Outputs Specified Output Parameter Abstraction</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction();

      /**
       * The meta object literal for the '<em><b>Qos Annotations Specified Output Parameter Abstraction</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction();

   }

} //Qosannotations_pc_pcPackage
