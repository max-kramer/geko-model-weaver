/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Internal Control Flow Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Abstract parent class of any internal control flow (e.g. InternalAction)
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.AbstractInternalControlFlowAction#getResourceDemand_Action <em>Resource Demand Action</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.AbstractInternalControlFlowAction#getInfrastructureCall__Action <em>Infrastructure Call Action</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.AbstractInternalControlFlowAction#getResourceCall__Action <em>Resource Call Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getAbstractInternalControlFlowAction()
 * @model
 * @generated
 */
public interface AbstractInternalControlFlowAction extends AbstractAction {
   /**
    * Returns the value of the '<em><b>Resource Demand Action</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Demand Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Demand Action</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getAbstractInternalControlFlowAction_ResourceDemand_Action()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ParametricResourceDemand#getAction_ParametricResourceDemand
    * @model opposite="action_ParametricResourceDemand" containment="true" ordered="false"
    * @generated
    */
   EList<ParametricResourceDemand> getResourceDemand_Action();

   /**
    * Returns the value of the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Infrastructure Call Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Infrastructure Call Action</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getAbstractInternalControlFlowAction_InfrastructureCall__Action()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getAction__InfrastructureCall
    * @model opposite="action__InfrastructureCall" containment="true" ordered="false"
    * @generated
    */
   EList<InfrastructureCall> getInfrastructureCall__Action();

   /**
    * Returns the value of the '<em><b>Resource Call Action</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getAction__ResourceCall <em>Action Resource Call</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Call Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Call Action</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getAbstractInternalControlFlowAction_ResourceCall__Action()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.ResourceCall#getAction__ResourceCall
    * @model opposite="action__ResourceCall" containment="true" ordered="false"
    * @generated
    */
   EList<ResourceCall> getResourceCall__Action();

} // AbstractInternalControlFlowAction
