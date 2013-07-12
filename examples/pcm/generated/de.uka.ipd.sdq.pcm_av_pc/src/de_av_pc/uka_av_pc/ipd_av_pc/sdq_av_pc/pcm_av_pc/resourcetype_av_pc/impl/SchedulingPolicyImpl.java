/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.impl.EntityImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.ResourceRepository;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.Resourcetype_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.SchedulingPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl.SchedulingPolicyImpl#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulingPolicyImpl extends EntityImpl implements SchedulingPolicy {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SchedulingPolicyImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourcetype_av_pcPackage.Literals.SCHEDULING_POLICY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRepository getResourceRepository__SchedulingPolicy() {
      if (eContainerFeatureID() != Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY) return null;
      return (ResourceRepository)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceRepository__SchedulingPolicy(ResourceRepository newResourceRepository__SchedulingPolicy, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newResourceRepository__SchedulingPolicy, Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceRepository__SchedulingPolicy(ResourceRepository newResourceRepository__SchedulingPolicy) {
      if (newResourceRepository__SchedulingPolicy != eInternalContainer() || (eContainerFeatureID() != Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY && newResourceRepository__SchedulingPolicy != null)) {
         if (EcoreUtil.isAncestor(this, newResourceRepository__SchedulingPolicy))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newResourceRepository__SchedulingPolicy != null)
            msgs = ((InternalEObject)newResourceRepository__SchedulingPolicy).eInverseAdd(this, Resourcetype_av_pcPackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY, ResourceRepository.class, msgs);
         msgs = basicSetResourceRepository__SchedulingPolicy(newResourceRepository__SchedulingPolicy, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY, newResourceRepository__SchedulingPolicy, newResourceRepository__SchedulingPolicy));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetResourceRepository__SchedulingPolicy((ResourceRepository)otherEnd, msgs);
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
         case Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY:
            return basicSetResourceRepository__SchedulingPolicy(null, msgs);
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
         case Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY:
            return eInternalContainer().eInverseRemove(this, Resourcetype_av_pcPackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY, ResourceRepository.class, msgs);
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
         case Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY:
            return getResourceRepository__SchedulingPolicy();
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
         case Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY:
            setResourceRepository__SchedulingPolicy((ResourceRepository)newValue);
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
         case Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY:
            setResourceRepository__SchedulingPolicy((ResourceRepository)null);
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
         case Resourcetype_av_pcPackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY:
            return getResourceRepository__SchedulingPolicy() != null;
      }
      return super.eIsSet(featureID);
   }

} //SchedulingPolicyImpl
