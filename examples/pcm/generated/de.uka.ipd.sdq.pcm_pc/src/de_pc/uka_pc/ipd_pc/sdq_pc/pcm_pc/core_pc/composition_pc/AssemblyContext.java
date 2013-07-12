/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.repository_pc.RepositoryComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AssemblyContext uniquely identifies an assembly instance of an AssemblyContext.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.AssemblyContext#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.AssemblyContext#getEncapsulatedComponent__AssemblyContext <em>Encapsulated Component Assembly Context</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.AssemblyContext#getConfigParameterUsages__AssemblyContext <em>Config Parameter Usages Assembly Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.Composition_pcPackage#getAssemblyContext()
 * @model
 * @generated
 */
public interface AssemblyContext extends Entity {
   /**
    * Returns the value of the '<em><b>Parent Structure Assembly Context</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.ComposedStructure#getAssemblyContexts__ComposedStructure <em>Assembly Contexts Composed Structure</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Structure Assembly Context</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Structure Assembly Context</em>' container reference.
    * @see #setParentStructure__AssemblyContext(ComposedStructure)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.Composition_pcPackage#getAssemblyContext_ParentStructure__AssemblyContext()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.ComposedStructure#getAssemblyContexts__ComposedStructure
    * @model opposite="assemblyContexts__ComposedStructure" transient="false" ordered="false"
    * @generated
    */
   ComposedStructure getParentStructure__AssemblyContext();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.AssemblyContext#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent Structure Assembly Context</em>' container reference.
    * @see #getParentStructure__AssemblyContext()
    * @generated
    */
   void setParentStructure__AssemblyContext(ComposedStructure value);

   /**
    * Returns the value of the '<em><b>Encapsulated Component Assembly Context</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Encapsulated Component Assembly Context</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Encapsulated Component Assembly Context</em>' reference.
    * @see #setEncapsulatedComponent__AssemblyContext(RepositoryComponent)
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.Composition_pcPackage#getAssemblyContext_EncapsulatedComponent__AssemblyContext()
    * @model ordered="false"
    * @generated
    */
   RepositoryComponent getEncapsulatedComponent__AssemblyContext();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.AssemblyContext#getEncapsulatedComponent__AssemblyContext <em>Encapsulated Component Assembly Context</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Encapsulated Component Assembly Context</em>' reference.
    * @see #getEncapsulatedComponent__AssemblyContext()
    * @generated
    */
   void setEncapsulatedComponent__AssemblyContext(RepositoryComponent value);

   /**
    * Returns the value of the '<em><b>Config Parameter Usages Assembly Context</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage}.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage#getAssemblyContext__VariableUsage <em>Assembly Context Variable Usage</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Config Parameter Usages Assembly Context</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Config Parameter Usages Assembly Context</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.composition_pc.Composition_pcPackage#getAssemblyContext_ConfigParameterUsages__AssemblyContext()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage#getAssemblyContext__VariableUsage
    * @model opposite="assemblyContext__VariableUsage" containment="true" ordered="false"
    * @generated
    */
   EList<VariableUsage> getConfigParameterUsages__AssemblyContext();

} // AssemblyContext
