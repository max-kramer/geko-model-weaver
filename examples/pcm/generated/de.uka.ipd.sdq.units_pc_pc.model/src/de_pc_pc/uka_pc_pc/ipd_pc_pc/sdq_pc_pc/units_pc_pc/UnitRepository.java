/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.UnitRepository#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.Units_pc_pcPackage#getUnitRepository()
 * @model
 * @generated
 */
public interface UnitRepository extends EObject {
   /**
    * Returns the value of the '<em><b>Units</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.BaseUnit}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Units</em>' containment reference list.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.Units_pc_pcPackage#getUnitRepository_Units()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<BaseUnit> getUnits();

} // UnitRepository
