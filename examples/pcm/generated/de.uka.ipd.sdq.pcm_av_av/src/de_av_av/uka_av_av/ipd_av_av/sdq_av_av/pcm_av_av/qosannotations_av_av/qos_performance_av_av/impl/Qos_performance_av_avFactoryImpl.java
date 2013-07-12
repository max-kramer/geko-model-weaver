/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.qos_performance_av_av.*;

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
public class Qos_performance_av_avFactoryImpl extends EFactoryImpl implements Qos_performance_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Qos_performance_av_avFactory init() {
      try {
         Qos_performance_av_avFactory theQos_performance_av_avFactory = (Qos_performance_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Qos_performance_av_avPackage.eNS_URI);
         if (theQos_performance_av_avFactory != null) {
            return theQos_performance_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Qos_performance_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_performance_av_avFactoryImpl() {
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
         case Qos_performance_av_avPackage.SYSTEM_SPECIFIED_EXECUTION_TIME: return createSystemSpecifiedExecutionTime();
         case Qos_performance_av_avPackage.SPECIFIED_EXECUTION_TIME: return createSpecifiedExecutionTime();
         case Qos_performance_av_avPackage.COMPONENT_SPECIFIED_EXECUTION_TIME: return createComponentSpecifiedExecutionTime();
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
   public Qos_performance_av_avPackage getQos_performance_av_avPackage() {
      return (Qos_performance_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Qos_performance_av_avPackage getPackage() {
      return Qos_performance_av_avPackage.eINSTANCE;
   }

} //Qos_performance_av_avFactoryImpl
