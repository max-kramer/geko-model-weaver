/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.*;

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
public class Core_pcFactoryImpl extends EFactoryImpl implements Core_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Core_pcFactory init() {
      try {
         Core_pcFactory theCore_pcFactory = (Core_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Core_pcPackage.eNS_URI);
         if (theCore_pcFactory != null) {
            return theCore_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Core_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Core_pcFactoryImpl() {
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
         case Core_pcPackage.PCM_RANDOM_VARIABLE: return createPCMRandomVariable();
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
   public Core_pcPackage getCore_pcPackage() {
      return (Core_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Core_pcPackage getPackage() {
      return Core_pcPackage.eINSTANCE;
   }

} //Core_pcFactoryImpl
