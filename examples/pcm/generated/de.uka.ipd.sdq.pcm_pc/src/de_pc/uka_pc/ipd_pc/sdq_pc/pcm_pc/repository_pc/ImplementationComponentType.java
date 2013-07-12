/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents an abstraction of a component, where both sets of provided and required interfaces as well as the implementation is visible. It fully specifies the component type. The specification of
 * the internal structure depends on the way the component is realised. In general, components can either be implemented from the scratch or composed out of other components. In the first case, the implemented behaviour of each provided service needs to be specified with a service effect specification (SEFF) to describe the component’s abstract internal structure. We refer to such components as basic components, since they form the basic building blocks of a software architecture. On the other hand, developers can use existing components to assemble new, composite components.
 * 
 * TODO: ? Possibly add constraint that the VariableUsages must have unique names within one component. Maybe this constraint can even be added to the VariableUsage in general (for each containment of VariableUsages, each name inside must be unique, for example). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ImplementationComponentType#getParentCompleteComponentTypes <em>Parent Complete Component Types</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ImplementationComponentType#getComponentParameterUsage_ImplementationComponentType <em>Component Parameter Usage Implementation Component Type</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ImplementationComponentType#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage#getImplementationComponentType()
 * @model
 * @generated
 */
public interface ImplementationComponentType extends RepositoryComponent {
   /**
    * Returns the value of the '<em><b>Parent Complete Component Types</b></em>' reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.CompleteComponentType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Complete Component Types</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Complete Component Types</em>' reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage#getImplementationComponentType_ParentCompleteComponentTypes()
    * @model ordered="false"
    * @generated
    */
   EList<CompleteComponentType> getParentCompleteComponentTypes();

   /**
    * Returns the value of the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property specified the variables of the component that are to be initialized using the assembly context to parametrize the component.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Component Parameter Usage Implementation Component Type</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage#getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<VariableUsage> getComponentParameterUsage_ImplementationComponentType();

   /**
    * Returns the value of the '<em><b>Component Type</b></em>' attribute.
    * The default value is <code>"BUSINESS_COMPONENT"</code>.
    * The literals are from the enumeration {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ComponentType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Component Type</em>' attribute.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ComponentType
    * @see #setComponentType(ComponentType)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage#getImplementationComponentType_ComponentType()
    * @model default="BUSINESS_COMPONENT" required="true" ordered="false"
    * @generated
    */
   ComponentType getComponentType();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ImplementationComponentType#getComponentType <em>Component Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Component Type</em>' attribute.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.ComponentType
    * @see #getComponentType()
    * @generated
    */
   void setComponentType(ComponentType value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- ImplementationTypes required Interfaces have to be a subset\r\n-- of CompleteComponentType required Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \'lpar2005.pdf\' (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc1 : Bag(Interface) = Bag{} |\r\n--\t\tacc1->union(pt.requiredRoles->iterate(r : RequiredRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc2->union(r.requiredInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t\t))\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc3 : Bag(Interface) = Bag{} |\r\n--\t\tacc3->union(pt.requiredRoles->iterate(r : RequiredRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc4->union(r.requiredInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t\t))\r\n--\t)->union( -- union with anchestors found in former recursion #\r\n--\t\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc5 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc5->union(pt.requiredRoles->iterate(r : RequiredRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\t\tacc6->union(r.requiredInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t\t))\r\n--\t\t)\r\n--\t) in\r\n-- Directly required interfaces need to be a subset of required anchestorInterfaces of Supertype #\r\n--anchestorInterfaces.identifier.id->includesAll(\r\n--\tself.requiredRoles->iterate(p : RequiredRole; acc7 : Bag(String) = Bag{} |\r\n--\t\tacc7->union(p.requiredInterface.identifier.id->asBag())\r\n--\t)\t\r\n--)\r\ntrue'"
    * @generated
    */
   boolean RequiredInterfacesHaveToConformToCompleteType(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- ### EXACT COPY FROM ABOVE ###\r\n-- ImplementationComponentTypes provided Interfaces have to be a superset\r\n-- of CompleteComponentType provided Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \'lpar2005.pdf\' (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\tacc2->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\tacc4->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t)->union( -- union with anchestors found in former recursion #\r\n--\t\tself.providedRoles->iterate(r : ProvidedRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc6->union(r.providedInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t)\r\n--\t) in\r\n\t-- Directly provided anchestorInterfaces need to be a superset of provided interfaces of Supertype #\r\n--\tanchestorInterfaces.identifier.id->includesAll(\r\n--\t\tself.parentProvidesComponentTypes->iterate(pt : ProvidesComponentType; acc1 : Bag(String) = Bag{} |\r\n--\t\t\tpt.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(String) = Bag{} |\r\n--\t\t\t\tacc2->union(r.providedInterface.identifier.id->asBag()) -- asBag required to allow Set operations #\r\n--\t\t\t)\r\n--\t\t)\r\n--\t)\r\ntrue'"
    * @generated
    */
   boolean providedInterfacesHaveToConformToCompleteType(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.componentType = ComponentType::INFRASTRUCTURE_COMPONENT then\r\n\tself.providedRoles_InterfaceProvidingEntity->select(role | role.oclIsTypeOf(OperationInterface) or role.oclIsTypeOf(EventGroup))->size() = 0\r\nelse if self.componentType = ComponentType::BUSINESS_COMPONENT then\r\n\tself.providedRoles_InterfaceProvidingEntity->select(role | role.oclIsTypeOf(InfrastructureInterface))->size() = 0\r\nelse\r\n\t1 = 0\r\nendif\r\nendif'"
    * @generated
    */
   boolean ProvidedInterfaceHaveToConformToComponentType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ImplementationComponentType
