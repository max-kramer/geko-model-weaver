/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av;

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
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitRepository#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage#getUnitRepository()
 * @model
 * @generated
 */
public interface UnitRepository extends EObject {
   /**
    * Returns the value of the '<em><b>Units</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.BaseUnit}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Units</em>' containment reference list.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage#getUnitRepository_Units()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<BaseUnit> getUnits();

} // UnitRepository
