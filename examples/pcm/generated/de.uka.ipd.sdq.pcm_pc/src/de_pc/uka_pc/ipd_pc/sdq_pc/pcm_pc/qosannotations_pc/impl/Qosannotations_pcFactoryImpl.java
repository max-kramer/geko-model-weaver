/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.*;

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
public class Qosannotations_pcFactoryImpl extends EFactoryImpl implements Qosannotations_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Qosannotations_pcFactory init() {
      try {
         Qosannotations_pcFactory theQosannotations_pcFactory = (Qosannotations_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Qosannotations_pcPackage.eNS_URI);
         if (theQosannotations_pcFactory != null) {
            return theQosannotations_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Qosannotations_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_pcFactoryImpl() {
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
         case Qosannotations_pcPackage.SPECIFIED_QO_SANNOTATION: return createSpecifiedQoSAnnotation();
         case Qosannotations_pcPackage.QO_SANNOTATIONS: return createQoSAnnotations();
         case Qosannotations_pcPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION: return createSpecifiedOutputParameterAbstraction();
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
   public Qosannotations_pcPackage getQosannotations_pcPackage() {
      return (Qosannotations_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Qosannotations_pcPackage getPackage() {
      return Qosannotations_pcPackage.eINSTANCE;
   }

} //Qosannotations_pcFactoryImpl
