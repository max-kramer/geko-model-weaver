/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Two types of branch transitions exist which correspond to the two types of branches. The types cannot be mixed. Either all branch transitions of one BranchAction are probabilistic or guarded.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractBranchTransition#getBranchAction_AbstractBranchTransition <em>Branch Action Abstract Branch Transition</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractBranchTransition#getBranchBehaviour_BranchTransition <em>Branch Behaviour Branch Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getAbstractBranchTransition()
 * @model
 * @generated
 */
public interface AbstractBranchTransition extends Entity {
   /**
    * Returns the value of the '<em><b>Branch Action Abstract Branch Transition</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.BranchAction#getBranches_Branch <em>Branches Branch</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Branch Action Abstract Branch Transition</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Branch Action Abstract Branch Transition</em>' container reference.
    * @see #setBranchAction_AbstractBranchTransition(BranchAction)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getAbstractBranchTransition_BranchAction_AbstractBranchTransition()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.BranchAction#getBranches_Branch
    * @model opposite="branches_Branch" transient="false" ordered="false"
    * @generated
    */
   BranchAction getBranchAction_AbstractBranchTransition();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractBranchTransition#getBranchAction_AbstractBranchTransition <em>Branch Action Abstract Branch Transition</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Branch Action Abstract Branch Transition</em>' container reference.
    * @see #getBranchAction_AbstractBranchTransition()
    * @generated
    */
   void setBranchAction_AbstractBranchTransition(BranchAction value);

   /**
    * Returns the value of the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ResourceDemandingBehaviour#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Branch Behaviour Branch Transition</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Branch Behaviour Branch Transition</em>' containment reference.
    * @see #setBranchBehaviour_BranchTransition(ResourceDemandingBehaviour)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getAbstractBranchTransition_BranchBehaviour_BranchTransition()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ResourceDemandingBehaviour#getAbstractBranchTransition_ResourceDemandingBehaviour
    * @model opposite="abstractBranchTransition_ResourceDemandingBehaviour" containment="true" ordered="false"
    * @generated
    */
   ResourceDemandingBehaviour getBranchBehaviour_BranchTransition();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractBranchTransition#getBranchBehaviour_BranchTransition <em>Branch Behaviour Branch Transition</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Branch Behaviour Branch Transition</em>' containment reference.
    * @see #getBranchBehaviour_BranchTransition()
    * @generated
    */
   void setBranchBehaviour_BranchTransition(ResourceDemandingBehaviour value);

} // AbstractBranchTransition
