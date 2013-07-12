/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.NegativeExpression#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getNegativeExpression()
 * @model
 * @generated
 */
public interface NegativeExpression extends Unary {
   /**
    * Returns the value of the '<em><b>Inner</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Inner</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Inner</em>' containment reference.
    * @see #setInner(Unary)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getNegativeExpression_Inner()
    * @model containment="true" ordered="false"
    * @generated
    */
   Unary getInner();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.NegativeExpression#getInner <em>Inner</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Inner</em>' containment reference.
    * @see #getInner()
    * @generated
    */
   void setInner(Unary value);

} // NegativeExpression
