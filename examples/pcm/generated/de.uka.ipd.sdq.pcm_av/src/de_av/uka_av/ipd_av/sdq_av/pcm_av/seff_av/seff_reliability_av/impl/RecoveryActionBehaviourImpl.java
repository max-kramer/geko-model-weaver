/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.AbstractAction;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.AbstractBranchTransition;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.AbstractLoopAction;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ResourceDemandingBehaviour;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.RecoveryAction;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.RecoveryActionBehaviour;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.Seff_reliability_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.util.Seff_reliability_avValidator;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.util.Seff_avValidator;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recovery Action Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.impl.RecoveryActionBehaviourImpl#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.impl.RecoveryActionBehaviourImpl#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.impl.RecoveryActionBehaviourImpl#getSteps_Behaviour <em>Steps Behaviour</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.impl.RecoveryActionBehaviourImpl#getFailureHandlingAlternatives__RecoveryActionBehaviour <em>Failure Handling Alternatives Recovery Action Behaviour</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.impl.RecoveryActionBehaviourImpl#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecoveryActionBehaviourImpl extends FailureHandlingEntityImpl implements RecoveryActionBehaviour {
   /**
    * The cached value of the '{@link #getSteps_Behaviour() <em>Steps Behaviour</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSteps_Behaviour()
    * @generated
    * @ordered
    */
   protected EList<AbstractAction> steps_Behaviour;

   /**
    * The cached value of the '{@link #getFailureHandlingAlternatives__RecoveryActionBehaviour() <em>Failure Handling Alternatives Recovery Action Behaviour</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFailureHandlingAlternatives__RecoveryActionBehaviour()
    * @generated
    * @ordered
    */
   protected EList<RecoveryActionBehaviour> failureHandlingAlternatives__RecoveryActionBehaviour;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RecoveryActionBehaviourImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_reliability_avPackage.Literals.RECOVERY_ACTION_BEHAVIOUR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractLoopAction getAbstractLoopAction_ResourceDemandingBehaviour() {
      if (eContainerFeatureID() != Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR) return null;
      return (AbstractLoopAction)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction newAbstractLoopAction_ResourceDemandingBehaviour, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newAbstractLoopAction_ResourceDemandingBehaviour, Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction newAbstractLoopAction_ResourceDemandingBehaviour) {
      if (newAbstractLoopAction_ResourceDemandingBehaviour != eInternalContainer() || (eContainerFeatureID() != Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR && newAbstractLoopAction_ResourceDemandingBehaviour != null)) {
         if (EcoreUtil.isAncestor(this, newAbstractLoopAction_ResourceDemandingBehaviour))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newAbstractLoopAction_ResourceDemandingBehaviour != null)
            msgs = ((InternalEObject)newAbstractLoopAction_ResourceDemandingBehaviour).eInverseAdd(this, Seff_avPackage.ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP, AbstractLoopAction.class, msgs);
         msgs = basicSetAbstractLoopAction_ResourceDemandingBehaviour(newAbstractLoopAction_ResourceDemandingBehaviour, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR, newAbstractLoopAction_ResourceDemandingBehaviour, newAbstractLoopAction_ResourceDemandingBehaviour));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractBranchTransition getAbstractBranchTransition_ResourceDemandingBehaviour() {
      if (eContainerFeatureID() != Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR) return null;
      return (AbstractBranchTransition)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition newAbstractBranchTransition_ResourceDemandingBehaviour, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newAbstractBranchTransition_ResourceDemandingBehaviour, Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition newAbstractBranchTransition_ResourceDemandingBehaviour) {
      if (newAbstractBranchTransition_ResourceDemandingBehaviour != eInternalContainer() || (eContainerFeatureID() != Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR && newAbstractBranchTransition_ResourceDemandingBehaviour != null)) {
         if (EcoreUtil.isAncestor(this, newAbstractBranchTransition_ResourceDemandingBehaviour))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newAbstractBranchTransition_ResourceDemandingBehaviour != null)
            msgs = ((InternalEObject)newAbstractBranchTransition_ResourceDemandingBehaviour).eInverseAdd(this, Seff_avPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION, AbstractBranchTransition.class, msgs);
         msgs = basicSetAbstractBranchTransition_ResourceDemandingBehaviour(newAbstractBranchTransition_ResourceDemandingBehaviour, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR, newAbstractBranchTransition_ResourceDemandingBehaviour, newAbstractBranchTransition_ResourceDemandingBehaviour));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<AbstractAction> getSteps_Behaviour() {
      if (steps_Behaviour == null) {
         steps_Behaviour = new EObjectContainmentWithInverseEList<AbstractAction>(AbstractAction.class, this, Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR, Seff_avPackage.ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION);
      }
      return steps_Behaviour;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<RecoveryActionBehaviour> getFailureHandlingAlternatives__RecoveryActionBehaviour() {
      if (failureHandlingAlternatives__RecoveryActionBehaviour == null) {
         failureHandlingAlternatives__RecoveryActionBehaviour = new EObjectResolvingEList<RecoveryActionBehaviour>(RecoveryActionBehaviour.class, this, Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR);
      }
      return failureHandlingAlternatives__RecoveryActionBehaviour;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RecoveryAction getRecoveryAction__RecoveryActionBehaviour() {
      if (eContainerFeatureID() != Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR) return null;
      return (RecoveryAction)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRecoveryAction__RecoveryActionBehaviour(RecoveryAction newRecoveryAction__RecoveryActionBehaviour, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newRecoveryAction__RecoveryActionBehaviour, Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRecoveryAction__RecoveryActionBehaviour(RecoveryAction newRecoveryAction__RecoveryActionBehaviour) {
      if (newRecoveryAction__RecoveryActionBehaviour != eInternalContainer() || (eContainerFeatureID() != Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR && newRecoveryAction__RecoveryActionBehaviour != null)) {
         if (EcoreUtil.isAncestor(this, newRecoveryAction__RecoveryActionBehaviour))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newRecoveryAction__RecoveryActionBehaviour != null)
            msgs = ((InternalEObject)newRecoveryAction__RecoveryActionBehaviour).eInverseAdd(this, Seff_reliability_avPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION, RecoveryAction.class, msgs);
         msgs = basicSetRecoveryAction__RecoveryActionBehaviour(newRecoveryAction__RecoveryActionBehaviour, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR, newRecoveryAction__RecoveryActionBehaviour, newRecoveryAction__RecoveryActionBehaviour));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean RecoveryActionBehaviourHasOnlyOnePredecessor(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_reliability_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_reliability_avValidator.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_HAS_ONLY_ONE_PREDECESSOR,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RecoveryActionBehaviourHasOnlyOnePredecessor", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean RecoveryActionBehaviourIsNotSuccessorOfItself(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_reliability_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_reliability_avValidator.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_IS_NOT_SUCCESSOR_OF_ITSELF,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RecoveryActionBehaviourIsNotSuccessorOfItself", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_reliability_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_reliability_avValidator.RECOVERY_ACTION_BEHAVIOUR__SUCCESSORS_OF_RECOVERY_ACTION_BEHAVIOUR_HANDLE_DISJOINT_FAILURE_TYPES,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean ExactlyOneStopAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_avValidator.RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_STOP_ACTION,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExactlyOneStopAction", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean ExactlyOneStartAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_avValidator.RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_START_ACTION,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExactlyOneStartAction", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_avValidator.RESOURCE_DEMANDING_BEHAVIOUR__EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor", EObjectValidator.getObjectLabel(this, context) }),
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
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)otherEnd, msgs);
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)otherEnd, msgs);
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps_Behaviour()).basicAdd(otherEnd, msgs);
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetRecoveryAction__RecoveryActionBehaviour((RecoveryAction)otherEnd, msgs);
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
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            return basicSetAbstractLoopAction_ResourceDemandingBehaviour(null, msgs);
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            return basicSetAbstractBranchTransition_ResourceDemandingBehaviour(null, msgs);
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
            return ((InternalEList<?>)getSteps_Behaviour()).basicRemove(otherEnd, msgs);
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
            return basicSetRecoveryAction__RecoveryActionBehaviour(null, msgs);
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
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            return eInternalContainer().eInverseRemove(this, Seff_avPackage.ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP, AbstractLoopAction.class, msgs);
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            return eInternalContainer().eInverseRemove(this, Seff_avPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION, AbstractBranchTransition.class, msgs);
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
            return eInternalContainer().eInverseRemove(this, Seff_reliability_avPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION, RecoveryAction.class, msgs);
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
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            return getAbstractLoopAction_ResourceDemandingBehaviour();
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            return getAbstractBranchTransition_ResourceDemandingBehaviour();
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
            return getSteps_Behaviour();
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR:
            return getFailureHandlingAlternatives__RecoveryActionBehaviour();
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
            return getRecoveryAction__RecoveryActionBehaviour();
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
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            setAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)newValue);
            return;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            setAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)newValue);
            return;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
            getSteps_Behaviour().clear();
            getSteps_Behaviour().addAll((Collection<? extends AbstractAction>)newValue);
            return;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR:
            getFailureHandlingAlternatives__RecoveryActionBehaviour().clear();
            getFailureHandlingAlternatives__RecoveryActionBehaviour().addAll((Collection<? extends RecoveryActionBehaviour>)newValue);
            return;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
            setRecoveryAction__RecoveryActionBehaviour((RecoveryAction)newValue);
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
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            setAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)null);
            return;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            setAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)null);
            return;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
            getSteps_Behaviour().clear();
            return;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR:
            getFailureHandlingAlternatives__RecoveryActionBehaviour().clear();
            return;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
            setRecoveryAction__RecoveryActionBehaviour((RecoveryAction)null);
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
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            return getAbstractLoopAction_ResourceDemandingBehaviour() != null;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            return getAbstractBranchTransition_ResourceDemandingBehaviour() != null;
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
            return steps_Behaviour != null && !steps_Behaviour.isEmpty();
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR:
            return failureHandlingAlternatives__RecoveryActionBehaviour != null && !failureHandlingAlternatives__RecoveryActionBehaviour.isEmpty();
         case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
            return getRecoveryAction__RecoveryActionBehaviour() != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == ResourceDemandingBehaviour.class) {
         switch (derivedFeatureID) {
            case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;
            case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;
            case Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR: return Seff_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR;
            default: return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == ResourceDemandingBehaviour.class) {
         switch (baseFeatureID) {
            case Seff_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;
            case Seff_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;
            case Seff_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR: return Seff_reliability_avPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR;
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} //RecoveryActionBehaviourImpl
