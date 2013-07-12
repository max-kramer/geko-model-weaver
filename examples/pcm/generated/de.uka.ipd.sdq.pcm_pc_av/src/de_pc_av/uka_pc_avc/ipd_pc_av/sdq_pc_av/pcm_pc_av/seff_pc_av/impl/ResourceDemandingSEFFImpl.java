/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.impl.IdentifierImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.BasicComponent;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Signature;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractAction;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractBranchTransition;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractLoopAction;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingBehaviour;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingInternalBehaviour;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingSEFF;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.Seff_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ServiceEffectSpecification;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.util.Seff_pc_avValidator;

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
 * An implementation of the model object '<em><b>Resource Demanding SEFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.ResourceDemandingSEFFImpl#getSeffTypeID <em>Seff Type ID</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.ResourceDemandingSEFFImpl#getDescribedService__SEFF <em>Described Service SEFF</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.ResourceDemandingSEFFImpl#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.ResourceDemandingSEFFImpl#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.ResourceDemandingSEFFImpl#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.ResourceDemandingSEFFImpl#getSteps_Behaviour <em>Steps Behaviour</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.impl.ResourceDemandingSEFFImpl#getResourceDemandingInternalBehaviours <em>Resource Demanding Internal Behaviours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceDemandingSEFFImpl extends IdentifierImpl implements ResourceDemandingSEFF {
   /**
    * The default value of the '{@link #getSeffTypeID() <em>Seff Type ID</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSeffTypeID()
    * @generated
    * @ordered
    */
   protected static final String SEFF_TYPE_ID_EDEFAULT = "1";

   /**
    * The cached value of the '{@link #getSeffTypeID() <em>Seff Type ID</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSeffTypeID()
    * @generated
    * @ordered
    */
   protected String seffTypeID = SEFF_TYPE_ID_EDEFAULT;

   /**
    * The cached value of the '{@link #getDescribedService__SEFF() <em>Described Service SEFF</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDescribedService__SEFF()
    * @generated
    * @ordered
    */
   protected Signature describedService__SEFF;

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
    * The cached value of the '{@link #getResourceDemandingInternalBehaviours() <em>Resource Demanding Internal Behaviours</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceDemandingInternalBehaviours()
    * @generated
    * @ordered
    */
   protected EList<ResourceDemandingInternalBehaviour> resourceDemandingInternalBehaviours;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceDemandingSEFFImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Seff_pc_avPackage.Literals.RESOURCE_DEMANDING_SEFF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getSeffTypeID() {
      return seffTypeID;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSeffTypeID(String newSeffTypeID) {
      String oldSeffTypeID = seffTypeID;
      seffTypeID = newSeffTypeID;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID, oldSeffTypeID, seffTypeID));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Signature getDescribedService__SEFF() {
      if (describedService__SEFF != null && describedService__SEFF.eIsProxy()) {
         InternalEObject oldDescribedService__SEFF = (InternalEObject)describedService__SEFF;
         describedService__SEFF = (Signature)eResolveProxy(oldDescribedService__SEFF);
         if (describedService__SEFF != oldDescribedService__SEFF) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF, oldDescribedService__SEFF, describedService__SEFF));
         }
      }
      return describedService__SEFF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Signature basicGetDescribedService__SEFF() {
      return describedService__SEFF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDescribedService__SEFF(Signature newDescribedService__SEFF) {
      Signature oldDescribedService__SEFF = describedService__SEFF;
      describedService__SEFF = newDescribedService__SEFF;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF, oldDescribedService__SEFF, describedService__SEFF));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BasicComponent getBasicComponent_ServiceEffectSpecification() {
      if (eContainerFeatureID() != Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION) return null;
      return (BasicComponent)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetBasicComponent_ServiceEffectSpecification(BasicComponent newBasicComponent_ServiceEffectSpecification, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newBasicComponent_ServiceEffectSpecification, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBasicComponent_ServiceEffectSpecification(BasicComponent newBasicComponent_ServiceEffectSpecification) {
      if (newBasicComponent_ServiceEffectSpecification != eInternalContainer() || (eContainerFeatureID() != Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION && newBasicComponent_ServiceEffectSpecification != null)) {
         if (EcoreUtil.isAncestor(this, newBasicComponent_ServiceEffectSpecification))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newBasicComponent_ServiceEffectSpecification != null)
            msgs = ((InternalEObject)newBasicComponent_ServiceEffectSpecification).eInverseAdd(this, Repository_pc_avPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT, BasicComponent.class, msgs);
         msgs = basicSetBasicComponent_ServiceEffectSpecification(newBasicComponent_ServiceEffectSpecification, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION, newBasicComponent_ServiceEffectSpecification, newBasicComponent_ServiceEffectSpecification));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractLoopAction getAbstractLoopAction_ResourceDemandingBehaviour() {
      if (eContainerFeatureID() != Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR) return null;
      return (AbstractLoopAction)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction newAbstractLoopAction_ResourceDemandingBehaviour, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newAbstractLoopAction_ResourceDemandingBehaviour, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction newAbstractLoopAction_ResourceDemandingBehaviour) {
      if (newAbstractLoopAction_ResourceDemandingBehaviour != eInternalContainer() || (eContainerFeatureID() != Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR && newAbstractLoopAction_ResourceDemandingBehaviour != null)) {
         if (EcoreUtil.isAncestor(this, newAbstractLoopAction_ResourceDemandingBehaviour))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newAbstractLoopAction_ResourceDemandingBehaviour != null)
            msgs = ((InternalEObject)newAbstractLoopAction_ResourceDemandingBehaviour).eInverseAdd(this, Seff_pc_avPackage.ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP, AbstractLoopAction.class, msgs);
         msgs = basicSetAbstractLoopAction_ResourceDemandingBehaviour(newAbstractLoopAction_ResourceDemandingBehaviour, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR, newAbstractLoopAction_ResourceDemandingBehaviour, newAbstractLoopAction_ResourceDemandingBehaviour));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractBranchTransition getAbstractBranchTransition_ResourceDemandingBehaviour() {
      if (eContainerFeatureID() != Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR) return null;
      return (AbstractBranchTransition)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition newAbstractBranchTransition_ResourceDemandingBehaviour, NotificationChain msgs) {
      msgs = eBasicSetContainer((InternalEObject)newAbstractBranchTransition_ResourceDemandingBehaviour, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition newAbstractBranchTransition_ResourceDemandingBehaviour) {
      if (newAbstractBranchTransition_ResourceDemandingBehaviour != eInternalContainer() || (eContainerFeatureID() != Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR && newAbstractBranchTransition_ResourceDemandingBehaviour != null)) {
         if (EcoreUtil.isAncestor(this, newAbstractBranchTransition_ResourceDemandingBehaviour))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newAbstractBranchTransition_ResourceDemandingBehaviour != null)
            msgs = ((InternalEObject)newAbstractBranchTransition_ResourceDemandingBehaviour).eInverseAdd(this, Seff_pc_avPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION, AbstractBranchTransition.class, msgs);
         msgs = basicSetAbstractBranchTransition_ResourceDemandingBehaviour(newAbstractBranchTransition_ResourceDemandingBehaviour, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR, newAbstractBranchTransition_ResourceDemandingBehaviour, newAbstractBranchTransition_ResourceDemandingBehaviour));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<AbstractAction> getSteps_Behaviour() {
      if (steps_Behaviour == null) {
         steps_Behaviour = new EObjectContainmentWithInverseEList<AbstractAction>(AbstractAction.class, this, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR, Seff_pc_avPackage.ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION);
      }
      return steps_Behaviour;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceDemandingInternalBehaviour> getResourceDemandingInternalBehaviours() {
      if (resourceDemandingInternalBehaviours == null) {
         resourceDemandingInternalBehaviours = new EObjectContainmentWithInverseEList<ResourceDemandingInternalBehaviour>(ResourceDemandingInternalBehaviour.class, this, Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS, Seff_pc_avPackage.RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR__RESOURCE_DEMANDING_SEFF_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR);
      }
      return resourceDemandingInternalBehaviours;
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
                   Seff_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_pc_avValidator.RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_STOP_ACTION,
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
                   Seff_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_pc_avValidator.RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_START_ACTION,
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
                   Seff_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_pc_avValidator.RESOURCE_DEMANDING_BEHAVIOUR__EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR,
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
   public boolean ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Seff_pc_avValidator.DIAGNOSTIC_SOURCE,
                   Seff_pc_avValidator.SERVICE_EFFECT_SPECIFICATION__REFERENCED_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole", EObjectValidator.getObjectLabel(this, context) }),
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
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetBasicComponent_ServiceEffectSpecification((BasicComponent)otherEnd, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)otherEnd, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)otherEnd, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps_Behaviour()).basicAdd(otherEnd, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceDemandingInternalBehaviours()).basicAdd(otherEnd, msgs);
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
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            return basicSetBasicComponent_ServiceEffectSpecification(null, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            return basicSetAbstractLoopAction_ResourceDemandingBehaviour(null, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            return basicSetAbstractBranchTransition_ResourceDemandingBehaviour(null, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
            return ((InternalEList<?>)getSteps_Behaviour()).basicRemove(otherEnd, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
            return ((InternalEList<?>)getResourceDemandingInternalBehaviours()).basicRemove(otherEnd, msgs);
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
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            return eInternalContainer().eInverseRemove(this, Repository_pc_avPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT, BasicComponent.class, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            return eInternalContainer().eInverseRemove(this, Seff_pc_avPackage.ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP, AbstractLoopAction.class, msgs);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            return eInternalContainer().eInverseRemove(this, Seff_pc_avPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION, AbstractBranchTransition.class, msgs);
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
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
            return getSeffTypeID();
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
            if (resolve) return getDescribedService__SEFF();
            return basicGetDescribedService__SEFF();
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            return getBasicComponent_ServiceEffectSpecification();
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            return getAbstractLoopAction_ResourceDemandingBehaviour();
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            return getAbstractBranchTransition_ResourceDemandingBehaviour();
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
            return getSteps_Behaviour();
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
            return getResourceDemandingInternalBehaviours();
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
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
            setSeffTypeID((String)newValue);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
            setDescribedService__SEFF((Signature)newValue);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            setBasicComponent_ServiceEffectSpecification((BasicComponent)newValue);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            setAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)newValue);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            setAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)newValue);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
            getSteps_Behaviour().clear();
            getSteps_Behaviour().addAll((Collection<? extends AbstractAction>)newValue);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
            getResourceDemandingInternalBehaviours().clear();
            getResourceDemandingInternalBehaviours().addAll((Collection<? extends ResourceDemandingInternalBehaviour>)newValue);
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
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
            setSeffTypeID(SEFF_TYPE_ID_EDEFAULT);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
            setDescribedService__SEFF((Signature)null);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            setBasicComponent_ServiceEffectSpecification((BasicComponent)null);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            setAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)null);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            setAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)null);
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
            getSteps_Behaviour().clear();
            return;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
            getResourceDemandingInternalBehaviours().clear();
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
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
            return SEFF_TYPE_ID_EDEFAULT == null ? seffTypeID != null : !SEFF_TYPE_ID_EDEFAULT.equals(seffTypeID);
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
            return describedService__SEFF != null;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
            return getBasicComponent_ServiceEffectSpecification() != null;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
            return getAbstractLoopAction_ResourceDemandingBehaviour() != null;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
            return getAbstractBranchTransition_ResourceDemandingBehaviour() != null;
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
            return steps_Behaviour != null && !steps_Behaviour.isEmpty();
         case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
            return resourceDemandingInternalBehaviours != null && !resourceDemandingInternalBehaviours.isEmpty();
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
      if (baseClass == ServiceEffectSpecification.class) {
         switch (derivedFeatureID) {
            case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID: return Seff_pc_avPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID;
            case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF: return Seff_pc_avPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF;
            case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION: return Seff_pc_avPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION;
            default: return -1;
         }
      }
      if (baseClass == ResourceDemandingBehaviour.class) {
         switch (derivedFeatureID) {
            case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_pc_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;
            case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_pc_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;
            case Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR: return Seff_pc_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR;
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
      if (baseClass == ServiceEffectSpecification.class) {
         switch (baseFeatureID) {
            case Seff_pc_avPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID: return Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID;
            case Seff_pc_avPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF: return Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF;
            case Seff_pc_avPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION: return Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION;
            default: return -1;
         }
      }
      if (baseClass == ResourceDemandingBehaviour.class) {
         switch (baseFeatureID) {
            case Seff_pc_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;
            case Seff_pc_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;
            case Seff_pc_avPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR: return Seff_pc_avPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR;
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
      result.append(" (seffTypeID: ");
      result.append(seffTypeID);
      result.append(')');
      return result.toString();
   }

} //ResourceDemandingSEFFImpl
