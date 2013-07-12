/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.impl.EntityImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.AbstractUserAction;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.BranchTransition;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Loop;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.ScenarioBehaviour;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.UsageScenario;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Usagemodel_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.util.Usagemodel_pc_pcValidator;

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
 * An implementation of the model object '<em><b>Scenario Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl.ScenarioBehaviourImpl#getUsageScenario_SenarioBehaviour <em>Usage Scenario Senario Behaviour</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl.ScenarioBehaviourImpl#getBranchTransition_ScenarioBehaviour <em>Branch Transition Scenario Behaviour</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl.ScenarioBehaviourImpl#getLoop_ScenarioBehaviour <em>Loop Scenario Behaviour</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl.ScenarioBehaviourImpl#getActions_ScenarioBehaviour <em>Actions Scenario Behaviour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioBehaviourImpl extends EntityImpl implements ScenarioBehaviour {
   /**
    * The cached value of the '{@link #getActions_ScenarioBehaviour() <em>Actions Scenario Behaviour</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getActions_ScenarioBehaviour()
    * @generated
    * @ordered
    */
   protected EList<AbstractUserAction> actions_ScenarioBehaviour;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ScenarioBehaviourImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Usagemodel_pc_pcPackage.Literals.SCENARIO_BEHAVIOUR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UsageScenario getUsageScenario_SenarioBehaviour() {
      if (eContainerFeatureID() != Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR) return null;
      return (UsageScenario)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetUsageScenario_SenarioBehaviour(UsageScenario newUsageScenario_SenarioBehaviour, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newUsageScenario_SenarioBehaviour, Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUsageScenario_SenarioBehaviour(UsageScenario newUsageScenario_SenarioBehaviour) {
      if (newUsageScenario_SenarioBehaviour != eInternalContainer() || (eContainerFeatureID() != Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR && newUsageScenario_SenarioBehaviour != null)) {
         if (EcoreUtil.isAncestor(this, newUsageScenario_SenarioBehaviour))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newUsageScenario_SenarioBehaviour != null)
            msgs = ((InternalEObject)newUsageScenario_SenarioBehaviour).eInverseAdd(this, Usagemodel_pc_pcPackage.USAGE_SCENARIO__SCENARIO_BEHAVIOUR_USAGE_SCENARIO, UsageScenario.class, msgs);
         msgs = basicSetUsageScenario_SenarioBehaviour(newUsageScenario_SenarioBehaviour, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR, newUsageScenario_SenarioBehaviour, newUsageScenario_SenarioBehaviour));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BranchTransition getBranchTransition_ScenarioBehaviour() {
      if (eContainerFeatureID() != Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR) return null;
      return (BranchTransition)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBranchTransition_ScenarioBehaviour(BranchTransition newBranchTransition_ScenarioBehaviour, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newBranchTransition_ScenarioBehaviour, Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBranchTransition_ScenarioBehaviour(BranchTransition newBranchTransition_ScenarioBehaviour) {
      if (newBranchTransition_ScenarioBehaviour != eInternalContainer() || (eContainerFeatureID() != Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR && newBranchTransition_ScenarioBehaviour != null)) {
         if (EcoreUtil.isAncestor(this, newBranchTransition_ScenarioBehaviour))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newBranchTransition_ScenarioBehaviour != null)
            msgs = ((InternalEObject)newBranchTransition_ScenarioBehaviour).eInverseAdd(this, Usagemodel_pc_pcPackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION, BranchTransition.class, msgs);
         msgs = basicSetBranchTransition_ScenarioBehaviour(newBranchTransition_ScenarioBehaviour, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR, newBranchTransition_ScenarioBehaviour, newBranchTransition_ScenarioBehaviour));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Loop getLoop_ScenarioBehaviour() {
      if (eContainerFeatureID() != Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR) return null;
      return (Loop)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetLoop_ScenarioBehaviour(Loop newLoop_ScenarioBehaviour, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newLoop_ScenarioBehaviour, Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLoop_ScenarioBehaviour(Loop newLoop_ScenarioBehaviour) {
      if (newLoop_ScenarioBehaviour != eInternalContainer() || (eContainerFeatureID() != Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR && newLoop_ScenarioBehaviour != null)) {
         if (EcoreUtil.isAncestor(this, newLoop_ScenarioBehaviour))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newLoop_ScenarioBehaviour != null)
            msgs = ((InternalEObject)newLoop_ScenarioBehaviour).eInverseAdd(this, Usagemodel_pc_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP, Loop.class, msgs);
         msgs = basicSetLoop_ScenarioBehaviour(newLoop_ScenarioBehaviour, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR, newLoop_ScenarioBehaviour, newLoop_ScenarioBehaviour));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<AbstractUserAction> getActions_ScenarioBehaviour() {
      if (actions_ScenarioBehaviour == null) {
         actions_ScenarioBehaviour = new EObjectContainmentWithInverseEList<AbstractUserAction>(AbstractUserAction.class, this, Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR, Usagemodel_pc_pcPackage.ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION);
      }
      return actions_ScenarioBehaviour;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean Exactlyonestart(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                   Usagemodel_pc_pcValidator.SCENARIO_BEHAVIOUR__EXACTLYONESTART,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Exactlyonestart", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean Exactlyonestop(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                   Usagemodel_pc_pcValidator.SCENARIO_BEHAVIOUR__EXACTLYONESTOP,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Exactlyonestop", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                   Usagemodel_pc_pcValidator.SCENARIO_BEHAVIOUR__EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor", EObjectValidator.getObjectLabel(this, context) }),
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
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetUsageScenario_SenarioBehaviour((UsageScenario)otherEnd, msgs);
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetBranchTransition_ScenarioBehaviour((BranchTransition)otherEnd, msgs);
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetLoop_ScenarioBehaviour((Loop)otherEnd, msgs);
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions_ScenarioBehaviour()).basicAdd(otherEnd, msgs);
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
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
            return basicSetUsageScenario_SenarioBehaviour(null, msgs);
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
            return basicSetBranchTransition_ScenarioBehaviour(null, msgs);
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
            return basicSetLoop_ScenarioBehaviour(null, msgs);
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
            return ((InternalEList<?>)getActions_ScenarioBehaviour()).basicRemove(otherEnd, msgs);
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
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
            return eInternalContainer().eInverseRemove(this, Usagemodel_pc_pcPackage.USAGE_SCENARIO__SCENARIO_BEHAVIOUR_USAGE_SCENARIO, UsageScenario.class, msgs);
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
            return eInternalContainer().eInverseRemove(this, Usagemodel_pc_pcPackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION, BranchTransition.class, msgs);
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
            return eInternalContainer().eInverseRemove(this, Usagemodel_pc_pcPackage.LOOP__BODY_BEHAVIOUR_LOOP, Loop.class, msgs);
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
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
            return getUsageScenario_SenarioBehaviour();
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
            return getBranchTransition_ScenarioBehaviour();
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
            return getLoop_ScenarioBehaviour();
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
            return getActions_ScenarioBehaviour();
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
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
            setUsageScenario_SenarioBehaviour((UsageScenario)newValue);
            return;
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
            setBranchTransition_ScenarioBehaviour((BranchTransition)newValue);
            return;
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
            setLoop_ScenarioBehaviour((Loop)newValue);
            return;
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
            getActions_ScenarioBehaviour().clear();
            getActions_ScenarioBehaviour().addAll((Collection<? extends AbstractUserAction>)newValue);
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
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
            setUsageScenario_SenarioBehaviour((UsageScenario)null);
            return;
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
            setBranchTransition_ScenarioBehaviour((BranchTransition)null);
            return;
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
            setLoop_ScenarioBehaviour((Loop)null);
            return;
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
            getActions_ScenarioBehaviour().clear();
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
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
            return getUsageScenario_SenarioBehaviour() != null;
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
            return getBranchTransition_ScenarioBehaviour() != null;
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
            return getLoop_ScenarioBehaviour() != null;
         case Usagemodel_pc_pcPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
            return actions_ScenarioBehaviour != null && !actions_ScenarioBehaviour.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //ScenarioBehaviourImpl
