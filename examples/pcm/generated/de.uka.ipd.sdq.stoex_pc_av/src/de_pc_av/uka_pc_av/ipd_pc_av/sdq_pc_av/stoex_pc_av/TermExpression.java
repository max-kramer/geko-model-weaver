/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.TermExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.TermExpression#getRight <em>Right</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.TermExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage#getTermExpression()
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
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage#getTermExpression_Left()
    * @model containment="true" ordered="false"
    * @generated
    */
   Term getLeft();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.TermExpression#getLeft <em>Left</em>}' containment reference.
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
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage#getTermExpression_Right()
    * @model containment="true" ordered="false"
    * @generated
    */
   Product getRight();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.TermExpression#getRight <em>Right</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Right</em>' containment reference.
    * @see #getRight()
    * @generated
    */
   void setRight(Product value);

   /**
    * Returns the value of the '<em><b>Operation</b></em>' attribute.
    * The literals are from the enumeration {@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.TermOperations}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Operation</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Operation</em>' attribute.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.TermOperations
    * @see #setOperation(TermOperations)
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage#getTermExpression_Operation()
    * @model required="true" ordered="false"
    * @generated
    */
   TermOperations getOperation();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.TermExpression#getOperation <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Operation</em>' attribute.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.TermOperations
    * @see #getOperation()
    * @generated
    */
   void setOperation(TermOperations value);

} // TermExpression
