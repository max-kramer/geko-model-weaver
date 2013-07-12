/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.Entity;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.VariableUsage;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.RepositoryComponent;

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
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext#getEncapsulatedComponent__AssemblyContext <em>Encapsulated Component Assembly Context</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext#getConfigParameterUsages__AssemblyContext <em>Config Parameter Usages Assembly Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyContext()
 * @model
 * @generated
 */
public interface AssemblyContext extends Entity {
   /**
    * Returns the value of the '<em><b>Parent Structure Assembly Context</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ComposedStructure#getAssemblyContexts__ComposedStructure <em>Assembly Contexts Composed Structure</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Structure Assembly Context</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Structure Assembly Context</em>' container reference.
    * @see #setParentStructure__AssemblyContext(ComposedStructure)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyContext_ParentStructure__AssemblyContext()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.ComposedStructure#getAssemblyContexts__ComposedStructure
    * @model opposite="assemblyContexts__ComposedStructure" transient="false" ordered="false"
    * @generated
    */
   ComposedStructure getParentStructure__AssemblyContext();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}' container reference.
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
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyContext_EncapsulatedComponent__AssemblyContext()
    * @model ordered="false"
    * @generated
    */
   RepositoryComponent getEncapsulatedComponent__AssemblyContext();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyContext#getEncapsulatedComponent__AssemblyContext <em>Encapsulated Component Assembly Context</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Encapsulated Component Assembly Context</em>' reference.
    * @see #getEncapsulatedComponent__AssemblyContext()
    * @generated
    */
   void setEncapsulatedComponent__AssemblyContext(RepositoryComponent value);

   /**
    * Returns the value of the '<em><b>Config Parameter Usages Assembly Context</b></em>' containment reference list.
    * The list contents are of type {@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.VariableUsage}.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.VariableUsage#getAssemblyContext__VariableUsage <em>Assembly Context Variable Usage</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Config Parameter Usages Assembly Context</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Config Parameter Usages Assembly Context</em>' containment reference list.
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyContext_ConfigParameterUsages__AssemblyContext()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.parameter_av_av.VariableUsage#getAssemblyContext__VariableUsage
    * @model opposite="assemblyContext__VariableUsage" containment="true" ordered="false"
    * @generated
    */
   EList<VariableUsage> getConfigParameterUsages__AssemblyContext();

} // AssemblyContext
