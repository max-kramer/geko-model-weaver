/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage;

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
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.Seff_reliability_pcFactory
 * @model kind="package"
 * @generated
 */
public interface Seff_reliability_pcPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "seff_reliability_pc";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/SEFF/SEFF_Reliability/5.0_pointcut";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "seff_reliability_pc";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Seff_reliability_pcPackage eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.Seff_reliability_pcPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.FailureHandlingEntityImpl <em>Failure Handling Entity</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.FailureHandlingEntityImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.Seff_reliability_pcPackageImpl#getFailureHandlingEntity()
    * @generated
    */
   int FAILURE_HANDLING_ENTITY = 2;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FAILURE_HANDLING_ENTITY__ID = Entity_pcPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FAILURE_HANDLING_ENTITY__ENTITY_NAME = Entity_pcPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = Entity_pcPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Failure Handling Entity</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FAILURE_HANDLING_ENTITY_FEATURE_COUNT = Entity_pcPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.RecoveryActionBehaviourImpl <em>Recovery Action Behaviour</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.RecoveryActionBehaviourImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.Seff_reliability_pcPackageImpl#getRecoveryActionBehaviour()
    * @generated
    */
   int RECOVERY_ACTION_BEHAVIOUR = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_BEHAVIOUR__ID = FAILURE_HANDLING_ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_BEHAVIOUR__ENTITY_NAME = FAILURE_HANDLING_ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_BEHAVIOUR__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY;

   /**
    * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Failure Handling Alternatives Recovery Action Behaviour</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Recovery Action Recovery Action Behaviour</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>Recovery Action Behaviour</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_BEHAVIOUR_FEATURE_COUNT = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 5;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.RecoveryActionImpl <em>Recovery Action</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.RecoveryActionImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.Seff_reliability_pcPackageImpl#getRecoveryAction()
    * @generated
    */
   int RECOVERY_ACTION = 1;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__ID = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__ENTITY_NAME = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__PREDECESSOR_ABSTRACT_ACTION = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

   /**
    * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__SUCCESSOR_ABSTRACT_ACTION = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

   /**
    * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

   /**
    * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__RESOURCE_DEMAND_ACTION = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

   /**
    * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__INFRASTRUCTURE_CALL_ACTION = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

   /**
    * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__RESOURCE_CALL_ACTION = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

   /**
    * The feature id for the '<em><b>Primary Behaviour Recovery Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Recovery Action Behaviours Recovery Action</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Recovery Action</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RECOVERY_ACTION_FEATURE_COUNT = Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 2;


   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryActionBehaviour <em>Recovery Action Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Recovery Action Behaviour</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryActionBehaviour
    * @generated
    */
   EClass getRecoveryActionBehaviour();

   /**
    * Returns the meta object for the reference list '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryActionBehaviour#getFailureHandlingAlternatives__RecoveryActionBehaviour <em>Failure Handling Alternatives Recovery Action Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Failure Handling Alternatives Recovery Action Behaviour</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryActionBehaviour#getFailureHandlingAlternatives__RecoveryActionBehaviour()
    * @see #getRecoveryActionBehaviour()
    * @generated
    */
   EReference getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour();

   /**
    * Returns the meta object for the container reference '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Recovery Action Recovery Action Behaviour</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour()
    * @see #getRecoveryActionBehaviour()
    * @generated
    */
   EReference getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryAction <em>Recovery Action</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Recovery Action</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryAction
    * @generated
    */
   EClass getRecoveryAction();

   /**
    * Returns the meta object for the reference '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryAction#getPrimaryBehaviour__RecoveryAction <em>Primary Behaviour Recovery Action</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Primary Behaviour Recovery Action</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryAction#getPrimaryBehaviour__RecoveryAction()
    * @see #getRecoveryAction()
    * @generated
    */
   EReference getRecoveryAction_PrimaryBehaviour__RecoveryAction();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Recovery Action Behaviours Recovery Action</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction()
    * @see #getRecoveryAction()
    * @generated
    */
   EReference getRecoveryAction_RecoveryActionBehaviours__RecoveryAction();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.FailureHandlingEntity <em>Failure Handling Entity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Failure Handling Entity</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.FailureHandlingEntity
    * @generated
    */
   EClass getFailureHandlingEntity();

   /**
    * Returns the meta object for the reference list '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.FailureHandlingEntity#getFailureTypes_FailureHandlingEntity <em>Failure Types Failure Handling Entity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Failure Types Failure Handling Entity</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.FailureHandlingEntity#getFailureTypes_FailureHandlingEntity()
    * @see #getFailureHandlingEntity()
    * @generated
    */
   EReference getFailureHandlingEntity_FailureTypes_FailureHandlingEntity();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Seff_reliability_pcFactory getSeff_reliability_pcFactory();

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
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.RecoveryActionBehaviourImpl <em>Recovery Action Behaviour</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.RecoveryActionBehaviourImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.Seff_reliability_pcPackageImpl#getRecoveryActionBehaviour()
       * @generated
       */
      EClass RECOVERY_ACTION_BEHAVIOUR = eINSTANCE.getRecoveryActionBehaviour();

      /**
       * The meta object literal for the '<em><b>Failure Handling Alternatives Recovery Action Behaviour</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR = eINSTANCE.getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour();

      /**
       * The meta object literal for the '<em><b>Recovery Action Recovery Action Behaviour</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR = eINSTANCE.getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.RecoveryActionImpl <em>Recovery Action</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.RecoveryActionImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.Seff_reliability_pcPackageImpl#getRecoveryAction()
       * @generated
       */
      EClass RECOVERY_ACTION = eINSTANCE.getRecoveryAction();

      /**
       * The meta object literal for the '<em><b>Primary Behaviour Recovery Action</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION = eINSTANCE.getRecoveryAction_PrimaryBehaviour__RecoveryAction();

      /**
       * The meta object literal for the '<em><b>Recovery Action Behaviours Recovery Action</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION = eINSTANCE.getRecoveryAction_RecoveryActionBehaviours__RecoveryAction();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.FailureHandlingEntityImpl <em>Failure Handling Entity</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.FailureHandlingEntityImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.Seff_reliability_pcPackageImpl#getFailureHandlingEntity()
       * @generated
       */
      EClass FAILURE_HANDLING_ENTITY = eINSTANCE.getFailureHandlingEntity();

      /**
       * The meta object literal for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = eINSTANCE.getFailureHandlingEntity_FailureTypes_FailureHandlingEntity();

   }

} //Seff_reliability_pcPackage
