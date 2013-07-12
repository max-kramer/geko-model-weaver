/**
 */
package de_av.uka_av.ipd_av.sdq_av.units_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.units_av.Units_avPackage
 * @generated
 */
public interface Units_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Units_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Unit Carrying Element</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Unit Carrying Element</em>'.
    * @generated
    */
   UnitCarryingElement createUnitCarryingElement();

   /**
    * Returns a new object of class '<em>Unit</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Unit</em>'.
    * @generated
    */
   Unit createUnit();

   /**
    * Returns a new object of class '<em>Base Unit</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Base Unit</em>'.
    * @generated
    */
   BaseUnit createBaseUnit();

   /**
    * Returns a new object of class '<em>Unit Repository</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Unit Repository</em>'.
    * @generated
    */
   UnitRepository createUnitRepository();

   /**
    * Returns a new object of class '<em>Unit Multiplication</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Unit Multiplication</em>'.
    * @generated
    */
   UnitMultiplication createUnitMultiplication();

   /**
    * Returns a new object of class '<em>Unit Power</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Unit Power</em>'.
    * @generated
    */
   UnitPower createUnitPower();

   /**
    * Returns a new object of class '<em>Unit Literal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Unit Literal</em>'.
    * @generated
    */
   UnitLiteral createUnitLiteral();

   /**
    * Returns a new object of class '<em>Advice</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Advice</em>'.
    * @generated
    */
   Advice createAdvice();

   /**
    * Returns a new object of class '<em>Global Scope</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Global Scope</em>'.
    * @generated
    */
   GlobalScope createGlobalScope();

   /**
    * Returns a new object of class '<em>Per Join Point Scope</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Per Join Point Scope</em>'.
    * @generated
    */
   PerJoinPointScope createPerJoinPointScope();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Units_avPackage getUnits_avPackage();

} //Units_avFactory
