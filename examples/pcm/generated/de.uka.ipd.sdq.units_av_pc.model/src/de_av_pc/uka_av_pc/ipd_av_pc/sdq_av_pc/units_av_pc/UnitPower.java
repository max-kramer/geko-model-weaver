/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.UnitPower#getUnit <em>Unit</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.UnitPower#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.Units_av_pcPackage#getUnitPower()
 * @model
 * @generated
 */
public interface UnitPower extends Unit {
   /**
    * Returns the value of the '<em><b>Unit</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Unit</em>' containment reference.
    * @see #setUnit(Unit)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.Units_av_pcPackage#getUnitPower_Unit()
    * @model containment="true" ordered="false"
    * @generated
    */
   Unit getUnit();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.UnitPower#getUnit <em>Unit</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Unit</em>' containment reference.
    * @see #getUnit()
    * @generated
    */
   void setUnit(Unit value);

   /**
    * Returns the value of the '<em><b>Exponent</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Exponent</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Exponent</em>' attribute.
    * @see #setExponent(int)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.Units_av_pcPackage#getUnitPower_Exponent()
    * @model required="true" ordered="false"
    * @generated
    */
   int getExponent();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.UnitPower#getExponent <em>Exponent</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Exponent</em>' attribute.
    * @see #getExponent()
    * @generated
    */
   void setExponent(int value);

} // UnitPower
