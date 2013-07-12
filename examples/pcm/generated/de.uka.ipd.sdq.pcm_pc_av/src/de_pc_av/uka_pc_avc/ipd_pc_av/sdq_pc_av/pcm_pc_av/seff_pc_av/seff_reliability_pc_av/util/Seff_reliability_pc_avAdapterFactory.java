/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.util;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.Identifier;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.NamedElement;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractAction;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractInternalControlFlowAction;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingBehaviour;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.Seff_reliability_pc_avPackage
 * @generated
 */
public class Seff_reliability_pc_avAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Seff_reliability_pc_avPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_reliability_pc_avAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Seff_reliability_pc_avPackage.eINSTANCE;
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
   protected Seff_reliability_pc_avSwitch<Adapter> modelSwitch =
      new Seff_reliability_pc_avSwitch<Adapter>() {
         @Override
         public Adapter caseRecoveryActionBehaviour(RecoveryActionBehaviour object) {
            return createRecoveryActionBehaviourAdapter();
         }
         @Override
         public Adapter caseRecoveryAction(RecoveryAction object) {
            return createRecoveryActionAdapter();
         }
         @Override
         public Adapter caseFailureHandlingEntity(FailureHandlingEntity object) {
            return createFailureHandlingEntityAdapter();
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
         public Adapter caseResourceDemandingBehaviour(ResourceDemandingBehaviour object) {
            return createResourceDemandingBehaviourAdapter();
         }
         @Override
         public Adapter caseAbstractAction(AbstractAction object) {
            return createAbstractActionAdapter();
         }
         @Override
         public Adapter caseAbstractInternalControlFlowAction(AbstractInternalControlFlowAction object) {
            return createAbstractInternalControlFlowActionAdapter();
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
    * Creates a new adapter for an object of class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.RecoveryActionBehaviour <em>Recovery Action Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.RecoveryActionBehaviour
    * @generated
    */
   public Adapter createRecoveryActionBehaviourAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.RecoveryAction <em>Recovery Action</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.RecoveryAction
    * @generated
    */
   public Adapter createRecoveryActionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.FailureHandlingEntity <em>Failure Handling Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.FailureHandlingEntity
    * @generated
    */
   public Adapter createFailureHandlingEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.Identifier <em>Identifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.Identifier
    * @generated
    */
   public Adapter createIdentifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity <em>Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity
    * @generated
    */
   public Adapter createEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingBehaviour <em>Resource Demanding Behaviour</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.ResourceDemandingBehaviour
    * @generated
    */
   public Adapter createResourceDemandingBehaviourAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractAction <em>Abstract Action</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractAction
    * @generated
    */
   public Adapter createAbstractActionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractInternalControlFlowAction <em>Abstract Internal Control Flow Action</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.AbstractInternalControlFlowAction
    * @generated
    */
   public Adapter createAbstractInternalControlFlowActionAdapter() {
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

} //Seff_reliability_pc_avAdapterFactory
