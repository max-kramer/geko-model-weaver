/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Complex#getReal <em>Real</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Complex#getImaginary <em>Imaginary</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage#getComplex()
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
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage#getComplex_Real()
    * @model required="true" ordered="false"
    * @generated
    */
   double getReal();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Complex#getReal <em>Real</em>}' attribute.
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
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage#getComplex_Imaginary()
    * @model required="true" ordered="false"
    * @generated
    */
   double getImaginary();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Complex#getImaginary <em>Imaginary</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Imaginary</em>' attribute.
    * @see #getImaginary()
    * @generated
    */
   void setImaginary(double value);

} // Complex
