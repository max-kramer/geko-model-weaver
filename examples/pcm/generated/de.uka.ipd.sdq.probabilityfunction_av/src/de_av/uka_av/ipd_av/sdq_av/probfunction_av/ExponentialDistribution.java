/**
 */
package de_av.uka_av.ipd_av.sdq_av.probfunction_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.ExponentialDistribution#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.probfunction_av.Probfunction_avPackage#getExponentialDistribution()
 * @model
 * @generated
 */
public interface ExponentialDistribution extends ContinuousPDF {
   /**
    * Returns the value of the '<em><b>Rate</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Rate</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Rate</em>' attribute.
    * @see #setRate(double)
    * @see de_av.uka_av.ipd_av.sdq_av.probfunction_av.Probfunction_avPackage#getExponentialDistribution_Rate()
    * @model required="true" ordered="false"
    * @generated
    */
   double getRate();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.ExponentialDistribution#getRate <em>Rate</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Rate</em>' attribute.
    * @see #getRate()
    * @generated
    */
   void setRate(double value);

} // ExponentialDistribution
