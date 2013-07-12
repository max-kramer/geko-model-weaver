/**
 */
package de_av.uka_av.ipd_av.sdq_av.stoex_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.IntLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage#getIntLiteral()
 * @model
 * @generated
 */
public interface IntLiteral extends NumericLiteral {
   /**
    * Returns the value of the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Value</em>' attribute.
    * @see #setValue(int)
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage#getIntLiteral_Value()
    * @model required="true" ordered="false"
    * @generated
    */
   int getValue();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.IntLiteral#getValue <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Value</em>' attribute.
    * @see #getValue()
    * @generated
    */
   void setValue(int value);

} // IntLiteral
