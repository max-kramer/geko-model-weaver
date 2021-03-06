/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.InfrastructureCall;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ParametricResourceDemand;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ResourceCall;

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
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.AbstractInternalControlFlowAction#getResourceDemand_Action <em>Resource Demand Action</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.AbstractInternalControlFlowAction#getInfrastructureCall__Action <em>Infrastructure Call Action</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.AbstractInternalControlFlowAction#getResourceCall__Action <em>Resource Call Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage#getAbstractInternalControlFlowAction()
 * @model
 * @generated
 */
public interface AbstractInternalControlFlowAction extends AbstractAction {
   /**
    * Returns the value of the '<em><b>Resource Demand Action</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ParametricResourceDemand}.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ParametricResourceDemand#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Demand Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Demand Action</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage#getAbstractInternalControlFlowAction_ResourceDemand_Action()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ParametricResourceDemand#getAction_ParametricResourceDemand
    * @model opposite="action_ParametricResourceDemand" containment="true" ordered="false"
    * @generated
    */
   EList<ParametricResourceDemand> getResourceDemand_Action();

   /**
    * Returns the value of the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.InfrastructureCall}.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Infrastructure Call Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Infrastructure Call Action</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage#getAbstractInternalControlFlowAction_InfrastructureCall__Action()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.InfrastructureCall#getAction__InfrastructureCall
    * @model opposite="action__InfrastructureCall" containment="true" ordered="false"
    * @generated
    */
   EList<InfrastructureCall> getInfrastructureCall__Action();

   /**
    * Returns the value of the '<em><b>Resource Call Action</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ResourceCall}.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ResourceCall#getAction__ResourceCall <em>Action Resource Call</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Call Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Call Action</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage#getAbstractInternalControlFlowAction_ResourceCall__Action()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ResourceCall#getAction__ResourceCall
    * @model opposite="action__ResourceCall" containment="true" ordered="false"
    * @generated
    */
   EList<ResourceCall> getResourceCall__Action();

} // AbstractInternalControlFlowAction
