/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceInterfaceProvidingEntity;

import de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract superclass of any resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceType#getResourceRepository_ResourceType <em>Resource Repository Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage#getResourceType()
 * @model
 * @generated
 */
public interface ResourceType extends Entity, UnitCarryingElement, ResourceInterfaceProvidingEntity {
   /**
    * Returns the value of the '<em><b>Resource Repository Resource Type</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceRepository#getAvailableResourceTypes_ResourceRepository <em>Available Resource Types Resource Repository</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Repository Resource Type</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Repository Resource Type</em>' container reference.
    * @see #setResourceRepository_ResourceType(ResourceRepository)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage#getResourceType_ResourceRepository_ResourceType()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceRepository#getAvailableResourceTypes_ResourceRepository
    * @model opposite="availableResourceTypes_ResourceRepository" transient="false" ordered="false"
    * @generated
    */
   ResourceRepository getResourceRepository_ResourceType();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceType#getResourceRepository_ResourceType <em>Resource Repository Resource Type</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Repository Resource Type</em>' container reference.
    * @see #getResourceRepository_ResourceType()
    * @generated
    */
   void setResourceRepository_ResourceType(ResourceRepository value);

} // ResourceType
