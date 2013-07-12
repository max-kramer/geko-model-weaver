/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.completions_pc_pc.*;

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
public class Completions_pc_pcFactoryImpl extends EFactoryImpl implements Completions_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Completions_pc_pcFactory init() {
      try {
         Completions_pc_pcFactory theCompletions_pc_pcFactory = (Completions_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Completions_pc_pcPackage.eNS_URI);
         if (theCompletions_pc_pcFactory != null) {
            return theCompletions_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Completions_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Completions_pc_pcFactoryImpl() {
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
         case Completions_pc_pcPackage.COMPLETION: return createCompletion();
         case Completions_pc_pcPackage.COMPLETION_REPOSITORY: return createCompletionRepository();
         case Completions_pc_pcPackage.DELEGATING_EXTERNAL_CALL_ACTION: return createDelegatingExternalCallAction();
         case Completions_pc_pcPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND: return createNetworkDemandParametricResourceDemand();
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
   public Completions_pc_pcPackage getCompletions_pc_pcPackage() {
      return (Completions_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Completions_pc_pcPackage getPackage() {
      return Completions_pc_pcPackage.eINSTANCE;
   }

} //Completions_pc_pcFactoryImpl
