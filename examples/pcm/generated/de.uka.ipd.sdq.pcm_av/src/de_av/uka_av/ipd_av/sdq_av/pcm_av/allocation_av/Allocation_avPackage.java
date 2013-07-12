/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity_avPackage;

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
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation_avFactory
 * @model kind="package"
 * @generated
 */
public interface Allocation_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "allocation_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/Allocation/5.0_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "allocation_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Allocation_avPackage eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.Allocation_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationContextImpl
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.Allocation_avPackageImpl#getAllocationContext()
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
   int ALLOCATION_CONTEXT__ID = Entity_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__ENTITY_NAME = Entity_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Resource Container Allocation Context</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT = Entity_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Assembly Context Allocation Context</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT = Entity_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Allocation Allocation Context</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT = Entity_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Event Channel Allocation Context</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT__EVENT_CHANNEL_ALLOCATION_CONTEXT = Entity_avPackage.ENTITY_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Allocation Context</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_CONTEXT_FEATURE_COUNT = Entity_avPackage.ENTITY_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationImpl <em>Allocation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationImpl
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.Allocation_avPackageImpl#getAllocation()
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
   int ALLOCATION__ID = Entity_avPackage.ENTITY__ID;

   /**
    * The feature id for the '<em><b>Entity Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION__ENTITY_NAME = Entity_avPackage.ENTITY__ENTITY_NAME;

   /**
    * The feature id for the '<em><b>Target Resource Environment Allocation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION = Entity_avPackage.ENTITY_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>System Allocation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION__SYSTEM_ALLOCATION = Entity_avPackage.ENTITY_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Allocation Contexts Allocation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION = Entity_avPackage.ENTITY_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Allocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ALLOCATION_FEATURE_COUNT = Entity_avPackage.ENTITY_FEATURE_COUNT + 3;


   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext <em>Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Allocation Context</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext
    * @generated
    */
   EClass getAllocationContext();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext#getResourceContainer_AllocationContext <em>Resource Container Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Resource Container Allocation Context</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext#getResourceContainer_AllocationContext()
    * @see #getAllocationContext()
    * @generated
    */
   EReference getAllocationContext_ResourceContainer_AllocationContext();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext#getAssemblyContext_AllocationContext <em>Assembly Context Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Assembly Context Allocation Context</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext#getAssemblyContext_AllocationContext()
    * @see #getAllocationContext()
    * @generated
    */
   EReference getAllocationContext_AssemblyContext_AllocationContext();

   /**
    * Returns the meta object for the container reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Allocation Allocation Context</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext#getAllocation_AllocationContext()
    * @see #getAllocationContext()
    * @generated
    */
   EReference getAllocationContext_Allocation_AllocationContext();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext#getEventChannel__AllocationContext <em>Event Channel Allocation Context</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Event Channel Allocation Context</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.AllocationContext#getEventChannel__AllocationContext()
    * @see #getAllocationContext()
    * @generated
    */
   EReference getAllocationContext_EventChannel__AllocationContext();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation <em>Allocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Allocation</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation
    * @generated
    */
   EClass getAllocation();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation#getTargetResourceEnvironment_Allocation <em>Target Resource Environment Allocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Target Resource Environment Allocation</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation#getTargetResourceEnvironment_Allocation()
    * @see #getAllocation()
    * @generated
    */
   EReference getAllocation_TargetResourceEnvironment_Allocation();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation#getSystem_Allocation <em>System Allocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>System Allocation</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation#getSystem_Allocation()
    * @see #getAllocation()
    * @generated
    */
   EReference getAllocation_System_Allocation();

   /**
    * Returns the meta object for the containment reference list '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation#getAllocationContexts_Allocation <em>Allocation Contexts Allocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Allocation Contexts Allocation</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.Allocation#getAllocationContexts_Allocation()
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
   Allocation_avFactory getAllocation_avFactory();

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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationContextImpl
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.Allocation_avPackageImpl#getAllocationContext()
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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationImpl <em>Allocation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.AllocationImpl
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.allocation_av.impl.Allocation_avPackageImpl#getAllocation()
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

} //Allocation_avPackage
