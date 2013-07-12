/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.ProbabilityFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probability Function Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.ProbabilityFunctionLiteral#getFunction_ProbabilityFunctionLiteral <em>Function Probability Function Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getProbabilityFunctionLiteral()
 * @model
 * @generated
 */
public interface ProbabilityFunctionLiteral extends Atom {
   /**
    * Returns the value of the '<em><b>Function Probability Function Literal</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Function Probability Function Literal</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Function Probability Function Literal</em>' containment reference.
    * @see #setFunction_ProbabilityFunctionLiteral(ProbabilityFunction)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage#getProbabilityFunctionLiteral_Function_ProbabilityFunctionLiteral()
    * @model containment="true" ordered="false"
    * @generated
    */
   ProbabilityFunction getFunction_ProbabilityFunctionLiteral();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.ProbabilityFunctionLiteral#getFunction_ProbabilityFunctionLiteral <em>Function Probability Function Literal</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Function Probability Function Literal</em>' containment reference.
    * @see #getFunction_ProbabilityFunctionLiteral()
    * @generated
    */
   void setFunction_ProbabilityFunctionLiteral(ProbabilityFunction value);

} // ProbabilityFunctionLiteral
