/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.impl.EntityImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.FailureType;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.Reliability_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.impl.FailureTypeImpl#getRepository__FailureType <em>Repository Failure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailureTypeImpl extends EntityImpl implements FailureType {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected FailureTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Reliability_pcPackage.Literals.FAILURE_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Repository getRepository__FailureType() {
      if (eContainerFeatureID() != Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE) return null;
      return (Repository)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRepository__FailureType(Repository newRepository__FailureType, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newRepository__FailureType, Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRepository__FailureType(Repository newRepository__FailureType) {
      if (newRepository__FailureType != eInternalContainer() || (eContainerFeatureID() != Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE && newRepository__FailureType != null)) {
         if (EcoreUtil.isAncestor(this, newRepository__FailureType))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newRepository__FailureType != null)
            msgs = ((InternalEObject)newRepository__FailureType).eInverseAdd(this, Repository_pcPackage.REPOSITORY__FAILURE_TYPES_REPOSITORY, Repository.class, msgs);
         msgs = basicSetRepository__FailureType(newRepository__FailureType, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE, newRepository__FailureType, newRepository__FailureType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetRepository__FailureType((Repository)otherEnd, msgs);
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
         case Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE:
            return basicSetRepository__FailureType(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
      switch (eContainerFeatureID()) {
         case Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE:
            return eInternalContainer().eInverseRemove(this, Repository_pcPackage.REPOSITORY__FAILURE_TYPES_REPOSITORY, Repository.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE:
            return getRepository__FailureType();
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
         case Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE:
            setRepository__FailureType((Repository)newValue);
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
         case Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE:
            setRepository__FailureType((Repository)null);
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
         case Reliability_pcPackage.FAILURE_TYPE__REPOSITORY_FAILURE_TYPE:
            return getRepository__FailureType() != null;
      }
      return super.eIsSet(featureID);
   }

} //FailureTypeImpl
