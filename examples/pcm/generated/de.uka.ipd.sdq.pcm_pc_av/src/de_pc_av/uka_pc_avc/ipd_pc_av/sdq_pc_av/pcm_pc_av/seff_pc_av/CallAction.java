/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableUsage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic class realising call relations between behaviours (e.g. method call).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.CallAction#getInputVariableUsages__CallAction <em>Input Variable Usages Call Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage#getCallAction()
 * @model
 * @generated
 */
public interface CallAction extends EObject {
   /**
    * Returns the value of the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableUsage}.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableUsage#getCallAction__VariableUsage <em>Call Action Variable Usage</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Input Variable Usages Call Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Input Variable Usages Call Action</em>' containment reference list.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage#getCallAction_InputVariableUsages__CallAction()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.VariableUsage#getCallAction__VariableUsage
    * @model opposite="callAction__VariableUsage" containment="true" ordered="false"
    * @generated
    */
   EList<VariableUsage> getInputVariableUsages__CallAction();

} // CallAction
