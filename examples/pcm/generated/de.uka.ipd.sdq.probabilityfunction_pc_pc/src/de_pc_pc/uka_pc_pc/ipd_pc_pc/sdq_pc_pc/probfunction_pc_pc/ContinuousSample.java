/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.ContinuousSample#getValue <em>Value</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.ContinuousSample#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage#getContinuousSample()
 * @model
 * @generated
 */
public interface ContinuousSample extends EObject {
   /**
    * Returns the value of the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Value</em>' attribute.
    * @see #setValue(double)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage#getContinuousSample_Value()
    * @model unique="false" ordered="false"
    * @generated
    */
   double getValue();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.ContinuousSample#getValue <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Value</em>' attribute.
    * @see #getValue()
    * @generated
    */
   void setValue(double value);

   /**
    * Returns the value of the '<em><b>Probability</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Probability</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Probability</em>' attribute.
    * @see #setProbability(double)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage#getContinuousSample_Probability()
    * @model unique="false" ordered="false"
    * @generated
    */
   double getProbability();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.ContinuousSample#getProbability <em>Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Probability</em>' attribute.
    * @see #getProbability()
    * @generated
    */
   void setProbability(double value);

} // ContinuousSample
