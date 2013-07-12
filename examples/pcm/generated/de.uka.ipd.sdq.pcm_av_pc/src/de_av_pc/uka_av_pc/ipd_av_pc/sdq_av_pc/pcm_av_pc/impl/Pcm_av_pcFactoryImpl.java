/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.*;

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
public class Pcm_av_pcFactoryImpl extends EFactoryImpl implements Pcm_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Pcm_av_pcFactory init() {
      try {
         Pcm_av_pcFactory thePcm_av_pcFactory = (Pcm_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Pcm_av_pcPackage.eNS_URI);
         if (thePcm_av_pcFactory != null) {
            return thePcm_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Pcm_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pcm_av_pcFactoryImpl() {
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
         case Pcm_av_pcPackage.DUMMY_CLASS: return createDummyClass();
         case Pcm_av_pcPackage.ADVICE: return createAdvice();
         case Pcm_av_pcPackage.GLOBAL_SCOPE: return createGlobalScope();
         case Pcm_av_pcPackage.PER_JOIN_POINT_SCOPE: return createPerJoinPointScope();
         case Pcm_av_pcPackage.POINTCUT: return createPointcut();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DummyClass createDummyClass() {
      DummyClassImpl dummyClass = new DummyClassImpl();
      return dummyClass;
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
   public Pcm_av_pcPackage getPcm_av_pcPackage() {
      return (Pcm_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Pcm_av_pcPackage getPackage() {
      return Pcm_av_pcPackage.eINSTANCE;
   }

} //Pcm_av_pcFactoryImpl
