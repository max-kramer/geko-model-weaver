/**
 */
package de_av.uka_av.ipd_av.sdq_av.probfunction_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.GlobalScope#getScopedObject <em>Scoped Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.probfunction_av.Probfunction_avPackage#getGlobalScope()
 * @model
 * @generated
 */
public interface GlobalScope extends EObject {
   /**
    * Returns the value of the '<em><b>Scoped Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Scoped Object</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Scoped Object</em>' reference.
    * @see #setScopedObject(EObject)
    * @see de_av.uka_av.ipd_av.sdq_av.probfunction_av.Probfunction_avPackage#getGlobalScope_ScopedObject()
    * @model required="true"
    * @generated
    */
   EObject getScopedObject();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.GlobalScope#getScopedObject <em>Scoped Object</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Scoped Object</em>' reference.
    * @see #getScopedObject()
    * @generated
    */
   void setScopedObject(EObject value);

} // GlobalScope
