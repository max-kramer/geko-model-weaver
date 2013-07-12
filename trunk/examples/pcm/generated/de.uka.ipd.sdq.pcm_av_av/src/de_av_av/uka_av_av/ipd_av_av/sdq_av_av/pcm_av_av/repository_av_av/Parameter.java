/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ResourceSignature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a parameter within a signature. The parameter has a name and it is of a data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getDataType__Parameter <em>Data Type Parameter</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getInfrastructureSignature__Parameter <em>Infrastructure Signature Parameter</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getOperationSignature__Parameter <em>Operation Signature Parameter</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getEventType__Parameter <em>Event Type Parameter</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getModifier__Parameter <em>Modifier Parameter</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getResourceSignature__Parameter <em>Resource Signature Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
   /**
    * Returns the value of the '<em><b>Data Type Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the data type of the parameter.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Data Type Parameter</em>' reference.
    * @see #setDataType__Parameter(DataType)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getParameter_DataType__Parameter()
    * @model ordered="false"
    * @generated
    */
   DataType getDataType__Parameter();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getDataType__Parameter <em>Data Type Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Data Type Parameter</em>' reference.
    * @see #getDataType__Parameter()
    * @generated
    */
   void setDataType__Parameter(DataType value);

   /**
    * Returns the value of the '<em><b>Infrastructure Signature Parameter</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.InfrastructureSignature#getParameters__InfrastructureSignature <em>Parameters Infrastructure Signature</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Infrastructure Signature Parameter</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Infrastructure Signature Parameter</em>' container reference.
    * @see #setInfrastructureSignature__Parameter(InfrastructureSignature)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getParameter_InfrastructureSignature__Parameter()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.InfrastructureSignature#getParameters__InfrastructureSignature
    * @model opposite="parameters__InfrastructureSignature" transient="false" ordered="false"
    * @generated
    */
   InfrastructureSignature getInfrastructureSignature__Parameter();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getInfrastructureSignature__Parameter <em>Infrastructure Signature Parameter</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Infrastructure Signature Parameter</em>' container reference.
    * @see #getInfrastructureSignature__Parameter()
    * @generated
    */
   void setInfrastructureSignature__Parameter(InfrastructureSignature value);

   /**
    * Returns the value of the '<em><b>Operation Signature Parameter</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.OperationSignature#getParameters__OperationSignature <em>Parameters Operation Signature</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property navigates to the signature this parameter is a part of.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Operation Signature Parameter</em>' container reference.
    * @see #setOperationSignature__Parameter(OperationSignature)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getParameter_OperationSignature__Parameter()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.OperationSignature#getParameters__OperationSignature
    * @model opposite="parameters__OperationSignature" transient="false" ordered="false"
    * @generated
    */
   OperationSignature getOperationSignature__Parameter();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getOperationSignature__Parameter <em>Operation Signature Parameter</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Operation Signature Parameter</em>' container reference.
    * @see #getOperationSignature__Parameter()
    * @generated
    */
   void setOperationSignature__Parameter(OperationSignature value);

   /**
    * Returns the value of the '<em><b>Event Type Parameter</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.EventType#getParameter__EventType <em>Parameter Event Type</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Type Parameter</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Type Parameter</em>' container reference.
    * @see #setEventType__Parameter(EventType)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getParameter_EventType__Parameter()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.EventType#getParameter__EventType
    * @model opposite="parameter__EventType" transient="false" ordered="false"
    * @generated
    */
   EventType getEventType__Parameter();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getEventType__Parameter <em>Event Type Parameter</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Type Parameter</em>' container reference.
    * @see #getEventType__Parameter()
    * @generated
    */
   void setEventType__Parameter(EventType value);

   /**
    * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property holds the name of the parameter.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Parameter Name</em>' attribute.
    * @see #setParameterName(String)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getParameter_ParameterName()
    * @model required="true" ordered="false"
    * @generated
    */
   String getParameterName();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getParameterName <em>Parameter Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parameter Name</em>' attribute.
    * @see #getParameterName()
    * @generated
    */
   void setParameterName(String value);

   /**
    * Returns the value of the '<em><b>Modifier Parameter</b></em>' attribute.
    * The literals are from the enumeration {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.ParameterModifier}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the modifier of the parameter like known from C#.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Modifier Parameter</em>' attribute.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.ParameterModifier
    * @see #setModifier__Parameter(ParameterModifier)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getParameter_Modifier__Parameter()
    * @model required="true" ordered="false"
    * @generated
    */
   ParameterModifier getModifier__Parameter();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getModifier__Parameter <em>Modifier Parameter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Modifier Parameter</em>' attribute.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.ParameterModifier
    * @see #getModifier__Parameter()
    * @generated
    */
   void setModifier__Parameter(ParameterModifier value);

   /**
    * Returns the value of the '<em><b>Resource Signature Parameter</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ResourceSignature#getParameter__ResourceSignature <em>Parameter Resource Signature</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Signature Parameter</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Signature Parameter</em>' container reference.
    * @see #setResourceSignature__Parameter(ResourceSignature)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage#getParameter_ResourceSignature__Parameter()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourcetype_av_av.ResourceSignature#getParameter__ResourceSignature
    * @model opposite="parameter__ResourceSignature" transient="false" ordered="false"
    * @generated
    */
   ResourceSignature getResourceSignature__Parameter();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Parameter#getResourceSignature__Parameter <em>Resource Signature Parameter</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Signature Parameter</em>' container reference.
    * @see #getResourceSignature__Parameter()
    * @generated
    */
   void setResourceSignature__Parameter(ResourceSignature value);

} // Parameter
