/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.*;

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
public class Completions_av_pcFactoryImpl extends EFactoryImpl implements Completions_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Completions_av_pcFactory init() {
      try {
         Completions_av_pcFactory theCompletions_av_pcFactory = (Completions_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Completions_av_pcPackage.eNS_URI);
         if (theCompletions_av_pcFactory != null) {
            return theCompletions_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Completions_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Completions_av_pcFactoryImpl() {
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
         case Completions_av_pcPackage.COMPLETION: return createCompletion();
         case Completions_av_pcPackage.COMPLETION_REPOSITORY: return createCompletionRepository();
         case Completions_av_pcPackage.DELEGATING_EXTERNAL_CALL_ACTION: return createDelegatingExternalCallAction();
         case Completions_av_pcPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND: return createNetworkDemandParametricResourceDemand();
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
   public Completions_av_pcPackage getCompletions_av_pcPackage() {
      return (Completions_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Completions_av_pcPackage getPackage() {
      return Completions_av_pcPackage.eINSTANCE;
   }

} //Completions_av_pcFactoryImpl
