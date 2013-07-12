/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.protocol_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.protocol_pc_av.Protocol;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.protocol_pc_av.Protocol_pc_avPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.protocol_pc_av.impl.ProtocolImpl#getProtocolTypeID <em>Protocol Type ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolImpl extends EObjectImpl implements Protocol {
   /**
    * The default value of the '{@link #getProtocolTypeID() <em>Protocol Type ID</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProtocolTypeID()
    * @generated
    * @ordered
    */
   protected static final String PROTOCOL_TYPE_ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getProtocolTypeID() <em>Protocol Type ID</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProtocolTypeID()
    * @generated
    * @ordered
    */
   protected String protocolTypeID = PROTOCOL_TYPE_ID_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ProtocolImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Protocol_pc_avPackage.Literals.PROTOCOL;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getProtocolTypeID() {
      return protocolTypeID;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProtocolTypeID(String newProtocolTypeID) {
      String oldProtocolTypeID = protocolTypeID;
      protocolTypeID = newProtocolTypeID;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Protocol_pc_avPackage.PROTOCOL__PROTOCOL_TYPE_ID, oldProtocolTypeID, protocolTypeID));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Protocol_pc_avPackage.PROTOCOL__PROTOCOL_TYPE_ID:
            return getProtocolTypeID();
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
         case Protocol_pc_avPackage.PROTOCOL__PROTOCOL_TYPE_ID:
            setProtocolTypeID((String)newValue);
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
         case Protocol_pc_avPackage.PROTOCOL__PROTOCOL_TYPE_ID:
            setProtocolTypeID(PROTOCOL_TYPE_ID_EDEFAULT);
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
         case Protocol_pc_avPackage.PROTOCOL__PROTOCOL_TYPE_ID:
            return PROTOCOL_TYPE_ID_EDEFAULT == null ? protocolTypeID != null : !PROTOCOL_TYPE_ID_EDEFAULT.equals(protocolTypeID);
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
      result.append(" (protocolTypeID: ");
      result.append(protocolTypeID);
      result.append(')');
      return result.toString();
   }

} //ProtocolImpl
