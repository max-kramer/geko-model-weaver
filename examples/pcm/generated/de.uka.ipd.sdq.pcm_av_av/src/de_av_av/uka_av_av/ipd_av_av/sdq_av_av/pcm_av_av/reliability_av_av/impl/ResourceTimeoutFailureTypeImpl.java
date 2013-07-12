/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.Reliability_av_avPackage;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.ResourceTimeoutFailureType;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.PassiveResource;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Timeout Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.reliability_av_av.impl.ResourceTimeoutFailureTypeImpl#getPassiveResource__ResourceTimeoutFailureType <em>Passive Resource Resource Timeout Failure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceTimeoutFailureTypeImpl extends SoftwareInducedFailureTypeImpl implements ResourceTimeoutFailureType {
   /**
    * The cached value of the '{@link #getPassiveResource__ResourceTimeoutFailureType() <em>Passive Resource Resource Timeout Failure Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPassiveResource__ResourceTimeoutFailureType()
    * @generated
    * @ordered
    */
   protected PassiveResource passiveResource__ResourceTimeoutFailureType;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceTimeoutFailureTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Reliability_av_avPackage.Literals.RESOURCE_TIMEOUT_FAILURE_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PassiveResource getPassiveResource__ResourceTimeoutFailureType() {
      if (passiveResource__ResourceTimeoutFailureType != null && passiveResource__ResourceTimeoutFailureType.eIsProxy()) {
         InternalEObject oldPassiveResource__ResourceTimeoutFailureType = (InternalEObject)passiveResource__ResourceTimeoutFailureType;
         passiveResource__ResourceTimeoutFailureType = (PassiveResource)eResolveProxy(oldPassiveResource__ResourceTimeoutFailureType);
         if (passiveResource__ResourceTimeoutFailureType != oldPassiveResource__ResourceTimeoutFailureType) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE, oldPassiveResource__ResourceTimeoutFailureType, passiveResource__ResourceTimeoutFailureType));
         }
      }
      return passiveResource__ResourceTimeoutFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PassiveResource basicGetPassiveResource__ResourceTimeoutFailureType() {
      return passiveResource__ResourceTimeoutFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPassiveResource__ResourceTimeoutFailureType(PassiveResource newPassiveResource__ResourceTimeoutFailureType, NotificationChain msgs) {
      PassiveResource oldPassiveResource__ResourceTimeoutFailureType = passiveResource__ResourceTimeoutFailureType;
      passiveResource__ResourceTimeoutFailureType = newPassiveResource__ResourceTimeoutFailureType;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE, oldPassiveResource__ResourceTimeoutFailureType, newPassiveResource__ResourceTimeoutFailureType);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPassiveResource__ResourceTimeoutFailureType(PassiveResource newPassiveResource__ResourceTimeoutFailureType) {
      if (newPassiveResource__ResourceTimeoutFailureType != passiveResource__ResourceTimeoutFailureType) {
         NotificationChain msgs = null;
         if (passiveResource__ResourceTimeoutFailureType != null)
            msgs = ((InternalEObject)passiveResource__ResourceTimeoutFailureType).eInverseRemove(this, Repository_av_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE, PassiveResource.class, msgs);
         if (newPassiveResource__ResourceTimeoutFailureType != null)
            msgs = ((InternalEObject)newPassiveResource__ResourceTimeoutFailureType).eInverseAdd(this, Repository_av_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE, PassiveResource.class, msgs);
         msgs = basicSetPassiveResource__ResourceTimeoutFailureType(newPassiveResource__ResourceTimeoutFailureType, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE, newPassiveResource__ResourceTimeoutFailureType, newPassiveResource__ResourceTimeoutFailureType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
            if (passiveResource__ResourceTimeoutFailureType != null)
               msgs = ((InternalEObject)passiveResource__ResourceTimeoutFailureType).eInverseRemove(this, Repository_av_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE, PassiveResource.class, msgs);
            return basicSetPassiveResource__ResourceTimeoutFailureType((PassiveResource)otherEnd, msgs);
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
         case Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
            return basicSetPassiveResource__ResourceTimeoutFailureType(null, msgs);
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
         case Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
            if (resolve) return getPassiveResource__ResourceTimeoutFailureType();
            return basicGetPassiveResource__ResourceTimeoutFailureType();
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
         case Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
            setPassiveResource__ResourceTimeoutFailureType((PassiveResource)newValue);
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
         case Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
            setPassiveResource__ResourceTimeoutFailureType((PassiveResource)null);
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
         case Reliability_av_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
            return passiveResource__ResourceTimeoutFailureType != null;
      }
      return super.eIsSet(featureID);
   }

} //ResourceTimeoutFailureTypeImpl
