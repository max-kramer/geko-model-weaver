/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boxed PDF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.BoxedPDF#getSamples <em>Samples</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage#getBoxedPDF()
 * @model
 * @generated
 */
public interface BoxedPDF extends ProbabilityDensityFunction {
   /**
    * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.ContinuousSample}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Samples</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage#getBoxedPDF_Samples()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<ContinuousSample> getSamples();

} // BoxedPDF
