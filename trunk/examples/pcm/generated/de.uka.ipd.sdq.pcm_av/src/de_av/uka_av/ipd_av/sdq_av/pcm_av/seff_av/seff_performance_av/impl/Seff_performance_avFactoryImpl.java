/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.*;

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
public class Seff_performance_avFactoryImpl extends EFactoryImpl implements Seff_performance_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Seff_performance_avFactory init() {
      try {
         Seff_performance_avFactory theSeff_performance_avFactory = (Seff_performance_avFactory)EPackage.Registry.INSTANCE.getEFactory(Seff_performance_avPackage.eNS_URI);
         if (theSeff_performance_avFactory != null) {
            return theSeff_performance_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Seff_performance_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_performance_avFactoryImpl() {
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
         case Seff_performance_avPackage.INFRASTRUCTURE_CALL: return createInfrastructureCall();
         case Seff_performance_avPackage.RESOURCE_CALL: return createResourceCall();
         case Seff_performance_avPackage.PARAMETRIC_RESOURCE_DEMAND: return createParametricResourceDemand();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InfrastructureCall createInfrastructureCall() {
      InfrastructureCallImpl infrastructureCall = new InfrastructureCallImpl();
      return infrastructureCall;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceCall createResourceCall() {
      ResourceCallImpl resourceCall = new ResourceCallImpl();
      return resourceCall;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ParametricResourceDemand createParametricResourceDemand() {
      ParametricResourceDemandImpl parametricResourceDemand = new ParametricResourceDemandImpl();
      return parametricResourceDemand;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_performance_avPackage getSeff_performance_avPackage() {
      return (Seff_performance_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Seff_performance_avPackage getPackage() {
      return Seff_performance_avPackage.eINSTANCE;
   }

} //Seff_performance_avFactoryImpl
