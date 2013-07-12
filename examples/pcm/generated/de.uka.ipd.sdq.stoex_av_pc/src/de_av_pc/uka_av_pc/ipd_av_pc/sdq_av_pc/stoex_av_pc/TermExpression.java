/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermExpression#getRight <em>Right</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getTermExpression()
 * @model
 * @generated
 */
public interface TermExpression extends Term {
   /**
    * Returns the value of the '<em><b>Left</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Left</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Left</em>' containment reference.
    * @see #setLeft(Term)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getTermExpression_Left()
    * @model containment="true" ordered="false"
    * @generated
    */
   Term getLeft();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermExpression#getLeft <em>Left</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Left</em>' containment reference.
    * @see #getLeft()
    * @generated
    */
   void setLeft(Term value);

   /**
    * Returns the value of the '<em><b>Right</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Right</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Right</em>' containment reference.
    * @see #setRight(Product)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getTermExpression_Right()
    * @model containment="true" ordered="false"
    * @generated
    */
   Product getRight();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermExpression#getRight <em>Right</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Right</em>' containment reference.
    * @see #getRight()
    * @generated
    */
   void setRight(Product value);

   /**
    * Returns the value of the '<em><b>Operation</b></em>' attribute.
    * The literals are from the enumeration {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermOperations}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Operation</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Operation</em>' attribute.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermOperations
    * @see #setOperation(TermOperations)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getTermExpression_Operation()
    * @model required="true" ordered="false"
    * @generated
    */
   TermOperations getOperation();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermExpression#getOperation <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Operation</em>' attribute.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.TermOperations
    * @see #getOperation()
    * @generated
    */
   void setOperation(TermOperations value);

} // TermExpression
