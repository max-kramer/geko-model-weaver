/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.*;

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
public class Composition_pcFactoryImpl extends EFactoryImpl implements Composition_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Composition_pcFactory init() {
      try {
         Composition_pcFactory theComposition_pcFactory = (Composition_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Composition_pcPackage.eNS_URI);
         if (theComposition_pcFactory != null) {
            return theComposition_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Composition_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Composition_pcFactoryImpl() {
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
         case Composition_pcPackage.DELEGATION_CONNECTOR: return createDelegationConnector();
         case Composition_pcPackage.CONNECTOR: return createConnector();
         case Composition_pcPackage.COMPOSED_STRUCTURE: return createComposedStructure();
         case Composition_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR: return createResourceRequiredDelegationConnector();
         case Composition_pcPackage.EVENT_CHANNEL: return createEventChannel();
         case Composition_pcPackage.EVENT_CHANNEL_SOURCE_CONNECTOR: return createEventChannelSourceConnector();
         case Composition_pcPackage.EVENT_CHANNEL_SINK_CONNECTOR: return createEventChannelSinkConnector();
         case Composition_pcPackage.PROVIDED_DELEGATION_CONNECTOR: return createProvidedDelegationConnector();
         case Composition_pcPackage.REQUIRED_DELEGATION_CONNECTOR: return createRequiredDelegationConnector();
         case Composition_pcPackage.ASSEMBLY_CONNECTOR: return createAssemblyConnector();
         case Composition_pcPackage.ASSEMBLY_EVENT_CONNECTOR: return createAssemblyEventConnector();
         case Composition_pcPackage.SOURCE_DELEGATION_CONNECTOR: return createSourceDelegationConnector();
         case Composition_pcPackage.SINK_DELEGATION_CONNECTOR: return createSinkDelegationConnector();
         case Composition_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR: return createAssemblyInfrastructureConnector();
         case Composition_pcPackage.PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR: return createProvidedInfrastructureDelegationConnector();
         case Composition_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR: return createRequiredInfrastructureDelegationConnector();
         case Composition_pcPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR: return createRequiredResourceDelegationConnector();
         case Composition_pcPackage.ASSEMBLY_CONTEXT: return createAssemblyContext();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DelegationConnector createDelegationConnector() {
      DelegationConnectorImpl delegationConnector = new DelegationConnectorImpl();
      return delegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Connector createConnector() {
      ConnectorImpl connector = new ConnectorImpl();
      return connector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComposedStructure createComposedStructure() {
      ComposedStructureImpl composedStructure = new ComposedStructureImpl();
      return composedStructure;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredDelegationConnector createResourceRequiredDelegationConnector() {
      ResourceRequiredDelegationConnectorImpl resourceRequiredDelegationConnector = new ResourceRequiredDelegationConnectorImpl();
      return resourceRequiredDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventChannel createEventChannel() {
      EventChannelImpl eventChannel = new EventChannelImpl();
      return eventChannel;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventChannelSourceConnector createEventChannelSourceConnector() {
      EventChannelSourceConnectorImpl eventChannelSourceConnector = new EventChannelSourceConnectorImpl();
      return eventChannelSourceConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EventChannelSinkConnector createEventChannelSinkConnector() {
      EventChannelSinkConnectorImpl eventChannelSinkConnector = new EventChannelSinkConnectorImpl();
      return eventChannelSinkConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProvidedDelegationConnector createProvidedDelegationConnector() {
      ProvidedDelegationConnectorImpl providedDelegationConnector = new ProvidedDelegationConnectorImpl();
      return providedDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RequiredDelegationConnector createRequiredDelegationConnector() {
      RequiredDelegationConnectorImpl requiredDelegationConnector = new RequiredDelegationConnectorImpl();
      return requiredDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyConnector createAssemblyConnector() {
      AssemblyConnectorImpl assemblyConnector = new AssemblyConnectorImpl();
      return assemblyConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyEventConnector createAssemblyEventConnector() {
      AssemblyEventConnectorImpl assemblyEventConnector = new AssemblyEventConnectorImpl();
      return assemblyEventConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SourceDelegationConnector createSourceDelegationConnector() {
      SourceDelegationConnectorImpl sourceDelegationConnector = new SourceDelegationConnectorImpl();
      return sourceDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SinkDelegationConnector createSinkDelegationConnector() {
      SinkDelegationConnectorImpl sinkDelegationConnector = new SinkDelegationConnectorImpl();
      return sinkDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyInfrastructureConnector createAssemblyInfrastructureConnector() {
      AssemblyInfrastructureConnectorImpl assemblyInfrastructureConnector = new AssemblyInfrastructureConnectorImpl();
      return assemblyInfrastructureConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ProvidedInfrastructureDelegationConnector createProvidedInfrastructureDelegationConnector() {
      ProvidedInfrastructureDelegationConnectorImpl providedInfrastructureDelegationConnector = new ProvidedInfrastructureDelegationConnectorImpl();
      return providedInfrastructureDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RequiredInfrastructureDelegationConnector createRequiredInfrastructureDelegationConnector() {
      RequiredInfrastructureDelegationConnectorImpl requiredInfrastructureDelegationConnector = new RequiredInfrastructureDelegationConnectorImpl();
      return requiredInfrastructureDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RequiredResourceDelegationConnector createRequiredResourceDelegationConnector() {
      RequiredResourceDelegationConnectorImpl requiredResourceDelegationConnector = new RequiredResourceDelegationConnectorImpl();
      return requiredResourceDelegationConnector;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AssemblyContext createAssemblyContext() {
      AssemblyContextImpl assemblyContext = new AssemblyContextImpl();
      return assemblyContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Composition_pcPackage getComposition_pcPackage() {
      return (Composition_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Composition_pcPackage getPackage() {
      return Composition_pcPackage.eINSTANCE;
   }

} //Composition_pcFactoryImpl
