/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.InfrastructureSignature#getParameters__InfrastructureSignature <em>Parameters Infrastructure Signature</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getInfrastructureSignature()
 * @model
 * @generated
 */
public interface InfrastructureSignature extends Signature {
   /**
    * Returns the value of the '<em><b>Parameters Infrastructure Signature</b></em>' containment reference list.
    * The list contents are of type {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter}.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getInfrastructureSignature__Parameter <em>Infrastructure Signature Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameters Infrastructure Signature</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parameters Infrastructure Signature</em>' containment reference list.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getInfrastructureSignature_Parameters__InfrastructureSignature()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getInfrastructureSignature__Parameter
    * @model opposite="infrastructureSignature__Parameter" containment="true" ordered="false"
    * @generated
    */
   EList<Parameter> getParameters__InfrastructureSignature();

   /**
    * Returns the value of the '<em><b>Infrastructure Interface Infrastructure Signature</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface <em>Infrastructure Signatures Infrastructure Interface</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Infrastructure Interface Infrastructure Signature</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Infrastructure Interface Infrastructure Signature</em>' container reference.
    * @see #setInfrastructureInterface__InfrastructureSignature(InfrastructureInterface)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface
    * @model opposite="infrastructureSignatures__InfrastructureInterface" transient="false" ordered="false"
    * @generated
    */
   InfrastructureInterface getInfrastructureInterface__InfrastructureSignature();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Infrastructure Interface Infrastructure Signature</em>' container reference.
    * @see #getInfrastructureInterface__InfrastructureSignature()
    * @generated
    */
   void setInfrastructureInterface__InfrastructureSignature(InfrastructureInterface value);

} // InfrastructureSignature
