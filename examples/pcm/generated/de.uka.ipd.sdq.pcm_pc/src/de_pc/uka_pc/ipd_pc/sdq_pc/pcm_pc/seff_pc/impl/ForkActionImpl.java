/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.ForkAction;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.ForkedBehaviour;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.SynchronisationPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.impl.ForkActionImpl#getAsynchronousForkedBehaviours_ForkAction <em>Asynchronous Forked Behaviours Fork Action</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.impl.ForkActionImpl#getSynchronisingBehaviours_ForkAction <em>Synchronising Behaviours Fork Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForkActionImpl extends AbstractInternalControlFlowActionImpl implements ForkAction {
   /**
    * The cached value of the '{@link #getAsynchronousForkedBehaviours_ForkAction() <em>Asynchronous Forked Behaviours Fork Action</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAsynchronousForkedBehaviours_ForkAction()
    * @generated
    * @ordered
    */
   protected EList<ForkedBehaviour> asynchronousForkedBehaviours_ForkAction;

   /**
    * The cached value of the '{@link #getSynchronisingBehaviours_ForkAction() <em>Synchronising Behaviours Fork Action</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSynchronisingBehaviours_ForkAction()
    * @generated
    * @ordered
    */
   protected SynchronisationPoint synchronisingBehaviours_ForkAction;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ForkActionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_pcPackage.Literals.FORK_ACTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ForkedBehaviour> getAsynchronousForkedBehaviours_ForkAction() {
      if (asynchronousForkedBehaviours_ForkAction == null) {
         asynchronousForkedBehaviours_ForkAction = new EObjectContainmentWithInverseEList<ForkedBehaviour>(ForkedBehaviour.class, this, Seff_pcPackage.FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION, Seff_pcPackage.FORKED_BEHAVIOUR__FORK_ACTION_FORKED_BEHAIVOUR);
      }
      return asynchronousForkedBehaviours_ForkAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SynchronisationPoint getSynchronisingBehaviours_ForkAction() {
      return synchronisingBehaviours_ForkAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSynchronisingBehaviours_ForkAction(SynchronisationPoint newSynchronisingBehaviours_ForkAction, NotificationChain msgs) {
      SynchronisationPoint oldSynchronisingBehaviours_ForkAction = synchronisingBehaviours_ForkAction;
      synchronisingBehaviours_ForkAction = newSynchronisingBehaviours_ForkAction;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Seff_pcPackage.FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION, oldSynchronisingBehaviours_ForkAction, newSynchronisingBehaviours_ForkAction);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSynchronisingBehaviours_ForkAction(SynchronisationPoint newSynchronisingBehaviours_ForkAction) {
      if (newSynchronisingBehaviours_ForkAction != synchronisingBehaviours_ForkAction) {
         NotificationChain msgs = null;
         if (synchronisingBehaviours_ForkAction != null)
            msgs = ((InternalEObject)synchronisingBehaviours_ForkAction).eInverseRemove(this, Seff_pcPackage.SYNCHRONISATION_POINT__FORK_ACTION_SYNCHRONISATION_POINT, SynchronisationPoint.class, msgs);
         if (newSynchronisingBehaviours_ForkAction != null)
            msgs = ((InternalEObject)newSynchronisingBehaviours_ForkAction).eInverseAdd(this, Seff_pcPackage.SYNCHRONISATION_POINT__FORK_ACTION_SYNCHRONISATION_POINT, SynchronisationPoint.class, msgs);
         msgs = basicSetSynchronisingBehaviours_ForkAction(newSynchronisingBehaviours_ForkAction, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pcPackage.FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION, newSynchronisingBehaviours_ForkAction, newSynchronisingBehaviours_ForkAction));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Seff_pcPackage.FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getAsynchronousForkedBehaviours_ForkAction()).basicAdd(otherEnd, msgs);
         case Seff_pcPackage.FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION:
            if (synchronisingBehaviours_ForkAction != null)
               msgs = ((InternalEObject)synchronisingBehaviours_ForkAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Seff_pcPackage.FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION, null, msgs);
            return basicSetSynchronisingBehaviours_ForkAction((SynchronisationPoint)otherEnd, msgs);
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
         case Seff_pcPackage.FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION:
            return ((InternalEList<?>)getAsynchronousForkedBehaviours_ForkAction()).basicRemove(otherEnd, msgs);
         case Seff_pcPackage.FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION:
            return basicSetSynchronisingBehaviours_ForkAction(null, msgs);
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
         case Seff_pcPackage.FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION:
            return getAsynchronousForkedBehaviours_ForkAction();
         case Seff_pcPackage.FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION:
            return getSynchronisingBehaviours_ForkAction();
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
         case Seff_pcPackage.FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION:
            getAsynchronousForkedBehaviours_ForkAction().clear();
            getAsynchronousForkedBehaviours_ForkAction().addAll((Collection<? extends ForkedBehaviour>)newValue);
            return;
         case Seff_pcPackage.FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION:
            setSynchronisingBehaviours_ForkAction((SynchronisationPoint)newValue);
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
         case Seff_pcPackage.FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION:
            getAsynchronousForkedBehaviours_ForkAction().clear();
            return;
         case Seff_pcPackage.FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION:
            setSynchronisingBehaviours_ForkAction((SynchronisationPoint)null);
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
         case Seff_pcPackage.FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION:
            return asynchronousForkedBehaviours_ForkAction != null && !asynchronousForkedBehaviours_ForkAction.isEmpty();
         case Seff_pcPackage.FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION:
            return synchronisingBehaviours_ForkAction != null;
      }
      return super.eIsSet(featureID);
   }

} //ForkActionImpl
