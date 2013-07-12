/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.impl.EntityImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.ResourceInterface;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.ResourceRepository;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.ResourceSignature;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.Resourcetype_av_pcPackage;

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
 * An implementation of the model object '<em><b>Resource Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl.ResourceInterfaceImpl#getResourceRepository__ResourceInterface <em>Resource Repository Resource Interface</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl.ResourceInterfaceImpl#getResourceSignatures__ResourceInterface <em>Resource Signatures Resource Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceInterfaceImpl extends EntityImpl implements ResourceInterface {
   /**
    * The cached value of the '{@link #getResourceSignatures__ResourceInterface() <em>Resource Signatures Resource Interface</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceSignatures__ResourceInterface()
    * @generated
    * @ordered
    */
   protected EList<ResourceSignature> resourceSignatures__ResourceInterface;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceInterfaceImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourcetype_av_pcPackage.Literals.RESOURCE_INTERFACE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRepository getResourceRepository__ResourceInterface() {
      if (eContainerFeatureID() != Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE) return null;
      return (ResourceRepository)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetResourceRepository__ResourceInterface(ResourceRepository newResourceRepository__ResourceInterface, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newResourceRepository__ResourceInterface, Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResourceRepository__ResourceInterface(ResourceRepository newResourceRepository__ResourceInterface) {
      if (newResourceRepository__ResourceInterface != eInternalContainer() || (eContainerFeatureID() != Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE && newResourceRepository__ResourceInterface != null)) {
         if (EcoreUtil.isAncestor(this, newResourceRepository__ResourceInterface))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newResourceRepository__ResourceInterface != null)
            msgs = ((InternalEObject)newResourceRepository__ResourceInterface).eInverseAdd(this, Resourcetype_av_pcPackage.RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY, ResourceRepository.class, msgs);
         msgs = basicSetResourceRepository__ResourceInterface(newResourceRepository__ResourceInterface, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE, newResourceRepository__ResourceInterface, newResourceRepository__ResourceInterface));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceSignature> getResourceSignatures__ResourceInterface() {
      if (resourceSignatures__ResourceInterface == null) {
         resourceSignatures__ResourceInterface = new EObjectContainmentWithInverseEList<ResourceSignature>(ResourceSignature.class, this, Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE, Resourcetype_av_pcPackage.RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE);
      }
      return resourceSignatures__ResourceInterface;
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
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetResourceRepository__ResourceInterface((ResourceRepository)otherEnd, msgs);
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceSignatures__ResourceInterface()).basicAdd(otherEnd, msgs);
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
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE:
            return basicSetResourceRepository__ResourceInterface(null, msgs);
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE:
            return ((InternalEList<?>)getResourceSignatures__ResourceInterface()).basicRemove(otherEnd, msgs);
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
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE:
            return eInternalContainer().eInverseRemove(this, Resourcetype_av_pcPackage.RESOURCE_REPOSITORY__RESOURCE_INTERFACES_RESOURCE_REPOSITORY, ResourceRepository.class, msgs);
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
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE:
            return getResourceRepository__ResourceInterface();
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE:
            return getResourceSignatures__ResourceInterface();
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
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE:
            setResourceRepository__ResourceInterface((ResourceRepository)newValue);
            return;
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE:
            getResourceSignatures__ResourceInterface().clear();
            getResourceSignatures__ResourceInterface().addAll((Collection<? extends ResourceSignature>)newValue);
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
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE:
            setResourceRepository__ResourceInterface((ResourceRepository)null);
            return;
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE:
            getResourceSignatures__ResourceInterface().clear();
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
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_REPOSITORY_RESOURCE_INTERFACE:
            return getResourceRepository__ResourceInterface() != null;
         case Resourcetype_av_pcPackage.RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE:
            return resourceSignatures__ResourceInterface != null && !resourceSignatures__ResourceInterface.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //ResourceInterfaceImpl
