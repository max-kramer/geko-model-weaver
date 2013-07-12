/**
 */
package de_av.uka_av.ipd_av.sdq_av.units_av;

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
 * @see de_av.uka_av.ipd_av.sdq_av.units_av.Units_avFactory
 * @model kind="package"
 * @generated
 */
public interface Units_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "units_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/Units/1.0_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "units_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Units_avPackage eINSTANCE = de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitCarryingElementImpl <em>Unit Carrying Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitCarryingElementImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitCarryingElement()
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
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitImpl <em>Unit</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnit()
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
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.BaseUnitImpl <em>Base Unit</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.BaseUnitImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getBaseUnit()
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
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitRepositoryImpl <em>Unit Repository</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitRepositoryImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitRepository()
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
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitMultiplicationImpl <em>Unit Multiplication</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitMultiplicationImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitMultiplication()
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
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitPowerImpl <em>Unit Power</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitPowerImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitPower()
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
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitLiteralImpl <em>Unit Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitLiteralImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitLiteral()
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
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.AdviceImpl <em>Advice</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.AdviceImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getAdvice()
    * @generated
    */
   int ADVICE = 7;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ADVICE__CHILDREN = 0;

   /**
    * The number of structural features of the '<em>Advice</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ADVICE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.GlobalScopeImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getGlobalScope()
    * @generated
    */
   int GLOBAL_SCOPE = 8;

   /**
    * The feature id for the '<em><b>Scoped Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GLOBAL_SCOPE__SCOPED_OBJECT = 0;

   /**
    * The number of structural features of the '<em>Global Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GLOBAL_SCOPE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.PerJoinPointScopeImpl
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getPerJoinPointScope()
    * @generated
    */
   int PER_JOIN_POINT_SCOPE = 9;

   /**
    * The feature id for the '<em><b>Scoped Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = 0;

   /**
    * The number of structural features of the '<em>Per Join Point Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PER_JOIN_POINT_SCOPE_FEATURE_COUNT = 1;


   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement <em>Unit Carrying Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Carrying Element</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement
    * @generated
    */
   EClass getUnitCarryingElement();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement#getUnit <em>Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Unit</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement#getUnit()
    * @see #getUnitCarryingElement()
    * @generated
    */
   EReference getUnitCarryingElement_Unit();

   /**
    * Returns the meta object for the attribute '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement#getUnitSpecification <em>Unit Specification</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Unit Specification</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement#getUnitSpecification()
    * @see #getUnitCarryingElement()
    * @generated
    */
   EAttribute getUnitCarryingElement_UnitSpecification();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.Unit <em>Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.Unit
    * @generated
    */
   EClass getUnit();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.BaseUnit <em>Base Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Base Unit</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.BaseUnit
    * @generated
    */
   EClass getBaseUnit();

   /**
    * Returns the meta object for the attribute '{@link de_av.uka_av.ipd_av.sdq_av.units_av.BaseUnit#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.BaseUnit#getName()
    * @see #getBaseUnit()
    * @generated
    */
   EAttribute getBaseUnit_Name();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitRepository <em>Unit Repository</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Repository</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitRepository
    * @generated
    */
   EClass getUnitRepository();

   /**
    * Returns the meta object for the containment reference list '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitRepository#getUnits <em>Units</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Units</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitRepository#getUnits()
    * @see #getUnitRepository()
    * @generated
    */
   EReference getUnitRepository_Units();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitMultiplication <em>Unit Multiplication</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Multiplication</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitMultiplication
    * @generated
    */
   EClass getUnitMultiplication();

   /**
    * Returns the meta object for the containment reference list '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitMultiplication#getUnits <em>Units</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Units</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitMultiplication#getUnits()
    * @see #getUnitMultiplication()
    * @generated
    */
   EReference getUnitMultiplication_Units();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitPower <em>Unit Power</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Power</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitPower
    * @generated
    */
   EClass getUnitPower();

   /**
    * Returns the meta object for the containment reference '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitPower#getUnit <em>Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Unit</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitPower#getUnit()
    * @see #getUnitPower()
    * @generated
    */
   EReference getUnitPower_Unit();

   /**
    * Returns the meta object for the attribute '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitPower#getExponent <em>Exponent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Exponent</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitPower#getExponent()
    * @see #getUnitPower()
    * @generated
    */
   EAttribute getUnitPower_Exponent();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitLiteral <em>Unit Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Unit Literal</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitLiteral
    * @generated
    */
   EClass getUnitLiteral();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitLiteral#getBaseUnit <em>Base Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Base Unit</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitLiteral#getBaseUnit()
    * @see #getUnitLiteral()
    * @generated
    */
   EReference getUnitLiteral_BaseUnit();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.Advice <em>Advice</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Advice</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.Advice
    * @generated
    */
   EClass getAdvice();

   /**
    * Returns the meta object for the containment reference list '{@link de_av.uka_av.ipd_av.sdq_av.units_av.Advice#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.Advice#getChildren()
    * @see #getAdvice()
    * @generated
    */
   EReference getAdvice_Children();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.GlobalScope <em>Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Global Scope</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.GlobalScope
    * @generated
    */
   EClass getGlobalScope();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.units_av.GlobalScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.GlobalScope#getScopedObject()
    * @see #getGlobalScope()
    * @generated
    */
   EReference getGlobalScope_ScopedObject();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.PerJoinPointScope <em>Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Per Join Point Scope</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.PerJoinPointScope
    * @generated
    */
   EClass getPerJoinPointScope();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.units_av.PerJoinPointScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.PerJoinPointScope#getScopedObject()
    * @see #getPerJoinPointScope()
    * @generated
    */
   EReference getPerJoinPointScope_ScopedObject();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Units_avFactory getUnits_avFactory();

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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitCarryingElementImpl <em>Unit Carrying Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitCarryingElementImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitCarryingElement()
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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitImpl <em>Unit</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnit()
       * @generated
       */
      EClass UNIT = eINSTANCE.getUnit();

      /**
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.BaseUnitImpl <em>Base Unit</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.BaseUnitImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getBaseUnit()
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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitRepositoryImpl <em>Unit Repository</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitRepositoryImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitRepository()
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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitMultiplicationImpl <em>Unit Multiplication</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitMultiplicationImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitMultiplication()
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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitPowerImpl <em>Unit Power</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitPowerImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitPower()
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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitLiteralImpl <em>Unit Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.UnitLiteralImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getUnitLiteral()
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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.AdviceImpl <em>Advice</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.AdviceImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getAdvice()
       * @generated
       */
      EClass ADVICE = eINSTANCE.getAdvice();

      /**
       * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ADVICE__CHILDREN = eINSTANCE.getAdvice_Children();

      /**
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.GlobalScopeImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getGlobalScope()
       * @generated
       */
      EClass GLOBAL_SCOPE = eINSTANCE.getGlobalScope();

      /**
       * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference GLOBAL_SCOPE__SCOPED_OBJECT = eINSTANCE.getGlobalScope_ScopedObject();

      /**
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.units_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.PerJoinPointScopeImpl
       * @see de_av.uka_av.ipd_av.sdq_av.units_av.impl.Units_avPackageImpl#getPerJoinPointScope()
       * @generated
       */
      EClass PER_JOIN_POINT_SCOPE = eINSTANCE.getPerJoinPointScope();

      /**
       * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = eINSTANCE.getPerJoinPointScope_ScopedObject();

   }

} //Units_avPackage
