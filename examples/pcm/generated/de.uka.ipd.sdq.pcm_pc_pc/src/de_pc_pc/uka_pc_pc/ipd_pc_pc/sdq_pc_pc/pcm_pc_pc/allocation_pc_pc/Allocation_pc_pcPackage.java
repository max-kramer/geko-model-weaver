/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.Entity_pc_pcPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * All PCM entities related to model allocation
 * <!-- end-model-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation_pc_pcFactory
 * @model kind="package"
 * @generated
 */
public interface Allocation_pc_pcPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "allocation_pc_pc";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/Allocation/5.0_pointcut_pointcut";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "allocation_pc_pc";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Allocation_pc_pcPackage eINSTANCE = de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.AllocationContextImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcPackageImpl#getAllocationContext()
    * @generated
    */
   int ALLOCATION_CONTEXT = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__ID = Entity_pc_pcPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__ENTITY_NAME = Entity_pc_pcPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Resource Container Allocation Context</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Assembly Context Allocation Context</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Allocation Allocation Context</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Event Channel Allocation Context</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Allocation Context</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT_FEATURE_COUNT = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.AllocationImpl <em>Allocation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.AllocationImpl
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcPackageImpl#getAllocation()
    * @generated
    */
   int ALLOCATION = 1;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION__ID = Entity_pc_pcPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION__ENTITY_NAME = Entity_pc_pcPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Target Resource Environment Allocation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>System Allocation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION__SYSTEM_ALLOCATION = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Allocation Contexts Allocation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Allocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_FEATURE_COUNT = Entity_pc_pcPackage.ENTITY_FEATURE_COUNT + 3;


   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext <em>Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Allocation Context</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext
    * @generated
    */
   EClass getAllocationContext();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext#getResourceContainer_AllocationContext <em>Resource Container Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Resource Container Allocation Context</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext#getResourceContainer_AllocationContext()
    * @see #getAllocationContext()
    * @generated
    */
   EReference getAllocationContext_ResourceContainer_AllocationContext();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext#getAssemblyContext_AllocationContext <em>Assembly Context Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Assembly Context Allocation Context</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext#getAssemblyContext_AllocationContext()
    * @see #getAllocationContext()
    * @generated
    */
   EReference getAllocationContext_AssemblyContext_AllocationContext();

   /**
    * Returns the meta object for the container reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Allocation Allocation Context</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext#getAllocation_AllocationContext()
    * @see #getAllocationContext()
    * @generated
    */
   EReference getAllocationContext_Allocation_AllocationContext();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext#getEventChannel__AllocationContext <em>Event Channel Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Event Channel Allocation Context</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.AllocationContext#getEventChannel__AllocationContext()
    * @see #getAllocationContext()
    * @generated
    */
   EReference getAllocationContext_EventChannel__AllocationContext();

   /**
    * Returns the meta object for class '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation <em>Allocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Allocation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation
    * @generated
    */
   EClass getAllocation();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation#getTargetResourceEnvironment_Allocation <em>Target Resource Environment Allocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Target Resource Environment Allocation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation#getTargetResourceEnvironment_Allocation()
    * @see #getAllocation()
    * @generated
    */
   EReference getAllocation_TargetResourceEnvironment_Allocation();

   /**
    * Returns the meta object for the reference '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation#getSystem_Allocation <em>System Allocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>System Allocation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation#getSystem_Allocation()
    * @see #getAllocation()
    * @generated
    */
   EReference getAllocation_System_Allocation();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation#getAllocationContexts_Allocation <em>Allocation Contexts Allocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Allocation Contexts Allocation</em>'.
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.Allocation#getAllocationContexts_Allocation()
    * @see #getAllocation()
    * @generated
    */
   EReference getAllocation_AllocationContexts_Allocation();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Allocation_pc_pcFactory getAllocation_pc_pcFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.AllocationContextImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcPackageImpl#getAllocationContext()
       * @generated
       */
      EClass ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext();

      /**
       * The meta object literal for the '<em><b>Resource Container Allocation Context</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext_ResourceContainer_AllocationContext();

      /**
       * The meta object literal for the '<em><b>Assembly Context Allocation Context</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext_AssemblyContext_AllocationContext();

      /**
       * The meta object literal for the '<em><b>Allocation Allocation Context</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext_Allocation_AllocationContext();

      /**
       * The meta object literal for the '<em><b>Event Channel Allocation Context</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext_EventChannel__AllocationContext();

      /**
       * The meta object literal for the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.AllocationImpl <em>Allocation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.AllocationImpl
       * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.allocation_pc_pc.impl.Allocation_pc_pcPackageImpl#getAllocation()
       * @generated
       */
      EClass ALLOCATION = eINSTANCE.getAllocation();

      /**
       * The meta object literal for the '<em><b>Target Resource Environment Allocation</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION = eINSTANCE.getAllocation_TargetResourceEnvironment_Allocation();

      /**
       * The meta object literal for the '<em><b>System Allocation</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ALLOCATION__SYSTEM_ALLOCATION = eINSTANCE.getAllocation_System_Allocation();

      /**
       * The meta object literal for the '<em><b>Allocation Contexts Allocation</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION = eINSTANCE.getAllocation_AllocationContexts_Allocation();

   }

} //Allocation_pc_pcPackage
