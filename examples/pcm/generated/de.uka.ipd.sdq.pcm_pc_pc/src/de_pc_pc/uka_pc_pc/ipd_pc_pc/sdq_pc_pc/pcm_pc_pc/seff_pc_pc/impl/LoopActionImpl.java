/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.Core_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.PCMRandomVariable;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.LoopAction;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl.LoopActionImpl#getIterationCount_LoopAction <em>Iteration Count Loop Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopActionImpl extends AbstractLoopActionImpl implements LoopAction {
   /**
    * The cached value of the '{@link #getIterationCount_LoopAction() <em>Iteration Count Loop Action</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIterationCount_LoopAction()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable iterationCount_LoopAction;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected LoopActionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_pc_pcPackage.Literals.LOOP_ACTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getIterationCount_LoopAction() {
      return iterationCount_LoopAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetIterationCount_LoopAction(PCMRandomVariable newIterationCount_LoopAction, NotificationChain msgs) {
      PCMRandomVariable oldIterationCount_LoopAction = iterationCount_LoopAction;
      iterationCount_LoopAction = newIterationCount_LoopAction;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Seff_pc_pcPackage.LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION, oldIterationCount_LoopAction, newIterationCount_LoopAction);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setIterationCount_LoopAction(PCMRandomVariable newIterationCount_LoopAction) {
      if (newIterationCount_LoopAction != iterationCount_LoopAction) {
         NotificationChain msgs = null;
         if (iterationCount_LoopAction != null)
            msgs = ((InternalEObject)iterationCount_LoopAction).eInverseRemove(this, Core_pc_pcPackage.PCM_RANDOM_VARIABLE__LOOP_ACTION_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newIterationCount_LoopAction != null)
            msgs = ((InternalEObject)newIterationCount_LoopAction).eInverseAdd(this, Core_pc_pcPackage.PCM_RANDOM_VARIABLE__LOOP_ACTION_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetIterationCount_LoopAction(newIterationCount_LoopAction, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pc_pcPackage.LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION, newIterationCount_LoopAction, newIterationCount_LoopAction));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Seff_pc_pcPackage.LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION:
            if (iterationCount_LoopAction != null)
               msgs = ((InternalEObject)iterationCount_LoopAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Seff_pc_pcPackage.LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION, null, msgs);
            return basicSetIterationCount_LoopAction((PCMRandomVariable)otherEnd, msgs);
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
         case Seff_pc_pcPackage.LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION:
            return basicSetIterationCount_LoopAction(null, msgs);
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
         case Seff_pc_pcPackage.LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION:
            return getIterationCount_LoopAction();
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
         case Seff_pc_pcPackage.LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION:
            setIterationCount_LoopAction((PCMRandomVariable)newValue);
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
         case Seff_pc_pcPackage.LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION:
            setIterationCount_LoopAction((PCMRandomVariable)null);
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
         case Seff_pc_pcPackage.LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION:
            return iterationCount_LoopAction != null;
      }
      return super.eIsSet(featureID);
   }

} //LoopActionImpl
