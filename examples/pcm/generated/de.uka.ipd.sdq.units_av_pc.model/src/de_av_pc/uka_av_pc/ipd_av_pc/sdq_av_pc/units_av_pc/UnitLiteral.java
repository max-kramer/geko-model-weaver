/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.UnitLiteral#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.Units_av_pcPackage#getUnitLiteral()
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
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.Units_av_pcPackage#getUnitLiteral_BaseUnit()
    * @model ordered="false"
    * @generated
    */
   BaseUnit getBaseUnit();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.UnitLiteral#getBaseUnit <em>Base Unit</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Base Unit</em>' reference.
    * @see #getBaseUnit()
    * @generated
    */
   void setBaseUnit(BaseUnit value);

} // UnitLiteral
