/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ProbabilisticBranchTransition;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probabilistic Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.ProbabilisticBranchTransitionImpl#getBranchProbability <em>Branch Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProbabilisticBranchTransitionImpl extends AbstractBranchTransitionImpl implements ProbabilisticBranchTransition {
   /**
    * The default value of the '{@link #getBranchProbability() <em>Branch Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBranchProbability()
    * @generated
    * @ordered
    */
   protected static final double BRANCH_PROBABILITY_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getBranchProbability() <em>Branch Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBranchProbability()
    * @generated
    * @ordered
    */
   protected double branchProbability = BRANCH_PROBABILITY_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ProbabilisticBranchTransitionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_pc_avPackage.Literals.PROBABILISTIC_BRANCH_TRANSITION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getBranchProbability() {
      return branchProbability;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBranchProbability(double newBranchProbability) {
      double oldBranchProbability = branchProbability;
      branchProbability = newBranchProbability;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pc_avPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY, oldBranchProbability, branchProbability));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Seff_pc_avPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY:
            return getBranchProbability();
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
         case Seff_pc_avPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY:
            setBranchProbability((Double)newValue);
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
         case Seff_pc_avPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY:
            setBranchProbability(BRANCH_PROBABILITY_EDEFAULT);
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
         case Seff_pc_avPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY:
            return branchProbability != BRANCH_PROBABILITY_EDEFAULT;
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
      result.append(" (branchProbability: ");
      result.append(branchProbability);
      result.append(')');
      return result.toString();
   }

} //ProbabilisticBranchTransitionImpl
