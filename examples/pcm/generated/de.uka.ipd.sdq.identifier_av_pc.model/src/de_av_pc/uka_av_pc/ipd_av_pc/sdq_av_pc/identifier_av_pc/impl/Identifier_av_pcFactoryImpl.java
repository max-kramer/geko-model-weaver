/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.identifier_av_pc.*;

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
public class Identifier_av_pcFactoryImpl extends EFactoryImpl implements Identifier_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Identifier_av_pcFactory init() {
      try {
         Identifier_av_pcFactory theIdentifier_av_pcFactory = (Identifier_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Identifier_av_pcPackage.eNS_URI);
         if (theIdentifier_av_pcFactory != null) {
            return theIdentifier_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Identifier_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Identifier_av_pcFactoryImpl() {
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
         case Identifier_av_pcPackage.IDENTIFIER: return createIdentifier();
         case Identifier_av_pcPackage.ADVICE: return createAdvice();
         case Identifier_av_pcPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Identifier_av_pcPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
         case Identifier_av_pcPackage.POINTCUT: return createPointcut();
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
   public Pointcut createPointcut() {
      PointcutImpl pointcut = new PointcutImpl();
      return pointcut;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Identifier_av_pcPackage getIdentifier_av_pcPackage() {
      return (Identifier_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Identifier_av_pcPackage getPackage() {
      return Identifier_av_pcPackage.eINSTANCE;
   }

} //Identifier_av_pcFactoryImpl
