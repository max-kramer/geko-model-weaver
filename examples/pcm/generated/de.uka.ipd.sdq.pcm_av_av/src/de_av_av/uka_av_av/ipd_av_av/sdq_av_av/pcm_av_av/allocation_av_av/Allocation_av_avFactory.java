/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.Allocation_av_avPackage
 * @generated
 */
public interface Allocation_av_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Allocation_av_avFactory eINSTANCE = de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.allocation_av_av.impl.Allocation_av_avFactoryImpl.init();

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
   Allocation_av_avPackage getAllocation_av_avPackage();

} //Allocation_av_avFactory
