/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation_pc_pcPackage
 * @generated
 */
public interface Allocation_pc_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Allocation_pc_pcFactory eINSTANCE = de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcFactoryImpl.init();

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
   Allocation_pc_pcPackage getAllocation_pc_pcPackage();

} //Allocation_pc_pcFactory
