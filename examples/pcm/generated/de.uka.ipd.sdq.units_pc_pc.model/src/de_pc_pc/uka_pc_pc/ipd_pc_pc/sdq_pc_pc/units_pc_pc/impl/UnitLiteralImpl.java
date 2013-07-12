/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.BaseUnit;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.UnitLiteral;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.Units_pc_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.impl.UnitLiteralImpl#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitLiteralImpl extends UnitImpl implements UnitLiteral {
   /**
    * The cached value of the '{@link #getBaseUnit() <em>Base Unit</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBaseUnit()
    * @generated
    * @ordered
    */
   protected BaseUnit baseUnit;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected UnitLiteralImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Units_pc_pcPackage.Literals.UNIT_LITERAL;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BaseUnit getBaseUnit() {
      if (baseUnit != null && baseUnit.eIsProxy()) {
         InternalEObject oldBaseUnit = (InternalEObject)baseUnit;
         baseUnit = (BaseUnit)eResolveProxy(oldBaseUnit);
         if (baseUnit != oldBaseUnit) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Units_pc_pcPackage.UNIT_LITERAL__BASE_UNIT, oldBaseUnit, baseUnit));
         }
      }
      return baseUnit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BaseUnit basicGetBaseUnit() {
      return baseUnit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBaseUnit(BaseUnit newBaseUnit) {
      BaseUnit oldBaseUnit = baseUnit;
      baseUnit = newBaseUnit;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Units_pc_pcPackage.UNIT_LITERAL__BASE_UNIT, oldBaseUnit, baseUnit));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Units_pc_pcPackage.UNIT_LITERAL__BASE_UNIT:
            if (resolve) return getBaseUnit();
            return basicGetBaseUnit();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case Units_pc_pcPackage.UNIT_LITERAL__BASE_UNIT:
            setBaseUnit((BaseUnit)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case Units_pc_pcPackage.UNIT_LITERAL__BASE_UNIT:
            setBaseUnit((BaseUnit)null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case Units_pc_pcPackage.UNIT_LITERAL__BASE_UNIT:
            return baseUnit != null;
      }
      return super.eIsSet(featureID);
   }

} //UnitLiteralImpl
