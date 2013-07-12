/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.SpecifiedQoSAnnotation;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.Qos_performance_av_avPackage
 * @generated
 */
public class Qos_performance_av_avAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Qos_performance_av_avPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_performance_av_avAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Qos_performance_av_avPackage.eINSTANCE;
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
   protected Qos_performance_av_avSwitch<Adapter> modelSwitch =
      new Qos_performance_av_avSwitch<Adapter>() {
         @Override
         public Adapter caseSystemSpecifiedExecutionTime(SystemSpecifiedExecutionTime object) {
            return createSystemSpecifiedExecutionTimeAdapter();
         }
         @Override
         public Adapter caseSpecifiedExecutionTime(SpecifiedExecutionTime object) {
            return createSpecifiedExecutionTimeAdapter();
         }
         @Override
         public Adapter caseComponentSpecifiedExecutionTime(ComponentSpecifiedExecutionTime object) {
            return createComponentSpecifiedExecutionTimeAdapter();
         }
         @Override
         public Adapter caseSpecifiedQoSAnnotation(SpecifiedQoSAnnotation object) {
            return createSpecifiedQoSAnnotationAdapter();
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
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.SystemSpecifiedExecutionTime <em>System Specified Execution Time</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.SystemSpecifiedExecutionTime
    * @generated
    */
   public Adapter createSystemSpecifiedExecutionTimeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.SpecifiedExecutionTime <em>Specified Execution Time</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.SpecifiedExecutionTime
    * @generated
    */
   public Adapter createSpecifiedExecutionTimeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.ComponentSpecifiedExecutionTime <em>Component Specified Execution Time</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.ComponentSpecifiedExecutionTime
    * @generated
    */
   public Adapter createComponentSpecifiedExecutionTimeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.SpecifiedQoSAnnotation <em>Specified Qo SAnnotation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.SpecifiedQoSAnnotation
    * @generated
    */
   public Adapter createSpecifiedQoSAnnotationAdapter() {
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

} //Qos_performance_av_avAdapterFactory
