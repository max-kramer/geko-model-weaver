/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.UnitLiteral#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.Units_pc_pcPackage#getUnitLiteral()
 * @model
 * @generated
 */
public interface UnitLiteral extends Unit {
   /**
    * Returns the value of the '<em><b>Base Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Base Unit</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Base Unit</em>' reference.
    * @see #setBaseUnit(BaseUnit)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.Units_pc_pcPackage#getUnitLiteral_BaseUnit()
    * @model ordered="false"
    * @generated
    */
   BaseUnit getBaseUnit();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.UnitLiteral#getBaseUnit <em>Base Unit</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Base Unit</em>' reference.
    * @see #getBaseUnit()
    * @generated
    */
   void setBaseUnit(BaseUnit value);

} // UnitLiteral