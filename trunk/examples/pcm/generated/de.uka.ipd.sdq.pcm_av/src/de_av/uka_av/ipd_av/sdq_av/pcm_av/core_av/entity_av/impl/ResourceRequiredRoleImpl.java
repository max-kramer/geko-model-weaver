/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceInterfaceRequiringEntity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceRequiredRole;

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
 * An implementation of the model object '<em><b>Resource Required Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.ResourceRequiredRoleImpl#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.ResourceRequiredRoleImpl#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRequiredRoleImpl extends RoleImpl implements ResourceRequiredRole {
   /**
    * The cached value of the '{@link #getRequiredResourceInterface__ResourceRequiredRole() <em>Required Resource Interface Resource Required Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredResourceInterface__ResourceRequiredRole()
    * @generated
    * @ordered
    */
   protected ResourceInterface requiredResourceInterface__ResourceRequiredRole;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceRequiredRoleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Entity_avPackage.Literals.RESOURCE_REQUIRED_ROLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterface getRequiredResourceInterface__ResourceRequiredRole() {
      if (requiredResourceInterface__ResourceRequiredRole != null && requiredResourceInterface__ResourceRequiredRole.eIsProxy()) {
         InternalEObject oldRequiredResourceInterface__ResourceRequiredRole = (InternalEObject)requiredResourceInterface__ResourceRequiredRole;
         requiredResourceInterface__ResourceRequiredRole = (ResourceInterface)eResolveProxy(oldRequiredResourceInterface__ResourceRequiredRole);
         if (requiredResourceInterface__ResourceRequiredRole != oldRequiredResourceInterface__ResourceRequiredRole) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Entity_avPackage.RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE, oldRequiredResourceInterface__ResourceRequiredRole, requiredResourceInterface__ResourceRequiredRole));
         }
      }
      return requiredResourceInterface__ResourceRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterface basicGetRequiredResourceInterface__ResourceRequiredRole() {
      return requiredResourceInterface__ResourceRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiredResourceInterface__ResourceRequiredRole(ResourceInterface newRequiredResourceInterface__ResourceRequiredRole) {
      ResourceInterface oldRequiredResourceInterface__ResourceRequiredRole = requiredResourceInterface__ResourceRequiredRole;
      requiredResourceInterface__ResourceRequiredRole = newRequiredResourceInterface__ResourceRequiredRole;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Entity_avPackage.RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE, oldRequiredResourceInterface__ResourceRequiredRole, requiredResourceInterface__ResourceRequiredRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterfaceRequiringEntity getResourceInterfaceRequiringEntity__ResourceRequiredRole() {
      if (eContainerFeatureID() != Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE) return null;
      return (ResourceInterfaceRequiringEntity)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity newResourceInterfaceRequiringEntity__ResourceRequiredRole, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newResourceInterfaceRequiringEntity__ResourceRequiredRole, Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceInterfaceRequiringEntity__ResourceRequiredRole(ResourceInterfaceRequiringEntity newResourceInterfaceRequiringEntity__ResourceRequiredRole) {
      if (newResourceInterfaceRequiringEntity__ResourceRequiredRole != eInternalContainer() || (eContainerFeatureID() != Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE && newResourceInterfaceRequiringEntity__ResourceRequiredRole != null)) {
         if (EcoreUtil.isAncestor(this, newResourceInterfaceRequiringEntity__ResourceRequiredRole))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newResourceInterfaceRequiringEntity__ResourceRequiredRole != null)
            msgs = ((InternalEObject)newResourceInterfaceRequiringEntity__ResourceRequiredRole).eInverseAdd(this, Entity_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY, ResourceInterfaceRequiringEntity.class, msgs);
         msgs = basicSetResourceInterfaceRequiringEntity__ResourceRequiredRole(newResourceInterfaceRequiringEntity__ResourceRequiredRole, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE, newResourceInterfaceRequiringEntity__ResourceRequiredRole, newResourceInterfaceRequiringEntity__ResourceRequiredRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetResourceInterfaceRequiringEntity__ResourceRequiredRole((ResourceInterfaceRequiringEntity)otherEnd, msgs);
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
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE:
            return basicSetResourceInterfaceRequiringEntity__ResourceRequiredRole(null, msgs);
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
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE:
            return eInternalContainer().eInverseRemove(this, Entity_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY, ResourceInterfaceRequiringEntity.class, msgs);
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
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE:
            if (resolve) return getRequiredResourceInterface__ResourceRequiredRole();
            return basicGetRequiredResourceInterface__ResourceRequiredRole();
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE:
            return getResourceInterfaceRequiringEntity__ResourceRequiredRole();
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
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE:
            setRequiredResourceInterface__ResourceRequiredRole((ResourceInterface)newValue);
            return;
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE:
            setResourceInterfaceRequiringEntity__ResourceRequiredRole((ResourceInterfaceRequiringEntity)newValue);
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
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE:
            setRequiredResourceInterface__ResourceRequiredRole((ResourceInterface)null);
            return;
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE:
            setResourceInterfaceRequiringEntity__ResourceRequiredRole((ResourceInterfaceRequiringEntity)null);
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
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE:
            return requiredResourceInterface__ResourceRequiredRole != null;
         case Entity_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE:
            return getResourceInterfaceRequiringEntity__ResourceRequiredRole() != null;
      }
      return super.eIsSet(featureID);
   }

} //ResourceRequiredRoleImpl
