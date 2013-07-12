/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.NormalDistribution;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.Probfunction_av_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.impl.NormalDistributionImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.impl.NormalDistributionImpl#getSigma <em>Sigma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalDistributionImpl extends ContinuousPDFImpl implements NormalDistribution {
   /**
    * The default value of the '{@link #getMu() <em>Mu</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getMu()
    * @generated
    * @ordered
    */
   protected static final double MU_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getMu() <em>Mu</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getMu()
    * @generated
    * @ordered
    */
   protected double mu = MU_EDEFAULT;

   /**
    * The default value of the '{@link #getSigma() <em>Sigma</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSigma()
    * @generated
    * @ordered
    */
   protected static final double SIGMA_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getSigma() <em>Sigma</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSigma()
    * @generated
    * @ordered
    */
   protected double sigma = SIGMA_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NormalDistributionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Probfunction_av_pcPackage.Literals.NORMAL_DISTRIBUTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getMu() {
      return mu;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setMu(double newMu) {
      double oldMu = mu;
      mu = newMu;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__MU, oldMu, mu));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getSigma() {
      return sigma;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSigma(double newSigma) {
      double oldSigma = sigma;
      sigma = newSigma;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__SIGMA, oldSigma, sigma));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__MU:
            return getMu();
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__SIGMA:
            return getSigma();
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
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__MU:
            setMu((Double)newValue);
            return;
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__SIGMA:
            setSigma((Double)newValue);
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
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__MU:
            setMu(MU_EDEFAULT);
            return;
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__SIGMA:
            setSigma(SIGMA_EDEFAULT);
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
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__MU:
            return mu != MU_EDEFAULT;
         case Probfunction_av_pcPackage.NORMAL_DISTRIBUTION__SIGMA:
            return sigma != SIGMA_EDEFAULT;
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
      result.append(" (mu: ");
      result.append(mu);
      result.append(", sigma: ");
      result.append(sigma);
      result.append(')');
      return result.toString();
   }

} //NormalDistributionImpl
