/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.HardwareInducedFailureType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.Reliability_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.util.Reliability_avValidator;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ProcessingResourceType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage;

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
 * An implementation of the model object '<em><b>Hardware Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.impl.HardwareInducedFailureTypeImpl#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareInducedFailureTypeImpl extends FailureTypeImpl implements HardwareInducedFailureType {
   /**
    * The cached value of the '{@link #getProcessingResourceType__HardwareInducedFailureType() <em>Processing Resource Type Hardware Induced Failure Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProcessingResourceType__HardwareInducedFailureType()
    * @generated
    * @ordered
    */
   protected ProcessingResourceType processingResourceType__HardwareInducedFailureType;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected HardwareInducedFailureTypeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Reliability_avPackage.Literals.HARDWARE_INDUCED_FAILURE_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessingResourceType getProcessingResourceType__HardwareInducedFailureType() {
      if (processingResourceType__HardwareInducedFailureType != null && processingResourceType__HardwareInducedFailureType.eIsProxy()) {
         InternalEObject oldProcessingResourceType__HardwareInducedFailureType = (InternalEObject)processingResourceType__HardwareInducedFailureType;
         processingResourceType__HardwareInducedFailureType = (ProcessingResourceType)eResolveProxy(oldProcessingResourceType__HardwareInducedFailureType);
         if (processingResourceType__HardwareInducedFailureType != oldProcessingResourceType__HardwareInducedFailureType) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE, oldProcessingResourceType__HardwareInducedFailureType, processingResourceType__HardwareInducedFailureType));
         }
      }
      return processingResourceType__HardwareInducedFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessingResourceType basicGetProcessingResourceType__HardwareInducedFailureType() {
      return processingResourceType__HardwareInducedFailureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetProcessingResourceType__HardwareInducedFailureType(ProcessingResourceType newProcessingResourceType__HardwareInducedFailureType, NotificationChain msgs) {
      ProcessingResourceType oldProcessingResourceType__HardwareInducedFailureType = processingResourceType__HardwareInducedFailureType;
      processingResourceType__HardwareInducedFailureType = newProcessingResourceType__HardwareInducedFailureType;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE, oldProcessingResourceType__HardwareInducedFailureType, newProcessingResourceType__HardwareInducedFailureType);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProcessingResourceType__HardwareInducedFailureType(ProcessingResourceType newProcessingResourceType__HardwareInducedFailureType) {
      if (newProcessingResourceType__HardwareInducedFailureType != processingResourceType__HardwareInducedFailureType) {
         NotificationChain msgs = null;
         if (processingResourceType__HardwareInducedFailureType != null)
            msgs = ((InternalEObject)processingResourceType__HardwareInducedFailureType).eInverseRemove(this, Resourcetype_avPackage.PROCESSING_RESOURCE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_PROCESSING_RESOURCE_TYPE, ProcessingResourceType.class, msgs);
         if (newProcessingResourceType__HardwareInducedFailureType != null)
            msgs = ((InternalEObject)newProcessingResourceType__HardwareInducedFailureType).eInverseAdd(this, Resourcetype_avPackage.PROCESSING_RESOURCE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_PROCESSING_RESOURCE_TYPE, ProcessingResourceType.class, msgs);
         msgs = basicSetProcessingResourceType__HardwareInducedFailureType(newProcessingResourceType__HardwareInducedFailureType, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE, newProcessingResourceType__HardwareInducedFailureType, newProcessingResourceType__HardwareInducedFailureType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean HardwareInducedFailureTypeHasProcessingResourceType(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Reliability_avValidator.DIAGNOSTIC_SOURCE,
                   Reliability_avValidator.HARDWARE_INDUCED_FAILURE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_HAS_PROCESSING_RESOURCE_TYPE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HardwareInducedFailureTypeHasProcessingResourceType", EObjectValidator.getObjectLabel(this, context) }),
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
         case Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
            if (processingResourceType__HardwareInducedFailureType != null)
               msgs = ((InternalEObject)processingResourceType__HardwareInducedFailureType).eInverseRemove(this, Resourcetype_avPackage.PROCESSING_RESOURCE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_PROCESSING_RESOURCE_TYPE, ProcessingResourceType.class, msgs);
            return basicSetProcessingResourceType__HardwareInducedFailureType((ProcessingResourceType)otherEnd, msgs);
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
         case Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
            return basicSetProcessingResourceType__HardwareInducedFailureType(null, msgs);
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
         case Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
            if (resolve) return getProcessingResourceType__HardwareInducedFailureType();
            return basicGetProcessingResourceType__HardwareInducedFailureType();
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
         case Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
            setProcessingResourceType__HardwareInducedFailureType((ProcessingResourceType)newValue);
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
         case Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
            setProcessingResourceType__HardwareInducedFailureType((ProcessingResourceType)null);
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
         case Reliability_avPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
            return processingResourceType__HardwareInducedFailureType != null;
      }
      return super.eIsSet(featureID);
   }

} //HardwareInducedFailureTypeImpl
