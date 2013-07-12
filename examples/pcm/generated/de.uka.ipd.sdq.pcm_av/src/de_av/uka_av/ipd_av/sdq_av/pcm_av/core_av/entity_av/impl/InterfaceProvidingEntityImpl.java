/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.InterfaceProvidingEntity;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.ProvidedRole;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Providing Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.InterfaceProvidingEntityImpl#getProvidedRoles_InterfaceProvidingEntity <em>Provided Roles Interface Providing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceProvidingEntityImpl extends EntityImpl implements InterfaceProvidingEntity {
   /**
    * The cached value of the '{@link #getProvidedRoles_InterfaceProvidingEntity() <em>Provided Roles Interface Providing Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProvidedRoles_InterfaceProvidingEntity()
    * @generated
    * @ordered
    */
   protected EList<ProvidedRole> providedRoles_InterfaceProvidingEntity;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InterfaceProvidingEntityImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Entity_avPackage.Literals.INTERFACE_PROVIDING_ENTITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ProvidedRole> getProvidedRoles_InterfaceProvidingEntity() {
      if (providedRoles_InterfaceProvidingEntity == null) {
         providedRoles_InterfaceProvidingEntity = new EObjectContainmentWithInverseEList<ProvidedRole>(ProvidedRole.class, this, Entity_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY, Repository_avPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE);
      }
      return providedRoles_InterfaceProvidingEntity;
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
         case Entity_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedRoles_InterfaceProvidingEntity()).basicAdd(otherEnd, msgs);
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
         case Entity_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<?>)getProvidedRoles_InterfaceProvidingEntity()).basicRemove(otherEnd, msgs);
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
         case Entity_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return getProvidedRoles_InterfaceProvidingEntity();
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
         case Entity_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            getProvidedRoles_InterfaceProvidingEntity().clear();
            getProvidedRoles_InterfaceProvidingEntity().addAll((Collection<? extends ProvidedRole>)newValue);
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
         case Entity_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            getProvidedRoles_InterfaceProvidingEntity().clear();
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
         case Entity_avPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
            return providedRoles_InterfaceProvidingEntity != null && !providedRoles_InterfaceProvidingEntity.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //InterfaceProvidingEntityImpl
