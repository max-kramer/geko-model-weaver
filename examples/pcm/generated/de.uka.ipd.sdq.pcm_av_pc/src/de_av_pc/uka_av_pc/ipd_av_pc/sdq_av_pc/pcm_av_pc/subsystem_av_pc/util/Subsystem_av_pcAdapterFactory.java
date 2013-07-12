/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.util;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.ComposedStructure;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.ComposedProvidingRequiringEntity;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingEntity;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingRequiringEntity;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceRequiringEntity;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.NamedElement;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.ResourceInterfaceRequiringEntity;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RepositoryComponent;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.Subsystem_av_pcPackage
 * @generated
 */
public class Subsystem_av_pcAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Subsystem_av_pcPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Subsystem_av_pcAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Subsystem_av_pcPackage.eINSTANCE;
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
   protected Subsystem_av_pcSwitch<Adapter> modelSwitch =
      new Subsystem_av_pcSwitch<Adapter>() {
         @Override
         public Adapter caseSubSystem(SubSystem object) {
            return createSubSystemAdapter();
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
         public Adapter caseComposedStructure(ComposedStructure object) {
            return createComposedStructureAdapter();
         }
         @Override
         public Adapter caseInterfaceProvidingEntity(InterfaceProvidingEntity object) {
            return createInterfaceProvidingEntityAdapter();
         }
         @Override
         public Adapter caseResourceInterfaceRequiringEntity(ResourceInterfaceRequiringEntity object) {
            return createResourceInterfaceRequiringEntityAdapter();
         }
         @Override
         public Adapter caseInterfaceRequiringEntity(InterfaceRequiringEntity object) {
            return createInterfaceRequiringEntityAdapter();
         }
         @Override
         public Adapter caseInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity object) {
            return createInterfaceProvidingRequiringEntityAdapter();
         }
         @Override
         public Adapter caseComposedProvidingRequiringEntity(ComposedProvidingRequiringEntity object) {
            return createComposedProvidingRequiringEntityAdapter();
         }
         @Override
         public Adapter caseRepositoryComponent(RepositoryComponent object) {
            return createRepositoryComponentAdapter();
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
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.SubSystem <em>Sub System</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.subsystem_av_pc.SubSystem
    * @generated
    */
   public Adapter createSubSystemAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier <em>Identifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier
    * @generated
    */
   public Adapter createIdentifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity <em>Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity
    * @generated
    */
   public Adapter createEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.ComposedStructure <em>Composed Structure</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.composition_av_pc.ComposedStructure
    * @generated
    */
   public Adapter createComposedStructureAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingEntity <em>Interface Providing Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingEntity
    * @generated
    */
   public Adapter createInterfaceProvidingEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.ResourceInterfaceRequiringEntity <em>Resource Interface Requiring Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.ResourceInterfaceRequiringEntity
    * @generated
    */
   public Adapter createResourceInterfaceRequiringEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceRequiringEntity <em>Interface Requiring Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceRequiringEntity
    * @generated
    */
   public Adapter createInterfaceRequiringEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingRequiringEntity <em>Interface Providing Requiring Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.InterfaceProvidingRequiringEntity
    * @generated
    */
   public Adapter createInterfaceProvidingRequiringEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.ComposedProvidingRequiringEntity <em>Composed Providing Requiring Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.ComposedProvidingRequiringEntity
    * @generated
    */
   public Adapter createComposedProvidingRequiringEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RepositoryComponent <em>Repository Component</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.RepositoryComponent
    * @generated
    */
   public Adapter createRepositoryComponentAdapter() {
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

} //Subsystem_av_pcAdapterFactory
