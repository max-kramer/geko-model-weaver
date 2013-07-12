/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Parenthesis#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getParenthesis()
 * @model
 * @generated
 */
public interface Parenthesis extends Atom {
   /**
    * Returns the value of the '<em><b>Inner Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Inner Expression</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Inner Expression</em>' containment reference.
    * @see #setInnerExpression(Expression)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getParenthesis_InnerExpression()
    * @model containment="true" ordered="false"
    * @generated
    */
   Expression getInnerExpression();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Parenthesis#getInnerExpression <em>Inner Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Inner Expression</em>' containment reference.
    * @see #getInnerExpression()
    * @generated
    */
   void setInnerExpression(Expression value);

} // Parenthesis
