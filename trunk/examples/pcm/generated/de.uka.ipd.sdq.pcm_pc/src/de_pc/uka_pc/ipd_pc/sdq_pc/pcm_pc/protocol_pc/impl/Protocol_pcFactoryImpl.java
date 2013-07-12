/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.protocol_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.protocol_pc.*;

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
public class Protocol_pcFactoryImpl extends EFactoryImpl implements Protocol_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Protocol_pcFactory init() {
      try {
         Protocol_pcFactory theProtocol_pcFactory = (Protocol_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Protocol_pcPackage.eNS_URI);
         if (theProtocol_pcFactory != null) {
            return theProtocol_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Protocol_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Protocol_pcFactoryImpl() {
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
         case Protocol_pcPackage.PROTOCOL: return createProtocol();
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
   public Protocol_pcPackage getProtocol_pcPackage() {
      return (Protocol_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Protocol_pcPackage getPackage() {
      return Protocol_pcPackage.eINSTANCE;
   }

} //Protocol_pcFactoryImpl
