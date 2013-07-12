/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.NetworkInducedFailureType;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.Reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.util.Reliability_av_pcValidator;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.CommunicationLinkResourceType;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.Resourcetype_av_pcPackage;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.impl.NetworkInducedFailureTypeImpl#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkInducedFailureTypeImpl extends FailureTypeImpl implements NetworkInducedFailureType {
   /**
    * The cached value of the '{@link #getCommunicationLinkResourceType__NetworkInducedFailureType() <em>Communication Link Resource Type Network Induced Failure Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCommunicationLinkResourceType__NetworkInducedFailureType()
    * @generated
    * @ordered
    */
   protected CommunicationLinkResourceType communicationLinkResourceType__NetworkInducedFailureType;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NetworkInducedFailureTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Reliability_av_pcPackage.Literals.NETWORK_INDUCED_FAILURE_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceType getCommunicationLinkResourceType__NetworkInducedFailureType() {
      if (communicationLinkResourceType__NetworkInducedFailureType != null && communicationLinkResourceType__NetworkInducedFailureType.eIsProxy()) {
         InternalEObject oldCommunicationLinkResourceType__NetworkInducedFailureType = (InternalEObject)communicationLinkResourceType__NetworkInducedFailureType;
         communicationLinkResourceType__NetworkInducedFailureType = (CommunicationLinkResourceType)eResolveProxy(oldCommunicationLinkResourceType__NetworkInducedFailureType);
         if (communicationLinkResourceType__NetworkInducedFailureType != oldCommunicationLinkResourceType__NetworkInducedFailureType) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reliability_av_pcPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE, oldCommunicationLinkResourceType__NetworkInducedFailureType, communicationLinkResourceType__NetworkInducedFailureType));
         }
      }
      return communicationLinkResourceType__NetworkInducedFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceType basicGetCommunicationLinkResourceType__NetworkInducedFailureType() {
      return communicationLinkResourceType__NetworkInducedFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetCommunicationLinkResourceType__NetworkInducedFailureType(CommunicationLinkResourceType newCommunicationLinkResourceType__NetworkInducedFailureType, NotificationChain msgs) {
      CommunicationLinkResourceType oldCommunicationLinkResourceType__NetworkInducedFailureType = communicationLinkResourceType__NetworkInducedFailureType;
      communicationLinkResourceType__NetworkInducedFailureType = newCommunicationLinkResourceType__NetworkInducedFailureType;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reliability_av_pcPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE, oldCommunicationLinkResourceType__NetworkInducedFailureType, newCommunicationLinkResourceType__NetworkInducedFailureType);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCommunicationLinkResourceType__NetworkInducedFailureType(CommunicationLinkResourceType newCommunicationLinkResourceType__NetworkInducedFailureType) {
      if (newCommunicationLinkResourceType__NetworkInducedFailureType != communicationLinkResourceType__NetworkInducedFailureType) {
         NotificationChain msgs = null;
         if (communicationLinkResourceType__NetworkInducedFailureType != null)
            msgs = ((InternalEObject)communicationLinkResourceType__NetworkInducedFailureType).eInverseRemove(this, Resourcetype_av_pcPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE, CommunicationLinkResourceType.class, msgs);
         if (newCommunicationLinkResourceType__NetworkInducedFailureType != null)
            msgs = ((InternalEObject)newCommunicationLinkResourceType__NetworkInducedFailureType).eInverseAdd(this, Resourcetype_av_pcPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE, CommunicationLinkResourceType.class, msgs);
         msgs = basicSetCommunicationLinkResourceType__NetworkInducedFailureType(newCommunicationLinkResourceType__NetworkInducedFailureType, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Reliability_av_pcPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE, newCommunicationLinkResourceType__NetworkInducedFailureType, newCommunicationLinkResourceType__NetworkInducedFailureType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean NetworkInducedFailureTypeHasCommunicationLinkResourceType(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Reliability_av_pcValidator.DIAGNOSTIC_SOURCE,
                   Reliability_av_pcValidator.NETWORK_INDUCED_FAILURE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_HAS_COMMUNICATION_LINK_RESOURCE_TYPE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NetworkInducedFailureTypeHasCommunicationLinkResourceType", EObjectValidator.getObjectLabel(this, context) }),
                   new Object [] { this }));
         }
         return false;
      }
      return true;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Reliability_av_pcPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
            if (communicationLinkResourceType__NetworkInducedFailureType != null)
               msgs = ((InternalEObject)communicationLinkResourceType__NetworkInducedFailureType).eInverseRemove(this, Resourcetype_av_pcPackage.COMMUNICATION_LINK_RESOURCE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_COMMUNICATION_LINK_RESOURCE_TYPE, CommunicationLinkResourceType.class, msgs);
            return basicSetCommunicationLinkResourceType__NetworkInducedFailureType((CommunicationLinkResourceType)otherEnd, msgs);
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
         case Reliability_av_pcPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
            return basicSetCommunicationLinkResourceType__NetworkInducedFailureType(null, msgs);
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
         case Reliability_av_pcPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
            if (resolve) return getCommunicationLinkResourceType__NetworkInducedFailureType();
            return basicGetCommunicationLinkResourceType__NetworkInducedFailureType();
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
         case Reliability_av_pcPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
            setCommunicationLinkResourceType__NetworkInducedFailureType((CommunicationLinkResourceType)newValue);
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
         case Reliability_av_pcPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
            setCommunicationLinkResourceType__NetworkInducedFailureType((CommunicationLinkResourceType)null);
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
         case Reliability_av_pcPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
            return communicationLinkResourceType__NetworkInducedFailureType != null;
      }
      return super.eIsSet(featureID);
   }

} //NetworkInducedFailureTypeImpl
