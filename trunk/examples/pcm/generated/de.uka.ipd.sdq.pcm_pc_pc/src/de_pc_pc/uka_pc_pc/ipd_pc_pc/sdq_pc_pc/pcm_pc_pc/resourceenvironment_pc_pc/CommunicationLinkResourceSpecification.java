/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.Identifier;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.PCMRandomVariable;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourcetype_pc_pc.CommunicationLinkResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Throughput and performance specification of linking resources
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getFailureProbability <em>Failure Probability</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage#getCommunicationLinkResourceSpecification()
 * @model
 * @generated
 */
public interface CommunicationLinkResourceSpecification extends Identifier {
   /**
    * Returns the value of the '<em><b>Linking Resource Communication Link Resource Specification</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Linking Resource Communication Link Resource Specification</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Linking Resource Communication Link Resource Specification</em>' container reference.
    * @see #setLinkingResource_CommunicationLinkResourceSpecification(LinkingResource)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage#getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource
    * @model opposite="communicationLinkResourceSpecifications_LinkingResource" transient="false" ordered="false"
    * @generated
    */
   LinkingResource getLinkingResource_CommunicationLinkResourceSpecification();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Linking Resource Communication Link Resource Specification</em>' container reference.
    * @see #getLinkingResource_CommunicationLinkResourceSpecification()
    * @generated
    */
   void setLinkingResource_CommunicationLinkResourceSpecification(LinkingResource value);

   /**
    * Returns the value of the '<em><b>Failure Probability</b></em>' attribute.
    * The default value is <code>"0.0"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Specifies the probability that a service call over this communication link fails. The failure could be due to message loss or overload, for example.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Failure Probability</em>' attribute.
    * @see #setFailureProbability(double)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage#getCommunicationLinkResourceSpecification_FailureProbability()
    * @model default="0.0" required="true" ordered="false"
    * @generated
    */
   double getFailureProbability();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getFailureProbability <em>Failure Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Failure Probability</em>' attribute.
    * @see #getFailureProbability()
    * @generated
    */
   void setFailureProbability(double value);

   /**
    * Returns the value of the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Communication Link Resource Type Communication Link Resource Specification</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Communication Link Resource Type Communication Link Resource Specification</em>' reference.
    * @see #setCommunicationLinkResourceType_CommunicationLinkResourceSpecification(CommunicationLinkResourceType)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage#getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification()
    * @model ordered="false"
    * @generated
    */
   CommunicationLinkResourceType getCommunicationLinkResourceType_CommunicationLinkResourceSpecification();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Communication Link Resource Type Communication Link Resource Specification</em>' reference.
    * @see #getCommunicationLinkResourceType_CommunicationLinkResourceSpecification()
    * @generated
    */
   void setCommunicationLinkResourceType_CommunicationLinkResourceSpecification(CommunicationLinkResourceType value);

   /**
    * Returns the value of the '<em><b>Latency Communication Link Resource Specification</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.PCMRandomVariable#getCommunicationLinkResourceSpecification_latency_PCMRandomVariable <em>Communication Link Resource Specification latency PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Specifies the latency of this linking resource in the simulated time unit. The latency is the time that a message on this linking resource takes to receive the receiver. In synchronous communication (call and return), the latency is added twice to the duration, once for the call and once for the response. 
    * <!-- end-model-doc -->
    * @return the value of the '<em>Latency Communication Link Resource Specification</em>' containment reference.
    * @see #setLatency_CommunicationLinkResourceSpecification(PCMRandomVariable)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage#getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.PCMRandomVariable#getCommunicationLinkResourceSpecification_latency_PCMRandomVariable
    * @model opposite="communicationLinkResourceSpecification_latency_PCMRandomVariable" containment="true" ordered="false"
    * @generated
    */
   PCMRandomVariable getLatency_CommunicationLinkResourceSpecification();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Latency Communication Link Resource Specification</em>' containment reference.
    * @see #getLatency_CommunicationLinkResourceSpecification()
    * @generated
    */
   void setLatency_CommunicationLinkResourceSpecification(PCMRandomVariable value);

   /**
    * Returns the value of the '<em><b>Throughput Communication Link Resource Specification</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.PCMRandomVariable#getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable <em>Communication Link Resource Specifcation throughput PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Specifies the maximum throughput of this linking resource in byte per simulated time unit. 
    * <!-- end-model-doc -->
    * @return the value of the '<em>Throughput Communication Link Resource Specification</em>' containment reference.
    * @see #setThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.Resourceenvironment_pc_pcPackage#getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification()
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.PCMRandomVariable#getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable
    * @model opposite="communicationLinkResourceSpecifcation_throughput_PCMRandomVariable" containment="true" ordered="false"
    * @generated
    */
   PCMRandomVariable getThroughput_CommunicationLinkResourceSpecification();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.resourceenvironment_pc_pc.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Throughput Communication Link Resource Specification</em>' containment reference.
    * @see #getThroughput_CommunicationLinkResourceSpecification()
    * @generated
    */
   void setThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable value);

} // CommunicationLinkResourceSpecification
