/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Fork Action Splits the RDSEFF control flow with an AND-semantic, meaning that it invokes several ForkedBehaviours concurrently.  ForkActions
 * allow both asynchronously and synchronously forked behaviours. Synchronously ForkedBehaviours execute concurrently and the control flow waits for each of these behaviours to terminate before continuing. Each ForkedBehaviour can be considered as a program thread. All parameter characterisations from the surrounding RDSEFF are also valid inside the ForkedBehaviours and can be used to parameterise resource demands or control flow constructs. The parameter characterisations are the same in each ForkedBehaviour. Component developers can use a SynchronisationPoint to join synchronously ForkedBehaviours and specify a result of the computations with its attached VariableUsages. Asynchronously ForkedBehaviours also execute concurrently, but the control flow does not wait for them to terminate and continues immediately after their invocation with the successor action of the ForkAction. Therefore, there is no need for a SynchronisationPoint in this case. It is furthermore not possible to refer to results or output parameters of asynchronously ForkedBehaviours in the rest of the RDSEFF, as it is unclear when these results will be available. The same Fork Action can contain asynchronous and synchronousForkedbehaviours at the same time. In that case, all forked behaviours are started. The control flow waits for all synchronous behaviours to finish execution and only then continues. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ForkAction#getAsynchronousForkedBehaviours_ForkAction <em>Asynchronous Forked Behaviours Fork Action</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ForkAction#getSynchronisingBehaviours_ForkAction <em>Synchronising Behaviours Fork Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getForkAction()
 * @model
 * @generated
 */
public interface ForkAction extends AbstractInternalControlFlowAction {
   /**
    * Returns the value of the '<em><b>Asynchronous Forked Behaviours Fork Action</b></em>' containment reference list.
    * The list contents are of type {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ForkedBehaviour}.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ForkedBehaviour#getForkAction_ForkedBehaivour <em>Fork Action Forked Behaivour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Asynchronous Forked Behaviours Fork Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Asynchronous Forked Behaviours Fork Action</em>' containment reference list.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getForkAction_AsynchronousForkedBehaviours_ForkAction()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ForkedBehaviour#getForkAction_ForkedBehaivour
    * @model opposite="forkAction_ForkedBehaivour" containment="true" ordered="false"
    * @generated
    */
   EList<ForkedBehaviour> getAsynchronousForkedBehaviours_ForkAction();

   /**
    * Returns the value of the '<em><b>Synchronising Behaviours Fork Action</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.SynchronisationPoint#getForkAction_SynchronisationPoint <em>Fork Action Synchronisation Point</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Synchronising Behaviours Fork Action</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Synchronising Behaviours Fork Action</em>' containment reference.
    * @see #setSynchronisingBehaviours_ForkAction(SynchronisationPoint)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getForkAction_SynchronisingBehaviours_ForkAction()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.SynchronisationPoint#getForkAction_SynchronisationPoint
    * @model opposite="forkAction_SynchronisationPoint" containment="true" ordered="false"
    * @generated
    */
   SynchronisationPoint getSynchronisingBehaviours_ForkAction();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ForkAction#getSynchronisingBehaviours_ForkAction <em>Synchronising Behaviours Fork Action</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Synchronising Behaviours Fork Action</em>' containment reference.
    * @see #getSynchronisingBehaviours_ForkAction()
    * @generated
    */
   void setSynchronisingBehaviours_ForkAction(SynchronisationPoint value);

} // ForkAction
