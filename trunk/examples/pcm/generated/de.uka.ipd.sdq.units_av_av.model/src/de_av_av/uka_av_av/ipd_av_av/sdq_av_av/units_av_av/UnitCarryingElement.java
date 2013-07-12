/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Carrying Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.UnitCarryingElement#getUnit <em>Unit</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.UnitCarryingElement#getUnitSpecification <em>Unit Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.Units_av_avPackage#getUnitCarryingElement()
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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.Units_av_avPackage#getUnitCarryingElement_Unit()
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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.Units_av_avPackage#getUnitCarryingElement_UnitSpecification()
    * @model required="true" ordered="false"
    * @generated
    */
   String getUnitSpecification();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.UnitCarryingElement#getUnitSpecification <em>Unit Specification</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Unit Specification</em>' attribute.
    * @see #getUnitSpecification()
    * @generated
    */
   void setUnitSpecification(String value);

} // UnitCarryingElement
