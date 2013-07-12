/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceRequiredRole;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO Michael Hauck
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ResourceRequiredDelegationConnector#getInnerResourceRequiredRole_ResourceRequiredDelegationConnector <em>Inner Resource Required Role Resource Required Delegation Connector</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ResourceRequiredDelegationConnector#getOuterResourceRequiredRole_ResourceRequiredDelegationConnector <em>Outer Resource Required Role Resource Required Delegation Connector</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ResourceRequiredDelegationConnector#getParentStructure_ResourceRequiredDelegationConnector <em>Parent Structure Resource Required Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage#getResourceRequiredDelegationConnector()
 * @model
 * @generated
 */
public interface ResourceRequiredDelegationConnector extends EObject {
   /**
    * Returns the value of the '<em><b>Inner Resource Required Role Resource Required Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Inner Resource Required Role Resource Required Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Inner Resource Required Role Resource Required Delegation Connector</em>' reference.
    * @see #setInnerResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage#getResourceRequiredDelegationConnector_InnerResourceRequiredRole_ResourceRequiredDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   ResourceRequiredRole getInnerResourceRequiredRole_ResourceRequiredDelegationConnector();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ResourceRequiredDelegationConnector#getInnerResourceRequiredRole_ResourceRequiredDelegationConnector <em>Inner Resource Required Role Resource Required Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Inner Resource Required Role Resource Required Delegation Connector</em>' reference.
    * @see #getInnerResourceRequiredRole_ResourceRequiredDelegationConnector()
    * @generated
    */
   void setInnerResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole value);

   /**
    * Returns the value of the '<em><b>Outer Resource Required Role Resource Required Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Outer Resource Required Role Resource Required Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Outer Resource Required Role Resource Required Delegation Connector</em>' reference.
    * @see #setOuterResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage#getResourceRequiredDelegationConnector_OuterResourceRequiredRole_ResourceRequiredDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   ResourceRequiredRole getOuterResourceRequiredRole_ResourceRequiredDelegationConnector();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ResourceRequiredDelegationConnector#getOuterResourceRequiredRole_ResourceRequiredDelegationConnector <em>Outer Resource Required Role Resource Required Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Outer Resource Required Role Resource Required Delegation Connector</em>' reference.
    * @see #getOuterResourceRequiredRole_ResourceRequiredDelegationConnector()
    * @generated
    */
   void setOuterResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole value);

   /**
    * Returns the value of the '<em><b>Parent Structure Resource Required Delegation Connector</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ComposedStructure#getResourceRequiredDelegationConnectors_ComposedStructure <em>Resource Required Delegation Connectors Composed Structure</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Structure Resource Required Delegation Connector</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Structure Resource Required Delegation Connector</em>' container reference.
    * @see #setParentStructure_ResourceRequiredDelegationConnector(ComposedStructure)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage#getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ComposedStructure#getResourceRequiredDelegationConnectors_ComposedStructure
    * @model opposite="resourceRequiredDelegationConnectors_ComposedStructure" transient="false" ordered="false"
    * @generated
    */
   ComposedStructure getParentStructure_ResourceRequiredDelegationConnector();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.ResourceRequiredDelegationConnector#getParentStructure_ResourceRequiredDelegationConnector <em>Parent Structure Resource Required Delegation Connector</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent Structure Resource Required Delegation Connector</em>' container reference.
    * @see #getParentStructure_ResourceRequiredDelegationConnector()
    * @generated
    */
   void setParentStructure_ResourceRequiredDelegationConnector(ComposedStructure value);

} // ResourceRequiredDelegationConnector
