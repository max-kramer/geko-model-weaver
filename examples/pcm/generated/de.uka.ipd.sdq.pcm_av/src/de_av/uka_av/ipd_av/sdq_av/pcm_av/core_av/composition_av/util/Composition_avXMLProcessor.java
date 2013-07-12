/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.util;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.composition_av.Composition_avPackage;

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
public class Composition_avXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Composition_avXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      Composition_avPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the Composition_avResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new Composition_avResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new Composition_avResourceFactoryImpl());
      }
      return registrations;
   }

} //Composition_avXMLProcessor
