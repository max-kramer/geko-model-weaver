/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.impl.EntityImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.ProcessingResourceSpecification;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.ResourceContainer;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.ResourceEnvironment;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.Resourceenvironment_av_pcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.ResourceContainerImpl#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.ResourceContainerImpl#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.ResourceContainerImpl#getNestedResourceContainers__ResourceContainer <em>Nested Resource Containers Resource Container</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.ResourceContainerImpl#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceContainerImpl extends EntityImpl implements ResourceContainer {
   /**
    * The cached value of the '{@link #getActiveResourceSpecifications_ResourceContainer() <em>Active Resource Specifications Resource Container</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getActiveResourceSpecifications_ResourceContainer()
    * @generated
    * @ordered
    */
   protected EList<ProcessingResourceSpecification> activeResourceSpecifications_ResourceContainer;

   /**
    * The cached value of the '{@link #getNestedResourceContainers__ResourceContainer() <em>Nested Resource Containers Resource Container</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNestedResourceContainers__ResourceContainer()
    * @generated
    * @ordered
    */
   protected EList<ResourceContainer> nestedResourceContainers__ResourceContainer;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceContainerImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourceenvironment_av_pcPackage.Literals.RESOURCE_CONTAINER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ProcessingResourceSpecification> getActiveResourceSpecifications_ResourceContainer() {
      if (activeResourceSpecifications_ResourceContainer == null) {
         activeResourceSpecifications_ResourceContainer = new EObjectContainmentWithInverseEList<ProcessingResourceSpecification>(ProcessingResourceSpecification.class, this, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER, Resourceenvironment_av_pcPackage.PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION);
      }
      return activeResourceSpecifications_ResourceContainer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceEnvironment getResourceEnvironment_ResourceContainer() {
      if (eContainerFeatureID() != Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER) return null;
      return (ResourceEnvironment)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceEnvironment_ResourceContainer(ResourceEnvironment newResourceEnvironment_ResourceContainer, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newResourceEnvironment_ResourceContainer, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceEnvironment_ResourceContainer(ResourceEnvironment newResourceEnvironment_ResourceContainer) {
      if (newResourceEnvironment_ResourceContainer != eInternalContainer() || (eContainerFeatureID() != Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER && newResourceEnvironment_ResourceContainer != null)) {
         if (EcoreUtil.isAncestor(this, newResourceEnvironment_ResourceContainer))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newResourceEnvironment_ResourceContainer != null)
            msgs = ((InternalEObject)newResourceEnvironment_ResourceContainer).eInverseAdd(this, Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT, ResourceEnvironment.class, msgs);
         msgs = basicSetResourceEnvironment_ResourceContainer(newResourceEnvironment_ResourceContainer, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER, newResourceEnvironment_ResourceContainer, newResourceEnvironment_ResourceContainer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceContainer> getNestedResourceContainers__ResourceContainer() {
      if (nestedResourceContainers__ResourceContainer == null) {
         nestedResourceContainers__ResourceContainer = new EObjectContainmentWithInverseEList<ResourceContainer>(ResourceContainer.class, this, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER);
      }
      return nestedResourceContainers__ResourceContainer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceContainer getParentResourceContainer__ResourceContainer() {
      if (eContainerFeatureID() != Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER) return null;
      return (ResourceContainer)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParentResourceContainer__ResourceContainer(ResourceContainer newParentResourceContainer__ResourceContainer, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newParentResourceContainer__ResourceContainer, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParentResourceContainer__ResourceContainer(ResourceContainer newParentResourceContainer__ResourceContainer) {
      if (newParentResourceContainer__ResourceContainer != eInternalContainer() || (eContainerFeatureID() != Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER && newParentResourceContainer__ResourceContainer != null)) {
         if (EcoreUtil.isAncestor(this, newParentResourceContainer__ResourceContainer))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParentResourceContainer__ResourceContainer != null)
            msgs = ((InternalEObject)newParentResourceContainer__ResourceContainer).eInverseAdd(this, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER, ResourceContainer.class, msgs);
         msgs = basicSetParentResourceContainer__ResourceContainer(newParentResourceContainer__ResourceContainer, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER, newParentResourceContainer__ResourceContainer, newParentResourceContainer__ResourceContainer));
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
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveResourceSpecifications_ResourceContainer()).basicAdd(otherEnd, msgs);
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetResourceEnvironment_ResourceContainer((ResourceEnvironment)otherEnd, msgs);
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedResourceContainers__ResourceContainer()).basicAdd(otherEnd, msgs);
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParentResourceContainer__ResourceContainer((ResourceContainer)otherEnd, msgs);
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
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
            return ((InternalEList<?>)getActiveResourceSpecifications_ResourceContainer()).basicRemove(otherEnd, msgs);
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
            return basicSetResourceEnvironment_ResourceContainer(null, msgs);
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
            return ((InternalEList<?>)getNestedResourceContainers__ResourceContainer()).basicRemove(otherEnd, msgs);
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
            return basicSetParentResourceContainer__ResourceContainer(null, msgs);
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
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
            return eInternalContainer().eInverseRemove(this, Resourceenvironment_av_pcPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT, ResourceEnvironment.class, msgs);
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
            return eInternalContainer().eInverseRemove(this, Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER, ResourceContainer.class, msgs);
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
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
            return getActiveResourceSpecifications_ResourceContainer();
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
            return getResourceEnvironment_ResourceContainer();
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
            return getNestedResourceContainers__ResourceContainer();
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
            return getParentResourceContainer__ResourceContainer();
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
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
            getActiveResourceSpecifications_ResourceContainer().clear();
            getActiveResourceSpecifications_ResourceContainer().addAll((Collection<? extends ProcessingResourceSpecification>)newValue);
            return;
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
            setResourceEnvironment_ResourceContainer((ResourceEnvironment)newValue);
            return;
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
            getNestedResourceContainers__ResourceContainer().clear();
            getNestedResourceContainers__ResourceContainer().addAll((Collection<? extends ResourceContainer>)newValue);
            return;
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
            setParentResourceContainer__ResourceContainer((ResourceContainer)newValue);
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
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
            getActiveResourceSpecifications_ResourceContainer().clear();
            return;
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
            setResourceEnvironment_ResourceContainer((ResourceEnvironment)null);
            return;
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
            getNestedResourceContainers__ResourceContainer().clear();
            return;
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
            setParentResourceContainer__ResourceContainer((ResourceContainer)null);
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
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
            return activeResourceSpecifications_ResourceContainer != null && !activeResourceSpecifications_ResourceContainer.isEmpty();
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
            return getResourceEnvironment_ResourceContainer() != null;
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
            return nestedResourceContainers__ResourceContainer != null && !nestedResourceContainers__ResourceContainer.isEmpty();
         case Resourceenvironment_av_pcPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
            return getParentResourceContainer__ResourceContainer() != null;
      }
      return super.eIsSet(featureID);
   }

} //ResourceContainerImpl
