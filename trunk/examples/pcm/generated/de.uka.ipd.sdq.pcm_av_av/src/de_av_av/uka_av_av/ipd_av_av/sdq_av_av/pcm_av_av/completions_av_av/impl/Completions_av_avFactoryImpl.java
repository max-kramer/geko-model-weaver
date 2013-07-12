/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.completions_av_av.*;

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
public class Completions_av_avFactoryImpl extends EFactoryImpl implements Completions_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Completions_av_avFactory init() {
      try {
         Completions_av_avFactory theCompletions_av_avFactory = (Completions_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Completions_av_avPackage.eNS_URI);
         if (theCompletions_av_avFactory != null) {
            return theCompletions_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Completions_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Completions_av_avFactoryImpl() {
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
         case Completions_av_avPackage.COMPLETION: return createCompletion();
         case Completions_av_avPackage.COMPLETION_REPOSITORY: return createCompletionRepository();
         case Completions_av_avPackage.DELEGATING_EXTERNAL_CALL_ACTION: return createDelegatingExternalCallAction();
         case Completions_av_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND: return createNetworkDemandParametricResourceDemand();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Completion createCompletion() {
      CompletionImpl completion = new CompletionImpl();
      return completion;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompletionRepository createCompletionRepository() {
      CompletionRepositoryImpl completionRepository = new CompletionRepositoryImpl();
      return completionRepository;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DelegatingExternalCallAction createDelegatingExternalCallAction() {
      DelegatingExternalCallActionImpl delegatingExternalCallAction = new DelegatingExternalCallActionImpl();
      return delegatingExternalCallAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NetworkDemandParametricResourceDemand createNetworkDemandParametricResourceDemand() {
      NetworkDemandParametricResourceDemandImpl networkDemandParametricResourceDemand = new NetworkDemandParametricResourceDemandImpl();
      return networkDemandParametricResourceDemand;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Completions_av_avPackage getCompletions_av_avPackage() {
      return (Completions_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Completions_av_avPackage getPackage() {
      return Completions_av_avPackage.eINSTANCE;
   }

} //Completions_av_avFactoryImpl
