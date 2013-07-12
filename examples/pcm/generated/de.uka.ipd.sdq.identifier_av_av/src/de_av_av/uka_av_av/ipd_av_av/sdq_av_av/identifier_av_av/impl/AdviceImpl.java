/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Advice;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier_av_avPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.impl.AdviceImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdviceImpl extends EObjectImpl implements Advice {
   /**
    * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getChildren()
    * @generated
    * @ordered
    */
   protected EList<EObject> children;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AdviceImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Identifier_av_avPackage.Literals.ADVICE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<EObject> getChildren() {
      if (children == null) {
         children = new EObjectContainmentEList<EObject>(EObject.class, this, Identifier_av_avPackage.ADVICE__CHILDREN);
      }
      return children;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Identifier_av_avPackage.ADVICE__CHILDREN:
            return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
         case Identifier_av_avPackage.ADVICE__CHILDREN:
            return getChildren();
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
         case Identifier_av_avPackage.ADVICE__CHILDREN:
            getChildren().clear();
            getChildren().addAll((Collection<? extends EObject>)newValue);
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
         case Identifier_av_avPackage.ADVICE__CHILDREN:
            getChildren().clear();
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
         case Identifier_av_avPackage.ADVICE__CHILDREN:
            return children != null && !children.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //AdviceImpl
