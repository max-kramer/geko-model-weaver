/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_reliability_av.util;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.qos_reliability_av.Qos_reliability_avPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Qos_reliability_avXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_reliability_avXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      Qos_reliability_avPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the Qos_reliability_avResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new Qos_reliability_avResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new Qos_reliability_avResourceFactoryImpl());
      }
      return registrations;
   }

} //Qos_reliability_avXMLProcessor
