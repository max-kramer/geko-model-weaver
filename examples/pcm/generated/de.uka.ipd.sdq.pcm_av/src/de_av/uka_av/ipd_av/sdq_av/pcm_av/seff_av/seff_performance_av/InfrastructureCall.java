/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.InfrastructureRequiredRole;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.InfrastructureSignature;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.AbstractInternalControlFlowAction;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.CallAction;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.Seff_performance_avPackage#getInfrastructureCall()
 * @model
 * @generated
 */
public interface InfrastructureCall extends CallAction {
   /**
    * Returns the value of the '<em><b>Signature Infrastructure Call</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Signature Infrastructure Call</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Signature Infrastructure Call</em>' reference.
    * @see #setSignature__InfrastructureCall(InfrastructureSignature)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.Seff_performance_avPackage#getInfrastructureCall_Signature__InfrastructureCall()
    * @model ordered="false"
    * @generated
    */
   InfrastructureSignature getSignature__InfrastructureCall();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Signature Infrastructure Call</em>' reference.
    * @see #getSignature__InfrastructureCall()
    * @generated
    */
   void setSignature__InfrastructureCall(InfrastructureSignature value);

   /**
    * Returns the value of the '<em><b>Number Of Calls Infrastructure Call</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getInfrastructureCall__PCMRandomVariable <em>Infrastructure Call PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Number Of Calls Infrastructure Call</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Number Of Calls Infrastructure Call</em>' containment reference.
    * @see #setNumberOfCalls__InfrastructureCall(PCMRandomVariable)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.Seff_performance_avPackage#getInfrastructureCall_NumberOfCalls__InfrastructureCall()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getInfrastructureCall__PCMRandomVariable
    * @model opposite="infrastructureCall__PCMRandomVariable" containment="true" ordered="false"
    * @generated
    */
   PCMRandomVariable getNumberOfCalls__InfrastructureCall();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Number Of Calls Infrastructure Call</em>' containment reference.
    * @see #getNumberOfCalls__InfrastructureCall()
    * @generated
    */
   void setNumberOfCalls__InfrastructureCall(PCMRandomVariable value);

   /**
    * Returns the value of the '<em><b>Action Infrastructure Call</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.AbstractInternalControlFlowAction#getInfrastructureCall__Action <em>Infrastructure Call Action</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Action Infrastructure Call</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Action Infrastructure Call</em>' container reference.
    * @see #setAction__InfrastructureCall(AbstractInternalControlFlowAction)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.Seff_performance_avPackage#getInfrastructureCall_Action__InfrastructureCall()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.AbstractInternalControlFlowAction#getInfrastructureCall__Action
    * @model opposite="infrastructureCall__Action" transient="false" ordered="false"
    * @generated
    */
   AbstractInternalControlFlowAction getAction__InfrastructureCall();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Action Infrastructure Call</em>' container reference.
    * @see #getAction__InfrastructureCall()
    * @generated
    */
   void setAction__InfrastructureCall(AbstractInternalControlFlowAction value);

   /**
    * Returns the value of the '<em><b>Required Role Infrastructure Call</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Required Role Infrastructure Call</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Required Role Infrastructure Call</em>' reference.
    * @see #setRequiredRole__InfrastructureCall(InfrastructureRequiredRole)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.Seff_performance_avPackage#getInfrastructureCall_RequiredRole__InfrastructureCall()
    * @model ordered="false"
    * @generated
    */
   InfrastructureRequiredRole getRequiredRole__InfrastructureCall();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.InfrastructureCall#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Role Infrastructure Call</em>' reference.
    * @see #getRequiredRole__InfrastructureCall()
    * @generated
    */
   void setRequiredRole__InfrastructureCall(InfrastructureRequiredRole value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='signature__InfrastructureCall.infrastructureInterface__InfrastructureSignature = requiredRole__InfrastructureCall.requiredInterface__InfrastructureRequiredRole'"
    * @generated
    */
   boolean SignatureMustBelongToUsedRequiredRole(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(pcm::core::entity::InterfaceRequiringEntity)).oclAsType(pcm::core::entity::InterfaceRequiringEntity).requiredRoles_InterfaceRequiringEntity->includes(self.requiredRole__InfrastructureCall)'"
    * @generated
    */
   boolean ReferencedRequiredRoleMustBeRequiredByComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.action__InfrastructureCall.infrastructureCall__Action->select(call | call.requiredRole__InfrastructureCall = self.requiredRole__InfrastructureCall and call.signature__InfrastructureCall=self.signature__InfrastructureCall)->size() = 1'"
    * @generated
    */
   boolean SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InfrastructureCall
