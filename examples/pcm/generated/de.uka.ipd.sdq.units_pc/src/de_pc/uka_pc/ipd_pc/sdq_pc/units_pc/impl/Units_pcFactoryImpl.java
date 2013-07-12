/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.*;

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
public class Units_pcFactoryImpl extends EFactoryImpl implements Units_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Units_pcFactory init() {
      try {
         Units_pcFactory theUnits_pcFactory = (Units_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Units_pcPackage.eNS_URI);
         if (theUnits_pcFactory != null) {
            return theUnits_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Units_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_pcFactoryImpl() {
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
         case Units_pcPackage.UNIT_CARRYING_ELEMENT: return createUnitCarryingElement();
         case Units_pcPackage.UNIT: return createUnit();
         case Units_pcPackage.BASE_UNIT: return createBaseUnit();
         case Units_pcPackage.UNIT_REPOSITORY: return createUnitRepository();
         case Units_pcPackage.UNIT_MULTIPLICATION: return createUnitMultiplication();
         case Units_pcPackage.UNIT_POWER: return createUnitPower();
         case Units_pcPackage.UNIT_LITERAL: return createUnitLiteral();
         case Units_pcPackage.POINTCUT: return createPointcut();
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
   public Units_pcPackage getUnits_pcPackage() {
      return (Units_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Units_pcPackage getPackage() {
      return Units_pcPackage.eINSTANCE;
   }

} //Units_pcFactoryImpl
