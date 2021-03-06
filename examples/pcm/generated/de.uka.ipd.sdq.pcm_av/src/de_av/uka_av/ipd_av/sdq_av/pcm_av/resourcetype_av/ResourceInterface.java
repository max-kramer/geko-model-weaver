/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO: This structure still has to be finalized by Henning. There is no influence on other model elements yet. so this can be done later on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceInterface#getResourceRepository__ResourceInterface <em>Resource Repository Resource Interface</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceInterface#getResourceSignatures__ResourceInterface <em>Resource Signatures Resource Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage#getResourceInterface()
 * @model
 * @generated
 */
public interface ResourceInterface extends Entity {
   /**
    * Returns the value of the '<em><b>Resource Repository Resource Interface</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceRepository#getResourceInterfaces__ResourceRepository <em>Resource Interfaces Resource Repository</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Repository Resource Interface</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Repository Resource Interface</em>' container reference.
    * @see #setResourceRepository__ResourceInterface(ResourceRepository)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage#getResourceInterface_ResourceRepository__ResourceInterface()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceRepository#getResourceInterfaces__ResourceRepository
    * @model opposite="resourceInterfaces__ResourceRepository" transient="false" ordered="false"
    * @generated
    */
   ResourceRepository getResourceRepository__ResourceInterface();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceInterface#getResourceRepository__ResourceInterface <em>Resource Repository Resource Interface</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Repository Resource Interface</em>' container reference.
    * @see #getResourceRepository__ResourceInterface()
    * @generated
    */
   void setResourceRepository__ResourceInterface(ResourceRepository value);

   /**
    * Returns the value of the '<em><b>Resource Signatures Resource Interface</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceSignature}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceSignature#getResourceInterface__ResourceSignature <em>Resource Interface Resource Signature</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Signatures Resource Interface</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Signatures Resource Interface</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage#getResourceInterface_ResourceSignatures__ResourceInterface()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceSignature#getResourceInterface__ResourceSignature
    * @model opposite="resourceInterface__ResourceSignature" containment="true" ordered="false"
    * @generated
    */
   EList<ResourceSignature> getResourceSignatures__ResourceInterface();

} // ResourceInterface
