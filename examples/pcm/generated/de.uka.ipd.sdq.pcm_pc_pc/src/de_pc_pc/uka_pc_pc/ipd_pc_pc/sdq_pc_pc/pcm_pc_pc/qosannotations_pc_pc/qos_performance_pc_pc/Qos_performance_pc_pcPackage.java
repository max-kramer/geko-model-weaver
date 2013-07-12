/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.Qosannotations_pc_pcPackage;

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
 * Performance aspects of QoS annotations.
 * <!-- end-model-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.Qos_performance_pc_pcFactory
 * @model kind="package"
 * @generated
 */
public interface Qos_performance_pc_pcPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "qos_performance_pc_pc";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/QoSAnnotations/QoS_Performance/5.0_pointcut_pointcut";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "_pc_pc";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Qos_performance_pc_pcPackage eINSTANCE = de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.SpecifiedExecutionTimeImpl <em>Specified Execution Time</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.SpecifiedExecutionTimeImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl#getSpecifiedExecutionTime()
    * @generated
    */
   int SPECIFIED_EXECUTION_TIME = 1;

   /**
    * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION = Qosannotations_pc_pcPackage.SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION;

   /**
    * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION = Qosannotations_pc_pcPackage.SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION;

   /**
    * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = Qosannotations_pc_pcPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION;

   /**
    * The feature id for the '<em><b>Specification Specified Execution Time</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME = Qosannotations_pc_pcPackage.SPECIFIED_QO_SANNOTATION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Specified Execution Time</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SPECIFIED_EXECUTION_TIME_FEATURE_COUNT = Qosannotations_pc_pcPackage.SPECIFIED_QO_SANNOTATION_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.SystemSpecifiedExecutionTimeImpl <em>System Specified Execution Time</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.SystemSpecifiedExecutionTimeImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl#getSystemSpecifiedExecutionTime()
    * @generated
    */
   int SYSTEM_SPECIFIED_EXECUTION_TIME = 0;

   /**
    * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM_SPECIFIED_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION = SPECIFIED_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION;

   /**
    * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM_SPECIFIED_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION = SPECIFIED_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION;

   /**
    * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM_SPECIFIED_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = SPECIFIED_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION;

   /**
    * The feature id for the '<em><b>Specification Specified Execution Time</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM_SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME = SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME;

   /**
    * The number of structural features of the '<em>System Specified Execution Time</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM_SPECIFIED_EXECUTION_TIME_FEATURE_COUNT = SPECIFIED_EXECUTION_TIME_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.ComponentSpecifiedExecutionTimeImpl <em>Component Specified Execution Time</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.ComponentSpecifiedExecutionTimeImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl#getComponentSpecifiedExecutionTime()
    * @generated
    */
   int COMPONENT_SPECIFIED_EXECUTION_TIME = 2;

   /**
    * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPONENT_SPECIFIED_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION = SPECIFIED_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION;

   /**
    * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPONENT_SPECIFIED_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION = SPECIFIED_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION;

   /**
    * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPONENT_SPECIFIED_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = SPECIFIED_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION;

   /**
    * The feature id for the '<em><b>Specification Specified Execution Time</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPONENT_SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME = SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME;

   /**
    * The feature id for the '<em><b>Assembly Context Component Specified Execution Time</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPONENT_SPECIFIED_EXECUTION_TIME__ASSEMBLY_CONTEXT_COMPONENT_SPECIFIED_EXECUTION_TIME = SPECIFIED_EXECUTION_TIME_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Component Specified Execution Time</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPONENT_SPECIFIED_EXECUTION_TIME_FEATURE_COUNT = SPECIFIED_EXECUTION_TIME_FEATURE_COUNT + 1;


   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.SystemSpecifiedExecutionTime <em>System Specified Execution Time</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>System Specified Execution Time</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.SystemSpecifiedExecutionTime
    * @generated
    */
   EClass getSystemSpecifiedExecutionTime();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.SpecifiedExecutionTime <em>Specified Execution Time</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Specified Execution Time</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.SpecifiedExecutionTime
    * @generated
    */
   EClass getSpecifiedExecutionTime();

   /**
    * Returns the meta object for the containment reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.SpecifiedExecutionTime#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Specification Specified Execution Time</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.SpecifiedExecutionTime#getSpecification_SpecifiedExecutionTime()
    * @see #getSpecifiedExecutionTime()
    * @generated
    */
   EReference getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.ComponentSpecifiedExecutionTime <em>Component Specified Execution Time</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Component Specified Execution Time</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.ComponentSpecifiedExecutionTime
    * @generated
    */
   EClass getComponentSpecifiedExecutionTime();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.ComponentSpecifiedExecutionTime#getAssemblyContext_ComponentSpecifiedExecutionTime <em>Assembly Context Component Specified Execution Time</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Assembly Context Component Specified Execution Time</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.ComponentSpecifiedExecutionTime#getAssemblyContext_ComponentSpecifiedExecutionTime()
    * @see #getComponentSpecifiedExecutionTime()
    * @generated
    */
   EReference getComponentSpecifiedExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Qos_performance_pc_pcFactory getQos_performance_pc_pcFactory();

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
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.SystemSpecifiedExecutionTimeImpl <em>System Specified Execution Time</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.SystemSpecifiedExecutionTimeImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl#getSystemSpecifiedExecutionTime()
       * @generated
       */
      EClass SYSTEM_SPECIFIED_EXECUTION_TIME = eINSTANCE.getSystemSpecifiedExecutionTime();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.SpecifiedExecutionTimeImpl <em>Specified Execution Time</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.SpecifiedExecutionTimeImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl#getSpecifiedExecutionTime()
       * @generated
       */
      EClass SPECIFIED_EXECUTION_TIME = eINSTANCE.getSpecifiedExecutionTime();

      /**
       * The meta object literal for the '<em><b>Specification Specified Execution Time</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME = eINSTANCE.getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.ComponentSpecifiedExecutionTimeImpl <em>Component Specified Execution Time</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.ComponentSpecifiedExecutionTimeImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl#getComponentSpecifiedExecutionTime()
       * @generated
       */
      EClass COMPONENT_SPECIFIED_EXECUTION_TIME = eINSTANCE.getComponentSpecifiedExecutionTime();

      /**
       * The meta object literal for the '<em><b>Assembly Context Component Specified Execution Time</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPONENT_SPECIFIED_EXECUTION_TIME__ASSEMBLY_CONTEXT_COMPONENT_SPECIFIED_EXECUTION_TIME = eINSTANCE.getComponentSpecifiedExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime();

   }

} //Qos_performance_pc_pcPackage
