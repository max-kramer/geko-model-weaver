/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.Core_pcPackage;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.PCMRandomVariable;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.ProcessingResourceType;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.AbstractInternalControlFlowAction;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.ParametricResourceDemand;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.Seff_performance_pcPackage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.util.Seff_performance_pcValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.impl.ParametricResourceDemandImpl#getSpecification_ParametericResourceDemand <em>Specification Parameteric Resource Demand</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.impl.ParametricResourceDemandImpl#getRequiredResource_ParametricResourceDemand <em>Required Resource Parametric Resource Demand</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.seff_performance_pc.impl.ParametricResourceDemandImpl#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametricResourceDemandImpl extends EObjectImpl implements ParametricResourceDemand {
   /**
    * The cached value of the '{@link #getSpecification_ParametericResourceDemand() <em>Specification Parameteric Resource Demand</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSpecification_ParametericResourceDemand()
    * @generated
    * @ordered
    */
   protected PCMRandomVariable specification_ParametericResourceDemand;

   /**
    * The cached value of the '{@link #getRequiredResource_ParametricResourceDemand() <em>Required Resource Parametric Resource Demand</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredResource_ParametricResourceDemand()
    * @generated
    * @ordered
    */
   protected ProcessingResourceType requiredResource_ParametricResourceDemand;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ParametricResourceDemandImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_performance_pcPackage.Literals.PARAMETRIC_RESOURCE_DEMAND;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable getSpecification_ParametericResourceDemand() {
      return specification_ParametericResourceDemand;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSpecification_ParametericResourceDemand(PCMRandomVariable newSpecification_ParametericResourceDemand, NotificationChain msgs) {
      PCMRandomVariable oldSpecification_ParametericResourceDemand = specification_ParametericResourceDemand;
      specification_ParametericResourceDemand = newSpecification_ParametericResourceDemand;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND, oldSpecification_ParametericResourceDemand, newSpecification_ParametericResourceDemand);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSpecification_ParametericResourceDemand(PCMRandomVariable newSpecification_ParametericResourceDemand) {
      if (newSpecification_ParametericResourceDemand != specification_ParametericResourceDemand) {
         NotificationChain msgs = null;
         if (specification_ParametericResourceDemand != null)
            msgs = ((InternalEObject)specification_ParametericResourceDemand).eInverseRemove(this, Core_pcPackage.PCM_RANDOM_VARIABLE__PARAMETRIC_RESOURCE_DEMAND_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         if (newSpecification_ParametericResourceDemand != null)
            msgs = ((InternalEObject)newSpecification_ParametericResourceDemand).eInverseAdd(this, Core_pcPackage.PCM_RANDOM_VARIABLE__PARAMETRIC_RESOURCE_DEMAND_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
         msgs = basicSetSpecification_ParametericResourceDemand(newSpecification_ParametericResourceDemand, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND, newSpecification_ParametericResourceDemand, newSpecification_ParametericResourceDemand));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessingResourceType getRequiredResource_ParametricResourceDemand() {
      if (requiredResource_ParametricResourceDemand != null && requiredResource_ParametricResourceDemand.eIsProxy()) {
         InternalEObject oldRequiredResource_ParametricResourceDemand = (InternalEObject)requiredResource_ParametricResourceDemand;
         requiredResource_ParametricResourceDemand = (ProcessingResourceType)eResolveProxy(oldRequiredResource_ParametricResourceDemand);
         if (requiredResource_ParametricResourceDemand != oldRequiredResource_ParametricResourceDemand) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredResource_ParametricResourceDemand, requiredResource_ParametricResourceDemand));
         }
      }
      return requiredResource_ParametricResourceDemand;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProcessingResourceType basicGetRequiredResource_ParametricResourceDemand() {
      return requiredResource_ParametricResourceDemand;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiredResource_ParametricResourceDemand(ProcessingResourceType newRequiredResource_ParametricResourceDemand) {
      ProcessingResourceType oldRequiredResource_ParametricResourceDemand = requiredResource_ParametricResourceDemand;
      requiredResource_ParametricResourceDemand = newRequiredResource_ParametricResourceDemand;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredResource_ParametricResourceDemand, requiredResource_ParametricResourceDemand));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractInternalControlFlowAction getAction_ParametricResourceDemand() {
      if (eContainerFeatureID() != Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND) return null;
      return (AbstractInternalControlFlowAction)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetAction_ParametricResourceDemand(AbstractInternalControlFlowAction newAction_ParametricResourceDemand, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newAction_ParametricResourceDemand, Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAction_ParametricResourceDemand(AbstractInternalControlFlowAction newAction_ParametricResourceDemand) {
      if (newAction_ParametricResourceDemand != eInternalContainer() || (eContainerFeatureID() != Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND && newAction_ParametricResourceDemand != null)) {
         if (EcoreUtil.isAncestor(this, newAction_ParametricResourceDemand))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newAction_ParametricResourceDemand != null)
            msgs = ((InternalEObject)newAction_ParametricResourceDemand).eInverseAdd(this, Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION, AbstractInternalControlFlowAction.class, msgs);
         msgs = basicSetAction_ParametricResourceDemand(newAction_ParametricResourceDemand, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND, newAction_ParametricResourceDemand, newAction_ParametricResourceDemand));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean DemandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_performance_pcValidator.DIAGNOSTIC_SOURCE,
                   Seff_performance_pcValidator.PARAMETRIC_RESOURCE_DEMAND__DEMANDED_PROCESSING_RESOURCE_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DemandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction", EObjectValidator.getObjectLabel(this, context) }),
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
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
            if (specification_ParametericResourceDemand != null)
               msgs = ((InternalEObject)specification_ParametericResourceDemand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND, null, msgs);
            return basicSetSpecification_ParametericResourceDemand((PCMRandomVariable)otherEnd, msgs);
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAction_ParametricResourceDemand((AbstractInternalControlFlowAction)otherEnd, msgs);
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
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
            return basicSetSpecification_ParametericResourceDemand(null, msgs);
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
            return basicSetAction_ParametricResourceDemand(null, msgs);
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
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
            return eInternalContainer().eInverseRemove(this, Seff_pcPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION, AbstractInternalControlFlowAction.class, msgs);
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
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
            return getSpecification_ParametericResourceDemand();
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            if (resolve) return getRequiredResource_ParametricResourceDemand();
            return basicGetRequiredResource_ParametricResourceDemand();
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
            return getAction_ParametricResourceDemand();
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
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
            setSpecification_ParametericResourceDemand((PCMRandomVariable)newValue);
            return;
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            setRequiredResource_ParametricResourceDemand((ProcessingResourceType)newValue);
            return;
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
            setAction_ParametricResourceDemand((AbstractInternalControlFlowAction)newValue);
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
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
            setSpecification_ParametericResourceDemand((PCMRandomVariable)null);
            return;
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            setRequiredResource_ParametricResourceDemand((ProcessingResourceType)null);
            return;
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
            setAction_ParametricResourceDemand((AbstractInternalControlFlowAction)null);
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
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
            return specification_ParametericResourceDemand != null;
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            return requiredResource_ParametricResourceDemand != null;
         case Seff_performance_pcPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
            return getAction_ParametricResourceDemand() != null;
      }
      return super.eIsSet(featureID);
   }

} //ParametricResourceDemandImpl
