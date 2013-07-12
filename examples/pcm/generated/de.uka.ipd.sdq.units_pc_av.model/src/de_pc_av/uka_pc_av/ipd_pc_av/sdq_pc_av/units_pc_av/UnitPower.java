/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitPower#getUnit <em>Unit</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitPower#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage#getUnitPower()
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
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage#getUnitPower_Unit()
    * @model containment="true" ordered="false"
    * @generated
    */
   Unit getUnit();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitPower#getUnit <em>Unit</em>}' containment reference.
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
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage#getUnitPower_Exponent()
    * @model required="true" ordered="false"
    * @generated
    */
   int getExponent();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitPower#getExponent <em>Exponent</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Exponent</em>' attribute.
    * @see #getExponent()
    * @generated
    */
   void setExponent(int value);

} // UnitPower
