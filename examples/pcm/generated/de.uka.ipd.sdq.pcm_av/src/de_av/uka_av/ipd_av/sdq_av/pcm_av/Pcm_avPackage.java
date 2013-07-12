/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av;

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
 * This package is the root package of all packages of the Palladio Component Model (PCM).
 * <!-- end-model-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.Pcm_avFactory
 * @model kind="package"
 * @generated
 */
public interface Pcm_avPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "pcm_av";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/5.0_advice";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "de.uka.ipd.sdq.pcm_av";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Pcm_avPackage eINSTANCE = de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl.init();

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.DummyClassImpl <em>Dummy Class</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.DummyClassImpl
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl#getDummyClass()
    * @generated
    */
   int DUMMY_CLASS = 0;

   /**
    * The number of structural features of the '<em>Dummy Class</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DUMMY_CLASS_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.AdviceImpl <em>Advice</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.AdviceImpl
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl#getAdvice()
    * @generated
    */
   int ADVICE = 1;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ADVICE__CHILDREN = 0;

   /**
    * The number of structural features of the '<em>Advice</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ADVICE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.GlobalScopeImpl
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl#getGlobalScope()
    * @generated
    */
   int GLOBAL_SCOPE = 2;

   /**
    * The feature id for the '<em><b>Scoped Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GLOBAL_SCOPE__SCOPED_OBJECT = 0;

   /**
    * The number of structural features of the '<em>Global Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GLOBAL_SCOPE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.PerJoinPointScopeImpl
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl#getPerJoinPointScope()
    * @generated
    */
   int PER_JOIN_POINT_SCOPE = 3;

   /**
    * The feature id for the '<em><b>Scoped Object</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = 0;

   /**
    * The number of structural features of the '<em>Per Join Point Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PER_JOIN_POINT_SCOPE_FEATURE_COUNT = 1;


   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.DummyClass <em>Dummy Class</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Dummy Class</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.DummyClass
    * @generated
    */
   EClass getDummyClass();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.Advice <em>Advice</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Advice</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.Advice
    * @generated
    */
   EClass getAdvice();

   /**
    * Returns the meta object for the containment reference list '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.Advice#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.Advice#getChildren()
    * @see #getAdvice()
    * @generated
    */
   EReference getAdvice_Children();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.GlobalScope <em>Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Global Scope</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.GlobalScope
    * @generated
    */
   EClass getGlobalScope();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.GlobalScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.GlobalScope#getScopedObject()
    * @see #getGlobalScope()
    * @generated
    */
   EReference getGlobalScope_ScopedObject();

   /**
    * Returns the meta object for class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.PerJoinPointScope <em>Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Per Join Point Scope</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.PerJoinPointScope
    * @generated
    */
   EClass getPerJoinPointScope();

   /**
    * Returns the meta object for the reference '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.PerJoinPointScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.PerJoinPointScope#getScopedObject()
    * @see #getPerJoinPointScope()
    * @generated
    */
   EReference getPerJoinPointScope_ScopedObject();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Pcm_avFactory getPcm_avFactory();

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
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.DummyClassImpl <em>Dummy Class</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.DummyClassImpl
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl#getDummyClass()
       * @generated
       */
      EClass DUMMY_CLASS = eINSTANCE.getDummyClass();

      /**
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.AdviceImpl <em>Advice</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.AdviceImpl
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl#getAdvice()
       * @generated
       */
      EClass ADVICE = eINSTANCE.getAdvice();

      /**
       * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ADVICE__CHILDREN = eINSTANCE.getAdvice_Children();

      /**
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.GlobalScopeImpl
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl#getGlobalScope()
       * @generated
       */
      EClass GLOBAL_SCOPE = eINSTANCE.getGlobalScope();

      /**
       * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference GLOBAL_SCOPE__SCOPED_OBJECT = eINSTANCE.getGlobalScope_ScopedObject();

      /**
       * The meta object literal for the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.PerJoinPointScopeImpl
       * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.impl.Pcm_avPackageImpl#getPerJoinPointScope()
       * @generated
       */
      EClass PER_JOIN_POINT_SCOPE = eINSTANCE.getPerJoinPointScope();

      /**
       * The meta object literal for the '<em><b>Scoped Object</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PER_JOIN_POINT_SCOPE__SCOPED_OBJECT = eINSTANCE.getPerJoinPointScope_ScopedObject();

   }

} //Pcm_avPackage
