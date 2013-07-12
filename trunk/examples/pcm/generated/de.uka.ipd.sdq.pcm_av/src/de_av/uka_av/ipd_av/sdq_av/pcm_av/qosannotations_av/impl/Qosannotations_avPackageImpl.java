/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.impl;

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

import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.Parameter_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.parameter_av.impl.Parameter_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.protocol_av.Protocol_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.protocol_av.impl.Protocol_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.QoSAnnotations;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avFactory;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.SpecifiedOutputParameterAbstraction;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.SpecifiedQoSAnnotation;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av.Qos_performance_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_performance_av.impl.Qos_performance_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_reliability_av.Qos_reliability_avPackage;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_reliability_av.impl.Qos_reliability_avPackageImpl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.util.Qosannotations_avValidator;

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
public class Qosannotations_avPackageImpl extends EPackageImpl implements Qosannotations_avPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass specifiedQoSAnnotationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass qoSAnnotationsEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass specifiedOutputParameterAbstractionEClass = null;

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
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private Qosannotations_avPackageImpl() {
      super(eNS_URI, Qosannotations_avFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link Qosannotations_avPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static Qosannotations_avPackage init() {
      if (isInited) return (Qosannotations_avPackage)EPackage.Registry.INSTANCE.getEPackage(Qosannotations_avPackage.eNS_URI);

      // Obtain or create and register package
      Qosannotations_avPackageImpl theQosannotations_avPackage = (Qosannotations_avPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Qosannotations_avPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Qosannotations_avPackageImpl());

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
      Parameter_avPackageImpl theParameter_avPackage = (Parameter_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Parameter_avPackage.eNS_URI) instanceof Parameter_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Parameter_avPackage.eNS_URI) : Parameter_avPackage.eINSTANCE);
      Reliability_avPackageImpl theReliability_avPackage = (Reliability_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Reliability_avPackage.eNS_URI) instanceof Reliability_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Reliability_avPackage.eNS_URI) : Reliability_avPackage.eINSTANCE);
      Seff_avPackageImpl theSeff_avPackage = (Seff_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_avPackage.eNS_URI) instanceof Seff_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_avPackage.eNS_URI) : Seff_avPackage.eINSTANCE);
      Seff_performance_avPackageImpl theSeff_performance_avPackage = (Seff_performance_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_performance_avPackage.eNS_URI) instanceof Seff_performance_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_performance_avPackage.eNS_URI) : Seff_performance_avPackage.eINSTANCE);
      Seff_reliability_avPackageImpl theSeff_reliability_avPackage = (Seff_reliability_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_avPackage.eNS_URI) instanceof Seff_reliability_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seff_reliability_avPackage.eNS_URI) : Seff_reliability_avPackage.eINSTANCE);
      Qos_performance_avPackageImpl theQos_performance_avPackage = (Qos_performance_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_performance_avPackage.eNS_URI) instanceof Qos_performance_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_performance_avPackage.eNS_URI) : Qos_performance_avPackage.eINSTANCE);
      Qos_reliability_avPackageImpl theQos_reliability_avPackage = (Qos_reliability_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_avPackage.eNS_URI) instanceof Qos_reliability_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_avPackage.eNS_URI) : Qos_reliability_avPackage.eINSTANCE);
      System_avPackageImpl theSystem_avPackage = (System_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(System_avPackage.eNS_URI) instanceof System_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(System_avPackage.eNS_URI) : System_avPackage.eINSTANCE);
      Resourceenvironment_avPackageImpl theResourceenvironment_avPackage = (Resourceenvironment_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_avPackage.eNS_URI) instanceof Resourceenvironment_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Resourceenvironment_avPackage.eNS_URI) : Resourceenvironment_avPackage.eINSTANCE);
      Allocation_avPackageImpl theAllocation_avPackage = (Allocation_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_avPackage.eNS_URI) instanceof Allocation_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_avPackage.eNS_URI) : Allocation_avPackage.eINSTANCE);
      Subsystem_avPackageImpl theSubsystem_avPackage = (Subsystem_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Subsystem_avPackage.eNS_URI) instanceof Subsystem_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Subsystem_avPackage.eNS_URI) : Subsystem_avPackage.eINSTANCE);
      Completions_avPackageImpl theCompletions_avPackage = (Completions_avPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Completions_avPackage.eNS_URI) instanceof Completions_avPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Completions_avPackage.eNS_URI) : Completions_avPackage.eINSTANCE);

      // Create package meta-data objects
      theQosannotations_avPackage.createPackageContents();
      thePcm_avPackage.createPackageContents();
      theCore_avPackage.createPackageContents();
      theEntity_avPackage.createPackageContents();
      theComposition_avPackage.createPackageContents();
      theUsagemodel_avPackage.createPackageContents();
      theRepository_avPackage.createPackageContents();
      theResourcetype_avPackage.createPackageContents();
      theProtocol_avPackage.createPackageContents();
      theParameter_avPackage.createPackageContents();
      theReliability_avPackage.createPackageContents();
      theSeff_avPackage.createPackageContents();
      theSeff_performance_avPackage.createPackageContents();
      theSeff_reliability_avPackage.createPackageContents();
      theQos_performance_avPackage.createPackageContents();
      theQos_reliability_avPackage.createPackageContents();
      theSystem_avPackage.createPackageContents();
      theResourceenvironment_avPackage.createPackageContents();
      theAllocation_avPackage.createPackageContents();
      theSubsystem_avPackage.createPackageContents();
      theCompletions_avPackage.createPackageContents();

      // Initialize created meta-data
      theQosannotations_avPackage.initializePackageContents();
      thePcm_avPackage.initializePackageContents();
      theCore_avPackage.initializePackageContents();
      theEntity_avPackage.initializePackageContents();
      theComposition_avPackage.initializePackageContents();
      theUsagemodel_avPackage.initializePackageContents();
      theRepository_avPackage.initializePackageContents();
      theResourcetype_avPackage.initializePackageContents();
      theProtocol_avPackage.initializePackageContents();
      theParameter_avPackage.initializePackageContents();
      theReliability_avPackage.initializePackageContents();
      theSeff_avPackage.initializePackageContents();
      theSeff_performance_avPackage.initializePackageContents();
      theSeff_reliability_avPackage.initializePackageContents();
      theQos_performance_avPackage.initializePackageContents();
      theQos_reliability_avPackage.initializePackageContents();
      theSystem_avPackage.initializePackageContents();
      theResourceenvironment_avPackage.initializePackageContents();
      theAllocation_avPackage.initializePackageContents();
      theSubsystem_avPackage.initializePackageContents();
      theCompletions_avPackage.initializePackageContents();

      // Register package validator
      EValidator.Registry.INSTANCE.put
         (theQosannotations_avPackage, 
          new EValidator.Descriptor() {
             public EValidator getEValidator() {
                return Qosannotations_avValidator.INSTANCE;
             }
          });

      // Mark meta-data to indicate it can't be changed
      theQosannotations_avPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(Qosannotations_avPackage.eNS_URI, theQosannotations_avPackage);
      return theQosannotations_avPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSpecifiedQoSAnnotation() {
      return specifiedQoSAnnotationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSpecifiedQoSAnnotation_Signature_SpecifiedQoSAnnation() {
      return (EReference)specifiedQoSAnnotationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSpecifiedQoSAnnotation_Role_SpecifiedQoSAnnotation() {
      return (EReference)specifiedQoSAnnotationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSpecifiedQoSAnnotation_QosAnnotations_SpecifiedQoSAnnotation() {
      return (EReference)specifiedQoSAnnotationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getQoSAnnotations() {
      return qoSAnnotationsEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations() {
      return (EReference)qoSAnnotationsEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getQoSAnnotations_System_QoSAnnotations() {
      return (EReference)qoSAnnotationsEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getQoSAnnotations_SpecifiedQoSAnnotations_QoSAnnotations() {
      return (EReference)qoSAnnotationsEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSpecifiedOutputParameterAbstraction() {
      return specifiedOutputParameterAbstractionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSpecifiedOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction() {
      return (EReference)specifiedOutputParameterAbstractionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSpecifiedOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction() {
      return (EReference)specifiedOutputParameterAbstractionEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSpecifiedOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction() {
      return (EReference)specifiedOutputParameterAbstractionEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSpecifiedOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction() {
      return (EReference)specifiedOutputParameterAbstractionEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_avFactory getQosannotations_avFactory() {
      return (Qosannotations_avFactory)getEFactoryInstance();
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
      specifiedQoSAnnotationEClass = createEClass(SPECIFIED_QO_SANNOTATION);
      createEReference(specifiedQoSAnnotationEClass, SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION);
      createEReference(specifiedQoSAnnotationEClass, SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION);
      createEReference(specifiedQoSAnnotationEClass, SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION);

      qoSAnnotationsEClass = createEClass(QO_SANNOTATIONS);
      createEReference(qoSAnnotationsEClass, QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS);
      createEReference(qoSAnnotationsEClass, QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS);
      createEReference(qoSAnnotationsEClass, QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS);

      specifiedOutputParameterAbstractionEClass = createEClass(SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
      createEReference(specifiedOutputParameterAbstractionEClass, SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
      createEReference(specifiedOutputParameterAbstractionEClass, SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
      createEReference(specifiedOutputParameterAbstractionEClass, SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
      createEReference(specifiedOutputParameterAbstractionEClass, SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
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
      Qos_performance_avPackage theQos_performance_avPackage = (Qos_performance_avPackage)EPackage.Registry.INSTANCE.getEPackage(Qos_performance_avPackage.eNS_URI);
      Qos_reliability_avPackage theQos_reliability_avPackage = (Qos_reliability_avPackage)EPackage.Registry.INSTANCE.getEPackage(Qos_reliability_avPackage.eNS_URI);
      Repository_avPackage theRepository_avPackage = (Repository_avPackage)EPackage.Registry.INSTANCE.getEPackage(Repository_avPackage.eNS_URI);
      Entity_avPackage theEntity_avPackage = (Entity_avPackage)EPackage.Registry.INSTANCE.getEPackage(Entity_avPackage.eNS_URI);
      System_avPackage theSystem_avPackage = (System_avPackage)EPackage.Registry.INSTANCE.getEPackage(System_avPackage.eNS_URI);
      Parameter_avPackage theParameter_avPackage = (Parameter_avPackage)EPackage.Registry.INSTANCE.getEPackage(Parameter_avPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theQos_performance_avPackage);
      getESubpackages().add(theQos_reliability_avPackage);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      qoSAnnotationsEClass.getESuperTypes().add(theEntity_avPackage.getEntity());

      // Initialize classes and features; add operations and parameters
      initEClass(specifiedQoSAnnotationEClass, SpecifiedQoSAnnotation.class, "SpecifiedQoSAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSpecifiedQoSAnnotation_Signature_SpecifiedQoSAnnation(), theRepository_avPackage.getSignature(), null, "signature_SpecifiedQoSAnnation", null, 0, 1, SpecifiedQoSAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSpecifiedQoSAnnotation_Role_SpecifiedQoSAnnotation(), theRepository_avPackage.getRole(), null, "role_SpecifiedQoSAnnotation", null, 0, 1, SpecifiedQoSAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSpecifiedQoSAnnotation_QosAnnotations_SpecifiedQoSAnnotation(), this.getQoSAnnotations(), this.getQoSAnnotations_SpecifiedQoSAnnotations_QoSAnnotations(), "qosAnnotations_SpecifiedQoSAnnotation", null, 0, 1, SpecifiedQoSAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(qoSAnnotationsEClass, QoSAnnotations.class, "QoSAnnotations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations(), this.getSpecifiedOutputParameterAbstraction(), this.getSpecifiedOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction(), "specifiedOutputParameterAbstractions_QoSAnnotations", null, 0, -1, QoSAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getQoSAnnotations_System_QoSAnnotations(), theSystem_avPackage.getSystem(), theSystem_avPackage.getSystem_QosAnnotations_System(), "system_QoSAnnotations", null, 0, 1, QoSAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getQoSAnnotations_SpecifiedQoSAnnotations_QoSAnnotations(), this.getSpecifiedQoSAnnotation(), this.getSpecifiedQoSAnnotation_QosAnnotations_SpecifiedQoSAnnotation(), "specifiedQoSAnnotations_QoSAnnotations", null, 0, -1, QoSAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = addEOperation(qoSAnnotationsEClass, ecorePackage.getEBoolean(), "MultipleReliabilityAnnotationsPerExternalCallNotAllowed", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(ecorePackage.getEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEJavaObject());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(specifiedOutputParameterAbstractionEClass, SpecifiedOutputParameterAbstraction.class, "SpecifiedOutputParameterAbstraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSpecifiedOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction(), theRepository_avPackage.getSignature(), null, "signature_SpecifiedOutputParameterAbstraction", null, 0, 1, SpecifiedOutputParameterAbstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSpecifiedOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction(), theRepository_avPackage.getRole(), null, "role_SpecifiedOutputParameterAbstraction", null, 0, 1, SpecifiedOutputParameterAbstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSpecifiedOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction(), theParameter_avPackage.getVariableUsage(), theParameter_avPackage.getVariableUsage_SpecifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage(), "expectedExternalOutputs_SpecifiedOutputParameterAbstraction", null, 0, -1, SpecifiedOutputParameterAbstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEReference(getSpecifiedOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction(), this.getQoSAnnotations(), this.getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations(), "qosAnnotations_SpecifiedOutputParameterAbstraction", null, 0, 1, SpecifiedOutputParameterAbstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
        (qoSAnnotationsEClass.getEOperations().get(0), 
         source, 
         new String[] {
          "body", "self.specifiedQoSAnnotations_QoSAnnotations->select(oclIsTypeOf(pcm::qosannotations::qos_reliability::SpecifiedReliabilityAnnotation))->forAll( x, y | ( x<>y ) implies ( ( x.role_SpecifiedQoSAnnotation <> y.role_SpecifiedQoSAnnotation )  or ( x.signature_SpecifiedQoSAnnation <> y.signature_SpecifiedQoSAnnation ) ) )"
         });			
   }

} //Qosannotations_avPackageImpl
