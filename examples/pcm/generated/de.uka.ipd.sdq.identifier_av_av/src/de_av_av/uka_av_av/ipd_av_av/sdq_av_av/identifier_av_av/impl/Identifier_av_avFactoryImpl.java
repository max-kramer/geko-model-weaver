/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.identifier_av_av.*;

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
public class Identifier_av_avFactoryImpl extends EFactoryImpl implements Identifier_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Identifier_av_avFactory init() {
      try {
         Identifier_av_avFactory theIdentifier_av_avFactory = (Identifier_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Identifier_av_avPackage.eNS_URI);
         if (theIdentifier_av_avFactory != null) {
            return theIdentifier_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Identifier_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Identifier_av_avFactoryImpl() {
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
         case Identifier_av_avPackage.IDENTIFIER: return createIdentifier();
         case Identifier_av_avPackage.ADVICE_ADVICE: return createAdviceAdvice();
         case Identifier_av_avPackage.GLOBAL_SCOPE_GLOBAL_SCOPE: return createGlobalScopeGlobalScope();
         case Identifier_av_avPackage.PER_JOIN_POINT_SCOPE_PER_JOIN_POINT_SCOPE: return createPerJoinPointScopePerJoinPointScope();
         case Identifier_av_avPackage.ADVICE: return createAdvice();
         case Identifier_av_avPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Identifier_av_avPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
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
   public AdviceAdvice createAdviceAdvice() {
      AdviceAdviceImpl adviceAdvice = new AdviceAdviceImpl();
      return adviceAdvice;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GlobalScopeGlobalScope createGlobalScopeGlobalScope() {
      GlobalScopeGlobalScopeImpl globalScopeGlobalScope = new GlobalScopeGlobalScopeImpl();
      return globalScopeGlobalScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PerJoinPointScopePerJoinPointScope createPerJoinPointScopePerJoinPointScope() {
      PerJoinPointScopePerJoinPointScopeImpl perJoinPointScopePerJoinPointScope = new PerJoinPointScopePerJoinPointScopeImpl();
      return perJoinPointScopePerJoinPointScope;
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
   public Identifier_av_avPackage getIdentifier_av_avPackage() {
      return (Identifier_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Identifier_av_avPackage getPackage() {
      return Identifier_av_avPackage.eINSTANCE;
   }

} //Identifier_av_avFactoryImpl
