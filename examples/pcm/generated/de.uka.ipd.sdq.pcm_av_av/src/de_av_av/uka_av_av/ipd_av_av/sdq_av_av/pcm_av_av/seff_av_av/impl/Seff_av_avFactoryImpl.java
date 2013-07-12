/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.seff_av_av.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Seff_av_avFactoryImpl extends EFactoryImpl implements Seff_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Seff_av_avFactory init() {
      try {
         Seff_av_avFactory theSeff_av_avFactory = (Seff_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Seff_av_avPackage.eNS_URI);
         if (theSeff_av_avFactory != null) {
            return theSeff_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Seff_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_av_avFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case Seff_av_avPackage.STOP_ACTION: return createStopAction();
         case Seff_av_avPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION: return createAbstractInternalControlFlowAction();
         case Seff_av_avPackage.ABSTRACT_ACTION: return createAbstractAction();
         case Seff_av_avPackage.RESOURCE_DEMANDING_BEHAVIOUR: return createResourceDemandingBehaviour();
         case Seff_av_avPackage.ABSTRACT_LOOP_ACTION: return createAbstractLoopAction();
         case Seff_av_avPackage.ABSTRACT_BRANCH_TRANSITION: return createAbstractBranchTransition();
         case Seff_av_avPackage.BRANCH_ACTION: return createBranchAction();
         case Seff_av_avPackage.CALL_ACTION: return createCallAction();
         case Seff_av_avPackage.START_ACTION: return createStartAction();
         case Seff_av_avPackage.SERVICE_EFFECT_SPECIFICATION: return createServiceEffectSpecification();
         case Seff_av_avPackage.RESOURCE_DEMANDING_SEFF: return createResourceDemandingSEFF();
         case Seff_av_avPackage.RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR: return createResourceDemandingInternalBehaviour();
         case Seff_av_avPackage.RELEASE_ACTION: return createReleaseAction();
         case Seff_av_avPackage.LOOP_ACTION: return createLoopAction();
         case Seff_av_avPackage.FORK_ACTION: return createForkAction();
         case Seff_av_avPackage.FORKED_BEHAVIOUR: return createForkedBehaviour();
         case Seff_av_avPackage.SYNCHRONISATION_POINT: return createSynchronisationPoint();
         case Seff_av_avPackage.EXTERNAL_CALL_ACTION: return createExternalCallAction();
         case Seff_av_avPackage.CALL_RETURN_ACTION: return createCallReturnAction();
         case Seff_av_avPackage.PROBABILISTIC_BRANCH_TRANSITION: return createProbabilisticBranchTransition();
         case Seff_av_avPackage.ACQUIRE_ACTION: return createAcquireAction();
         case Seff_av_avPackage.COLLECTION_ITERATOR_ACTION: return createCollectionIteratorAction();
         case Seff_av_avPackage.GUARDED_BRANCH_TRANSITION: return createGuardedBranchTransition();
         case Seff_av_avPackage.SET_VARIABLE_ACTION: return createSetVariableAction();
         case Seff_av_avPackage.INTERNAL_CALL_ACTION: return createInternalCallAction();
         case Seff_av_avPackage.EMIT_EVENT_ACTION: return createEmitEventAction();
         case Seff_av_avPackage.INTERNAL_ACTION: return createInternalAction();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StopAction createStopAction() {
      StopActionImpl stopAction = new StopActionImpl();
      return stopAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractInternalControlFlowAction createAbstractInternalControlFlowAction() {
      AbstractInternalControlFlowActionImpl abstractInternalControlFlowAction = new AbstractInternalControlFlowActionImpl();
      return abstractInternalControlFlowAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractAction createAbstractAction() {
      AbstractActionImpl abstractAction = new AbstractActionImpl();
      return abstractAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceDemandingBehaviour createResourceDemandingBehaviour() {
      ResourceDemandingBehaviourImpl resourceDemandingBehaviour = new ResourceDemandingBehaviourImpl();
      return resourceDemandingBehaviour;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractLoopAction createAbstractLoopAction() {
      AbstractLoopActionImpl abstractLoopAction = new AbstractLoopActionImpl();
      return abstractLoopAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AbstractBranchTransition createAbstractBranchTransition() {
      AbstractBranchTransitionImpl abstractBranchTransition = new AbstractBranchTransitionImpl();
      return abstractBranchTransition;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BranchAction createBranchAction() {
      BranchActionImpl branchAction = new BranchActionImpl();
      return branchAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CallAction createCallAction() {
      CallActionImpl callAction = new CallActionImpl();
      return callAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StartAction createStartAction() {
      StartActionImpl startAction = new StartActionImpl();
      return startAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ServiceEffectSpecification createServiceEffectSpecification() {
      ServiceEffectSpecificationImpl serviceEffectSpecification = new ServiceEffectSpecificationImpl();
      return serviceEffectSpecification;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceDemandingSEFF createResourceDemandingSEFF() {
      ResourceDemandingSEFFImpl resourceDemandingSEFF = new ResourceDemandingSEFFImpl();
      return resourceDemandingSEFF;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceDemandingInternalBehaviour createResourceDemandingInternalBehaviour() {
      ResourceDemandingInternalBehaviourImpl resourceDemandingInternalBehaviour = new ResourceDemandingInternalBehaviourImpl();
      return resourceDemandingInternalBehaviour;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ReleaseAction createReleaseAction() {
      ReleaseActionImpl releaseAction = new ReleaseActionImpl();
      return releaseAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public LoopAction createLoopAction() {
      LoopActionImpl loopAction = new LoopActionImpl();
      return loopAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ForkAction createForkAction() {
      ForkActionImpl forkAction = new ForkActionImpl();
      return forkAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ForkedBehaviour createForkedBehaviour() {
      ForkedBehaviourImpl forkedBehaviour = new ForkedBehaviourImpl();
      return forkedBehaviour;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SynchronisationPoint createSynchronisationPoint() {
      SynchronisationPointImpl synchronisationPoint = new SynchronisationPointImpl();
      return synchronisationPoint;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExternalCallAction createExternalCallAction() {
      ExternalCallActionImpl externalCallAction = new ExternalCallActionImpl();
      return externalCallAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CallReturnAction createCallReturnAction() {
      CallReturnActionImpl callReturnAction = new CallReturnActionImpl();
      return callReturnAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProbabilisticBranchTransition createProbabilisticBranchTransition() {
      ProbabilisticBranchTransitionImpl probabilisticBranchTransition = new ProbabilisticBranchTransitionImpl();
      return probabilisticBranchTransition;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AcquireAction createAcquireAction() {
      AcquireActionImpl acquireAction = new AcquireActionImpl();
      return acquireAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CollectionIteratorAction createCollectionIteratorAction() {
      CollectionIteratorActionImpl collectionIteratorAction = new CollectionIteratorActionImpl();
      return collectionIteratorAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GuardedBranchTransition createGuardedBranchTransition() {
      GuardedBranchTransitionImpl guardedBranchTransition = new GuardedBranchTransitionImpl();
      return guardedBranchTransition;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SetVariableAction createSetVariableAction() {
      SetVariableActionImpl setVariableAction = new SetVariableActionImpl();
      return setVariableAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InternalCallAction createInternalCallAction() {
      InternalCallActionImpl internalCallAction = new InternalCallActionImpl();
      return internalCallAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EmitEventAction createEmitEventAction() {
      EmitEventActionImpl emitEventAction = new EmitEventActionImpl();
      return emitEventAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InternalAction createInternalAction() {
      InternalActionImpl internalAction = new InternalActionImpl();
      return internalAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_av_avPackage getSeff_av_avPackage() {
      return (Seff_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Seff_av_avPackage getPackage() {
      return Seff_av_avPackage.eINSTANCE;
   }

} //Seff_av_avFactoryImpl
