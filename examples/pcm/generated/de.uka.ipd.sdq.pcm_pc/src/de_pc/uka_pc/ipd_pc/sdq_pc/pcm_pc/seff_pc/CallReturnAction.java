/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Return Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic class realising call relations between behaviours (e.g. method call) for calls with parameters send to the called signature and return values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.CallReturnAction#getReturnVariableUsage__CallReturnAction <em>Return Variable Usage Call Return Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage#getCallReturnAction()
 * @model
 * @generated
 */
public interface CallReturnAction extends CallAction {
   /**
    * Returns the value of the '<em><b>Return Variable Usage Call Return Action</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage}.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage#getCallReturnAction__VariableUsage <em>Call Return Action Variable Usage</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Return Variable Usage Call Return Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Return Variable Usage Call Return Action</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage#getCallReturnAction_ReturnVariableUsage__CallReturnAction()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage#getCallReturnAction__VariableUsage
    * @model opposite="callReturnAction__VariableUsage" containment="true" ordered="false"
    * @generated
    */
   EList<VariableUsage> getReturnVariableUsage__CallReturnAction();

} // CallReturnAction
