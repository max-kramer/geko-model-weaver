/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.*;

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
public class Qosannotations_pc_pcFactoryImpl extends EFactoryImpl implements Qosannotations_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Qosannotations_pc_pcFactory init() {
      try {
         Qosannotations_pc_pcFactory theQosannotations_pc_pcFactory = (Qosannotations_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Qosannotations_pc_pcPackage.eNS_URI);
         if (theQosannotations_pc_pcFactory != null) {
            return theQosannotations_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Qosannotations_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qosannotations_pc_pcFactoryImpl() {
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
         case Qosannotations_pc_pcPackage.SPECIFIED_QO_SANNOTATION: return createSpecifiedQoSAnnotation();
         case Qosannotations_pc_pcPackage.QO_SANNOTATIONS: return createQoSAnnotations();
         case Qosannotations_pc_pcPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION: return createSpecifiedOutputParameterAbstraction();
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
   public Qosannotations_pc_pcPackage getQosannotations_pc_pcPackage() {
      return (Qosannotations_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Qosannotations_pc_pcPackage getPackage() {
      return Qosannotations_pc_pcPackage.eINSTANCE;
   }

} //Qosannotations_pc_pcFactoryImpl
