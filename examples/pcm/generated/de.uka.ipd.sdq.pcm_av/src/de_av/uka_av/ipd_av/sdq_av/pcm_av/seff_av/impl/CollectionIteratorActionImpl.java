/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Parameter;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.CollectionIteratorAction;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Iterator Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.impl.CollectionIteratorActionImpl#getParameter_CollectionIteratorAction <em>Parameter Collection Iterator Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionIteratorActionImpl extends AbstractLoopActionImpl implements CollectionIteratorAction {
   /**
    * The cached value of the '{@link #getParameter_CollectionIteratorAction() <em>Parameter Collection Iterator Action</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameter_CollectionIteratorAction()
    * @generated
    * @ordered
    */
   protected Parameter parameter_CollectionIteratorAction;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CollectionIteratorActionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_avPackage.Literals.COLLECTION_ITERATOR_ACTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter getParameter_CollectionIteratorAction() {
      if (parameter_CollectionIteratorAction != null && parameter_CollectionIteratorAction.eIsProxy()) {
         InternalEObject oldParameter_CollectionIteratorAction = (InternalEObject)parameter_CollectionIteratorAction;
         parameter_CollectionIteratorAction = (Parameter)eResolveProxy(oldParameter_CollectionIteratorAction);
         if (parameter_CollectionIteratorAction != oldParameter_CollectionIteratorAction) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_avPackage.COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION, oldParameter_CollectionIteratorAction, parameter_CollectionIteratorAction));
         }
      }
      return parameter_CollectionIteratorAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter basicGetParameter_CollectionIteratorAction() {
      return parameter_CollectionIteratorAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParameter_CollectionIteratorAction(Parameter newParameter_CollectionIteratorAction) {
      Parameter oldParameter_CollectionIteratorAction = parameter_CollectionIteratorAction;
      parameter_CollectionIteratorAction = newParameter_CollectionIteratorAction;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_avPackage.COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION, oldParameter_CollectionIteratorAction, parameter_CollectionIteratorAction));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Seff_avPackage.COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION:
            if (resolve) return getParameter_CollectionIteratorAction();
            return basicGetParameter_CollectionIteratorAction();
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
         case Seff_avPackage.COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION:
            setParameter_CollectionIteratorAction((Parameter)newValue);
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
         case Seff_avPackage.COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION:
            setParameter_CollectionIteratorAction((Parameter)null);
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
         case Seff_avPackage.COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION:
            return parameter_CollectionIteratorAction != null;
      }
      return super.eIsSet(featureID);
   }

} //CollectionIteratorActionImpl
