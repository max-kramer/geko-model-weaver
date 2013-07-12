/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_reliability_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_reliability_av.*;

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
public class Qos_reliability_avFactoryImpl extends EFactoryImpl implements Qos_reliability_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Qos_reliability_avFactory init() {
      try {
         Qos_reliability_avFactory theQos_reliability_avFactory = (Qos_reliability_avFactory)EPackage.Registry.INSTANCE.getEFactory(Qos_reliability_avPackage.eNS_URI);
         if (theQos_reliability_avFactory != null) {
            return theQos_reliability_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Qos_reliability_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_reliability_avFactoryImpl() {
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
         case Qos_reliability_avPackage.SPECIFIED_RELIABILITY_ANNOTATION: return createSpecifiedReliabilityAnnotation();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SpecifiedReliabilityAnnotation createSpecifiedReliabilityAnnotation() {
      SpecifiedReliabilityAnnotationImpl specifiedReliabilityAnnotation = new SpecifiedReliabilityAnnotationImpl();
      return specifiedReliabilityAnnotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_reliability_avPackage getQos_reliability_avPackage() {
      return (Qos_reliability_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Qos_reliability_avPackage getPackage() {
      return Qos_reliability_avPackage.eINSTANCE;
   }

} //Qos_reliability_avFactoryImpl
