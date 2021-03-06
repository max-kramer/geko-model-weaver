/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc;

import org.eclipse.emf.ecore.EAttribute;
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
 * <p>
 *     Provides a package for uniquely identifiable elements
 * </p>
 * <!-- end-model-doc -->
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier_pcFactory
 * @model kind="package"
 * @generated
 */
public interface Identifier_pcPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "identifier_pc";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/Identifier/1.0_pointcut";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "identifier_pc";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Identifier_pcPackage eINSTANCE = de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.Identifier_pcPackageImpl.init();

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.IdentifierImpl <em>Identifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.IdentifierImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.Identifier_pcPackageImpl#getIdentifier()
    * @generated
    */
   int IDENTIFIER = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER__ID = 0;

   /**
    * The number of structural features of the '<em>Identifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.PointcutImpl
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.Identifier_pcPackageImpl#getPointcut()
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
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier <em>Identifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Identifier</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier
    * @generated
    */
   EClass getIdentifier();

   /**
    * Returns the meta object for the attribute '{@link de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Identifier#getId()
    * @see #getIdentifier()
    * @generated
    */
   EAttribute getIdentifier_Id();

   /**
    * Returns the meta object for class '{@link de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Pointcut <em>Pointcut</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pointcut</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Pointcut
    * @generated
    */
   EClass getPointcut();

   /**
    * Returns the meta object for the containment reference list '{@link de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Pointcut#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.Pointcut#getChildren()
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
   Identifier_pcFactory getIdentifier_pcFactory();

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
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.IdentifierImpl <em>Identifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.IdentifierImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.Identifier_pcPackageImpl#getIdentifier()
       * @generated
       */
      EClass IDENTIFIER = eINSTANCE.getIdentifier();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

      /**
       * The meta object literal for the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.PointcutImpl
       * @see de_pc.uka_pc.ipd_pc.sdq_pc.identifier_pc.impl.Identifier_pcPackageImpl#getPointcut()
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

} //Identifier_pcPackage
