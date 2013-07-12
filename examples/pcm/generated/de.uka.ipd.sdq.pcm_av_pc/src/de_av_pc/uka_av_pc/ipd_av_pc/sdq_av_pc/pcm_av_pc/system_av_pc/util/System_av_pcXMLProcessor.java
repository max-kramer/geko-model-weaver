/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.util;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.system_av_pc.System_av_pcPackage;

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
public class System_av_pcXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public System_av_pcXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      System_av_pcPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the System_av_pcResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new System_av_pcResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new System_av_pcResourceFactoryImpl());
      }
      return registrations;
   }

} //System_av_pcXMLProcessor
