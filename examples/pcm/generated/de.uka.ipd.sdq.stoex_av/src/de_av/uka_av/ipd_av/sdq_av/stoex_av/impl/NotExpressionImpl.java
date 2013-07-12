/**
 */
package de_av.uka_av.ipd_av.sdq_av.stoex_av.impl;

import de_av.uka_av.ipd_av.sdq_av.stoex_av.NotExpression;
import de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage;
import de_av.uka_av.ipd_av.sdq_av.stoex_av.Unary;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.impl.NotExpressionImpl#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotExpressionImpl extends UnaryImpl implements NotExpression {
   /**
    * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInner()
    * @generated
    * @ordered
    */
   protected Unary inner;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NotExpressionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Stoex_avPackage.Literals.NOT_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Unary getInner() {
      return inner;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInner(Unary newInner, NotificationChain msgs) {
      Unary oldInner = inner;
      inner = newInner;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Stoex_avPackage.NOT_EXPRESSION__INNER, oldInner, newInner);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInner(Unary newInner) {
      if (newInner != inner) {
         NotificationChain msgs = null;
         if (inner != null)
            msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Stoex_avPackage.NOT_EXPRESSION__INNER, null, msgs);
         if (newInner != null)
            msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Stoex_avPackage.NOT_EXPRESSION__INNER, null, msgs);
         msgs = basicSetInner(newInner, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_avPackage.NOT_EXPRESSION__INNER, newInner, newInner));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Stoex_avPackage.NOT_EXPRESSION__INNER:
            return basicSetInner(null, msgs);
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
         case Stoex_avPackage.NOT_EXPRESSION__INNER:
            return getInner();
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
         case Stoex_avPackage.NOT_EXPRESSION__INNER:
            setInner((Unary)newValue);
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
         case Stoex_avPackage.NOT_EXPRESSION__INNER:
            setInner((Unary)null);
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
         case Stoex_avPackage.NOT_EXPRESSION__INNER:
            return inner != null;
      }
      return super.eIsSet(featureID);
   }

} //NotExpressionImpl
