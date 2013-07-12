/**
 */
package de_av.uka_av.ipd_av.sdq_av.stoex_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Variable#getId_Variable <em>Id Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Atom {
   /**
    * Returns the value of the '<em><b>Id Variable</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Id Variable</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id Variable</em>' reference.
    * @see #setId_Variable(AbstractNamedReference)
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage#getVariable_Id_Variable()
    * @model ordered="false"
    * @generated
    */
   AbstractNamedReference getId_Variable();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.Variable#getId_Variable <em>Id Variable</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id Variable</em>' reference.
    * @see #getId_Variable()
    * @generated
    */
   void setId_Variable(AbstractNamedReference value);

} // Variable
