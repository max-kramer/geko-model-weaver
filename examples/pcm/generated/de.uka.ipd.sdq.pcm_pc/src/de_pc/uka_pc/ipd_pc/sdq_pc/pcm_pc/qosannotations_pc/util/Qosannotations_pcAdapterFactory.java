/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.util;

import de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.NamedElement;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.Qosannotations_pcPackage
 * @generated
 */
public class Qosannotations_pcAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Qosannotations_pcPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_pcAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Qosannotations_pcPackage.eINSTANCE;
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
   protected Qosannotations_pcSwitch<Adapter> modelSwitch =
      new Qosannotations_pcSwitch<Adapter>() {
         @Override
         public Adapter caseSpecifiedQoSAnnotation(SpecifiedQoSAnnotation object) {
            return createSpecifiedQoSAnnotationAdapter();
         }
         @Override
         public Adapter caseQoSAnnotations(QoSAnnotations object) {
            return createQoSAnnotationsAdapter();
         }
         @Override
         public Adapter caseSpecifiedOutputParameterAbstraction(SpecifiedOutputParameterAbstraction object) {
            return createSpecifiedOutputParameterAbstractionAdapter();
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
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.SpecifiedQoSAnnotation <em>Specified Qo SAnnotation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.SpecifiedQoSAnnotation
    * @generated
    */
   public Adapter createSpecifiedQoSAnnotationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.QoSAnnotations <em>Qo SAnnotations</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.QoSAnnotations
    * @generated
    */
   public Adapter createQoSAnnotationsAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.SpecifiedOutputParameterAbstraction <em>Specified Output Parameter Abstraction</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.SpecifiedOutputParameterAbstraction
    * @generated
    */
   public Adapter createSpecifiedOutputParameterAbstractionAdapter() {
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

} //Qosannotations_pcAdapterFactory
