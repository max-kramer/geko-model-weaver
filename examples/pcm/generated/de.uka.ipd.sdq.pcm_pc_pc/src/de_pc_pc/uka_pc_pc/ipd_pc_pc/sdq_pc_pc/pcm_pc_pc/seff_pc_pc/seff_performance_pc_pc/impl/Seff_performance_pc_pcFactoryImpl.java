/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.seff_pc_pc.seff_performance_pc_pc.*;

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
public class Seff_performance_pc_pcFactoryImpl extends EFactoryImpl implements Seff_performance_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Seff_performance_pc_pcFactory init() {
      try {
         Seff_performance_pc_pcFactory theSeff_performance_pc_pcFactory = (Seff_performance_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Seff_performance_pc_pcPackage.eNS_URI);
         if (theSeff_performance_pc_pcFactory != null) {
            return theSeff_performance_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Seff_performance_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seff_performance_pc_pcFactoryImpl() {
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
         case Seff_performance_pc_pcPackage.INFRASTRUCTURE_CALL: return createInfrastructureCall();
         case Seff_performance_pc_pcPackage.RESOURCE_CALL: return createResourceCall();
         case Seff_performance_pc_pcPackage.PARAMETRIC_RESOURCE_DEMAND: return createParametricResourceDemand();
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
   public Seff_performance_pc_pcPackage getSeff_performance_pc_pcPackage() {
      return (Seff_performance_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Seff_performance_pc_pcPackage getPackage() {
      return Seff_performance_pc_pcPackage.eINSTANCE;
   }

} //Seff_performance_pc_pcFactoryImpl
