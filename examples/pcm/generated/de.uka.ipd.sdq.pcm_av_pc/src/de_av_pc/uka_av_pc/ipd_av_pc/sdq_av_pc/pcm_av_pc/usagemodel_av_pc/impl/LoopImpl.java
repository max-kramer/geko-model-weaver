/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.Core_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.PCMRandomVariable;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Loop;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.ScenarioBehaviour;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.LoopImpl#getLoopIteration_Loop <em>Loop Iteration Loop</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.LoopImpl#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopImpl extends AbstractUserActionImpl implements Loop {
   /**
    * The cached value of the '{@link #getLoopIteration_Loop() <em>Loop Iteration Loop</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLoopIteration_Loop()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable loopIteration_Loop;

   /**
    * The cached value of the '{@link #getBodyBehaviour_Loop() <em>Body Behaviour Loop</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBodyBehaviour_Loop()
    * @generated
    * @ordered
    */
   protected ScenarioBehaviour bodyBehaviour_Loop;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected LoopImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Usagemodel_av_pcPackage.Literals.LOOP;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getLoopIteration_Loop() {
      return loopIteration_Loop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetLoopIteration_Loop(PCMRandomVariable newLoopIteration_Loop, NotificationChain msgs) {
      PCMRandomVariable oldLoopIteration_Loop = loopIteration_Loop;
      loopIteration_Loop = newLoopIteration_Loop;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Usagemodel_av_pcPackage.LOOP__LOOP_ITERATION_LOOP, oldLoopIteration_Loop, newLoopIteration_Loop);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLoopIteration_Loop(PCMRandomVariable newLoopIteration_Loop) {
      if (newLoopIteration_Loop != loopIteration_Loop) {
         NotificationChain msgs = null;
         if (loopIteration_Loop != null)
            msgs = ((InternalEObject)loopIteration_Loop).eInverseRemove(this, Core_av_pcPackage.PCM_RANDOM_VARIABLE__LOOP_LOOP_ITERATION, PCMRandomVariable.class, msgs);
         if (newLoopIteration_Loop != null)
            msgs = ((InternalEObject)newLoopIteration_Loop).eInverseAdd(this, Core_av_pcPackage.PCM_RANDOM_VARIABLE__LOOP_LOOP_ITERATION, PCMRandomVariable.class, msgs);
         msgs = basicSetLoopIteration_Loop(newLoopIteration_Loop, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_av_pcPackage.LOOP__LOOP_ITERATION_LOOP, newLoopIteration_Loop, newLoopIteration_Loop));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScenarioBehaviour getBodyBehaviour_Loop() {
      return bodyBehaviour_Loop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBodyBehaviour_Loop(ScenarioBehaviour newBodyBehaviour_Loop, NotificationChain msgs) {
      ScenarioBehaviour oldBodyBehaviour_Loop = bodyBehaviour_Loop;
      bodyBehaviour_Loop = newBodyBehaviour_Loop;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Usagemodel_av_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP, oldBodyBehaviour_Loop, newBodyBehaviour_Loop);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBodyBehaviour_Loop(ScenarioBehaviour newBodyBehaviour_Loop) {
      if (newBodyBehaviour_Loop != bodyBehaviour_Loop) {
         NotificationChain msgs = null;
         if (bodyBehaviour_Loop != null)
            msgs = ((InternalEObject)bodyBehaviour_Loop).eInverseRemove(this, Usagemodel_av_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR, ScenarioBehaviour.class, msgs);
         if (newBodyBehaviour_Loop != null)
            msgs = ((InternalEObject)newBodyBehaviour_Loop).eInverseAdd(this, Usagemodel_av_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR, ScenarioBehaviour.class, msgs);
         msgs = basicSetBodyBehaviour_Loop(newBodyBehaviour_Loop, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_av_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP, newBodyBehaviour_Loop, newBodyBehaviour_Loop));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Usagemodel_av_pcPackage.LOOP__LOOP_ITERATION_LOOP:
            if (loopIteration_Loop != null)
               msgs = ((InternalEObject)loopIteration_Loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Usagemodel_av_pcPackage.LOOP__LOOP_ITERATION_LOOP, null, msgs);
            return basicSetLoopIteration_Loop((PCMRandomVariable)otherEnd, msgs);
         case Usagemodel_av_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP:
            if (bodyBehaviour_Loop != null)
               msgs = ((InternalEObject)bodyBehaviour_Loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Usagemodel_av_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP, null, msgs);
            return basicSetBodyBehaviour_Loop((ScenarioBehaviour)otherEnd, msgs);
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
         case Usagemodel_av_pcPackage.LOOP__LOOP_ITERATION_LOOP:
            return basicSetLoopIteration_Loop(null, msgs);
         case Usagemodel_av_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP:
            return basicSetBodyBehaviour_Loop(null, msgs);
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
         case Usagemodel_av_pcPackage.LOOP__LOOP_ITERATION_LOOP:
            return getLoopIteration_Loop();
         case Usagemodel_av_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP:
            return getBodyBehaviour_Loop();
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
         case Usagemodel_av_pcPackage.LOOP__LOOP_ITERATION_LOOP:
            setLoopIteration_Loop((PCMRandomVariable)newValue);
            return;
         case Usagemodel_av_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP:
            setBodyBehaviour_Loop((ScenarioBehaviour)newValue);
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
         case Usagemodel_av_pcPackage.LOOP__LOOP_ITERATION_LOOP:
            setLoopIteration_Loop((PCMRandomVariable)null);
            return;
         case Usagemodel_av_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP:
            setBodyBehaviour_Loop((ScenarioBehaviour)null);
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
         case Usagemodel_av_pcPackage.LOOP__LOOP_ITERATION_LOOP:
            return loopIteration_Loop != null;
         case Usagemodel_av_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP:
            return bodyBehaviour_Loop != null;
      }
      return super.eIsSet(featureID);
   }

} //LoopImpl
