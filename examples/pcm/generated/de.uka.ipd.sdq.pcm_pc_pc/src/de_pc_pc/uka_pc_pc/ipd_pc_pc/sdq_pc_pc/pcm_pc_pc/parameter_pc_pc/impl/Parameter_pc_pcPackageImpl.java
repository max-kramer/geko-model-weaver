/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.Pcm_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.Completions_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.impl.Completions_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.Core_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.impl.Composition_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.impl.Entity_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.impl.Core_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.impl.Pcm_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.CharacterisedVariable;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.Parameter_pc_pcFactory;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.Parameter_pc_pcPackage;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.VariableCharacterisation;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.VariableCharacterisationType;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.VariableUsage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.protocol_pc_pc.Protocol_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.protocol_pc_pc.impl.Protocol_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.Qosannotations_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl.Qosannotations_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.Qos_performance_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl.Qos_performance_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc.Qos_reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_reliability_pc_pc.impl.Qos_reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.Reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.reliability_pc_pc.impl.Reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.Repository_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.repository_pc_pc.impl.Repository_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.impl.Resourceenvironment_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.Resourcetype_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.impl.Resourcetype_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.Seff_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.impl.Seff_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.Seff_performance_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl.Seff_performance_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.Seff_reliability_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_reliability_pc_pc.impl.Seff_reliability_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.Subsystem_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.impl.Subsystem_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.impl.System_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.Usagemodel_pc_pcPackage;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.usagemodel_pc_pc.impl.Usagemodel_pc_pcPackageImpl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.stoex_pc_pc.Stoex_pc_pcPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Parameter_pc_pcPackageImpl extends EPackageImpl implements Parameter_pc_pcPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass variableUsageEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass variableCharacterisationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass characterisedVariableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum variableCharacterisationTypeEEnum = null;

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
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.parameter_pc_pc.Parameter_pc_pcPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Parameter_pc_pcPackageImpl() {
      super(eNS_URI, Parameter_pc_pcFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Parameter_pc_pcPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Parameter_pc_pcPackage init() {
      if (isInited) return (Parameter_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_pc_pcPackage.eNS_URI);

      // Obtain or create and register package
      Parameter_pc_pcPackageImpl theParameter_pc_pcPackage = (Parameter_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Parameter_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Parameter_pc_pcPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_pc_pcPackage.eINSTANCE.eClass();
      Stoex_pc_pcPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_pc_pcPackageImpl thePcm_pc_pcPackage = (Pcm_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_pcPackage.eNS_URI) instanceof Pcm_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_pc_pcPackage.eNS_URI) : Pcm_pc_pcPackage.eINSTANCE);
      Core_pc_pcPackageImpl theCore_pc_pcPackage = (Core_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI) instanceof Core_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI) : Core_pc_pcPackage.eINSTANCE);
      Entity_pc_pcPackageImpl theEntity_pc_pcPackage = (Entity_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI) instanceof Entity_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_pc_pcPackage.eNS_URI) : Entity_pc_pcPackage.eINSTANCE);
      Composition_pc_pcPackageImpl theComposition_pc_pcPackage = (Composition_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI) instanceof Composition_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI) : Composition_pc_pcPackage.eINSTANCE);
      Usagemodel_pc_pcPackageImpl theUsagemodel_pc_pcPackage = (Usagemodel_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI) instanceof Usagemodel_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI) : Usagemodel_pc_pcPackage.eINSTANCE);
      Repository_pc_pcPackageImpl theRepository_pc_pcPackage = (Repository_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI) instanceof Repository_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_pc_pcPackage.eNS_URI) : Repository_pc_pcPackage.eINSTANCE);
      Resourcetype_pc_pcPackageImpl theResourcetype_pc_pcPackage = (Resourcetype_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI) instanceof Resourcetype_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_pc_pcPackage.eNS_URI) : Resourcetype_pc_pcPackage.eINSTANCE);
      Protocol_pc_pcPackageImpl theProtocol_pc_pcPackage = (Protocol_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_pcPackage.eNS_URI) instanceof Protocol_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_pc_pcPackage.eNS_URI) : Protocol_pc_pcPackage.eINSTANCE);
      Reliability_pc_pcPackageImpl theReliability_pc_pcPackage = (Reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_pcPackage.eNS_URI) instanceof Reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_pc_pcPackage.eNS_URI) : Reliability_pc_pcPackage.eINSTANCE);
      Seff_pc_pcPackageImpl theSeff_pc_pcPackage = (Seff_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI) instanceof Seff_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI) : Seff_pc_pcPackage.eINSTANCE);
      Seff_performance_pc_pcPackageImpl theSeff_performance_pc_pcPackage = (Seff_performance_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_pcPackage.eNS_URI) instanceof Seff_performance_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_pc_pcPackage.eNS_URI) : Seff_performance_pc_pcPackage.eINSTANCE);
      Seff_reliability_pc_pcPackageImpl theSeff_reliability_pc_pcPackage = (Seff_reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_pcPackage.eNS_URI) instanceof Seff_reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_pc_pcPackage.eNS_URI) : Seff_reliability_pc_pcPackage.eINSTANCE);
      Qosannotations_pc_pcPackageImpl theQosannotations_pc_pcPackage = (Qosannotations_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_pcPackage.eNS_URI) instanceof Qosannotations_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_pcPackage.eNS_URI) : Qosannotations_pc_pcPackage.eINSTANCE);
      Qos_performance_pc_pcPackageImpl theQos_performance_pc_pcPackage = (Qos_performance_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_pcPackage.eNS_URI) instanceof Qos_performance_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_pc_pcPackage.eNS_URI) : Qos_performance_pc_pcPackage.eINSTANCE);
      Qos_reliability_pc_pcPackageImpl theQos_reliability_pc_pcPackage = (Qos_reliability_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_pcPackage.eNS_URI) instanceof Qos_reliability_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_pc_pcPackage.eNS_URI) : Qos_reliability_pc_pcPackage.eINSTANCE);
      System_pc_pcPackageImpl theSystem_pc_pcPackage = (System_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_pc_pcPackage.eNS_URI) instanceof System_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_pc_pcPackage.eNS_URI) : System_pc_pcPackage.eINSTANCE);
      Resourceenvironment_pc_pcPackageImpl theResourceenvironment_pc_pcPackage = (Resourceenvironment_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_pcPackage.eNS_URI) instanceof Resourceenvironment_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_pc_pcPackage.eNS_URI) : Resourceenvironment_pc_pcPackage.eINSTANCE);
      Allocation_pc_pcPackageImpl theAllocation_pc_pcPackage = (Allocation_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_pcPackage.eNS_URI) instanceof Allocation_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_pc_pcPackage.eNS_URI) : Allocation_pc_pcPackage.eINSTANCE);
      Subsystem_pc_pcPackageImpl theSubsystem_pc_pcPackage = (Subsystem_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_pcPackage.eNS_URI) instanceof Subsystem_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_pc_pcPackage.eNS_URI) : Subsystem_pc_pcPackage.eINSTANCE);
      Completions_pc_pcPackageImpl theCompletions_pc_pcPackage = (Completions_pc_pcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_pc_pcPackage.eNS_URI) instanceof Completions_pc_pcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_pc_pcPackage.eNS_URI) : Completions_pc_pcPackage.eINSTANCE);

      // Create package meta-data objects
      theParameter_pc_pcPackage.createPackageContents();
      thePcm_pc_pcPackage.createPackageContents();
      theCore_pc_pcPackage.createPackageContents();
      theEntity_pc_pcPackage.createPackageContents();
      theComposition_pc_pcPackage.createPackageContents();
      theUsagemodel_pc_pcPackage.createPackageContents();
      theRepository_pc_pcPackage.createPackageContents();
      theResourcetype_pc_pcPackage.createPackageContents();
      theProtocol_pc_pcPackage.createPackageContents();
      theReliability_pc_pcPackage.createPackageContents();
      theSeff_pc_pcPackage.createPackageContents();
      theSeff_performance_pc_pcPackage.createPackageContents();
      theSeff_reliability_pc_pcPackage.createPackageContents();
      theQosannotations_pc_pcPackage.createPackageContents();
      theQos_performance_pc_pcPackage.createPackageContents();
      theQos_reliability_pc_pcPackage.createPackageContents();
      theSystem_pc_pcPackage.createPackageContents();
      theResourceenvironment_pc_pcPackage.createPackageContents();
      theAllocation_pc_pcPackage.createPackageContents();
      theSubsystem_pc_pcPackage.createPackageContents();
      theCompletions_pc_pcPackage.createPackageContents();

      // Initialize created meta-data
      theParameter_pc_pcPackage.initializePackageContents();
      thePcm_pc_pcPackage.initializePackageContents();
      theCore_pc_pcPackage.initializePackageContents();
      theEntity_pc_pcPackage.initializePackageContents();
      theComposition_pc_pcPackage.initializePackageContents();
      theUsagemodel_pc_pcPackage.initializePackageContents();
      theRepository_pc_pcPackage.initializePackageContents();
      theResourcetype_pc_pcPackage.initializePackageContents();
      theProtocol_pc_pcPackage.initializePackageContents();
      theReliability_pc_pcPackage.initializePackageContents();
      theSeff_pc_pcPackage.initializePackageContents();
      theSeff_performance_pc_pcPackage.initializePackageContents();
      theSeff_reliability_pc_pcPackage.initializePackageContents();
      theQosannotations_pc_pcPackage.initializePackageContents();
      theQos_performance_pc_pcPackage.initializePackageContents();
      theQos_reliability_pc_pcPackage.initializePackageContents();
      theSystem_pc_pcPackage.initializePackageContents();
      theResourceenvironment_pc_pcPackage.initializePackageContents();
      theAllocation_pc_pcPackage.initializePackageContents();
      theSubsystem_pc_pcPackage.initializePackageContents();
      theCompletions_pc_pcPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theParameter_pc_pcPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Parameter_pc_pcPackage.eNS_URI, theParameter_pc_pcPackage);
      return theParameter_pc_pcPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getVariableUsage() {
      return variableUsageEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_VariableCharacterisation_VariableUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_UserData_VariableUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_CallAction__VariableUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_SynchronisationPoint_VariableUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_CallReturnAction__VariableUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_SetVariableAction_VariableUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_SpecifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_AssemblyContext__VariableUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_EntryLevelSystemCall_InputParameterUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_EntryLevelSystemCall_OutputParameterUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableUsage_NamedReference__VariableUsage() {
      return (EReference)variableUsageEClass.getEStructuralFeatures().get(10);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getVariableCharacterisation() {
      return variableCharacterisationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getVariableCharacterisation_Type() {
      return (EAttribute)variableCharacterisationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableCharacterisation_Specification_VariableCharacterisation() {
      return (EReference)variableCharacterisationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getVariableCharacterisation_VariableUsage_VariableCharacterisation() {
      return (EReference)variableCharacterisationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCharacterisedVariable() {
      return characterisedVariableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCharacterisedVariable_CharacterisationType() {
      return (EAttribute)characterisedVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getVariableCharacterisationType() {
      return variableCharacterisationTypeEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter_pc_pcFactory getParameter_pc_pcFactory() {
      return (Parameter_pc_pcFactory)getEFactoryInstance();
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
      variableUsageEClass = createEClass(VARIABLE_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__USER_DATA_VARIABLE_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__CALL_ACTION_VARIABLE_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__SYNCHRONISATION_POINT_VARIABLE_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__CALL_RETURN_ACTION_VARIABLE_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__SET_VARIABLE_ACTION_VARIABLE_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION_EXPECTED_EXTERNAL_OUTPUTS_VARIABLE_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__ASSEMBLY_CONTEXT_VARIABLE_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__ENTRY_LEVEL_SYSTEM_CALL_INPUT_PARAMETER_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__ENTRY_LEVEL_SYSTEM_CALL_OUTPUT_PARAMETER_USAGE);
      createEReference(variableUsageEClass, VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE);

      variableCharacterisationEClass = createEClass(VARIABLE_CHARACTERISATION);
      createEAttribute(variableCharacterisationEClass, VARIABLE_CHARACTERISATION__TYPE);
      createEReference(variableCharacterisationEClass, VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION);
      createEReference(variableCharacterisationEClass, VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION);

      characterisedVariableEClass = createEClass(CHARACTERISED_VARIABLE);
      createEAttribute(characterisedVariableEClass, CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE);

      // Create enums
      variableCharacterisationTypeEEnum = createEEnum(VARIABLE_CHARACTERISATION_TYPE);
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
      Usagemodel_pc_pcPackage theUsagemodel_pc_pcPackage = (Usagemodel_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Usagemodel_pc_pcPackage.eNS_URI);
      Seff_pc_pcPackage theSeff_pc_pcPackage = (Seff_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_pc_pcPackage.eNS_URI);
      Qosannotations_pc_pcPackage theQosannotations_pc_pcPackage = (Qosannotations_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Qosannotations_pc_pcPackage.eNS_URI);
      Composition_pc_pcPackage theComposition_pc_pcPackage = (Composition_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_pc_pcPackage.eNS_URI);
      Stoex_pc_pcPackage theStoex_pc_pcPackage = (Stoex_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Stoex_pc_pcPackage.eNS_URI);
      Core_pc_pcPackage theCore_pc_pcPackage = (Core_pc_pcPackage)EPackage.Registry.INSTANCE.getEPackage(Core_pc_pcPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      characterisedVariableEClass.getESuperTypes().add(theStoex_pc_pcPackage.getVariable());

      // Initialize classes and features; add operations and parameters
      initEClass(variableUsageEClass, VariableUsage.class, "VariableUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getVariableUsage_VariableCharacterisation_VariableUsage(), this.getVariableCharacterisation(), this.getVariableCharacterisation_VariableUsage_VariableCharacterisation(), "variableCharacterisation_VariableUsage", null, 0, -1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_UserData_VariableUsage(), theUsagemodel_pc_pcPackage.getUserData(), theUsagemodel_pc_pcPackage.getUserData_UserDataParameterUsages_UserData(), "userData_VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_CallAction__VariableUsage(), theSeff_pc_pcPackage.getCallAction(), theSeff_pc_pcPackage.getCallAction_InputVariableUsages__CallAction(), "callAction__VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_SynchronisationPoint_VariableUsage(), theSeff_pc_pcPackage.getSynchronisationPoint(), theSeff_pc_pcPackage.getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint(), "synchronisationPoint_VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_CallReturnAction__VariableUsage(), theSeff_pc_pcPackage.getCallReturnAction(), theSeff_pc_pcPackage.getCallReturnAction_ReturnVariableUsage__CallReturnAction(), "callReturnAction__VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_SetVariableAction_VariableUsage(), theSeff_pc_pcPackage.getSetVariableAction(), theSeff_pc_pcPackage.getSetVariableAction_LocalVariableUsages_SetVariableAction(), "setVariableAction_VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_SpecifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage(), theQosannotations_pc_pcPackage.getSpecifiedOutputParameterAbstraction(), theQosannotations_pc_pcPackage.getSpecifiedOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction(), "specifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_AssemblyContext__VariableUsage(), theComposition_pc_pcPackage.getAssemblyContext(), theComposition_pc_pcPackage.getAssemblyContext_ConfigParameterUsages__AssemblyContext(), "assemblyContext__VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_EntryLevelSystemCall_InputParameterUsage(), theUsagemodel_pc_pcPackage.getEntryLevelSystemCall(), theUsagemodel_pc_pcPackage.getEntryLevelSystemCall_InputParameterUsages_EntryLevelSystemCall(), "entryLevelSystemCall_InputParameterUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_EntryLevelSystemCall_OutputParameterUsage(), theUsagemodel_pc_pcPackage.getEntryLevelSystemCall(), theUsagemodel_pc_pcPackage.getEntryLevelSystemCall_OutputParameterUsages_EntryLevelSystemCall(), "entryLevelSystemCall_OutputParameterUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_NamedReference__VariableUsage(), theStoex_pc_pcPackage.getAbstractNamedReference(), null, "namedReference__VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(variableCharacterisationEClass, VariableCharacterisation.class, "VariableCharacterisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getVariableCharacterisation_Type(), this.getVariableCharacterisationType(), "type", null, 1, 1, VariableCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableCharacterisation_Specification_VariableCharacterisation(), theCore_pc_pcPackage.getPCMRandomVariable(), theCore_pc_pcPackage.getPCMRandomVariable_VariableCharacterisation_Specification(), "specification_VariableCharacterisation", null, 0, 1, VariableCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableCharacterisation_VariableUsage_VariableCharacterisation(), this.getVariableUsage(), this.getVariableUsage_VariableCharacterisation_VariableUsage(), "variableUsage_VariableCharacterisation", null, 0, 1, VariableCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(characterisedVariableEClass, CharacterisedVariable.class, "CharacterisedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getCharacterisedVariable_CharacterisationType(), this.getVariableCharacterisationType(), "characterisationType", null, 1, 1, CharacterisedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(variableCharacterisationTypeEEnum, VariableCharacterisationType.class, "VariableCharacterisationType");
      addEEnumLiteral(variableCharacterisationTypeEEnum, VariableCharacterisationType.STRUCTURE);
      addEEnumLiteral(variableCharacterisationTypeEEnum, VariableCharacterisationType.NUMBER_OF_ELEMENTS);
      addEEnumLiteral(variableCharacterisationTypeEEnum, VariableCharacterisationType.VALUE);
      addEEnumLiteral(variableCharacterisationTypeEEnum, VariableCharacterisationType.BYTESIZE);
      addEEnumLiteral(variableCharacterisationTypeEEnum, VariableCharacterisationType.TYPE);
   }

} //Parameter_pc_pcPackageImpl
