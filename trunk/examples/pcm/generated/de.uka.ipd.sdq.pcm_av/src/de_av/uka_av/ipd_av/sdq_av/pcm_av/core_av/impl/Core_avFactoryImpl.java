/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.*;

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
public class Core_avFactoryImpl extends EFactoryImpl implements Core_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Core_avFactory init() {
      try {
         Core_avFactory theCore_avFactory = (Core_avFactory)EPackage.Registry.INSTANCE.getEFactory(Core_avPackage.eNS_URI);
         if (theCore_avFactory != null) {
            return theCore_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Core_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Core_avFactoryImpl() {
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
         case Core_avPackage.PCM_RANDOM_VARIABLE: return createPCMRandomVariable();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PCMRandomVariable createPCMRandomVariable() {
      PCMRandomVariableImpl pcmRandomVariable = new PCMRandomVariableImpl();
      return pcmRandomVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Core_avPackage getCore_avPackage() {
      return (Core_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Core_avPackage getPackage() {
      return Core_avPackage.eINSTANCE;
   }

} //Core_avFactoryImpl
