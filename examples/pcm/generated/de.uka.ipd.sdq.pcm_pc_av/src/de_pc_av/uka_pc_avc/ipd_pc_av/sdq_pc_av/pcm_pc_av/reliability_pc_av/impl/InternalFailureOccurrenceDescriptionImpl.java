/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.InternalFailureOccurrenceDescription;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.Reliability_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.SoftwareInducedFailureType;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.util.Reliability_pc_avValidator;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.InternalAction;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage;

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
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.impl.InternalFailureOccurrenceDescriptionImpl#getInternalAction__InternalFailureOccurrenceDescription <em>Internal Action Internal Failure Occurrence Description</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.impl.InternalFailureOccurrenceDescriptionImpl#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription <em>Software Induced Failure Type Internal Failure Occurrence Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalFailureOccurrenceDescriptionImpl extends FailureOccurrenceDescriptionImpl implements InternalFailureOccurrenceDescription {
   /**
    * The cached value of the '{@link #getSoftwareInducedFailureType__InternalFailureOccurrenceDescription() <em>Software Induced Failure Type Internal Failure Occurrence Description</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSoftwareInducedFailureType__InternalFailureOccurrenceDescription()
    * @generated
    * @ordered
    */
   protected SoftwareInducedFailureType softwareInducedFailureType__InternalFailureOccurrenceDescription;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InternalFailureOccurrenceDescriptionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Reliability_pc_avPackage.Literals.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InternalAction getInternalAction__InternalFailureOccurrenceDescription() {
      if (eContainerFeatureID() != Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION) return null;
      return (InternalAction)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetInternalAction__InternalFailureOccurrenceDescription(InternalAction newInternalAction__InternalFailureOccurrenceDescription, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newInternalAction__InternalFailureOccurrenceDescription, Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setInternalAction__InternalFailureOccurrenceDescription(InternalAction newInternalAction__InternalFailureOccurrenceDescription) {
      if (newInternalAction__InternalFailureOccurrenceDescription != eInternalContainer() || (eContainerFeatureID() != Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION && newInternalAction__InternalFailureOccurrenceDescription != null)) {
         if (EcoreUtil.isAncestor(this, newInternalAction__InternalFailureOccurrenceDescription))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newInternalAction__InternalFailureOccurrenceDescription != null)
            msgs = ((InternalEObject)newInternalAction__InternalFailureOccurrenceDescription).eInverseAdd(this, Seff_pc_avPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION, InternalAction.class, msgs);
         msgs = basicSetInternalAction__InternalFailureOccurrenceDescription(newInternalAction__InternalFailureOccurrenceDescription, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION, newInternalAction__InternalFailureOccurrenceDescription, newInternalAction__InternalFailureOccurrenceDescription));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SoftwareInducedFailureType getSoftwareInducedFailureType__InternalFailureOccurrenceDescription() {
      if (softwareInducedFailureType__InternalFailureOccurrenceDescription != null && softwareInducedFailureType__InternalFailureOccurrenceDescription.eIsProxy()) {
         InternalEObject oldSoftwareInducedFailureType__InternalFailureOccurrenceDescription = (InternalEObject)softwareInducedFailureType__InternalFailureOccurrenceDescription;
         softwareInducedFailureType__InternalFailureOccurrenceDescription = (SoftwareInducedFailureType)eResolveProxy(oldSoftwareInducedFailureType__InternalFailureOccurrenceDescription);
         if (softwareInducedFailureType__InternalFailureOccurrenceDescription != oldSoftwareInducedFailureType__InternalFailureOccurrenceDescription) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION, oldSoftwareInducedFailureType__InternalFailureOccurrenceDescription, softwareInducedFailureType__InternalFailureOccurrenceDescription));
         }
      }
      return softwareInducedFailureType__InternalFailureOccurrenceDescription;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SoftwareInducedFailureType basicGetSoftwareInducedFailureType__InternalFailureOccurrenceDescription() {
      return softwareInducedFailureType__InternalFailureOccurrenceDescription;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSoftwareInducedFailureType__InternalFailureOccurrenceDescription(SoftwareInducedFailureType newSoftwareInducedFailureType__InternalFailureOccurrenceDescription, NotificationChain msgs) {
      SoftwareInducedFailureType oldSoftwareInducedFailureType__InternalFailureOccurrenceDescription = softwareInducedFailureType__InternalFailureOccurrenceDescription;
      softwareInducedFailureType__InternalFailureOccurrenceDescription = newSoftwareInducedFailureType__InternalFailureOccurrenceDescription;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION, oldSoftwareInducedFailureType__InternalFailureOccurrenceDescription, newSoftwareInducedFailureType__InternalFailureOccurrenceDescription);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSoftwareInducedFailureType__InternalFailureOccurrenceDescription(SoftwareInducedFailureType newSoftwareInducedFailureType__InternalFailureOccurrenceDescription) {
      if (newSoftwareInducedFailureType__InternalFailureOccurrenceDescription != softwareInducedFailureType__InternalFailureOccurrenceDescription) {
         NotificationChain msgs = null;
         if (softwareInducedFailureType__InternalFailureOccurrenceDescription != null)
            msgs = ((InternalEObject)softwareInducedFailureType__InternalFailureOccurrenceDescription).eInverseRemove(this, Reliability_pc_avPackage.SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE, SoftwareInducedFailureType.class, msgs);
         if (newSoftwareInducedFailureType__InternalFailureOccurrenceDescription != null)
            msgs = ((InternalEObject)newSoftwareInducedFailureType__InternalFailureOccurrenceDescription).eInverseAdd(this, Reliability_pc_avPackage.SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE, SoftwareInducedFailureType.class, msgs);
         msgs = basicSetSoftwareInducedFailureType__InternalFailureOccurrenceDescription(newSoftwareInducedFailureType__InternalFailureOccurrenceDescription, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION, newSoftwareInducedFailureType__InternalFailureOccurrenceDescription, newSoftwareInducedFailureType__InternalFailureOccurrenceDescription));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean NoResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Reliability_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Reliability_pc_avValidator.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__NO_RESOURCE_TIMEOUT_FAILURE_ALLOWED_FOR_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription", EObjectValidator.getObjectLabel(this, context) }),
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
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetInternalAction__InternalFailureOccurrenceDescription((InternalAction)otherEnd, msgs);
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            if (softwareInducedFailureType__InternalFailureOccurrenceDescription != null)
               msgs = ((InternalEObject)softwareInducedFailureType__InternalFailureOccurrenceDescription).eInverseRemove(this, Reliability_pc_avPackage.SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE, SoftwareInducedFailureType.class, msgs);
            return basicSetSoftwareInducedFailureType__InternalFailureOccurrenceDescription((SoftwareInducedFailureType)otherEnd, msgs);
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
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            return basicSetInternalAction__InternalFailureOccurrenceDescription(null, msgs);
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            return basicSetSoftwareInducedFailureType__InternalFailureOccurrenceDescription(null, msgs);
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
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            return eInternalContainer().eInverseRemove(this, Seff_pc_avPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION, InternalAction.class, msgs);
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
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            return getInternalAction__InternalFailureOccurrenceDescription();
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            if (resolve) return getSoftwareInducedFailureType__InternalFailureOccurrenceDescription();
            return basicGetSoftwareInducedFailureType__InternalFailureOccurrenceDescription();
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
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            setInternalAction__InternalFailureOccurrenceDescription((InternalAction)newValue);
            return;
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            setSoftwareInducedFailureType__InternalFailureOccurrenceDescription((SoftwareInducedFailureType)newValue);
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
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            setInternalAction__InternalFailureOccurrenceDescription((InternalAction)null);
            return;
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            setSoftwareInducedFailureType__InternalFailureOccurrenceDescription((SoftwareInducedFailureType)null);
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
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            return getInternalAction__InternalFailureOccurrenceDescription() != null;
         case Reliability_pc_avPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
            return softwareInducedFailureType__InternalFailureOccurrenceDescription != null;
      }
      return super.eIsSet(featureID);
   }

} //InternalFailureOccurrenceDescriptionImpl
