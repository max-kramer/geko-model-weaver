/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.util;

import de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.NamedElement;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.Reliability_pcPackage
 * @generated
 */
public class Reliability_pcAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Reliability_pcPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Reliability_pcAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Reliability_pcPackage.eINSTANCE;
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
   protected Reliability_pcSwitch<Adapter> modelSwitch =
      new Reliability_pcSwitch<Adapter>() {
         @Override
         public Adapter caseFailureOccurrenceDescription(FailureOccurrenceDescription object) {
            return createFailureOccurrenceDescriptionAdapter();
         }
         @Override
         public Adapter caseHardwareInducedFailureType(HardwareInducedFailureType object) {
            return createHardwareInducedFailureTypeAdapter();
         }
         @Override
         public Adapter caseSoftwareInducedFailureType(SoftwareInducedFailureType object) {
            return createSoftwareInducedFailureTypeAdapter();
         }
         @Override
         public Adapter caseInternalFailureOccurrenceDescription(InternalFailureOccurrenceDescription object) {
            return createInternalFailureOccurrenceDescriptionAdapter();
         }
         @Override
         public Adapter caseNetworkInducedFailureType(NetworkInducedFailureType object) {
            return createNetworkInducedFailureTypeAdapter();
         }
         @Override
         public Adapter caseExternalFailureOccurrenceDescription(ExternalFailureOccurrenceDescription object) {
            return createExternalFailureOccurrenceDescriptionAdapter();
         }
         @Override
         public Adapter caseResourceTimeoutFailureType(ResourceTimeoutFailureType object) {
            return createResourceTimeoutFailureTypeAdapter();
         }
         @Override
         public Adapter caseFailureType(FailureType object) {
            return createFailureTypeAdapter();
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
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.FailureOccurrenceDescription <em>Failure Occurrence Description</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.FailureOccurrenceDescription
    * @generated
    */
   public Adapter createFailureOccurrenceDescriptionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.HardwareInducedFailureType <em>Hardware Induced Failure Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.HardwareInducedFailureType
    * @generated
    */
   public Adapter createHardwareInducedFailureTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.SoftwareInducedFailureType <em>Software Induced Failure Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.SoftwareInducedFailureType
    * @generated
    */
   public Adapter createSoftwareInducedFailureTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.InternalFailureOccurrenceDescription <em>Internal Failure Occurrence Description</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.InternalFailureOccurrenceDescription
    * @generated
    */
   public Adapter createInternalFailureOccurrenceDescriptionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.NetworkInducedFailureType <em>Network Induced Failure Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.NetworkInducedFailureType
    * @generated
    */
   public Adapter createNetworkInducedFailureTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.ExternalFailureOccurrenceDescription <em>External Failure Occurrence Description</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.ExternalFailureOccurrenceDescription
    * @generated
    */
   public Adapter createExternalFailureOccurrenceDescriptionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.ResourceTimeoutFailureType <em>Resource Timeout Failure Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.ResourceTimeoutFailureType
    * @generated
    */
   public Adapter createResourceTimeoutFailureTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.FailureType <em>Failure Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.reliability_pc.FailureType
    * @generated
    */
   public Adapter createFailureTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier <em>Identifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier
    * @generated
    */
   public Adapter createIdentifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity <em>Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity
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

} //Reliability_pcAdapterFactory
