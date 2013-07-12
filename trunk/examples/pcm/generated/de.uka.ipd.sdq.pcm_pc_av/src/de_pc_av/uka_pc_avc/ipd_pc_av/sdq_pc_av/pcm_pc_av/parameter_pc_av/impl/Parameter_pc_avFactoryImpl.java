/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.parameter_pc_av.*;

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
public class Parameter_pc_avFactoryImpl extends EFactoryImpl implements Parameter_pc_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Parameter_pc_avFactory init() {
      try {
         Parameter_pc_avFactory theParameter_pc_avFactory = (Parameter_pc_avFactory)EPackage.Registry.INSTANCE.getEFactory(Parameter_pc_avPackage.eNS_URI);
         if (theParameter_pc_avFactory != null) {
            return theParameter_pc_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Parameter_pc_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter_pc_avFactoryImpl() {
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
         case Parameter_pc_avPackage.VARIABLE_USAGE: return createVariableUsage();
         case Parameter_pc_avPackage.VARIABLE_CHARACTERISATION: return createVariableCharacterisation();
         case Parameter_pc_avPackage.CHARACTERISED_VARIABLE: return createCharacterisedVariable();
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
         case Parameter_pc_avPackage.VARIABLE_CHARACTERISATION_TYPE:
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
         case Parameter_pc_avPackage.VARIABLE_CHARACTERISATION_TYPE:
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
   public Parameter_pc_avPackage getParameter_pc_avPackage() {
      return (Parameter_pc_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Parameter_pc_avPackage getPackage() {
      return Parameter_pc_avPackage.eINSTANCE;
   }

} //Parameter_pc_avFactoryImpl
