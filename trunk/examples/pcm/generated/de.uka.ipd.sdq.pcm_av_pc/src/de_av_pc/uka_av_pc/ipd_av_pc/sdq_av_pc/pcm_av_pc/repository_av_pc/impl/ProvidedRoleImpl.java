/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingEntity;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.ProvidedRole;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.ProvidedRoleImpl#getProvidingEntity_ProvidedRole <em>Providing Entity Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedRoleImpl extends RoleImpl implements ProvidedRole {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ProvidedRoleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_av_pcPackage.Literals.PROVIDED_ROLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InterfaceProvidingEntity getProvidingEntity_ProvidedRole() {
      if (eContainerFeatureID() != Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE) return null;
      return (InterfaceProvidingEntity)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetProvidingEntity_ProvidedRole(InterfaceProvidingEntity newProvidingEntity_ProvidedRole, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newProvidingEntity_ProvidedRole, Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProvidingEntity_ProvidedRole(InterfaceProvidingEntity newProvidingEntity_ProvidedRole) {
      if (newProvidingEntity_ProvidedRole != eInternalContainer() || (eContainerFeatureID() != Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE && newProvidingEntity_ProvidedRole != null)) {
         if (EcoreUtil.isAncestor(this, newProvidingEntity_ProvidedRole))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newProvidingEntity_ProvidedRole != null)
            msgs = ((InternalEObject)newProvidingEntity_ProvidedRole).eInverseAdd(this, Entity_av_pcPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY, InterfaceProvidingEntity.class, msgs);
         msgs = basicSetProvidingEntity_ProvidedRole(newProvidingEntity_ProvidedRole, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE, newProvidingEntity_ProvidedRole, newProvidingEntity_ProvidedRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetProvidingEntity_ProvidedRole((InterfaceProvidingEntity)otherEnd, msgs);
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
         case Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE:
            return basicSetProvidingEntity_ProvidedRole(null, msgs);
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
         case Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE:
            return eInternalContainer().eInverseRemove(this, Entity_av_pcPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY, InterfaceProvidingEntity.class, msgs);
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
         case Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE:
            return getProvidingEntity_ProvidedRole();
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
         case Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE:
            setProvidingEntity_ProvidedRole((InterfaceProvidingEntity)newValue);
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
         case Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE:
            setProvidingEntity_ProvidedRole((InterfaceProvidingEntity)null);
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
         case Repository_av_pcPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE:
            return getProvidingEntity_ProvidedRole() != null;
      }
      return super.eIsSet(featureID);
   }

} //ProvidedRoleImpl
