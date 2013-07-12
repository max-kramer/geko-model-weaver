/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.qosannotations_av_av.*;

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
public class Qosannotations_av_avFactoryImpl extends EFactoryImpl implements Qosannotations_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Qosannotations_av_avFactory init() {
      try {
         Qosannotations_av_avFactory theQosannotations_av_avFactory = (Qosannotations_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Qosannotations_av_avPackage.eNS_URI);
         if (theQosannotations_av_avFactory != null) {
            return theQosannotations_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Qosannotations_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_av_avFactoryImpl() {
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
         case Qosannotations_av_avPackage.SPECIFIED_QO_SANNOTATION: return createSpecifiedQoSAnnotation();
         case Qosannotations_av_avPackage.QO_SANNOTATIONS: return createQoSAnnotations();
         case Qosannotations_av_avPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION: return createSpecifiedOutputParameterAbstraction();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SpecifiedQoSAnnotation createSpecifiedQoSAnnotation() {
      SpecifiedQoSAnnotationImpl specifiedQoSAnnotation = new SpecifiedQoSAnnotationImpl();
      return specifiedQoSAnnotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public QoSAnnotations createQoSAnnotations() {
      QoSAnnotationsImpl qoSAnnotations = new QoSAnnotationsImpl();
      return qoSAnnotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SpecifiedOutputParameterAbstraction createSpecifiedOutputParameterAbstraction() {
      SpecifiedOutputParameterAbstractionImpl specifiedOutputParameterAbstraction = new SpecifiedOutputParameterAbstractionImpl();
      return specifiedOutputParameterAbstraction;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_av_avPackage getQosannotations_av_avPackage() {
      return (Qosannotations_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Qosannotations_av_avPackage getPackage() {
      return Qosannotations_av_avPackage.eINSTANCE;
   }

} //Qosannotations_av_avFactoryImpl
