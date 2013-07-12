/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AbstractActions&nbsp;model&nbsp;either&nbsp;a&nbsp;service's&nbsp;internal&nbsp;computations&nbsp;or&nbsp;calls&nbsp;to&nbsp;external&nbsp;(i.e.,&nbsp;required)&nbsp;services,&nbsp;or&nbsp;describe&nbsp;some&nbsp;form&nbsp;of&nbsp;control&nbsp;flow&nbsp;alteration&nbsp;(i.e.,&nbsp;branching,&nbsp;loop,&nbsp;or&nbsp;fork).&nbsp;The&nbsp;following&nbsp;first&nbsp;clarifies&nbsp;the&nbsp;notions&nbsp;of&nbsp;internal&nbsp;and&nbsp;external&nbsp;actions,&nbsp;whose&nbsp;meta-classes&nbsp;both&nbsp;inherit&nbsp;from&nbsp;AbstractAction.<br />
 * The&nbsp;RDSEFF&nbsp;defines&nbsp;the&nbsp;control&nbsp;flow&nbsp;between&nbsp;internal&nbsp;and&nbsp;external&nbsp;actions&nbsp;with&nbsp;the&nbsp;predecessor/successor&nbsp;relationship&nbsp;between&nbsp;AbstractActions&nbsp;to&nbsp;model&nbsp;sequential&nbsp;executions.&nbsp;Additionally,&nbsp;special&nbsp;actions&nbsp;for&nbsp;branching,&nbsp;loops,&nbsp;and&nbsp;forks&nbsp;allow&nbsp;other&nbsp;kinds&nbsp;of&nbsp;control&nbsp;flow.&nbsp;Other&nbsp;than&nbsp;flowcharts&nbsp;or&nbsp;UML&nbsp;activity&nbsp;diagrams,&nbsp;the&nbsp;RDSEFF&nbsp;language&nbsp;(as&nbsp;well&nbsp;as&nbsp;the&nbsp;usage&nbsp;model&nbsp;language)&nbsp;requires&nbsp;developers&nbsp;to&nbsp;make&nbsp;the&nbsp;branching,&nbsp;loop,&nbsp;fork&nbsp;bodies&nbsp;explicit&nbsp;using&nbsp;nested&nbsp;ResourceDemandingBehaviours.&nbsp;It&nbsp;disallows&nbsp;backward&nbsp;references&nbsp;in&nbsp;the&nbsp;chain&nbsp;of&nbsp;AbstractActions,&nbsp;which&nbsp;are&nbsp;basically<br />
 * goto&nbsp;statements&nbsp;and&nbsp;can&nbsp;lead&nbsp;to&nbsp;ambiguities&nbsp;and&nbsp;difficult&nbsp;maintainability.&nbsp;For&nbsp;example,&nbsp;this&nbsp;might&nbsp;lead&nbsp;to&nbsp;intertwined&nbsp;control&nbsp;flows&nbsp;as&nbsp;in&nbsp;the&nbsp;example&nbsp;in&nbsp;Fig.&nbsp;4.9(a),&nbsp;where&nbsp;both&nbsp;the&nbsp;sequences&nbsp;'abcabcdbcd'&nbsp;and&nbsp;'abcdbcabcd'&nbsp;could&nbsp;be&nbsp;occur&nbsp;if&nbsp;each&nbsp;backward&nbsp;reference&nbsp;is&nbsp;executed&nbsp;once,&nbsp;which&nbsp;might&nbsp;lead&nbsp;to&nbsp;different&nbsp;execution&nbsp;times.&nbsp;Backward&nbsp;references&nbsp;also&nbsp;allow&nbsp;the&nbsp;specification&nbsp;of&nbsp;loops&nbsp;with&nbsp;multiple&nbsp;entry&nbsp;points&nbsp;as&nbsp;in&nbsp;Fig.&nbsp;4.9(b).&nbsp;This&nbsp;is&nbsp;not&nbsp;desirable,&nbsp;as&nbsp;the&nbsp;number&nbsp;of&nbsp;loop&nbsp;iterations&nbsp;cannot&nbsp;be&nbsp;specified&nbsp;directly&nbsp;in&nbsp;these&nbsp;cases,&nbsp;which&nbsp;is&nbsp;however&nbsp;necessary&nbsp;for&nbsp;accurate&nbsp;performance&nbsp;prediction.&nbsp;If&nbsp;a&nbsp;developer&nbsp;would&nbsp;specify&nbsp;that&nbsp;each&nbsp;backward&nbsp;link&nbsp;in&nbsp;Fig.&nbsp;4.9(b)&nbsp;is&nbsp;executed&nbsp;only&nbsp;once,&nbsp;both&nbsp;sequences&nbsp;'ababc'&nbsp;and&nbsp;'abcababc'&nbsp;would&nbsp;be&nbsp;possible&nbsp;although&nbsp;they&nbsp;would&nbsp;have&nbsp;different&nbsp;execution&nbsp;times,&nbsp;as&nbsp;'a'&nbsp;is&nbsp;executed&nbsp;three&nbsp;times&nbsp;in&nbsp;the&nbsp;latter&nbsp;case.&nbsp;To&nbsp;avoid&nbsp;such&nbsp;ambiguities,&nbsp;control&nbsp;flow&nbsp;in&nbsp;the&nbsp;PCM&nbsp;RDSEFF&nbsp;and&nbsp;usage&nbsp;model&nbsp;must&nbsp;be&nbsp;specified&nbsp;without&nbsp;backward&nbsp;references&nbsp;in&nbsp;the&nbsp;chain&nbsp;of&nbsp;AbstractActions.&nbsp;Branches,&nbsp;loops,&nbsp;forks,&nbsp;and&nbsp;their&nbsp;respective&nbsp;bodies&nbsp;have&nbsp;to&nbsp;be&nbsp;made&nbsp;explicit&nbsp;in&nbsp;the&nbsp;specification&nbsp;using&nbsp;nested&nbsp;ResourceDemandingBehaviours.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getPredecessor_AbstractAction <em>Predecessor Abstract Action</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getSuccessor_AbstractAction <em>Successor Abstract Action</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getResourceDemandingBehaviour_AbstractAction <em>Resource Demanding Behaviour Abstract Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage#getAbstractAction()
 * @model
 * @generated
 */
