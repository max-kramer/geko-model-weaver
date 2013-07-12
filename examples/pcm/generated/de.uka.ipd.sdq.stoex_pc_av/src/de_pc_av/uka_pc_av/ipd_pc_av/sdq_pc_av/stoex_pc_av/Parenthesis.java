/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Parenthesis#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage#getParenthesis()
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
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage#getParenthesis_InnerExpression()
    * @model containment="true" ordered="false"
    * @generated
    */
   Expression getInnerExpression();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Parenthesis#getInnerExpression <em>Inner Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Inner Expression</em>' containment reference.
    * @see #getInnerExpression()
    * @generated
    */
   void setInnerExpression(Expression value);

} // Parenthesis
