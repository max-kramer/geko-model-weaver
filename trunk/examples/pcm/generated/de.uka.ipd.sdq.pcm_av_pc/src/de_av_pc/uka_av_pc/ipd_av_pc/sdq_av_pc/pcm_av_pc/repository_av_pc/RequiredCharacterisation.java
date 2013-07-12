/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.VariableCharacterisationType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Characterisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of required variable characeterisations per parameter. Increases power of interfaces and lifts variable characterisations to the interface to enable extended interoperability checks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RequiredCharacterisation#getType <em>Type</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RequiredCharacterisation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RequiredCharacterisation#getInterface_RequiredCharacterisation <em>Interface Required Characterisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRequiredCharacterisation()
 * @model
 * @generated
 */
public interface RequiredCharacterisation extends EObject {
   /**
    * Returns the value of the '<em><b>Type</b></em>' attribute.
    * The literals are from the enumeration {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.VariableCharacterisationType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Type</em>' attribute.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.VariableCharacterisationType
    * @see #setType(VariableCharacterisationType)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRequiredCharacterisation_Type()
    * @model required="true" ordered="false"
    * @generated
    */
   VariableCharacterisationType getType();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RequiredCharacterisation#getType <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Type</em>' attribute.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.VariableCharacterisationType
    * @see #getType()
    * @generated
    */
   void setType(VariableCharacterisationType value);

   /**
    * Returns the value of the '<em><b>Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameter</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parameter</em>' reference.
    * @see #setParameter(Parameter)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRequiredCharacterisation_Parameter()
    * @model ordered="false"
    * @generated
    */
   Parameter getParameter();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RequiredCharacterisation#getParameter <em>Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parameter</em>' reference.
    * @see #getParameter()
    * @generated
    */
   void setParameter(Parameter value);

   /**
    * Returns the value of the '<em><b>Interface Required Characterisation</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Interface#getRequiredCharacterisations <em>Required Characterisations</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Interface Required Characterisation</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Interface Required Characterisation</em>' container reference.
    * @see #setInterface_RequiredCharacterisation(Interface)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getRequiredCharacterisation_Interface_RequiredCharacterisation()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Interface#getRequiredCharacterisations
    * @model opposite="requiredCharacterisations" transient="false" ordered="false"
    * @generated
    */
   Interface getInterface_RequiredCharacterisation();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RequiredCharacterisation#getInterface_RequiredCharacterisation <em>Interface Required Characterisation</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Interface Required Characterisation</em>' container reference.
    * @see #getInterface_RequiredCharacterisation()
    * @generated
    */
   void setInterface_RequiredCharacterisation(Interface value);

} // RequiredCharacterisation
