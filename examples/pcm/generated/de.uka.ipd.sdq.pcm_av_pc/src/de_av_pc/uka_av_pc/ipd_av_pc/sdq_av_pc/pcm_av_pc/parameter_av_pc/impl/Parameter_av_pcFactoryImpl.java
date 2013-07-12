/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.parameter_av_pc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Parameter_av_pcFactoryImpl extends EFactoryImpl implements Parameter_av_pcFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Parameter_av_pcFactory init() {
      try {
         Parameter_av_pcFactory theParameter_av_pcFactory = (Parameter_av_pcFactory)EPackage.Registry.INSTANCE.getEFactory(Parameter_av_pcPackage.eNS_URI);
         if (theParameter_av_pcFactory != null) {
            return theParameter_av_pcFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Parameter_av_pcFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter_av_pcFactoryImpl() {
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
         case Parameter_av_pcPackage.VARIABLE_USAGE: return createVariableUsage();
         case Parameter_av_pcPackage.VARIABLE_CHARACTERISATION: return createVariableCharacterisation();
         case Parameter_av_pcPackage.CHARACTERISED_VARIABLE: return createCharacterisedVariable();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue) {
      switch (eDataType.getClassifierID()) {
         case Parameter_av_pcPackage.VARIABLE_CHARACTERISATION_TYPE:
            return createVariableCharacterisationTypeFromString(eDataType, initialValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue) {
      switch (eDataType.getClassifierID()) {
         case Parameter_av_pcPackage.VARIABLE_CHARACTERISATION_TYPE:
            return convertVariableCharacterisationTypeToString(eDataType, instanceValue);
         default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableUsage createVariableUsage() {
      VariableUsageImpl variableUsage = new VariableUsageImpl();
      return variableUsage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableCharacterisation createVariableCharacterisation() {
      VariableCharacterisationImpl variableCharacterisation = new VariableCharacterisationImpl();
      return variableCharacterisation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CharacterisedVariable createCharacterisedVariable() {
      CharacterisedVariableImpl characterisedVariable = new CharacterisedVariableImpl();
      return characterisedVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableCharacterisationType createVariableCharacterisationTypeFromString(EDataType eDataType, String initialValue) {
      VariableCharacterisationType result = VariableCharacterisationType.get(initialValue);
      if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertVariableCharacterisationTypeToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter_av_pcPackage getParameter_av_pcPackage() {
      return (Parameter_av_pcPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Parameter_av_pcPackage getPackage() {
      return Parameter_av_pcPackage.eINSTANCE;
   }

} //Parameter_av_pcFactoryImpl
