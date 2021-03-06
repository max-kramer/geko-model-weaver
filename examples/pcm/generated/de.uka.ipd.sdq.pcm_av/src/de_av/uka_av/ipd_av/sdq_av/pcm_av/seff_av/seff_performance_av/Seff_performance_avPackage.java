/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage;

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
 * Package capturing performance aspects of an RDSEFF
 * <!-- end-model-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.Seff_performance_avFactory
 * @model kind="package"
 * @generated
 */
public interface Seff_performance_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "seff_performance_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/SEFF_Performance/5.0_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "seff_performance_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Seff_performance_avPackage eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.Seff_performance_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.InfrastructureCallImpl <em>Infrastructure Call</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.InfrastructureCallImpl
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.Seff_performance_avPackageImpl#getInfrastructureCall()
    * @generated
    */
   int INFRASTRUCTURE_CALL = 0;

   /**
    * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_CALL__INPUT_VARIABLE_USAGES_CALL_ACTION = Seff_avPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;

   /**
    * The feature id for the '<em><b>Signature Infrastructure Call</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Number Of Calls Infrastructure Call</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Action Infrastructure Call</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Required Role Infrastructure Call</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Infrastructure Call</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFRASTRUCTURE_CALL_FEATURE_COUNT = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.ResourceCallImpl <em>Resource Call</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.ResourceCallImpl
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.Seff_performance_avPackageImpl#getResourceCall()
    * @generated
    */
   int RESOURCE_CALL = 1;

   /**
    * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CALL__INPUT_VARIABLE_USAGES_CALL_ACTION = Seff_avPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;

   /**
    * The feature id for the '<em><b>Action Resource Call</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CALL__ACTION_RESOURCE_CALL = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Resource Required Role Resource Call</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Signature Resource Call</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CALL__SIGNATURE_RESOURCE_CALL = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Number Of Calls Resource Call</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Resource Call</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RESOURCE_CALL_FEATURE_COUNT = Seff_avPackage.CALL_ACTION_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.ParametricResourceDemandImpl <em>Parametric Resource Demand</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.ParametricResourceDemandImpl
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.Seff_performance_avPackageImpl#getParametricResourceDemand()
    * @generated
    */
   int PARAMETRIC_RESOURCE_DEMAND = 2;

   /**
    * The feature id for the '<em><b>Specification Parameteric Resource Demand</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND = 0;

   /**
    * The feature id for the '<em><b>Required Resource Parametric Resource Demand</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND = 1;

   /**
    * The feature id for the '<em><b>Action Parametric Resource Demand</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND = 2;

   /**
    * The number of structural features of the '<em>Parametric Resource Demand</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETRIC_RESOURCE_DEMAND_FEATURE_COUNT = 3;


   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall <em>Infrastructure Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Infrastructure Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall
    * @generated
    */
   EClass getInfrastructureCall();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Signature Infrastructure Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getSignature__InfrastructureCall()
    * @see #getInfrastructureCall()
    * @generated
    */
   EReference getInfrastructureCall_Signature__InfrastructureCall();

   /**
    * Returns the meta object for the containment reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Number Of Calls Infrastructure Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getNumberOfCalls__InfrastructureCall()
    * @see #getInfrastructureCall()
    * @generated
    */
   EReference getInfrastructureCall_NumberOfCalls__InfrastructureCall();

   /**
    * Returns the meta object for the container reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Action Infrastructure Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getAction__InfrastructureCall()
    * @see #getInfrastructureCall()
    * @generated
    */
   EReference getInfrastructureCall_Action__InfrastructureCall();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Required Role Infrastructure Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getRequiredRole__InfrastructureCall()
    * @see #getInfrastructureCall()
    * @generated
    */
   EReference getInfrastructureCall_RequiredRole__InfrastructureCall();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall <em>Resource Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Resource Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall
    * @generated
    */
   EClass getResourceCall();

   /**
    * Returns the meta object for the container reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getAction__ResourceCall <em>Action Resource Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Action Resource Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getAction__ResourceCall()
    * @see #getResourceCall()
    * @generated
    */
   EReference getResourceCall_Action__ResourceCall();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getResourceRequiredRole__ResourceCall <em>Resource Required Role Resource Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Resource Required Role Resource Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getResourceRequiredRole__ResourceCall()
    * @see #getResourceCall()
    * @generated
    */
   EReference getResourceCall_ResourceRequiredRole__ResourceCall();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getSignature__ResourceCall <em>Signature Resource Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Signature Resource Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getSignature__ResourceCall()
    * @see #getResourceCall()
    * @generated
    */
   EReference getResourceCall_Signature__ResourceCall();

   /**
    * Returns the meta object for the containment reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getNumberOfCalls__ResourceCall <em>Number Of Calls Resource Call</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Number Of Calls Resource Call</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getNumberOfCalls__ResourceCall()
    * @see #getResourceCall()
    * @generated
    */
   EReference getResourceCall_NumberOfCalls__ResourceCall();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand <em>Parametric Resource Demand</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Parametric Resource Demand</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand
    * @generated
    */
   EClass getParametricResourceDemand();

   /**
    * Returns the meta object for the containment reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getSpecification_ParametericResourceDemand <em>Specification Parameteric Resource Demand</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Specification Parameteric Resource Demand</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getSpecification_ParametericResourceDemand()
    * @see #getParametricResourceDemand()
    * @generated
    */
   EReference getParametricResourceDemand_Specification_ParametericResourceDemand();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getRequiredResource_ParametricResourceDemand <em>Required Resource Parametric Resource Demand</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Required Resource Parametric Resource Demand</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getRequiredResource_ParametricResourceDemand()
    * @see #getParametricResourceDemand()
    * @generated
    */
   EReference getParametricResourceDemand_RequiredResource_ParametricResourceDemand();

   /**
    * Returns the meta object for the container reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Action Parametric Resource Demand</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getAction_ParametricResourceDemand()
    * @see #getParametricResourceDemand()
    * @generated
    */
   EReference getParametricResourceDemand_Action_ParametricResourceDemand();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Seff_performance_avFactory getSeff_performance_avFactory();

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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.InfrastructureCallImpl <em>Infrastructure Call</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.InfrastructureCallImpl
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.Seff_performance_avPackageImpl#getInfrastructureCall()
       * @generated
       */
      EClass INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall();

      /**
       * The meta object literal for the '<em><b>Signature Infrastructure Call</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall_Signature__InfrastructureCall();

      /**
       * The meta object literal for the '<em><b>Number Of Calls Infrastructure Call</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall_NumberOfCalls__InfrastructureCall();

      /**
       * The meta object literal for the '<em><b>Action Infrastructure Call</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall_Action__InfrastructureCall();

      /**
       * The meta object literal for the '<em><b>Required Role Infrastructure Call</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall_RequiredRole__InfrastructureCall();

      /**
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.ResourceCallImpl <em>Resource Call</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.ResourceCallImpl
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.Seff_performance_avPackageImpl#getResourceCall()
       * @generated
       */
      EClass RESOURCE_CALL = eINSTANCE.getResourceCall();

      /**
       * The meta object literal for the '<em><b>Action Resource Call</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_CALL__ACTION_RESOURCE_CALL = eINSTANCE.getResourceCall_Action__ResourceCall();

      /**
       * The meta object literal for the '<em><b>Resource Required Role Resource Call</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL = eINSTANCE.getResourceCall_ResourceRequiredRole__ResourceCall();

      /**
       * The meta object literal for the '<em><b>Signature Resource Call</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_CALL__SIGNATURE_RESOURCE_CALL = eINSTANCE.getResourceCall_Signature__ResourceCall();

      /**
       * The meta object literal for the '<em><b>Number Of Calls Resource Call</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL = eINSTANCE.getResourceCall_NumberOfCalls__ResourceCall();

      /**
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.ParametricResourceDemandImpl <em>Parametric Resource Demand</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.ParametricResourceDemandImpl
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.Seff_performance_avPackageImpl#getParametricResourceDemand()
       * @generated
       */
      EClass PARAMETRIC_RESOURCE_DEMAND = eINSTANCE.getParametricResourceDemand();

      /**
       * The meta object literal for the '<em><b>Specification Parameteric Resource Demand</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND = eINSTANCE.getParametricResourceDemand_Specification_ParametericResourceDemand();

      /**
       * The meta object literal for the '<em><b>Required Resource Parametric Resource Demand</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND = eINSTANCE.getParametricResourceDemand_RequiredResource_ParametricResourceDemand();

      /**
       * The meta object literal for the '<em><b>Action Parametric Resource Demand</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND = eINSTANCE.getParametricResourceDemand_Action_ParametricResourceDemand();

   }

} //Seff_performance_avPackage
