/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.ResourceRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Resource Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredResourceDelegationConnector#getAssemblyContext__RequiredResourceDelegationConnector <em>Assembly Context Required Resource Delegation Connector</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredResourceDelegationConnector#getInnerRequiredRole__RequiredResourceDelegationConnector <em>Inner Required Role Required Resource Delegation Connector</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredResourceDelegationConnector#getOuterRequiredRole__RequiredResourceDelegationConnector <em>Outer Required Role Required Resource Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage#getRequiredResourceDelegationConnector()
 * @model
 * @generated
 */
public interface RequiredResourceDelegationConnector extends DelegationConnector {
   /**
    * Returns the value of the '<em><b>Assembly Context Required Resource Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Assembly Context Required Resource Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Assembly Context Required Resource Delegation Connector</em>' reference.
    * @see #setAssemblyContext__RequiredResourceDelegationConnector(AssemblyContext)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage#getRequiredResourceDelegationConnector_AssemblyContext__RequiredResourceDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getAssemblyContext__RequiredResourceDelegationConnector();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredResourceDelegationConnector#getAssemblyContext__RequiredResourceDelegationConnector <em>Assembly Context Required Resource Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Assembly Context Required Resource Delegation Connector</em>' reference.
    * @see #getAssemblyContext__RequiredResourceDelegationConnector()
    * @generated
    */
   void setAssemblyContext__RequiredResourceDelegationConnector(AssemblyContext value);

   /**
    * Returns the value of the '<em><b>Inner Required Role Required Resource Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Inner Required Role Required Resource Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Inner Required Role Required Resource Delegation Connector</em>' reference.
    * @see #setInnerRequiredRole__RequiredResourceDelegationConnector(ResourceRequiredRole)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage#getRequiredResourceDelegationConnector_InnerRequiredRole__RequiredResourceDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   ResourceRequiredRole getInnerRequiredRole__RequiredResourceDelegationConnector();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredResourceDelegationConnector#getInnerRequiredRole__RequiredResourceDelegationConnector <em>Inner Required Role Required Resource Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Inner Required Role Required Resource Delegation Connector</em>' reference.
    * @see #getInnerRequiredRole__RequiredResourceDelegationConnector()
    * @generated
    */
   void setInnerRequiredRole__RequiredResourceDelegationConnector(ResourceRequiredRole value);

   /**
    * Returns the value of the '<em><b>Outer Required Role Required Resource Delegation Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Outer Required Role Required Resource Delegation Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Outer Required Role Required Resource Delegation Connector</em>' reference.
    * @see #setOuterRequiredRole__RequiredResourceDelegationConnector(ResourceRequiredRole)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage#getRequiredResourceDelegationConnector_OuterRequiredRole__RequiredResourceDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   ResourceRequiredRole getOuterRequiredRole__RequiredResourceDelegationConnector();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredResourceDelegationConnector#getOuterRequiredRole__RequiredResourceDelegationConnector <em>Outer Required Role Required Resource Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Outer Required Role Required Resource Delegation Connector</em>' reference.
    * @see #getOuterRequiredRole__RequiredResourceDelegationConnector()
    * @generated
    */
   void setOuterRequiredRole__RequiredResourceDelegationConnector(ResourceRequiredRole value);

} // RequiredResourceDelegationConnector
