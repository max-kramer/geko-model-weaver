/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.protocol_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.protocol_av.*;

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
public class Protocol_avFactoryImpl extends EFactoryImpl implements Protocol_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Protocol_avFactory init() {
      try {
         Protocol_avFactory theProtocol_avFactory = (Protocol_avFactory)EPackage.Registry.INSTANCE.getEFactory(Protocol_avPackage.eNS_URI);
         if (theProtocol_avFactory != null) {
            return theProtocol_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Protocol_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Protocol_avFactoryImpl() {
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
         case Protocol_avPackage.PROTOCOL: return createProtocol();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Protocol createProtocol() {
      ProtocolImpl protocol = new ProtocolImpl();
      return protocol;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Protocol_avPackage getProtocol_avPackage() {
      return (Protocol_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Protocol_avPackage getPackage() {
      return Protocol_avPackage.eINSTANCE;
   }

} //Protocol_avFactoryImpl
