/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.FailureOccurrenceDescription;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.Reliability_av_avPackage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.util.Reliability_av_avValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.impl.FailureOccurrenceDescriptionImpl#getFailureProbability <em>Failure Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailureOccurrenceDescriptionImpl extends EObjectImpl implements FailureOccurrenceDescription {
   /**
    * The default value of the '{@link #getFailureProbability() <em>Failure Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFailureProbability()
    * @generated
    * @ordered
    */
   protected static final double FAILURE_PROBABILITY_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getFailureProbability() <em>Failure Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFailureProbability()
    * @generated
    * @ordered
    */
   protected double failureProbability = FAILURE_PROBABILITY_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected FailureOccurrenceDescriptionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Reliability_av_avPackage.Literals.FAILURE_OCCURRENCE_DESCRIPTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getFailureProbability() {
      return failureProbability;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setFailureProbability(double newFailureProbability) {
      double oldFailureProbability = failureProbability;
      failureProbability = newFailureProbability;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Reliability_av_avPackage.FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY, oldFailureProbability, failureProbability));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean EnsureValidFailureProbabilityRange(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Reliability_av_avValidator.DIAGNOSTIC_SOURCE,
                   Reliability_av_avValidator.FAILURE_OCCURRENCE_DESCRIPTION__ENSURE_VALID_FAILURE_PROBABILITY_RANGE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EnsureValidFailureProbabilityRange", EObjectValidator.getObjectLabel(this, context) }),
                   new Object [] { this }));
         }
         return false;
      }
      return true;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Reliability_av_avPackage.FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY:
            return getFailureProbability();
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
         case Reliability_av_avPackage.FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY:
            setFailureProbability((Double)newValue);
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
         case Reliability_av_avPackage.FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY:
            setFailureProbability(FAILURE_PROBABILITY_EDEFAULT);
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
         case Reliability_av_avPackage.FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY:
            return failureProbability != FAILURE_PROBABILITY_EDEFAULT;
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
      result.append(" (failureProbability: ");
      result.append(failureProbability);
      result.append(')');
      return result.toString();
   }

} //FailureOccurrenceDescriptionImpl
