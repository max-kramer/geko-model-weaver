/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO: This structure still has to be finalized by Henning. There is no influence on other model elements yet. so this can be done later on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.ResourceSignature#getParameter__ResourceSignature <em>Parameter Resource Signature</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.ResourceSignature#getResourceServiceId <em>Resource Service Id</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.ResourceSignature#getResourceInterface__ResourceSignature <em>Resource Interface Resource Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.Resourcetype_pc_pcPackage#getResourceSignature()
 * @model
 * @generated
 */
public interface ResourceSignature extends Entity {
   /**
    * Returns the value of the '<em><b>Parameter Resource Signature</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Parameter#getResourceSignature__Parameter <em>Resource Signature Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameter Resource Signature</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parameter Resource Signature</em>' containment reference.
    * @see #setParameter__ResourceSignature(Parameter)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.Resourcetype_pc_pcPackage#getResourceSignature_Parameter__ResourceSignature()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Parameter#getResourceSignature__Parameter
    * @model opposite="resourceSignature__Parameter" containment="true" ordered="false"
    * @generated
    */
   Parameter getParameter__ResourceSignature();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.ResourceSignature#getParameter__ResourceSignature <em>Parameter Resource Signature</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parameter Resource Signature</em>' containment reference.
    * @see #getParameter__ResourceSignature()
    * @generated
    */
   void setParameter__ResourceSignature(Parameter value);

   /**
    * Returns the value of the '<em><b>Resource Service Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Service Id</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Service Id</em>' attribute.
    * @see #setResourceServiceId(int)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.Resourcetype_pc_pcPackage#getResourceSignature_ResourceServiceId()
    * @model required="true" ordered="false"
    * @generated
    */
   int getResourceServiceId();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.ResourceSignature#getResourceServiceId <em>Resource Service Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Service Id</em>' attribute.
    * @see #getResourceServiceId()
    * @generated
    */
   void setResourceServiceId(int value);

   /**
    * Returns the value of the '<em><b>Resource Interface Resource Signature</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.ResourceInterface#getResourceSignatures__ResourceInterface <em>Resource Signatures Resource Interface</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Interface Resource Signature</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Interface Resource Signature</em>' container reference.
    * @see #setResourceInterface__ResourceSignature(ResourceInterface)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.Resourcetype_pc_pcPackage#getResourceSignature_ResourceInterface__ResourceSignature()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.ResourceInterface#getResourceSignatures__ResourceInterface
    * @model opposite="resourceSignatures__ResourceInterface" transient="false" ordered="false"
    * @generated
    */
   ResourceInterface getResourceInterface__ResourceSignature();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.ResourceSignature#getResourceInterface__ResourceSignature <em>Resource Interface Resource Signature</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Interface Resource Signature</em>' container reference.
    * @see #getResourceInterface__ResourceSignature()
    * @generated
    */
   void setResourceInterface__ResourceSignature(ResourceInterface value);

} // ResourceSignature
