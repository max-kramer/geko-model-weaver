/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Demanding Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Models the behaviour of a component service as a sequence of internal actions with resource demands, control flow constructs, and external
 * calls. Therefore, the class contains a chain of AbstractActions. The emphasis in this type of behaviour is on the resource demands attached to internal actions, which mainly influence performance analysis.
 * Each action in a ResourceDemandingBehaviour references a predecessor and a successor action. Exceptions are the first and last action, which do not reference a predecessor and a successor respectively. A behaviour is valid, if there is a continuous path from the first to last action, which includes all actions. The chain must not include cycles. To specify control flow branches, loops, or forks, component developers need to use special types of actions, which contain nested inner ResourceDemandingBehaviours to specify the behaviour inside branches or loop bodies. Any ResourceDemandingBehaviour can have at most one starting and one finishing action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ResourceDemandingBehaviour#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ResourceDemandingBehaviour#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ResourceDemandingBehaviour#getSteps_Behaviour <em>Steps Behaviour</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getResourceDemandingBehaviour()
 * @model
 * @generated
 */
public interface ResourceDemandingBehaviour extends Identifier {
   /**
    * Returns the value of the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractLoopAction#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Abstract Loop Action Resource Demanding Behaviour</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Abstract Loop Action Resource Demanding Behaviour</em>' container reference.
    * @see #setAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getResourceDemandingBehaviour_AbstractLoopAction_ResourceDemandingBehaviour()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractLoopAction#getBodyBehaviour_Loop
    * @model opposite="bodyBehaviour_Loop" transient="false" ordered="false"
    * @generated
    */
   AbstractLoopAction getAbstractLoopAction_ResourceDemandingBehaviour();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ResourceDemandingBehaviour#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Abstract Loop Action Resource Demanding Behaviour</em>' container reference.
    * @see #getAbstractLoopAction_ResourceDemandingBehaviour()
    * @generated
    */
   void setAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction value);

   /**
    * Returns the value of the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractBranchTransition#getBranchBehaviour_BranchTransition <em>Branch Behaviour Branch Transition</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Abstract Branch Transition Resource Demanding Behaviour</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Abstract Branch Transition Resource Demanding Behaviour</em>' container reference.
    * @see #setAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getResourceDemandingBehaviour_AbstractBranchTransition_ResourceDemandingBehaviour()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractBranchTransition#getBranchBehaviour_BranchTransition
    * @model opposite="branchBehaviour_BranchTransition" transient="false" ordered="false"
    * @generated
    */
   AbstractBranchTransition getAbstractBranchTransition_ResourceDemandingBehaviour();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.ResourceDemandingBehaviour#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Abstract Branch Transition Resource Demanding Behaviour</em>' container reference.
    * @see #getAbstractBranchTransition_ResourceDemandingBehaviour()
    * @generated
    */
   void setAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition value);

   /**
    * Returns the value of the '<em><b>Steps Behaviour</b></em>' containment reference list.
    * The list contents are of type {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractAction}.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractAction#getResourceDemandingBehaviour_AbstractAction <em>Resource Demanding Behaviour Abstract Action</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Steps Behaviour</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Steps Behaviour</em>' containment reference list.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.Seff_av_avPackage#getResourceDemandingBehaviour_Steps_Behaviour()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.AbstractAction#getResourceDemandingBehaviour_AbstractAction
    * @model opposite="resourceDemandingBehaviour_AbstractAction" containment="true" ordered="false"
    * @generated
    */
   EList<AbstractAction> getSteps_Behaviour();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.steps_Behaviour->select(s|s.oclIsTypeOf(StopAction))->size() = 1'"
    * @generated
    */
   boolean ExactlyOneStopAction(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.steps_Behaviour->select(s|s.oclIsTypeOf(StartAction))->size() = 1'"
    * @generated
    */
   boolean ExactlyOneStartAction(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.steps_Behaviour->select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))->exists(a|a.oclAsType(AbstractAction).predecessor_AbstractAction.oclIsUndefined()) and not self.steps_Behaviour->select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))->exists(a|a.oclAsType(AbstractAction).successor_AbstractAction.oclIsUndefined())'"
    * @generated
    */
   boolean EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ResourceDemandingBehaviour
