/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Branch;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.BranchTransition;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Usagemodel_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.util.Usagemodel_pc_pcValidator;

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
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl.BranchImpl#getBranchTransitions_Branch <em>Branch Transitions Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends AbstractUserActionImpl implements Branch {
   /**
    * The cached value of the '{@link #getBranchTransitions_Branch() <em>Branch Transitions Branch</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBranchTransitions_Branch()
    * @generated
    * @ordered
    */
   protected EList<BranchTransition> branchTransitions_Branch;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected BranchImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Usagemodel_pc_pcPackage.Literals.BRANCH;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<BranchTransition> getBranchTransitions_Branch() {
      if (branchTransitions_Branch == null) {
         branchTransitions_Branch = new EObjectContainmentWithInverseEList<BranchTransition>(BranchTransition.class, this, Usagemodel_pc_pcPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH, Usagemodel_pc_pcPackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION);
      }
      return branchTransitions_Branch;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean AllBranchProbabilitiesMustSumUpTo1(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Usagemodel_pc_pcValidator.DIAGNOSTIC_SOURCE,
                   Usagemodel_pc_pcValidator.BRANCH__ALL_BRANCH_PROBABILITIES_MUST_SUM_UP_TO1,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AllBranchProbabilitiesMustSumUpTo1", EObjectValidator.getObjectLabel(this, context) }),
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
         case Usagemodel_pc_pcPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getBranchTransitions_Branch()).basicAdd(otherEnd, msgs);
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
         case Usagemodel_pc_pcPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
            return ((InternalEList<?>)getBranchTransitions_Branch()).basicRemove(otherEnd, msgs);
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
         case Usagemodel_pc_pcPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
            return getBranchTransitions_Branch();
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
         case Usagemodel_pc_pcPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
            getBranchTransitions_Branch().clear();
            getBranchTransitions_Branch().addAll((Collection<? extends BranchTransition>)newValue);
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
         case Usagemodel_pc_pcPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
            getBranchTransitions_Branch().clear();
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
         case Usagemodel_pc_pcPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
            return branchTransitions_Branch != null && !branchTransitions_Branch.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //BranchImpl
