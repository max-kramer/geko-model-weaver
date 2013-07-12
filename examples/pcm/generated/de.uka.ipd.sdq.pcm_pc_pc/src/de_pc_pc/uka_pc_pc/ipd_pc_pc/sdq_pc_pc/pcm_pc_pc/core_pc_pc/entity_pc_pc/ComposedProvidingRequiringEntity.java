/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ComposedStructure;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Providing Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ComposedProvidingRequiringEntity combines the properties of an InterfaceProvidingRequiringEntity and a ComposedStructure. It is inherited by all classes that, on the one hand,  claim to implement the functionality specified in an interface as well as to request that functionality, and, on the other hand, are composed out of some inner entities. 
 * 
 * Valid ComposedProvidingRequiringEntities need to have their ProvidedRoles bound to ProvidedRoles of the contained entities.  
 * 
 * Prominent examples are System, SubSystem, and CompositeComponents
 * 
 * TODO/FIXME: The distinction between ComposedStructure and ComposedProvidingRequiringStructure does not make sense at the moment, because the ComposedStructure already talks about inner provided / required delegation connectors, which only make sense if there are outer roles for interfaces -> ComposedProvidingRequiringStructure. IDEA: Move the delegation connector attributes to ComposedProvidingRequiringStructure. I'm not sure about the assembly connectors. SEE ALSO: ComposedStructure 
 * However, as AssemblyContexts of ComposedStructure always contain InterfaceProvidingRequiringEntities at the moment, the above might not help... and we may just want to merge the meta classes. --Anne
 * <!-- end-model-doc -->
 *
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage#getComposedProvidingRequiringEntity()
 * @model
 * @generated
 */
public interface ComposedProvidingRequiringEntity extends ComposedStructure, InterfaceProvidingRequiringEntity {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This constraint ensures that all outer provided roles of a system have a provided delegation conector that binds them to something. It does not check whether the binding is correct (inner role not null and matching interfaces).
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.providedRoles_InterfaceProvidingEntity->forAll(role|self.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::ProvidedDelegationConnector)).oclAsType(pcm::core::composition::ProvidedDelegationConnector)->exists(connector|connector.outerProvidedRole_ProvidedDelegationConnector = role))\r\n\r\n'"
    * @generated
    */
   boolean ProvidedRolesMustBeBound(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ComposedProvidingRequiringEntity
