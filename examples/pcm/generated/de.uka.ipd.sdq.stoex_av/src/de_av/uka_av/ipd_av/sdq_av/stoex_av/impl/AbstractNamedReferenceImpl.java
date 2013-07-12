/**
 */
package de_av.uka_av.ipd_av.sdq_av.stoex_av.impl;

import de_av.uka_av.ipd_av.sdq_av.stoex_av.AbstractNamedReference;
import de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Named Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.impl.AbstractNamedReferenceImpl#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractNamedReferenceImpl extends EObjectImpl implements AbstractNamedReference {
   /**
    * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReferenceName()
    * @generated
    * @ordered
    */
   protected static final String REFERENCE_NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReferenceName()
    * @generated
    * @ordered
    */
   protected String referenceName = REFERENCE_NAME_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AbstractNamedReferenceImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Stoex_avPackage.Literals.ABSTRACT_NAMED_REFERENCE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getReferenceName() {
      return referenceName;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setReferenceName(String newReferenceName) {
      String oldReferenceName = referenceName;
      referenceName = newReferenceName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_avPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME, oldReferenceName, referenceName));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Stoex_avPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            return getReferenceName();
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
         case Stoex_avPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            setReferenceName((String)newValue);
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
         case Stoex_avPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            setReferenceName(REFERENCE_NAME_EDEFAULT);
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
         case Stoex_avPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
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
      result.append(" (referenceName: ");
      result.append(referenceName);
      result.append(')');
      return result.toString();
   }

} //AbstractNamedReferenceImpl
