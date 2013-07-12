/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.GlobalScope;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.Units_av_pcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.units_av_pc.impl.GlobalScopeImpl#getScopedObject <em>Scoped Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalScopeImpl extends EObjectImpl implements GlobalScope {
   /**
    * The cached value of the '{@link #getScopedObject() <em>Scoped Object</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getScopedObject()
    * @generated
    * @ordered
    */
   protected EObject scopedObject;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected GlobalScopeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Units_av_pcPackage.Literals.GLOBAL_SCOPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject getScopedObject() {
      if (scopedObject != null && scopedObject.eIsProxy()) {
         InternalEObject oldScopedObject = (InternalEObject)scopedObject;
         scopedObject = eResolveProxy(oldScopedObject);
         if (scopedObject != oldScopedObject) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Units_av_pcPackage.GLOBAL_SCOPE__SCOPED_OBJECT, oldScopedObject, scopedObject));
         }
      }
      return scopedObject;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject basicGetScopedObject() {
      return scopedObject;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setScopedObject(EObject newScopedObject) {
      EObject oldScopedObject = scopedObject;
      scopedObject = newScopedObject;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Units_av_pcPackage.GLOBAL_SCOPE__SCOPED_OBJECT, oldScopedObject, scopedObject));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Units_av_pcPackage.GLOBAL_SCOPE__SCOPED_OBJECT:
            if (resolve) return getScopedObject();
            return basicGetScopedObject();
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
         case Units_av_pcPackage.GLOBAL_SCOPE__SCOPED_OBJECT:
            setScopedObject((EObject)newValue);
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
         case Units_av_pcPackage.GLOBAL_SCOPE__SCOPED_OBJECT:
            setScopedObject((EObject)null);
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
         case Units_av_pcPackage.GLOBAL_SCOPE__SCOPED_OBJECT:
            return scopedObject != null;
      }
      return super.eIsSet(featureID);
   }

} //GlobalScopeImpl
