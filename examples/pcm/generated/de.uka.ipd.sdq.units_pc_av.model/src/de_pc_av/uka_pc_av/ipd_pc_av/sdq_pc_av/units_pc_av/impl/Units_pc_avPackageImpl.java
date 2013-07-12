/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Advice;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.BaseUnit;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.GlobalScope;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.PerJoinPointScope;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Pointcut;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Unit;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitCarryingElement;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitLiteral;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitMultiplication;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitPower;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitRepository;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avFactory;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Units_pc_avPackageImpl extends EPackageImpl implements Units_pc_avPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass unitCarryingElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass unitEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass baseUnitEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass unitRepositoryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass unitMultiplicationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass unitPowerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass unitLiteralEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass pointcutEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass adviceEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass globalScopeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass perJoinPointScopeEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Units_pc_avPackageImpl() {
      super(eNS_URI, Units_pc_avFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link Units_pc_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Units_pc_avPackage init() {
      if (isInited) return (Units_pc_avPackage)EPackage.Registry.INSTANCE.getEPackage(Units_pc_avPackage.eNS_URI);

      // Obtain or create and register package
      Units_pc_avPackageImpl theUnits_pc_avPackage = (Units_pc_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Units_pc_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Units_pc_avPackageImpl());

      isInited = true;

      // Create package meta-data objects
      theUnits_pc_avPackage.createPackageContents();

      // Initialize created meta-data
      theUnits_pc_avPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theUnits_pc_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Units_pc_avPackage.eNS_URI, theUnits_pc_avPackage);
      return theUnits_pc_avPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUnitCarryingElement() {
      return unitCarryingElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUnitCarryingElement_Unit() {
      return (EReference)unitCarryingElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getUnitCarryingElement_UnitSpecification() {
      return (EAttribute)unitCarryingElementEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUnit() {
      return unitEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBaseUnit() {
      return baseUnitEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getBaseUnit_Name() {
      return (EAttribute)baseUnitEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUnitRepository() {
      return unitRepositoryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUnitRepository_Units() {
      return (EReference)unitRepositoryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUnitMultiplication() {
      return unitMultiplicationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUnitMultiplication_Units() {
      return (EReference)unitMultiplicationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUnitPower() {
      return unitPowerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUnitPower_Unit() {
      return (EReference)unitPowerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getUnitPower_Exponent() {
      return (EAttribute)unitPowerEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUnitLiteral() {
      return unitLiteralEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getUnitLiteral_BaseUnit() {
      return (EReference)unitLiteralEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPointcut() {
      return pointcutEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPointcut_Children() {
      return (EReference)pointcutEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAdvice() {
      return adviceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAdvice_Children() {
      return (EReference)adviceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getGlobalScope() {
      return globalScopeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getGlobalScope_ScopedObject() {
      return (EReference)globalScopeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPerJoinPointScope() {
      return perJoinPointScopeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPerJoinPointScope_ScopedObject() {
      return (EReference)perJoinPointScopeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_pc_avFactory getUnits_pc_avFactory() {
      return (Units_pc_avFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents() {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      unitCarryingElementEClass = createEClass(UNIT_CARRYING_ELEMENT);
      createEReference(unitCarryingElementEClass, UNIT_CARRYING_ELEMENT__UNIT);
      createEAttribute(unitCarryingElementEClass, UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION);

      unitEClass = createEClass(UNIT);

      baseUnitEClass = createEClass(BASE_UNIT);
      createEAttribute(baseUnitEClass, BASE_UNIT__NAME);

      unitRepositoryEClass = createEClass(UNIT_REPOSITORY);
      createEReference(unitRepositoryEClass, UNIT_REPOSITORY__UNITS);

      unitMultiplicationEClass = createEClass(UNIT_MULTIPLICATION);
      createEReference(unitMultiplicationEClass, UNIT_MULTIPLICATION__UNITS);

      unitPowerEClass = createEClass(UNIT_POWER);
      createEReference(unitPowerEClass, UNIT_POWER__UNIT);
      createEAttribute(unitPowerEClass, UNIT_POWER__EXPONENT);

      unitLiteralEClass = createEClass(UNIT_LITERAL);
      createEReference(unitLiteralEClass, UNIT_LITERAL__BASE_UNIT);

      pointcutEClass = createEClass(POINTCUT);
      createEReference(pointcutEClass, POINTCUT__CHILDREN);

      adviceEClass = createEClass(ADVICE);
      createEReference(adviceEClass, ADVICE__CHILDREN);

      globalScopeEClass = createEClass(GLOBAL_SCOPE);
      createEReference(globalScopeEClass, GLOBAL_SCOPE__SCOPED_OBJECT);

      perJoinPointScopeEClass = createEClass(PER_JOIN_POINT_SCOPE);
      createEReference(perJoinPointScopeEClass, PER_JOIN_POINT_SCOPE__SCOPED_OBJECT);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents() {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      unitMultiplicationEClass.getESuperTypes().add(this.getUnit());
      unitPowerEClass.getESuperTypes().add(this.getUnit());
      unitLiteralEClass.getESuperTypes().add(this.getUnit());

      // Initialize classes and features; add operations and parameters
      initEClass(unitCarryingElementEClass, UnitCarryingElement.class, "UnitCarryingElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getUnitCarryingElement_Unit(), this.getUnit(), null, "unit", null, 0, 1, UnitCarryingElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getUnitCarryingElement_UnitSpecification(), ecorePackage.getEString(), "unitSpecification", null, 1, 1, UnitCarryingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(baseUnitEClass, BaseUnit.class, "BaseUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getBaseUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, BaseUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(unitRepositoryEClass, UnitRepository.class, "UnitRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getUnitRepository_Units(), this.getBaseUnit(), null, "units", null, 0, -1, UnitRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(unitMultiplicationEClass, UnitMultiplication.class, "UnitMultiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getUnitMultiplication_Units(), this.getUnit(), null, "units", null, 0, -1, UnitMultiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(unitPowerEClass, UnitPower.class, "UnitPower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getUnitPower_Unit(), this.getUnit(), null, "unit", null, 0, 1, UnitPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getUnitPower_Exponent(), ecorePackage.getEInt(), "exponent", null, 1, 1, UnitPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(unitLiteralEClass, UnitLiteral.class, "UnitLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getUnitLiteral_BaseUnit(), this.getBaseUnit(), null, "baseUnit", null, 0, 1, UnitLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPointcut_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAdvice_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(globalScopeEClass, GlobalScope.class, "GlobalScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getGlobalScope_ScopedObject(), ecorePackage.getEObject(), null, "scopedObject", null, 1, 1, GlobalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(perJoinPointScopeEClass, PerJoinPointScope.class, "PerJoinPointScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPerJoinPointScope_ScopedObject(), ecorePackage.getEObject(), null, "scopedObject", null, 1, 1, PerJoinPointScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);

      // Create annotations
      // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
      createExtendedMetaDataAnnotations();
   }

   /**
    * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createExtendedMetaDataAnnotations() {
      String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
      addAnnotation
        (getUnitCarryingElement_Unit(), 
         source, 
         new String[] {
          "name", "",
          "namespace", ""
         });			
      addAnnotation
        (getBaseUnit_Name(), 
         source, 
         new String[] {
          "name", "",
          "namespace", ""
         });
   }

} //Units_pc_avPackageImpl
