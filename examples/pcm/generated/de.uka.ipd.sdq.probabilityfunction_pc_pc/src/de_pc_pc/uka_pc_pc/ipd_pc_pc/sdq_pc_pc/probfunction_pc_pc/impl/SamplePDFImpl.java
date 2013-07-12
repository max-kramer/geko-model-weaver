/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Complex;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.SamplePDF;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample PDF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.impl.SamplePDFImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.impl.SamplePDFImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SamplePDFImpl extends ProbabilityDensityFunctionImpl implements SamplePDF {
   /**
    * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDistance()
    * @generated
    * @ordered
    */
   protected static final double DISTANCE_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDistance()
    * @generated
    * @ordered
    */
   protected double distance = DISTANCE_EDEFAULT;

   /**
    * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValues()
    * @generated
    * @ordered
    */
   protected EList<Complex> values;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SamplePDFImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Probfunction_pc_pcPackage.Literals.SAMPLE_PDF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getDistance() {
      return distance;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDistance(double newDistance) {
      double oldDistance = distance;
      distance = newDistance;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Probfunction_pc_pcPackage.SAMPLE_PDF__DISTANCE, oldDistance, distance));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Complex> getValues() {
      if (values == null) {
         values = new EObjectContainmentEList<Complex>(Complex.class, this, Probfunction_pc_pcPackage.SAMPLE_PDF__VALUES);
      }
      return values;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Probfunction_pc_pcPackage.SAMPLE_PDF__VALUES:
            return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
         case Probfunction_pc_pcPackage.SAMPLE_PDF__DISTANCE:
            return getDistance();
         case Probfunction_pc_pcPackage.SAMPLE_PDF__VALUES:
            return getValues();
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
         case Probfunction_pc_pcPackage.SAMPLE_PDF__DISTANCE:
            setDistance((Double)newValue);
            return;
         case Probfunction_pc_pcPackage.SAMPLE_PDF__VALUES:
            getValues().clear();
            getValues().addAll((Collection<? extends Complex>)newValue);
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
         case Probfunction_pc_pcPackage.SAMPLE_PDF__DISTANCE:
            setDistance(DISTANCE_EDEFAULT);
            return;
         case Probfunction_pc_pcPackage.SAMPLE_PDF__VALUES:
            getValues().clear();
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
         case Probfunction_pc_pcPackage.SAMPLE_PDF__DISTANCE:
            return distance != DISTANCE_EDEFAULT;
         case Probfunction_pc_pcPackage.SAMPLE_PDF__VALUES:
            return values != null && !values.isEmpty();
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
      result.append(" (distance: ");
      result.append(distance);
      result.append(')');
      return result.toString();
   }

} //SamplePDFImpl
