/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableUsage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronisation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Component developers can use a SynchronisationPoint to join synchronously ForkedBehaviours and specify a result of the computations with its attached VariableUsages.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.SynchronisationPoint#getOutputParameterUsage_SynchronisationPoint <em>Output Parameter Usage Synchronisation Point</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.SynchronisationPoint#getForkAction_SynchronisationPoint <em>Fork Action Synchronisation Point</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint <em>Synchronous Forked Behaviours Synchronisation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getSynchronisationPoint()
 * @model
 * @generated
 */
public interface SynchronisationPoint extends EObject {
   /**
    * Returns the value of the '<em><b>Output Parameter Usage Synchronisation Point</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableUsage}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableUsage#getSynchronisationPoint_VariableUsage <em>Synchronisation Point Variable Usage</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Output Parameter Usage Synchronisation Point</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Output Parameter Usage Synchronisation Point</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableUsage#getSynchronisationPoint_VariableUsage
    * @model opposite="synchronisationPoint_VariableUsage" containment="true" ordered="false"
    * @generated
    */
   EList<VariableUsage> getOutputParameterUsage_SynchronisationPoint();

   /**
    * Returns the value of the '<em><b>Fork Action Synchronisation Point</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkAction#getSynchronisingBehaviours_ForkAction <em>Synchronising Behaviours Fork Action</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Fork Action Synchronisation Point</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Fork Action Synchronisation Point</em>' container reference.
    * @see #setForkAction_SynchronisationPoint(ForkAction)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getSynchronisationPoint_ForkAction_SynchronisationPoint()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkAction#getSynchronisingBehaviours_ForkAction
    * @model opposite="synchronisingBehaviours_ForkAction" transient="false" ordered="false"
    * @generated
    */
   ForkAction getForkAction_SynchronisationPoint();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.SynchronisationPoint#getForkAction_SynchronisationPoint <em>Fork Action Synchronisation Point</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Fork Action Synchronisation Point</em>' container reference.
    * @see #getForkAction_SynchronisationPoint()
    * @generated
    */
   void setForkAction_SynchronisationPoint(ForkAction value);

   /**
    * Returns the value of the '<em><b>Synchronous Forked Behaviours Synchronisation Point</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkedBehaviour}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour <em>Synchronisation Point Forked Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Synchronous Forked Behaviours Synchronisation Point</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Synchronous Forked Behaviours Synchronisation Point</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getSynchronisationPoint_SynchronousForkedBehaviours_SynchronisationPoint()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour
    * @model opposite="synchronisationPoint_ForkedBehaviour" containment="true" ordered="false"
    * @generated
    */
   EList<ForkedBehaviour> getSynchronousForkedBehaviours_SynchronisationPoint();

} // SynchronisationPoint
