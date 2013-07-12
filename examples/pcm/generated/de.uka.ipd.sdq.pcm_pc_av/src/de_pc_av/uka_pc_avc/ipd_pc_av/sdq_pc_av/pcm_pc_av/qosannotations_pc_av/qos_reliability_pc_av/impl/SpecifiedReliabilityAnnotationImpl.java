/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.impl.SpecifiedQoSAnnotationImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.Qos_reliability_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.SpecifiedReliabilityAnnotation;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.util.Qos_reliability_pc_avValidator;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.ExternalFailureOccurrenceDescription;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.Reliability_pc_avPackage;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specified Reliability Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.qos_reliability_pc_av.impl.SpecifiedReliabilityAnnotationImpl#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecifiedReliabilityAnnotationImpl extends SpecifiedQoSAnnotationImpl implements SpecifiedReliabilityAnnotation {
   /**
    * The cached value of the '{@link #getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation() <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()
    * @generated
    * @ordered
    */
   protected EList<ExternalFailureOccurrenceDescription> externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SpecifiedReliabilityAnnotationImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Qos_reliability_pc_avPackage.Literals.SPECIFIED_RELIABILITY_ANNOTATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ExternalFailureOccurrenceDescription> getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation() {
      if (externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation == null) {
         externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation = new EObjectContainmentWithInverseEList<ExternalFailureOccurrenceDescription>(ExternalFailureOccurrenceDescription.class, this, Qos_reliability_pc_avPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION, Reliability_pc_avPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
      }
      return externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Qos_reliability_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Qos_reliability_pc_avValidator.SPECIFIED_RELIABILITY_ANNOTATION__SPECIFIED_RELIABILITY_ANNOTATION_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Qos_reliability_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Qos_reliability_pc_avValidator.SPECIFIED_RELIABILITY_ANNOTATION__SUM_OF_RELIABILITY_ANNOTATION_FAILURE_PROBABILITIES_MUST_NOT_EXCEED1,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Qos_reliability_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Qos_reliability_pc_avValidator.SPECIFIED_RELIABILITY_ANNOTATION__MULTIPLE_EXTERNAL_OCCURRENCE_DESCRIPTIONS_PER_FAILURE_TYPE_NOT_ALLOWED,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed", EObjectValidator.getObjectLabel(this, context) }),
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
         case Qos_reliability_pc_avPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()).basicAdd(otherEnd, msgs);
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
         case Qos_reliability_pc_avPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
            return ((InternalEList<?>)getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()).basicRemove(otherEnd, msgs);
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
         case Qos_reliability_pc_avPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
            return getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();
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
         case Qos_reliability_pc_avPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
            getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation().clear();
            getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation().addAll((Collection<? extends ExternalFailureOccurrenceDescription>)newValue);
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
         case Qos_reliability_pc_avPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
            getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation().clear();
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
         case Qos_reliability_pc_avPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
            return externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation != null && !externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //SpecifiedReliabilityAnnotationImpl
