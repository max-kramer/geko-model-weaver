/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The NamedElement meta class is inherited by all PCM classes whose instances bear a name. Thus, the semantic of "bearing a name" is given to all inheriting classes, so that the name can be used in visualisations, for example. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.NamedElement#getEntityName <em>Entity Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends EObject {
   /**
    * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
    * The default value is <code>"aName"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Entity Name</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Entity Name</em>' attribute.
    * @see #setEntityName(String)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage#getNamedElement_EntityName()
    * @model default="aName" required="true" ordered="false"
    * @generated
    */
   String getEntityName();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.NamedElement#getEntityName <em>Entity Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Entity Name</em>' attribute.
    * @see #getEntityName()
    * @generated
    */
   void setEntityName(String value);

} // NamedElement
