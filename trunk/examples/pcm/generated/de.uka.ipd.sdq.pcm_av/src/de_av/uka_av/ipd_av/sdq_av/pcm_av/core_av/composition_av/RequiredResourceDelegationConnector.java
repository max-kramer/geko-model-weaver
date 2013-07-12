/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Resource Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.RequiredResourceDelegationConnector#getAssemblyContext__RequiredResourceDelegationConnector <em>Assembly Context Required Resource Delegation Connector</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.RequiredResourceDelegationConnector#getInnerRequiredRole__RequiredResourceDelegationConnector <em>Inner Required Role Required Resource Delegation Connector</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.RequiredResourceDelegationConnector#getOuterRequiredRole__RequiredResourceDelegationConnector <em>Outer Required Role Required Resource Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage#getRequiredResourceDelegationConnector()
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
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage#getRequiredResourceDelegationConnector_AssemblyContext__RequiredResourceDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getAssemblyContext__RequiredResourceDelegationConnector();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.RequiredResourceDelegationConnector#getAssemblyContext__RequiredResourceDelegationConnector <em>Assembly Context Required Resource Delegation Connector</em>}' reference.
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
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage#getRequiredResourceDelegationConnector_InnerRequiredRole__RequiredResourceDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   ResourceRequiredRole getInnerRequiredRole__RequiredResourceDelegationConnector();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.RequiredResourceDelegationConnector#getInnerRequiredRole__RequiredResourceDelegationConnector <em>Inner Required Role Required Resource Delegation Connector</em>}' reference.
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
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage#getRequiredResourceDelegationConnector_OuterRequiredRole__RequiredResourceDelegationConnector()
    * @model ordered="false"
    * @generated
    */
   ResourceRequiredRole getOuterRequiredRole__RequiredResourceDelegationConnector();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.RequiredResourceDelegationConnector#getOuterRequiredRole__RequiredResourceDelegationConnector <em>Outer Required Role Required Resource Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Outer Required Role Required Resource Delegation Connector</em>' reference.
    * @see #getOuterRequiredRole__RequiredResourceDelegationConnector()
    * @generated
    */
   void setOuterRequiredRole__RequiredResourceDelegationConnector(ResourceRequiredRole value);

} // RequiredResourceDelegationConnector
