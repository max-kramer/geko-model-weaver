/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.Pcm_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.Allocation_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.impl.Allocation_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.Completions_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.impl.Completions_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.Core_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.Composition_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.impl.Composition_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.impl.Entity_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.impl.Core_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.impl.Pcm_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.Parameter_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.impl.Parameter_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.protocol_av_pc.Protocol_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.protocol_av_pc.impl.Protocol_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.Qosannotations_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.impl.Qosannotations_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.Qos_performance_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.impl.Qos_performance_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.Qos_reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.impl.Qos_reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.Reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.impl.Reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.impl.Repository_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.Resourceenvironment_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourceenvironment_av_pc.impl.Resourceenvironment_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.Resourcetype_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.resourcetype_av_pc.impl.Resourcetype_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractBranchTransition;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractInternalControlFlowAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AbstractLoopAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.AcquireAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.BranchAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.CallAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.CallReturnAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.CollectionIteratorAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.EmitEventAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ExternalCallAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ForkAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ForkedBehaviour;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.GuardedBranchTransition;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.InternalAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.InternalCallAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.LoopAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ProbabilisticBranchTransition;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ReleaseAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ResourceDemandingBehaviour;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ResourceDemandingInternalBehaviour;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ResourceDemandingSEFF;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcFactory;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.ServiceEffectSpecification;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.SetVariableAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.StartAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.StopAction;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.SynchronisationPoint;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.Seff_performance_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_performance_av_pc.impl.Seff_performance_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.Seff_reliability_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.impl.Seff_reliability_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.util.Seff_av_pcValidator;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.Subsystem_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.impl.Subsystem_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.impl.System_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.Usagemodel_av_pcPackage;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.usagemodel_av_pc.impl.Usagemodel_av_pcPackageImpl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.stoex_av_pc.Stoex_av_pcPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Seff_av_pcPackageImpl extends EPackageImpl implements Seff_av_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass stopActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractInternalControlFlowActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceDemandingBehaviourEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractLoopActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractBranchTransitionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass branchActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass callActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass startActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass serviceEffectSpecificationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceDemandingSEFFEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass resourceDemandingInternalBehaviourEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass releaseActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass loopActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass forkActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass forkedBehaviourEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass synchronisationPointEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass externalCallActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass callReturnActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass probabilisticBranchTransitionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass acquireActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass collectionIteratorActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass guardedBranchTransitionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass setVariableActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass internalCallActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass emitEventActionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass internalActionEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.Seff_av_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Seff_av_pcPackageImpl() {
      super(eNS_URI, Seff_av_pcFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link Seff_av_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Seff_av_pcPackage init() {
      if (isInited) return (Seff_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_av_pcPackage.eNS_URI);

      // Obtain or create and register package
      Seff_av_pcPackageImpl theSeff_av_pcPackage = (Seff_av_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Seff_av_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Seff_av_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_av_pcPackage.eINSTANCE.eClass();
      Stoex_av_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_av_pcPackageImpl thePcm_av_pcPackage = (Pcm_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_av_pcPackage.eNS_URI) instanceof Pcm_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_av_pcPackage.eNS_URI) : Pcm_av_pcPackage.eINSTANCE);
      Core_av_pcPackageImpl theCore_av_pcPackage = (Core_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_av_pcPackage.eNS_URI) instanceof Core_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_av_pcPackage.eNS_URI) : Core_av_pcPackage.eINSTANCE);
      Entity_av_pcPackageImpl theEntity_av_pcPackage = (Entity_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI) instanceof Entity_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI) : Entity_av_pcPackage.eINSTANCE);
      Composition_av_pcPackageImpl theComposition_av_pcPackage = (Composition_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_av_pcPackage.eNS_URI) instanceof Composition_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_av_pcPackage.eNS_URI) : Composition_av_pcPackage.eINSTANCE);
      Usagemodel_av_pcPackageImpl theUsagemodel_av_pcPackage = (Usagemodel_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI) instanceof Usagemodel_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_av_pcPackage.eNS_URI) : Usagemodel_av_pcPackage.eINSTANCE);
      Repository_av_pcPackageImpl theRepository_av_pcPackage = (Repository_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI) instanceof Repository_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI) : Repository_av_pcPackage.eINSTANCE);
      Resourcetype_av_pcPackageImpl theResourcetype_av_pcPackage = (Resourcetype_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI) instanceof Resourcetype_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_av_pcPackage.eNS_URI) : Resourcetype_av_pcPackage.eINSTANCE);
      Protocol_av_pcPackageImpl theProtocol_av_pcPackage = (Protocol_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_av_pcPackage.eNS_URI) instanceof Protocol_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_av_pcPackage.eNS_URI) : Protocol_av_pcPackage.eINSTANCE);
      Parameter_av_pcPackageImpl theParameter_av_pcPackage = (Parameter_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI) instanceof Parameter_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI) : Parameter_av_pcPackage.eINSTANCE);
      Reliability_av_pcPackageImpl theReliability_av_pcPackage = (Reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_av_pcPackage.eNS_URI) instanceof Reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_av_pcPackage.eNS_URI) : Reliability_av_pcPackage.eINSTANCE);
      Seff_performance_av_pcPackageImpl theSeff_performance_av_pcPackage = (Seff_performance_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI) instanceof Seff_performance_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI) : Seff_performance_av_pcPackage.eINSTANCE);
      Seff_reliability_av_pcPackageImpl theSeff_reliability_av_pcPackage = (Seff_reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_pcPackage.eNS_URI) instanceof Seff_reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_pcPackage.eNS_URI) : Seff_reliability_av_pcPackage.eINSTANCE);
      Qosannotations_av_pcPackageImpl theQosannotations_av_pcPackage = (Qosannotations_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_pcPackage.eNS_URI) instanceof Qosannotations_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_av_pcPackage.eNS_URI) : Qosannotations_av_pcPackage.eINSTANCE);
      Qos_performance_av_pcPackageImpl theQos_performance_av_pcPackage = (Qos_performance_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_pcPackage.eNS_URI) instanceof Qos_performance_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_av_pcPackage.eNS_URI) : Qos_performance_av_pcPackage.eINSTANCE);
      Qos_reliability_av_pcPackageImpl theQos_reliability_av_pcPackage = (Qos_reliability_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_pcPackage.eNS_URI) instanceof Qos_reliability_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_av_pcPackage.eNS_URI) : Qos_reliability_av_pcPackage.eINSTANCE);
      System_av_pcPackageImpl theSystem_av_pcPackage = (System_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_av_pcPackage.eNS_URI) instanceof System_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_av_pcPackage.eNS_URI) : System_av_pcPackage.eINSTANCE);
      Resourceenvironment_av_pcPackageImpl theResourceenvironment_av_pcPackage = (Resourceenvironment_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI) instanceof Resourceenvironment_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_av_pcPackage.eNS_URI) : Resourceenvironment_av_pcPackage.eINSTANCE);
      Allocation_av_pcPackageImpl theAllocation_av_pcPackage = (Allocation_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_av_pcPackage.eNS_URI) instanceof Allocation_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_av_pcPackage.eNS_URI) : Allocation_av_pcPackage.eINSTANCE);
      Subsystem_av_pcPackageImpl theSubsystem_av_pcPackage = (Subsystem_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_pcPackage.eNS_URI) instanceof Subsystem_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_av_pcPackage.eNS_URI) : Subsystem_av_pcPackage.eINSTANCE);
      Completions_av_pcPackageImpl theCompletions_av_pcPackage = (Completions_av_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_av_pcPackage.eNS_URI) instanceof Completions_av_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_av_pcPackage.eNS_URI) : Completions_av_pcPackage.eINSTANCE);

      // Create package meta-data objects
      theSeff_av_pcPackage.createPackageContents();
      thePcm_av_pcPackage.createPackageContents();
      theCore_av_pcPackage.createPackageContents();
      theEntity_av_pcPackage.createPackageContents();
      theComposition_av_pcPackage.createPackageContents();
      theUsagemodel_av_pcPackage.createPackageContents();
      theRepository_av_pcPackage.createPackageContents();
      theResourcetype_av_pcPackage.createPackageContents();
      theProtocol_av_pcPackage.createPackageContents();
      theParameter_av_pcPackage.createPackageContents();
      theReliability_av_pcPackage.createPackageContents();
      theSeff_performance_av_pcPackage.createPackageContents();
      theSeff_reliability_av_pcPackage.createPackageContents();
      theQosannotations_av_pcPackage.createPackageContents();
      theQos_performance_av_pcPackage.createPackageContents();
      theQos_reliability_av_pcPackage.createPackageContents();
      theSystem_av_pcPackage.createPackageContents();
      theResourceenvironment_av_pcPackage.createPackageContents();
      theAllocation_av_pcPackage.createPackageContents();
      theSubsystem_av_pcPackage.createPackageContents();
      theCompletions_av_pcPackage.createPackageContents();

      // Initialize created meta-data
      theSeff_av_pcPackage.initializePackageContents();
      thePcm_av_pcPackage.initializePackageContents();
      theCore_av_pcPackage.initializePackageContents();
      theEntity_av_pcPackage.initializePackageContents();
      theComposition_av_pcPackage.initializePackageContents();
      theUsagemodel_av_pcPackage.initializePackageContents();
      theRepository_av_pcPackage.initializePackageContents();
      theResourcetype_av_pcPackage.initializePackageContents();
      theProtocol_av_pcPackage.initializePackageContents();
      theParameter_av_pcPackage.initializePackageContents();
      theReliability_av_pcPackage.initializePackageContents();
      theSeff_performance_av_pcPackage.initializePackageContents();
      theSeff_reliability_av_pcPackage.initializePackageContents();
      theQosannotations_av_pcPackage.initializePackageContents();
      theQos_performance_av_pcPackage.initializePackageContents();
      theQos_reliability_av_pcPackage.initializePackageContents();
      theSystem_av_pcPackage.initializePackageContents();
      theResourceenvironment_av_pcPackage.initializePackageContents();
      theAllocation_av_pcPackage.initializePackageContents();
      theSubsystem_av_pcPackage.initializePackageContents();
      theCompletions_av_pcPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theSeff_av_pcPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Seff_av_pcValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theSeff_av_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Seff_av_pcPackage.eNS_URI, theSeff_av_pcPackage);
      return theSeff_av_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getStopAction() {
      return stopActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractInternalControlFlowAction() {
      return abstractInternalControlFlowActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractInternalControlFlowAction_ResourceDemand_Action() {
      return (EReference)abstractInternalControlFlowActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractInternalControlFlowAction_InfrastructureCall__Action() {
      return (EReference)abstractInternalControlFlowActionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractInternalControlFlowAction_ResourceCall__Action() {
      return (EReference)abstractInternalControlFlowActionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractAction() {
      return abstractActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractAction_Predecessor_AbstractAction() {
      return (EReference)abstractActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractAction_Successor_AbstractAction() {
      return (EReference)abstractActionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractAction_ResourceDemandingBehaviour_AbstractAction() {
      return (EReference)abstractActionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceDemandingBehaviour() {
      return resourceDemandingBehaviourEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceDemandingBehaviour_AbstractLoopAction_ResourceDemandingBehaviour() {
      return (EReference)resourceDemandingBehaviourEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceDemandingBehaviour_AbstractBranchTransition_ResourceDemandingBehaviour() {
      return (EReference)resourceDemandingBehaviourEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceDemandingBehaviour_Steps_Behaviour() {
      return (EReference)resourceDemandingBehaviourEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractLoopAction() {
      return abstractLoopActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractLoopAction_BodyBehaviour_Loop() {
      return (EReference)abstractLoopActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractBranchTransition() {
      return abstractBranchTransitionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractBranchTransition_BranchAction_AbstractBranchTransition() {
      return (EReference)abstractBranchTransitionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractBranchTransition_BranchBehaviour_BranchTransition() {
      return (EReference)abstractBranchTransitionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBranchAction() {
      return branchActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBranchAction_Branches_Branch() {
      return (EReference)branchActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCallAction() {
      return callActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCallAction_InputVariableUsages__CallAction() {
      return (EReference)callActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getStartAction() {
      return startActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getServiceEffectSpecification() {
      return serviceEffectSpecificationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getServiceEffectSpecification_SeffTypeID() {
      return (EAttribute)serviceEffectSpecificationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getServiceEffectSpecification_DescribedService__SEFF() {
      return (EReference)serviceEffectSpecificationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getServiceEffectSpecification_BasicComponent_ServiceEffectSpecification() {
      return (EReference)serviceEffectSpecificationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceDemandingSEFF() {
      return resourceDemandingSEFFEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceDemandingSEFF_ResourceDemandingInternalBehaviours() {
      return (EReference)resourceDemandingSEFFEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getResourceDemandingInternalBehaviour() {
      return resourceDemandingInternalBehaviourEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getResourceDemandingInternalBehaviour_ResourceDemandingSEFF_ResourceDemandingInternalBehaviour() {
      return (EReference)resourceDemandingInternalBehaviourEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getReleaseAction() {
      return releaseActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getReleaseAction_PassiveResource_ReleaseAction() {
      return (EReference)releaseActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getLoopAction() {
      return loopActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLoopAction_IterationCount_LoopAction() {
      return (EReference)loopActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getForkAction() {
      return forkActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getForkAction_AsynchronousForkedBehaviours_ForkAction() {
      return (EReference)forkActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getForkAction_SynchronisingBehaviours_ForkAction() {
      return (EReference)forkActionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getForkedBehaviour() {
      return forkedBehaviourEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getForkedBehaviour_SynchronisationPoint_ForkedBehaviour() {
      return (EReference)forkedBehaviourEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getForkedBehaviour_ForkAction_ForkedBehaivour() {
      return (EReference)forkedBehaviourEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSynchronisationPoint() {
      return synchronisationPointEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint() {
      return (EReference)synchronisationPointEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSynchronisationPoint_ForkAction_SynchronisationPoint() {
      return (EReference)synchronisationPointEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSynchronisationPoint_SynchronousForkedBehaviours_SynchronisationPoint() {
      return (EReference)synchronisationPointEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExternalCallAction() {
      return externalCallActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExternalCallAction_CalledService_ExternalService() {
      return (EReference)externalCallActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExternalCallAction_Role_ExternalService() {
      return (EReference)externalCallActionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getExternalCallAction_RetryCount() {
      return (EAttribute)externalCallActionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCallReturnAction() {
      return callReturnActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCallReturnAction_ReturnVariableUsage__CallReturnAction() {
      return (EReference)callReturnActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProbabilisticBranchTransition() {
      return probabilisticBranchTransitionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProbabilisticBranchTransition_BranchProbability() {
      return (EAttribute)probabilisticBranchTransitionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAcquireAction() {
      return acquireActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAcquireAction_Passiveresource_AcquireAction() {
      return (EReference)acquireActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAcquireAction_Timeout() {
      return (EAttribute)acquireActionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAcquireAction_TimeoutValue() {
      return (EAttribute)acquireActionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCollectionIteratorAction() {
      return collectionIteratorActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCollectionIteratorAction_Parameter_CollectionIteratorAction() {
      return (EReference)collectionIteratorActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getGuardedBranchTransition() {
      return guardedBranchTransitionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getGuardedBranchTransition_BranchCondition_GuardedBranchTransition() {
      return (EReference)guardedBranchTransitionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSetVariableAction() {
      return setVariableActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSetVariableAction_LocalVariableUsages_SetVariableAction() {
      return (EReference)setVariableActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInternalCallAction() {
      return internalCallActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInternalCallAction_CalledResourceDemandingInternalBehaviour() {
      return (EReference)internalCallActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEmitEventAction() {
      return emitEventActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEmitEventAction_EventType__EmitEventAction() {
      return (EReference)emitEventActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEmitEventAction_SourceRole__EmitEventAction() {
      return (EReference)emitEventActionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInternalAction() {
      return internalActionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInternalAction_InternalFailureOccurrenceDescriptions__InternalAction() {
      return (EReference)internalActionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_av_pcFactory getSeff_av_pcFactory() {
      return (Seff_av_pcFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents() {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      stopActionEClass = createEClass(STOP_ACTION);

      abstractInternalControlFlowActionEClass = createEClass(ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION);
      createEReference(abstractInternalControlFlowActionEClass, ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION);
      createEReference(abstractInternalControlFlowActionEClass, ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION);
      createEReference(abstractInternalControlFlowActionEClass, ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION);

      abstractActionEClass = createEClass(ABSTRACT_ACTION);
      createEReference(abstractActionEClass, ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION);
      createEReference(abstractActionEClass, ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION);
      createEReference(abstractActionEClass, ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION);

      resourceDemandingBehaviourEClass = createEClass(RESOURCE_DEMANDING_BEHAVIOUR);
      createEReference(resourceDemandingBehaviourEClass, RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR);
      createEReference(resourceDemandingBehaviourEClass, RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR);
      createEReference(resourceDemandingBehaviourEClass, RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR);

      abstractLoopActionEClass = createEClass(ABSTRACT_LOOP_ACTION);
      createEReference(abstractLoopActionEClass, ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP);

      abstractBranchTransitionEClass = createEClass(ABSTRACT_BRANCH_TRANSITION);
      createEReference(abstractBranchTransitionEClass, ABSTRACT_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION);
      createEReference(abstractBranchTransitionEClass, ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION);

      branchActionEClass = createEClass(BRANCH_ACTION);
      createEReference(branchActionEClass, BRANCH_ACTION__BRANCHES_BRANCH);

      callActionEClass = createEClass(CALL_ACTION);
      createEReference(callActionEClass, CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION);

      startActionEClass = createEClass(START_ACTION);

      serviceEffectSpecificationEClass = createEClass(SERVICE_EFFECT_SPECIFICATION);
      createEAttribute(serviceEffectSpecificationEClass, SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID);
      createEReference(serviceEffectSpecificationEClass, SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF);
      createEReference(serviceEffectSpecificationEClass, SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION);

      resourceDemandingSEFFEClass = createEClass(RESOURCE_DEMANDING_SEFF);
      createEReference(resourceDemandingSEFFEClass, RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS);

      resourceDemandingInternalBehaviourEClass = createEClass(RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR);
      createEReference(resourceDemandingInternalBehaviourEClass, RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR__RESOURCE_DEMANDING_SEFF_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR);

      releaseActionEClass = createEClass(RELEASE_ACTION);
      createEReference(releaseActionEClass, RELEASE_ACTION__PASSIVE_RESOURCE_RELEASE_ACTION);

      loopActionEClass = createEClass(LOOP_ACTION);
      createEReference(loopActionEClass, LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION);

      forkActionEClass = createEClass(FORK_ACTION);
      createEReference(forkActionEClass, FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION);
      createEReference(forkActionEClass, FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION);

      forkedBehaviourEClass = createEClass(FORKED_BEHAVIOUR);
      createEReference(forkedBehaviourEClass, FORKED_BEHAVIOUR__SYNCHRONISATION_POINT_FORKED_BEHAVIOUR);
      createEReference(forkedBehaviourEClass, FORKED_BEHAVIOUR__FORK_ACTION_FORKED_BEHAIVOUR);

      synchronisationPointEClass = createEClass(SYNCHRONISATION_POINT);
      createEReference(synchronisationPointEClass, SYNCHRONISATION_POINT__OUTPUT_PARAMETER_USAGE_SYNCHRONISATION_POINT);
      createEReference(synchronisationPointEClass, SYNCHRONISATION_POINT__FORK_ACTION_SYNCHRONISATION_POINT);
      createEReference(synchronisationPointEClass, SYNCHRONISATION_POINT__SYNCHRONOUS_FORKED_BEHAVIOURS_SYNCHRONISATION_POINT);

      externalCallActionEClass = createEClass(EXTERNAL_CALL_ACTION);
      createEReference(externalCallActionEClass, EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE);
      createEReference(externalCallActionEClass, EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE);
      createEAttribute(externalCallActionEClass, EXTERNAL_CALL_ACTION__RETRY_COUNT);

      callReturnActionEClass = createEClass(CALL_RETURN_ACTION);
      createEReference(callReturnActionEClass, CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION);

      probabilisticBranchTransitionEClass = createEClass(PROBABILISTIC_BRANCH_TRANSITION);
      createEAttribute(probabilisticBranchTransitionEClass, PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY);

      acquireActionEClass = createEClass(ACQUIRE_ACTION);
      createEReference(acquireActionEClass, ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION);
      createEAttribute(acquireActionEClass, ACQUIRE_ACTION__TIMEOUT);
      createEAttribute(acquireActionEClass, ACQUIRE_ACTION__TIMEOUT_VALUE);

      collectionIteratorActionEClass = createEClass(COLLECTION_ITERATOR_ACTION);
      createEReference(collectionIteratorActionEClass, COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION);

      guardedBranchTransitionEClass = createEClass(GUARDED_BRANCH_TRANSITION);
      createEReference(guardedBranchTransitionEClass, GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION);

      setVariableActionEClass = createEClass(SET_VARIABLE_ACTION);
      createEReference(setVariableActionEClass, SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION);

      internalCallActionEClass = createEClass(INTERNAL_CALL_ACTION);
      createEReference(internalCallActionEClass, INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR);

      emitEventActionEClass = createEClass(EMIT_EVENT_ACTION);
      createEReference(emitEventActionEClass, EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION);
      createEReference(emitEventActionEClass, EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION);

      internalActionEClass = createEClass(INTERNAL_ACTION);
      createEReference(internalActionEClass, INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents() {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      Seff_performance_av_pcPackage theSeff_performance_av_pcPackage = (Seff_performance_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_performance_av_pcPackage.eNS_URI);
      Seff_reliability_av_pcPackage theSeff_reliability_av_pcPackage = (Seff_reliability_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_av_pcPackage.eNS_URI);
      Entity_av_pcPackage theEntity_av_pcPackage = (Entity_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_av_pcPackage.eNS_URI);
      Identifier_av_pcPackage theIdentifier_av_pcPackage = (Identifier_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Identifier_av_pcPackage.eNS_URI);
      Parameter_av_pcPackage theParameter_av_pcPackage = (Parameter_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_av_pcPackage.eNS_URI);
      Repository_av_pcPackage theRepository_av_pcPackage = (Repository_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_av_pcPackage.eNS_URI);
      Core_av_pcPackage theCore_av_pcPackage = (Core_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_av_pcPackage.eNS_URI);
      Reliability_av_pcPackage theReliability_av_pcPackage = (Reliability_av_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Reliability_av_pcPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theSeff_performance_av_pcPackage);
      getESubpackages().add(theSeff_reliability_av_pcPackage);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      stopActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());
      abstractInternalControlFlowActionEClass.getESuperTypes().add(this.getAbstractAction());
      abstractActionEClass.getESuperTypes().add(theEntity_av_pcPackage.getEntity());
      resourceDemandingBehaviourEClass.getESuperTypes().add(theIdentifier_av_pcPackage.getIdentifier());
      abstractLoopActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());
      abstractBranchTransitionEClass.getESuperTypes().add(theEntity_av_pcPackage.getEntity());
      branchActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());
      startActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());
      resourceDemandingSEFFEClass.getESuperTypes().add(theIdentifier_av_pcPackage.getIdentifier());
      resourceDemandingSEFFEClass.getESuperTypes().add(this.getServiceEffectSpecification());
      resourceDemandingSEFFEClass.getESuperTypes().add(this.getResourceDemandingBehaviour());
      resourceDemandingInternalBehaviourEClass.getESuperTypes().add(this.getResourceDemandingBehaviour());
      releaseActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());
      loopActionEClass.getESuperTypes().add(this.getAbstractLoopAction());
      forkActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());
      forkedBehaviourEClass.getESuperTypes().add(this.getResourceDemandingBehaviour());
      externalCallActionEClass.getESuperTypes().add(this.getAbstractAction());
      externalCallActionEClass.getESuperTypes().add(this.getCallReturnAction());
      externalCallActionEClass.getESuperTypes().add(theSeff_reliability_av_pcPackage.getFailureHandlingEntity());
      callReturnActionEClass.getESuperTypes().add(this.getCallAction());
      probabilisticBranchTransitionEClass.getESuperTypes().add(this.getAbstractBranchTransition());
      acquireActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());
      collectionIteratorActionEClass.getESuperTypes().add(this.getAbstractLoopAction());
      guardedBranchTransitionEClass.getESuperTypes().add(this.getAbstractBranchTransition());
      setVariableActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());
      internalCallActionEClass.getESuperTypes().add(this.getCallAction());
      internalCallActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());
      emitEventActionEClass.getESuperTypes().add(this.getAbstractAction());
      emitEventActionEClass.getESuperTypes().add(this.getCallAction());
      internalActionEClass.getESuperTypes().add(this.getAbstractInternalControlFlowAction());

      // Initialize classes and features; add operations and parameters
      initEClass(stopActionEClass, StopAction.class, "StopAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      EOperation op = addEOperation(stopActionEClass, ecorePackage.getEBoolean(), "StopActionSuccessorMustNotBeDefined", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(abstractInternalControlFlowActionEClass, AbstractInternalControlFlowAction.class, "AbstractInternalControlFlowAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAbstractInternalControlFlowAction_ResourceDemand_Action(), theSeff_performance_av_pcPackage.getParametricResourceDemand(), theSeff_performance_av_pcPackage.getParametricResourceDemand_Action_ParametricResourceDemand(), "resourceDemand_Action", null, 0, -1, AbstractInternalControlFlowAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractInternalControlFlowAction_InfrastructureCall__Action(), theSeff_performance_av_pcPackage.getInfrastructureCall(), theSeff_performance_av_pcPackage.getInfrastructureCall_Action__InfrastructureCall(), "infrastructureCall__Action", null, 0, -1, AbstractInternalControlFlowAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractInternalControlFlowAction_ResourceCall__Action(), theSeff_performance_av_pcPackage.getResourceCall(), theSeff_performance_av_pcPackage.getResourceCall_Action__ResourceCall(), "resourceCall__Action", null, 0, -1, AbstractInternalControlFlowAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(abstractActionEClass, AbstractAction.class, "AbstractAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAbstractAction_Predecessor_AbstractAction(), this.getAbstractAction(), this.getAbstractAction_Successor_AbstractAction(), "predecessor_AbstractAction", null, 0, 1, AbstractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractAction_Successor_AbstractAction(), this.getAbstractAction(), this.getAbstractAction_Predecessor_AbstractAction(), "successor_AbstractAction", null, 0, 1, AbstractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractAction_ResourceDemandingBehaviour_AbstractAction(), this.getResourceDemandingBehaviour(), this.getResourceDemandingBehaviour_Steps_Behaviour(), "resourceDemandingBehaviour_AbstractAction", null, 0, 1, AbstractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceDemandingBehaviourEClass, ResourceDemandingBehaviour.class, "ResourceDemandingBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceDemandingBehaviour_AbstractLoopAction_ResourceDemandingBehaviour(), this.getAbstractLoopAction(), this.getAbstractLoopAction_BodyBehaviour_Loop(), "abstractLoopAction_ResourceDemandingBehaviour", null, 0, 1, ResourceDemandingBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceDemandingBehaviour_AbstractBranchTransition_ResourceDemandingBehaviour(), this.getAbstractBranchTransition(), this.getAbstractBranchTransition_BranchBehaviour_BranchTransition(), "abstractBranchTransition_ResourceDemandingBehaviour", null, 0, 1, ResourceDemandingBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getResourceDemandingBehaviour_Steps_Behaviour(), this.getAbstractAction(), this.getAbstractAction_ResourceDemandingBehaviour_AbstractAction(), "steps_Behaviour", null, 0, -1, ResourceDemandingBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(resourceDemandingBehaviourEClass, ecorePackage.getEBoolean(), "ExactlyOneStopAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(resourceDemandingBehaviourEClass, ecorePackage.getEBoolean(), "ExactlyOneStartAction", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(resourceDemandingBehaviourEClass, ecorePackage.getEBoolean(), "EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(abstractLoopActionEClass, AbstractLoopAction.class, "AbstractLoopAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAbstractLoopAction_BodyBehaviour_Loop(), this.getResourceDemandingBehaviour(), this.getResourceDemandingBehaviour_AbstractLoopAction_ResourceDemandingBehaviour(), "bodyBehaviour_Loop", null, 0, 1, AbstractLoopAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(abstractBranchTransitionEClass, AbstractBranchTransition.class, "AbstractBranchTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAbstractBranchTransition_BranchAction_AbstractBranchTransition(), this.getBranchAction(), this.getBranchAction_Branches_Branch(), "branchAction_AbstractBranchTransition", null, 0, 1, AbstractBranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getAbstractBranchTransition_BranchBehaviour_BranchTransition(), this.getResourceDemandingBehaviour(), this.getResourceDemandingBehaviour_AbstractBranchTransition_ResourceDemandingBehaviour(), "branchBehaviour_BranchTransition", null, 0, 1, AbstractBranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(branchActionEClass, BranchAction.class, "BranchAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getBranchAction_Branches_Branch(), this.getAbstractBranchTransition(), this.getAbstractBranchTransition_BranchAction_AbstractBranchTransition(), "branches_Branch", null, 0, -1, BranchAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(branchActionEClass, ecorePackage.getEBoolean(), "EitherGuardedBranchesOrProbabilisiticBranchTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(branchActionEClass, ecorePackage.getEBoolean(), "AllProbabilisticBranchProbabilitiesMustSumUpTo1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(callActionEClass, CallAction.class, "CallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCallAction_InputVariableUsages__CallAction(), theParameter_av_pcPackage.getVariableUsage(), theParameter_av_pcPackage.getVariableUsage_CallAction__VariableUsage(), "inputVariableUsages__CallAction", null, 0, -1, CallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(startActionEClass, StartAction.class, "StartAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = addEOperation(startActionEClass, ecorePackage.getEBoolean(), "StartActionPredecessorMustNotBeDefined", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(serviceEffectSpecificationEClass, ServiceEffectSpecification.class, "ServiceEffectSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getServiceEffectSpecification_SeffTypeID(), ecorePackage.getEString(), "seffTypeID", "1", 1, 1, ServiceEffectSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getServiceEffectSpecification_DescribedService__SEFF(), theRepository_av_pcPackage.getSignature(), null, "describedService__SEFF", null, 0, 1, ServiceEffectSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getServiceEffectSpecification_BasicComponent_ServiceEffectSpecification(), theRepository_av_pcPackage.getBasicComponent(), theRepository_av_pcPackage.getBasicComponent_ServiceEffectSpecifications__BasicComponent(), "basicComponent_ServiceEffectSpecification", null, 0, 1, ServiceEffectSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(serviceEffectSpecificationEClass, ecorePackage.getEBoolean(), "ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(resourceDemandingSEFFEClass, ResourceDemandingSEFF.class, "ResourceDemandingSEFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceDemandingSEFF_ResourceDemandingInternalBehaviours(), this.getResourceDemandingInternalBehaviour(), this.getResourceDemandingInternalBehaviour_ResourceDemandingSEFF_ResourceDemandingInternalBehaviour(), "resourceDemandingInternalBehaviours", null, 0, -1, ResourceDemandingSEFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(resourceDemandingInternalBehaviourEClass, ResourceDemandingInternalBehaviour.class, "ResourceDemandingInternalBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getResourceDemandingInternalBehaviour_ResourceDemandingSEFF_ResourceDemandingInternalBehaviour(), this.getResourceDemandingSEFF(), this.getResourceDemandingSEFF_ResourceDemandingInternalBehaviours(), "resourceDemandingSEFF_ResourceDemandingInternalBehaviour", null, 0, 1, ResourceDemandingInternalBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(releaseActionEClass, ReleaseAction.class, "ReleaseAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getReleaseAction_PassiveResource_ReleaseAction(), theRepository_av_pcPackage.getPassiveResource(), null, "passiveResource_ReleaseAction", null, 0, 1, ReleaseAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(loopActionEClass, LoopAction.class, "LoopAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getLoopAction_IterationCount_LoopAction(), theCore_av_pcPackage.getPCMRandomVariable(), theCore_av_pcPackage.getPCMRandomVariable_LoopAction_PCMRandomVariable(), "iterationCount_LoopAction", null, 0, 1, LoopAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(forkActionEClass, ForkAction.class, "ForkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getForkAction_AsynchronousForkedBehaviours_ForkAction(), this.getForkedBehaviour(), this.getForkedBehaviour_ForkAction_ForkedBehaivour(), "asynchronousForkedBehaviours_ForkAction", null, 0, -1, ForkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getForkAction_SynchronisingBehaviours_ForkAction(), this.getSynchronisationPoint(), this.getSynchronisationPoint_ForkAction_SynchronisationPoint(), "synchronisingBehaviours_ForkAction", null, 0, 1, ForkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(forkedBehaviourEClass, ForkedBehaviour.class, "ForkedBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getForkedBehaviour_SynchronisationPoint_ForkedBehaviour(), this.getSynchronisationPoint(), this.getSynchronisationPoint_SynchronousForkedBehaviours_SynchronisationPoint(), "synchronisationPoint_ForkedBehaviour", null, 0, 1, ForkedBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getForkedBehaviour_ForkAction_ForkedBehaivour(), this.getForkAction(), this.getForkAction_AsynchronousForkedBehaviours_ForkAction(), "forkAction_ForkedBehaivour", null, 0, 1, ForkedBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(synchronisationPointEClass, SynchronisationPoint.class, "SynchronisationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint(), theParameter_av_pcPackage.getVariableUsage(), theParameter_av_pcPackage.getVariableUsage_SynchronisationPoint_VariableUsage(), "outputParameterUsage_SynchronisationPoint", null, 0, -1, SynchronisationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSynchronisationPoint_ForkAction_SynchronisationPoint(), this.getForkAction(), this.getForkAction_SynchronisingBehaviours_ForkAction(), "forkAction_SynchronisationPoint", null, 0, 1, SynchronisationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSynchronisationPoint_SynchronousForkedBehaviours_SynchronisationPoint(), this.getForkedBehaviour(), this.getForkedBehaviour_SynchronisationPoint_ForkedBehaviour(), "synchronousForkedBehaviours_SynchronisationPoint", null, 0, -1, SynchronisationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(externalCallActionEClass, ExternalCallAction.class, "ExternalCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExternalCallAction_CalledService_ExternalService(), theRepository_av_pcPackage.getOperationSignature(), null, "calledService_ExternalService", null, 0, 1, ExternalCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getExternalCallAction_Role_ExternalService(), theRepository_av_pcPackage.getOperationRequiredRole(), null, "role_ExternalService", null, 0, 1, ExternalCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getExternalCallAction_RetryCount(), ecorePackage.getEInt(), "retryCount", null, 1, 1, ExternalCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(externalCallActionEClass, ecorePackage.getEBoolean(), "SignatureBelongsToRole", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(externalCallActionEClass, ecorePackage.getEBoolean(), "OperationRequiredRoleMustBeReferencedByContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(callReturnActionEClass, CallReturnAction.class, "CallReturnAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCallReturnAction_ReturnVariableUsage__CallReturnAction(), theParameter_av_pcPackage.getVariableUsage(), theParameter_av_pcPackage.getVariableUsage_CallReturnAction__VariableUsage(), "returnVariableUsage__CallReturnAction", null, 0, -1, CallReturnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(probabilisticBranchTransitionEClass, ProbabilisticBranchTransition.class, "ProbabilisticBranchTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getProbabilisticBranchTransition_BranchProbability(), ecorePackage.getEDouble(), "branchProbability", null, 1, 1, ProbabilisticBranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(acquireActionEClass, AcquireAction.class, "AcquireAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAcquireAction_Passiveresource_AcquireAction(), theRepository_av_pcPackage.getPassiveResource(), null, "passiveresource_AcquireAction", null, 0, 1, AcquireAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAcquireAction_Timeout(), ecorePackage.getEBoolean(), "timeout", null, 1, 1, AcquireAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getAcquireAction_TimeoutValue(), ecorePackage.getEDouble(), "timeoutValue", null, 1, 1, AcquireAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(acquireActionEClass, ecorePackage.getEBoolean(), "TimeoutValueOfAcquireActionMustNotBeNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(collectionIteratorActionEClass, CollectionIteratorAction.class, "CollectionIteratorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCollectionIteratorAction_Parameter_CollectionIteratorAction(), theRepository_av_pcPackage.getParameter(), null, "parameter_CollectionIteratorAction", null, 0, 1, CollectionIteratorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(guardedBranchTransitionEClass, GuardedBranchTransition.class, "GuardedBranchTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getGuardedBranchTransition_BranchCondition_GuardedBranchTransition(), theCore_av_pcPackage.getPCMRandomVariable(), theCore_av_pcPackage.getPCMRandomVariable_GuardedBranchTransition_PCMRandomVariable(), "branchCondition_GuardedBranchTransition", null, 0, 1, GuardedBranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(setVariableActionEClass, SetVariableAction.class, "SetVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSetVariableAction_LocalVariableUsages_SetVariableAction(), theParameter_av_pcPackage.getVariableUsage(), theParameter_av_pcPackage.getVariableUsage_SetVariableAction_VariableUsage(), "localVariableUsages_SetVariableAction", null, 0, -1, SetVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(internalCallActionEClass, InternalCallAction.class, "InternalCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInternalCallAction_CalledResourceDemandingInternalBehaviour(), this.getResourceDemandingInternalBehaviour(), null, "calledResourceDemandingInternalBehaviour", null, 0, 1, InternalCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(emitEventActionEClass, EmitEventAction.class, "EmitEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEmitEventAction_EventType__EmitEventAction(), theRepository_av_pcPackage.getEventType(), null, "eventType__EmitEventAction", null, 0, 1, EmitEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getEmitEventAction_SourceRole__EmitEventAction(), theRepository_av_pcPackage.getSourceRole(), null, "sourceRole__EmitEventAction", null, 0, 1, EmitEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(internalActionEClass, InternalAction.class, "InternalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInternalAction_InternalFailureOccurrenceDescriptions__InternalAction(), theReliability_av_pcPackage.getInternalFailureOccurrenceDescription(), theReliability_av_pcPackage.getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription(), "internalFailureOccurrenceDescriptions__InternalAction", null, 0, -1, InternalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = addEOperation(internalActionEClass, ecorePackage.getEBoolean(), "MultipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(internalActionEClass, ecorePackage.getEBoolean(), "SumOfInternalActionFailureProbabilitiesMustNotExceed1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      // Create annotations
      // http://www.eclipse.org/uml2/1.1.0/GenModel
      createGenModel_1Annotations();
   }

   /**
    * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void createGenModel_1Annotations() {
      String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";				
      addAnnotation
        (stopActionEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.successor_AbstractAction.oclIsUndefined()"
         });							
      addAnnotation
        (resourceDemandingBehaviourEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.steps_Behaviour->select(s|s.oclIsTypeOf(StopAction))->size() = 1"
         });				
      addAnnotation
        (resourceDemandingBehaviourEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.steps_Behaviour->select(s|s.oclIsTypeOf(StartAction))->size() = 1"
         });				
      addAnnotation
        (resourceDemandingBehaviourEClass.getEOperations().get(2), 
         source, 
         new String[] {
          "body", "not self.steps_Behaviour->select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))->exists(a|a.oclAsType(AbstractAction).predecessor_AbstractAction.oclIsUndefined()) and not self.steps_Behaviour->select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))->exists(a|a.oclAsType(AbstractAction).successor_AbstractAction.oclIsUndefined())"
         });							
      addAnnotation
        (branchActionEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.branches_Branch->forAll(bt|bt.oclIsTypeOf(ProbabilisticBranchTransition)) \r\nor self.branches_Branch->forAll(bt|bt.oclIsTypeOf(GuardedBranchTransition))"
         });				
      addAnnotation
        (branchActionEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "if self.branches_Branch->forAll(oclIsTypeOf(ProbabilisticBranchTransition)) then \r\n\tself.branches_Branch->select(pbt|pbt.oclIsTypeOf(ProbabilisticBranchTransition))->collect(pbt|pbt.oclAsType(ProbabilisticBranchTransition).branchProbability)->sum() > 0.9999 \r\n\tand self.branches_Branch->select(pbt|pbt.oclIsTypeOf(ProbabilisticBranchTransition))->collect(pbt|pbt.oclAsType(ProbabilisticBranchTransition).branchProbability)->sum() < 1.0001 \r\n\telse true \r\nendif"
         });						
      addAnnotation
        (startActionEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.predecessor_AbstractAction.oclIsUndefined()"
         });					
      addAnnotation
        (serviceEffectSpecificationEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "if self.describedService__SEFF.oclIsKindOf(pcm::repository::OperationSignature) then\r\n\tself.basicComponent_ServiceEffectSpecification.providedRoles_InterfaceProvidingEntity->exists(p | p.oclIsKindOf(pcm::repository::OperationProvidedRole) and (p.oclAsType(pcm::repository::OperationProvidedRole).providedInterface__OperationProvidedRole = self.describedService__SEFF.oclAsType(pcm::repository::OperationSignature).interface__OperationSignature))\r\nelse\r\n\tif self.describedService__SEFF.oclIsKindOf(pcm::repository::EventType) then\r\n\t\tself.basicComponent_ServiceEffectSpecification.providedRoles_InterfaceProvidingEntity->exists(p | p.oclIsKindOf(pcm::repository::SinkRole) and (p.oclAsType(pcm::repository::SinkRole).eventGroup__SinkRole = self.describedService__SEFF.oclAsType(pcm::repository::EventType).eventGroup__EventType))\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif"
         });												
      addAnnotation
        (externalCallActionEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.role_ExternalService.requiredInterface__OperationRequiredRole.signatures__OperationInterface->includes(self.calledService_ExternalService)"
         });					
      addAnnotation
        (externalCallActionEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(pcm::core::entity::InterfaceRequiringEntity)).oclAsType(pcm::core::entity::InterfaceRequiringEntity).requiredRoles_InterfaceRequiringEntity->includes(self.role_ExternalService)"
         });								
      addAnnotation
        (acquireActionEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.timeoutValue.oclAsType(Real) >= 0.0"
         });												
      addAnnotation
        (internalActionEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.internalFailureOccurrenceDescriptions__InternalAction->forAll(x:pcm::reliability::InternalFailureOccurrenceDescription,y:pcm::reliability::InternalFailureOccurrenceDescription  | x<>y implies x.softwareInducedFailureType__InternalFailureOccurrenceDescription <> y.softwareInducedFailureType__InternalFailureOccurrenceDescription )\r\n"
         });				
      addAnnotation
        (internalActionEClass.getEOperations().get(1), 
         source, 
         new String[] {
          "body", "self.internalFailureOccurrenceDescriptions__InternalAction.failureProbability.oclAsType(Real)->sum()<=1.0\r\n"
         });		
   }

} //Seff_av_pcPackageImpl
