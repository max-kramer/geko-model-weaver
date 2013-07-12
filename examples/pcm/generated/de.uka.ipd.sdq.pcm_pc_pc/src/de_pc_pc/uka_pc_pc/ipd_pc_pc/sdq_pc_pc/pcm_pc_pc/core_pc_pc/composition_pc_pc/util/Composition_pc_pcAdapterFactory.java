/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.util;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.*;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage
 * @generated
 */
public class Composition_pc_pcAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Composition_pc_pcPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Composition_pc_pcAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Composition_pc_pcPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject)object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Composition_pc_pcSwitch<Adapter> modelSwitch =
      new Composition_pc_pcSwitch<Adapter>() {
         @Override
         public Adapter caseDelegationConnector(DelegationConnector object) {
            return createDelegationConnectorAdapter();
         }
         @Override
         public Adapter caseConnector(Connector object) {
            return createConnectorAdapter();
         }
         @Override
         public Adapter caseComposedStructure(ComposedStructure object) {
            return createComposedStructureAdapter();
         }
         @Override
         public Adapter caseResourceRequiredDelegationConnector(ResourceRequiredDelegationConnector object) {
            return createResourceRequiredDelegationConnectorAdapter();
         }
         @Override
         public Adapter caseEventChannel(EventChannel object) {
            return createEventChannelAdapter();
         }
         @Override
         public Adapter caseEventChannelSourceConnector(EventChannelSourceConnector object) {
            return createEventChannelSourceConnectorAdapter();
         }
         @Override
         public Adapter caseEventChannelSinkConnector(EventChannelSinkConnector object) {
            return createEventChannelSinkConnectorAdapter();
         }
         @Override
         public Adapter caseProvidedDelegationConnector(ProvidedDelegationConnector object) {
            return createProvidedDelegationConnectorAdapter();
         }
         @Override
         public Adapter caseRequiredDelegationConnector(RequiredDelegationConnector object) {
            return createRequiredDelegationConnectorAdapter();
         }
         @Override
         public Adapter caseAssemblyConnector(AssemblyConnector object) {
            return createAssemblyConnectorAdapter();
         }
         @Override
         public Adapter caseAssemblyEventConnector(AssemblyEventConnector object) {
            return createAssemblyEventConnectorAdapter();
         }
         @Override
         public Adapter caseSourceDelegationConnector(SourceDelegationConnector object) {
            return createSourceDelegationConnectorAdapter();
         }
         @Override
         public Adapter caseSinkDelegationConnector(SinkDelegationConnector object) {
            return createSinkDelegationConnectorAdapter();
         }
         @Override
         public Adapter caseAssemblyInfrastructureConnector(AssemblyInfrastructureConnector object) {
            return createAssemblyInfrastructureConnectorAdapter();
         }
         @Override
         public Adapter caseProvidedInfrastructureDelegationConnector(ProvidedInfrastructureDelegationConnector object) {
            return createProvidedInfrastructureDelegationConnectorAdapter();
         }
         @Override
         public Adapter caseRequiredInfrastructureDelegationConnector(RequiredInfrastructureDelegationConnector object) {
            return createRequiredInfrastructureDelegationConnectorAdapter();
         }
         @Override
         public Adapter caseRequiredResourceDelegationConnector(RequiredResourceDelegationConnector object) {
            return createRequiredResourceDelegationConnectorAdapter();
         }
         @Override
         public Adapter caseAssemblyContext(AssemblyContext object) {
            return createAssemblyContextAdapter();
         }
         @Override
         public Adapter caseIdentifier(Identifier object) {
            return createIdentifierAdapter();
         }
         @Override
         public Adapter caseNamedElement(NamedElement object) {
            return createNamedElementAdapter();
         }
         @Override
         public Adapter caseEntity(Entity object) {
            return createEntityAdapter();
         }
         @Override
         public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
         }
      };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject)target);
   }


   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.DelegationConnector <em>Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.DelegationConnector
    * @generated
    */
   public Adapter createDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Connector <em>Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Connector
    * @generated
    */
   public Adapter createConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ComposedStructure <em>Composed Structure</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ComposedStructure
    * @generated
    */
   public Adapter createComposedStructureAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ResourceRequiredDelegationConnector <em>Resource Required Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ResourceRequiredDelegationConnector
    * @generated
    */
   public Adapter createResourceRequiredDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannel <em>Event Channel</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannel
    * @generated
    */
   public Adapter createEventChannelAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSourceConnector <em>Event Channel Source Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSourceConnector
    * @generated
    */
   public Adapter createEventChannelSourceConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSinkConnector <em>Event Channel Sink Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.EventChannelSinkConnector
    * @generated
    */
   public Adapter createEventChannelSinkConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ProvidedDelegationConnector <em>Provided Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ProvidedDelegationConnector
    * @generated
    */
   public Adapter createProvidedDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredDelegationConnector <em>Required Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredDelegationConnector
    * @generated
    */
   public Adapter createRequiredDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyConnector <em>Assembly Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyConnector
    * @generated
    */
   public Adapter createAssemblyConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyEventConnector <em>Assembly Event Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyEventConnector
    * @generated
    */
   public Adapter createAssemblyEventConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.SourceDelegationConnector <em>Source Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.SourceDelegationConnector
    * @generated
    */
   public Adapter createSourceDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.SinkDelegationConnector <em>Sink Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.SinkDelegationConnector
    * @generated
    */
   public Adapter createSinkDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyInfrastructureConnector <em>Assembly Infrastructure Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyInfrastructureConnector
    * @generated
    */
   public Adapter createAssemblyInfrastructureConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ProvidedInfrastructureDelegationConnector <em>Provided Infrastructure Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.ProvidedInfrastructureDelegationConnector
    * @generated
    */
   public Adapter createProvidedInfrastructureDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredInfrastructureDelegationConnector <em>Required Infrastructure Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredInfrastructureDelegationConnector
    * @generated
    */
   public Adapter createRequiredInfrastructureDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredResourceDelegationConnector <em>Required Resource Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.RequiredResourceDelegationConnector
    * @generated
    */
   public Adapter createRequiredResourceDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyContext <em>Assembly Context</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyContext
    * @generated
    */
   public Adapter createAssemblyContextAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier <em>Identifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier
    * @generated
    */
   public Adapter createIdentifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity <em>Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity
    * @generated
    */
   public Adapter createEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} //Composition_pc_pcAdapterFactory
