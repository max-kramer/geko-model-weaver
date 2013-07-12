/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Sample;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.impl.SampleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.impl.SampleImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleImpl<T> extends EObjectImpl implements Sample<T> {
   /**
    * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected T value;

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
   protected SampleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Probfunction_pc_pcPackage.Literals.SAMPLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   public T getValue() {
      if (value != null && ((EObject)value).eIsProxy()) {
         InternalEObject oldValue = (InternalEObject)value;
         value = (T)eResolveProxy(oldValue);
         if (value != oldValue) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Probfunction_pc_pcPackage.SAMPLE__VALUE, oldValue, value));
         }
      }
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public T basicGetValue() {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setValue(T newValue) {
      T oldValue = value;
      value = newValue;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Probfunction_pc_pcPackage.SAMPLE__VALUE, oldValue, value));
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
         eNotify(new ENotificationImpl(this, Notification.SET, Probfunction_pc_pcPackage.SAMPLE__PROBABILITY, oldProbability, probability));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Probfunction_pc_pcPackage.SAMPLE__VALUE:
            if (resolve) return getValue();
            return basicGetValue();
         case Probfunction_pc_pcPackage.SAMPLE__PROBABILITY:
            return getProbability();
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
         case Probfunction_pc_pcPackage.SAMPLE__VALUE:
            setValue((T)newValue);
            return;
         case Probfunction_pc_pcPackage.SAMPLE__PROBABILITY:
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
         case Probfunction_pc_pcPackage.SAMPLE__VALUE:
            setValue((T)null);
            return;
         case Probfunction_pc_pcPackage.SAMPLE__PROBABILITY:
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
         case Probfunction_pc_pcPackage.SAMPLE__VALUE:
            return value != null;
         case Probfunction_pc_pcPackage.SAMPLE__PROBABILITY:
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
      result.append(" (probability: ");
      result.append(probability);
      result.append(')');
      return result.toString();
   }

} //SampleImpl
