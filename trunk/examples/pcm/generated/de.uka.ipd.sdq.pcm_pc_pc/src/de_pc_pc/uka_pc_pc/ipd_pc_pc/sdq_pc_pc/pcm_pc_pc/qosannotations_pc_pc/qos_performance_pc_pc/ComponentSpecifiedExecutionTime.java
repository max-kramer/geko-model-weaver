/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Specified Execution Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ComponentSpecifiedExecutionTime allows software architects (and performance analysts) to specify the response time of a service (signature + role) of a component. However, the response time is not given for the considered component in general, but the component in a specific context (i.e., in a specific hardware environment with specific external components connected) determined by the AssemblyContext. This allows software architects to include Provided- and CompleteComponentTypes into their software architecuture that still miss a description of their internals. Even though the internals are missing, performance predictions are still possible.
 * 
 * 
 * Note:
 * - Is it actually the response time or total service demand specified here? -> I guess it should be response time. Otherwise, we would require also an assignment to resources.
 * - I guess it's necessary to replace the association  to the AssemblyContext by an association to an AllocationContext, since the Response time is heavily determined by the underlying hardware...
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.ComponentSpecifiedExecutionTime#getAssemblyContext_ComponentSpecifiedExecutionTime <em>Assembly Context Component Specified Execution Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.Qos_performance_pc_pcPackage#getComponentSpecifiedExecutionTime()
 * @model
 * @generated
 */
public interface ComponentSpecifiedExecutionTime extends SpecifiedExecutionTime {
   /**
    * Returns the value of the '<em><b>Assembly Context Component Specified Execution Time</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Assembly Context Component Specified Execution Time</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Assembly Context Component Specified Execution Time</em>' reference.
    * @see #setAssemblyContext_ComponentSpecifiedExecutionTime(AssemblyContext)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.Qos_performance_pc_pcPackage#getComponentSpecifiedExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getAssemblyContext_ComponentSpecifiedExecutionTime();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.ComponentSpecifiedExecutionTime#getAssemblyContext_ComponentSpecifiedExecutionTime <em>Assembly Context Component Specified Execution Time</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Assembly Context Component Specified Execution Time</em>' reference.
    * @see #getAssemblyContext_ComponentSpecifiedExecutionTime()
    * @generated
    */
   void setAssemblyContext_ComponentSpecifiedExecutionTime(AssemblyContext value);

} // ComponentSpecifiedExecutionTime
