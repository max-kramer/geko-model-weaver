/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IfElseExpression#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IfElseExpression#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IfElseExpression#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getIfElseExpression()
 * @model
 * @generated
 */
public interface IfElseExpression extends IfElse {
   /**
    * Returns the value of the '<em><b>If Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>If Expression</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>If Expression</em>' containment reference.
    * @see #setIfExpression(BooleanExpression)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getIfElseExpression_IfExpression()
    * @model containment="true" ordered="false"
    * @generated
    */
   BooleanExpression getIfExpression();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IfElseExpression#getIfExpression <em>If Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>If Expression</em>' containment reference.
    * @see #getIfExpression()
    * @generated
    */
   void setIfExpression(BooleanExpression value);

   /**
    * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Else Expression</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Else Expression</em>' containment reference.
    * @see #setElseExpression(BooleanExpression)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getIfElseExpression_ElseExpression()
    * @model containment="true" ordered="false"
    * @generated
    */
   BooleanExpression getElseExpression();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IfElseExpression#getElseExpression <em>Else Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Else Expression</em>' containment reference.
    * @see #getElseExpression()
    * @generated
    */
   void setElseExpression(BooleanExpression value);

   /**
    * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Condition Expression</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Condition Expression</em>' containment reference.
    * @see #setConditionExpression(BooleanExpression)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getIfElseExpression_ConditionExpression()
    * @model containment="true" ordered="false"
    * @generated
    */
   BooleanExpression getConditionExpression();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.IfElseExpression#getConditionExpression <em>Condition Expression</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Condition Expression</em>' containment reference.
    * @see #getConditionExpression()
    * @generated
    */
   void setConditionExpression(BooleanExpression value);

} // IfElseExpression
