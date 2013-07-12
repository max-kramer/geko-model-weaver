/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.Core_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.PCMRandomVariable;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureRequiredRole;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.InfrastructureSignature;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.AbstractInternalControlFlowAction;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl.CallActionImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.InfrastructureCall;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.Seff_performance_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.util.Seff_performance_pc_pcValidator;

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
 * An implementation of the model object '<em><b>Infrastructure Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl.InfrastructureCallImpl#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl.InfrastructureCallImpl#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl.InfrastructureCallImpl#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl.InfrastructureCallImpl#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureCallImpl extends CallActionImpl implements InfrastructureCall {
   /**
    * The cached value of the '{@link #getSignature__InfrastructureCall() <em>Signature Infrastructure Call</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSignature__InfrastructureCall()
    * @generated
    * @ordered
    */
   protected InfrastructureSignature signature__InfrastructureCall;

   /**
    * The cached value of the '{@link #getNumberOfCalls__InfrastructureCall() <em>Number Of Calls Infrastructure Call</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNumberOfCalls__InfrastructureCall()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable numberOfCalls__InfrastructureCall;

   /**
    * The cached value of the '{@link #getRequiredRole__InfrastructureCall() <em>Required Role Infrastructure Call</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredRole__InfrastructureCall()
    * @generated
    * @ordered
    */
   protected InfrastructureRequiredRole requiredRole__InfrastructureCall;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected InfrastructureCallImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_performance_pc_pcPackage.Literals.INFRASTRUCTURE_CALL;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureSignature getSignature__InfrastructureCall() {
      if (signature__InfrastructureCall != null && signature__InfrastructureCall.eIsProxy()) {
         InternalEObject oldSignature__InfrastructureCall = (InternalEObject)signature__InfrastructureCall;
         signature__InfrastructureCall = (InfrastructureSignature)eResolveProxy(oldSignature__InfrastructureCall);
         if (signature__InfrastructureCall != oldSignature__InfrastructureCall) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL, oldSignature__InfrastructureCall, signature__InfrastructureCall));
         }
      }
      return signature__InfrastructureCall;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureSignature basicGetSignature__InfrastructureCall() {
      return signature__InfrastructureCall;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSignature__InfrastructureCall(InfrastructureSignature newSignature__InfrastructureCall) {
      InfrastructureSignature oldSignature__InfrastructureCall = signature__InfrastructureCall;
      signature__InfrastructureCall = newSignature__InfrastructureCall;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL, oldSignature__InfrastructureCall, signature__InfrastructureCall));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getNumberOfCalls__InfrastructureCall() {
      return numberOfCalls__InfrastructureCall;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetNumberOfCalls__InfrastructureCall(PCMRandomVariable newNumberOfCalls__InfrastructureCall, NotificationChain msgs) {
      PCMRandomVariable oldNumberOfCalls__InfrastructureCall = numberOfCalls__InfrastructureCall;
      numberOfCalls__InfrastructureCall = newNumberOfCalls__InfrastructureCall;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, oldNumberOfCalls__InfrastructureCall, newNumberOfCalls__InfrastructureCall);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setNumberOfCalls__InfrastructureCall(PCMRandomVariable newNumberOfCalls__InfrastructureCall) {
      if (newNumberOfCalls__InfrastructureCall != numberOfCalls__InfrastructureCall) {
         NotificationChain msgs = null;
         if (numberOfCalls__InfrastructureCall != null)
            msgs = ((InternalEObject)numberOfCalls__InfrastructureCall).eInverseRemove(this, Core_pc_pcPackage.PCM_RANDOM_VARIABLE__INFRASTRUCTURE_CALL_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newNumberOfCalls__InfrastructureCall != null)
            msgs = ((InternalEObject)newNumberOfCalls__InfrastructureCall).eInverseAdd(this, Core_pc_pcPackage.PCM_RANDOM_VARIABLE__INFRASTRUCTURE_CALL_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetNumberOfCalls__InfrastructureCall(newNumberOfCalls__InfrastructureCall, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, newNumberOfCalls__InfrastructureCall, newNumberOfCalls__InfrastructureCall));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractInternalControlFlowAction getAction__InfrastructureCall() {
      if (eContainerFeatureID() != Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL) return null;
      return (AbstractInternalControlFlowAction)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetAction__InfrastructureCall(AbstractInternalControlFlowAction newAction__InfrastructureCall, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newAction__InfrastructureCall, Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAction__InfrastructureCall(AbstractInternalControlFlowAction newAction__InfrastructureCall) {
      if (newAction__InfrastructureCall != eInternalContainer() || (eContainerFeatureID() != Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL && newAction__InfrastructureCall != null)) {
         if (EcoreUtil.isAncestor(this, newAction__InfrastructureCall))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newAction__InfrastructureCall != null)
            msgs = ((InternalEObject)newAction__InfrastructureCall).eInverseAdd(this, Seff_pc_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION, AbstractInternalControlFlowAction.class, msgs);
         msgs = basicSetAction__InfrastructureCall(newAction__InfrastructureCall, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL, newAction__InfrastructureCall, newAction__InfrastructureCall));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureRequiredRole getRequiredRole__InfrastructureCall() {
      if (requiredRole__InfrastructureCall != null && requiredRole__InfrastructureCall.eIsProxy()) {
         InternalEObject oldRequiredRole__InfrastructureCall = (InternalEObject)requiredRole__InfrastructureCall;
         requiredRole__InfrastructureCall = (InfrastructureRequiredRole)eResolveProxy(oldRequiredRole__InfrastructureCall);
         if (requiredRole__InfrastructureCall != oldRequiredRole__InfrastructureCall) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL, oldRequiredRole__InfrastructureCall, requiredRole__InfrastructureCall));
         }
      }
      return requiredRole__InfrastructureCall;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureRequiredRole basicGetRequiredRole__InfrastructureCall() {
      return requiredRole__InfrastructureCall;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiredRole__InfrastructureCall(InfrastructureRequiredRole newRequiredRole__InfrastructureCall) {
      InfrastructureRequiredRole oldRequiredRole__InfrastructureCall = requiredRole__InfrastructureCall;
      requiredRole__InfrastructureCall = newRequiredRole__InfrastructureCall;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL, oldRequiredRole__InfrastructureCall, requiredRole__InfrastructureCall));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean SignatureMustBelongToUsedRequiredRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_performance_pc_pcValidator.DIAGNOSTIC_SOURCE,
                   Seff_performance_pc_pcValidator.INFRASTRUCTURE_CALL__SIGNATURE_MUST_BELONG_TO_USED_REQUIRED_ROLE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SignatureMustBelongToUsedRequiredRole", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean ReferencedRequiredRoleMustBeRequiredByComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_performance_pc_pcValidator.DIAGNOSTIC_SOURCE,
                   Seff_performance_pc_pcValidator.INFRASTRUCTURE_CALL__REFERENCED_REQUIRED_ROLE_MUST_BE_REQUIRED_BY_COMPONENT,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReferencedRequiredRoleMustBeRequiredByComponent", EObjectValidator.getObjectLabel(this, context) }),
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
   public boolean SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_performance_pc_pcValidator.DIAGNOSTIC_SOURCE,
                   Seff_performance_pc_pcValidator.INFRASTRUCTURE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction", EObjectValidator.getObjectLabel(this, context) }),
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
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
            if (numberOfCalls__InfrastructureCall != null)
               msgs = ((InternalEObject)numberOfCalls__InfrastructureCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, null, msgs);
            return basicSetNumberOfCalls__InfrastructureCall((PCMRandomVariable)otherEnd, msgs);
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAction__InfrastructureCall((AbstractInternalControlFlowAction)otherEnd, msgs);
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
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
            return basicSetNumberOfCalls__InfrastructureCall(null, msgs);
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
            return basicSetAction__InfrastructureCall(null, msgs);
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
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
            return eInternalContainer().eInverseRemove(this, Seff_pc_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION, AbstractInternalControlFlowAction.class, msgs);
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
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
            if (resolve) return getSignature__InfrastructureCall();
            return basicGetSignature__InfrastructureCall();
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
            return getNumberOfCalls__InfrastructureCall();
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
            return getAction__InfrastructureCall();
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
            if (resolve) return getRequiredRole__InfrastructureCall();
            return basicGetRequiredRole__InfrastructureCall();
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
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
            setSignature__InfrastructureCall((InfrastructureSignature)newValue);
            return;
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
            setNumberOfCalls__InfrastructureCall((PCMRandomVariable)newValue);
            return;
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
            setAction__InfrastructureCall((AbstractInternalControlFlowAction)newValue);
            return;
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
            setRequiredRole__InfrastructureCall((InfrastructureRequiredRole)newValue);
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
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
            setSignature__InfrastructureCall((InfrastructureSignature)null);
            return;
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
            setNumberOfCalls__InfrastructureCall((PCMRandomVariable)null);
            return;
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
            setAction__InfrastructureCall((AbstractInternalControlFlowAction)null);
            return;
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
            setRequiredRole__InfrastructureCall((InfrastructureRequiredRole)null);
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
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
            return signature__InfrastructureCall != null;
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
            return numberOfCalls__InfrastructureCall != null;
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
            return getAction__InfrastructureCall() != null;
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
            return requiredRole__InfrastructureCall != null;
      }
      return super.eIsSet(featureID);
   }

} //InfrastructureCallImpl
