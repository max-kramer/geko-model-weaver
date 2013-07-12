/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.SpecifiedQoSAnnotation;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.ExternalFailureOccurrenceDescription;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specified Reliability Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SpecifiedFailureProbability of a service resembles its "Probability of Failure on Demand" (POFOD). Whenever the service is called, this values states the probability that it returns successfully. For reliability prediction, the PCMRandomVariable specified in its superclass SpecifiedQoSAnnotation must evaluate to a real number between 0 and 1.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.SpecifiedReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.Qos_reliability_av_pcPackage#getSpecifiedReliabilityAnnotation()
 * @model
 * @generated
 */
public interface SpecifiedReliabilityAnnotation extends SpecifiedQoSAnnotation {
   /**
    * Returns the value of the '<em><b>External Failure Occurrence Descriptions Specified Reliability Annotation</b></em>' containment reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.ExternalFailureOccurrenceDescription}.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>' containment reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_reliability_av_pc.Qos_reliability_av_pcPackage#getSpecifiedReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription
    * @model opposite="specifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription" containment="true" ordered="false"
    * @generated
    */
   EList<ExternalFailureOccurrenceDescription> getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(pcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(pcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(pcm::system::System))\r\n\r\n\r\n'"
    * @generated
    */
   boolean SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation.failureProbability.oclAsType(Real)->sum()<=1.0'"
    * @generated
    */
   boolean SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(DiagnosticChain diagnostics, Map<Object, Object> context);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation->forAll(x:pcm::reliability::ExternalFailureOccurrenceDescription,y:pcm::reliability::ExternalFailureOccurrenceDescription  | x<>y implies x.failureType__ExternalFailureOccurrenceDescription <> y.failureType__ExternalFailureOccurrenceDescription )'"
    * @generated
    */
   boolean MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SpecifiedReliabilityAnnotation
