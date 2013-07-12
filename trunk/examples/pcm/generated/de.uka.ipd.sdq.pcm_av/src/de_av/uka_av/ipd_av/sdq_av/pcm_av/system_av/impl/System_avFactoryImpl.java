/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System_avFactory;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System_avPackage;

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
public class System_avFactoryImpl extends EFactoryImpl implements System_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static System_avFactory init() {
      try {
         System_avFactory theSystem_avFactory = (System_avFactory)EPackage.Registry.INSTANCE.getEFactory(System_avPackage.eNS_URI);
         if (theSystem_avFactory != null) {
            return theSystem_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new System_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public System_avFactoryImpl() {
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
         case System_avPackage.SYSTEM: return createSystem();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System createSystem() {
      SystemImpl system = new SystemImpl();
      return system;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public System_avPackage getSystem_avPackage() {
      return (System_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static System_avPackage getPackage() {
      return System_avPackage.eINSTANCE;
   }

} //System_avFactoryImpl
