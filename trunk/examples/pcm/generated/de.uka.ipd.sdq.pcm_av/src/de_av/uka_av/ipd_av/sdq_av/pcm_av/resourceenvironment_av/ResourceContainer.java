/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML-like&nbsp;container&nbsp;of&nbsp;a&nbsp;number&nbsp;of&nbsp;processing&nbsp;resources (e.g. hardware server)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getNestedResourceContainers__ResourceContainer <em>Nested Resource Containers Resource Container</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getResourceContainer()
 * @model
 * @generated
 */
public interface ResourceContainer extends Entity {
   /**
    * Returns the value of the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ProcessingResourceSpecification}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification <em>Resource Container Processing Resource Specification</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Active Resource Specifications Resource Container</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Active Resource Specifications Resource Container</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getResourceContainer_ActiveResourceSpecifications_ResourceContainer()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification
    * @model opposite="resourceContainer_ProcessingResourceSpecification" containment="true" ordered="false"
    * @generated
    */
   EList<ProcessingResourceSpecification> getActiveResourceSpecifications_ResourceContainer();

   /**
    * Returns the value of the '<em><b>Resource Environment Resource Container</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceEnvironment#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Environment Resource Container</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Environment Resource Container</em>' container reference.
    * @see #setResourceEnvironment_ResourceContainer(ResourceEnvironment)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getResourceContainer_ResourceEnvironment_ResourceContainer()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceEnvironment#getResourceContainer_ResourceEnvironment
    * @model opposite="resourceContainer_ResourceEnvironment" transient="false" ordered="false"
    * @generated
    */
   ResourceEnvironment getResourceEnvironment_ResourceContainer();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Environment Resource Container</em>' container reference.
    * @see #getResourceEnvironment_ResourceContainer()
    * @generated
    */
   void setResourceEnvironment_ResourceContainer(ResourceEnvironment value);

   /**
    * Returns the value of the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Nested Resource Containers Resource Container</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Nested Resource Containers Resource Container</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getResourceContainer_NestedResourceContainers__ResourceContainer()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getParentResourceContainer__ResourceContainer
    * @model opposite="parentResourceContainer__ResourceContainer" containment="true" ordered="false"
    * @generated
    */
   EList<ResourceContainer> getNestedResourceContainers__ResourceContainer();

   /**
    * Returns the value of the '<em><b>Parent Resource Container Resource Container</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getNestedResourceContainers__ResourceContainer <em>Nested Resource Containers Resource Container</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Resource Container Resource Container</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Resource Container Resource Container</em>' container reference.
    * @see #setParentResourceContainer__ResourceContainer(ResourceContainer)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getResourceContainer_ParentResourceContainer__ResourceContainer()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getNestedResourceContainers__ResourceContainer
    * @model opposite="nestedResourceContainers__ResourceContainer" transient="false" ordered="false"
    * @generated
    */
   ResourceContainer getParentResourceContainer__ResourceContainer();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.ResourceContainer#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent Resource Container Resource Container</em>' container reference.
    * @see #getParentResourceContainer__ResourceContainer()
    * @generated
    */
   void setParentResourceContainer__ResourceContainer(ResourceContainer value);

} // ResourceContainer
