/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.seff_pc_av.seff_reliability_pc_av.*;

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
public class Seff_reliability_pc_avFactoryImpl extends EFactoryImpl implements Seff_reliability_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Seff_reliability_pc_avFactory init() {
      try {
         Seff_reliability_pc_avFactory theSeff_reliability_pc_avFactory = (Seff_reliability_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Seff_reliability_pc_avPackage.eNS_URI);
         if (theSeff_reliability_pc_avFactory != null) {
            return theSeff_reliability_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Seff_reliability_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_reliability_pc_avFactoryImpl() {
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
         case Seff_reliability_pc_avPackage.RECOVERY_ACTION_BEHAVIOUR: return createRecoveryActionBehaviour();
         case Seff_reliability_pc_avPackage.RECOVERY_ACTION: return createRecoveryAction();
         case Seff_reliability_pc_avPackage.FAILURE_HANDLING_ENTITY: return createFailureHandlingEntity();
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
   public Seff_reliability_pc_avPackage getSeff_reliability_pc_avPackage() {
      return (Seff_reliability_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Seff_reliability_pc_avPackage getPackage() {
      return Seff_reliability_pc_avPackage.eINSTANCE;
   }

} //Seff_reliability_pc_avFactoryImpl
