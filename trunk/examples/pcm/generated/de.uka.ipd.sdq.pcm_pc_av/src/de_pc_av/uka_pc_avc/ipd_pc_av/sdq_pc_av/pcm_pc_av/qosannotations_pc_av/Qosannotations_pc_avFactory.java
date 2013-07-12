/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.Qosannotations_pc_avPackage
 * @generated
 */
public interface Qosannotations_pc_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Qosannotations_pc_avFactory eINSTANCE = de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.qosannotations_pc_av.impl.Qosannotations_pc_avFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Specified Qo SAnnotation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Specified Qo SAnnotation</em>'.
    * @generated
    */
   SpecifiedQoSAnnotation createSpecifiedQoSAnnotation();

   /**
    * Returns a new object of class '<em>Qo SAnnotations</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Qo SAnnotations</em>'.
    * @generated
    */
   QoSAnnotations createQoSAnnotations();

   /**
    * Returns a new object of class '<em>Specified Output Parameter Abstraction</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Specified Output Parameter Abstraction</em>'.
    * @generated
    */
   SpecifiedOutputParameterAbstraction createSpecifiedOutputParameterAbstraction();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Qosannotations_pc_avPackage getQosannotations_pc_avPackage();

} //Qosannotations_pc_avFactory
