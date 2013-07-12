/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.*;

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
public class Units_av_pcFactoryImpl extends EFactoryImpl implements Units_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Units_av_pcFactory init() {
      try {
         Units_av_pcFactory theUnits_av_pcFactory = (Units_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Units_av_pcPackage.eNS_URI);
         if (theUnits_av_pcFactory != null) {
            return theUnits_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Units_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_av_pcFactoryImpl() {
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
         case Units_av_pcPackage.UNIT_CARRYING_ELEMENT: return createUnitCarryingElement();
         case Units_av_pcPackage.UNIT: return createUnit();
         case Units_av_pcPackage.BASE_UNIT: return createBaseUnit();
         case Units_av_pcPackage.UNIT_REPOSITORY: return createUnitRepository();
         case Units_av_pcPackage.UNIT_MULTIPLICATION: return createUnitMultiplication();
         case Units_av_pcPackage.UNIT_POWER: return createUnitPower();
         case Units_av_pcPackage.UNIT_LITERAL: return createUnitLiteral();
         case Units_av_pcPackage.ADVICE: return createAdvice();
         case Units_av_pcPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Units_av_pcPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
         case Units_av_pcPackage.POINTCUT: return createPointcut();
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
   public Pointcut createPointcut() {
      PointcutImpl pointcut = new PointcutImpl();
      return pointcut;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_av_pcPackage getUnits_av_pcPackage() {
      return (Units_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Units_av_pcPackage getPackage() {
      return Units_av_pcPackage.eINSTANCE;
   }

} //Units_av_pcFactoryImpl
