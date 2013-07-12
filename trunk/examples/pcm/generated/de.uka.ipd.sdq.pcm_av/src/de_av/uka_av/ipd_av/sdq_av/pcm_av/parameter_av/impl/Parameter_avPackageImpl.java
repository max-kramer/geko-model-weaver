/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.impl;

import de_av.uka_av.ipd_av.sdq_av.identifier_av.Identifier_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.Pcm_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.Allocation_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.Completions_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl.Completions_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.Core_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.impl.Composition_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.impl.Entity_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.impl.Core_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.CharacterisedVariable;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.Parameter_avFactory;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.Parameter_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableCharacterisation;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableCharacterisationType;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.VariableUsage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.protocol_av.Protocol_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.protocol_av.impl.Protocol_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.impl.Qosannotations_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av.Qos_performance_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av.impl.Qos_performance_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_reliability_av.Qos_reliability_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_reliability_av.impl.Qos_reliability_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.Reliability_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.reliability_av.impl.Reliability_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.Repository_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.repository_av.impl.Repository_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.impl.Resourceenvironment_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.impl.Resourcetype_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.impl.Seff_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.Seff_performance_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.Seff_performance_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.Seff_reliability_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_reliability_av.impl.Seff_reliability_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.subsystem_av.Subsystem_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.subsystem_av.impl.Subsystem_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.impl.System_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.Usagemodel_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.usagemodel_av.impl.Usagemodel_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage;

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
public class Parameter_avPackageImpl extends EPackageImpl implements Parameter_avPackage {
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
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.Parameter_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Parameter_avPackageImpl() {
      super(eNS_URI, Parameter_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Parameter_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Parameter_avPackage init() {
      if (isInited) return (Parameter_avPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_avPackage.eNS_URI);

      // Obtain or create and register package
      Parameter_avPackageImpl theParameter_avPackage = (Parameter_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Parameter_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Parameter_avPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      Identifier_avPackage.eINSTANCE.eClass();
      Stoex_avPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      Pcm_avPackageImpl thePcm_avPackage = (Pcm_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pcm_avPackage.eNS_URI) instanceof Pcm_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pcm_avPackage.eNS_URI) : Pcm_avPackage.eINSTANCE);
      Core_avPackageImpl theCore_avPackage = (Core_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Core_avPackage.eNS_URI) instanceof Core_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Core_avPackage.eNS_URI) : Core_avPackage.eINSTANCE);
      Entity_avPackageImpl theEntity_avPackage = (Entity_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Entity_avPackage.eNS_URI) instanceof Entity_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Entity_avPackage.eNS_URI) : Entity_avPackage.eINSTANCE);
      Composition_avPackageImpl theComposition_avPackage = (Composition_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Composition_avPackage.eNS_URI) instanceof Composition_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Composition_avPackage.eNS_URI) : Composition_avPackage.eINSTANCE);
      Usagemodel_avPackageImpl theUsagemodel_avPackage = (Usagemodel_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Usagemodel_avPackage.eNS_URI) instanceof Usagemodel_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Usagemodel_avPackage.eNS_URI) : Usagemodel_avPackage.eINSTANCE);
      Repository_avPackageImpl theRepository_avPackage = (Repository_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Repository_avPackage.eNS_URI) instanceof Repository_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Repository_avPackage.eNS_URI) : Repository_avPackage.eINSTANCE);
      Resourcetype_avPackageImpl theResourcetype_avPackage = (Resourcetype_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourcetype_avPackage.eNS_URI) instanceof Resourcetype_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourcetype_avPackage.eNS_URI) : Resourcetype_avPackage.eINSTANCE);
      Protocol_avPackageImpl theProtocol_avPackage = (Protocol_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Protocol_avPackage.eNS_URI) instanceof Protocol_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Protocol_avPackage.eNS_URI) : Protocol_avPackage.eINSTANCE);
      Reliability_avPackageImpl theReliability_avPackage = (Reliability_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_avPackage.eNS_URI) instanceof Reliability_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_avPackage.eNS_URI) : Reliability_avPackage.eINSTANCE);
      Seff_avPackageImpl theSeff_avPackage = (Seff_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_avPackage.eNS_URI) instanceof Seff_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_avPackage.eNS_URI) : Seff_avPackage.eINSTANCE);
      Seff_performance_avPackageImpl theSeff_performance_avPackage = (Seff_performance_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_avPackage.eNS_URI) instanceof Seff_performance_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_avPackage.eNS_URI) : Seff_performance_avPackage.eINSTANCE);
      Seff_reliability_avPackageImpl theSeff_reliability_avPackage = (Seff_reliability_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_avPackage.eNS_URI) instanceof Seff_reliability_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_avPackage.eNS_URI) : Seff_reliability_avPackage.eINSTANCE);
      Qosannotations_avPackageImpl theQosannotations_avPackage = (Qosannotations_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qosannotations_avPackage.eNS_URI) instanceof Qosannotations_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qosannotations_avPackage.eNS_URI) : Qosannotations_avPackage.eINSTANCE);
      Qos_performance_avPackageImpl theQos_performance_avPackage = (Qos_performance_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_avPackage.eNS_URI) instanceof Qos_performance_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_avPackage.eNS_URI) : Qos_performance_avPackage.eINSTANCE);
      Qos_reliability_avPackageImpl theQos_reliability_avPackage = (Qos_reliability_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_avPackage.eNS_URI) instanceof Qos_reliability_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_avPackage.eNS_URI) : Qos_reliability_avPackage.eINSTANCE);
      System_avPackageImpl theSystem_avPackage = (System_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_avPackage.eNS_URI) instanceof System_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_avPackage.eNS_URI) : System_avPackage.eINSTANCE);
      Resourceenvironment_avPackageImpl theResourceenvironment_avPackage = (Resourceenvironment_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_avPackage.eNS_URI) instanceof Resourceenvironment_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_avPackage.eNS_URI) : Resourceenvironment_avPackage.eINSTANCE);
      Allocation_avPackageImpl theAllocation_avPackage = (Allocation_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_avPackage.eNS_URI) instanceof Allocation_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_avPackage.eNS_URI) : Allocation_avPackage.eINSTANCE);
      Subsystem_avPackageImpl theSubsystem_avPackage = (Subsystem_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_avPackage.eNS_URI) instanceof Subsystem_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_avPackage.eNS_URI) : Subsystem_avPackage.eINSTANCE);
      Completions_avPackageImpl theCompletions_avPackage = (Completions_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_avPackage.eNS_URI) instanceof Completions_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_avPackage.eNS_URI) : Completions_avPackage.eINSTANCE);

      // Create package meta-data objects
      theParameter_avPackage.createPackageContents();
      thePcm_avPackage.createPackageContents();
      theCore_avPackage.createPackageContents();
      theEntity_avPackage.createPackageContents();
      theComposition_avPackage.createPackageContents();
      theUsagemodel_avPackage.createPackageContents();
      theRepository_avPackage.createPackageContents();
      theResourcetype_avPackage.createPackageContents();
      theProtocol_avPackage.createPackageContents();
      theReliability_avPackage.createPackageContents();
      theSeff_avPackage.createPackageContents();
      theSeff_performance_avPackage.createPackageContents();
      theSeff_reliability_avPackage.createPackageContents();
      theQosannotations_avPackage.createPackageContents();
      theQos_performance_avPackage.createPackageContents();
      theQos_reliability_avPackage.createPackageContents();
      theSystem_avPackage.createPackageContents();
      theResourceenvironment_avPackage.createPackageContents();
      theAllocation_avPackage.createPackageContents();
      theSubsystem_avPackage.createPackageContents();
      theCompletions_avPackage.createPackageContents();

      // Initialize created meta-data
      theParameter_avPackage.initializePackageContents();
      thePcm_avPackage.initializePackageContents();
      theCore_avPackage.initializePackageContents();
      theEntity_avPackage.initializePackageContents();
      theComposition_avPackage.initializePackageContents();
      theUsagemodel_avPackage.initializePackageContents();
      theRepository_avPackage.initializePackageContents();
      theResourcetype_avPackage.initializePackageContents();
      theProtocol_avPackage.initializePackageContents();
      theReliability_avPackage.initializePackageContents();
      theSeff_avPackage.initializePackageContents();
      theSeff_performance_avPackage.initializePackageContents();
      theSeff_reliability_avPackage.initializePackageContents();
      theQosannotations_avPackage.initializePackageContents();
      theQos_performance_avPackage.initializePackageContents();
      theQos_reliability_avPackage.initializePackageContents();
      theSystem_avPackage.initializePackageContents();
      theResourceenvironment_avPackage.initializePackageContents();
      theAllocation_avPackage.initializePackageContents();
      theSubsystem_avPackage.initializePackageContents();
      theCompletions_avPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theParameter_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Parameter_avPackage.eNS_URI, theParameter_avPackage);
      return theParameter_avPackage;
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
   public Parameter_avFactory getParameter_avFactory() {
      return (Parameter_avFactory)getEFactoryInstance();
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
      Usagemodel_avPackage theUsagemodel_avPackage = (Usagemodel_avPackage)EPackage.Registry.INSTANCE.getEPackage(Usagemodel_avPackage.eNS_URI);
      Seff_avPackage theSeff_avPackage = (Seff_avPackage)EPackage.Registry.INSTANCE.getEPackage(Seff_avPackage.eNS_URI);
      Qosannotations_avPackage theQosannotations_avPackage = (Qosannotations_avPackage)EPackage.Registry.INSTANCE.getEPackage(Qosannotations_avPackage.eNS_URI);
      Composition_avPackage theComposition_avPackage = (Composition_avPackage)EPackage.Registry.INSTANCE.getEPackage(Composition_avPackage.eNS_URI);
      Stoex_avPackage theStoex_avPackage = (Stoex_avPackage)EPackage.Registry.INSTANCE.getEPackage(Stoex_avPackage.eNS_URI);
      Core_avPackage theCore_avPackage = (Core_avPackage)EPackage.Registry.INSTANCE.getEPackage(Core_avPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      characterisedVariableEClass.getESuperTypes().add(theStoex_avPackage.getVariable());

      // Initialize classes and features; add operations and parameters
      initEClass(variableUsageEClass, VariableUsage.class, "VariableUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getVariableUsage_VariableCharacterisation_VariableUsage(), this.getVariableCharacterisation(), this.getVariableCharacterisation_VariableUsage_VariableCharacterisation(), "variableCharacterisation_VariableUsage", null, 0, -1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_UserData_VariableUsage(), theUsagemodel_avPackage.getUserData(), theUsagemodel_avPackage.getUserData_UserDataParameterUsages_UserData(), "userData_VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_CallAction__VariableUsage(), theSeff_avPackage.getCallAction(), theSeff_avPackage.getCallAction_InputVariableUsages__CallAction(), "callAction__VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_SynchronisationPoint_VariableUsage(), theSeff_avPackage.getSynchronisationPoint(), theSeff_avPackage.getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint(), "synchronisationPoint_VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_CallReturnAction__VariableUsage(), theSeff_avPackage.getCallReturnAction(), theSeff_avPackage.getCallReturnAction_ReturnVariableUsage__CallReturnAction(), "callReturnAction__VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_SetVariableAction_VariableUsage(), theSeff_avPackage.getSetVariableAction(), theSeff_avPackage.getSetVariableAction_LocalVariableUsages_SetVariableAction(), "setVariableAction_VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_SpecifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage(), theQosannotations_avPackage.getSpecifiedOutputParameterAbstraction(), theQosannotations_avPackage.getSpecifiedOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction(), "specifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_AssemblyContext__VariableUsage(), theComposition_avPackage.getAssemblyContext(), theComposition_avPackage.getAssemblyContext_ConfigParameterUsages__AssemblyContext(), "assemblyContext__VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_EntryLevelSystemCall_InputParameterUsage(), theUsagemodel_avPackage.getEntryLevelSystemCall(), theUsagemodel_avPackage.getEntryLevelSystemCall_InputParameterUsages_EntryLevelSystemCall(), "entryLevelSystemCall_InputParameterUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_EntryLevelSystemCall_OutputParameterUsage(), theUsagemodel_avPackage.getEntryLevelSystemCall(), theUsagemodel_avPackage.getEntryLevelSystemCall_OutputParameterUsages_EntryLevelSystemCall(), "entryLevelSystemCall_OutputParameterUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableUsage_NamedReference__VariableUsage(), theStoex_avPackage.getAbstractNamedReference(), null, "namedReference__VariableUsage", null, 0, 1, VariableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(variableCharacterisationEClass, VariableCharacterisation.class, "VariableCharacterisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getVariableCharacterisation_Type(), this.getVariableCharacterisationType(), "type", null, 1, 1, VariableCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getVariableCharacterisation_Specification_VariableCharacterisation(), theCore_avPackage.getPCMRandomVariable(), theCore_avPackage.getPCMRandomVariable_VariableCharacterisation_Specification(), "specification_VariableCharacterisation", null, 0, 1, VariableCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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

} //Parameter_avPackageImpl
