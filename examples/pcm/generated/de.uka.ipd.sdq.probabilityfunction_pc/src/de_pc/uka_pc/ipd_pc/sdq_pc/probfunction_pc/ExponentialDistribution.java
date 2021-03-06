/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.ExponentialDistribution#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage#getExponentialDistribution()
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
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage#getExponentialDistribution_Rate()
    * @model required="true" ordered="false"
    * @generated
    */
   double getRate();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.ExponentialDistribution#getRate <em>Rate</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Rate</em>' attribute.
    * @see #getRate()
    * @generated
    */
   void setRate(double value);

} // ExponentialDistribution
