/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.PrimitiveDataType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.PrimitiveTypeEnum;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl.PrimitiveDataTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveDataTypeImpl extends DataTypeImpl implements PrimitiveDataType {
   /**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected static final PrimitiveTypeEnum TYPE_EDEFAULT = PrimitiveTypeEnum.INT;

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected PrimitiveTypeEnum type = TYPE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PrimitiveDataTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_pcPackage.Literals.PRIMITIVE_DATA_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PrimitiveTypeEnum getType() {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setType(PrimitiveTypeEnum newType) {
      PrimitiveTypeEnum oldType = type;
      type = newType == null ? TYPE_EDEFAULT : newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_pcPackage.PRIMITIVE_DATA_TYPE__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Repository_pc_pcPackage.PRIMITIVE_DATA_TYPE__TYPE:
            return getType();
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
         case Repository_pc_pcPackage.PRIMITIVE_DATA_TYPE__TYPE:
            setType((PrimitiveTypeEnum)newValue);
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
         case Repository_pc_pcPackage.PRIMITIVE_DATA_TYPE__TYPE:
            setType(TYPE_EDEFAULT);
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
         case Repository_pc_pcPackage.PRIMITIVE_DATA_TYPE__TYPE:
            return type != TYPE_EDEFAULT;
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
      result.append(" (type: ");
      result.append(type);
      result.append(')');
      return result.toString();
   }

} //PrimitiveDataTypeImpl
