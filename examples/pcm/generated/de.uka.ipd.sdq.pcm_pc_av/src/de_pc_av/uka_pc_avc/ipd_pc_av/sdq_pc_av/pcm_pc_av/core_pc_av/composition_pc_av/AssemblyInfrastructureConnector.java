/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureProvidedRole;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Infrastructure Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyInfrastructureConnector#getProvidedRole__AssemblyInfrastructureConnector <em>Provided Role Assembly Infrastructure Connector</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyInfrastructureConnector#getRequiredRole__AssemblyInfrastructureConnector <em>Required Role Assembly Infrastructure Connector</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyInfrastructureConnector#getProvidingAssemblyContext__AssemblyInfrastructureConnector <em>Providing Assembly Context Assembly Infrastructure Connector</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyInfrastructureConnector#getRequiringAssemblyContext__AssemblyInfrastructureConnector <em>Requiring Assembly Context Assembly Infrastructure Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage#getAssemblyInfrastructureConnector()
 * @model
 * @generated
 */
public interface AssemblyInfrastructureConnector extends Connector {
   /**
    * Returns the value of the '<em><b>Provided Role Assembly Infrastructure Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Provided Role Assembly Infrastructure Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Provided Role Assembly Infrastructure Connector</em>' reference.
    * @see #setProvidedRole__AssemblyInfrastructureConnector(InfrastructureProvidedRole)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage#getAssemblyInfrastructureConnector_ProvidedRole__AssemblyInfrastructureConnector()
    * @model ordered="false"
    * @generated
    */
   InfrastructureProvidedRole getProvidedRole__AssemblyInfrastructureConnector();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyInfrastructureConnector#getProvidedRole__AssemblyInfrastructureConnector <em>Provided Role Assembly Infrastructure Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Provided Role Assembly Infrastructure Connector</em>' reference.
    * @see #getProvidedRole__AssemblyInfrastructureConnector()
    * @generated
    */
   void setProvidedRole__AssemblyInfrastructureConnector(InfrastructureProvidedRole value);

   /**
    * Returns the value of the '<em><b>Required Role Assembly Infrastructure Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Required Role Assembly Infrastructure Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Required Role Assembly Infrastructure Connector</em>' reference.
    * @see #setRequiredRole__AssemblyInfrastructureConnector(InfrastructureRequiredRole)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage#getAssemblyInfrastructureConnector_RequiredRole__AssemblyInfrastructureConnector()
    * @model ordered="false"
    * @generated
    */
   InfrastructureRequiredRole getRequiredRole__AssemblyInfrastructureConnector();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyInfrastructureConnector#getRequiredRole__AssemblyInfrastructureConnector <em>Required Role Assembly Infrastructure Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Required Role Assembly Infrastructure Connector</em>' reference.
    * @see #getRequiredRole__AssemblyInfrastructureConnector()
    * @generated
    */
   void setRequiredRole__AssemblyInfrastructureConnector(InfrastructureRequiredRole value);

   /**
    * Returns the value of the '<em><b>Providing Assembly Context Assembly Infrastructure Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Providing Assembly Context Assembly Infrastructure Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Providing Assembly Context Assembly Infrastructure Connector</em>' reference.
    * @see #setProvidingAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage#getAssemblyInfrastructureConnector_ProvidingAssemblyContext__AssemblyInfrastructureConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getProvidingAssemblyContext__AssemblyInfrastructureConnector();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyInfrastructureConnector#getProvidingAssemblyContext__AssemblyInfrastructureConnector <em>Providing Assembly Context Assembly Infrastructure Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Providing Assembly Context Assembly Infrastructure Connector</em>' reference.
    * @see #getProvidingAssemblyContext__AssemblyInfrastructureConnector()
    * @generated
    */
   void setProvidingAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext value);

   /**
    * Returns the value of the '<em><b>Requiring Assembly Context Assembly Infrastructure Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Requiring Assembly Context Assembly Infrastructure Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Requiring Assembly Context Assembly Infrastructure Connector</em>' reference.
    * @see #setRequiringAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.Composition_pc_avPackage#getAssemblyInfrastructureConnector_RequiringAssemblyContext__AssemblyInfrastructureConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getRequiringAssemblyContext__AssemblyInfrastructureConnector();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.composition_pc_av.AssemblyInfrastructureConnector#getRequiringAssemblyContext__AssemblyInfrastructureConnector <em>Requiring Assembly Context Assembly Infrastructure Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Requiring Assembly Context Assembly Infrastructure Connector</em>' reference.
    * @see #getRequiringAssemblyContext__AssemblyInfrastructureConnector()
    * @generated
    */
   void setRequiringAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext value);

} // AssemblyInfrastructureConnector
