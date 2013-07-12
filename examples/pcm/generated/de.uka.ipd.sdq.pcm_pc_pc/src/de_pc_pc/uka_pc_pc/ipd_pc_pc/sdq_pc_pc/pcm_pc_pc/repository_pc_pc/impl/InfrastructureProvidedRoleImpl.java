/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureInterface;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureProvidedRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl.InfrastructureProvidedRoleImpl#getProvidedInterface__InfrastructureProvidedRole <em>Provided Interface Infrastructure Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureProvidedRoleImpl extends ProvidedRoleImpl implements InfrastructureProvidedRole {
   /**
    * The cached value of the '{@link #getProvidedInterface__InfrastructureProvidedRole() <em>Provided Interface Infrastructure Provided Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProvidedInterface__InfrastructureProvidedRole()
    * @generated
    * @ordered
    */
   protected InfrastructureInterface providedInterface__InfrastructureProvidedRole;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InfrastructureProvidedRoleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_pcPackage.Literals.INFRASTRUCTURE_PROVIDED_ROLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureInterface getProvidedInterface__InfrastructureProvidedRole() {
      if (providedInterface__InfrastructureProvidedRole != null && providedInterface__InfrastructureProvidedRole.eIsProxy()) {
         InternalEObject oldProvidedInterface__InfrastructureProvidedRole = (InternalEObject)providedInterface__InfrastructureProvidedRole;
         providedInterface__InfrastructureProvidedRole = (InfrastructureInterface)eResolveProxy(oldProvidedInterface__InfrastructureProvidedRole);
         if (providedInterface__InfrastructureProvidedRole != oldProvidedInterface__InfrastructureProvidedRole) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_pc_pcPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE, oldProvidedInterface__InfrastructureProvidedRole, providedInterface__InfrastructureProvidedRole));
         }
      }
      return providedInterface__InfrastructureProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureInterface basicGetProvidedInterface__InfrastructureProvidedRole() {
      return providedInterface__InfrastructureProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProvidedInterface__InfrastructureProvidedRole(InfrastructureInterface newProvidedInterface__InfrastructureProvidedRole) {
      InfrastructureInterface oldProvidedInterface__InfrastructureProvidedRole = providedInterface__InfrastructureProvidedRole;
      providedInterface__InfrastructureProvidedRole = newProvidedInterface__InfrastructureProvidedRole;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_pcPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE, oldProvidedInterface__InfrastructureProvidedRole, providedInterface__InfrastructureProvidedRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Repository_pc_pcPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE:
            if (resolve) return getProvidedInterface__InfrastructureProvidedRole();
            return basicGetProvidedInterface__InfrastructureProvidedRole();
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
         case Repository_pc_pcPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE:
            setProvidedInterface__InfrastructureProvidedRole((InfrastructureInterface)newValue);
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
         case Repository_pc_pcPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE:
            setProvidedInterface__InfrastructureProvidedRole((InfrastructureInterface)null);
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
         case Repository_pc_pcPackage.INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE:
            return providedInterface__InfrastructureProvidedRole != null;
      }
      return super.eIsSet(featureID);
   }

} //InfrastructureProvidedRoleImpl
