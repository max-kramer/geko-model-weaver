/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.GuardedBranchTransition;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guarded Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.impl.GuardedBranchTransitionImpl#getBranchCondition_GuardedBranchTransition <em>Branch Condition Guarded Branch Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardedBranchTransitionImpl extends AbstractBranchTransitionImpl implements GuardedBranchTransition {
   /**
    * The cached value of the '{@link #getBranchCondition_GuardedBranchTransition() <em>Branch Condition Guarded Branch Transition</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBranchCondition_GuardedBranchTransition()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable branchCondition_GuardedBranchTransition;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected GuardedBranchTransitionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_avPackage.Literals.GUARDED_BRANCH_TRANSITION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getBranchCondition_GuardedBranchTransition() {
      return branchCondition_GuardedBranchTransition;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBranchCondition_GuardedBranchTransition(PCMRandomVariable newBranchCondition_GuardedBranchTransition, NotificationChain msgs) {
      PCMRandomVariable oldBranchCondition_GuardedBranchTransition = branchCondition_GuardedBranchTransition;
      branchCondition_GuardedBranchTransition = newBranchCondition_GuardedBranchTransition;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Seff_avPackage.GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION, oldBranchCondition_GuardedBranchTransition, newBranchCondition_GuardedBranchTransition);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBranchCondition_GuardedBranchTransition(PCMRandomVariable newBranchCondition_GuardedBranchTransition) {
      if (newBranchCondition_GuardedBranchTransition != branchCondition_GuardedBranchTransition) {
         NotificationChain msgs = null;
         if (branchCondition_GuardedBranchTransition != null)
            msgs = ((InternalEObject)branchCondition_GuardedBranchTransition).eInverseRemove(this, Core_avPackage.PCM_RANDOM_VARIABLE__GUARDED_BRANCH_TRANSITION_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newBranchCondition_GuardedBranchTransition != null)
            msgs = ((InternalEObject)newBranchCondition_GuardedBranchTransition).eInverseAdd(this, Core_avPackage.PCM_RANDOM_VARIABLE__GUARDED_BRANCH_TRANSITION_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetBranchCondition_GuardedBranchTransition(newBranchCondition_GuardedBranchTransition, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_avPackage.GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION, newBranchCondition_GuardedBranchTransition, newBranchCondition_GuardedBranchTransition));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Seff_avPackage.GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION:
            if (branchCondition_GuardedBranchTransition != null)
               msgs = ((InternalEObject)branchCondition_GuardedBranchTransition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Seff_avPackage.GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION, null, msgs);
            return basicSetBranchCondition_GuardedBranchTransition((PCMRandomVariable)otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Seff_avPackage.GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION:
            return basicSetBranchCondition_GuardedBranchTransition(null, msgs);
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
         case Seff_avPackage.GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION:
            return getBranchCondition_GuardedBranchTransition();
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
         case Seff_avPackage.GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION:
            setBranchCondition_GuardedBranchTransition((PCMRandomVariable)newValue);
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
         case Seff_avPackage.GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION:
            setBranchCondition_GuardedBranchTransition((PCMRandomVariable)null);
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
         case Seff_avPackage.GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION:
            return branchCondition_GuardedBranchTransition != null;
      }
      return super.eIsSet(featureID);
   }

} //GuardedBranchTransitionImpl
