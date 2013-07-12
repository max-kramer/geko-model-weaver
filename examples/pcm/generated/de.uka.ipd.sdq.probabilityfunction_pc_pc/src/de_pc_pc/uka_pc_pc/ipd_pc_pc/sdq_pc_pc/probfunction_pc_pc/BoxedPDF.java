/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boxed PDF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.BoxedPDF#getSamples <em>Samples</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage#getBoxedPDF()
 * @model
 * @generated
 */
public interface BoxedPDF extends ProbabilityDensityFunction {
   /**
    * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.ContinuousSample}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Samples</em>' containment reference list.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage#getBoxedPDF_Samples()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<ContinuousSample> getSamples();

} // BoxedPDF
