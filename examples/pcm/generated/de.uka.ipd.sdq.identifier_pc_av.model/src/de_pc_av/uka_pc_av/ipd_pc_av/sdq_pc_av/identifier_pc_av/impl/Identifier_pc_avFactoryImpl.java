/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.impl;

import de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.identifier_pc_av.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Identifier_pc_avFactoryImpl extends EFactoryImpl implements Identifier_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Identifier_pc_avFactory init() {
      try {
         Identifier_pc_avFactory theIdentifier_pc_avFactory = (Identifier_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Identifier_pc_avPackage.eNS_URI);
         if (theIdentifier_pc_avFactory != null) {
            return theIdentifier_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Identifier_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Identifier_pc_avFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case Identifier_pc_avPackage.IDENTIFIER: return createIdentifier();
         case Identifier_pc_avPackage.POINTCUT: return createPointcut();
         case Identifier_pc_avPackage.ADVICE: return createAdvice();
         case Identifier_pc_avPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Identifier_pc_avPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Identifier createIdentifier() {
      IdentifierImpl identifier = new IdentifierImpl();
      return identifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pointcut createPointcut() {
      PointcutImpl pointcut = new PointcutImpl();
      return pointcut;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Advice createAdvice() {
      AdviceImpl advice = new AdviceImpl();
      return advice;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GlobalScope createGlobalScope() {
      GlobalScopeImpl globalScope = new GlobalScopeImpl();
      return globalScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PerJoinPointScope createPerJoinPointScope() {
      PerJoinPointScopeImpl perJoinPointScope = new PerJoinPointScopeImpl();
      return perJoinPointScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Identifier_pc_avPackage getIdentifier_pc_avPackage() {
      return (Identifier_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Identifier_pc_avPackage getPackage() {
      return Identifier_pc_avPackage.eINSTANCE;
   }

} //Identifier_pc_avFactoryImpl
