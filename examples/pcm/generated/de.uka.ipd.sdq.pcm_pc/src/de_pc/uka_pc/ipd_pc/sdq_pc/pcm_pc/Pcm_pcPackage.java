/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc;

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
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pcm_pcFactory
 * @model kind="package"
 * @generated
 */
public interface Pcm_pcPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "pcm_pc";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/5.0_pointcut";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "de.uka.ipd.sdq.pcm_pc";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Pcm_pcPackage eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.Pcm_pcPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.DummyClassImpl <em>Dummy Class</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.DummyClassImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.Pcm_pcPackageImpl#getDummyClass()
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
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.PointcutImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.Pcm_pcPackageImpl#getPointcut()
    * @generated
    */
   int POINTCUT = 1;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POINTCUT__CHILDREN = 0;

   /**
    * The number of structural features of the '<em>Pointcut</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POINTCUT_FEATURE_COUNT = 1;


   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.DummyClass <em>Dummy Class</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Dummy Class</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.DummyClass
    * @generated
    */
   EClass getDummyClass();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pointcut <em>Pointcut</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pointcut</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pointcut
    * @generated
    */
   EClass getPointcut();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pointcut#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.Pointcut#getChildren()
    * @see #getPointcut()
    * @generated
    */
   EReference getPointcut_Children();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   Pcm_pcFactory getPcm_pcFactory();

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
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.DummyClassImpl <em>Dummy Class</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.DummyClassImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.Pcm_pcPackageImpl#getDummyClass()
       * @generated
       */
      EClass DUMMY_CLASS = eINSTANCE.getDummyClass();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.PointcutImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl.Pcm_pcPackageImpl#getPointcut()
       * @generated
       */
      EClass POINTCUT = eINSTANCE.getPointcut();

      /**
       * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference POINTCUT__CHILDREN = eINSTANCE.getPointcut_Children();

   }

} //Pcm_pcPackage
