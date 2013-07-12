/**
 */
package de_av.uka_av.ipd_av.sdq_av.stoex_av.impl;

import de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage;
import de_av.uka_av.ipd_av.sdq_av.stoex_av.StringLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.impl.StringLiteralImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringLiteralImpl extends AtomImpl implements StringLiteral {
   /**
    * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected static final String VALUE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected String value = VALUE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected StringLiteralImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Stoex_avPackage.Literals.STRING_LITERAL;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getValue() {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setValue(String newValue) {
      String oldValue = value;
      value = newValue;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_avPackage.STRING_LITERAL__VALUE, oldValue, value));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Stoex_avPackage.STRING_LITERAL__VALUE:
            return getValue();
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
         case Stoex_avPackage.STRING_LITERAL__VALUE:
            setValue((String)newValue);
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
         case Stoex_avPackage.STRING_LITERAL__VALUE:
            setValue(VALUE_EDEFAULT);
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
         case Stoex_avPackage.STRING_LITERAL__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
      result.append(" (value: ");
      result.append(value);
      result.append(')');
      return result.toString();
   }

} //StringLiteralImpl
