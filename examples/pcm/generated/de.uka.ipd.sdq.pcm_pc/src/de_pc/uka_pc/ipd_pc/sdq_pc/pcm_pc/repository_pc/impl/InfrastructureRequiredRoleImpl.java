/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.InfrastructureInterface;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.InfrastructureRequiredRole;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Required Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.impl.InfrastructureRequiredRoleImpl#getRequiredInterface__InfrastructureRequiredRole <em>Required Interface Infrastructure Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureRequiredRoleImpl extends RequiredRoleImpl implements InfrastructureRequiredRole {
   /**
    * The cached value of the '{@link #getRequiredInterface__InfrastructureRequiredRole() <em>Required Interface Infrastructure Required Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredInterface__InfrastructureRequiredRole()
    * @generated
    * @ordered
    */
   protected InfrastructureInterface requiredInterface__InfrastructureRequiredRole;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InfrastructureRequiredRoleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pcPackage.Literals.INFRASTRUCTURE_REQUIRED_ROLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureInterface getRequiredInterface__InfrastructureRequiredRole() {
      if (requiredInterface__InfrastructureRequiredRole != null && requiredInterface__InfrastructureRequiredRole.eIsProxy()) {
         InternalEObject oldRequiredInterface__InfrastructureRequiredRole = (InternalEObject)requiredInterface__InfrastructureRequiredRole;
         requiredInterface__InfrastructureRequiredRole = (InfrastructureInterface)eResolveProxy(oldRequiredInterface__InfrastructureRequiredRole);
         if (requiredInterface__InfrastructureRequiredRole != oldRequiredInterface__InfrastructureRequiredRole) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_pcPackage.INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE, oldRequiredInterface__InfrastructureRequiredRole, requiredInterface__InfrastructureRequiredRole));
         }
      }
      return requiredInterface__InfrastructureRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureInterface basicGetRequiredInterface__InfrastructureRequiredRole() {
      return requiredInterface__InfrastructureRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiredInterface__InfrastructureRequiredRole(InfrastructureInterface newRequiredInterface__InfrastructureRequiredRole) {
      InfrastructureInterface oldRequiredInterface__InfrastructureRequiredRole = requiredInterface__InfrastructureRequiredRole;
      requiredInterface__InfrastructureRequiredRole = newRequiredInterface__InfrastructureRequiredRole;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pcPackage.INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE, oldRequiredInterface__InfrastructureRequiredRole, requiredInterface__InfrastructureRequiredRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Repository_pcPackage.INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE:
            if (resolve) return getRequiredInterface__InfrastructureRequiredRole();
            return basicGetRequiredInterface__InfrastructureRequiredRole();
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
         case Repository_pcPackage.INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE:
            setRequiredInterface__InfrastructureRequiredRole((InfrastructureInterface)newValue);
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
         case Repository_pcPackage.INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE:
            setRequiredInterface__InfrastructureRequiredRole((InfrastructureInterface)null);
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
         case Repository_pcPackage.INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE:
            return requiredInterface__InfrastructureRequiredRole != null;
      }
      return super.eIsSet(featureID);
   }

} //InfrastructureRequiredRoleImpl
