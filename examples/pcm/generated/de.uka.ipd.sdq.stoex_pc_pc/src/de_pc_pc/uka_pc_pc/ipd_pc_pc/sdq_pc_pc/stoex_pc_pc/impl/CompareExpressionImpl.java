/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareExpression;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.CompareOperations;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Stoex_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.CompareExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.CompareExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.CompareExpressionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareExpressionImpl extends ComparisonImpl implements CompareExpression {
   /**
    * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLeft()
    * @generated
    * @ordered
    */
   protected Term left;

   /**
    * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRight()
    * @generated
    * @ordered
    */
   protected Term right;

   /**
    * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperation()
    * @generated
    * @ordered
    */
   protected static final CompareOperations OPERATION_EDEFAULT = CompareOperations.GREATER;

   /**
    * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperation()
    * @generated
    * @ordered
    */
   protected CompareOperations operation = OPERATION_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CompareExpressionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Stoex_pc_pcPackage.Literals.COMPARE_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Term getLeft() {
      return left;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetLeft(Term newLeft, NotificationChain msgs) {
      Term oldLeft = left;
      left = newLeft;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.COMPARE_EXPRESSION__LEFT, oldLeft, newLeft);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLeft(Term newLeft) {
      if (newLeft != left) {
         NotificationChain msgs = null;
         if (left != null)
            msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Stoex_pc_pcPackage.COMPARE_EXPRESSION__LEFT, null, msgs);
         if (newLeft != null)
            msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Stoex_pc_pcPackage.COMPARE_EXPRESSION__LEFT, null, msgs);
         msgs = basicSetLeft(newLeft, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.COMPARE_EXPRESSION__LEFT, newLeft, newLeft));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Term getRight() {
      return right;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRight(Term newRight, NotificationChain msgs) {
      Term oldRight = right;
      right = newRight;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.COMPARE_EXPRESSION__RIGHT, oldRight, newRight);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRight(Term newRight) {
      if (newRight != right) {
         NotificationChain msgs = null;
         if (right != null)
            msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Stoex_pc_pcPackage.COMPARE_EXPRESSION__RIGHT, null, msgs);
         if (newRight != null)
            msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Stoex_pc_pcPackage.COMPARE_EXPRESSION__RIGHT, null, msgs);
         msgs = basicSetRight(newRight, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.COMPARE_EXPRESSION__RIGHT, newRight, newRight));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompareOperations getOperation() {
      return operation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOperation(CompareOperations newOperation) {
      CompareOperations oldOperation = operation;
      operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.COMPARE_EXPRESSION__OPERATION, oldOperation, operation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__LEFT:
            return basicSetLeft(null, msgs);
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__RIGHT:
            return basicSetRight(null, msgs);
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
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__LEFT:
            return getLeft();
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__RIGHT:
            return getRight();
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__OPERATION:
            return getOperation();
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
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__LEFT:
            setLeft((Term)newValue);
            return;
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__RIGHT:
            setRight((Term)newValue);
            return;
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__OPERATION:
            setOperation((CompareOperations)newValue);
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
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__LEFT:
            setLeft((Term)null);
            return;
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__RIGHT:
            setRight((Term)null);
            return;
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__OPERATION:
            setOperation(OPERATION_EDEFAULT);
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
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__LEFT:
            return left != null;
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__RIGHT:
            return right != null;
         case Stoex_pc_pcPackage.COMPARE_EXPRESSION__OPERATION:
            return operation != OPERATION_EDEFAULT;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (operation: ");
      result.append(operation);
      result.append(')');
      return result.toString();
   }

} //CompareExpressionImpl
