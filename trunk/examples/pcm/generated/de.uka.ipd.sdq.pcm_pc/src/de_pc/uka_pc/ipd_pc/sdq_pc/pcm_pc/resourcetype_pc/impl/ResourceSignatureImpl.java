/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.impl.EntityImpl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Parameter;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.Repository_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.ResourceInterface;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.ResourceSignature;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.Resourcetype_pcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.impl.ResourceSignatureImpl#getParameter__ResourceSignature <em>Parameter Resource Signature</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.impl.ResourceSignatureImpl#getResourceServiceId <em>Resource Service Id</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.impl.ResourceSignatureImpl#getResourceInterface__ResourceSignature <em>Resource Interface Resource Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceSignatureImpl extends EntityImpl implements ResourceSignature {
   /**
    * The cached value of the '{@link #getParameter__ResourceSignature() <em>Parameter Resource Signature</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameter__ResourceSignature()
    * @generated
    * @ordered
    */
   protected Parameter parameter__ResourceSignature;

   /**
    * The default value of the '{@link #getResourceServiceId() <em>Resource Service Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceServiceId()
    * @generated
    * @ordered
    */
   protected static final int RESOURCE_SERVICE_ID_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getResourceServiceId() <em>Resource Service Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceServiceId()
    * @generated
    * @ordered
    */
   protected int resourceServiceId = RESOURCE_SERVICE_ID_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceSignatureImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourcetype_pcPackage.Literals.RESOURCE_SIGNATURE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter getParameter__ResourceSignature() {
      return parameter__ResourceSignature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParameter__ResourceSignature(Parameter newParameter__ResourceSignature, NotificationChain msgs) {
      Parameter oldParameter__ResourceSignature = parameter__ResourceSignature;
      parameter__ResourceSignature = newParameter__ResourceSignature;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Resourcetype_pcPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE, oldParameter__ResourceSignature, newParameter__ResourceSignature);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParameter__ResourceSignature(Parameter newParameter__ResourceSignature) {
      if (newParameter__ResourceSignature != parameter__ResourceSignature) {
         NotificationChain msgs = null;
         if (parameter__ResourceSignature != null)
            msgs = ((InternalEObject)parameter__ResourceSignature).eInverseRemove(this, Repository_pcPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER, Parameter.class, msgs);
         if (newParameter__ResourceSignature != null)
            msgs = ((InternalEObject)newParameter__ResourceSignature).eInverseAdd(this, Repository_pcPackage.PARAMETER__RESOURCE_SIGNATURE_PARAMETER, Parameter.class, msgs);
         msgs = basicSetParameter__ResourceSignature(newParameter__ResourceSignature, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourcetype_pcPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE, newParameter__ResourceSignature, newParameter__ResourceSignature));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getResourceServiceId() {
      return resourceServiceId;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceServiceId(int newResourceServiceId) {
      int oldResourceServiceId = resourceServiceId;
      resourceServiceId = newResourceServiceId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_SERVICE_ID, oldResourceServiceId, resourceServiceId));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterface getResourceInterface__ResourceSignature() {
      if (eContainerFeatureID() != Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE) return null;
      return (ResourceInterface)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceInterface__ResourceSignature(ResourceInterface newResourceInterface__ResourceSignature, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newResourceInterface__ResourceSignature, Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceInterface__ResourceSignature(ResourceInterface newResourceInterface__ResourceSignature) {
      if (newResourceInterface__ResourceSignature != eInternalContainer() || (eContainerFeatureID() != Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE && newResourceInterface__ResourceSignature != null)) {
         if (EcoreUtil.isAncestor(this, newResourceInterface__ResourceSignature))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newResourceInterface__ResourceSignature != null)
            msgs = ((InternalEObject)newResourceInterface__ResourceSignature).eInverseAdd(this, Resourcetype_pcPackage.RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE, ResourceInterface.class, msgs);
         msgs = basicSetResourceInterface__ResourceSignature(newResourceInterface__ResourceSignature, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE, newResourceInterface__ResourceSignature, newResourceInterface__ResourceSignature));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE:
            if (parameter__ResourceSignature != null)
               msgs = ((InternalEObject)parameter__ResourceSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Resourcetype_pcPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE, null, msgs);
            return basicSetParameter__ResourceSignature((Parameter)otherEnd, msgs);
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetResourceInterface__ResourceSignature((ResourceInterface)otherEnd, msgs);
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
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE:
            return basicSetParameter__ResourceSignature(null, msgs);
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE:
            return basicSetResourceInterface__ResourceSignature(null, msgs);
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
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE:
            return eInternalContainer().eInverseRemove(this, Resourcetype_pcPackage.RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE, ResourceInterface.class, msgs);
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
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE:
            return getParameter__ResourceSignature();
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_SERVICE_ID:
            return getResourceServiceId();
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE:
            return getResourceInterface__ResourceSignature();
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
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE:
            setParameter__ResourceSignature((Parameter)newValue);
            return;
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_SERVICE_ID:
            setResourceServiceId((Integer)newValue);
            return;
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE:
            setResourceInterface__ResourceSignature((ResourceInterface)newValue);
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
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE:
            setParameter__ResourceSignature((Parameter)null);
            return;
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_SERVICE_ID:
            setResourceServiceId(RESOURCE_SERVICE_ID_EDEFAULT);
            return;
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE:
            setResourceInterface__ResourceSignature((ResourceInterface)null);
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
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE:
            return parameter__ResourceSignature != null;
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_SERVICE_ID:
            return resourceServiceId != RESOURCE_SERVICE_ID_EDEFAULT;
         case Resourcetype_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE:
            return getResourceInterface__ResourceSignature() != null;
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
      result.append(" (resourceServiceId: ");
      result.append(resourceServiceId);
      result.append(')');
      return result.toString();
   }

} //ResourceSignatureImpl
