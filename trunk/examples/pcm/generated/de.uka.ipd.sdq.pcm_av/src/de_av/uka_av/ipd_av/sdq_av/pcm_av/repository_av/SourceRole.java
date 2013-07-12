/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.SourceRole#getEventGroup__SourceRole <em>Event Group Source Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage#getSourceRole()
 * @model
 * @generated
 */
public interface SourceRole extends RequiredRole {
   /**
    * Returns the value of the '<em><b>Event Group Source Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Group Source Role</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Group Source Role</em>' reference.
    * @see #setEventGroup__SourceRole(EventGroup)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage#getSourceRole_EventGroup__SourceRole()
    * @model ordered="false"
    * @generated
    */
   EventGroup getEventGroup__SourceRole();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.SourceRole#getEventGroup__SourceRole <em>Event Group Source Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Group Source Role</em>' reference.
    * @see #getEventGroup__SourceRole()
    * @generated
    */
   void setEventGroup__SourceRole(EventGroup value);

} // SourceRole
