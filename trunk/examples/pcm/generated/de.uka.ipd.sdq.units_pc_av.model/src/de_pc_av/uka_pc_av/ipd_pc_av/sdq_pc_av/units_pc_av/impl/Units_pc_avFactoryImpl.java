/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Units_pc_avFactoryImpl extends EFactoryImpl implements Units_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Units_pc_avFactory init() {
      try {
         Units_pc_avFactory theUnits_pc_avFactory = (Units_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Units_pc_avPackage.eNS_URI);
         if (theUnits_pc_avFactory != null) {
            return theUnits_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Units_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_pc_avFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case Units_pc_avPackage.UNIT_CARRYING_ELEMENT: return createUnitCarryingElement();
         case Units_pc_avPackage.UNIT: return createUnit();
         case Units_pc_avPackage.BASE_UNIT: return createBaseUnit();
         case Units_pc_avPackage.UNIT_REPOSITORY: return createUnitRepository();
         case Units_pc_avPackage.UNIT_MULTIPLICATION: return createUnitMultiplication();
         case Units_pc_avPackage.UNIT_POWER: return createUnitPower();
         case Units_pc_avPackage.UNIT_LITERAL: return createUnitLiteral();
         case Units_pc_avPackage.POINTCUT: return createPointcut();
         case Units_pc_avPackage.ADVICE: return createAdvice();
         case Units_pc_avPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Units_pc_avPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UnitCarryingElement createUnitCarryingElement() {
      UnitCarryingElementImpl unitCarryingElement = new UnitCarryingElementImpl();
      return unitCarryingElement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Unit createUnit() {
      UnitImpl unit = new UnitImpl();
      return unit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BaseUnit createBaseUnit() {
      BaseUnitImpl baseUnit = new BaseUnitImpl();
      return baseUnit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UnitRepository createUnitRepository() {
      UnitRepositoryImpl unitRepository = new UnitRepositoryImpl();
      return unitRepository;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UnitMultiplication createUnitMultiplication() {
      UnitMultiplicationImpl unitMultiplication = new UnitMultiplicationImpl();
      return unitMultiplication;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UnitPower createUnitPower() {
      UnitPowerImpl unitPower = new UnitPowerImpl();
      return unitPower;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UnitLiteral createUnitLiteral() {
      UnitLiteralImpl unitLiteral = new UnitLiteralImpl();
      return unitLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pointcut createPointcut() {
      PointcutImpl pointcut = new PointcutImpl();
      return pointcut;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Advice createAdvice() {
      AdviceImpl advice = new AdviceImpl();
      return advice;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GlobalScope createGlobalScope() {
      GlobalScopeImpl globalScope = new GlobalScopeImpl();
      return globalScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PerJoinPointScope createPerJoinPointScope() {
      PerJoinPointScopeImpl perJoinPointScope = new PerJoinPointScopeImpl();
      return perJoinPointScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_pc_avPackage getUnits_pc_avPackage() {
      return (Units_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Units_pc_avPackage getPackage() {
      return Units_pc_avPackage.eINSTANCE;
   }

} //Units_pc_avFactoryImpl
