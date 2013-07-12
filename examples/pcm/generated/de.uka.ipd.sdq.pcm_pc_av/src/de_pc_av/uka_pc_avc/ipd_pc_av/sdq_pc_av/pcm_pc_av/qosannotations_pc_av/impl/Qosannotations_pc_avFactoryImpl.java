/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.*;

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
public class Qosannotations_pc_avFactoryImpl extends EFactoryImpl implements Qosannotations_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Qosannotations_pc_avFactory init() {
      try {
         Qosannotations_pc_avFactory theQosannotations_pc_avFactory = (Qosannotations_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Qosannotations_pc_avPackage.eNS_URI);
         if (theQosannotations_pc_avFactory != null) {
            return theQosannotations_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Qosannotations_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_pc_avFactoryImpl() {
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
         case Qosannotations_pc_avPackage.SPECIFIED_QO_SANNOTATION: return createSpecifiedQoSAnnotation();
         case Qosannotations_pc_avPackage.QO_SANNOTATIONS: return createQoSAnnotations();
         case Qosannotations_pc_avPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION: return createSpecifiedOutputParameterAbstraction();
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
   public Qosannotations_pc_avPackage getQosannotations_pc_avPackage() {
      return (Qosannotations_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Qosannotations_pc_avPackage getPackage() {
      return Qosannotations_pc_avPackage.eINSTANCE;
   }

} //Qosannotations_pc_avFactoryImpl
