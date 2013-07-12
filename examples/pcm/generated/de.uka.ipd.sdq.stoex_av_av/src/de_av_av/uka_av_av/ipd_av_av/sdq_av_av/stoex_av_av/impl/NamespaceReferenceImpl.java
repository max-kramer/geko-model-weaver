/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.AbstractNamedReference;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.NamespaceReference;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.Stoex_av_avPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.stoex_av_av.impl.NamespaceReferenceImpl#getInnerReference_NamespaceReference <em>Inner Reference Namespace Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceReferenceImpl extends AbstractNamedReferenceImpl implements NamespaceReference {
   /**
    * The cached value of the '{@link #getInnerReference_NamespaceReference() <em>Inner Reference Namespace Reference</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInnerReference_NamespaceReference()
    * @generated
    * @ordered
    */
   protected AbstractNamedReference innerReference_NamespaceReference;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NamespaceReferenceImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Stoex_av_avPackage.Literals.NAMESPACE_REFERENCE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractNamedReference getInnerReference_NamespaceReference() {
      return innerReference_NamespaceReference;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInnerReference_NamespaceReference(AbstractNamedReference newInnerReference_NamespaceReference, NotificationChain msgs) {
      AbstractNamedReference oldInnerReference_NamespaceReference = innerReference_NamespaceReference;
      innerReference_NamespaceReference = newInnerReference_NamespaceReference;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Stoex_av_avPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE, oldInnerReference_NamespaceReference, newInnerReference_NamespaceReference);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInnerReference_NamespaceReference(AbstractNamedReference newInnerReference_NamespaceReference) {
      if (newInnerReference_NamespaceReference != innerReference_NamespaceReference) {
         NotificationChain msgs = null;
         if (innerReference_NamespaceReference != null)
            msgs = ((InternalEObject)innerReference_NamespaceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Stoex_av_avPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE, null, msgs);
         if (newInnerReference_NamespaceReference != null)
            msgs = ((InternalEObject)newInnerReference_NamespaceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Stoex_av_avPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE, null, msgs);
         msgs = basicSetInnerReference_NamespaceReference(newInnerReference_NamespaceReference, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Stoex_av_avPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE, newInnerReference_NamespaceReference, newInnerReference_NamespaceReference));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Stoex_av_avPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            return basicSetInnerReference_NamespaceReference(null, msgs);
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
         case Stoex_av_avPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            return getInnerReference_NamespaceReference();
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
         case Stoex_av_avPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            setInnerReference_NamespaceReference((AbstractNamedReference)newValue);
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
         case Stoex_av_avPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            setInnerReference_NamespaceReference((AbstractNamedReference)null);
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
         case Stoex_av_avPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            return innerReference_NamespaceReference != null;
      }
      return super.eIsSet(featureID);
   }

} //NamespaceReferenceImpl
