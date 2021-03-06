/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.impl.EntityImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.QoSAnnotations;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.Qosannotations_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedOutputParameterAbstraction;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.util.Qosannotations_pc_pcValidator;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System_pc_pcPackage;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SAnnotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.QoSAnnotationsImpl#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.QoSAnnotationsImpl#getSystem_QoSAnnotations <em>System Qo SAnnotations</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.QoSAnnotationsImpl#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QoSAnnotationsImpl extends EntityImpl implements QoSAnnotations {
   /**
    * The cached value of the '{@link #getSpecifiedOutputParameterAbstractions_QoSAnnotations() <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSpecifiedOutputParameterAbstractions_QoSAnnotations()
    * @generated
    * @ordered
    */
   protected EList<SpecifiedOutputParameterAbstraction> specifiedOutputParameterAbstractions_QoSAnnotations;

   /**
    * The cached value of the '{@link #getSpecifiedQoSAnnotations_QoSAnnotations() <em>Specified Qo SAnnotations Qo SAnnotations</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSpecifiedQoSAnnotations_QoSAnnotations()
    * @generated
    * @ordered
    */
   protected EList<SpecifiedQoSAnnotation> specifiedQoSAnnotations_QoSAnnotations;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected QoSAnnotationsImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Qosannotations_pc_pcPackage.Literals.QO_SANNOTATIONS;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<SpecifiedOutputParameterAbstraction> getSpecifiedOutputParameterAbstractions_QoSAnnotations() {
      if (specifiedOutputParameterAbstractions_QoSAnnotations == null) {
         specifiedOutputParameterAbstractions_QoSAnnotations = new EObjectContainmentWithInverseEList<SpecifiedOutputParameterAbstraction>(SpecifiedOutputParameterAbstraction.class, this, Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS, Qosannotations_pc_pcPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
      }
      return specifiedOutputParameterAbstractions_QoSAnnotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System getSystem_QoSAnnotations() {
      if (eContainerFeatureID() != Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS) return null;
      return (de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSystem_QoSAnnotations(de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System newSystem_QoSAnnotations, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newSystem_QoSAnnotations, Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSystem_QoSAnnotations(de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System newSystem_QoSAnnotations) {
      if (newSystem_QoSAnnotations != eInternalContainer() || (eContainerFeatureID() != Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS && newSystem_QoSAnnotations != null)) {
         if (EcoreUtil.isAncestor(this, newSystem_QoSAnnotations))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newSystem_QoSAnnotations != null)
            msgs = ((InternalEObject)newSystem_QoSAnnotations).eInverseAdd(this, System_pc_pcPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM, de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System.class, msgs);
         msgs = basicSetSystem_QoSAnnotations(newSystem_QoSAnnotations, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS, newSystem_QoSAnnotations, newSystem_QoSAnnotations));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<SpecifiedQoSAnnotation> getSpecifiedQoSAnnotations_QoSAnnotations() {
      if (specifiedQoSAnnotations_QoSAnnotations == null) {
         specifiedQoSAnnotations_QoSAnnotations = new EObjectContainmentWithInverseEList<SpecifiedQoSAnnotation>(SpecifiedQoSAnnotation.class, this, Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS, Qosannotations_pc_pcPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION);
      }
      return specifiedQoSAnnotations_QoSAnnotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean MultipleReliabilityAnnotationsPerExternalCallNotAllowed(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Qosannotations_pc_pcValidator.DIAGNOSTIC_SOURCE,
                   Qosannotations_pc_pcValidator.QO_SANNOTATIONS__MULTIPLE_RELIABILITY_ANNOTATIONS_PER_EXTERNAL_CALL_NOT_ALLOWED,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MultipleReliabilityAnnotationsPerExternalCallNotAllowed", EObjectValidator.getObjectLabel(this, context) }),
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
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifiedOutputParameterAbstractions_QoSAnnotations()).basicAdd(otherEnd, msgs);
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSystem_QoSAnnotations((de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System)otherEnd, msgs);
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifiedQoSAnnotations_QoSAnnotations()).basicAdd(otherEnd, msgs);
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
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
            return ((InternalEList<?>)getSpecifiedOutputParameterAbstractions_QoSAnnotations()).basicRemove(otherEnd, msgs);
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS:
            return basicSetSystem_QoSAnnotations(null, msgs);
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
            return ((InternalEList<?>)getSpecifiedQoSAnnotations_QoSAnnotations()).basicRemove(otherEnd, msgs);
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
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS:
            return eInternalContainer().eInverseRemove(this, System_pc_pcPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM, de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System.class, msgs);
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
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
            return getSpecifiedOutputParameterAbstractions_QoSAnnotations();
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS:
            return getSystem_QoSAnnotations();
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
            return getSpecifiedQoSAnnotations_QoSAnnotations();
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
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
            getSpecifiedOutputParameterAbstractions_QoSAnnotations().clear();
            getSpecifiedOutputParameterAbstractions_QoSAnnotations().addAll((Collection<? extends SpecifiedOutputParameterAbstraction>)newValue);
            return;
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS:
            setSystem_QoSAnnotations((de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System)newValue);
            return;
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
            getSpecifiedQoSAnnotations_QoSAnnotations().clear();
            getSpecifiedQoSAnnotations_QoSAnnotations().addAll((Collection<? extends SpecifiedQoSAnnotation>)newValue);
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
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
            getSpecifiedOutputParameterAbstractions_QoSAnnotations().clear();
            return;
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS:
            setSystem_QoSAnnotations((de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System)null);
            return;
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
            getSpecifiedQoSAnnotations_QoSAnnotations().clear();
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
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
            return specifiedOutputParameterAbstractions_QoSAnnotations != null && !specifiedOutputParameterAbstractions_QoSAnnotations.isEmpty();
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS:
            return getSystem_QoSAnnotations() != null;
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
            return specifiedQoSAnnotations_QoSAnnotations != null && !specifiedQoSAnnotations_QoSAnnotations.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //QoSAnnotationsImpl
