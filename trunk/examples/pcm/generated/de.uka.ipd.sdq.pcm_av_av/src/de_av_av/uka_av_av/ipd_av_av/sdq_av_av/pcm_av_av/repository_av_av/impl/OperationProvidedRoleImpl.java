/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.OperationInterface;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.OperationProvidedRole;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.Repository_av_avPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl.OperationProvidedRoleImpl#getProvidedInterface__OperationProvidedRole <em>Provided Interface Operation Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationProvidedRoleImpl extends ProvidedRoleImpl implements OperationProvidedRole {
   /**
    * The cached value of the '{@link #getProvidedInterface__OperationProvidedRole() <em>Provided Interface Operation Provided Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProvidedInterface__OperationProvidedRole()
    * @generated
    * @ordered
    */
   protected OperationInterface providedInterface__OperationProvidedRole;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected OperationProvidedRoleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_av_avPackage.Literals.OPERATION_PROVIDED_ROLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationInterface getProvidedInterface__OperationProvidedRole() {
      if (providedInterface__OperationProvidedRole != null && providedInterface__OperationProvidedRole.eIsProxy()) {
         InternalEObject oldProvidedInterface__OperationProvidedRole = (InternalEObject)providedInterface__OperationProvidedRole;
         providedInterface__OperationProvidedRole = (OperationInterface)eResolveProxy(oldProvidedInterface__OperationProvidedRole);
         if (providedInterface__OperationProvidedRole != oldProvidedInterface__OperationProvidedRole) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Repository_av_avPackage.OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE, oldProvidedInterface__OperationProvidedRole, providedInterface__OperationProvidedRole));
         }
      }
      return providedInterface__OperationProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationInterface basicGetProvidedInterface__OperationProvidedRole() {
      return providedInterface__OperationProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProvidedInterface__OperationProvidedRole(OperationInterface newProvidedInterface__OperationProvidedRole) {
      OperationInterface oldProvidedInterface__OperationProvidedRole = providedInterface__OperationProvidedRole;
      providedInterface__OperationProvidedRole = newProvidedInterface__OperationProvidedRole;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_av_avPackage.OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE, oldProvidedInterface__OperationProvidedRole, providedInterface__OperationProvidedRole));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Repository_av_avPackage.OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE:
            if (resolve) return getProvidedInterface__OperationProvidedRole();
            return basicGetProvidedInterface__OperationProvidedRole();
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
         case Repository_av_avPackage.OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE:
            setProvidedInterface__OperationProvidedRole((OperationInterface)newValue);
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
         case Repository_av_avPackage.OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE:
            setProvidedInterface__OperationProvidedRole((OperationInterface)null);
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
         case Repository_av_avPackage.OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE:
            return providedInterface__OperationProvidedRole != null;
      }
      return super.eIsSet(featureID);
   }

} //OperationProvidedRoleImpl
