/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.util;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.*;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity;
import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.Composition_pc_pcPackage
 * @generated
 */
public class Composition_pc_pcSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Composition_pc_pcPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Composition_pc_pcSwitch() {
      if (modelPackage == null) {
         modelPackage = Composition_pc_pcPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case Composition_pc_pcPackage.DELEGATION_CONNECTOR: {
            DelegationConnector delegationConnector = (DelegationConnector)theEObject;
            T result = caseDelegationConnector(delegationConnector);
            if (result == null) result = caseConnector(delegationConnector);
            if (result == null) result = caseEntity(delegationConnector);
            if (result == null) result = caseIdentifier(delegationConnector);
            if (result == null) result = caseNamedElement(delegationConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.CONNECTOR: {
            Connector connector = (Connector)theEObject;
            T result = caseConnector(connector);
            if (result == null) result = caseEntity(connector);
            if (result == null) result = caseIdentifier(connector);
            if (result == null) result = caseNamedElement(connector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.COMPOSED_STRUCTURE: {
            ComposedStructure composedStructure = (ComposedStructure)theEObject;
            T result = caseComposedStructure(composedStructure);
            if (result == null) result = caseEntity(composedStructure);
            if (result == null) result = caseIdentifier(composedStructure);
            if (result == null) result = caseNamedElement(composedStructure);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR: {
            ResourceRequiredDelegationConnector resourceRequiredDelegationConnector = (ResourceRequiredDelegationConnector)theEObject;
            T result = caseResourceRequiredDelegationConnector(resourceRequiredDelegationConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.EVENT_CHANNEL: {
            EventChannel eventChannel = (EventChannel)theEObject;
            T result = caseEventChannel(eventChannel);
            if (result == null) result = caseEntity(eventChannel);
            if (result == null) result = caseIdentifier(eventChannel);
            if (result == null) result = caseNamedElement(eventChannel);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.EVENT_CHANNEL_SOURCE_CONNECTOR: {
            EventChannelSourceConnector eventChannelSourceConnector = (EventChannelSourceConnector)theEObject;
            T result = caseEventChannelSourceConnector(eventChannelSourceConnector);
            if (result == null) result = caseConnector(eventChannelSourceConnector);
            if (result == null) result = caseEntity(eventChannelSourceConnector);
            if (result == null) result = caseIdentifier(eventChannelSourceConnector);
            if (result == null) result = caseNamedElement(eventChannelSourceConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.EVENT_CHANNEL_SINK_CONNECTOR: {
            EventChannelSinkConnector eventChannelSinkConnector = (EventChannelSinkConnector)theEObject;
            T result = caseEventChannelSinkConnector(eventChannelSinkConnector);
            if (result == null) result = caseConnector(eventChannelSinkConnector);
            if (result == null) result = caseEntity(eventChannelSinkConnector);
            if (result == null) result = caseIdentifier(eventChannelSinkConnector);
            if (result == null) result = caseNamedElement(eventChannelSinkConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.PROVIDED_DELEGATION_CONNECTOR: {
            ProvidedDelegationConnector providedDelegationConnector = (ProvidedDelegationConnector)theEObject;
            T result = caseProvidedDelegationConnector(providedDelegationConnector);
            if (result == null) result = caseDelegationConnector(providedDelegationConnector);
            if (result == null) result = caseConnector(providedDelegationConnector);
            if (result == null) result = caseEntity(providedDelegationConnector);
            if (result == null) result = caseIdentifier(providedDelegationConnector);
            if (result == null) result = caseNamedElement(providedDelegationConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.REQUIRED_DELEGATION_CONNECTOR: {
            RequiredDelegationConnector requiredDelegationConnector = (RequiredDelegationConnector)theEObject;
            T result = caseRequiredDelegationConnector(requiredDelegationConnector);
            if (result == null) result = caseDelegationConnector(requiredDelegationConnector);
            if (result == null) result = caseConnector(requiredDelegationConnector);
            if (result == null) result = caseEntity(requiredDelegationConnector);
            if (result == null) result = caseIdentifier(requiredDelegationConnector);
            if (result == null) result = caseNamedElement(requiredDelegationConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.ASSEMBLY_CONNECTOR: {
            AssemblyConnector assemblyConnector = (AssemblyConnector)theEObject;
            T result = caseAssemblyConnector(assemblyConnector);
            if (result == null) result = caseConnector(assemblyConnector);
            if (result == null) result = caseEntity(assemblyConnector);
            if (result == null) result = caseIdentifier(assemblyConnector);
            if (result == null) result = caseNamedElement(assemblyConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.ASSEMBLY_EVENT_CONNECTOR: {
            AssemblyEventConnector assemblyEventConnector = (AssemblyEventConnector)theEObject;
            T result = caseAssemblyEventConnector(assemblyEventConnector);
            if (result == null) result = caseConnector(assemblyEventConnector);
            if (result == null) result = caseEntity(assemblyEventConnector);
            if (result == null) result = caseIdentifier(assemblyEventConnector);
            if (result == null) result = caseNamedElement(assemblyEventConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.SOURCE_DELEGATION_CONNECTOR: {
            SourceDelegationConnector sourceDelegationConnector = (SourceDelegationConnector)theEObject;
            T result = caseSourceDelegationConnector(sourceDelegationConnector);
            if (result == null) result = caseDelegationConnector(sourceDelegationConnector);
            if (result == null) result = caseConnector(sourceDelegationConnector);
            if (result == null) result = caseEntity(sourceDelegationConnector);
            if (result == null) result = caseIdentifier(sourceDelegationConnector);
            if (result == null) result = caseNamedElement(sourceDelegationConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.SINK_DELEGATION_CONNECTOR: {
            SinkDelegationConnector sinkDelegationConnector = (SinkDelegationConnector)theEObject;
            T result = caseSinkDelegationConnector(sinkDelegationConnector);
            if (result == null) result = caseDelegationConnector(sinkDelegationConnector);
            if (result == null) result = caseConnector(sinkDelegationConnector);
            if (result == null) result = caseEntity(sinkDelegationConnector);
            if (result == null) result = caseIdentifier(sinkDelegationConnector);
            if (result == null) result = caseNamedElement(sinkDelegationConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR: {
            AssemblyInfrastructureConnector assemblyInfrastructureConnector = (AssemblyInfrastructureConnector)theEObject;
            T result = caseAssemblyInfrastructureConnector(assemblyInfrastructureConnector);
            if (result == null) result = caseConnector(assemblyInfrastructureConnector);
            if (result == null) result = caseEntity(assemblyInfrastructureConnector);
            if (result == null) result = caseIdentifier(assemblyInfrastructureConnector);
            if (result == null) result = caseNamedElement(assemblyInfrastructureConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR: {
            ProvidedInfrastructureDelegationConnector providedInfrastructureDelegationConnector = (ProvidedInfrastructureDelegationConnector)theEObject;
            T result = caseProvidedInfrastructureDelegationConnector(providedInfrastructureDelegationConnector);
            if (result == null) result = caseDelegationConnector(providedInfrastructureDelegationConnector);
            if (result == null) result = caseConnector(providedInfrastructureDelegationConnector);
            if (result == null) result = caseEntity(providedInfrastructureDelegationConnector);
            if (result == null) result = caseIdentifier(providedInfrastructureDelegationConnector);
            if (result == null) result = caseNamedElement(providedInfrastructureDelegationConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR: {
            RequiredInfrastructureDelegationConnector requiredInfrastructureDelegationConnector = (RequiredInfrastructureDelegationConnector)theEObject;
            T result = caseRequiredInfrastructureDelegationConnector(requiredInfrastructureDelegationConnector);
            if (result == null) result = caseDelegationConnector(requiredInfrastructureDelegationConnector);
            if (result == null) result = caseConnector(requiredInfrastructureDelegationConnector);
            if (result == null) result = caseEntity(requiredInfrastructureDelegationConnector);
            if (result == null) result = caseIdentifier(requiredInfrastructureDelegationConnector);
            if (result == null) result = caseNamedElement(requiredInfrastructureDelegationConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR: {
            RequiredResourceDelegationConnector requiredResourceDelegationConnector = (RequiredResourceDelegationConnector)theEObject;
            T result = caseRequiredResourceDelegationConnector(requiredResourceDelegationConnector);
            if (result == null) result = caseDelegationConnector(requiredResourceDelegationConnector);
            if (result == null) result = caseConnector(requiredResourceDelegationConnector);
            if (result == null) result = caseEntity(requiredResourceDelegationConnector);
            if (result == null) result = caseIdentifier(requiredResourceDelegationConnector);
            if (result == null) result = caseNamedElement(requiredResourceDelegationConnector);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Composition_pc_pcPackage.ASSEMBLY_CONTEXT: {
            AssemblyContext assemblyContext = (AssemblyContext)theEObject;
            T result = caseAssemblyContext(assemblyContext);
            if (result == null) result = caseEntity(assemblyContext);
            if (result == null) result = caseIdentifier(assemblyContext);
            if (result == null) result = caseNamedElement(assemblyContext);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDelegationConnector(DelegationConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseConnector(Connector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Composed Structure</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Composed Structure</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComposedStructure(ComposedStructure object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Resource Required Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Resource Required Delegation Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseResourceRequiredDelegationConnector(ResourceRequiredDelegationConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Event Channel</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Event Channel</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEventChannel(EventChannel object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Event Channel Source Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Event Channel Source Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEventChannelSourceConnector(EventChannelSourceConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Event Channel Sink Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Event Channel Sink Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEventChannelSinkConnector(EventChannelSinkConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Provided Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Provided Delegation Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseProvidedDelegationConnector(ProvidedDelegationConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Required Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Required Delegation Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRequiredDelegationConnector(RequiredDelegationConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Assembly Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Assembly Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAssemblyConnector(AssemblyConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Assembly Event Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Assembly Event Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAssemblyEventConnector(AssemblyEventConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Source Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Source Delegation Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSourceDelegationConnector(SourceDelegationConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Sink Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Sink Delegation Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSinkDelegationConnector(SinkDelegationConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Assembly Infrastructure Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Assembly Infrastructure Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAssemblyInfrastructureConnector(AssemblyInfrastructureConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Provided Infrastructure Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Provided Infrastructure Delegation Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseProvidedInfrastructureDelegationConnector(ProvidedInfrastructureDelegationConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Required Infrastructure Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Required Infrastructure Delegation Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRequiredInfrastructureDelegationConnector(RequiredInfrastructureDelegationConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Required Resource Delegation Connector</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Required Resource Delegation Connector</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRequiredResourceDelegationConnector(RequiredResourceDelegationConnector object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Assembly Context</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Assembly Context</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAssemblyContext(AssemblyContext object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseIdentifier(Identifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNamedElement(NamedElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEntity(Entity object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} //Composition_pc_pcSwitch
