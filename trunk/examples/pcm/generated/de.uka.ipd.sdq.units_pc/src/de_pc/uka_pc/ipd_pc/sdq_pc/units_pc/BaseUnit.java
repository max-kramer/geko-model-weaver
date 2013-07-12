/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.units_pc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.BaseUnit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Units_pcPackage#getBaseUnit()
 * @model
 * @generated
 */
public interface BaseUnit extends EObject {
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Units_pcPackage#getBaseUnit_Name()
    * @model id="true" required="true" ordered="false"
    *        extendedMetaData="name='' namespace=''"
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.BaseUnit#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

} // BaseUnit
