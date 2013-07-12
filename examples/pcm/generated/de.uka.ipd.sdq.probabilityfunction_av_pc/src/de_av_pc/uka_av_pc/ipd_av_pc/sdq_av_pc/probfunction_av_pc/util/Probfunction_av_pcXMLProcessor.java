/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.util;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.probfunction_av_pc.Probfunction_av_pcPackage;

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
public class Probfunction_av_pcXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Probfunction_av_pcXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      Probfunction_av_pcPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the Probfunction_av_pcResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new Probfunction_av_pcResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new Probfunction_av_pcResourceFactoryImpl());
      }
      return registrations;
   }

} //Probfunction_av_pcXMLProcessor
