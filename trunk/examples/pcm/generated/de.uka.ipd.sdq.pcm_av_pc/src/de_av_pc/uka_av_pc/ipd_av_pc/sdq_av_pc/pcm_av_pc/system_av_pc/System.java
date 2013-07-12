/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.ComposedProvidingRequiringEntity;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.QoSAnnotations;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A System is the out-most entity of a PCM's assembly of components. It captures the modeling decision to which extend a system under investigation is modelled within the PCM.
 * A System is not composable (part of another composition) because it has QoS annotations which are only allowed in the "outer" composition thing. And a UsageModel must only access ProvidedRoles of a System and not of inner components.
 * The System is inheriting from ComposedProvidingRequiringEntity to have a unique means for expressing the inner composition of an entity (here: System). Also it allows using the same editor etc. being applied to ComposedProvidingRequiringEntity and thus also being useful for System.
 * 
 * A system consists of an assembly and is itself referenced by an allocation (only a System can be allocated). The first specifies how the components are connected with other components, the latter specifies how the components and connectors are mapped to the resource environment (hardware and middleware). From a structural point of view, Systems can be seen as special kind of CompositeComponents. Systems are not supposed to be reused as components are. The are assumed to be coupled by using special techniques for system integration.
 * 
 * A System has provided and required roles like a composite component. Only a system's provided role can be accessed from the usage profile. Only a system's required roles can have QOS annotations.
 * 
 * Like SubSystems, Systems are white-box entities for the Software Architect and also for the System Deployer. Thus, a System Deployer can and must allocate inner components of a System individually.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System#getQosAnnotations_System <em>Qos Annotations System</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System_av_pcPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Entity, ComposedProvidingRequiringEntity {
   /**
    * Returns the value of the '<em><b>Qos Annotations System</b></em>' containment reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.QoSAnnotations}.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.QoSAnnotations#getSystem_QoSAnnotations <em>System Qo SAnnotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * QoS Annotations allow for specifing fixed (non-parameterised) QoS properties at the system boundary level for required services. For example, for a required service it can be specified that its response time is fixed "3 ms". See the QoS Annotations package for more details.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Qos Annotations System</em>' containment reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System_av_pcPackage#getSystem_QosAnnotations_System()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.QoSAnnotations#getSystem_QoSAnnotations
    * @model opposite="system_QoSAnnotations" containment="true" ordered="false"
    * @generated
    */
   EList<QoSAnnotations> getQosAnnotations_System();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.providedRoles_InterfaceProvidingEntity->isEmpty()'"
    * @generated
    */
   boolean SystemMustHaveAtLeastOneProvidedRole(DiagnosticChain diagnostics, Map<Object, Object> context);

} // System
