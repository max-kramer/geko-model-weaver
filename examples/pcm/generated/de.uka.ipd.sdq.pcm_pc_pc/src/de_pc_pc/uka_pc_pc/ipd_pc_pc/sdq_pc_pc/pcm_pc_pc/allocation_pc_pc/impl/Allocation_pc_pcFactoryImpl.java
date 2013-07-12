/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.*;

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
public class Allocation_pc_pcFactoryImpl extends EFactoryImpl implements Allocation_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Allocation_pc_pcFactory init() {
      try {
         Allocation_pc_pcFactory theAllocation_pc_pcFactory = (Allocation_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Allocation_pc_pcPackage.eNS_URI);
         if (theAllocation_pc_pcFactory != null) {
            return theAllocation_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Allocation_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Allocation_pc_pcFactoryImpl() {
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
         case Allocation_pc_pcPackage.ALLOCATION_CONTEXT: return createAllocationContext();
         case Allocation_pc_pcPackage.ALLOCATION: return createAllocation();
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
   public Allocation_pc_pcPackage getAllocation_pc_pcPackage() {
      return (Allocation_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Allocation_pc_pcPackage getPackage() {
      return Allocation_pc_pcPackage.eINSTANCE;
   }

} //Allocation_pc_pcFactoryImpl
