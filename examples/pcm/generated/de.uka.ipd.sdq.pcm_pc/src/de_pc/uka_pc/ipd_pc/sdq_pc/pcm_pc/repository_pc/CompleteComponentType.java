/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Complete (Component) types abstract from the realisation of components. They only contain provided and required roles omitting the components’ internal structure, i.e., the service effect specifications or assemblies. Thus, complete types represent a black box view on components. Leaving the implementation open allows for a higher flexibility of software architects and defines substitutability in the PCM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.CompleteComponentType#getParentProvidesComponentTypes <em>Parent Provides Component Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage#getCompleteComponentType()
 * @model
 * @generated
 */
public interface CompleteComponentType extends RepositoryComponent {
   /**
    * Returns the value of the '<em><b>Parent Provides Component Types</b></em>' reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ProvidesComponentType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Provides Component Types</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Provides Component Types</em>' reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage#getCompleteComponentType_ParentProvidesComponentTypes()
    * @model ordered="false"
    * @generated
    */
   EList<ProvidesComponentType> getParentProvidesComponentTypes();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(\r\n\tself.oclIsTypeOf(CompleteComponentType)\r\n\tor\r\n\tself.oclIsTypeOf(ImplementationComponentType)\r\n\tor\r\n\tself.oclIsTypeOf(CompositeComponent)\r\n\tor\r\n\tself.oclIsTypeOf(BasicComponent)\r\n)\r\nimplies\r\n(\r\n\tself.providedRoles_InterfaceProvidingEntity->size() >= 1\r\n\tor\r\n\tself.requiredRoles_InterfaceRequiringEntity->size() >= 1\r\n)'"
    * @generated
    */
   boolean AtLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- CompleteTypes provided Interfaces have to be a superset\r\n-- of ProvidesComponentType provided Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \"lpar2005.pdf\" (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\tacc2->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\tacc4->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t)->union( -- union with anchestors found in former recursion #\r\n--\t\tself.providedRoles->iterate(r : ProvidedRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc6->union(r.providedInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t)\r\n--\t) in\r\n--\t-- Directly provided anchestorInterfaces need to be a superset of provided interfaces of Supertype #\r\n--\tanchestorInterfaces.identifier.id->includesAll(\r\n--\t\tself.parentProvidesComponentTypes->iterate(pt : ProvidesComponentType; acc1 : Bag(String) = Bag{} |\r\n--\t\t\tpt.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(String) = Bag{} |\r\n--\t\t\t\tacc2->union(r.providedInterface.identifier.id->asBag()) -- asBag required to allow Set operations #\r\n--\t\t\t)\r\n--\t\t)\r\n--\t)\r\ntrue'"
    * @generated
    */
   boolean providedInterfacesHaveToConformToProvidedType2(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CompleteComponentType
