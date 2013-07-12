/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.QoSAnnotations;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.SpecifiedQoSAnnotation;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Role;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Signature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specified Qo SAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.impl.SpecifiedQoSAnnotationImpl#getSignature_SpecifiedQoSAnnation <em>Signature Specified Qo SAnnation</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.impl.SpecifiedQoSAnnotationImpl#getRole_SpecifiedQoSAnnotation <em>Role Specified Qo SAnnotation</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.impl.SpecifiedQoSAnnotationImpl#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecifiedQoSAnnotationImpl extends EObjectImpl implements SpecifiedQoSAnnotation {
   /**
    * The cached value of the '{@link #getSignature_SpecifiedQoSAnnation() <em>Signature Specified Qo SAnnation</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSignature_SpecifiedQoSAnnation()
    * @generated
    * @ordered
    */
   protected Signature signature_SpecifiedQoSAnnation;

   /**
    * The cached value of the '{@link #getRole_SpecifiedQoSAnnotation() <em>Role Specified Qo SAnnotation</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRole_SpecifiedQoSAnnotation()
    * @generated
    * @ordered
    */
   protected Role role_SpecifiedQoSAnnotation;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SpecifiedQoSAnnotationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Qosannotations_avPackage.Literals.SPECIFIED_QO_SANNOTATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Signature getSignature_SpecifiedQoSAnnation() {
      if (signature_SpecifiedQoSAnnation != null && signature_SpecifiedQoSAnnation.eIsProxy()) {
         InternalEObject oldSignature_SpecifiedQoSAnnation = (InternalEObject)signature_SpecifiedQoSAnnation;
         signature_SpecifiedQoSAnnation = (Signature)eResolveProxy(oldSignature_SpecifiedQoSAnnation);
         if (signature_SpecifiedQoSAnnation != oldSignature_SpecifiedQoSAnnation) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION, oldSignature_SpecifiedQoSAnnation, signature_SpecifiedQoSAnnation));
         }
      }
      return signature_SpecifiedQoSAnnation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Signature basicGetSignature_SpecifiedQoSAnnation() {
      return signature_SpecifiedQoSAnnation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSignature_SpecifiedQoSAnnation(Signature newSignature_SpecifiedQoSAnnation) {
      Signature oldSignature_SpecifiedQoSAnnation = signature_SpecifiedQoSAnnation;
      signature_SpecifiedQoSAnnation = newSignature_SpecifiedQoSAnnation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION, oldSignature_SpecifiedQoSAnnation, signature_SpecifiedQoSAnnation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Role getRole_SpecifiedQoSAnnotation() {
      if (role_SpecifiedQoSAnnotation != null && role_SpecifiedQoSAnnotation.eIsProxy()) {
         InternalEObject oldRole_SpecifiedQoSAnnotation = (InternalEObject)role_SpecifiedQoSAnnotation;
         role_SpecifiedQoSAnnotation = (Role)eResolveProxy(oldRole_SpecifiedQoSAnnotation);
         if (role_SpecifiedQoSAnnotation != oldRole_SpecifiedQoSAnnotation) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION, oldRole_SpecifiedQoSAnnotation, role_SpecifiedQoSAnnotation));
         }
      }
      return role_SpecifiedQoSAnnotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Role basicGetRole_SpecifiedQoSAnnotation() {
      return role_SpecifiedQoSAnnotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRole_SpecifiedQoSAnnotation(Role newRole_SpecifiedQoSAnnotation) {
      Role oldRole_SpecifiedQoSAnnotation = role_SpecifiedQoSAnnotation;
      role_SpecifiedQoSAnnotation = newRole_SpecifiedQoSAnnotation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION, oldRole_SpecifiedQoSAnnotation, role_SpecifiedQoSAnnotation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public QoSAnnotations getQosAnnotations_SpecifiedQoSAnnotation() {
      if (eContainerFeatureID() != Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION) return null;
      return (QoSAnnotations)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetQosAnnotations_SpecifiedQoSAnnotation(QoSAnnotations newQosAnnotations_SpecifiedQoSAnnotation, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newQosAnnotations_SpecifiedQoSAnnotation, Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setQosAnnotations_SpecifiedQoSAnnotation(QoSAnnotations newQosAnnotations_SpecifiedQoSAnnotation) {
      if (newQosAnnotations_SpecifiedQoSAnnotation != eInternalContainer() || (eContainerFeatureID() != Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION && newQosAnnotations_SpecifiedQoSAnnotation != null)) {
         if (EcoreUtil.isAncestor(this, newQosAnnotations_SpecifiedQoSAnnotation))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newQosAnnotations_SpecifiedQoSAnnotation != null)
            msgs = ((InternalEObject)newQosAnnotations_SpecifiedQoSAnnotation).eInverseAdd(this, Qosannotations_avPackage.QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS, QoSAnnotations.class, msgs);
         msgs = basicSetQosAnnotations_SpecifiedQoSAnnotation(newQosAnnotations_SpecifiedQoSAnnotation, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION, newQosAnnotations_SpecifiedQoSAnnotation, newQosAnnotations_SpecifiedQoSAnnotation));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetQosAnnotations_SpecifiedQoSAnnotation((QoSAnnotations)otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION:
            return basicSetQosAnnotations_SpecifiedQoSAnnotation(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
      switch (eContainerFeatureID()) {
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION:
            return eInternalContainer().eInverseRemove(this, Qosannotations_avPackage.QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS, QoSAnnotations.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION:
            if (resolve) return getSignature_SpecifiedQoSAnnation();
            return basicGetSignature_SpecifiedQoSAnnation();
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION:
            if (resolve) return getRole_SpecifiedQoSAnnotation();
            return basicGetRole_SpecifiedQoSAnnotation();
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION:
            return getQosAnnotations_SpecifiedQoSAnnotation();
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
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION:
            setSignature_SpecifiedQoSAnnation((Signature)newValue);
            return;
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION:
            setRole_SpecifiedQoSAnnotation((Role)newValue);
            return;
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION:
            setQosAnnotations_SpecifiedQoSAnnotation((QoSAnnotations)newValue);
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
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION:
            setSignature_SpecifiedQoSAnnation((Signature)null);
            return;
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION:
            setRole_SpecifiedQoSAnnotation((Role)null);
            return;
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION:
            setQosAnnotations_SpecifiedQoSAnnotation((QoSAnnotations)null);
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
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION:
            return signature_SpecifiedQoSAnnation != null;
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION:
            return role_SpecifiedQoSAnnotation != null;
         case Qosannotations_avPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION:
            return getQosAnnotations_SpecifiedQoSAnnotation() != null;
      }
      return super.eIsSet(featureID);
   }

} //SpecifiedQoSAnnotationImpl
