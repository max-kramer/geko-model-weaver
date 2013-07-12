/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.util;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.Pcm_av_avPackage
 * @generated
 */
public class Pcm_av_avAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Pcm_av_avPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pcm_av_avAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Pcm_av_avPackage.eINSTANCE;
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
   protected Pcm_av_avSwitch<Adapter> modelSwitch =
      new Pcm_av_avSwitch<Adapter>() {
         @Override
         public Adapter caseDummyClass(DummyClass object) {
            return createDummyClassAdapter();
         }
         @Override
         public Adapter caseAdviceAdvice(AdviceAdvice object) {
            return createAdviceAdviceAdapter();
         }
         @Override
         public Adapter caseGlobalScopeGlobalScope(GlobalScopeGlobalScope object) {
            return createGlobalScopeGlobalScopeAdapter();
         }
         @Override
         public Adapter casePerJoinPointScopePerJoinPointScope(PerJoinPointScopePerJoinPointScope object) {
            return createPerJoinPointScopePerJoinPointScopeAdapter();
         }
         @Override
         public Adapter caseAdvice(Advice object) {
            return createAdviceAdapter();
         }
         @Override
         public Adapter caseGlobalScope(GlobalScope object) {
            return createGlobalScopeAdapter();
         }
         @Override
         public Adapter casePerJoinPointScope(PerJoinPointScope object) {
            return createPerJoinPointScopeAdapter();
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
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.DummyClass <em>Dummy Class</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.DummyClass
    * @generated
    */
   public Adapter createDummyClassAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.AdviceAdvice <em>Advice Advice</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.AdviceAdvice
    * @generated
    */
   public Adapter createAdviceAdviceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.GlobalScopeGlobalScope <em>Global Scope Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.GlobalScopeGlobalScope
    * @generated
    */
   public Adapter createGlobalScopeGlobalScopeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.PerJoinPointScopePerJoinPointScope <em>Per Join Point Scope Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.PerJoinPointScopePerJoinPointScope
    * @generated
    */
   public Adapter createPerJoinPointScopePerJoinPointScopeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.Advice <em>Advice</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.Advice
    * @generated
    */
   public Adapter createAdviceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.GlobalScope <em>Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.GlobalScope
    * @generated
    */
   public Adapter createGlobalScopeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.PerJoinPointScope <em>Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.PerJoinPointScope
    * @generated
    */
   public Adapter createPerJoinPointScopeAdapter() {
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

} //Pcm_av_avAdapterFactory
