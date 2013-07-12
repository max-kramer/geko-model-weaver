/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.impl.EntityImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.FailureType;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.FailureHandlingEntity;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.Seff_reliability_pcPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Handling Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_reliability_pc.impl.FailureHandlingEntityImpl#getFailureTypes_FailureHandlingEntity <em>Failure Types Failure Handling Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailureHandlingEntityImpl extends EntityImpl implements FailureHandlingEntity {
   /**
    * The cached value of the '{@link #getFailureTypes_FailureHandlingEntity() <em>Failure Types Failure Handling Entity</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFailureTypes_FailureHandlingEntity()
    * @generated
    * @ordered
    */
   protected EList<FailureType> failureTypes_FailureHandlingEntity;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected FailureHandlingEntityImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_reliability_pcPackage.Literals.FAILURE_HANDLING_ENTITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<FailureType> getFailureTypes_FailureHandlingEntity() {
      if (failureTypes_FailureHandlingEntity == null) {
         failureTypes_FailureHandlingEntity = new EObjectResolvingEList<FailureType>(FailureType.class, this, Seff_reliability_pcPackage.FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY);
      }
      return failureTypes_FailureHandlingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Seff_reliability_pcPackage.FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY:
            return getFailureTypes_FailureHandlingEntity();
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
         case Seff_reliability_pcPackage.FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY:
            getFailureTypes_FailureHandlingEntity().clear();
            getFailureTypes_FailureHandlingEntity().addAll((Collection<? extends FailureType>)newValue);
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
         case Seff_reliability_pcPackage.FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY:
            getFailureTypes_FailureHandlingEntity().clear();
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
         case Seff_reliability_pcPackage.FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY:
            return failureTypes_FailureHandlingEntity != null && !failureTypes_FailureHandlingEntity.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //FailureHandlingEntityImpl
