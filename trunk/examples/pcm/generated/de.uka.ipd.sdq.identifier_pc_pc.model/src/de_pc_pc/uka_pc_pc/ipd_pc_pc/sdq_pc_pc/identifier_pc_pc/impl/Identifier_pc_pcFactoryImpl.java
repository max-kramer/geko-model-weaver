/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.impl;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.*;

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
public class Identifier_pc_pcFactoryImpl extends EFactoryImpl implements Identifier_pc_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Identifier_pc_pcFactory init() {
      try {
         Identifier_pc_pcFactory theIdentifier_pc_pcFactory = (Identifier_pc_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Identifier_pc_pcPackage.eNS_URI);
         if (theIdentifier_pc_pcFactory != null) {
            return theIdentifier_pc_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Identifier_pc_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Identifier_pc_pcFactoryImpl() {
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
         case Identifier_pc_pcPackage.IDENTIFIER: return createIdentifier();
         case Identifier_pc_pcPackage.POINTCUT_POINTCUT: return createPointcutPointcut();
         case Identifier_pc_pcPackage.POINTCUT: return createPointcut();
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
   public Identifier_pc_pcPackage getIdentifier_pc_pcPackage() {
      return (Identifier_pc_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Identifier_pc_pcPackage getPackage() {
      return Identifier_pc_pcPackage.eINSTANCE;
   }

} //Identifier_pc_pcFactoryImpl
