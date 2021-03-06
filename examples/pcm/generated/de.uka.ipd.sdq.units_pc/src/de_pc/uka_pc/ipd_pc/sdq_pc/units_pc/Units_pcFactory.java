/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.units_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Units_pcPackage
 * @generated
 */
public interface Units_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Units_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcFactoryImpl.init();

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
    * Returns a new object of class '<em>Pointcut</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Pointcut</em>'.
    * @generated
    */
   Pointcut createPointcut();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Units_pcPackage getUnits_pcPackage();

} //Units_pcFactory
