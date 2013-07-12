/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Repository_av_avFactoryImpl extends EFactoryImpl implements Repository_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Repository_av_avFactory init() {
      try {
         Repository_av_avFactory theRepository_av_avFactory = (Repository_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Repository_av_avPackage.eNS_URI);
         if (theRepository_av_avFactory != null) {
            return theRepository_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Repository_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Repository_av_avFactoryImpl() {
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
         case Repository_av_avPackage.PASSIVE_RESOURCE: return createPassiveResource();
         case Repository_av_avPackage.BASIC_COMPONENT: return createBasicComponent();
         case Repository_av_avPackage.IMPLEMENTATION_COMPONENT_TYPE: return createImplementationComponentType();
         case Repository_av_avPackage.REPOSITORY_COMPONENT: return createRepositoryComponent();
         case Repository_av_avPackage.PROVIDED_ROLE: return createProvidedRole();
         case Repository_av_avPackage.PARAMETER: return createParameter();
         case Repository_av_avPackage.DATA_TYPE: return createDataType();
         case Repository_av_avPackage.REPOSITORY: return createRepository();
         case Repository_av_avPackage.INTERFACE: return createInterface();
         case Repository_av_avPackage.REQUIRED_CHARACTERISATION: return createRequiredCharacterisation();
         case Repository_av_avPackage.EVENT_GROUP: return createEventGroup();
         case Repository_av_avPackage.EVENT_TYPE: return createEventType();
         case Repository_av_avPackage.SIGNATURE: return createSignature();
         case Repository_av_avPackage.EXCEPTION_TYPE: return createExceptionType();
         case Repository_av_avPackage.INFRASTRUCTURE_SIGNATURE: return createInfrastructureSignature();
         case Repository_av_avPackage.INFRASTRUCTURE_INTERFACE: return createInfrastructureInterface();
         case Repository_av_avPackage.INFRASTRUCTURE_REQUIRED_ROLE: return createInfrastructureRequiredRole();
         case Repository_av_avPackage.REQUIRED_ROLE: return createRequiredRole();
         case Repository_av_avPackage.OPERATION_SIGNATURE: return createOperationSignature();
         case Repository_av_avPackage.OPERATION_INTERFACE: return createOperationInterface();
         case Repository_av_avPackage.OPERATION_REQUIRED_ROLE: return createOperationRequiredRole();
         case Repository_av_avPackage.SOURCE_ROLE: return createSourceRole();
         case Repository_av_avPackage.SINK_ROLE: return createSinkRole();
         case Repository_av_avPackage.OPERATION_PROVIDED_ROLE: return createOperationProvidedRole();
         case Repository_av_avPackage.INFRASTRUCTURE_PROVIDED_ROLE: return createInfrastructureProvidedRole();
         case Repository_av_avPackage.COMPLETE_COMPONENT_TYPE: return createCompleteComponentType();
         case Repository_av_avPackage.PROVIDES_COMPONENT_TYPE: return createProvidesComponentType();
         case Repository_av_avPackage.COMPOSITE_COMPONENT: return createCompositeComponent();
         case Repository_av_avPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
         case Repository_av_avPackage.COLLECTION_DATA_TYPE: return createCollectionDataType();
         case Repository_av_avPackage.COMPOSITE_DATA_TYPE: return createCompositeDataType();
         case Repository_av_avPackage.INNER_DECLARATION: return createInnerDeclaration();
         case Repository_av_avPackage.ROLE: return createRole();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue) {
      switch (eDataType.getClassifierID()) {
         case Repository_av_avPackage.PARAMETER_MODIFIER:
            return createParameterModifierFromString(eDataType, initialValue);
         case Repository_av_avPackage.COMPONENT_TYPE:
            return createComponentTypeFromString(eDataType, initialValue);
         case Repository_av_avPackage.PRIMITIVE_TYPE_ENUM:
            return createPrimitiveTypeEnumFromString(eDataType, initialValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue) {
      switch (eDataType.getClassifierID()) {
         case Repository_av_avPackage.PARAMETER_MODIFIER:
            return convertParameterModifierToString(eDataType, instanceValue);
         case Repository_av_avPackage.COMPONENT_TYPE:
            return convertComponentTypeToString(eDataType, instanceValue);
         case Repository_av_avPackage.PRIMITIVE_TYPE_ENUM:
            return convertPrimitiveTypeEnumToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PassiveResource createPassiveResource() {
      PassiveResourceImpl passiveResource = new PassiveResourceImpl();
      return passiveResource;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BasicComponent createBasicComponent() {
      BasicComponentImpl basicComponent = new BasicComponentImpl();
      return basicComponent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ImplementationComponentType createImplementationComponentType() {
      ImplementationComponentTypeImpl implementationComponentType = new ImplementationComponentTypeImpl();
      return implementationComponentType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RepositoryComponent createRepositoryComponent() {
      RepositoryComponentImpl repositoryComponent = new RepositoryComponentImpl();
      return repositoryComponent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProvidedRole createProvidedRole() {
      ProvidedRoleImpl providedRole = new ProvidedRoleImpl();
      return providedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter createParameter() {
      ParameterImpl parameter = new ParameterImpl();
      return parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType createDataType() {
      DataTypeImpl dataType = new DataTypeImpl();
      return dataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Repository createRepository() {
      RepositoryImpl repository = new RepositoryImpl();
      return repository;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Interface createInterface() {
      InterfaceImpl interface_ = new InterfaceImpl();
      return interface_;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RequiredCharacterisation createRequiredCharacterisation() {
      RequiredCharacterisationImpl requiredCharacterisation = new RequiredCharacterisationImpl();
      return requiredCharacterisation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventGroup createEventGroup() {
      EventGroupImpl eventGroup = new EventGroupImpl();
      return eventGroup;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventType createEventType() {
      EventTypeImpl eventType = new EventTypeImpl();
      return eventType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Signature createSignature() {
      SignatureImpl signature = new SignatureImpl();
      return signature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExceptionType createExceptionType() {
      ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
      return exceptionType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureSignature createInfrastructureSignature() {
      InfrastructureSignatureImpl infrastructureSignature = new InfrastructureSignatureImpl();
      return infrastructureSignature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureInterface createInfrastructureInterface() {
      InfrastructureInterfaceImpl infrastructureInterface = new InfrastructureInterfaceImpl();
      return infrastructureInterface;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureRequiredRole createInfrastructureRequiredRole() {
      InfrastructureRequiredRoleImpl infrastructureRequiredRole = new InfrastructureRequiredRoleImpl();
      return infrastructureRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RequiredRole createRequiredRole() {
      RequiredRoleImpl requiredRole = new RequiredRoleImpl();
      return requiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationSignature createOperationSignature() {
      OperationSignatureImpl operationSignature = new OperationSignatureImpl();
      return operationSignature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationInterface createOperationInterface() {
      OperationInterfaceImpl operationInterface = new OperationInterfaceImpl();
      return operationInterface;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationRequiredRole createOperationRequiredRole() {
      OperationRequiredRoleImpl operationRequiredRole = new OperationRequiredRoleImpl();
      return operationRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SourceRole createSourceRole() {
      SourceRoleImpl sourceRole = new SourceRoleImpl();
      return sourceRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SinkRole createSinkRole() {
      SinkRoleImpl sinkRole = new SinkRoleImpl();
      return sinkRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OperationProvidedRole createOperationProvidedRole() {
      OperationProvidedRoleImpl operationProvidedRole = new OperationProvidedRoleImpl();
      return operationProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureProvidedRole createInfrastructureProvidedRole() {
      InfrastructureProvidedRoleImpl infrastructureProvidedRole = new InfrastructureProvidedRoleImpl();
      return infrastructureProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompleteComponentType createCompleteComponentType() {
      CompleteComponentTypeImpl completeComponentType = new CompleteComponentTypeImpl();
      return completeComponentType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProvidesComponentType createProvidesComponentType() {
      ProvidesComponentTypeImpl providesComponentType = new ProvidesComponentTypeImpl();
      return providesComponentType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompositeComponent createCompositeComponent() {
      CompositeComponentImpl compositeComponent = new CompositeComponentImpl();
      return compositeComponent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PrimitiveDataType createPrimitiveDataType() {
      PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
      return primitiveDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CollectionDataType createCollectionDataType() {
      CollectionDataTypeImpl collectionDataType = new CollectionDataTypeImpl();
      return collectionDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompositeDataType createCompositeDataType() {
      CompositeDataTypeImpl compositeDataType = new CompositeDataTypeImpl();
      return compositeDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InnerDeclaration createInnerDeclaration() {
      InnerDeclarationImpl innerDeclaration = new InnerDeclarationImpl();
      return innerDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Role createRole() {
      RoleImpl role = new RoleImpl();
      return role;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ParameterModifier createParameterModifierFromString(EDataType eDataType, String initialValue) {
      ParameterModifier result = ParameterModifier.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertParameterModifierToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComponentType createComponentTypeFromString(EDataType eDataType, String initialValue) {
      ComponentType result = ComponentType.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertComponentTypeToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PrimitiveTypeEnum createPrimitiveTypeEnumFromString(EDataType eDataType, String initialValue) {
      PrimitiveTypeEnum result = PrimitiveTypeEnum.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertPrimitiveTypeEnumToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Repository_av_avPackage getRepository_av_avPackage() {
      return (Repository_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Repository_av_avPackage getPackage() {
      return Repository_av_avPackage.eINSTANCE;
   }

} //Repository_av_avFactoryImpl
