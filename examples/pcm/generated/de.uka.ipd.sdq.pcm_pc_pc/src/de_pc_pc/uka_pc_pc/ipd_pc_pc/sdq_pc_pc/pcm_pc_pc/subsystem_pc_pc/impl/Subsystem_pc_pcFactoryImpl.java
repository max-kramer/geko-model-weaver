/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.subsystem_pc_pc.*;

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
public class Subsystem_pc_pcFactoryImpl extends EFactoryImpl implements Subsystem_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Subsystem_pc_pcFactory init() {
      try {
         Subsystem_pc_pcFactory theSubsystem_pc_pcFactory = (Subsystem_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Subsystem_pc_pcPackage.eNS_URI);
         if (theSubsystem_pc_pcFactory != null) {
            return theSubsystem_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Subsystem_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Subsystem_pc_pcFactoryImpl() {
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
         case Subsystem_pc_pcPackage.SUB_SYSTEM: return createSubSystem();
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
   public Subsystem_pc_pcPackage getSubsystem_pc_pcPackage() {
      return (Subsystem_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Subsystem_pc_pcPackage getPackage() {
      return Subsystem_pc_pcPackage.eINSTANCE;
   }

} //Subsystem_pc_pcFactoryImpl
