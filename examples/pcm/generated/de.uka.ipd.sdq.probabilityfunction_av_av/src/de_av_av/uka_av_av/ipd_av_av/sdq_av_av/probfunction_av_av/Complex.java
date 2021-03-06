/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av.Complex#getReal <em>Real</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av.Complex#getImaginary <em>Imaginary</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av.Probfunction_av_avPackage#getComplex()
 * @model
 * @generated
 */
public interface Complex extends EObject {
   /**
    * Returns the value of the '<em><b>Real</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Real</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Real</em>' attribute.
    * @see #setReal(double)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av.Probfunction_av_avPackage#getComplex_Real()
    * @model required="true" ordered="false"
    * @generated
    */
   double getReal();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av.Complex#getReal <em>Real</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Real</em>' attribute.
    * @see #getReal()
    * @generated
    */
   void setReal(double value);

   /**
    * Returns the value of the '<em><b>Imaginary</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Imaginary</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Imaginary</em>' attribute.
    * @see #setImaginary(double)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av.Probfunction_av_avPackage#getComplex_Imaginary()
    * @model required="true" ordered="false"
    * @generated
    */
   double getImaginary();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.probfunction_av_av.Complex#getImaginary <em>Imaginary</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Imaginary</em>' attribute.
    * @see #getImaginary()
    * @generated
    */
   void setImaginary(double value);

} // Complex
