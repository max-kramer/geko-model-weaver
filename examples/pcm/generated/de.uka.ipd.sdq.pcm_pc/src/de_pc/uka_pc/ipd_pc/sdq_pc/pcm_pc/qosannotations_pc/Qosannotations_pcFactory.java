/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.Qosannotations_pcPackage
 * @generated
 */
public interface Qosannotations_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Qosannotations_pcFactory eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.impl.Qosannotations_pcFactoryImpl.init();

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
   Qosannotations_pcPackage getQosannotations_pcPackage();

} //Qosannotations_pcFactory
