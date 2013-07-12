/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.Allocation_pcPackage
 * @generated
 */
public interface Allocation_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Allocation_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.allocation_pc.impl.Allocation_pcFactoryImpl.init();

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
   Allocation_pcPackage getAllocation_pcPackage();

} //Allocation_pcFactory
