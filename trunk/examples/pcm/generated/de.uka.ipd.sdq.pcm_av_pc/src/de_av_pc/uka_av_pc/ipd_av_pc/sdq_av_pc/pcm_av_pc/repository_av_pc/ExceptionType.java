/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a type of an exception.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.ExceptionType#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.ExceptionType#getExceptionMessage <em>Exception Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getExceptionType()
 * @model
 * @generated
 */
public interface ExceptionType extends EObject {
   /**
    * Returns the value of the '<em><b>Exception Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property denotes the name of the exception. In addition to the exception message, this is another piece of information that can be used for identification of the exception that has appeared.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Exception Name</em>' attribute.
    * @see #setExceptionName(String)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getExceptionType_ExceptionName()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   String getExceptionName();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.ExceptionType#getExceptionName <em>Exception Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Exception Name</em>' attribute.
    * @see #getExceptionName()
    * @generated
    */
   void setExceptionName(String value);

   /**
    * Returns the value of the '<em><b>Exception Message</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property holds the text message of the exception.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Exception Message</em>' attribute.
    * @see #setExceptionMessage(String)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getExceptionType_ExceptionMessage()
    * @model unique="false" required="true" ordered="false"
    * @generated
    */
   String getExceptionMessage();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.ExceptionType#getExceptionMessage <em>Exception Message</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Exception Message</em>' attribute.
    * @see #getExceptionMessage()
    * @generated
    */
   void setExceptionMessage(String value);

} // ExceptionType
