/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceInterfaceProvidingEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceProvidedRole;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.RoleImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.ResourceProvidedRoleImpl#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.ResourceProvidedRoleImpl#getProvidedResourceInterface__ResourceProvidedRole <em>Provided Resource Interface Resource Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceProvidedRoleImpl extends RoleImpl implements ResourceProvidedRole {
   /**
    * The cached value of the '{@link #getProvidedResourceInterface__ResourceProvidedRole() <em>Provided Resource Interface Resource Provided Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProvidedResourceInterface__ResourceProvidedRole()
    * @generated
    * @ordered
    */
   protected ResourceInterface providedResourceInterface__ResourceProvidedRole;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceProvidedRoleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Entity_avPackage.Literals.RESOURCE_PROVIDED_ROLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterfaceProvidingEntity getResourceInterfaceProvidingEntity__ResourceProvidedRole() {
      if (eContainerFeatureID() != Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE) return null;
      return (ResourceInterfaceProvidingEntity)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceInterfaceProvidingEntity__ResourceProvidedRole(ResourceInterfaceProvidingEntity newResourceInterfaceProvidingEntity__ResourceProvidedRole, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newResourceInterfaceProvidingEntity__ResourceProvidedRole, Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceInterfaceProvidingEntity__ResourceProvidedRole(ResourceInterfaceProvidingEntity newResourceInterfaceProvidingEntity__ResourceProvidedRole) {
      if (newResourceInterfaceProvidingEntity__ResourceProvidedRole != eInternalContainer() || (eContainerFeatureID() != Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE && newResourceInterfaceProvidingEntity__ResourceProvidedRole != null)) {
         if (EcoreUtil.isAncestor(this, newResourceInterfaceProvidingEntity__ResourceProvidedRole))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newResourceInterfaceProvidingEntity__ResourceProvidedRole != null)
            msgs = ((InternalEObject)newResourceInterfaceProvidingEntity__ResourceProvidedRole).eInverseAdd(this, Entity_avPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY, ResourceInterfaceProvidingEntity.class, msgs);
         msgs = basicSetResourceInterfaceProvidingEntity__ResourceProvidedRole(newResourceInterfaceProvidingEntity__ResourceProvidedRole, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE, newResourceInterfaceProvidingEntity__ResourceProvidedRole, newResourceInterfaceProvidingEntity__ResourceProvidedRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterface getProvidedResourceInterface__ResourceProvidedRole() {
      if (providedResourceInterface__ResourceProvidedRole != null && providedResourceInterface__ResourceProvidedRole.eIsProxy()) {
         InternalEObject oldProvidedResourceInterface__ResourceProvidedRole = (InternalEObject)providedResourceInterface__ResourceProvidedRole;
         providedResourceInterface__ResourceProvidedRole = (ResourceInterface)eResolveProxy(oldProvidedResourceInterface__ResourceProvidedRole);
         if (providedResourceInterface__ResourceProvidedRole != oldProvidedResourceInterface__ResourceProvidedRole) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Entity_avPackage.RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE, oldProvidedResourceInterface__ResourceProvidedRole, providedResourceInterface__ResourceProvidedRole));
         }
      }
      return providedResourceInterface__ResourceProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterface basicGetProvidedResourceInterface__ResourceProvidedRole() {
      return providedResourceInterface__ResourceProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProvidedResourceInterface__ResourceProvidedRole(ResourceInterface newProvidedResourceInterface__ResourceProvidedRole) {
      ResourceInterface oldProvidedResourceInterface__ResourceProvidedRole = providedResourceInterface__ResourceProvidedRole;
      providedResourceInterface__ResourceProvidedRole = newProvidedResourceInterface__ResourceProvidedRole;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Entity_avPackage.RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE, oldProvidedResourceInterface__ResourceProvidedRole, providedResourceInterface__ResourceProvidedRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetResourceInterfaceProvidingEntity__ResourceProvidedRole((ResourceInterfaceProvidingEntity)otherEnd, msgs);
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
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE:
            return basicSetResourceInterfaceProvidingEntity__ResourceProvidedRole(null, msgs);
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
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE:
            return eInternalContainer().eInverseRemove(this, Entity_avPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY, ResourceInterfaceProvidingEntity.class, msgs);
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
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE:
            return getResourceInterfaceProvidingEntity__ResourceProvidedRole();
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE:
            if (resolve) return getProvidedResourceInterface__ResourceProvidedRole();
            return basicGetProvidedResourceInterface__ResourceProvidedRole();
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
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE:
            setResourceInterfaceProvidingEntity__ResourceProvidedRole((ResourceInterfaceProvidingEntity)newValue);
            return;
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE:
            setProvidedResourceInterface__ResourceProvidedRole((ResourceInterface)newValue);
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
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE:
            setResourceInterfaceProvidingEntity__ResourceProvidedRole((ResourceInterfaceProvidingEntity)null);
            return;
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE:
            setProvidedResourceInterface__ResourceProvidedRole((ResourceInterface)null);
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
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE:
            return getResourceInterfaceProvidingEntity__ResourceProvidedRole() != null;
         case Entity_avPackage.RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE:
            return providedResourceInterface__ResourceProvidedRole != null;
      }
      return super.eIsSet(featureID);
   }

} //ResourceProvidedRoleImpl
