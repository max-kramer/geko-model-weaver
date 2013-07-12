/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av;

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
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.UnitRepository#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.Units_av_avPackage#getUnitRepository()
 * @model
 * @generated
 */
public interface UnitRepository extends EObject {
   /**
    * Returns the value of the '<em><b>Units</b></em>' containment reference list.
    * The list contents are of type {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.BaseUnit}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Units</em>' containment reference list.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.Units_av_avPackage#getUnitRepository_Units()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<BaseUnit> getUnits();

} // UnitRepository
