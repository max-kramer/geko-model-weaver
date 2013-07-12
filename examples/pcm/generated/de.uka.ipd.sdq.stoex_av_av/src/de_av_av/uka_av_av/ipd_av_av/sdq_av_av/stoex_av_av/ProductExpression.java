/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getRight <em>Right</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage#getProductExpression()
 * @model
 * @generated
 */
public interface ProductExpression extends Product {
   /**
    * Returns the value of the '<em><b>Left</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Left</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Left</em>' containment reference.
    * @see #setLeft(Product)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage#getProductExpression_Left()
    * @model containment="true" ordered="false"
    * @generated
    */
   Product getLeft();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getLeft <em>Left</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Left</em>' containment reference.
    * @see #getLeft()
    * @generated
    */
   void setLeft(Product value);

   /**
    * Returns the value of the '<em><b>Right</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Right</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Right</em>' containment reference.
    * @see #setRight(Power)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage#getProductExpression_Right()
    * @model containment="true" ordered="false"
    * @generated
    */
   Power getRight();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getRight <em>Right</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Right</em>' containment reference.
    * @see #getRight()
    * @generated
    */
   void setRight(Power value);

   /**
    * Returns the value of the '<em><b>Operation</b></em>' attribute.
    * The literals are from the enumeration {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductOperations}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Operation</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Operation</em>' attribute.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductOperations
    * @see #setOperation(ProductOperations)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage#getProductExpression_Operation()
    * @model required="true" ordered="false"
    * @generated
    */
   ProductOperations getOperation();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductExpression#getOperation <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Operation</em>' attribute.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.ProductOperations
    * @see #getOperation()
    * @generated
    */
   void setOperation(ProductOperations value);

} // ProductExpression
