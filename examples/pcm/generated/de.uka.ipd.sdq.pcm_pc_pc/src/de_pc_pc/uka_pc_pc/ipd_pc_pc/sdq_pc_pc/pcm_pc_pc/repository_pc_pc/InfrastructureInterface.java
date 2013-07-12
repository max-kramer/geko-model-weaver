/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface <em>Infrastructure Signatures Infrastructure Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage#getInfrastructureInterface()
 * @model
 * @generated
 */
public interface InfrastructureInterface extends Interface {
   /**
    * Returns the value of the '<em><b>Infrastructure Signatures Infrastructure Interface</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureSignature}.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Infrastructure Signatures Infrastructure Interface</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Infrastructure Signatures Infrastructure Interface</em>' containment reference list.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage#getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature
    * @model opposite="infrastructureInterface__InfrastructureSignature" containment="true" ordered="false"
    * @generated
    */
   EList<InfrastructureSignature> getInfrastructureSignatures__InfrastructureInterface();

} // InfrastructureInterface
