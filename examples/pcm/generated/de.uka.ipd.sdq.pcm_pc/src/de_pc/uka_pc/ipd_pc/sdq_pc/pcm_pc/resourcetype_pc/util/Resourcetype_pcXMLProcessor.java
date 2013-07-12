/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.util;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.resourcetype_pc.Resourcetype_pcPackage;

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
public class Resourcetype_pcXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourcetype_pcXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      Resourcetype_pcPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the Resourcetype_pcResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new Resourcetype_pcResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new Resourcetype_pcResourceFactoryImpl());
      }
      return registrations;
   }

} //Resourcetype_pcXMLProcessor
