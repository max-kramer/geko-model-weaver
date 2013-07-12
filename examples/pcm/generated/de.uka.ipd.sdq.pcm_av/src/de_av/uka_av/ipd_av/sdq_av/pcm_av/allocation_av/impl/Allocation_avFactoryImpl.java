/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.*;

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
public class Allocation_avFactoryImpl extends EFactoryImpl implements Allocation_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Allocation_avFactory init() {
      try {
         Allocation_avFactory theAllocation_avFactory = (Allocation_avFactory)EPackage.Registry.INSTANCE.getEFactory(Allocation_avPackage.eNS_URI);
         if (theAllocation_avFactory != null) {
            return theAllocation_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Allocation_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Allocation_avFactoryImpl() {
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
         case Allocation_avPackage.ALLOCATION_CONTEXT: return createAllocationContext();
         case Allocation_avPackage.ALLOCATION: return createAllocation();
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
   public Allocation_avPackage getAllocation_avPackage() {
      return (Allocation_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Allocation_avPackage getPackage() {
      return Allocation_avPackage.eINSTANCE;
   }

} //Allocation_avFactoryImpl
