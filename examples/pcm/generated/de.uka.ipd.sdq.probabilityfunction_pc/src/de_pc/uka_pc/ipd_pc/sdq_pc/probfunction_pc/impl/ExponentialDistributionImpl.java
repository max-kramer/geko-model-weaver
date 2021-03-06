/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.ExponentialDistribution;
import de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponential Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.impl.ExponentialDistributionImpl#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExponentialDistributionImpl extends ContinuousPDFImpl implements ExponentialDistribution {
   /**
    * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRate()
    * @generated
    * @ordered
    */
   protected static final double RATE_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRate()
    * @generated
    * @ordered
    */
   protected double rate = RATE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ExponentialDistributionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Probfunction_pcPackage.Literals.EXPONENTIAL_DISTRIBUTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getRate() {
      return rate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRate(double newRate) {
      double oldRate = rate;
      rate = newRate;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Probfunction_pcPackage.EXPONENTIAL_DISTRIBUTION__RATE, oldRate, rate));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Probfunction_pcPackage.EXPONENTIAL_DISTRIBUTION__RATE:
            return getRate();
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
         case Probfunction_pcPackage.EXPONENTIAL_DISTRIBUTION__RATE:
            setRate((Double)newValue);
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
         case Probfunction_pcPackage.EXPONENTIAL_DISTRIBUTION__RATE:
            setRate(RATE_EDEFAULT);
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
         case Probfunction_pcPackage.EXPONENTIAL_DISTRIBUTION__RATE:
            return rate != RATE_EDEFAULT;
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
      result.append(" (rate: ");
      result.append(rate);
      result.append(')');
      return result.toString();
   }

} //ExponentialDistributionImpl
