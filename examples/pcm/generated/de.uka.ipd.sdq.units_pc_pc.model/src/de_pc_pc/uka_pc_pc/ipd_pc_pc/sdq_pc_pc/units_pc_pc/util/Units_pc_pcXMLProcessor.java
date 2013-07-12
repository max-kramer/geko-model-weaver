/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.util;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.units_pc_pc.Units_pc_pcPackage;

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
public class Units_pc_pcXMLProcessor extends XMLProcessor {

   /**
    * Public constructor to instantiate the helper.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Units_pc_pcXMLProcessor() {
      super((EPackage.Registry.INSTANCE));
      Units_pc_pcPackage.eINSTANCE.eClass();
   }
   
   /**
    * Register for "*" and "xml" file extensions the Units_pc_pcResourceFactoryImpl factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected Map<String, Resource.Factory> getRegistrations() {
      if (registrations == null) {
         super.getRegistrations();
         registrations.put(XML_EXTENSION, new Units_pc_pcResourceFactoryImpl());
         registrations.put(STAR_EXTENSION, new Units_pc_pcResourceFactoryImpl());
      }
      return registrations;
   }

} //Units_pc_pcXMLProcessor
