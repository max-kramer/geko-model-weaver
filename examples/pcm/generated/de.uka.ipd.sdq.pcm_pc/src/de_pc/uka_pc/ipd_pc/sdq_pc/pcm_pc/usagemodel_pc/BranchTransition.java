/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The BranchTransition is an association class that realises the containment of ScenarioBehaviours in in the branches of a Branch action. It is a separate meta class because it has the additional attribute branchProbability that specifies how probably it is that the references ScenarioBehaviour is executed in the Branch action. 
 * 
 * See also Branch.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.BranchTransition#getBranchProbability <em>Branch Probability</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.BranchTransition#getBranch_BranchTransition <em>Branch Branch Transition</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.BranchTransition#getBranchedBehaviour_BranchTransition <em>Branched Behaviour Branch Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcPackage#getBranchTransition()
 * @model
 * @generated
 */
public interface BranchTransition extends EObject {
   /**
    * Returns the value of the '<em><b>Branch Probability</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Branch Probability</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Branch Probability</em>' attribute.
    * @see #setBranchProbability(double)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcPackage#getBranchTransition_BranchProbability()
    * @model required="true" ordered="false"
    * @generated
    */
   double getBranchProbability();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.BranchTransition#getBranchProbability <em>Branch Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Branch Probability</em>' attribute.
    * @see #getBranchProbability()
    * @generated
    */
   void setBranchProbability(double value);

   /**
    * Returns the value of the '<em><b>Branch Branch Transition</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Branch#getBranchTransitions_Branch <em>Branch Transitions Branch</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Branch Branch Transition</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Branch Branch Transition</em>' container reference.
    * @see #setBranch_BranchTransition(Branch)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcPackage#getBranchTransition_Branch_BranchTransition()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Branch#getBranchTransitions_Branch
    * @model opposite="branchTransitions_Branch" transient="false" ordered="false"
    * @generated
    */
   Branch getBranch_BranchTransition();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.BranchTransition#getBranch_BranchTransition <em>Branch Branch Transition</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Branch Branch Transition</em>' container reference.
    * @see #getBranch_BranchTransition()
    * @generated
    */
   void setBranch_BranchTransition(Branch value);

   /**
    * Returns the value of the '<em><b>Branched Behaviour Branch Transition</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.ScenarioBehaviour#getBranchTransition_ScenarioBehaviour <em>Branch Transition Scenario Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Branched Behaviour Branch Transition</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Branched Behaviour Branch Transition</em>' containment reference.
    * @see #setBranchedBehaviour_BranchTransition(ScenarioBehaviour)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcPackage#getBranchTransition_BranchedBehaviour_BranchTransition()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.ScenarioBehaviour#getBranchTransition_ScenarioBehaviour
    * @model opposite="branchTransition_ScenarioBehaviour" containment="true" ordered="false"
    * @generated
    */
   ScenarioBehaviour getBranchedBehaviour_BranchTransition();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.BranchTransition#getBranchedBehaviour_BranchTransition <em>Branched Behaviour Branch Transition</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Branched Behaviour Branch Transition</em>' containment reference.
    * @see #getBranchedBehaviour_BranchTransition()
    * @generated
    */
   void setBranchedBehaviour_BranchTransition(ScenarioBehaviour value);

} // BranchTransition
