/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.OpenWorkload;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.Usagemodel_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.util.Usagemodel_avValidator;

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
 * An implementation of the model object '<em><b>Open Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.impl.OpenWorkloadImpl#getInterArrivalTime_OpenWorkload <em>Inter Arrival Time Open Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenWorkloadImpl extends WorkloadImpl implements OpenWorkload {
   /**
    * The cached value of the '{@link #getInterArrivalTime_OpenWorkload() <em>Inter Arrival Time Open Workload</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInterArrivalTime_OpenWorkload()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable interArrivalTime_OpenWorkload;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected OpenWorkloadImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Usagemodel_avPackage.Literals.OPEN_WORKLOAD;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getInterArrivalTime_OpenWorkload() {
      return interArrivalTime_OpenWorkload;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInterArrivalTime_OpenWorkload(PCMRandomVariable newInterArrivalTime_OpenWorkload, NotificationChain msgs) {
      PCMRandomVariable oldInterArrivalTime_OpenWorkload = interArrivalTime_OpenWorkload;
      interArrivalTime_OpenWorkload = newInterArrivalTime_OpenWorkload;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Usagemodel_avPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD, oldInterArrivalTime_OpenWorkload, newInterArrivalTime_OpenWorkload);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInterArrivalTime_OpenWorkload(PCMRandomVariable newInterArrivalTime_OpenWorkload) {
      if (newInterArrivalTime_OpenWorkload != interArrivalTime_OpenWorkload) {
         NotificationChain msgs = null;
         if (interArrivalTime_OpenWorkload != null)
            msgs = ((InternalEObject)interArrivalTime_OpenWorkload).eInverseRemove(this, Core_avPackage.PCM_RANDOM_VARIABLE__OPEN_WORKLOAD_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newInterArrivalTime_OpenWorkload != null)
            msgs = ((InternalEObject)newInterArrivalTime_OpenWorkload).eInverseAdd(this, Core_avPackage.PCM_RANDOM_VARIABLE__OPEN_WORKLOAD_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetInterArrivalTime_OpenWorkload(newInterArrivalTime_OpenWorkload, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_avPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD, newInterArrivalTime_OpenWorkload, newInterArrivalTime_OpenWorkload));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean InterArrivalTimeInOpenWorkloadNeedsToBeSpecified(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Usagemodel_avValidator.DIAGNOSTIC_SOURCE,
                   Usagemodel_avValidator.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_IN_OPEN_WORKLOAD_NEEDS_TO_BE_SPECIFIED,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InterArrivalTimeInOpenWorkloadNeedsToBeSpecified", EObjectValidator.getObjectLabel(this, context) }),
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
         case Usagemodel_avPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD:
            if (interArrivalTime_OpenWorkload != null)
               msgs = ((InternalEObject)interArrivalTime_OpenWorkload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Usagemodel_avPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD, null, msgs);
            return basicSetInterArrivalTime_OpenWorkload((PCMRandomVariable)otherEnd, msgs);
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
         case Usagemodel_avPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD:
            return basicSetInterArrivalTime_OpenWorkload(null, msgs);
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
         case Usagemodel_avPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD:
            return getInterArrivalTime_OpenWorkload();
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
         case Usagemodel_avPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD:
            setInterArrivalTime_OpenWorkload((PCMRandomVariable)newValue);
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
         case Usagemodel_avPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD:
            setInterArrivalTime_OpenWorkload((PCMRandomVariable)null);
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
         case Usagemodel_avPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD:
            return interArrivalTime_OpenWorkload != null;
      }
      return super.eIsSet(featureID);
   }

} //OpenWorkloadImpl
