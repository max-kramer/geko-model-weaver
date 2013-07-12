/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.units_pc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Units_pcFactory
 * @model kind="package"
 * @generated
 */
public interface Units_pcPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "units_pc";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/Units/1.0_pointcut";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "units_pc";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Units_pcPackage eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitCarryingElementImpl <em>Unit Carrying Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitCarryingElementImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitCarryingElement()
    * @generated
    */
   int UNIT_CARRYING_ELEMENT = 0;

   /**
    * The feature id for the '<em><b>Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_CARRYING_ELEMENT__UNIT = 0;

   /**
    * The feature id for the '<em><b>Unit Specification</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION = 1;

   /**
    * The number of structural features of the '<em>Unit Carrying Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_CARRYING_ELEMENT_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitImpl <em>Unit</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnit()
    * @generated
    */
   int UNIT = 1;

   /**
    * The number of structural features of the '<em>Unit</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.BaseUnitImpl <em>Base Unit</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.BaseUnitImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getBaseUnit()
    * @generated
    */
   int BASE_UNIT = 2;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASE_UNIT__NAME = 0;

   /**
    * The number of structural features of the '<em>Base Unit</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BASE_UNIT_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitRepositoryImpl <em>Unit Repository</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitRepositoryImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitRepository()
    * @generated
    */
   int UNIT_REPOSITORY = 3;

   /**
    * The feature id for the '<em><b>Units</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_REPOSITORY__UNITS = 0;

   /**
    * The number of structural features of the '<em>Unit Repository</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_REPOSITORY_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitMultiplicationImpl <em>Unit Multiplication</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitMultiplicationImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitMultiplication()
    * @generated
    */
   int UNIT_MULTIPLICATION = 4;

   /**
    * The feature id for the '<em><b>Units</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_MULTIPLICATION__UNITS = UNIT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Unit Multiplication</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_MULTIPLICATION_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitPowerImpl <em>Unit Power</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitPowerImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitPower()
    * @generated
    */
   int UNIT_POWER = 5;

   /**
    * The feature id for the '<em><b>Unit</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_POWER__UNIT = UNIT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Exponent</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_POWER__EXPONENT = UNIT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Unit Power</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_POWER_FEATURE_COUNT = UNIT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitLiteralImpl <em>Unit Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitLiteralImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitLiteral()
    * @generated
    */
   int UNIT_LITERAL = 6;

   /**
    * The feature id for the '<em><b>Base Unit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_LITERAL__BASE_UNIT = UNIT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Unit Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIT_LITERAL_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.PointcutImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getPointcut()
    * @generated
    */
   int POINTCUT = 7;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POINTCUT__CHILDREN = 0;

   /**
    * The number of structural features of the '<em>Pointcut</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POINTCUT_FEATURE_COUNT = 1;


   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitCarryingElement <em>Unit Carrying Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Carrying Element</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitCarryingElement
    * @generated
    */
   EClass getUnitCarryingElement();

   /**
    * Returns the meta object for the reference '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitCarryingElement#getUnit <em>Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Unit</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitCarryingElement#getUnit()
    * @see #getUnitCarryingElement()
    * @generated
    */
   EReference getUnitCarryingElement_Unit();

   /**
    * Returns the meta object for the attribute '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitCarryingElement#getUnitSpecification <em>Unit Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Unit Specification</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitCarryingElement#getUnitSpecification()
    * @see #getUnitCarryingElement()
    * @generated
    */
   EAttribute getUnitCarryingElement_UnitSpecification();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Unit <em>Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Unit
    * @generated
    */
   EClass getUnit();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.BaseUnit <em>Base Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Base Unit</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.BaseUnit
    * @generated
    */
   EClass getBaseUnit();

   /**
    * Returns the meta object for the attribute '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.BaseUnit#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.BaseUnit#getName()
    * @see #getBaseUnit()
    * @generated
    */
   EAttribute getBaseUnit_Name();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitRepository <em>Unit Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Repository</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitRepository
    * @generated
    */
   EClass getUnitRepository();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitRepository#getUnits <em>Units</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Units</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitRepository#getUnits()
    * @see #getUnitRepository()
    * @generated
    */
   EReference getUnitRepository_Units();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitMultiplication <em>Unit Multiplication</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Multiplication</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitMultiplication
    * @generated
    */
   EClass getUnitMultiplication();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitMultiplication#getUnits <em>Units</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Units</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitMultiplication#getUnits()
    * @see #getUnitMultiplication()
    * @generated
    */
   EReference getUnitMultiplication_Units();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitPower <em>Unit Power</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Power</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitPower
    * @generated
    */
   EClass getUnitPower();

   /**
    * Returns the meta object for the containment reference '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitPower#getUnit <em>Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Unit</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitPower#getUnit()
    * @see #getUnitPower()
    * @generated
    */
   EReference getUnitPower_Unit();

   /**
    * Returns the meta object for the attribute '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitPower#getExponent <em>Exponent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Exponent</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitPower#getExponent()
    * @see #getUnitPower()
    * @generated
    */
   EAttribute getUnitPower_Exponent();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitLiteral <em>Unit Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Literal</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitLiteral
    * @generated
    */
   EClass getUnitLiteral();

   /**
    * Returns the meta object for the reference '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitLiteral#getBaseUnit <em>Base Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Base Unit</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitLiteral#getBaseUnit()
    * @see #getUnitLiteral()
    * @generated
    */
   EReference getUnitLiteral_BaseUnit();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Pointcut <em>Pointcut</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pointcut</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Pointcut
    * @generated
    */
   EClass getPointcut();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Pointcut#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Pointcut#getChildren()
    * @see #getPointcut()
    * @generated
    */
   EReference getPointcut_Children();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Units_pcFactory getUnits_pcFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitCarryingElementImpl <em>Unit Carrying Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitCarryingElementImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitCarryingElement()
       * @generated
       */
      EClass UNIT_CARRYING_ELEMENT = eINSTANCE.getUnitCarryingElement();

      /**
       * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference UNIT_CARRYING_ELEMENT__UNIT = eINSTANCE.getUnitCarryingElement_Unit();

      /**
       * The meta object literal for the '<em><b>Unit Specification</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION = eINSTANCE.getUnitCarryingElement_UnitSpecification();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitImpl <em>Unit</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnit()
       * @generated
       */
      EClass UNIT = eINSTANCE.getUnit();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.BaseUnitImpl <em>Base Unit</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.BaseUnitImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getBaseUnit()
       * @generated
       */
      EClass BASE_UNIT = eINSTANCE.getBaseUnit();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute BASE_UNIT__NAME = eINSTANCE.getBaseUnit_Name();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitRepositoryImpl <em>Unit Repository</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitRepositoryImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitRepository()
       * @generated
       */
      EClass UNIT_REPOSITORY = eINSTANCE.getUnitRepository();

      /**
       * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference UNIT_REPOSITORY__UNITS = eINSTANCE.getUnitRepository_Units();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitMultiplicationImpl <em>Unit Multiplication</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitMultiplicationImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitMultiplication()
       * @generated
       */
      EClass UNIT_MULTIPLICATION = eINSTANCE.getUnitMultiplication();

      /**
       * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference UNIT_MULTIPLICATION__UNITS = eINSTANCE.getUnitMultiplication_Units();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitPowerImpl <em>Unit Power</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitPowerImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitPower()
       * @generated
       */
      EClass UNIT_POWER = eINSTANCE.getUnitPower();

      /**
       * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference UNIT_POWER__UNIT = eINSTANCE.getUnitPower_Unit();

      /**
       * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute UNIT_POWER__EXPONENT = eINSTANCE.getUnitPower_Exponent();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitLiteralImpl <em>Unit Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitLiteralImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getUnitLiteral()
       * @generated
       */
      EClass UNIT_LITERAL = eINSTANCE.getUnitLiteral();

      /**
       * The meta object literal for the '<em><b>Base Unit</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference UNIT_LITERAL__BASE_UNIT = eINSTANCE.getUnitLiteral_BaseUnit();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.PointcutImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.Units_pcPackageImpl#getPointcut()
       * @generated
       */
      EClass POINTCUT = eINSTANCE.getPointcut();

      /**
       * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference POINTCUT__CHILDREN = eINSTANCE.getPointcut_Children();

   }

} //Units_pcPackage
