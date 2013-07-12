/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.*;

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
public class Completions_avFactoryImpl extends EFactoryImpl implements Completions_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Completions_avFactory init() {
      try {
         Completions_avFactory theCompletions_avFactory = (Completions_avFactory)EPackage.Registry.INSTANCE.getEFactory(Completions_avPackage.eNS_URI);
         if (theCompletions_avFactory != null) {
            return theCompletions_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Completions_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Completions_avFactoryImpl() {
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
         case Completions_avPackage.COMPLETION: return createCompletion();
         case Completions_avPackage.COMPLETION_REPOSITORY: return createCompletionRepository();
         case Completions_avPackage.DELEGATING_EXTERNAL_CALL_ACTION: return createDelegatingExternalCallAction();
         case Completions_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND: return createNetworkDemandParametricResourceDemand();
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
   public Completions_avPackage getCompletions_avPackage() {
      return (Completions_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Completions_avPackage getPackage() {
      return Completions_avPackage.eINSTANCE;
   }

} //Completions_avFactoryImpl
