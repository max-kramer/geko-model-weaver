/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ServiceEffectSpecification;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a black-box component implementation. Basic components are atomic building blocks of a software architecture. They cannot be further subdivided into smaller components and are built from scratch, i.e, not by assembling other components. Component developers specify basic components by associating interfaces to them in a providing or requiring role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.BasicComponent#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.BasicComponent#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage#getBasicComponent()
 * @model
 * @generated
 */
public interface BasicComponent extends ImplementationComponentType {
   /**
    * Returns the value of the '<em><b>Service Effect Specifications Basic Component</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ServiceEffectSpecification}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property contains the service effect specification for services provided by this basic component.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Service Effect Specifications Basic Component</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage#getBasicComponent_ServiceEffectSpecifications__BasicComponent()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification
    * @model opposite="basicComponent_ServiceEffectSpecification" containment="true" ordered="false"
    * @generated
    */
   EList<ServiceEffectSpecification> getServiceEffectSpecifications__BasicComponent();

   /**
    * Returns the value of the '<em><b>Passive Resource Basic Component</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PassiveResource}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PassiveResource#getBasicComponent_PassiveResource <em>Basic Component Passive Resource</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the passive resources, e.g., semaphores, that are owned by this basic component.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Passive Resource Basic Component</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage#getBasicComponent_PassiveResource_BasicComponent()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.PassiveResource#getBasicComponent_PassiveResource
    * @model opposite="basicComponent_PassiveResource" containment="true" ordered="false"
    * @generated
    */
   EList<PassiveResource> getPassiveResource_BasicComponent();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.serviceEffectSpecifications__BasicComponent->forAll(p1, p2 |\r\n  p1 <> p2 implies (p1.describedService__SEFF = p2.describedService__SEFF implies p1.seffTypeID <> p2.seffTypeID))'"
    * @generated
    */
   boolean NoSeffTypeUsedTwice(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- BC has to provide the same interfaces like the implementationComponentType (if set) #\r\nif\r\n\t -- apply constraint only for non-empty ImplementationComponentTypes of a BC #\r\n\tself.parentCompleteComponentTypes->notEmpty()\r\nthen\r\n\t--own interface IDs:\r\n    self.providedRoles_InterfaceProvidingEntity->collect(pr : ProvidedRole | pr.providingEntity_ProvidedRole.id)->asSet()\r\n    =\r\n    --complete type interface IDs:\r\n    self.parentCompleteComponentTypes->collect(pr | pr.providedRoles_InterfaceProvidingEntity.providingEntity_ProvidedRole.id)->asSet()\r\nelse\r\n\ttrue\r\nendif'"
    * @generated
    */
   boolean ProvideSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- BC has to require the same interfaces like the implementationComponentType (if set) #\r\nif\r\n\t -- apply constraint only for non-empty ImplementationComponentTypes of a BC #\r\n\tself.parentCompleteComponentTypes->notEmpty()\r\nthen\r\n\t--own interface IDs:\r\n    self.requiredRoles_InterfaceRequiringEntity->select(rr |rr.oclIsTypeOf(OperationRequiredRole))->collect(rr | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole.id)->asSet()\r\n    =\r\n    --complete type interface IDs:\r\n    self.parentCompleteComponentTypes.requiredRoles_InterfaceRequiringEntity->select(rr |rr.oclIsTypeOf(OperationRequiredRole))->collect(rr | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole.id)->asSet()\r\nelse\r\n\ttrue\r\nendif'"
    * @generated
    */
   boolean RequireSameInterfacesAsImplementationType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BasicComponent
