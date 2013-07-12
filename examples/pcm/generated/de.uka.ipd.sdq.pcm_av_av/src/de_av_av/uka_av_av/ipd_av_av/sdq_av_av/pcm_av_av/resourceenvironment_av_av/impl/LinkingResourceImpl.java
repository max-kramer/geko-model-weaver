/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.impl.EntityImpl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.CommunicationLinkResourceSpecification;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.LinkingResource;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.ResourceContainer;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.ResourceEnvironment;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.Resourceenvironment_av_avPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.impl.LinkingResourceImpl#getConnectedResourceContainers_LinkingResource <em>Connected Resource Containers Linking Resource</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.impl.LinkingResourceImpl#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.resourceenvironment_av_av.impl.LinkingResourceImpl#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkingResourceImpl extends EntityImpl implements LinkingResource {
   /**
    * The cached value of the '{@link #getConnectedResourceContainers_LinkingResource() <em>Connected Resource Containers Linking Resource</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConnectedResourceContainers_LinkingResource()
    * @generated
    * @ordered
    */
   protected EList<ResourceContainer> connectedResourceContainers_LinkingResource;

   /**
    * The cached value of the '{@link #getCommunicationLinkResourceSpecifications_LinkingResource() <em>Communication Link Resource Specifications Linking Resource</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCommunicationLinkResourceSpecifications_LinkingResource()
    * @generated
    * @ordered
    */
   protected CommunicationLinkResourceSpecification communicationLinkResourceSpecifications_LinkingResource;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected LinkingResourceImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourceenvironment_av_avPackage.Literals.LINKING_RESOURCE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceContainer> getConnectedResourceContainers_LinkingResource() {
      if (connectedResourceContainers_LinkingResource == null) {
         connectedResourceContainers_LinkingResource = new EObjectResolvingEList<ResourceContainer>(ResourceContainer.class, this, Resourceenvironment_av_avPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE);
      }
      return connectedResourceContainers_LinkingResource;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceSpecification getCommunicationLinkResourceSpecifications_LinkingResource() {
      return communicationLinkResourceSpecifications_LinkingResource;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification newCommunicationLinkResourceSpecifications_LinkingResource, NotificationChain msgs) {
      CommunicationLinkResourceSpecification oldCommunicationLinkResourceSpecifications_LinkingResource = communicationLinkResourceSpecifications_LinkingResource;
      communicationLinkResourceSpecifications_LinkingResource = newCommunicationLinkResourceSpecifications_LinkingResource;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Resourceenvironment_av_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE, oldCommunicationLinkResourceSpecifications_LinkingResource, newCommunicationLinkResourceSpecifications_LinkingResource);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification newCommunicationLinkResourceSpecifications_LinkingResource) {
      if (newCommunicationLinkResourceSpecifications_LinkingResource != communicationLinkResourceSpecifications_LinkingResource) {
         NotificationChain msgs = null;
         if (communicationLinkResourceSpecifications_LinkingResource != null)
            msgs = ((InternalEObject)communicationLinkResourceSpecifications_LinkingResource).eInverseRemove(this, Resourceenvironment_av_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, CommunicationLinkResourceSpecification.class, msgs);
         if (newCommunicationLinkResourceSpecifications_LinkingResource != null)
            msgs = ((InternalEObject)newCommunicationLinkResourceSpecifications_LinkingResource).eInverseAdd(this, Resourceenvironment_av_avPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, CommunicationLinkResourceSpecification.class, msgs);
         msgs = basicSetCommunicationLinkResourceSpecifications_LinkingResource(newCommunicationLinkResourceSpecifications_LinkingResource, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourceenvironment_av_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE, newCommunicationLinkResourceSpecifications_LinkingResource, newCommunicationLinkResourceSpecifications_LinkingResource));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceEnvironment getResourceEnvironment_LinkingResource() {
      if (eContainerFeatureID() != Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE) return null;
      return (ResourceEnvironment)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceEnvironment_LinkingResource(ResourceEnvironment newResourceEnvironment_LinkingResource, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newResourceEnvironment_LinkingResource, Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceEnvironment_LinkingResource(ResourceEnvironment newResourceEnvironment_LinkingResource) {
      if (newResourceEnvironment_LinkingResource != eInternalContainer() || (eContainerFeatureID() != Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE && newResourceEnvironment_LinkingResource != null)) {
         if (EcoreUtil.isAncestor(this, newResourceEnvironment_LinkingResource))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newResourceEnvironment_LinkingResource != null)
            msgs = ((InternalEObject)newResourceEnvironment_LinkingResource).eInverseAdd(this, Resourceenvironment_av_avPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT, ResourceEnvironment.class, msgs);
         msgs = basicSetResourceEnvironment_LinkingResource(newResourceEnvironment_LinkingResource, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE, newResourceEnvironment_LinkingResource, newResourceEnvironment_LinkingResource));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
            if (communicationLinkResourceSpecifications_LinkingResource != null)
               msgs = ((InternalEObject)communicationLinkResourceSpecifications_LinkingResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Resourceenvironment_av_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE, null, msgs);
            return basicSetCommunicationLinkResourceSpecifications_LinkingResource((CommunicationLinkResourceSpecification)otherEnd, msgs);
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetResourceEnvironment_LinkingResource((ResourceEnvironment)otherEnd, msgs);
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
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
            return basicSetCommunicationLinkResourceSpecifications_LinkingResource(null, msgs);
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE:
            return basicSetResourceEnvironment_LinkingResource(null, msgs);
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
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE:
            return eInternalContainer().eInverseRemove(this, Resourceenvironment_av_avPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT, ResourceEnvironment.class, msgs);
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
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE:
            return getConnectedResourceContainers_LinkingResource();
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
            return getCommunicationLinkResourceSpecifications_LinkingResource();
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE:
            return getResourceEnvironment_LinkingResource();
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
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE:
            getConnectedResourceContainers_LinkingResource().clear();
            getConnectedResourceContainers_LinkingResource().addAll((Collection<? extends ResourceContainer>)newValue);
            return;
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
            setCommunicationLinkResourceSpecifications_LinkingResource((CommunicationLinkResourceSpecification)newValue);
            return;
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE:
            setResourceEnvironment_LinkingResource((ResourceEnvironment)newValue);
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
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE:
            getConnectedResourceContainers_LinkingResource().clear();
            return;
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
            setCommunicationLinkResourceSpecifications_LinkingResource((CommunicationLinkResourceSpecification)null);
            return;
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE:
            setResourceEnvironment_LinkingResource((ResourceEnvironment)null);
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
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE:
            return connectedResourceContainers_LinkingResource != null && !connectedResourceContainers_LinkingResource.isEmpty();
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
            return communicationLinkResourceSpecifications_LinkingResource != null;
         case Resourceenvironment_av_avPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE:
            return getResourceEnvironment_LinkingResource() != null;
      }
      return super.eIsSet(featureID);
   }

} //LinkingResourceImpl
