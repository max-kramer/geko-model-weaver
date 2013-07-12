/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.InternalFailureOccurrenceDescription;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.Reliability_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.InternalAction;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.util.Seff_pcValidator;

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
 * An implementation of the model object '<em><b>Internal Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.impl.InternalActionImpl#getInternalFailureOccurrenceDescriptions__InternalAction <em>Internal Failure Occurrence Descriptions Internal Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalActionImpl extends AbstractInternalControlFlowActionImpl implements InternalAction {
   /**
    * The cached value of the '{@link #getInternalFailureOccurrenceDescriptions__InternalAction() <em>Internal Failure Occurrence Descriptions Internal Action</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInternalFailureOccurrenceDescriptions__InternalAction()
    * @generated
    * @ordered
    */
   protected EList<InternalFailureOccurrenceDescription> internalFailureOccurrenceDescriptions__InternalAction;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InternalActionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_pcPackage.Literals.INTERNAL_ACTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<InternalFailureOccurrenceDescription> getInternalFailureOccurrenceDescriptions__InternalAction() {
      if (internalFailureOccurrenceDescriptions__InternalAction == null) {
         internalFailureOccurrenceDescriptions__InternalAction = new EObjectContainmentWithInverseEList<InternalFailureOccurrenceDescription>(InternalFailureOccurrenceDescription.class, this, Seff_pcPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION, Reliability_pcPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
      }
      return internalFailureOccurrenceDescriptions__InternalAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean MultipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_pcValidator.DIAGNOSTIC_SOURCE,
                   Seff_pcValidator.INTERNAL_ACTION__MULTIPLE_INTERNAL_OCCURRENCE_DESCRIPTIONS_PER_FAILURE_TYPE_NOT_ALLOWED,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MultipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean SumOfInternalActionFailureProbabilitiesMustNotExceed1(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_pcValidator.DIAGNOSTIC_SOURCE,
                   Seff_pcValidator.INTERNAL_ACTION__SUM_OF_INTERNAL_ACTION_FAILURE_PROBABILITIES_MUST_NOT_EXCEED1,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SumOfInternalActionFailureProbabilitiesMustNotExceed1", EObjectValidator.getObjectLabel(this, context) }),
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
         case Seff_pcPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getInternalFailureOccurrenceDescriptions__InternalAction()).basicAdd(otherEnd, msgs);
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
         case Seff_pcPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION:
            return ((InternalEList<?>)getInternalFailureOccurrenceDescriptions__InternalAction()).basicRemove(otherEnd, msgs);
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
         case Seff_pcPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION:
            return getInternalFailureOccurrenceDescriptions__InternalAction();
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
         case Seff_pcPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION:
            getInternalFailureOccurrenceDescriptions__InternalAction().clear();
            getInternalFailureOccurrenceDescriptions__InternalAction().addAll((Collection<? extends InternalFailureOccurrenceDescription>)newValue);
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
         case Seff_pcPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION:
            getInternalFailureOccurrenceDescriptions__InternalAction().clear();
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
         case Seff_pcPackage.INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION:
            return internalFailureOccurrenceDescriptions__InternalAction != null && !internalFailureOccurrenceDescriptions__InternalAction.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //InternalActionImpl
