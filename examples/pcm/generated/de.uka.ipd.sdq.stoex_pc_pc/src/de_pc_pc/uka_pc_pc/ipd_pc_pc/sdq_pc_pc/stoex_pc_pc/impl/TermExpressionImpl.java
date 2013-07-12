/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Product;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Stoex_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Term;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermExpression;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.TermOperations;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.impl.TermExpressionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermExpressionImpl extends TermImpl implements TermExpression {
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
   protected Product right;

   /**
    * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperation()
    * @generated
    * @ordered
    */
   protected static final TermOperations OPERATION_EDEFAULT = TermOperations.ADD;

   /**
    * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOperation()
    * @generated
    * @ordered
    */
   protected TermOperations operation = OPERATION_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected TermExpressionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Stoex_pc_pcPackage.Literals.TERM_EXPRESSION;
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
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.TERM_EXPRESSION__LEFT, oldLeft, newLeft);
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
            msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Stoex_pc_pcPackage.TERM_EXPRESSION__LEFT, null, msgs);
         if (newLeft != null)
            msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Stoex_pc_pcPackage.TERM_EXPRESSION__LEFT, null, msgs);
         msgs = basicSetLeft(newLeft, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.TERM_EXPRESSION__LEFT, newLeft, newLeft));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Product getRight() {
      return right;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRight(Product newRight, NotificationChain msgs) {
      Product oldRight = right;
      right = newRight;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.TERM_EXPRESSION__RIGHT, oldRight, newRight);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRight(Product newRight) {
      if (newRight != right) {
         NotificationChain msgs = null;
         if (right != null)
            msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Stoex_pc_pcPackage.TERM_EXPRESSION__RIGHT, null, msgs);
         if (newRight != null)
            msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Stoex_pc_pcPackage.TERM_EXPRESSION__RIGHT, null, msgs);
         msgs = basicSetRight(newRight, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.TERM_EXPRESSION__RIGHT, newRight, newRight));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TermOperations getOperation() {
      return operation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOperation(TermOperations newOperation) {
      TermOperations oldOperation = operation;
      operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_pc_pcPackage.TERM_EXPRESSION__OPERATION, oldOperation, operation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Stoex_pc_pcPackage.TERM_EXPRESSION__LEFT:
            return basicSetLeft(null, msgs);
         case Stoex_pc_pcPackage.TERM_EXPRESSION__RIGHT:
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
         case Stoex_pc_pcPackage.TERM_EXPRESSION__LEFT:
            return getLeft();
         case Stoex_pc_pcPackage.TERM_EXPRESSION__RIGHT:
            return getRight();
         case Stoex_pc_pcPackage.TERM_EXPRESSION__OPERATION:
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
         case Stoex_pc_pcPackage.TERM_EXPRESSION__LEFT:
            setLeft((Term)newValue);
            return;
         case Stoex_pc_pcPackage.TERM_EXPRESSION__RIGHT:
            setRight((Product)newValue);
            return;
         case Stoex_pc_pcPackage.TERM_EXPRESSION__OPERATION:
            setOperation((TermOperations)newValue);
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
         case Stoex_pc_pcPackage.TERM_EXPRESSION__LEFT:
            setLeft((Term)null);
            return;
         case Stoex_pc_pcPackage.TERM_EXPRESSION__RIGHT:
            setRight((Product)null);
            return;
         case Stoex_pc_pcPackage.TERM_EXPRESSION__OPERATION:
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
         case Stoex_pc_pcPackage.TERM_EXPRESSION__LEFT:
            return left != null;
         case Stoex_pc_pcPackage.TERM_EXPRESSION__RIGHT:
            return right != null;
         case Stoex_pc_pcPackage.TERM_EXPRESSION__OPERATION:
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

} //TermExpressionImpl
