/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.UsageScenario;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Usagemodel_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Workload;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.impl.WorkloadImpl#getUsageScenario_Workload <em>Usage Scenario Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkloadImpl extends EObjectImpl implements Workload {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected WorkloadImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Usagemodel_pc_avPackage.Literals.WORKLOAD;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UsageScenario getUsageScenario_Workload() {
      if (eContainerFeatureID() != Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD) return null;
      return (UsageScenario)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetUsageScenario_Workload(UsageScenario newUsageScenario_Workload, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newUsageScenario_Workload, Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUsageScenario_Workload(UsageScenario newUsageScenario_Workload) {
      if (newUsageScenario_Workload != eInternalContainer() || (eContainerFeatureID() != Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD && newUsageScenario_Workload != null)) {
         if (EcoreUtil.isAncestor(this, newUsageScenario_Workload))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newUsageScenario_Workload != null)
            msgs = ((InternalEObject)newUsageScenario_Workload).eInverseAdd(this, Usagemodel_pc_avPackage.USAGE_SCENARIO__WORKLOAD_USAGE_SCENARIO, UsageScenario.class, msgs);
         msgs = basicSetUsageScenario_Workload(newUsageScenario_Workload, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD, newUsageScenario_Workload, newUsageScenario_Workload));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetUsageScenario_Workload((UsageScenario)otherEnd, msgs);
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
         case Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD:
            return basicSetUsageScenario_Workload(null, msgs);
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
         case Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD:
            return eInternalContainer().eInverseRemove(this, Usagemodel_pc_avPackage.USAGE_SCENARIO__WORKLOAD_USAGE_SCENARIO, UsageScenario.class, msgs);
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
         case Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD:
            return getUsageScenario_Workload();
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
         case Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD:
            setUsageScenario_Workload((UsageScenario)newValue);
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
         case Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD:
            setUsageScenario_Workload((UsageScenario)null);
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
         case Usagemodel_pc_avPackage.WORKLOAD__USAGE_SCENARIO_WORKLOAD:
            return getUsageScenario_Workload() != null;
      }
      return super.eIsSet(featureID);
   }

} //WorkloadImpl
