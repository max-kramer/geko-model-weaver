/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.completions_pc_av.*;

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
public class Completions_pc_avFactoryImpl extends EFactoryImpl implements Completions_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Completions_pc_avFactory init() {
      try {
         Completions_pc_avFactory theCompletions_pc_avFactory = (Completions_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Completions_pc_avPackage.eNS_URI);
         if (theCompletions_pc_avFactory != null) {
            return theCompletions_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Completions_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Completions_pc_avFactoryImpl() {
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
         case Completions_pc_avPackage.COMPLETION: return createCompletion();
         case Completions_pc_avPackage.COMPLETION_REPOSITORY: return createCompletionRepository();
         case Completions_pc_avPackage.DELEGATING_EXTERNAL_CALL_ACTION: return createDelegatingExternalCallAction();
         case Completions_pc_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND: return createNetworkDemandParametricResourceDemand();
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
   public Completions_pc_avPackage getCompletions_pc_avPackage() {
      return (Completions_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Completions_pc_avPackage getPackage() {
      return Completions_pc_avPackage.eINSTANCE;
   }

} //Completions_pc_avFactoryImpl
