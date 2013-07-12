/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.*;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage
 * @generated
 */
public class Composition_av_avAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Composition_av_avPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Composition_av_avAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Composition_av_avPackage.eINSTANCE;
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
   protected Composition_av_avSwitch<Adapter> modelSwitch =
      new Composition_av_avSwitch<Adapter>() {
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
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.DelegationConnector <em>Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.DelegationConnector
    * @generated
    */
   public Adapter createDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Connector <em>Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Connector
    * @generated
    */
   public Adapter createConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ComposedStructure <em>Composed Structure</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ComposedStructure
    * @generated
    */
   public Adapter createComposedStructureAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ResourceRequiredDelegationConnector <em>Resource Required Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ResourceRequiredDelegationConnector
    * @generated
    */
   public Adapter createResourceRequiredDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannel <em>Event Channel</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannel
    * @generated
    */
   public Adapter createEventChannelAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSourceConnector <em>Event Channel Source Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSourceConnector
    * @generated
    */
   public Adapter createEventChannelSourceConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector <em>Event Channel Sink Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.EventChannelSinkConnector
    * @generated
    */
   public Adapter createEventChannelSinkConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedDelegationConnector <em>Provided Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedDelegationConnector
    * @generated
    */
   public Adapter createProvidedDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.RequiredDelegationConnector <em>Required Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.RequiredDelegationConnector
    * @generated
    */
   public Adapter createRequiredDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyConnector <em>Assembly Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyConnector
    * @generated
    */
   public Adapter createAssemblyConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector <em>Assembly Event Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector
    * @generated
    */
   public Adapter createAssemblyEventConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.SourceDelegationConnector <em>Source Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.SourceDelegationConnector
    * @generated
    */
   public Adapter createSourceDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.SinkDelegationConnector <em>Sink Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.SinkDelegationConnector
    * @generated
    */
   public Adapter createSinkDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyInfrastructureConnector <em>Assembly Infrastructure Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyInfrastructureConnector
    * @generated
    */
   public Adapter createAssemblyInfrastructureConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedInfrastructureDelegationConnector <em>Provided Infrastructure Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ProvidedInfrastructureDelegationConnector
    * @generated
    */
   public Adapter createProvidedInfrastructureDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.RequiredInfrastructureDelegationConnector <em>Required Infrastructure Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.RequiredInfrastructureDelegationConnector
    * @generated
    */
   public Adapter createRequiredInfrastructureDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.RequiredResourceDelegationConnector <em>Required Resource Delegation Connector</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.RequiredResourceDelegationConnector
    * @generated
    */
   public Adapter createRequiredResourceDelegationConnectorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext <em>Assembly Context</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext
    * @generated
    */
   public Adapter createAssemblyContextAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier <em>Identifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.Identifier
    * @generated
    */
   public Adapter createIdentifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity <em>Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity
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

} //Composition_av_avAdapterFactory
