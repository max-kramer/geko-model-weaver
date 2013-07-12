/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av.Allocation_pc_avPackage
 * @generated
 */
public interface Allocation_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Allocation_pc_avFactory eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.allocation_pc_av.impl.Allocation_pc_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Allocation Context</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Allocation Context</em>'.
    * @generated
    */
   AllocationContext createAllocationContext();

   /**
    * Returns a new object of class '<em>Allocation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Allocation</em>'.
    * @generated
    */
   Allocation createAllocation();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Allocation_pc_avPackage getAllocation_pc_avPackage();

} //Allocation_pc_avFactory
