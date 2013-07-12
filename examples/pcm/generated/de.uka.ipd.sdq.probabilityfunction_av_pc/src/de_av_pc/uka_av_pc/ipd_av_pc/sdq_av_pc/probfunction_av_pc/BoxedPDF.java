/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boxed PDF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.BoxedPDF#getSamples <em>Samples</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.Probfunction_av_pcPackage#getBoxedPDF()
 * @model
 * @generated
 */
public interface BoxedPDF extends ProbabilityDensityFunction {
   /**
    * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.ContinuousSample}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Samples</em>' containment reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.Probfunction_av_pcPackage#getBoxedPDF_Samples()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<ContinuousSample> getSamples();

} // BoxedPDF
