/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.*;

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
public class Qos_reliability_av_pcFactoryImpl extends EFactoryImpl implements Qos_reliability_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Qos_reliability_av_pcFactory init() {
      try {
         Qos_reliability_av_pcFactory theQos_reliability_av_pcFactory = (Qos_reliability_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Qos_reliability_av_pcPackage.eNS_URI);
         if (theQos_reliability_av_pcFactory != null) {
            return theQos_reliability_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Qos_reliability_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_reliability_av_pcFactoryImpl() {
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
         case Qos_reliability_av_pcPackage.SPECIFIED_RELIABILITY_ANNOTATION: return createSpecifiedReliabilityAnnotation();
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
   public Qos_reliability_av_pcPackage getQos_reliability_av_pcPackage() {
      return (Qos_reliability_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Qos_reliability_av_pcPackage getPackage() {
      return Qos_reliability_av_pcPackage.eINSTANCE;
   }

} //Qos_reliability_av_pcFactoryImpl
