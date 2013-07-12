/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceRequiringEntity;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RequiredRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.RequiredRoleImpl#getRequiringEntity_RequiredRole <em>Requiring Entity Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredRoleImpl extends RoleImpl implements RequiredRole {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RequiredRoleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_av_pcPackage.Literals.REQUIRED_ROLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InterfaceRequiringEntity getRequiringEntity_RequiredRole() {
      if (eContainerFeatureID() != Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE) return null;
      return (InterfaceRequiringEntity)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRequiringEntity_RequiredRole(InterfaceRequiringEntity newRequiringEntity_RequiredRole, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newRequiringEntity_RequiredRole, Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiringEntity_RequiredRole(InterfaceRequiringEntity newRequiringEntity_RequiredRole) {
      if (newRequiringEntity_RequiredRole != eInternalContainer() || (eContainerFeatureID() != Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE && newRequiringEntity_RequiredRole != null)) {
         if (EcoreUtil.isAncestor(this, newRequiringEntity_RequiredRole))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newRequiringEntity_RequiredRole != null)
            msgs = ((InternalEObject)newRequiringEntity_RequiredRole).eInverseAdd(this, Entity_av_pcPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY, InterfaceRequiringEntity.class, msgs);
         msgs = basicSetRequiringEntity_RequiredRole(newRequiringEntity_RequiredRole, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE, newRequiringEntity_RequiredRole, newRequiringEntity_RequiredRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetRequiringEntity_RequiredRole((InterfaceRequiringEntity)otherEnd, msgs);
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
         case Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
            return basicSetRequiringEntity_RequiredRole(null, msgs);
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
         case Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
            return eInternalContainer().eInverseRemove(this, Entity_av_pcPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY, InterfaceRequiringEntity.class, msgs);
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
         case Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
            return getRequiringEntity_RequiredRole();
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
         case Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
            setRequiringEntity_RequiredRole((InterfaceRequiringEntity)newValue);
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
         case Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
            setRequiringEntity_RequiredRole((InterfaceRequiringEntity)null);
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
         case Repository_av_pcPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
            return getRequiringEntity_RequiredRole() != null;
      }
      return super.eIsSet(featureID);
   }

} //RequiredRoleImpl
