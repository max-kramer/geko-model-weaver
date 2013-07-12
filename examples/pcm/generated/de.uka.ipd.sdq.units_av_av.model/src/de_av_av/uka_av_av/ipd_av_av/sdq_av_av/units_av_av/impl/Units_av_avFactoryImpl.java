/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.units_av_av.*;

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
public class Units_av_avFactoryImpl extends EFactoryImpl implements Units_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Units_av_avFactory init() {
      try {
         Units_av_avFactory theUnits_av_avFactory = (Units_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Units_av_avPackage.eNS_URI);
         if (theUnits_av_avFactory != null) {
            return theUnits_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Units_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_av_avFactoryImpl() {
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
         case Units_av_avPackage.UNIT_CARRYING_ELEMENT: return createUnitCarryingElement();
         case Units_av_avPackage.UNIT: return createUnit();
         case Units_av_avPackage.BASE_UNIT: return createBaseUnit();
         case Units_av_avPackage.UNIT_REPOSITORY: return createUnitRepository();
         case Units_av_avPackage.UNIT_MULTIPLICATION: return createUnitMultiplication();
         case Units_av_avPackage.UNIT_POWER: return createUnitPower();
         case Units_av_avPackage.UNIT_LITERAL: return createUnitLiteral();
         case Units_av_avPackage.ADVICE_ADVICE: return createAdviceAdvice();
         case Units_av_avPackage.GLOBAL_SCOPE_GLOBAL_SCOPE: return createGlobalScopeGlobalScope();
         case Units_av_avPackage.PER_JOIN_POINT_SCOPE_PER_JOIN_POINT_SCOPE: return createPerJoinPointScopePerJoinPointScope();
         case Units_av_avPackage.ADVICE: return createAdvice();
         case Units_av_avPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Units_av_avPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
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
   public AdviceAdvice createAdviceAdvice() {
      AdviceAdviceImpl adviceAdvice = new AdviceAdviceImpl();
      return adviceAdvice;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GlobalScopeGlobalScope createGlobalScopeGlobalScope() {
      GlobalScopeGlobalScopeImpl globalScopeGlobalScope = new GlobalScopeGlobalScopeImpl();
      return globalScopeGlobalScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PerJoinPointScopePerJoinPointScope createPerJoinPointScopePerJoinPointScope() {
      PerJoinPointScopePerJoinPointScopeImpl perJoinPointScopePerJoinPointScope = new PerJoinPointScopePerJoinPointScopeImpl();
      return perJoinPointScopePerJoinPointScope;
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
   public Units_av_avPackage getUnits_av_avPackage() {
      return (Units_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Units_av_avPackage getPackage() {
      return Units_av_avPackage.eINSTANCE;
   }

} //Units_av_avFactoryImpl
