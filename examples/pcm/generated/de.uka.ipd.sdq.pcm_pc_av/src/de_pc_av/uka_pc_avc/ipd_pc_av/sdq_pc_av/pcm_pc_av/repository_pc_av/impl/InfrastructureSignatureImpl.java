/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureInterface;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.InfrastructureSignature;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Parameter;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureSignatureImpl#getParameters__InfrastructureSignature <em>Parameters Infrastructure Signature</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.InfrastructureSignatureImpl#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureSignatureImpl extends SignatureImpl implements InfrastructureSignature {
   /**
    * The cached value of the '{@link #getParameters__InfrastructureSignature() <em>Parameters Infrastructure Signature</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParameters__InfrastructureSignature()
    * @generated
    * @ordered
    */
   protected EList<Parameter> parameters__InfrastructureSignature;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InfrastructureSignatureImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_avPackage.Literals.INFRASTRUCTURE_SIGNATURE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Parameter> getParameters__InfrastructureSignature() {
      if (parameters__InfrastructureSignature == null) {
         parameters__InfrastructureSignature = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE, Repository_pc_avPackage.PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER);
      }
      return parameters__InfrastructureSignature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureInterface getInfrastructureInterface__InfrastructureSignature() {
      if (eContainerFeatureID() != Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE) return null;
      return (InfrastructureInterface)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInfrastructureInterface__InfrastructureSignature(InfrastructureInterface newInfrastructureInterface__InfrastructureSignature, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newInfrastructureInterface__InfrastructureSignature, Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInfrastructureInterface__InfrastructureSignature(InfrastructureInterface newInfrastructureInterface__InfrastructureSignature) {
      if (newInfrastructureInterface__InfrastructureSignature != eInternalContainer() || (eContainerFeatureID() != Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE && newInfrastructureInterface__InfrastructureSignature != null)) {
         if (EcoreUtil.isAncestor(this, newInfrastructureInterface__InfrastructureSignature))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newInfrastructureInterface__InfrastructureSignature != null)
            msgs = ((InternalEObject)newInfrastructureInterface__InfrastructureSignature).eInverseAdd(this, Repository_pc_avPackage.INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE, InfrastructureInterface.class, msgs);
         msgs = basicSetInfrastructureInterface__InfrastructureSignature(newInfrastructureInterface__InfrastructureSignature, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE, newInfrastructureInterface__InfrastructureSignature, newInfrastructureInterface__InfrastructureSignature));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters__InfrastructureSignature()).basicAdd(otherEnd, msgs);
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetInfrastructureInterface__InfrastructureSignature((InfrastructureInterface)otherEnd, msgs);
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
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE:
            return ((InternalEList<?>)getParameters__InfrastructureSignature()).basicRemove(otherEnd, msgs);
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE:
            return basicSetInfrastructureInterface__InfrastructureSignature(null, msgs);
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
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE:
            return eInternalContainer().eInverseRemove(this, Repository_pc_avPackage.INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE, InfrastructureInterface.class, msgs);
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
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE:
            return getParameters__InfrastructureSignature();
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE:
            return getInfrastructureInterface__InfrastructureSignature();
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
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE:
            getParameters__InfrastructureSignature().clear();
            getParameters__InfrastructureSignature().addAll((Collection<? extends Parameter>)newValue);
            return;
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE:
            setInfrastructureInterface__InfrastructureSignature((InfrastructureInterface)newValue);
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
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE:
            getParameters__InfrastructureSignature().clear();
            return;
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE:
            setInfrastructureInterface__InfrastructureSignature((InfrastructureInterface)null);
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
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE:
            return parameters__InfrastructureSignature != null && !parameters__InfrastructureSignature.isEmpty();
         case Repository_pc_avPackage.INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE:
            return getInfrastructureInterface__InfrastructureSignature() != null;
      }
      return super.eIsSet(featureID);
   }

} //InfrastructureSignatureImpl
