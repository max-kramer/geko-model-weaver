/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.RandomVariable#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.RandomVariable#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage#getRandomVariable()
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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage#getRandomVariable_Specification()
    * @model required="true" ordered="false"
    * @generated
    */
   String getSpecification();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.RandomVariable#getSpecification <em>Specification</em>}' attribute.
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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage#getRandomVariable_Expression()
    * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedIsSetVisibility="true"
    *        extendedMetaData="name='' namespace=''"
    * @generated
    */
   Expression getExpression();

} // RandomVariable
