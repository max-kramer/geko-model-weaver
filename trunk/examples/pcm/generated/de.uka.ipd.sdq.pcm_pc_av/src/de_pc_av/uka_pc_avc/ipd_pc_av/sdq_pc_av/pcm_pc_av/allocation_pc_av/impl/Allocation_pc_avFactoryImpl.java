/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av.*;

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
public class Allocation_pc_avFactoryImpl extends EFactoryImpl implements Allocation_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Allocation_pc_avFactory init() {
      try {
         Allocation_pc_avFactory theAllocation_pc_avFactory = (Allocation_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Allocation_pc_avPackage.eNS_URI);
         if (theAllocation_pc_avFactory != null) {
            return theAllocation_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Allocation_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Allocation_pc_avFactoryImpl() {
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
         case Allocation_pc_avPackage.ALLOCATION_CONTEXT: return createAllocationContext();
         case Allocation_pc_avPackage.ALLOCATION: return createAllocation();
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
   public Allocation_pc_avPackage getAllocation_pc_avPackage() {
      return (Allocation_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Allocation_pc_avPackage getPackage() {
      return Allocation_pc_avPackage.eINSTANCE;
   }

} //Allocation_pc_avFactoryImpl
