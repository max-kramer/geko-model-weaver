/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.util;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.core_pc.entity_pc.Entity_pcPackage;

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
public class Entity_pcXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entity_pcXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      Entity_pcPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the Entity_pcResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new Entity_pcResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new Entity_pcResourceFactoryImpl());
      }
      return registrations;
   }

} //Entity_pcXMLProcessor
