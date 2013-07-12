/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.Core_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.PCMRandomVariable;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.ClosedWorkload;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.Usagemodel_pc_avPackage;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.util.Usagemodel_pc_avValidator;

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
 * An implementation of the model object '<em><b>Closed Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.impl.ClosedWorkloadImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.usagemodel_pc_av.impl.ClosedWorkloadImpl#getThinkTime_ClosedWorkload <em>Think Time Closed Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClosedWorkloadImpl extends WorkloadImpl implements ClosedWorkload {
   /**
    * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPopulation()
    * @generated
    * @ordered
    */
   protected static final int POPULATION_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPopulation()
    * @generated
    * @ordered
    */
   protected int population = POPULATION_EDEFAULT;

   /**
    * The cached value of the '{@link #getThinkTime_ClosedWorkload() <em>Think Time Closed Workload</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getThinkTime_ClosedWorkload()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable thinkTime_ClosedWorkload;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ClosedWorkloadImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Usagemodel_pc_avPackage.Literals.CLOSED_WORKLOAD;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getPopulation() {
      return population;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPopulation(int newPopulation) {
      int oldPopulation = population;
      population = newPopulation;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_pc_avPackage.CLOSED_WORKLOAD__POPULATION, oldPopulation, population));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getThinkTime_ClosedWorkload() {
      return thinkTime_ClosedWorkload;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetThinkTime_ClosedWorkload(PCMRandomVariable newThinkTime_ClosedWorkload, NotificationChain msgs) {
      PCMRandomVariable oldThinkTime_ClosedWorkload = thinkTime_ClosedWorkload;
      thinkTime_ClosedWorkload = newThinkTime_ClosedWorkload;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Usagemodel_pc_avPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD, oldThinkTime_ClosedWorkload, newThinkTime_ClosedWorkload);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setThinkTime_ClosedWorkload(PCMRandomVariable newThinkTime_ClosedWorkload) {
      if (newThinkTime_ClosedWorkload != thinkTime_ClosedWorkload) {
         NotificationChain msgs = null;
         if (thinkTime_ClosedWorkload != null)
            msgs = ((InternalEObject)thinkTime_ClosedWorkload).eInverseRemove(this, Core_pc_avPackage.PCM_RANDOM_VARIABLE__CLOSED_WORKLOAD_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newThinkTime_ClosedWorkload != null)
            msgs = ((InternalEObject)newThinkTime_ClosedWorkload).eInverseAdd(this, Core_pc_avPackage.PCM_RANDOM_VARIABLE__CLOSED_WORKLOAD_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetThinkTime_ClosedWorkload(newThinkTime_ClosedWorkload, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_pc_avPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD, newThinkTime_ClosedWorkload, newThinkTime_ClosedWorkload));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean PopulationInClosedWorkloadNeedsToBeSpecified(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Usagemodel_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Usagemodel_pc_avValidator.CLOSED_WORKLOAD__POPULATION_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_SPECIFIED,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PopulationInClosedWorkloadNeedsToBeSpecified", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean ThinkTimeInClosedWorkloadNeedsToBeSpecified(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Usagemodel_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Usagemodel_pc_avValidator.CLOSED_WORKLOAD__THINK_TIME_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_SPECIFIED,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ThinkTimeInClosedWorkloadNeedsToBeSpecified", EObjectValidator.getObjectLabel(this, context) }),
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
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
            if (thinkTime_ClosedWorkload != null)
               msgs = ((InternalEObject)thinkTime_ClosedWorkload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Usagemodel_pc_avPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD, null, msgs);
            return basicSetThinkTime_ClosedWorkload((PCMRandomVariable)otherEnd, msgs);
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
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
            return basicSetThinkTime_ClosedWorkload(null, msgs);
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
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__POPULATION:
            return getPopulation();
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
            return getThinkTime_ClosedWorkload();
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
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__POPULATION:
            setPopulation((Integer)newValue);
            return;
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
            setThinkTime_ClosedWorkload((PCMRandomVariable)newValue);
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
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__POPULATION:
            setPopulation(POPULATION_EDEFAULT);
            return;
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
            setThinkTime_ClosedWorkload((PCMRandomVariable)null);
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
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__POPULATION:
            return population != POPULATION_EDEFAULT;
         case Usagemodel_pc_avPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
            return thinkTime_ClosedWorkload != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (population: ");
      result.append(population);
      result.append(')');
      return result.toString();
   }

} //ClosedWorkloadImpl
