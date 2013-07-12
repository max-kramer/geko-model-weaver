/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.*;

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
public class Qos_performance_pc_pcFactoryImpl extends EFactoryImpl implements Qos_performance_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Qos_performance_pc_pcFactory init() {
      try {
         Qos_performance_pc_pcFactory theQos_performance_pc_pcFactory = (Qos_performance_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Qos_performance_pc_pcPackage.eNS_URI);
         if (theQos_performance_pc_pcFactory != null) {
            return theQos_performance_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Qos_performance_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_performance_pc_pcFactoryImpl() {
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
         case Qos_performance_pc_pcPackage.SYSTEM_SPECIFIED_EXECUTION_TIME: return createSystemSpecifiedExecutionTime();
         case Qos_performance_pc_pcPackage.SPECIFIED_EXECUTION_TIME: return createSpecifiedExecutionTime();
         case Qos_performance_pc_pcPackage.COMPONENT_SPECIFIED_EXECUTION_TIME: return createComponentSpecifiedExecutionTime();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SystemSpecifiedExecutionTime createSystemSpecifiedExecutionTime() {
      SystemSpecifiedExecutionTimeImpl systemSpecifiedExecutionTime = new SystemSpecifiedExecutionTimeImpl();
      return systemSpecifiedExecutionTime;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SpecifiedExecutionTime createSpecifiedExecutionTime() {
      SpecifiedExecutionTimeImpl specifiedExecutionTime = new SpecifiedExecutionTimeImpl();
      return specifiedExecutionTime;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComponentSpecifiedExecutionTime createComponentSpecifiedExecutionTime() {
      ComponentSpecifiedExecutionTimeImpl componentSpecifiedExecutionTime = new ComponentSpecifiedExecutionTimeImpl();
      return componentSpecifiedExecutionTime;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_performance_pc_pcPackage getQos_performance_pc_pcPackage() {
      return (Qos_performance_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Qos_performance_pc_pcPackage getPackage() {
      return Qos_performance_pc_pcPackage.eINSTANCE;
   }

} //Qos_performance_pc_pcFactoryImpl
