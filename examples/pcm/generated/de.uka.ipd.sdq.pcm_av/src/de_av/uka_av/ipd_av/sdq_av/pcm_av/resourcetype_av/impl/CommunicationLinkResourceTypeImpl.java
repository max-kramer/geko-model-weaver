/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.NetworkInducedFailureType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.Reliability_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.CommunicationLinkResourceType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.impl.CommunicationLinkResourceTypeImpl#getNetworkInducedFailureType__CommunicationLinkResourceType <em>Network Induced Failure Type Communication Link Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationLinkResourceTypeImpl extends ResourceTypeImpl implements CommunicationLinkResourceType {
   /**
    * The cached value of the '{@link #getNetworkInducedFailureType__CommunicationLinkResourceType() <em>Network Induced Failure Type Communication Link Resource Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNetworkInducedFailureType__CommunicationLinkResourceType()
    * @generated
    * @ordered
    */
   protected NetworkInducedFailureType networkInducedFailureType__CommunicationLinkResourceType;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CommunicationLinkResourceTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Resourcetype_avPackage.Literals.COMMUNICATION_LINK_RESOURCE_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NetworkInducedFailureType getNetworkInducedFailureType__CommunicationLinkResourceType() {
      if (networkInducedFailureType__CommunicationLinkResourceType != null && networkInducedFailureType__CommunicationLinkResourceType.eIsProxy()) {
         InternalEObject oldNetworkInducedFailureType__CommunicationLinkResourceType = (InternalEObject)networkInducedFailureType__CommunicationLinkResourceType;
         networkInducedFailureType__CommunicationLinkResourceType = (NetworkInducedFailureType)eResolveProxy(oldNetworkInducedFailureType__CommunicationLinkResourceType);
         if (networkInducedFailureType__CommunicationLinkResourceType != oldNetworkInducedFailureType__CommunicationLinkResourceType) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Resourcetype_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE, oldNetworkInducedFailureType__CommunicationLinkResourceType, networkInducedFailureType__CommunicationLinkResourceType));
         }
      }
      return networkInducedFailureType__CommunicationLinkResourceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NetworkInducedFailureType basicGetNetworkInducedFailureType__CommunicationLinkResourceType() {
      return networkInducedFailureType__CommunicationLinkResourceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetNetworkInducedFailureType__CommunicationLinkResourceType(NetworkInducedFailureType newNetworkInducedFailureType__CommunicationLinkResourceType, NotificationChain msgs) {
      NetworkInducedFailureType oldNetworkInducedFailureType__CommunicationLinkResourceType = networkInducedFailureType__CommunicationLinkResourceType;
      networkInducedFailureType__CommunicationLinkResourceType = newNetworkInducedFailureType__CommunicationLinkResourceType;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Resourcetype_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE, oldNetworkInducedFailureType__CommunicationLinkResourceType, newNetworkInducedFailureType__CommunicationLinkResourceType);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setNetworkInducedFailureType__CommunicationLinkResourceType(NetworkInducedFailureType newNetworkInducedFailureType__CommunicationLinkResourceType) {
      if (newNetworkInducedFailureType__CommunicationLinkResourceType != networkInducedFailureType__CommunicationLinkResourceType) {
         NotificationChain msgs = null;
         if (networkInducedFailureType__CommunicationLinkResourceType != null)
            msgs = ((InternalEObject)networkInducedFailureType__CommunicationLinkResourceType).eInverseRemove(this, Reliability_avPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE, NetworkInducedFailureType.class, msgs);
         if (newNetworkInducedFailureType__CommunicationLinkResourceType != null)
            msgs = ((InternalEObject)newNetworkInducedFailureType__CommunicationLinkResourceType).eInverseAdd(this, Reliability_avPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE, NetworkInducedFailureType.class, msgs);
         msgs = basicSetNetworkInducedFailureType__CommunicationLinkResourceType(newNetworkInducedFailureType__CommunicationLinkResourceType, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Resourcetype_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE, newNetworkInducedFailureType__CommunicationLinkResourceType, newNetworkInducedFailureType__CommunicationLinkResourceType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Resourcetype_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            if (networkInducedFailureType__CommunicationLinkResourceType != null)
               msgs = ((InternalEObject)networkInducedFailureType__CommunicationLinkResourceType).eInverseRemove(this, Reliability_avPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE, NetworkInducedFailureType.class, msgs);
            return basicSetNetworkInducedFailureType__CommunicationLinkResourceType((NetworkInducedFailureType)otherEnd, msgs);
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
         case Resourcetype_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            return basicSetNetworkInducedFailureType__CommunicationLinkResourceType(null, msgs);
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
         case Resourcetype_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            if (resolve) return getNetworkInducedFailureType__CommunicationLinkResourceType();
            return basicGetNetworkInducedFailureType__CommunicationLinkResourceType();
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
         case Resourcetype_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            setNetworkInducedFailureType__CommunicationLinkResourceType((NetworkInducedFailureType)newValue);
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
         case Resourcetype_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            setNetworkInducedFailureType__CommunicationLinkResourceType((NetworkInducedFailureType)null);
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
         case Resourcetype_avPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE:
            return networkInducedFailureType__CommunicationLinkResourceType != null;
      }
      return super.eIsSet(featureID);
   }

} //CommunicationLinkResourceTypeImpl
