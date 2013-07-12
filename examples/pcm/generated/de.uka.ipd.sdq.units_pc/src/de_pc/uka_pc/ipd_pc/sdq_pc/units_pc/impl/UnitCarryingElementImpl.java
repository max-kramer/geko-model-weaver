/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Unit;
import de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.UnitCarryingElement;
import de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.Units_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Carrying Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitCarryingElementImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.units_pc.impl.UnitCarryingElementImpl#getUnitSpecification <em>Unit Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitCarryingElementImpl extends EObjectImpl implements UnitCarryingElement {
   /**
    * The default value of the '{@link #getUnitSpecification() <em>Unit Specification</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUnitSpecification()
    * @generated
    * @ordered
    */
   protected static final String UNIT_SPECIFICATION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getUnitSpecification() <em>Unit Specification</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUnitSpecification()
    * @generated
    * @ordered
    */
   protected String unitSpecification = UNIT_SPECIFICATION_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected UnitCarryingElementImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Units_pcPackage.Literals.UNIT_CARRYING_ELEMENT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Unit getUnit() {
      Unit unit = basicGetUnit();
      return unit != null && unit.eIsProxy() ? (Unit)eResolveProxy((InternalEObject)unit) : unit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Unit basicGetUnit() {
      // TODO: implement this method to return the 'Unit' reference
      // -> do not perform proxy resolution
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUnit(Unit newUnit) {
      // TODO: implement this method to set the 'Unit' reference
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getUnitSpecification() {
      return unitSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUnitSpecification(String newUnitSpecification) {
      String oldUnitSpecification = unitSpecification;
      unitSpecification = newUnitSpecification;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Units_pcPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION, oldUnitSpecification, unitSpecification));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Units_pcPackage.UNIT_CARRYING_ELEMENT__UNIT:
            if (resolve) return getUnit();
            return basicGetUnit();
         case Units_pcPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION:
            return getUnitSpecification();
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
         case Units_pcPackage.UNIT_CARRYING_ELEMENT__UNIT:
            setUnit((Unit)newValue);
            return;
         case Units_pcPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION:
            setUnitSpecification((String)newValue);
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
         case Units_pcPackage.UNIT_CARRYING_ELEMENT__UNIT:
            setUnit((Unit)null);
            return;
         case Units_pcPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION:
            setUnitSpecification(UNIT_SPECIFICATION_EDEFAULT);
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
         case Units_pcPackage.UNIT_CARRYING_ELEMENT__UNIT:
            return basicGetUnit() != null;
         case Units_pcPackage.UNIT_CARRYING_ELEMENT__UNIT_SPECIFICATION:
            return UNIT_SPECIFICATION_EDEFAULT == null ? unitSpecification != null : !UNIT_SPECIFICATION_EDEFAULT.equals(unitSpecification);
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
      result.append(" (unitSpecification: ");
      result.append(unitSpecification);
      result.append(')');
      return result.toString();
   }

} //UnitCarryingElementImpl
