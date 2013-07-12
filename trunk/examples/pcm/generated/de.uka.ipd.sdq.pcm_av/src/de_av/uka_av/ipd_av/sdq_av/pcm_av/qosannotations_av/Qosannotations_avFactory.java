/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avPackage
 * @generated
 */
public interface Qosannotations_avFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Qosannotations_avFactory eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.impl.Qosannotations_avFactoryImpl.init();

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
   Qosannotations_avPackage getQosannotations_avPackage();

} //Qosannotations_avFactory
