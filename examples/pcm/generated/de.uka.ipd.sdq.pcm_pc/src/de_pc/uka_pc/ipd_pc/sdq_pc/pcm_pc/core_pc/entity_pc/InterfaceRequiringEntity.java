/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.RequiredRole;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All Entities that require an Interface are represented by this class. Prominent inheriting classes are all component types, for example.
 * 
 * Two roles can be identified a software entity can take relative to an interface. Any entity can claim to implement the functionality specified in an interface as well as to request that functionality. This is reflected in the Palladio Component Model by a set of abstract meta-classes giving a conceptual view on interfaces, entities and their relationships. The abstract meta-class InterfaceRequiringEntity is inherited by all entities which are allowed to request functionality offered by entities providing this functionality. Similarly, the meta-classInterfaceProvidingEntity  is inherited by all entities which can potentially offer interface implementations.
 * 
 * See also:
 * Interface, RequiredRole
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.InterfaceRequiringEntity#getRequiredRoles_InterfaceRequiringEntity <em>Required Roles Interface Requiring Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage#getInterfaceRequiringEntity()
 * @model
 * @generated
 */
public interface InterfaceRequiringEntity extends Entity, ResourceInterfaceRequiringEntity {
   /**
    * Returns the value of the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.RequiredRole}.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.RequiredRole#getRequiringEntity_RequiredRole <em>Requiring Entity Required Role</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Required Roles Interface Requiring Entity</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Required Roles Interface Requiring Entity</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage#getInterfaceRequiringEntity_RequiredRoles_InterfaceRequiringEntity()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.RequiredRole#getRequiringEntity_RequiredRole
    * @model opposite="requiringEntity_RequiredRole" containment="true" ordered="false"
    * @generated
    */
   EList<RequiredRole> getRequiredRoles_InterfaceRequiringEntity();

} // InterfaceRequiringEntity
