/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interface Providing Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity <em>Resource Provided Roles Resource Interface Providing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage#getResourceInterfaceProvidingEntity()
 * @model
 * @generated
 */
public interface ResourceInterfaceProvidingEntity extends Entity {
   /**
    * Returns the value of the '<em><b>Resource Provided Roles Resource Interface Providing Entity</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceProvidedRole}.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Provided Roles Resource Interface Providing Entity</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Provided Roles Resource Interface Providing Entity</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage#getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole
    * @model opposite="resourceInterfaceProvidingEntity__ResourceProvidedRole" containment="true" ordered="false"
    * @generated
    */
   EList<ResourceProvidedRole> getResourceProvidedRoles__ResourceInterfaceProvidingEntity();

} // ResourceInterfaceProvidingEntity
