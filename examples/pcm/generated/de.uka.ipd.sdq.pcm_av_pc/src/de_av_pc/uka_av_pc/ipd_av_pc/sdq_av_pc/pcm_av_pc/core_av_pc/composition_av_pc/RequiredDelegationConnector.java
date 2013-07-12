/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.OperationRequiredRole;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RequiredDelegationConnector delegates required roles of encapsulated assembly contexts to&nbsp;outer&nbsp;required roles
 * .
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.RequiredDelegationConnector#getInnerRequiredRole_RequiredDelegationConnector <em>Inner Required Role Required Delegation Connector</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.RequiredDelegationConnector#getOuterRequiredRole_RequiredDelegationConnector <em>Outer Required Role Required Delegation Connector</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.RequiredDelegationConnector#getAssemblyContext_RequiredDelegationConnector <em>Assembly Context Required Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage#getRequiredDelegationConnector()
 * @model
 * @generated
 */
public interface RequiredDelegationConnector extends DelegationConnector {
   /**
    * Returns the value of the '<em><b>Inner Required Role Required Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Inner Required Role Required Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Inner Required Role Required Delegation Connector</em>' reference.
    * @see #setInnerRequiredRole_RequiredDelegationConnector(OperationRequiredRole)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage#getRequiredDelegationConnector_InnerRequiredRole_RequiredDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   OperationRequiredRole getInnerRequiredRole_RequiredDelegationConnector();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.RequiredDelegationConnector#getInnerRequiredRole_RequiredDelegationConnector <em>Inner Required Role Required Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Inner Required Role Required Delegation Connector</em>' reference.
    * @see #getInnerRequiredRole_RequiredDelegationConnector()
    * @generated
    */
   void setInnerRequiredRole_RequiredDelegationConnector(OperationRequiredRole value);

   /**
    * Returns the value of the '<em><b>Outer Required Role Required Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Outer Required Role Required Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Outer Required Role Required Delegation Connector</em>' reference.
    * @see #setOuterRequiredRole_RequiredDelegationConnector(OperationRequiredRole)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage#getRequiredDelegationConnector_OuterRequiredRole_RequiredDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   OperationRequiredRole getOuterRequiredRole_RequiredDelegationConnector();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.RequiredDelegationConnector#getOuterRequiredRole_RequiredDelegationConnector <em>Outer Required Role Required Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Outer Required Role Required Delegation Connector</em>' reference.
    * @see #getOuterRequiredRole_RequiredDelegationConnector()
    * @generated
    */
   void setOuterRequiredRole_RequiredDelegationConnector(OperationRequiredRole value);

   /**
    * Returns the value of the '<em><b>Assembly Context Required Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Assembly Context Required Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Assembly Context Required Delegation Connector</em>' reference.
    * @see #setAssemblyContext_RequiredDelegationConnector(AssemblyContext)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage#getRequiredDelegationConnector_AssemblyContext_RequiredDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getAssemblyContext_RequiredDelegationConnector();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.RequiredDelegationConnector#getAssemblyContext_RequiredDelegationConnector <em>Assembly Context Required Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Assembly Context Required Delegation Connector</em>' reference.
    * @see #getAssemblyContext_RequiredDelegationConnector()
    * @generated
    */
   void setAssemblyContext_RequiredDelegationConnector(AssemblyContext value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parentStructure__Connector = self.assemblyContext_RequiredDelegationConnector.parentStructure__AssemblyContext'"
    * @generated
    */
   boolean RequiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.innerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole = self.assemblyContext_RequiredDelegationConnector.encapsulatedComponent__AssemblyContext'"
    * @generated
    */
   boolean ComponentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.outerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole=self.parentStructure__Connector'"
    * @generated
    */
   boolean RequiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RequiredDelegationConnector
