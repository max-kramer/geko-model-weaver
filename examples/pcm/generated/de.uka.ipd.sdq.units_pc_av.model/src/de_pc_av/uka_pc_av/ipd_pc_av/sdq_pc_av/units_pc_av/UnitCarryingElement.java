/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Carrying Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitCarryingElement#getUnit <em>Unit</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitCarryingElement#getUnitSpecification <em>Unit Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage#getUnitCarryingElement()
 * @model
 * @generated
 */
public interface UnitCarryingElement extends EObject {
   /**
    * Returns the value of the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Unit</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Unit</em>' reference.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage#getUnitCarryingElement_Unit()
    * @model transient="true" volatile="true" ordered="false" suppressedSetVisibility="true"
    *        extendedMetaData="name='' namespace=''"
    * @generated
    */
   Unit getUnit();

   /**
    * Returns the value of the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Unit Specification</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Unit Specification</em>' attribute.
    * @see #setUnitSpecification(String)
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage#getUnitCarryingElement_UnitSpecification()
    * @model required="true" ordered="false"
    * @generated
    */
   String getUnitSpecification();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitCarryingElement#getUnitSpecification <em>Unit Specification</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Unit Specification</em>' attribute.
    * @see #getUnitSpecification()
    * @generated
    */
   void setUnitSpecification(String value);

} // UnitCarryingElement
