/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.IdentifierImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.NamedElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.impl.EntityImpl#getEntityName <em>Entity Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends IdentifierImpl implements Entity {
   /**
    * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEntityName()
    * @generated
    * @ordered
    */
   protected static final String ENTITY_NAME_EDEFAULT = "aName";

   /**
    * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEntityName()
    * @generated
    * @ordered
    */
   protected String entityName = ENTITY_NAME_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected EntityImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Entity_pcPackage.Literals.ENTITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getEntityName() {
      return entityName;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEntityName(String newEntityName) {
      String oldEntityName = entityName;
      entityName = newEntityName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Entity_pcPackage.ENTITY__ENTITY_NAME, oldEntityName, entityName));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Entity_pcPackage.ENTITY__ENTITY_NAME:
            return getEntityName();
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
         case Entity_pcPackage.ENTITY__ENTITY_NAME:
            setEntityName((String)newValue);
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
         case Entity_pcPackage.ENTITY__ENTITY_NAME:
            setEntityName(ENTITY_NAME_EDEFAULT);
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
         case Entity_pcPackage.ENTITY__ENTITY_NAME:
            return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == NamedElement.class) {
         switch (derivedFeatureID) {
            case Entity_pcPackage.ENTITY__ENTITY_NAME: return Entity_pcPackage.NAMED_ELEMENT__ENTITY_NAME;
            default: return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == NamedElement.class) {
         switch (baseFeatureID) {
            case Entity_pcPackage.NAMED_ELEMENT__ENTITY_NAME: return Entity_pcPackage.ENTITY__ENTITY_NAME;
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
      result.append(" (entityName: ");
      result.append(entityName);
      result.append(')');
      return result.toString();
   }

} //EntityImpl
