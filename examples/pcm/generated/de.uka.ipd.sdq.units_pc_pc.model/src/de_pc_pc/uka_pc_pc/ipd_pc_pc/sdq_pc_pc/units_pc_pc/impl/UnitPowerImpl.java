/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.Unit;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.UnitPower;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.Units_pc_pcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Power</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.impl.UnitPowerImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.impl.UnitPowerImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitPowerImpl extends UnitImpl implements UnitPower {
   /**
    * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUnit()
    * @generated
    * @ordered
    */
   protected Unit unit;

   /**
    * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExponent()
    * @generated
    * @ordered
    */
   protected static final int EXPONENT_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExponent()
    * @generated
    * @ordered
    */
   protected int exponent = EXPONENT_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected UnitPowerImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Units_pc_pcPackage.Literals.UNIT_POWER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Unit getUnit() {
      return unit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetUnit(Unit newUnit, NotificationChain msgs) {
      Unit oldUnit = unit;
      unit = newUnit;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Units_pc_pcPackage.UNIT_POWER__UNIT, oldUnit, newUnit);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUnit(Unit newUnit) {
      if (newUnit != unit) {
         NotificationChain msgs = null;
         if (unit != null)
            msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Units_pc_pcPackage.UNIT_POWER__UNIT, null, msgs);
         if (newUnit != null)
            msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Units_pc_pcPackage.UNIT_POWER__UNIT, null, msgs);
         msgs = basicSetUnit(newUnit, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Units_pc_pcPackage.UNIT_POWER__UNIT, newUnit, newUnit));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getExponent() {
      return exponent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setExponent(int newExponent) {
      int oldExponent = exponent;
      exponent = newExponent;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Units_pc_pcPackage.UNIT_POWER__EXPONENT, oldExponent, exponent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Units_pc_pcPackage.UNIT_POWER__UNIT:
            return basicSetUnit(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Units_pc_pcPackage.UNIT_POWER__UNIT:
            return getUnit();
         case Units_pc_pcPackage.UNIT_POWER__EXPONENT:
            return getExponent();
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
         case Units_pc_pcPackage.UNIT_POWER__UNIT:
            setUnit((Unit)newValue);
            return;
         case Units_pc_pcPackage.UNIT_POWER__EXPONENT:
            setExponent((Integer)newValue);
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
         case Units_pc_pcPackage.UNIT_POWER__UNIT:
            setUnit((Unit)null);
            return;
         case Units_pc_pcPackage.UNIT_POWER__EXPONENT:
            setExponent(EXPONENT_EDEFAULT);
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
         case Units_pc_pcPackage.UNIT_POWER__UNIT:
            return unit != null;
         case Units_pc_pcPackage.UNIT_POWER__EXPONENT:
            return exponent != EXPONENT_EDEFAULT;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (exponent: ");
      result.append(exponent);
      result.append(')');
      return result.toString();
   }

} //UnitPowerImpl
