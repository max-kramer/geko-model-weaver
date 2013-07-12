/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Power;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.PowerExpression;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Unary;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.impl.PowerExpressionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.impl.PowerExpressionImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerExpressionImpl extends PowerImpl implements PowerExpression {
   /**
    * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBase()
    * @generated
    * @ordered
    */
   protected Power base;

   /**
    * The cached value of the '{@link #getExponent() <em>Exponent</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExponent()
    * @generated
    * @ordered
    */
   protected Unary exponent;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PowerExpressionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Stoex_av_pcPackage.Literals.POWER_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Power getBase() {
      return base;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBase(Power newBase, NotificationChain msgs) {
      Power oldBase = base;
      base = newBase;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Stoex_av_pcPackage.POWER_EXPRESSION__BASE, oldBase, newBase);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBase(Power newBase) {
      if (newBase != base) {
         NotificationChain msgs = null;
         if (base != null)
            msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Stoex_av_pcPackage.POWER_EXPRESSION__BASE, null, msgs);
         if (newBase != null)
            msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Stoex_av_pcPackage.POWER_EXPRESSION__BASE, null, msgs);
         msgs = basicSetBase(newBase, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_av_pcPackage.POWER_EXPRESSION__BASE, newBase, newBase));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Unary getExponent() {
      return exponent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetExponent(Unary newExponent, NotificationChain msgs) {
      Unary oldExponent = exponent;
      exponent = newExponent;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Stoex_av_pcPackage.POWER_EXPRESSION__EXPONENT, oldExponent, newExponent);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setExponent(Unary newExponent) {
      if (newExponent != exponent) {
         NotificationChain msgs = null;
         if (exponent != null)
            msgs = ((InternalEObject)exponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Stoex_av_pcPackage.POWER_EXPRESSION__EXPONENT, null, msgs);
         if (newExponent != null)
            msgs = ((InternalEObject)newExponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Stoex_av_pcPackage.POWER_EXPRESSION__EXPONENT, null, msgs);
         msgs = basicSetExponent(newExponent, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_av_pcPackage.POWER_EXPRESSION__EXPONENT, newExponent, newExponent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Stoex_av_pcPackage.POWER_EXPRESSION__BASE:
            return basicSetBase(null, msgs);
         case Stoex_av_pcPackage.POWER_EXPRESSION__EXPONENT:
            return basicSetExponent(null, msgs);
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
         case Stoex_av_pcPackage.POWER_EXPRESSION__BASE:
            return getBase();
         case Stoex_av_pcPackage.POWER_EXPRESSION__EXPONENT:
            return getExponent();
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
         case Stoex_av_pcPackage.POWER_EXPRESSION__BASE:
            setBase((Power)newValue);
            return;
         case Stoex_av_pcPackage.POWER_EXPRESSION__EXPONENT:
            setExponent((Unary)newValue);
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
         case Stoex_av_pcPackage.POWER_EXPRESSION__BASE:
            setBase((Power)null);
            return;
         case Stoex_av_pcPackage.POWER_EXPRESSION__EXPONENT:
            setExponent((Unary)null);
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
         case Stoex_av_pcPackage.POWER_EXPRESSION__BASE:
            return base != null;
         case Stoex_av_pcPackage.POWER_EXPRESSION__EXPONENT:
            return exponent != null;
      }
      return super.eIsSet(featureID);
   }

} //PowerExpressionImpl
