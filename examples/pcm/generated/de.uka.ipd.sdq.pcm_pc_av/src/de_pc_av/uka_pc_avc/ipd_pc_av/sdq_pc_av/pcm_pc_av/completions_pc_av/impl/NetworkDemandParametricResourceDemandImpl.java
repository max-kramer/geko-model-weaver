/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.Completions_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.NetworkDemandParametricResourceDemand;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.CommunicationLinkResourceType;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_performance_pc_av.impl.ParametricResourceDemandImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Demand Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.impl.NetworkDemandParametricResourceDemandImpl#getRequiredCommunicationLinkResource_ParametricResourceDemand <em>Required Communication Link Resource Parametric Resource Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkDemandParametricResourceDemandImpl extends ParametricResourceDemandImpl implements NetworkDemandParametricResourceDemand {
   /**
    * The cached value of the '{@link #getRequiredCommunicationLinkResource_ParametricResourceDemand() <em>Required Communication Link Resource Parametric Resource Demand</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredCommunicationLinkResource_ParametricResourceDemand()
    * @generated
    * @ordered
    */
   protected CommunicationLinkResourceType requiredCommunicationLinkResource_ParametricResourceDemand;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NetworkDemandParametricResourceDemandImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Completions_pc_avPackage.Literals.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceType getRequiredCommunicationLinkResource_ParametricResourceDemand() {
      if (requiredCommunicationLinkResource_ParametricResourceDemand != null && requiredCommunicationLinkResource_ParametricResourceDemand.eIsProxy()) {
         InternalEObject oldRequiredCommunicationLinkResource_ParametricResourceDemand = (InternalEObject)requiredCommunicationLinkResource_ParametricResourceDemand;
         requiredCommunicationLinkResource_ParametricResourceDemand = (CommunicationLinkResourceType)eResolveProxy(oldRequiredCommunicationLinkResource_ParametricResourceDemand);
         if (requiredCommunicationLinkResource_ParametricResourceDemand != oldRequiredCommunicationLinkResource_ParametricResourceDemand) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Completions_pc_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredCommunicationLinkResource_ParametricResourceDemand, requiredCommunicationLinkResource_ParametricResourceDemand));
         }
      }
      return requiredCommunicationLinkResource_ParametricResourceDemand;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceType basicGetRequiredCommunicationLinkResource_ParametricResourceDemand() {
      return requiredCommunicationLinkResource_ParametricResourceDemand;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiredCommunicationLinkResource_ParametricResourceDemand(CommunicationLinkResourceType newRequiredCommunicationLinkResource_ParametricResourceDemand) {
      CommunicationLinkResourceType oldRequiredCommunicationLinkResource_ParametricResourceDemand = requiredCommunicationLinkResource_ParametricResourceDemand;
      requiredCommunicationLinkResource_ParametricResourceDemand = newRequiredCommunicationLinkResource_ParametricResourceDemand;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Completions_pc_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredCommunicationLinkResource_ParametricResourceDemand, requiredCommunicationLinkResource_ParametricResourceDemand));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Completions_pc_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            if (resolve) return getRequiredCommunicationLinkResource_ParametricResourceDemand();
            return basicGetRequiredCommunicationLinkResource_ParametricResourceDemand();
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
         case Completions_pc_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            setRequiredCommunicationLinkResource_ParametricResourceDemand((CommunicationLinkResourceType)newValue);
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
         case Completions_pc_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            setRequiredCommunicationLinkResource_ParametricResourceDemand((CommunicationLinkResourceType)null);
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
         case Completions_pc_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            return requiredCommunicationLinkResource_ParametricResourceDemand != null;
      }
      return super.eIsSet(featureID);
   }

} //NetworkDemandParametricResourceDemandImpl
