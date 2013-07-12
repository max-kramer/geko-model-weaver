/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.OperationInterface;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.OperationRequiredRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Required Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl.OperationRequiredRoleImpl#getRequiredInterface__OperationRequiredRole <em>Required Interface Operation Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationRequiredRoleImpl extends RequiredRoleImpl implements OperationRequiredRole {
   /**
    * The cached value of the '{@link #getRequiredInterface__OperationRequiredRole() <em>Required Interface Operation Required Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredInterface__OperationRequiredRole()
    * @generated
    * @ordered
    */
   protected OperationInterface requiredInterface__OperationRequiredRole;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected OperationRequiredRoleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_pcPackage.Literals.OPERATION_REQUIRED_ROLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationInterface getRequiredInterface__OperationRequiredRole() {
      if (requiredInterface__OperationRequiredRole != null && requiredInterface__OperationRequiredRole.eIsProxy()) {
         InternalEObject oldRequiredInterface__OperationRequiredRole = (InternalEObject)requiredInterface__OperationRequiredRole;
         requiredInterface__OperationRequiredRole = (OperationInterface)eResolveProxy(oldRequiredInterface__OperationRequiredRole);
         if (requiredInterface__OperationRequiredRole != oldRequiredInterface__OperationRequiredRole) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_pc_pcPackage.OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE, oldRequiredInterface__OperationRequiredRole, requiredInterface__OperationRequiredRole));
         }
      }
      return requiredInterface__OperationRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationInterface basicGetRequiredInterface__OperationRequiredRole() {
      return requiredInterface__OperationRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiredInterface__OperationRequiredRole(OperationInterface newRequiredInterface__OperationRequiredRole) {
      OperationInterface oldRequiredInterface__OperationRequiredRole = requiredInterface__OperationRequiredRole;
      requiredInterface__OperationRequiredRole = newRequiredInterface__OperationRequiredRole;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_pcPackage.OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE, oldRequiredInterface__OperationRequiredRole, requiredInterface__OperationRequiredRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Repository_pc_pcPackage.OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE:
            if (resolve) return getRequiredInterface__OperationRequiredRole();
            return basicGetRequiredInterface__OperationRequiredRole();
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
         case Repository_pc_pcPackage.OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE:
            setRequiredInterface__OperationRequiredRole((OperationInterface)newValue);
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
         case Repository_pc_pcPackage.OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE:
            setRequiredInterface__OperationRequiredRole((OperationInterface)null);
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
         case Repository_pc_pcPackage.OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE:
            return requiredInterface__OperationRequiredRole != null;
      }
      return super.eIsSet(featureID);
   }

} //OperationRequiredRoleImpl
