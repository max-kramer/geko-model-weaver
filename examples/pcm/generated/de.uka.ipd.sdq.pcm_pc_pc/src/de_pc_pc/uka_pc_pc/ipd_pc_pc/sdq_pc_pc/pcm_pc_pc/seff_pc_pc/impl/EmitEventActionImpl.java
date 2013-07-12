/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.Parameter_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.VariableUsage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.EventType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.SourceRole;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.CallAction;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.EmitEventAction;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emit Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl.EmitEventActionImpl#getInputVariableUsages__CallAction <em>Input Variable Usages Call Action</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl.EmitEventActionImpl#getEventType__EmitEventAction <em>Event Type Emit Event Action</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl.EmitEventActionImpl#getSourceRole__EmitEventAction <em>Source Role Emit Event Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmitEventActionImpl extends AbstractActionImpl implements EmitEventAction {
   /**
    * The cached value of the '{@link #getInputVariableUsages__CallAction() <em>Input Variable Usages Call Action</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInputVariableUsages__CallAction()
    * @generated
    * @ordered
    */
   protected EList<VariableUsage> inputVariableUsages__CallAction;

   /**
    * The cached value of the '{@link #getEventType__EmitEventAction() <em>Event Type Emit Event Action</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEventType__EmitEventAction()
    * @generated
    * @ordered
    */
   protected EventType eventType__EmitEventAction;

   /**
    * The cached value of the '{@link #getSourceRole__EmitEventAction() <em>Source Role Emit Event Action</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSourceRole__EmitEventAction()
    * @generated
    * @ordered
    */
   protected SourceRole sourceRole__EmitEventAction;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected EmitEventActionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_pc_pcPackage.Literals.EMIT_EVENT_ACTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<VariableUsage> getInputVariableUsages__CallAction() {
      if (inputVariableUsages__CallAction == null) {
         inputVariableUsages__CallAction = new EObjectContainmentWithInverseEList<VariableUsage>(VariableUsage.class, this, Seff_pc_pcPackage.EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION, Parameter_pc_pcPackage.VARIABLE_USAGE__CALL_ACTION_VARIABLE_USAGE);
      }
      return inputVariableUsages__CallAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventType getEventType__EmitEventAction() {
      if (eventType__EmitEventAction != null && eventType__EmitEventAction.eIsProxy()) {
         InternalEObject oldEventType__EmitEventAction = (InternalEObject)eventType__EmitEventAction;
         eventType__EmitEventAction = (EventType)eResolveProxy(oldEventType__EmitEventAction);
         if (eventType__EmitEventAction != oldEventType__EmitEventAction) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_pc_pcPackage.EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION, oldEventType__EmitEventAction, eventType__EmitEventAction));
         }
      }
      return eventType__EmitEventAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventType basicGetEventType__EmitEventAction() {
      return eventType__EmitEventAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEventType__EmitEventAction(EventType newEventType__EmitEventAction) {
      EventType oldEventType__EmitEventAction = eventType__EmitEventAction;
      eventType__EmitEventAction = newEventType__EmitEventAction;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pc_pcPackage.EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION, oldEventType__EmitEventAction, eventType__EmitEventAction));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SourceRole getSourceRole__EmitEventAction() {
      if (sourceRole__EmitEventAction != null && sourceRole__EmitEventAction.eIsProxy()) {
         InternalEObject oldSourceRole__EmitEventAction = (InternalEObject)sourceRole__EmitEventAction;
         sourceRole__EmitEventAction = (SourceRole)eResolveProxy(oldSourceRole__EmitEventAction);
         if (sourceRole__EmitEventAction != oldSourceRole__EmitEventAction) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_pc_pcPackage.EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION, oldSourceRole__EmitEventAction, sourceRole__EmitEventAction));
         }
      }
      return sourceRole__EmitEventAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SourceRole basicGetSourceRole__EmitEventAction() {
      return sourceRole__EmitEventAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSourceRole__EmitEventAction(SourceRole newSourceRole__EmitEventAction) {
      SourceRole oldSourceRole__EmitEventAction = sourceRole__EmitEventAction;
      sourceRole__EmitEventAction = newSourceRole__EmitEventAction;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pc_pcPackage.EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION, oldSourceRole__EmitEventAction, sourceRole__EmitEventAction));
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
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputVariableUsages__CallAction()).basicAdd(otherEnd, msgs);
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
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
            return ((InternalEList<?>)getInputVariableUsages__CallAction()).basicRemove(otherEnd, msgs);
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
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
            return getInputVariableUsages__CallAction();
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION:
            if (resolve) return getEventType__EmitEventAction();
            return basicGetEventType__EmitEventAction();
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION:
            if (resolve) return getSourceRole__EmitEventAction();
            return basicGetSourceRole__EmitEventAction();
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
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
            getInputVariableUsages__CallAction().clear();
            getInputVariableUsages__CallAction().addAll((Collection<? extends VariableUsage>)newValue);
            return;
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION:
            setEventType__EmitEventAction((EventType)newValue);
            return;
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION:
            setSourceRole__EmitEventAction((SourceRole)newValue);
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
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
            getInputVariableUsages__CallAction().clear();
            return;
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION:
            setEventType__EmitEventAction((EventType)null);
            return;
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION:
            setSourceRole__EmitEventAction((SourceRole)null);
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
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
            return inputVariableUsages__CallAction != null && !inputVariableUsages__CallAction.isEmpty();
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION:
            return eventType__EmitEventAction != null;
         case Seff_pc_pcPackage.EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION:
            return sourceRole__EmitEventAction != null;
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
      if (baseClass == CallAction.class) {
         switch (derivedFeatureID) {
            case Seff_pc_pcPackage.EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION: return Seff_pc_pcPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;
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
      if (baseClass == CallAction.class) {
         switch (baseFeatureID) {
            case Seff_pc_pcPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION: return Seff_pc_pcPackage.EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} //EmitEventActionImpl
