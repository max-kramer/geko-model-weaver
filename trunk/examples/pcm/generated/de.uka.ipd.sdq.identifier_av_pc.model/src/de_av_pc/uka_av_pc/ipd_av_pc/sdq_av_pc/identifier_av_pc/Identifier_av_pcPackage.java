/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc;

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
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier_av_pcFactory
 * @model kind="package"
 * @generated
 */
public interface Identifier_av_pcPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "identifier_av_pc";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://sdq.ipd.uka.de/Identifier/1.0_advice_pointcut";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "identifier_av_pc";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Identifier_av_pcPackage eINSTANCE = de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl.init();

   /**
    * The meta object id for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.IdentifierImpl <em>Identifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.IdentifierImpl
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getIdentifier()
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
    * The meta object id for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.AdviceImpl <em>Advice</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.AdviceImpl
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getAdvice()
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
    * The meta object id for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.GlobalScopeImpl
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getGlobalScope()
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
    * The meta object id for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.PerJoinPointScopeImpl
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getPerJoinPointScope()
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
    * The meta object id for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.PointcutImpl
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getPointcut()
    * @generated
    */
   int POINTCUT = 4;

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
    * Returns the meta object for class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier <em>Identifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Identifier</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier
    * @generated
    */
   EClass getIdentifier();

   /**
    * Returns the meta object for the attribute '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Identifier#getId()
    * @see #getIdentifier()
    * @generated
    */
   EAttribute getIdentifier_Id();

   /**
    * Returns the meta object for class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Advice <em>Advice</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Advice</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Advice
    * @generated
    */
   EClass getAdvice();

   /**
    * Returns the meta object for the containment reference list '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Advice#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Advice#getChildren()
    * @see #getAdvice()
    * @generated
    */
   EReference getAdvice_Children();

   /**
    * Returns the meta object for class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.GlobalScope <em>Global Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Global Scope</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.GlobalScope
    * @generated
    */
   EClass getGlobalScope();

   /**
    * Returns the meta object for the reference '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.GlobalScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.GlobalScope#getScopedObject()
    * @see #getGlobalScope()
    * @generated
    */
   EReference getGlobalScope_ScopedObject();

   /**
    * Returns the meta object for class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.PerJoinPointScope <em>Per Join Point Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Per Join Point Scope</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.PerJoinPointScope
    * @generated
    */
   EClass getPerJoinPointScope();

   /**
    * Returns the meta object for the reference '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.PerJoinPointScope#getScopedObject <em>Scoped Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Scoped Object</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.PerJoinPointScope#getScopedObject()
    * @see #getPerJoinPointScope()
    * @generated
    */
   EReference getPerJoinPointScope_ScopedObject();

   /**
    * Returns the meta object for class '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Pointcut <em>Pointcut</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pointcut</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Pointcut
    * @generated
    */
   EClass getPointcut();

   /**
    * Returns the meta object for the containment reference list '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Pointcut#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Children</em>'.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.Pointcut#getChildren()
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
   Identifier_av_pcFactory getIdentifier_av_pcFactory();

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
       * The meta object literal for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.IdentifierImpl <em>Identifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.IdentifierImpl
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getIdentifier()
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
       * The meta object literal for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.AdviceImpl <em>Advice</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.AdviceImpl
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getAdvice()
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
       * The meta object literal for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.GlobalScopeImpl <em>Global Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.GlobalScopeImpl
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getGlobalScope()
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
       * The meta object literal for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.PerJoinPointScopeImpl <em>Per Join Point Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.PerJoinPointScopeImpl
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getPerJoinPointScope()
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

      /**
       * The meta object literal for the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.PointcutImpl <em>Pointcut</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.PointcutImpl
       * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl.Identifier_av_pcPackageImpl#getPointcut()
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

} //Identifier_av_pcPackage
