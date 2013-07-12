/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.*;

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
public class Pcm_pcFactoryImpl extends EFactoryImpl implements Pcm_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Pcm_pcFactory init() {
      try {
         Pcm_pcFactory thePcm_pcFactory = (Pcm_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Pcm_pcPackage.eNS_URI);
         if (thePcm_pcFactory != null) {
            return thePcm_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Pcm_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pcm_pcFactoryImpl() {
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
         case Pcm_pcPackage.DUMMY_CLASS: return createDummyClass();
         case Pcm_pcPackage.POINTCUT: return createPointcut();
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
   public Pointcut createPointcut() {
      PointcutImpl pointcut = new PointcutImpl();
      return pointcut;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pcm_pcPackage getPcm_pcPackage() {
      return (Pcm_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Pcm_pcPackage getPackage() {
      return Pcm_pcPackage.eINSTANCE;
   }

} //Pcm_pcFactoryImpl
