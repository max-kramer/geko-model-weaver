/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.ComposedStructure;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.Composition_pcPackage;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.ResourceRequiredDelegationConnector;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.ResourceRequiredRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.impl.ResourceRequiredDelegationConnectorImpl#getInnerResourceRequiredRole_ResourceRequiredDelegationConnector <em>Inner Resource Required Role Resource Required Delegation Connector</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.impl.ResourceRequiredDelegationConnectorImpl#getOuterResourceRequiredRole_ResourceRequiredDelegationConnector <em>Outer Resource Required Role Resource Required Delegation Connector</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.impl.ResourceRequiredDelegationConnectorImpl#getParentStructure_ResourceRequiredDelegationConnector <em>Parent Structure Resource Required Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRequiredDelegationConnectorImpl extends EObjectImpl implements ResourceRequiredDelegationConnector {
   /**
    * The cached value of the '{@link #getInnerResourceRequiredRole_ResourceRequiredDelegationConnector() <em>Inner Resource Required Role Resource Required Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInnerResourceRequiredRole_ResourceRequiredDelegationConnector()
    * @generated
    * @ordered
    */
   protected ResourceRequiredRole innerResourceRequiredRole_ResourceRequiredDelegationConnector;

   /**
    * The cached value of the '{@link #getOuterResourceRequiredRole_ResourceRequiredDelegationConnector() <em>Outer Resource Required Role Resource Required Delegation Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOuterResourceRequiredRole_ResourceRequiredDelegationConnector()
    * @generated
    * @ordered
    */
   protected ResourceRequiredRole outerResourceRequiredRole_ResourceRequiredDelegationConnector;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceRequiredDelegationConnectorImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Composition_pcPackage.Literals.RESOURCE_REQUIRED_DELEGATION_CONNECTOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole getInnerResourceRequiredRole_ResourceRequiredDelegationConnector() {
      if (innerResourceRequiredRole_ResourceRequiredDelegationConnector != null && innerResourceRequiredRole_ResourceRequiredDelegationConnector.eIsProxy()) {
         InternalEObject oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector = (InternalEObject)innerResourceRequiredRole_ResourceRequiredDelegationConnector;
         innerResourceRequiredRole_ResourceRequiredDelegationConnector = (ResourceRequiredRole)eResolveProxy(oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector);
         if (innerResourceRequiredRole_ResourceRequiredDelegationConnector != oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector, innerResourceRequiredRole_ResourceRequiredDelegationConnector));
         }
      }
      return innerResourceRequiredRole_ResourceRequiredDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole basicGetInnerResourceRequiredRole_ResourceRequiredDelegationConnector() {
      return innerResourceRequiredRole_ResourceRequiredDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInnerResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole newInnerResourceRequiredRole_ResourceRequiredDelegationConnector) {
      ResourceRequiredRole oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector = innerResourceRequiredRole_ResourceRequiredDelegationConnector;
      innerResourceRequiredRole_ResourceRequiredDelegationConnector = newInnerResourceRequiredRole_ResourceRequiredDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector, innerResourceRequiredRole_ResourceRequiredDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole getOuterResourceRequiredRole_ResourceRequiredDelegationConnector() {
      if (outerResourceRequiredRole_ResourceRequiredDelegationConnector != null && outerResourceRequiredRole_ResourceRequiredDelegationConnector.eIsProxy()) {
         InternalEObject oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector = (InternalEObject)outerResourceRequiredRole_ResourceRequiredDelegationConnector;
         outerResourceRequiredRole_ResourceRequiredDelegationConnector = (ResourceRequiredRole)eResolveProxy(oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector);
         if (outerResourceRequiredRole_ResourceRequiredDelegationConnector != oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector, outerResourceRequiredRole_ResourceRequiredDelegationConnector));
         }
      }
      return outerResourceRequiredRole_ResourceRequiredDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole basicGetOuterResourceRequiredRole_ResourceRequiredDelegationConnector() {
      return outerResourceRequiredRole_ResourceRequiredDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOuterResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole newOuterResourceRequiredRole_ResourceRequiredDelegationConnector) {
      ResourceRequiredRole oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector = outerResourceRequiredRole_ResourceRequiredDelegationConnector;
      outerResourceRequiredRole_ResourceRequiredDelegationConnector = newOuterResourceRequiredRole_ResourceRequiredDelegationConnector;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector, outerResourceRequiredRole_ResourceRequiredDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComposedStructure getParentStructure_ResourceRequiredDelegationConnector() {
      if (eContainerFeatureID() != Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR) return null;
      return (ComposedStructure)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParentStructure_ResourceRequiredDelegationConnector(ComposedStructure newParentStructure_ResourceRequiredDelegationConnector, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newParentStructure_ResourceRequiredDelegationConnector, Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParentStructure_ResourceRequiredDelegationConnector(ComposedStructure newParentStructure_ResourceRequiredDelegationConnector) {
      if (newParentStructure_ResourceRequiredDelegationConnector != eInternalContainer() || (eContainerFeatureID() != Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR && newParentStructure_ResourceRequiredDelegationConnector != null)) {
         if (EcoreUtil.isAncestor(this, newParentStructure_ResourceRequiredDelegationConnector))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParentStructure_ResourceRequiredDelegationConnector != null)
            msgs = ((InternalEObject)newParentStructure_ResourceRequiredDelegationConnector).eInverseAdd(this, Composition_pcPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
         msgs = basicSetParentStructure_ResourceRequiredDelegationConnector(newParentStructure_ResourceRequiredDelegationConnector, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, newParentStructure_ResourceRequiredDelegationConnector, newParentStructure_ResourceRequiredDelegationConnector));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParentStructure_ResourceRequiredDelegationConnector((ComposedStructure)otherEnd, msgs);
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
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            return basicSetParentStructure_ResourceRequiredDelegationConnector(null, msgs);
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
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            return eInternalContainer().eInverseRemove(this, Composition_pcPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
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
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            if (resolve) return getInnerResourceRequiredRole_ResourceRequiredDelegationConnector();
            return basicGetInnerResourceRequiredRole_ResourceRequiredDelegationConnector();
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            if (resolve) return getOuterResourceRequiredRole_ResourceRequiredDelegationConnector();
            return basicGetOuterResourceRequiredRole_ResourceRequiredDelegationConnector();
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            return getParentStructure_ResourceRequiredDelegationConnector();
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
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            setInnerResourceRequiredRole_ResourceRequiredDelegationConnector((ResourceRequiredRole)newValue);
            return;
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            setOuterResourceRequiredRole_ResourceRequiredDelegationConnector((ResourceRequiredRole)newValue);
            return;
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            setParentStructure_ResourceRequiredDelegationConnector((ComposedStructure)newValue);
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
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            setInnerResourceRequiredRole_ResourceRequiredDelegationConnector((ResourceRequiredRole)null);
            return;
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            setOuterResourceRequiredRole_ResourceRequiredDelegationConnector((ResourceRequiredRole)null);
            return;
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            setParentStructure_ResourceRequiredDelegationConnector((ComposedStructure)null);
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
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            return innerResourceRequiredRole_ResourceRequiredDelegationConnector != null;
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            return outerResourceRequiredRole_ResourceRequiredDelegationConnector != null;
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
            return getParentStructure_ResourceRequiredDelegationConnector() != null;
      }
      return super.eIsSet(featureID);
   }

} //ResourceRequiredDelegationConnectorImpl
