/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.util;

import de_pc.uka_pc.ipd_pc.sdq_pc.probfunction_pc.Probfunction_pcPackage;

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
public class Probfunction_pcXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Probfunction_pcXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      Probfunction_pcPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the Probfunction_pcResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new Probfunction_pcResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new Probfunction_pcResourceFactoryImpl());
      }
      return registrations;
   }

} //Probfunction_pcXMLProcessor
