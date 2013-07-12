/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.BaseUnit;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.UnitRepository;
import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.Units_pc_avPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.units_pc_av.impl.UnitRepositoryImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitRepositoryImpl extends EObjectImpl implements UnitRepository {
   /**
    * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUnits()
    * @generated
    * @ordered
    */
   protected EList<BaseUnit> units;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected UnitRepositoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Units_pc_avPackage.Literals.UNIT_REPOSITORY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<BaseUnit> getUnits() {
      if (units == null) {
         units = new EObjectContainmentEList<BaseUnit>(BaseUnit.class, this, Units_pc_avPackage.UNIT_REPOSITORY__UNITS);
      }
      return units;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Units_pc_avPackage.UNIT_REPOSITORY__UNITS:
            return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
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
         case Units_pc_avPackage.UNIT_REPOSITORY__UNITS:
            return getUnits();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case Units_pc_avPackage.UNIT_REPOSITORY__UNITS:
            getUnits().clear();
            getUnits().addAll((Collection<? extends BaseUnit>)newValue);
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
         case Units_pc_avPackage.UNIT_REPOSITORY__UNITS:
            getUnits().clear();
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
         case Units_pc_avPackage.UNIT_REPOSITORY__UNITS:
            return units != null && !units.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //UnitRepositoryImpl
