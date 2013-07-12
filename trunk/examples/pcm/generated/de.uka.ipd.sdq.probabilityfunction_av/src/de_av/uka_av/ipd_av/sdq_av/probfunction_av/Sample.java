/**
 */
package de_av.uka_av.ipd_av.sdq_av.probfunction_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.Sample#getValue <em>Value</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.Sample#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.probfunction_av.Probfunction_avPackage#getSample()
 * @model
 * @generated
 */
public interface Sample<T> extends EObject {
   /**
    * Returns the value of the '<em><b>Value</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Value</em>' reference.
    * @see #setValue(Object)
    * @see de_av.uka_av.ipd_av.sdq_av.probfunction_av.Probfunction_avPackage#getSample_Value()
    * @model kind="reference" ordered="false"
    * @generated
    */
   T getValue();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.Sample#getValue <em>Value</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Value</em>' reference.
    * @see #getValue()
    * @generated
    */
   void setValue(T value);

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
    * @see de_av.uka_av.ipd_av.sdq_av.probfunction_av.Probfunction_avPackage#getSample_Probability()
    * @model unique="false" ordered="false"
    * @generated
    */
   double getProbability();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.Sample#getProbability <em>Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Probability</em>' attribute.
    * @see #getProbability()
    * @generated
    */
   void setProbability(double value);

} // Sample
