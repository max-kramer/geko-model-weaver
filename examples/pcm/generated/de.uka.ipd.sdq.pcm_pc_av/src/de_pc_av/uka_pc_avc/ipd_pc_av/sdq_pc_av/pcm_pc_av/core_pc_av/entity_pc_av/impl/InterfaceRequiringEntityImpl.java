/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.InterfaceRequiringEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceInterfaceRequiringEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceRequiredRole;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.RequiredRole;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.InterfaceRequiringEntityImpl#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.InterfaceRequiringEntityImpl#getRequiredRoles_InterfaceRequiringEntity <em>Required Roles Interface Requiring Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceRequiringEntityImpl extends EntityImpl implements InterfaceRequiringEntity {
   /**
    * The cached value of the '{@link #getResourceRequiredRoles__ResourceInterfaceRequiringEntity() <em>Resource Required Roles Resource Interface Requiring Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceRequiredRoles__ResourceInterfaceRequiringEntity()
    * @generated
    * @ordered
    */
   protected EList<ResourceRequiredRole> resourceRequiredRoles__ResourceInterfaceRequiringEntity;

   /**
    * The cached value of the '{@link #getRequiredRoles_InterfaceRequiringEntity() <em>Required Roles Interface Requiring Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredRoles_InterfaceRequiringEntity()
    * @generated
    * @ordered
    */
   protected EList<RequiredRole> requiredRoles_InterfaceRequiringEntity;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InterfaceRequiringEntityImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Entity_pc_avPackage.Literals.INTERFACE_REQUIRING_ENTITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceRequiredRole> getResourceRequiredRoles__ResourceInterfaceRequiringEntity() {
      if (resourceRequiredRoles__ResourceInterfaceRequiringEntity == null) {
         resourceRequiredRoles__ResourceInterfaceRequiringEntity = new EObjectContainmentWithInverseEList<ResourceRequiredRole>(ResourceRequiredRole.class, this, Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY, Entity_pc_avPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE);
      }
      return resourceRequiredRoles__ResourceInterfaceRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<RequiredRole> getRequiredRoles_InterfaceRequiringEntity() {
      if (requiredRoles_InterfaceRequiringEntity == null) {
         requiredRoles_InterfaceRequiringEntity = new EObjectContainmentWithInverseEList<RequiredRole>(RequiredRole.class, this, Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY, Repository_pc_avPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE);
      }
      return requiredRoles_InterfaceRequiringEntity;
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
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceRequiredRoles__ResourceInterfaceRequiringEntity()).basicAdd(otherEnd, msgs);
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredRoles_InterfaceRequiringEntity()).basicAdd(otherEnd, msgs);
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
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<?>)getResourceRequiredRoles__ResourceInterfaceRequiringEntity()).basicRemove(otherEnd, msgs);
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return ((InternalEList<?>)getRequiredRoles_InterfaceRequiringEntity()).basicRemove(otherEnd, msgs);
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
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return getResourceRequiredRoles__ResourceInterfaceRequiringEntity();
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return getRequiredRoles_InterfaceRequiringEntity();
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
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            getResourceRequiredRoles__ResourceInterfaceRequiringEntity().clear();
            getResourceRequiredRoles__ResourceInterfaceRequiringEntity().addAll((Collection<? extends ResourceRequiredRole>)newValue);
            return;
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            getRequiredRoles_InterfaceRequiringEntity().clear();
            getRequiredRoles_InterfaceRequiringEntity().addAll((Collection<? extends RequiredRole>)newValue);
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
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            getResourceRequiredRoles__ResourceInterfaceRequiringEntity().clear();
            return;
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            getRequiredRoles_InterfaceRequiringEntity().clear();
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
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
            return resourceRequiredRoles__ResourceInterfaceRequiringEntity != null && !resourceRequiredRoles__ResourceInterfaceRequiringEntity.isEmpty();
         case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
            return requiredRoles_InterfaceRequiringEntity != null && !requiredRoles_InterfaceRequiringEntity.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == ResourceInterfaceRequiringEntity.class) {
         switch (derivedFeatureID) {
            case Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY: return Entity_pc_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == ResourceInterfaceRequiringEntity.class) {
         switch (baseFeatureID) {
            case Entity_pc_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY: return Entity_pc_avPackage.INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} //InterfaceRequiringEntityImpl
