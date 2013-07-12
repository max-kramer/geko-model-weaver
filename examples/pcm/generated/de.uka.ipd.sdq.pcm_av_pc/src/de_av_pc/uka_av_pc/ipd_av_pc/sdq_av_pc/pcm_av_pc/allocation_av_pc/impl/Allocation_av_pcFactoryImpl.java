/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.allocation_av_pc.*;

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
public class Allocation_av_pcFactoryImpl extends EFactoryImpl implements Allocation_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Allocation_av_pcFactory init() {
      try {
         Allocation_av_pcFactory theAllocation_av_pcFactory = (Allocation_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Allocation_av_pcPackage.eNS_URI);
         if (theAllocation_av_pcFactory != null) {
            return theAllocation_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Allocation_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Allocation_av_pcFactoryImpl() {
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
         case Allocation_av_pcPackage.ALLOCATION_CONTEXT: return createAllocationContext();
         case Allocation_av_pcPackage.ALLOCATION: return createAllocation();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AllocationContext createAllocationContext() {
      AllocationContextImpl allocationContext = new AllocationContextImpl();
      return allocationContext;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Allocation createAllocation() {
      AllocationImpl allocation = new AllocationImpl();
      return allocation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Allocation_av_pcPackage getAllocation_av_pcPackage() {
      return (Allocation_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Allocation_av_pcPackage getPackage() {
      return Allocation_av_pcPackage.eINSTANCE;
   }

} //Allocation_av_pcFactoryImpl
