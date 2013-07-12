/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.RandomVariable#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.RandomVariable#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getRandomVariable()
 * @model
 * @generated
 */
public interface RandomVariable extends EObject {
   /**
    * Returns the value of the '<em><b>Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Specification</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Specification</em>' attribute.
    * @see #setSpecification(String)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getRandomVariable_Specification()
    * @model required="true" ordered="false"
    * @generated
    */
   String getSpecification();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.RandomVariable#getSpecification <em>Specification</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Specification</em>' attribute.
    * @see #getSpecification()
    * @generated
    */
   void setSpecification(String value);

   /**
    * Returns the value of the '<em><b>Expression</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Expression</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Expression</em>' reference.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getRandomVariable_Expression()
    * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedIsSetVisibility="true"
    *        extendedMetaData="name='' namespace=''"
    * @generated
    */
   Expression getExpression();

} // RandomVariable
