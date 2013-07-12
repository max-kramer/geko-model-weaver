/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.*;

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
public class Pcm_pc_pcFactoryImpl extends EFactoryImpl implements Pcm_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Pcm_pc_pcFactory init() {
      try {
         Pcm_pc_pcFactory thePcm_pc_pcFactory = (Pcm_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Pcm_pc_pcPackage.eNS_URI);
         if (thePcm_pc_pcFactory != null) {
            return thePcm_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Pcm_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pcm_pc_pcFactoryImpl() {
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
         case Pcm_pc_pcPackage.DUMMY_CLASS: return createDummyClass();
         case Pcm_pc_pcPackage.POINTCUT_POINTCUT: return createPointcutPointcut();
         case Pcm_pc_pcPackage.POINTCUT: return createPointcut();
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
   public PointcutPointcut createPointcutPointcut() {
      PointcutPointcutImpl pointcutPointcut = new PointcutPointcutImpl();
      return pointcutPointcut;
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
   public Pcm_pc_pcPackage getPcm_pc_pcPackage() {
      return (Pcm_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Pcm_pc_pcPackage getPackage() {
      return Pcm_pc_pcPackage.eINSTANCE;
   }

} //Pcm_pc_pcFactoryImpl
