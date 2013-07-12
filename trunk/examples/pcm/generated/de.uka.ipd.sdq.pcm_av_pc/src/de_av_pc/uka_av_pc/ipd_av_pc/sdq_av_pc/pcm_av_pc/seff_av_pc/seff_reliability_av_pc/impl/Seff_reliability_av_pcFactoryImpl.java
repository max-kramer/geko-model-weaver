/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.seff_av_pc.seff_reliability_av_pc.*;

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
public class Seff_reliability_av_pcFactoryImpl extends EFactoryImpl implements Seff_reliability_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Seff_reliability_av_pcFactory init() {
      try {
         Seff_reliability_av_pcFactory theSeff_reliability_av_pcFactory = (Seff_reliability_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Seff_reliability_av_pcPackage.eNS_URI);
         if (theSeff_reliability_av_pcFactory != null) {
            return theSeff_reliability_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Seff_reliability_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_reliability_av_pcFactoryImpl() {
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
         case Seff_reliability_av_pcPackage.RECOVERY_ACTION_BEHAVIOUR: return createRecoveryActionBehaviour();
         case Seff_reliability_av_pcPackage.RECOVERY_ACTION: return createRecoveryAction();
         case Seff_reliability_av_pcPackage.FAILURE_HANDLING_ENTITY: return createFailureHandlingEntity();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RecoveryActionBehaviour createRecoveryActionBehaviour() {
      RecoveryActionBehaviourImpl recoveryActionBehaviour = new RecoveryActionBehaviourImpl();
      return recoveryActionBehaviour;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RecoveryAction createRecoveryAction() {
      RecoveryActionImpl recoveryAction = new RecoveryActionImpl();
      return recoveryAction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public FailureHandlingEntity createFailureHandlingEntity() {
      FailureHandlingEntityImpl failureHandlingEntity = new FailureHandlingEntityImpl();
      return failureHandlingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_reliability_av_pcPackage getSeff_reliability_av_pcPackage() {
      return (Seff_reliability_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Seff_reliability_av_pcPackage getPackage() {
      return Seff_reliability_av_pcPackage.eINSTANCE;
   }

} //Seff_reliability_av_pcFactoryImpl
