/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.subsystem_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.subsystem_pc.*;

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
public class Subsystem_pcFactoryImpl extends EFactoryImpl implements Subsystem_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Subsystem_pcFactory init() {
      try {
         Subsystem_pcFactory theSubsystem_pcFactory = (Subsystem_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Subsystem_pcPackage.eNS_URI);
         if (theSubsystem_pcFactory != null) {
            return theSubsystem_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Subsystem_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Subsystem_pcFactoryImpl() {
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
         case Subsystem_pcPackage.SUB_SYSTEM: return createSubSystem();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SubSystem createSubSystem() {
      SubSystemImpl subSystem = new SubSystemImpl();
      return subSystem;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Subsystem_pcPackage getSubsystem_pcPackage() {
      return (Subsystem_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Subsystem_pcPackage getPackage() {
      return Subsystem_pcPackage.eINSTANCE;
   }

} //Subsystem_pcFactoryImpl
