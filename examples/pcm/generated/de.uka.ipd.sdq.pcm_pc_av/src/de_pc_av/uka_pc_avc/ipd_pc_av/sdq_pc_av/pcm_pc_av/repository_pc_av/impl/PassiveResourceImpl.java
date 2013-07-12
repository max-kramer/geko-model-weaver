/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.Core_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.EntityImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.Reliability_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.ResourceTimeoutFailureType;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.BasicComponent;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.PassiveResource;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passive Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PassiveResourceImpl#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PassiveResourceImpl#getBasicComponent_PassiveResource <em>Basic Component Passive Resource</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.PassiveResourceImpl#getResourceTimeoutFailureType__PassiveResource <em>Resource Timeout Failure Type Passive Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassiveResourceImpl extends EntityImpl implements PassiveResource {
   /**
    * The cached value of the '{@link #getCapacity_PassiveResource() <em>Capacity Passive Resource</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCapacity_PassiveResource()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable capacity_PassiveResource;

   /**
    * The cached value of the '{@link #getResourceTimeoutFailureType__PassiveResource() <em>Resource Timeout Failure Type Passive Resource</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceTimeoutFailureType__PassiveResource()
    * @generated
    * @ordered
    */
   protected ResourceTimeoutFailureType resourceTimeoutFailureType__PassiveResource;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PassiveResourceImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_avPackage.Literals.PASSIVE_RESOURCE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getCapacity_PassiveResource() {
      return capacity_PassiveResource;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetCapacity_PassiveResource(PCMRandomVariable newCapacity_PassiveResource, NotificationChain msgs) {
      PCMRandomVariable oldCapacity_PassiveResource = capacity_PassiveResource;
      capacity_PassiveResource = newCapacity_PassiveResource;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Repository_pc_avPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE, oldCapacity_PassiveResource, newCapacity_PassiveResource);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCapacity_PassiveResource(PCMRandomVariable newCapacity_PassiveResource) {
      if (newCapacity_PassiveResource != capacity_PassiveResource) {
         NotificationChain msgs = null;
         if (capacity_PassiveResource != null)
            msgs = ((InternalEObject)capacity_PassiveResource).eInverseRemove(this, Core_pc_avPackage.PCM_RANDOM_VARIABLE__PASSIVE_RESOURCE_CAPACITY_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newCapacity_PassiveResource != null)
            msgs = ((InternalEObject)newCapacity_PassiveResource).eInverseAdd(this, Core_pc_avPackage.PCM_RANDOM_VARIABLE__PASSIVE_RESOURCE_CAPACITY_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetCapacity_PassiveResource(newCapacity_PassiveResource, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_avPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE, newCapacity_PassiveResource, newCapacity_PassiveResource));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BasicComponent getBasicComponent_PassiveResource() {
      if (eContainerFeatureID() != Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE) return null;
      return (BasicComponent)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBasicComponent_PassiveResource(BasicComponent newBasicComponent_PassiveResource, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newBasicComponent_PassiveResource, Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBasicComponent_PassiveResource(BasicComponent newBasicComponent_PassiveResource) {
      if (newBasicComponent_PassiveResource != eInternalContainer() || (eContainerFeatureID() != Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE && newBasicComponent_PassiveResource != null)) {
         if (EcoreUtil.isAncestor(this, newBasicComponent_PassiveResource))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newBasicComponent_PassiveResource != null)
            msgs = ((InternalEObject)newBasicComponent_PassiveResource).eInverseAdd(this, Repository_pc_avPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT, BasicComponent.class, msgs);
         msgs = basicSetBasicComponent_PassiveResource(newBasicComponent_PassiveResource, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE, newBasicComponent_PassiveResource, newBasicComponent_PassiveResource));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceTimeoutFailureType getResourceTimeoutFailureType__PassiveResource() {
      if (resourceTimeoutFailureType__PassiveResource != null && resourceTimeoutFailureType__PassiveResource.eIsProxy()) {
         InternalEObject oldResourceTimeoutFailureType__PassiveResource = (InternalEObject)resourceTimeoutFailureType__PassiveResource;
         resourceTimeoutFailureType__PassiveResource = (ResourceTimeoutFailureType)eResolveProxy(oldResourceTimeoutFailureType__PassiveResource);
         if (resourceTimeoutFailureType__PassiveResource != oldResourceTimeoutFailureType__PassiveResource) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_pc_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE, oldResourceTimeoutFailureType__PassiveResource, resourceTimeoutFailureType__PassiveResource));
         }
      }
      return resourceTimeoutFailureType__PassiveResource;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceTimeoutFailureType basicGetResourceTimeoutFailureType__PassiveResource() {
      return resourceTimeoutFailureType__PassiveResource;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceTimeoutFailureType__PassiveResource(ResourceTimeoutFailureType newResourceTimeoutFailureType__PassiveResource, NotificationChain msgs) {
      ResourceTimeoutFailureType oldResourceTimeoutFailureType__PassiveResource = resourceTimeoutFailureType__PassiveResource;
      resourceTimeoutFailureType__PassiveResource = newResourceTimeoutFailureType__PassiveResource;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Repository_pc_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE, oldResourceTimeoutFailureType__PassiveResource, newResourceTimeoutFailureType__PassiveResource);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceTimeoutFailureType__PassiveResource(ResourceTimeoutFailureType newResourceTimeoutFailureType__PassiveResource) {
      if (newResourceTimeoutFailureType__PassiveResource != resourceTimeoutFailureType__PassiveResource) {
         NotificationChain msgs = null;
         if (resourceTimeoutFailureType__PassiveResource != null)
            msgs = ((InternalEObject)resourceTimeoutFailureType__PassiveResource).eInverseRemove(this, Reliability_pc_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE, ResourceTimeoutFailureType.class, msgs);
         if (newResourceTimeoutFailureType__PassiveResource != null)
            msgs = ((InternalEObject)newResourceTimeoutFailureType__PassiveResource).eInverseAdd(this, Reliability_pc_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE, ResourceTimeoutFailureType.class, msgs);
         msgs = basicSetResourceTimeoutFailureType__PassiveResource(newResourceTimeoutFailureType__PassiveResource, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE, newResourceTimeoutFailureType__PassiveResource, newResourceTimeoutFailureType__PassiveResource));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_pc_avPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
            if (capacity_PassiveResource != null)
               msgs = ((InternalEObject)capacity_PassiveResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Repository_pc_avPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE, null, msgs);
            return basicSetCapacity_PassiveResource((PCMRandomVariable)otherEnd, msgs);
         case Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetBasicComponent_PassiveResource((BasicComponent)otherEnd, msgs);
         case Repository_pc_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE:
            if (resourceTimeoutFailureType__PassiveResource != null)
               msgs = ((InternalEObject)resourceTimeoutFailureType__PassiveResource).eInverseRemove(this, Reliability_pc_avPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE, ResourceTimeoutFailureType.class, msgs);
            return basicSetResourceTimeoutFailureType__PassiveResource((ResourceTimeoutFailureType)otherEnd, msgs);
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
         case Repository_pc_avPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
            return basicSetCapacity_PassiveResource(null, msgs);
         case Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
            return basicSetBasicComponent_PassiveResource(null, msgs);
         case Repository_pc_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE:
            return basicSetResourceTimeoutFailureType__PassiveResource(null, msgs);
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
         case Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
            return eInternalContainer().eInverseRemove(this, Repository_pc_avPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT, BasicComponent.class, msgs);
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
         case Repository_pc_avPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
            return getCapacity_PassiveResource();
         case Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
            return getBasicComponent_PassiveResource();
         case Repository_pc_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE:
            if (resolve) return getResourceTimeoutFailureType__PassiveResource();
            return basicGetResourceTimeoutFailureType__PassiveResource();
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
         case Repository_pc_avPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
            setCapacity_PassiveResource((PCMRandomVariable)newValue);
            return;
         case Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
            setBasicComponent_PassiveResource((BasicComponent)newValue);
            return;
         case Repository_pc_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE:
            setResourceTimeoutFailureType__PassiveResource((ResourceTimeoutFailureType)newValue);
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
         case Repository_pc_avPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
            setCapacity_PassiveResource((PCMRandomVariable)null);
            return;
         case Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
            setBasicComponent_PassiveResource((BasicComponent)null);
            return;
         case Repository_pc_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE:
            setResourceTimeoutFailureType__PassiveResource((ResourceTimeoutFailureType)null);
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
         case Repository_pc_avPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
            return capacity_PassiveResource != null;
         case Repository_pc_avPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
            return getBasicComponent_PassiveResource() != null;
         case Repository_pc_avPackage.PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE:
            return resourceTimeoutFailureType__PassiveResource != null;
      }
      return super.eIsSet(featureID);
   }

} //PassiveResourceImpl
