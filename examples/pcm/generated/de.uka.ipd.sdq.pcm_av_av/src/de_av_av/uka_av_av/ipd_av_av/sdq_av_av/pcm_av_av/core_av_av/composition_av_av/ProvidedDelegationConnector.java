/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.OperationProvidedRole;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProvidedDelegationConnector delegates incoming calls of provided roles to inner provided roles of encapsulated assembly
 * contexts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedDelegationConnector#getInnerProvidedRole_ProvidedDelegationConnector <em>Inner Provided Role Provided Delegation Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedDelegationConnector#getOuterProvidedRole_ProvidedDelegationConnector <em>Outer Provided Role Provided Delegation Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedDelegationConnector#getAssemblyContext_ProvidedDelegationConnector <em>Assembly Context Provided Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getProvidedDelegationConnector()
 * @model
 * @generated
 */
public interface ProvidedDelegationConnector extends DelegationConnector {
   /**
    * Returns the value of the '<em><b>Inner Provided Role Provided Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Inner Provided Role Provided Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Inner Provided Role Provided Delegation Connector</em>' reference.
    * @see #setInnerProvidedRole_ProvidedDelegationConnector(OperationProvidedRole)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getProvidedDelegationConnector_InnerProvidedRole_ProvidedDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   OperationProvidedRole getInnerProvidedRole_ProvidedDelegationConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedDelegationConnector#getInnerProvidedRole_ProvidedDelegationConnector <em>Inner Provided Role Provided Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Inner Provided Role Provided Delegation Connector</em>' reference.
    * @see #getInnerProvidedRole_ProvidedDelegationConnector()
    * @generated
    */
   void setInnerProvidedRole_ProvidedDelegationConnector(OperationProvidedRole value);

   /**
    * Returns the value of the '<em><b>Outer Provided Role Provided Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Outer Provided Role Provided Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Outer Provided Role Provided Delegation Connector</em>' reference.
    * @see #setOuterProvidedRole_ProvidedDelegationConnector(OperationProvidedRole)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getProvidedDelegationConnector_OuterProvidedRole_ProvidedDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   OperationProvidedRole getOuterProvidedRole_ProvidedDelegationConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedDelegationConnector#getOuterProvidedRole_ProvidedDelegationConnector <em>Outer Provided Role Provided Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Outer Provided Role Provided Delegation Connector</em>' reference.
    * @see #getOuterProvidedRole_ProvidedDelegationConnector()
    * @generated
    */
   void setOuterProvidedRole_ProvidedDelegationConnector(OperationProvidedRole value);

   /**
    * Returns the value of the '<em><b>Assembly Context Provided Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Assembly Context Provided Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Assembly Context Provided Delegation Connector</em>' reference.
    * @see #setAssemblyContext_ProvidedDelegationConnector(AssemblyContext)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getProvidedDelegationConnector_AssemblyContext_ProvidedDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getAssemblyContext_ProvidedDelegationConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedDelegationConnector#getAssemblyContext_ProvidedDelegationConnector <em>Assembly Context Provided Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Assembly Context Provided Delegation Connector</em>' reference.
    * @see #getAssemblyContext_ProvidedDelegationConnector()
    * @generated
    */
   void setAssemblyContext_ProvidedDelegationConnector(AssemblyContext value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parentStructure__Connector = self.assemblyContext_ProvidedDelegationConnector.parentStructure__AssemblyContext'"
    * @generated
    */
   boolean ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.innerProvidedRole_ProvidedDelegationConnector.providingEntity_ProvidedRole = self.assemblyContext_ProvidedDelegationConnector.encapsulatedComponent__AssemblyContext'"
    * @generated
    */
   boolean ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ProvidedDelegationConnector
