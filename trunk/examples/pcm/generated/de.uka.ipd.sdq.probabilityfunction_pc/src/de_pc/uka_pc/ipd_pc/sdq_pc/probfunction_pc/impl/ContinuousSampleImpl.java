/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.ContinuousSample;
import de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.impl.ContinuousSampleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.impl.ContinuousSampleImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuousSampleImpl extends EObjectImpl implements ContinuousSample {
   /**
    * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected static final double VALUE_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected double value = VALUE_EDEFAULT;

   /**
    * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProbability()
    * @generated
    * @ordered
    */
   protected static final double PROBABILITY_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProbability()
    * @generated
    * @ordered
    */
   protected double probability = PROBABILITY_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ContinuousSampleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Probfunction_pcPackage.Literals.CONTINUOUS_SAMPLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getValue() {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setValue(double newValue) {
      double oldValue = value;
      value = newValue;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Probfunction_pcPackage.CONTINUOUS_SAMPLE__VALUE, oldValue, value));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getProbability() {
      return probability;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProbability(double newProbability) {
      double oldProbability = probability;
      probability = newProbability;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Probfunction_pcPackage.CONTINUOUS_SAMPLE__PROBABILITY, oldProbability, probability));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Probfunction_pcPackage.CONTINUOUS_SAMPLE__VALUE:
            return getValue();
         case Probfunction_pcPackage.CONTINUOUS_SAMPLE__PROBABILITY:
            return getProbability();
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
         case Probfunction_pcPackage.CONTINUOUS_SAMPLE__VALUE:
            setValue((Double)newValue);
            return;
         case Probfunction_pcPackage.CONTINUOUS_SAMPLE__PROBABILITY:
            setProbability((Double)newValue);
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
         case Probfunction_pcPackage.CONTINUOUS_SAMPLE__VALUE:
            setValue(VALUE_EDEFAULT);
            return;
         case Probfunction_pcPackage.CONTINUOUS_SAMPLE__PROBABILITY:
            setProbability(PROBABILITY_EDEFAULT);
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
         case Probfunction_pcPackage.CONTINUOUS_SAMPLE__VALUE:
            return value != VALUE_EDEFAULT;
         case Probfunction_pcPackage.CONTINUOUS_SAMPLE__PROBABILITY:
            return probability != PROBABILITY_EDEFAULT;
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
      result.append(", probability: ");
      result.append(probability);
      result.append(')');
      return result.toString();
   }

} //ContinuousSampleImpl