public interface AbstractAction extends Entity {
   /**
    * Returns the value of the '<em><b>Predecessor Abstract Action</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getSuccessor_AbstractAction <em>Successor Abstract Action</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Predecessor Abstract Action</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Predecessor Abstract Action</em>' reference.
    * @see #setPredecessor_AbstractAction(AbstractAction)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage#getAbstractAction_Predecessor_AbstractAction()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getSuccessor_AbstractAction
    * @model opposite="successor_AbstractAction" ordered="false"
    * @generated
    */
   AbstractAction getPredecessor_AbstractAction();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getPredecessor_AbstractAction <em>Predecessor Abstract Action</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Predecessor Abstract Action</em>' reference.
    * @see #getPredecessor_AbstractAction()
    * @generated
    */
   void setPredecessor_AbstractAction(AbstractAction value);

   /**
    * Returns the value of the '<em><b>Successor Abstract Action</b></em>' reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getPredecessor_AbstractAction <em>Predecessor Abstract Action</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Successor Abstract Action</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Successor Abstract Action</em>' reference.
    * @see #setSuccessor_AbstractAction(AbstractAction)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage#getAbstractAction_Successor_AbstractAction()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getPredecessor_AbstractAction
    * @model opposite="predecessor_AbstractAction" ordered="false"
    * @generated
    */
   AbstractAction getSuccessor_AbstractAction();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getSuccessor_AbstractAction <em>Successor Abstract Action</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Successor Abstract Action</em>' reference.
    * @see #getSuccessor_AbstractAction()
    * @generated
    */
   void setSuccessor_AbstractAction(AbstractAction value);

   /**
    * Returns the value of the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ResourceDemandingBehaviour#getSteps_Behaviour <em>Steps Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Demanding Behaviour Abstract Action</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Demanding Behaviour Abstract Action</em>' container reference.
    * @see #setResourceDemandingBehaviour_AbstractAction(ResourceDemandingBehaviour)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage#getAbstractAction_ResourceDemandingBehaviour_AbstractAction()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ResourceDemandingBehaviour#getSteps_Behaviour
    * @model opposite="steps_Behaviour" transient="false" ordered="false"
    * @generated
    */
   ResourceDemandingBehaviour getResourceDemandingBehaviour_AbstractAction();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction#getResourceDemandingBehaviour_AbstractAction <em>Resource Demanding Behaviour Abstract Action</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Demanding Behaviour Abstract Action</em>' container reference.
    * @see #getResourceDemandingBehaviour_AbstractAction()
    * @generated
    */
   void setResourceDemandingBehaviour_AbstractAction(ResourceDemandingBehaviour value);

} // AbstractAction
